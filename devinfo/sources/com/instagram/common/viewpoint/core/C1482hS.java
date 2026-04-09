package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1482hS implements InterfaceC0977Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C0798Re> A00;

    public C1482hS(C0798Re c0798Re) {
        this.A00 = new WeakReference<>(c0798Re);
    }

    private void A00(C0798Re c0798Re) {
        C1284eF c1284eFA07 = c0798Re.A07();
        if (c1284eFA07 != null && c0798Re.A04() != null) {
            c0798Re.A04().bringChildToFront(c1284eFA07);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0977Yh
    public void A44(View view, int i4, RelativeLayout.LayoutParams layoutParams) {
        C0798Re c0798Re = this.A00.get();
        if (c0798Re != null && c0798Re.A04() != null) {
            c0798Re.A04().addView(view, i4, layoutParams);
            A00(c0798Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0977Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C0798Re c0798Re = this.A00.get();
        if (c0798Re != null && c0798Re.A04() != null) {
            c0798Re.A04().addView(view, layoutParams);
            A00(c0798Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0977Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0977Yh
    public void A4k(String str, UL ul2) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0977Yh
    public void AAo(String str, C0706Nm c0706Nm) {
        if (this.A00.get() != null) {
            WeakReference<C0798Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c0706Nm);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0977Yh
    public void ADJ(int i4) {
        C0798Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i4);
        }
    }
}
