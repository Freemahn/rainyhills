package beans;

import javax.ejb.Stateless;

/**
 * @author Pavel Gordon
 */
@Stateless
public class VolumeCalculationBean implements VolumeCalculation
{
    /**
     * The idea of algorithm is this:
     * We are going through all elements to find left borders of the pit - O(n)
     * We are going through all elements to find left borders of the pit - O(n)
     * We are going through all elements to calculate volume of element depending on borders
     *
     * @param heights array of heights of each element
     * @return total volume in units
     */
    public int calculateVolume(int[] heights)
    {
        //there is no pit if we have only two elements or less
        if (heights == null || heights.length <= 2)
        {
            return 0;
        }

        int n = heights.length;
        int totalVolume = 0;
        int[] leftBorders = new int[n];
        int[] rightBorders = new int[n];

        // default borders for element is itself
        System.arraycopy(heights, 0, leftBorders, 0, n);
        System.arraycopy(heights, 0, rightBorders, 0, n);

        //  first element doesn't have left border
        for (int i = 1; i < n; i++)
        {
            if (leftBorders[i - 1] > heights[i])
            {
                leftBorders[i] = leftBorders[i - 1];
            }
        }
        // last (n-1-th) element doesn't have right border
        for (int i = n - 2; i >= 0; i--)
        {
            if (rightBorders[i + 1] > heights[i])
            {
                rightBorders[i] = rightBorders[i + 1];
            }
        }

        for (int i = 1; i < n; i++)
        {
            int volume = Math.min(rightBorders[i], leftBorders[i]) - heights[i];
            if (volume > 0)
            {
                totalVolume += volume;
            }

        }

        return totalVolume;
    }


}
