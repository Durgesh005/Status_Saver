package com.nikunj.statussaver.utils;

import android.os.Environment;

import java.io.File;

public class Common2 {


    public static final int GRID_COUNT = 2;

    public static final File STATUS_DIRECTORY = new File(Environment.getExternalStorageDirectory() +
            File.separator + "WhatsApp/Media/.Statuses");

    public static String APP_DIR="/SavedStatus";


}