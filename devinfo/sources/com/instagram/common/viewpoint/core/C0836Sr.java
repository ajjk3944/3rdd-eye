package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Sr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0836Sr extends AbstractRunnableC0923Wc {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WA A01;
    public final /* synthetic */ WD A02;
    public final /* synthetic */ String A03;

    public C0836Sr(WD wd2, String str, long j, WA wa2) {
        this.A02 = wd2;
        this.A03 = str;
        this.A00 = j;
        this.A01 = wa2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A02.A0N(this.A03, this.A00, this.A01);
    }
}
