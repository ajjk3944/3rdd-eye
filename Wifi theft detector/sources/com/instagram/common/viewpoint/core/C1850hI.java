package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.hI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1850hI implements InterfaceC1587d1 {
    public static String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C1844hC A01;
    public final /* synthetic */ UK A02;

    public C1850hI(C1844hC c1844hC, UK uk, NativeAd nativeAd) {
        this.A01 = c1844hC;
        this.A02 = uk;
        this.A00 = nativeAd;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1587d1
    public final void AAn() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1587d1
    public final void ADm(AnonymousClass62 anonymousClass62) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1851hJ(this, anonymousClass62), 1L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1587d1
    public final void AE2() {
        if (this.A01.A0H != null) {
            AnonymousClass62 anonymousClass62 = this.A01.A0H;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            anonymousClass62.A08();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1587d1
    public final void AGC(View view, MotionEvent motionEvent) {
        this.A02.A1E().A06(this.A01.A0C, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0U(this.A00) && this.A02.A17() != null) {
            this.A02.A17().onClick(view);
        }
    }
}
