package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913b1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0858a1 f13283a;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f13284b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13285c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13286d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13287e;

    /* renamed from: f, reason: collision with root package name */
    public int f13288f;

    /* renamed from: g, reason: collision with root package name */
    public int f13289g;

    /* renamed from: h, reason: collision with root package name */
    public int f13290h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f13291j;

    /* renamed from: k, reason: collision with root package name */
    public int f13292k;

    /* renamed from: l, reason: collision with root package name */
    public long f13293l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f13294m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f13295n;

    public C0913b1(int i, C0858a1 c0858a1, T0 t02) {
        int i3 = c0858a1.f13018d;
        this.f13283a = c0858a1;
        int iB = c0858a1.b();
        boolean z6 = true;
        if (iB != 1) {
            if (iB == 2) {
                iB = 2;
            } else {
                z6 = false;
            }
        }
        AbstractC0582Jp.m(z6);
        int i6 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.f13285c = (iB == 2 ? 1667497984 : 1651965952) | i6;
        this.f13287e = Vt.u(i3, c0858a1.f13016b * 1000000, c0858a1.f13017c, RoundingMode.DOWN);
        this.f13284b = t02;
        this.f13286d = iB == 2 ? 1650720768 | i6 : -1;
        this.f13293l = -1L;
        this.f13294m = new long[512];
        this.f13295n = new int[512];
        this.f13288f = i3;
    }

    public final K0 a(long j6) {
        if (this.f13292k == 0) {
            M0 m02 = new M0(0L, this.f13293l);
            return new K0(m02, m02);
        }
        int i = (int) (j6 / ((this.f13287e * 1) / this.f13288f));
        int iP = Vt.p(this.f13295n, i, true, true);
        if (this.f13295n[iP] == i) {
            M0 m0B = b(iP);
            return new K0(m0B, m0B);
        }
        M0 m0B2 = b(iP);
        int i3 = iP + 1;
        return i3 < this.f13294m.length ? new K0(m0B2, b(i3)) : new K0(m0B2, m0B2);
    }

    public final M0 b(int i) {
        return new M0(((this.f13287e * 1) / this.f13288f) * this.f13295n[i], this.f13294m[i]);
    }
}
