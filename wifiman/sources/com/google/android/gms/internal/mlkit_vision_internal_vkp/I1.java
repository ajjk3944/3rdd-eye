package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class I1 extends AbstractC4712s1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f35599b = Logger.getLogger(I1.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f35600c = AbstractC4539c3.C();

    /* renamed from: a, reason: collision with root package name */
    J1 f35601a;

    /* synthetic */ I1(H1 h12) {
    }

    static int b(int i10, InterfaceC4790z2 interfaceC4790z2, J2 j22) {
        int iF = f(i10 << 3);
        return iF + iF + ((AbstractC4614j1) interfaceC4790z2).a(j22);
    }

    public static int c(InterfaceC4790z2 interfaceC4790z2) {
        int iB = interfaceC4790z2.b();
        return f(iB) + iB;
    }

    static int d(InterfaceC4790z2 interfaceC4790z2, J2 j22) {
        int iA = ((AbstractC4614j1) interfaceC4790z2).a(j22);
        return f(iA) + iA;
    }

    public static int e(String str) {
        int length;
        try {
            length = AbstractC4594h3.c(str);
        } catch (C4583g3 unused) {
            length = str.getBytes(AbstractC4593h2.f35691a).length;
        }
        return f(length) + length;
    }

    public static int f(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int g(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public abstract void A(int i10, String str);

    public abstract void B(String str);

    public abstract void C(int i10, int i11);

    public abstract void D(int i10, int i11);

    public abstract void E(int i10);

    public abstract void F(int i10, long j10);

    public abstract void G(long j10);

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4712s1
    public abstract void a(byte[] bArr, int i10, int i11);

    public final void h() {
        if (n() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void i(String str, C4583g3 c4583g3) throws zzbdn {
        f35599b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c4583g3);
        byte[] bytes = str.getBytes(AbstractC4593h2.f35691a);
        try {
            int length = bytes.length;
            E(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbdn(e10);
        }
    }

    public abstract void k(byte b10);

    public abstract void l(int i10, boolean z10);

    abstract void m(byte[] bArr, int i10, int i11);

    public abstract int n();

    public abstract void o(int i10, B1 b12);

    public abstract void p(B1 b12);

    public abstract void q(int i10, int i11);

    public abstract void r(int i10);

    public abstract void s(int i10, long j10);

    public abstract void t(long j10);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10);

    abstract void w(int i10, InterfaceC4790z2 interfaceC4790z2, J2 j22);

    public abstract void x(InterfaceC4790z2 interfaceC4790z2);

    public abstract void y(int i10, InterfaceC4790z2 interfaceC4790z2);

    public abstract void z(int i10, B1 b12);
}
