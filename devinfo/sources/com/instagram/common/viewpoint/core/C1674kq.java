package com.instagram.common.viewpoint.core;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1674kq implements InterfaceC0654Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1674kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0654Ll
    public final void AGj(int i4) throws C1671kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0654Ll
    public final void close() throws C1671kn {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0654Ll
    public final int length() throws C1671kn {
        return this.A01.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0654Ll
    public final int read(byte[] bArr) throws C1671kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
