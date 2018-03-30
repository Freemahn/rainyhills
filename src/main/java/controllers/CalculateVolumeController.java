package controllers;

import beans.VolumeCalculation;
import com.google.gson.Gson;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author Pavel Gordon
 */
@Stateless
@Path("calculate")
public class CalculateVolumeController
{
    @Inject
    private VolumeCalculation volumeCalculationBean;


    /**
     * Calculates volume from json-array given as body of post request
     * @param inputArray array of elements' heights. [4,3,5,2]
     * @return total possible volume in units
     */
    @POST
    public int calculate(String inputArray)
    {
        Gson gson = new Gson();
        int[] array = gson.fromJson(inputArray, int[].class);
        return volumeCalculationBean.calculateVolume(array);
    }


}
