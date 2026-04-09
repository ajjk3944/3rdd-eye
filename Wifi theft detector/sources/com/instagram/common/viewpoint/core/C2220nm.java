package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2220nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C07379p A01;

    public C2220nm(C07379p c07379p, int i10) {
        this.A01 = c07379p;
        this.A00 = i10;
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
    public final int AHP(C06776z c06776z, C2295p0 c2295p0, int i10) {
        return this.A01.A0Y(this.A00, c06776z, c2295p0, i10);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final int AK2(long j10) {
        return this.A01.A0X(this.A00, j10);
    }
}
