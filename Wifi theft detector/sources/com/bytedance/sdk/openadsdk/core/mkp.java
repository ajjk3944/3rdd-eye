package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class mkp {
    private static boolean emc(View view, int i10) {
        float fEmc = emc(view);
        return fEmc > 0.0f && fEmc >= ((float) i10) / 100.0f;
    }

    private static int xq(View view, int i10) {
        if (i10 == 3) {
            return vw.bw(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean ypw(View view) {
        return view != null && view.isShown();
    }

    public static float emc(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    if (!view.getGlobalVisibleRect(new Rect())) {
                        return -1.0f;
                    }
                    long jHeight = r1.height() * r1.width();
                    long height = view.getHeight() * view.getWidth();
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int ypw(View view, int i10) {
        if (i10 == 3) {
            return (int) (vw.xq(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static int ypw(View view, int i10, int i11, boolean z10) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!ypw(view)) {
            return 1;
        }
        if (emc(view, i11, z10)) {
            return !emc(view, i10) ? 3 : 0;
        }
        return 6;
    }

    private static boolean emc(View view, int i10, boolean z10) {
        return (i10 == 1 && z10) ? view.getWidth() > 0 && view.getHeight() > 0 : view.getWidth() >= ypw(view, i10) && view.getHeight() >= xq(view, i10);
    }

    public static boolean emc(View view, int i10, int i11, boolean z10) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.zz.ul) || (view instanceof com.bytedance.sdk.openadsdk.core.dg.dg)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z10) {
                i10 = 0;
            }
        }
        return ypw(view, i10, i11, z10) == 0;
    }
}
