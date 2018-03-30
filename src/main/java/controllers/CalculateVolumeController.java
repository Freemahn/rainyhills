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
@Path("calculateVolume")
public class CalculateVolumeController
{
    @Inject
    private VolumeCalculation volumeCalculationBean;


    @POST
    public int calculate(String inputArray)
    {
        Gson gson = new Gson();
        int[] array = gson.fromJson(inputArray, int[].class);
        return volumeCalculationBean.calculateVolume(array);
    }


}
