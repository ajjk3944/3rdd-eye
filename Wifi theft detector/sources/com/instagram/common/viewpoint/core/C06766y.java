package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06766y implements InterfaceC1244Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C06766y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACm() {
        WT.A00(new C1239Tq(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACq() {
        WT.A00(new C1240Tr(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ADp(C1286Vm c1286Vm) {
        WT.A00(new C1242Tt(this, c1286Vm));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void AEl() {
        WT.A00(new C1238Tp(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1244Tv
    public final void AEq() {
        WT.A00(new C1241Ts(this));
    }
}
