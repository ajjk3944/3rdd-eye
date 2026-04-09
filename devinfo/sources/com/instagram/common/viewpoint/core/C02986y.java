package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C02986y implements InterfaceC0866Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C02986y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACm() {
        WT.A00(new C0861Tq(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACq() {
        WT.A00(new C0862Tr(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ADp(C0908Vm c0908Vm) {
        WT.A00(new C0864Tt(this, c0908Vm));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void AEl() {
        WT.A00(new C0860Tp(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0866Tv
    public final void AEq() {
        WT.A00(new C0863Ts(this));
    }
}
