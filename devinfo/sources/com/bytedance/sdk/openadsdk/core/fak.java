package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fak {
    public static float ouw(View view) {
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

    public static boolean ouw(View view, int i4, int i10, boolean z3) {
        float fOuw;
        if (i10 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.bly.qbp) || (view instanceof com.bytedance.sdk.openadsdk.core.yu.yu)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z3) {
                i4 = 0;
            }
        }
        if (view.getWindowVisibility() == 0 && view.isShown()) {
            int iYu = i10 == 3 ? (int) (com.bytedance.sdk.openadsdk.utils.osn.yu(view.getContext().getApplicationContext()) * 0.7d) : 20;
            int iLe = i10 == 3 ? com.bytedance.sdk.openadsdk.utils.osn.le(view.getContext().getApplicationContext()) / 2 : 20;
            if (i10 == 1 && z3) {
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    fOuw = ouw(view);
                    if (fOuw <= 0.0f) {
                    }
                }
            } else if (view.getWidth() >= iYu && view.getHeight() >= iLe) {
                fOuw = ouw(view);
                if (fOuw <= 0.0f && fOuw >= i4 / 100.0f) {
                    return true;
                }
            }
        }
        return false;
    }
}
