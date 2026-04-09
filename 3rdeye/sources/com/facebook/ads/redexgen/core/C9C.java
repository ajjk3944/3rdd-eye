package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.9C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C9C extends Timeline {
    public final Timeline A00;

    public C9C(Timeline timeline) {
        this.A00 = timeline;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.A06();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A00.A07();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A08(int i, int i10, boolean z10) {
        return this.A00.A08(i, i10, z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z10) {
        return this.A00.A0B(z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z10) {
        return this.A00.A0C(z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C3920oN A0I(int i, C3920oN c3920oN, boolean z10) {
        return this.A00.A0I(i, c3920oN, z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C3918oL A0L(int i, C3918oL c3918oL, long j4) {
        return this.A00.A0L(i, c3918oL, j4);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i) {
        return this.A00.A0M(i);
    }
}
