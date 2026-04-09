package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.applovin.shadow.okio.internal.Buffer;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1788mt implements InterfaceC0543Hd {
    public final byte[] A00 = new byte[Buffer.SEGMENTING_THRESHOLD];

    @Override // com.instagram.common.viewpoint.core.InterfaceC0543Hd
    public final /* synthetic */ int AIp(InterfaceC01762c interfaceC01762c, int i4, boolean z3) {
        return AbstractC0540Ha.A00(this, interfaceC01762c, i4, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0543Hd
    public final /* synthetic */ void AIr(C02434v c02434v, int i4) {
        AbstractC0540Ha.A01(this, c02434v, i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0543Hd
    public final void A6e(C1996qI c1996qI) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0543Hd
    public final int AIq(InterfaceC01762c interfaceC01762c, int i4, boolean z3, int i10) throws IOException {
        int bytesSkipped = interfaceC01762c.read(this.A00, 0, Math.min(this.A00.length, i4));
        if (bytesSkipped == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0543Hd
    public final void AIs(C02434v c02434v, int i4, int i10) {
        c02434v.A0g(i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0543Hd
    public final void AIu(long j, int i4, int i10, int i11, C0541Hb c0541Hb) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0543Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
