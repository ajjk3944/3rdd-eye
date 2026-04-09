package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1842nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C03599p A01;

    public C1842nm(C03599p c03599p, int i4) {
        this.A01 = c03599p;
        this.A00 = i4;
    }

    @Override // com.instagram.common.viewpoint.core.DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        return this.A01.A0L[this.A00].A0S();
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final int AHP(C02996z c02996z, C1917p0 c1917p0, int i4) {
        return this.A01.A0Y(this.A00, c02996z, c1917p0, i4);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final int AK2(long j) {
        return this.A01.A0X(this.A00, j);
    }
}
