package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2166mt implements InterfaceC0921Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.instagram.common.viewpoint.core.InterfaceC0921Hd
    public final /* synthetic */ int AIp(InterfaceC05542c interfaceC05542c, int i10, boolean z10) {
        return AbstractC0918Ha.A00(this, interfaceC05542c, i10, z10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0921Hd
    public final /* synthetic */ void AIr(C06214v c06214v, int i10) {
        AbstractC0918Ha.A01(this, c06214v, i10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0921Hd
    public final void A6e(C2374qI c2374qI) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0921Hd
    public final int AIq(InterfaceC05542c interfaceC05542c, int i10, boolean z10, int i11) throws IOException {
        int bytesSkipped = interfaceC05542c.read(this.A00, 0, Math.min(this.A00.length, i10));
        if (bytesSkipped == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0921Hd
    public final void AIs(C06214v c06214v, int i10, int i11) {
        c06214v.A0g(i10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0921Hd
    public final void AIu(long j10, int i10, int i11, int i12, C0919Hb c0919Hb) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0921Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
