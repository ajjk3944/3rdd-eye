package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class en1 {

    /* renamed from: a, reason: collision with root package name */
    public int f10836a;

    /* renamed from: b, reason: collision with root package name */
    public int f10837b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.k f10838c;

    public static cn1 d(int i4, int i10, byte[] bArr) {
        cn1 cn1Var = new cn1(bArr, i4, i10);
        try {
            cn1Var.B(i10);
            return cn1Var;
        } catch (ao1 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int f(int i4) {
        return (i4 >>> 1) ^ (-(i4 & 1));
    }

    public static long g(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract long A();

    public abstract int B(int i4);

    public abstract void a(int i4);

    public abstract boolean b();

    public abstract int c();

    public final void e() {
        int iH;
        do {
            iH = h();
            if (iH == 0) {
                return;
            }
            int i4 = this.f10836a;
            int i10 = this.f10837b;
            if (i4 + i10 >= 100) {
                throw new ao1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f10837b = i10 + 1;
            this.f10837b--;
        } while (j(iH));
    }

    public abstract int h();

    public abstract void i(int i4);

    public abstract boolean j(int i4);

    public abstract double k();

    public abstract float l();

    public abstract long m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract boolean r();

    public abstract String s();

    public abstract String t();

    public abstract zm1 u();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract int z();
}
