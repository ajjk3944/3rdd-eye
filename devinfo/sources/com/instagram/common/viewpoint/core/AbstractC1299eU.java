package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.eU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1299eU {
    public static int A00(DisplayMetrics displayMetrics) {
        int i4 = displayMetrics.widthPixels;
        if (i4 > 1700) {
            i4 = 1700;
        }
        int width = i4 / 448;
        return width;
    }

    public static void A01(@Nullable Context context, final View view, long j, final View view2) {
        if (view2 != null) {
            view2.setVisibility(0);
        }
        view.setVisibility(8);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.eT
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1299eU.A02(view2, view);
            }
        }, j);
    }

    public static /* synthetic */ void A02(View view, View view2) {
        if (view != null) {
            view.setVisibility(8);
        }
        view2.setVisibility(0);
    }
}
