package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC05853l {
    public final C07419y A00;
    public final C2252oJ A01;
    public final InterfaceC05843k[] A02;

    public A4(InterfaceC05843k... interfaceC05843kArr) {
        this(interfaceC05843kArr, new C07419y(), new C2252oJ());
    }

    public A4(InterfaceC05843k[] interfaceC05843kArr, C07419y c07419y, C2252oJ c2252oJ) {
        this.A02 = new InterfaceC05843k[interfaceC05843kArr.length + 2];
        System.arraycopy(interfaceC05843kArr, 0, this.A02, 0, interfaceC05843kArr.length);
        this.A00 = c07419y;
        this.A01 = c2252oJ;
        this.A02[interfaceC05843kArr.length] = c07419y;
        this.A02[interfaceC05843kArr.length + 1] = c2252oJ;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05853l
    public final C2353px A4F(C2353px c2353px) {
        this.A01.A02(c2353px.A01);
        this.A01.A01(c2353px.A00);
        return c2353px;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05853l
    public final boolean A4G(boolean z10) {
        this.A00.A0D(z10);
        return z10;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05853l
    public final InterfaceC05843k[] A6z() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05853l
    public final long A8U(long j10) {
        return this.A01.A00(j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05853l
    public final long A98() {
        return this.A00.A0C();
    }
}
