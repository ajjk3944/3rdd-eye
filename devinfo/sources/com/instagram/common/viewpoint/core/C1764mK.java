package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1764mK implements InterfaceC0576Ik {
    public final /* synthetic */ MatroskaExtractor A00;

    public C1764mK(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0576Ik
    public final void A4i(int i4, int i10, InterfaceC1787ms interfaceC1787ms) throws IOException {
        this.A00.A0U(i4, i10, interfaceC1787ms);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0576Ik
    public final void A6N(int i4) throws C3K {
        this.A00.A0S(i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0576Ik
    public final void A6a(int i4, double d10) throws C3K {
        this.A00.A0T(i4, d10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0576Ik
    public final int A7u(int i4) {
        return this.A00.A0R(i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0576Ik
    public final void AAH(int i4, long j) throws C3K {
        this.A00.A0V(i4, j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0576Ik
    public final boolean AAW(int i4) {
        return this.A00.A0Y(i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0576Ik
    public final void AK9(int i4, long j, long j8) throws C3K {
        this.A00.A0W(i4, j, j8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0576Ik
    public final void AKK(int i4, String str) throws C3K {
        this.A00.A0X(i4, str);
    }
}
