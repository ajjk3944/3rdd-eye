package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class hn1 extends yo0 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f11928c = ip1.f12414e;

    /* renamed from: b, reason: collision with root package name */
    public rg0 f11929b;

    public static int J(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int K(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void L() {
        if (R() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void M(int i4, int i10);

    public abstract void N(int i4, int i10);

    public abstract void O(int i4, int i10);

    public abstract void P(int i4, int i10);

    public abstract void Q(int i4, long j);

    public abstract int R();

    public abstract void S(int i4, long j);

    public abstract void T(int i4, boolean z3);

    public abstract void U(int i4, String str);

    public abstract void V(int i4, bn1 bn1Var);

    public abstract void W(bn1 bn1Var);

    public abstract void X(int i4, byte[] bArr);

    public abstract void Y(qm1 qm1Var);

    public abstract void Z(byte b10);

    public abstract void a0(int i4);

    public abstract void b0(int i4);

    public abstract void c0(int i4);

    public abstract void d0(long j);

    public abstract void e0(long j);

    public abstract void f0(String str);
}
