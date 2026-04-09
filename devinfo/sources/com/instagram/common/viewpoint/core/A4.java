package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC02073l {
    public final C03639y A00;
    public final C1874oJ A01;
    public final InterfaceC02063k[] A02;

    public A4(InterfaceC02063k... interfaceC02063kArr) {
        this(interfaceC02063kArr, new C03639y(), new C1874oJ());
    }

    public A4(InterfaceC02063k[] interfaceC02063kArr, C03639y c03639y, C1874oJ c1874oJ) {
        this.A02 = new InterfaceC02063k[interfaceC02063kArr.length + 2];
        System.arraycopy(interfaceC02063kArr, 0, this.A02, 0, interfaceC02063kArr.length);
        this.A00 = c03639y;
        this.A01 = c1874oJ;
        this.A02[interfaceC02063kArr.length] = c03639y;
        this.A02[interfaceC02063kArr.length + 1] = c1874oJ;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02073l
    public final C1975px A4F(C1975px c1975px) {
        this.A01.A02(c1975px.A01);
        this.A01.A01(c1975px.A00);
        return c1975px;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02073l
    public final boolean A4G(boolean z3) {
        this.A00.A0D(z3);
        return z3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02073l
    public final InterfaceC02063k[] A6z() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02073l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02073l
    public final long A98() {
        return this.A00.A0C();
    }
}
