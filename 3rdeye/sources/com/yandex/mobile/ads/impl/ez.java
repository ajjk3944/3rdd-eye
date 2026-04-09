package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.pi;
import com.yandex.mobile.ads.impl.uc1;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ez implements pi, q62 {

    /* renamed from: n, reason: collision with root package name */
    public static final xj0<Long> f27099n = xj0.a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: o, reason: collision with root package name */
    public static final xj0<Long> f27100o = xj0.a(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: p, reason: collision with root package name */
    public static final xj0<Long> f27101p = xj0.a(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q, reason: collision with root package name */
    public static final xj0<Long> f27102q = xj0.a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: r, reason: collision with root package name */
    public static final xj0<Long> f27103r = xj0.a(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: s, reason: collision with root package name */
    public static final xj0<Long> f27104s = xj0.a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: t, reason: collision with root package name */
    private static ez f27105t;

    /* renamed from: a, reason: collision with root package name */
    private final yj0<Integer, Long> f27106a;

    /* renamed from: b, reason: collision with root package name */
    private final pi.a.C0415a f27107b = new pi.a.C0415a();

    /* renamed from: c, reason: collision with root package name */
    private final vz1 f27108c;

    /* renamed from: d, reason: collision with root package name */
    private final dp f27109d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f27110e;

    /* renamed from: f, reason: collision with root package name */
    private int f27111f;

    /* renamed from: g, reason: collision with root package name */
    private long f27112g;

    /* renamed from: h, reason: collision with root package name */
    private long f27113h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private long f27114j;

    /* renamed from: k, reason: collision with root package name */
    private long f27115k;

    /* renamed from: l, reason: collision with root package name */
    private long f27116l;

    /* renamed from: m, reason: collision with root package name */
    private long f27117m;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static HashMap a(String str) {
            int[] iArrA = ez.a(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            xj0<Long> xj0Var = ez.f27099n;
            map.put(2, xj0Var.get(iArrA[0]));
            map.put(3, ez.f27100o.get(iArrA[1]));
            map.put(4, ez.f27101p.get(iArrA[2]));
            map.put(5, ez.f27102q.get(iArrA[3]));
            map.put(10, ez.f27103r.get(iArrA[4]));
            map.put(9, ez.f27104s.get(iArrA[5]));
            map.put(7, xj0Var.get(iArrA[0]));
            return map;
        }
    }

    private ez(Context context, HashMap map, int i, m32 m32Var, boolean z10) {
        this.f27106a = yj0.a(map);
        this.f27108c = new vz1(i);
        this.f27109d = m32Var;
        this.f27110e = z10;
        if (context == null) {
            this.i = 0;
            this.f27116l = a(0);
            return;
        }
        uc1 uc1VarA = uc1.a(context);
        int iA = uc1VarA.a();
        this.i = iA;
        this.f27116l = a(iA);
        uc1VarA.b(new uc1.b() { // from class: com.yandex.mobile.ads.impl.F0
            @Override // com.yandex.mobile.ads.impl.uc1.b
            public final void a(int i10) {
                this.f24107a.b(i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i) {
        int i10 = this.i;
        if (i10 == 0 || this.f27110e) {
            if (i10 == i) {
                return;
            }
            this.i = i;
            if (i != 1 && i != 0 && i != 8) {
                this.f27116l = a(i);
                long jB = this.f27109d.b();
                int i11 = this.f27111f > 0 ? (int) (jB - this.f27112g) : 0;
                long j4 = this.f27113h;
                long j10 = this.f27116l;
                if (i11 != 0 || j4 != 0 || j10 != this.f27117m) {
                    this.f27117m = j10;
                    this.f27107b.a(i11, j4, j10);
                }
                this.f27112g = jB;
                this.f27113h = 0L;
                this.f27115k = 0L;
                this.f27114j = 0L;
                this.f27108c.b();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.pi
    public final ez a() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.pi
    public final void a(Handler handler, xc xcVar) {
        xcVar.getClass();
        this.f27107b.a(handler, xcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ez.a(java.lang.String):int[]");
    }

    @Override // com.yandex.mobile.ads.impl.q62
    public final synchronized void b(sv svVar, boolean z10) {
        if (z10) {
            try {
                if ((svVar.i & 8) != 8) {
                    if (this.f27111f == 0) {
                        this.f27112g = this.f27109d.b();
                    }
                    this.f27111f++;
                }
            } finally {
            }
        }
    }

    private long a(int i) {
        Long l5 = this.f27106a.get(Integer.valueOf(i));
        if (l5 == null) {
            l5 = this.f27106a.get(0);
        }
        if (l5 == null) {
            l5 = 1000000L;
        }
        return l5.longValue();
    }

    @Override // com.yandex.mobile.ads.impl.q62
    public final synchronized void a(sv svVar, boolean z10, int i) {
        if (z10) {
            if ((svVar.i & 8) != 8) {
                this.f27113h += i;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.q62
    public final synchronized void a(sv svVar, boolean z10) {
        if (z10) {
            try {
                if ((svVar.i & 8) != 8) {
                    if (this.f27111f > 0) {
                        long jB = this.f27109d.b();
                        int i = (int) (jB - this.f27112g);
                        this.f27114j += i;
                        long j4 = this.f27115k;
                        long j10 = this.f27113h;
                        this.f27115k = j4 + j10;
                        if (i > 0) {
                            this.f27108c.a((int) Math.sqrt(j10), (j10 * 8000.0f) / i);
                            if (this.f27114j >= 2000 || this.f27115k >= 524288) {
                                this.f27116l = (long) this.f27108c.a();
                            }
                            long j11 = this.f27113h;
                            long j12 = this.f27116l;
                            if (i != 0 || j11 != 0 || j12 != this.f27117m) {
                                this.f27117m = j12;
                                this.f27107b.a(i, j11, j12);
                            }
                            this.f27112g = jB;
                            this.f27113h = 0L;
                        }
                        this.f27111f--;
                        return;
                    }
                    throw new IllegalStateException();
                }
            } finally {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.pi
    public final void a(xc xcVar) {
        this.f27107b.a(xcVar);
    }

    public static synchronized ez a(Context context) {
        try {
            if (f27105t == null) {
                f27105t = new ez(context == null ? null : context.getApplicationContext(), a.a(s82.b(context)), 2000, dp.f26283a, true);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27105t;
    }
}
