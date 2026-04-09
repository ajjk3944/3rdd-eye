package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1860hS implements InterfaceC1355Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C1176Re> A00;

    public C1860hS(C1176Re c1176Re) {
        this.A00 = new WeakReference<>(c1176Re);
    }

    private void A00(C1176Re c1176Re) {
        C1662eF c1662eFA07 = c1176Re.A07();
        if (c1662eFA07 != null && c1176Re.A04() != null) {
            c1176Re.A04().bringChildToFront(c1662eFA07);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1355Yh
    public void A44(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        C1176Re c1176Re = this.A00.get();
        if (c1176Re != null && c1176Re.A04() != null) {
            c1176Re.A04().addView(view, i10, layoutParams);
            A00(c1176Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1355Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C1176Re c1176Re = this.A00.get();
        if (c1176Re != null && c1176Re.A04() != null) {
            c1176Re.A04().addView(view, layoutParams);
            A00(c1176Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1355Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1355Yh
    public void A4k(String str, UL ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1355Yh
    public void AAo(String str, C1084Nm c1084Nm) {
        if (this.A00.get() != null) {
            WeakReference<C1176Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c1084Nm);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1355Yh
    public void ADJ(int i10) {
        C1176Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i10);
        }
    }
}
