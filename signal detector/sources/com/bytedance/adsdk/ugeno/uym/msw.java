package com.bytedance.adsdk.ugeno.uym;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class msw {
    private static TypedValue xq;
    private static final Object ypw = new Object();
    public static Handler emc = new Handler(Looper.getMainLooper());

    public static float emc(Context context, String str) throws NumberFormatException {
        float f2;
        float f5 = context.getResources().getDisplayMetrics().density;
        try {
            f2 = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f2 = 0.0f;
        }
        return (f2 * f5) + 0.5f;
    }

    public static int ypw(Context context, float f2) {
        float f5 = context.getResources().getDisplayMetrics().density;
        if (f5 <= 0.0f) {
            f5 = 1.0f;
        }
        return (int) ((f2 / f5) + 0.5f);
    }

    public static float emc(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static Bitmap emc(Context context, Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                return null;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Drawable emc(Context context, int i) {
        return context.getDrawable(i);
    }

    public static boolean emc() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void emc(Runnable runnable) {
        if (emc()) {
            runnable.run();
        } else {
            emc.post(runnable);
        }
    }
}
