package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3715kp implements I8 {
    public final /* synthetic */ MatroskaExtractor A00;

    public C3715kp(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.facebook.ads.redexgen.core.I8
    public final void A4a(int i, int i10, InterfaceC3738lN interfaceC3738lN) throws IOException {
        this.A00.A0U(i, i10, interfaceC3738lN);
    }

    @Override // com.facebook.ads.redexgen.core.I8
    public final void A6F(int i) throws C22172i {
        this.A00.A0S(i);
    }

    @Override // com.facebook.ads.redexgen.core.I8
    public final void A6S(int i, double d10) throws C22172i {
        this.A00.A0T(i, d10);
    }

    @Override // com.facebook.ads.redexgen.core.I8
    public final int A7m(int i) {
        return this.A00.A0R(i);
    }

    @Override // com.facebook.ads.redexgen.core.I8
    public final void AA9(int i, long j4) throws C22172i {
        this.A00.A0V(i, j4);
    }

    @Override // com.facebook.ads.redexgen.core.I8
    public final boolean AAN(int i) {
        return this.A00.A0Y(i);
    }

    @Override // com.facebook.ads.redexgen.core.I8
    public final void AJO(int i, long j4, long j10) throws C22172i {
        this.A00.A0W(i, j4, j10);
    }

    @Override // com.facebook.ads.redexgen.core.I8
    public final void AJZ(int i, String str) throws C22172i {
        this.A00.A0X(i, str);
    }
}
