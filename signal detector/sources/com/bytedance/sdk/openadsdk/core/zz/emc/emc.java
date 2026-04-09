package com.bytedance.sdk.openadsdk.core.zz.emc;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class emc {
    public static Pair<Float, Float> emc(Window window, int i) {
        View decorView = window.getDecorView();
        float[] fArrEmc = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrEmc[0] = vw.xq(window.getContext(), fArrEmc[0]);
        float fXq = vw.xq(window.getContext(), fArrEmc[1]);
        fArrEmc[1] = fXq;
        if (fArrEmc[0] < 10.0f || fXq < 10.0f) {
            fArrEmc = emc(window.getContext(), vw.xq(window.getContext(), vw.emc()), i);
        }
        float fMax = Math.max(fArrEmc[0], fArrEmc[1]);
        float fMin = Math.min(fArrEmc[0], fArrEmc[1]);
        if (i == 1) {
            fArrEmc[0] = fMin;
            fArrEmc[1] = fMax;
        } else {
            fArrEmc[0] = fMax;
            fArrEmc[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrEmc[0]), Float.valueOf(fArrEmc[1]));
    }

    public static float ypw(Context context) {
        return vw.xq(context, vw.sz(context));
    }

    private static float[] emc(Context context, int i, int i3) {
        float fEmc = emc(context);
        float fYpw = ypw(context);
        if ((i3 == 1) != (fEmc > fYpw)) {
            float f2 = fEmc + fYpw;
            fYpw = f2 - fYpw;
            fEmc = f2 - fYpw;
        }
        if (i3 == 1) {
            fEmc -= i;
        } else {
            fYpw -= i;
        }
        return new float[]{fYpw, fEmc};
    }

    public static float emc(Context context) {
        return vw.xq(context, vw.sup(context));
    }
}
