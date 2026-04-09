package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1747qO {

    /* renamed from: t, reason: collision with root package name */
    public static final C1749qQ f16351t = new C1749qQ(-1, new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1353j8 f16352a;

    /* renamed from: b, reason: collision with root package name */
    public final C1749qQ f16353b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16354c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16355d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16356e;

    /* renamed from: f, reason: collision with root package name */
    public final HN f16357f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16358g;

    /* renamed from: h, reason: collision with root package name */
    public final SQ f16359h;
    public final C1184g i;

    /* renamed from: j, reason: collision with root package name */
    public final List f16360j;

    /* renamed from: k, reason: collision with root package name */
    public final C1749qQ f16361k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16362l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16363m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16364n;

    /* renamed from: o, reason: collision with root package name */
    public final C2159y5 f16365o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f16366p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f16367q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f16368r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f16369s;

    public C1747qO(AbstractC1353j8 abstractC1353j8, C1749qQ c1749qQ, long j6, long j7, int i, HN hn, boolean z6, SQ sq, C1184g c1184g, List list, C1749qQ c1749qQ2, boolean z7, int i3, int i6, C2159y5 c2159y5, long j8, long j9, long j10, long j11) {
        this.f16352a = abstractC1353j8;
        this.f16353b = c1749qQ;
        this.f16354c = j6;
        this.f16355d = j7;
        this.f16356e = i;
        this.f16357f = hn;
        this.f16358g = z6;
        this.f16359h = sq;
        this.i = c1184g;
        this.f16360j = list;
        this.f16361k = c1749qQ2;
        this.f16362l = z7;
        this.f16363m = i3;
        this.f16364n = i6;
        this.f16365o = c2159y5;
        this.f16366p = j8;
        this.f16367q = j9;
        this.f16368r = j10;
        this.f16369s = j11;
    }

    public static C1747qO a(C1184g c1184g) {
        C1730q7 c1730q7 = AbstractC1353j8.f14909a;
        SQ sq = SQ.f11183d;
        C1197gC c1197gC = C1197gC.f14227e;
        C2159y5 c2159y5 = C2159y5.f17678d;
        C1749qQ c1749qQ = f16351t;
        return new C1747qO(c1730q7, c1749qQ, -9223372036854775807L, 0L, 1, null, false, sq, c1184g, c1197gC, c1749qQ, false, 1, 0, c2159y5, 0L, 0L, 0L, 0L);
    }

    public final C1747qO b(C1749qQ c1749qQ, long j6, long j7, long j8, long j9, SQ sq, C1184g c1184g, List list) {
        C1749qQ c1749qQ2 = this.f16361k;
        boolean z6 = this.f16362l;
        int i = this.f16363m;
        int i3 = this.f16364n;
        C2159y5 c2159y5 = this.f16365o;
        long j10 = this.f16366p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new C1747qO(this.f16352a, c1749qQ, j7, j8, this.f16356e, this.f16357f, this.f16358g, sq, c1184g, list, c1749qQ2, z6, i, i3, c2159y5, j10, j9, j6, jElapsedRealtime);
    }

    public final C1747qO c(AbstractC1353j8 abstractC1353j8) {
        return new C1747qO(abstractC1353j8, this.f16353b, this.f16354c, this.f16355d, this.f16356e, this.f16357f, this.f16358g, this.f16359h, this.i, this.f16360j, this.f16361k, this.f16362l, this.f16363m, this.f16364n, this.f16365o, this.f16366p, this.f16367q, this.f16368r, this.f16369s);
    }

    public final C1747qO d(int i) {
        return new C1747qO(this.f16352a, this.f16353b, this.f16354c, this.f16355d, i, this.f16357f, this.f16358g, this.f16359h, this.i, this.f16360j, this.f16361k, this.f16362l, this.f16363m, this.f16364n, this.f16365o, this.f16366p, this.f16367q, this.f16368r, this.f16369s);
    }

    public final C1747qO e(HN hn) {
        return new C1747qO(this.f16352a, this.f16353b, this.f16354c, this.f16355d, this.f16356e, hn, this.f16358g, this.f16359h, this.i, this.f16360j, this.f16361k, this.f16362l, this.f16363m, this.f16364n, this.f16365o, this.f16366p, this.f16367q, this.f16368r, this.f16369s);
    }

    public final C1747qO f(boolean z6) {
        return new C1747qO(this.f16352a, this.f16353b, this.f16354c, this.f16355d, this.f16356e, this.f16357f, z6, this.f16359h, this.i, this.f16360j, this.f16361k, this.f16362l, this.f16363m, this.f16364n, this.f16365o, this.f16366p, this.f16367q, this.f16368r, this.f16369s);
    }

    public final C1747qO g(C1749qQ c1749qQ) {
        return new C1747qO(this.f16352a, this.f16353b, this.f16354c, this.f16355d, this.f16356e, this.f16357f, this.f16358g, this.f16359h, this.i, this.f16360j, c1749qQ, this.f16362l, this.f16363m, this.f16364n, this.f16365o, this.f16366p, this.f16367q, this.f16368r, this.f16369s);
    }

    public final C1747qO h(int i, int i3, boolean z6) {
        return new C1747qO(this.f16352a, this.f16353b, this.f16354c, this.f16355d, this.f16356e, this.f16357f, this.f16358g, this.f16359h, this.i, this.f16360j, this.f16361k, z6, i, i3, this.f16365o, this.f16366p, this.f16367q, this.f16368r, this.f16369s);
    }

    public final boolean i() {
        return this.f16356e == 3 && this.f16362l && this.f16364n == 0;
    }
}
