package com.lonch.slidesideexample;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * 作者：Sword God
 * 创建日期：2018/5/16
 * 描述：
 */
class Utils {

    public static int convertDPtoPixels(Context context, int dp) {
        Resources resource = context.getResources();
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resource.getDisplayMetrics());
    }

}
