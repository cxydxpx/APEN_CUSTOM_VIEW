package com.example.apen.apencustomview;

/**
 * 作者 Y_MS
 * Created by ${APEN} on 2018-03-16.
 * GitHub：https://github.com/cxydxpx
 */

public class ToolMath {

    public static float initData(float a) {
        if (4.22f <= a && a < 4.23f) {
            a = 360f - 360f / (a / 0.01f);
        } else if (4.23f <= a && a < 4.24f) {
            a = 300f - 300f / (a / 0.01f);
        } else if (4.24f <= a && a < 4.25f) {
            a = 240f - 240f / (a / 0.01f);
        } else if (4.25f <= a && a < 4.26f) {
            a = 180f - 180f / (a / 0.01f);
        } else if (4.26f <= a && a < 4.27f) {
            a = 120f - 120f / (a / 0.01f);
        } else if (4.27 <= a && a < 4.28f) {
            a = 60f - 60f / (a / 0.01f);
        }

        return a;

    }

}
