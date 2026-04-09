package com.instagram.common.viewpoint.core;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2052kq implements InterfaceC1032Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C2052kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1032Ll
    public final void AGj(int i10) throws C2049kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1032Ll
    public final void close() throws C2049kn {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1032Ll
    public final int length() throws C2049kn {
        return this.A01.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1032Ll
    public final int read(byte[] bArr) throws C2049kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
