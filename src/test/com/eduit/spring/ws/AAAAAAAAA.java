package com.eduit.spring.ws;

import org.junit.Assert;
import org.junit.Test;

import java.awt.geom.Path2D;

public class AAAAAAAAA {

    @Test
    public void bbbbbbb(){

        Double latitude = -34.607872;
        Double longitude = -58.472566;


        boolean retVal = ccccccc(latitude, longitude);

        Assert.assertTrue(retVal);


    }


    public static boolean  ccccccc(Double latitude , Double longitude ){

        Path2D path2D = new Path2D.Double();

        path2D.moveTo(-34.477070, -58.518912);

        path2D.lineTo(-34.652819, -58.293533);

        path2D.lineTo(-34.732618, -58.502595);

        path2D.lineTo( -34.608434, -58.546949);

        path2D.closePath();

        return path2D.contains(latitude,longitude);
    }


}
