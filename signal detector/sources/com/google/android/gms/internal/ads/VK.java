package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class VK extends AbstractC1984ut {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f11982c = WL.f12216e;

    /* renamed from: b, reason: collision with root package name */
    public C1014cu f11983b;

    public static int J(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int K(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public final void L() {
        if (R() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void M(int i, int i3);

    public abstract void N(int i, int i3);

    public abstract void O(int i, int i3);

    public abstract void P(int i, int i3);

    public abstract void Q(int i, long j6);

    public abstract int R();

    public abstract void S(int i, long j6);

    public abstract void T(int i, boolean z6);

    public abstract void U(int i, String str);

    public abstract void V(int i, QK qk);

    public abstract void W(QK qk);

    public abstract void X(int i, byte[] bArr);

    public abstract void Y(FK fk);

    public abstract void Z(byte b5);

    public abstract void a0(int i);

    public abstract void b0(int i);

    public abstract void c0(int i);

    public abstract void d0(long j6);

    public abstract void e0(long j6);

    public abstract void f0(String str);
}
