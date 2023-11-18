package com.bariscoskun.makesmallerimage;

import android.graphics.Bitmap;

public class MakeSmallerImage {

    Bitmap selectedImage ;

public void test(){
   Bitmap smallerImage = makeSmallerImage(selectedImage,300);
}

    public Bitmap makeSmallerImage(Bitmap image, int maximumSize){

        int width = image.getWidth();
        int height = image.getHeight();

        float bitmapRatio = (float) width / (float) height;

        if (bitmapRatio > 1){
            // Landscape
            width = maximumSize;
            height = (int)(width / bitmapRatio);
        }
        else
        {
            // Portrait
            height = maximumSize;
            width = (int) (height * bitmapRatio);
        }
        return image.createScaledBitmap(image,width,height,true);
    }

}



