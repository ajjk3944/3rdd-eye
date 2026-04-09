package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.lO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3739lO implements H1 {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ int AI5(AnonymousClass20 anonymousClass20, int i, boolean z10) {
        return AbstractC2581Gy.A00(this, anonymousClass20, i, z10);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ void AI7(C4J c4j, int i) {
        AbstractC2581Gy.A01(this, c4j, i);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void A6W(C3949or c3949or) {
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final int AI6(AnonymousClass20 anonymousClass20, int i, boolean z10, int i10) throws IOException {
        int bytesSkipped = anonymousClass20.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AI8(C4J c4j, int i, int i10) {
        c4j.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AIA(long j4, int i, int i10, int i11, C2582Gz c2582Gz) {
    }

    @Override // com.facebook.ads.redexgen.core.H1
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AJu(Uri uri) {
    }
}
