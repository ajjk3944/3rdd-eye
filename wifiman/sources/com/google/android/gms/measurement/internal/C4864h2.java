package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4864h2 {

    /* renamed from: A, reason: collision with root package name */
    private Long f36472A;

    /* renamed from: B, reason: collision with root package name */
    private Long f36473B;

    /* renamed from: C, reason: collision with root package name */
    private long f36474C;

    /* renamed from: D, reason: collision with root package name */
    private String f36475D;

    /* renamed from: E, reason: collision with root package name */
    private int f36476E;

    /* renamed from: F, reason: collision with root package name */
    private int f36477F;

    /* renamed from: G, reason: collision with root package name */
    private long f36478G;

    /* renamed from: H, reason: collision with root package name */
    private String f36479H;

    /* renamed from: I, reason: collision with root package name */
    private byte[] f36480I;

    /* renamed from: J, reason: collision with root package name */
    private int f36481J;

    /* renamed from: K, reason: collision with root package name */
    private long f36482K;

    /* renamed from: L, reason: collision with root package name */
    private long f36483L;

    /* renamed from: M, reason: collision with root package name */
    private long f36484M;

    /* renamed from: N, reason: collision with root package name */
    private long f36485N;

    /* renamed from: O, reason: collision with root package name */
    private long f36486O;

    /* renamed from: P, reason: collision with root package name */
    private long f36487P;

    /* renamed from: Q, reason: collision with root package name */
    private String f36488Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f36489R;

    /* renamed from: S, reason: collision with root package name */
    private long f36490S;

    /* renamed from: T, reason: collision with root package name */
    private long f36491T;

    /* renamed from: a, reason: collision with root package name */
    private final C4976v3 f36492a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36493b;

    /* renamed from: c, reason: collision with root package name */
    private String f36494c;

    /* renamed from: d, reason: collision with root package name */
    private String f36495d;

    /* renamed from: e, reason: collision with root package name */
    private String f36496e;

    /* renamed from: f, reason: collision with root package name */
    private String f36497f;

    /* renamed from: g, reason: collision with root package name */
    private long f36498g;

    /* renamed from: h, reason: collision with root package name */
    private long f36499h;

    /* renamed from: i, reason: collision with root package name */
    private long f36500i;

    /* renamed from: j, reason: collision with root package name */
    private String f36501j;

    /* renamed from: k, reason: collision with root package name */
    private long f36502k;

    /* renamed from: l, reason: collision with root package name */
    private String f36503l;

    /* renamed from: m, reason: collision with root package name */
    private long f36504m;

    /* renamed from: n, reason: collision with root package name */
    private long f36505n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f36506o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f36507p;

    /* renamed from: q, reason: collision with root package name */
    private String f36508q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f36509r;

    /* renamed from: s, reason: collision with root package name */
    private long f36510s;

    /* renamed from: t, reason: collision with root package name */
    private List f36511t;

    /* renamed from: u, reason: collision with root package name */
    private String f36512u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f36513v;

    /* renamed from: w, reason: collision with root package name */
    private long f36514w;

    /* renamed from: x, reason: collision with root package name */
    private long f36515x;

    /* renamed from: y, reason: collision with root package name */
    private int f36516y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f36517z;

    C4864h2(C4976v3 c4976v3, String str) {
        AbstractC7901p.l(c4976v3);
        AbstractC7901p.f(str);
        this.f36492a = c4976v3;
        this.f36493b = str;
        c4976v3.zzl().j();
    }

    public final boolean A() {
        this.f36492a.zzl().j();
        return this.f36506o;
    }

    public final long A0() {
        this.f36492a.zzl().j();
        return this.f36504m;
    }

    public final boolean B() {
        this.f36492a.zzl().j();
        return this.f36489R;
    }

    public final void B0(long j10) {
        AbstractC7901p.a(j10 >= 0);
        this.f36492a.zzl().j();
        this.f36489R |= this.f36498g != j10;
        this.f36498g = j10;
    }

    public final boolean C() {
        this.f36492a.zzl().j();
        return this.f36513v;
    }

    public final long C0() {
        this.f36492a.zzl().j();
        return this.f36478G;
    }

    public final boolean D() {
        this.f36492a.zzl().j();
        return this.f36517z;
    }

    public final void D0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36499h != j10;
        this.f36499h = j10;
    }

    public final byte[] E() {
        this.f36492a.zzl().j();
        return this.f36480I;
    }

    public final long E0() {
        this.f36492a.zzl().j();
        return this.f36500i;
    }

    public final int F() {
        this.f36492a.zzl().j();
        return this.f36481J;
    }

    public final void F0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36515x != j10;
        this.f36515x = j10;
    }

    public final void G(int i10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36481J != i10;
        this.f36481J = i10;
    }

    public final long G0() {
        this.f36492a.zzl().j();
        return this.f36498g;
    }

    public final void H(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36502k != j10;
        this.f36502k = j10;
    }

    public final void H0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36514w != j10;
        this.f36514w = j10;
    }

    public final void I(Long l10) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36473B, l10);
        this.f36473B = l10;
    }

    public final long I0() {
        this.f36492a.zzl().j();
        return this.f36499h;
    }

    public final void J(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36494c, str);
        this.f36494c = str;
    }

    public final long J0() {
        this.f36492a.zzl().j();
        return this.f36515x;
    }

    public final void K(boolean z10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36506o != z10;
        this.f36506o = z10;
    }

    public final long K0() {
        this.f36492a.zzl().j();
        return this.f36514w;
    }

    public final int L() {
        this.f36492a.zzl().j();
        return this.f36477F;
    }

    public final Boolean L0() {
        this.f36492a.zzl().j();
        return this.f36509r;
    }

    public final void M(int i10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36477F != i10;
        this.f36477F = i10;
    }

    public final Long M0() {
        this.f36492a.zzl().j();
        return this.f36472A;
    }

    public final void N(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36474C != j10;
        this.f36474C = j10;
    }

    public final Long N0() {
        this.f36492a.zzl().j();
        return this.f36473B;
    }

    public final void O(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36503l, str);
        this.f36503l = str;
    }

    public final void P(boolean z10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36513v != z10;
        this.f36513v = z10;
    }

    public final int Q() {
        this.f36492a.zzl().j();
        return this.f36476E;
    }

    public final void R(int i10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36476E != i10;
        this.f36476E = i10;
    }

    public final void S(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36490S != j10;
        this.f36490S = j10;
    }

    public final void T(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36501j, str);
        this.f36501j = str;
    }

    public final void U(boolean z10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36517z != z10;
        this.f36517z = z10;
    }

    public final long V() {
        this.f36492a.zzl().j();
        return this.f36502k;
    }

    public final void W(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36485N != j10;
        this.f36485N = j10;
    }

    public final void X(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36497f, str);
        this.f36497f = str;
    }

    public final long Y() {
        this.f36492a.zzl().j();
        return this.f36474C;
    }

    public final void Z(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36486O != j10;
        this.f36486O = j10;
    }

    public final int a() {
        this.f36492a.zzl().j();
        return this.f36516y;
    }

    public final void a0(String str) {
        this.f36492a.zzl().j();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f36489R |= !Objects.equals(this.f36495d, str);
        this.f36495d = str;
    }

    public final void b(int i10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36516y != i10;
        this.f36516y = i10;
    }

    public final long b0() {
        this.f36492a.zzl().j();
        return this.f36490S;
    }

    public final void c(long j10) {
        this.f36492a.zzl().j();
        long j11 = this.f36498g + j10;
        if (j11 > 2147483647L) {
            this.f36492a.zzj().H().b("Bundle index overflow. appId", L2.r(this.f36493b));
            j11 = j10 - 1;
        }
        long j12 = this.f36478G + 1;
        if (j12 > 2147483647L) {
            this.f36492a.zzj().H().b("Delivery index overflow. appId", L2.r(this.f36493b));
            j12 = 0;
        }
        this.f36489R = true;
        this.f36498g = j11;
        this.f36478G = j12;
    }

    public final void c0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36484M != j10;
        this.f36484M = j10;
    }

    public final void d(Boolean bool) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36509r, bool);
        this.f36509r = bool;
    }

    public final void d0(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36488Q, str);
        this.f36488Q = str;
    }

    public final void e(Long l10) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36472A, l10);
        this.f36472A = l10;
    }

    public final long e0() {
        this.f36492a.zzl().j();
        return this.f36485N;
    }

    public final void f(String str) {
        this.f36492a.zzl().j();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f36489R |= !Objects.equals(this.f36508q, str);
        this.f36508q = str;
    }

    public final void f0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36483L != j10;
        this.f36483L = j10;
    }

    public final void g(List list) {
        this.f36492a.zzl().j();
        if (Objects.equals(this.f36511t, list)) {
            return;
        }
        this.f36489R = true;
        this.f36511t = list != null ? new ArrayList(list) : null;
    }

    public final void g0(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36496e, str);
        this.f36496e = str;
    }

    public final void h(boolean z10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36507p != z10;
        this.f36507p = z10;
    }

    public final long h0() {
        this.f36492a.zzl().j();
        return this.f36486O;
    }

    public final void i(byte[] bArr) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36480I != bArr;
        this.f36480I = bArr;
    }

    public final void i0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36487P != j10;
        this.f36487P = j10;
    }

    public final String j() {
        this.f36492a.zzl().j();
        return this.f36508q;
    }

    public final void j0(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36479H != str;
        this.f36479H = str;
    }

    public final String k() {
        this.f36492a.zzl().j();
        String str = this.f36488Q;
        d0(null);
        return str;
    }

    public final long k0() {
        this.f36492a.zzl().j();
        return this.f36484M;
    }

    public final String l() {
        this.f36492a.zzl().j();
        return this.f36493b;
    }

    public final void l0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36482K != j10;
        this.f36482K = j10;
    }

    public final String m() {
        this.f36492a.zzl().j();
        return this.f36494c;
    }

    public final void m0(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= !Objects.equals(this.f36512u, str);
        this.f36512u = str;
    }

    public final String n() {
        this.f36492a.zzl().j();
        return this.f36503l;
    }

    public final long n0() {
        this.f36492a.zzl().j();
        return this.f36483L;
    }

    public final String o() {
        this.f36492a.zzl().j();
        return this.f36501j;
    }

    public final void o0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36505n != j10;
        this.f36505n = j10;
    }

    public final String p() {
        this.f36492a.zzl().j();
        return this.f36497f;
    }

    public final void p0(String str) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36475D != str;
        this.f36475D = str;
    }

    public final String q() {
        this.f36492a.zzl().j();
        return this.f36495d;
    }

    public final long q0() {
        this.f36492a.zzl().j();
        return this.f36487P;
    }

    public final String r() {
        this.f36492a.zzl().j();
        return this.f36488Q;
    }

    public final void r0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36510s != j10;
        this.f36510s = j10;
    }

    public final String s() {
        this.f36492a.zzl().j();
        return this.f36496e;
    }

    public final long s0() {
        this.f36492a.zzl().j();
        return this.f36482K;
    }

    public final String t() {
        this.f36492a.zzl().j();
        return this.f36479H;
    }

    public final void t0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36491T != j10;
        this.f36491T = j10;
    }

    public final String u() {
        this.f36492a.zzl().j();
        return this.f36512u;
    }

    public final long u0() {
        this.f36492a.zzl().j();
        return this.f36505n;
    }

    public final String v() {
        this.f36492a.zzl().j();
        return this.f36475D;
    }

    public final void v0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36504m != j10;
        this.f36504m = j10;
    }

    public final List w() {
        this.f36492a.zzl().j();
        return this.f36511t;
    }

    public final long w0() {
        this.f36492a.zzl().j();
        return this.f36510s;
    }

    public final void x() {
        this.f36492a.zzl().j();
        this.f36489R = false;
    }

    public final void x0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36478G != j10;
        this.f36478G = j10;
    }

    public final void y() {
        this.f36492a.zzl().j();
        long j10 = this.f36498g + 1;
        if (j10 > 2147483647L) {
            this.f36492a.zzj().H().b("Bundle index overflow. appId", L2.r(this.f36493b));
            j10 = 0;
        }
        this.f36489R = true;
        this.f36498g = j10;
    }

    public final long y0() {
        this.f36492a.zzl().j();
        return this.f36491T;
    }

    public final boolean z() {
        this.f36492a.zzl().j();
        return this.f36507p;
    }

    public final void z0(long j10) {
        this.f36492a.zzl().j();
        this.f36489R |= this.f36500i != j10;
        this.f36500i = j10;
    }
}
