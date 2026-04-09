package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.et1;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.n52;
import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.sv;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.ur0;
import com.yandex.mobile.ads.impl.zh0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class yl1 implements dw0, w70, ur0.a<a>, ur0.e, et1.c {

    /* renamed from: N, reason: collision with root package name */
    private static final Map<String, String> f35856N;

    /* renamed from: O, reason: collision with root package name */
    private static final dc0 f35857O;

    /* renamed from: B, reason: collision with root package name */
    private boolean f35859B;

    /* renamed from: D, reason: collision with root package name */
    private boolean f35861D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f35862E;

    /* renamed from: F, reason: collision with root package name */
    private int f35863F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f35864G;

    /* renamed from: H, reason: collision with root package name */
    private long f35865H;

    /* renamed from: J, reason: collision with root package name */
    private boolean f35867J;

    /* renamed from: K, reason: collision with root package name */
    private int f35868K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f35869L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f35870M;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f35871b;

    /* renamed from: c, reason: collision with root package name */
    private final ov f35872c;

    /* renamed from: d, reason: collision with root package name */
    private final d40 f35873d;

    /* renamed from: e, reason: collision with root package name */
    private final qr0 f35874e;

    /* renamed from: f, reason: collision with root package name */
    private final kw0.a f35875f;

    /* renamed from: g, reason: collision with root package name */
    private final c40.a f35876g;

    /* renamed from: h, reason: collision with root package name */
    private final b f35877h;
    private final vc i;

    /* renamed from: j, reason: collision with root package name */
    private final String f35878j;

    /* renamed from: k, reason: collision with root package name */
    private final long f35879k;

    /* renamed from: m, reason: collision with root package name */
    private final xl1 f35881m;

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f35883o;

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f35884p;

    /* renamed from: r, reason: collision with root package name */
    private dw0.a f35886r;

    /* renamed from: s, reason: collision with root package name */
    private bi0 f35887s;

    /* renamed from: v, reason: collision with root package name */
    private boolean f35890v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f35891w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f35892x;

    /* renamed from: y, reason: collision with root package name */
    private e f35893y;

    /* renamed from: z, reason: collision with root package name */
    private tw1 f35894z;

    /* renamed from: l, reason: collision with root package name */
    private final ur0 f35880l = new ur0("ProgressiveMediaPeriod");

    /* renamed from: n, reason: collision with root package name */
    private final cr f35882n = new cr();

    /* renamed from: q, reason: collision with root package name */
    private final Handler f35885q = s82.a();

    /* renamed from: u, reason: collision with root package name */
    private d[] f35889u = new d[0];

    /* renamed from: t, reason: collision with root package name */
    private et1[] f35888t = new et1[0];

    /* renamed from: I, reason: collision with root package name */
    private long f35866I = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    private long f35858A = -9223372036854775807L;

    /* renamed from: C, reason: collision with root package name */
    private int f35860C = 1;

    public final class a implements ur0.d, zh0.a {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f35895a;

        /* renamed from: b, reason: collision with root package name */
        private final g22 f35896b;

        /* renamed from: c, reason: collision with root package name */
        private final xl1 f35897c;

        /* renamed from: d, reason: collision with root package name */
        private final w70 f35898d;

        /* renamed from: e, reason: collision with root package name */
        private final cr f35899e;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f35901g;
        private long i;

        /* renamed from: j, reason: collision with root package name */
        private sv f35903j;

        /* renamed from: k, reason: collision with root package name */
        private et1 f35904k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f35905l;

        /* renamed from: f, reason: collision with root package name */
        private final jj1 f35900f = new jj1();

        /* renamed from: h, reason: collision with root package name */
        private boolean f35902h = true;

        public a(Uri uri, ov ovVar, xl1 xl1Var, w70 w70Var, cr crVar) {
            this.f35895a = uri;
            this.f35896b = new g22(ovVar);
            this.f35897c = xl1Var;
            this.f35898d = w70Var;
            this.f35899e = crVar;
            rr0.a();
            this.f35903j = a(0L);
        }

        @Override // com.yandex.mobile.ads.impl.ur0.d
        public final void a() throws IOException {
            ov zh0Var;
            int i;
            int iA = 0;
            while (iA == 0 && !this.f35901g) {
                try {
                    long j4 = this.f35900f.f29169a;
                    sv svVarA = a(j4);
                    this.f35903j = svVarA;
                    long jA = this.f35896b.a(svVarA);
                    if (jA != -1) {
                        jA += j4;
                        yl1.this.g();
                    }
                    long j10 = jA;
                    yl1.this.f35887s = bi0.a(this.f35896b.getResponseHeaders());
                    g22 g22Var = this.f35896b;
                    bi0 bi0Var = yl1.this.f35887s;
                    if (bi0Var == null || (i = bi0Var.f25284g) == -1) {
                        zh0Var = g22Var;
                    } else {
                        zh0Var = new zh0(g22Var, i, this);
                        yl1 yl1Var = yl1.this;
                        yl1Var.getClass();
                        et1 et1VarA = yl1Var.a(new d(true, 0));
                        this.f35904k = et1VarA;
                        et1VarA.a(yl1.f35857O);
                    }
                    ((hm) this.f35897c).a(zh0Var, this.f35895a, this.f35896b.getResponseHeaders(), j4, j10, this.f35898d);
                    if (yl1.this.f35887s != null) {
                        ((hm) this.f35897c).a();
                    }
                    if (this.f35902h) {
                        ((hm) this.f35897c).a(j4, this.i);
                        this.f35902h = false;
                    }
                    while (iA == 0 && !this.f35901g) {
                        try {
                            this.f35899e.a();
                            iA = ((hm) this.f35897c).a(this.f35900f);
                            long jB = ((hm) this.f35897c).b();
                            if (jB > yl1.this.f35879k + j4) {
                                this.f35899e.c();
                                yl1 yl1Var2 = yl1.this;
                                yl1Var2.f35885q.post(yl1Var2.f35884p);
                                j4 = jB;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else if (((hm) this.f35897c).b() != -1) {
                        this.f35900f.f29169a = ((hm) this.f35897c).b();
                    }
                    rv.a(this.f35896b);
                } catch (Throwable th) {
                    if (iA != 1 && ((hm) this.f35897c).b() != -1) {
                        this.f35900f.f29169a = ((hm) this.f35897c).b();
                    }
                    rv.a(this.f35896b);
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.ur0.d
        public final void b() {
            this.f35901g = true;
        }

        public final void a(uf1 uf1Var) {
            long jMax;
            if (!this.f35905l) {
                jMax = this.i;
            } else {
                jMax = Math.max(yl1.u(yl1.this), this.i);
            }
            long j4 = jMax;
            int iA = uf1Var.a();
            et1 et1Var = this.f35904k;
            et1Var.getClass();
            et1Var.b(iA, uf1Var);
            et1Var.a(j4, 1, iA, 0, (n52.a) null);
            this.f35905l = true;
        }

        private sv a(long j4) {
            return new sv.a().a(this.f35895a).b(j4).a(yl1.this.f35878j).a(6).a(yl1.f35856N).a();
        }
    }

    public interface b {
    }

    public final class c implements ft1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f35907a;

        public c(int i) {
            this.f35907a = i;
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final boolean d() {
            yl1 yl1Var = yl1.this;
            return !yl1Var.f35862E && yl1Var.f35866I == -9223372036854775807L && yl1Var.f35888t[this.f35907a].a(yl1Var.f35869L);
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final void a() throws IOException {
            yl1 yl1Var = yl1.this;
            yl1Var.f35888t[this.f35907a].g();
            yl1Var.f35880l.a(yl1Var.f35874e.a(yl1Var.f35860C));
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final int a(ec0 ec0Var, my myVar, int i) {
            yl1 yl1Var = yl1.this;
            int i10 = this.f35907a;
            if (yl1Var.f35862E || yl1Var.f35866I != -9223372036854775807L) {
                return -3;
            }
            yl1Var.c();
            e eVar = yl1Var.f35893y;
            boolean[] zArr = eVar.f35914d;
            if (!zArr[i10]) {
                dc0 dc0VarA = eVar.f35911a.a(i10).a(0);
                yl1Var.f35875f.a(k01.c(dc0VarA.f26083m), dc0VarA, yl1Var.f35865H);
                zArr[i10] = true;
            }
            int iA = yl1Var.f35888t[i10].a(ec0Var, myVar, i, yl1Var.f35869L);
            if (iA == -3) {
                yl1Var.a(i10);
            }
            return iA;
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final int a(long j4) {
            yl1 yl1Var = yl1.this;
            int i = this.f35907a;
            if (yl1Var.f35862E || yl1Var.f35866I != -9223372036854775807L) {
                return 0;
            }
            yl1Var.c();
            e eVar = yl1Var.f35893y;
            boolean[] zArr = eVar.f35914d;
            if (!zArr[i]) {
                dc0 dc0VarA = eVar.f35911a.a(i).a(0);
                yl1Var.f35875f.a(k01.c(dc0VarA.f26083m), dc0VarA, yl1Var.f35865H);
                zArr[i] = true;
            }
            et1 et1Var = yl1Var.f35888t[i];
            int iA = et1Var.a(j4, yl1Var.f35869L);
            et1Var.d(iA);
            if (iA == 0) {
                yl1Var.a(i);
            }
            return iA;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f35909a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35910b;

        public d(boolean z10, int i) {
            this.f35909a = i;
            this.f35910b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f35909a == dVar.f35909a && this.f35910b == dVar.f35910b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f35909a * 31) + (this.f35910b ? 1 : 0);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final m52 f35911a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f35912b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f35913c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f35914d;

        public e(m52 m52Var, boolean[] zArr) {
            this.f35911a = m52Var;
            this.f35912b = zArr;
            int i = m52Var.f30221b;
            this.f35913c = new boolean[i];
            this.f35914d = new boolean[i];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f35856N = Collections.unmodifiableMap(map);
        f35857O = new dc0.a().b("icy").e("application/x-icy").a();
    }

    public yl1(Uri uri, ov ovVar, xl1 xl1Var, d40 d40Var, c40.a aVar, qr0 qr0Var, kw0.a aVar2, b bVar, vc vcVar, String str, int i) {
        this.f35871b = uri;
        this.f35872c = ovVar;
        this.f35873d = d40Var;
        this.f35876g = aVar;
        this.f35874e = qr0Var;
        this.f35875f = aVar2;
        this.f35877h = bVar;
        this.i = vcVar;
        this.f35878j = str;
        this.f35879k = i;
        this.f35881m = xl1Var;
        int i10 = 2;
        this.f35883o = new N(this, i10);
        this.f35884p = new P0(this, i10);
    }

    public static /* bridge */ /* synthetic */ long u(yl1 yl1Var) {
        return yl1Var.a(true);
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean continueLoading(long j4) {
        if (this.f35869L || this.f35880l.c() || this.f35867J) {
            return false;
        }
        if (this.f35891w && this.f35863F == 0) {
            return false;
        }
        boolean zE = this.f35882n.e();
        if (this.f35880l.d()) {
            return zE;
        }
        j();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void discardBuffer(long j4, boolean z10) {
        c();
        if (this.f35866I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f35893y.f35913c;
        int length = this.f35888t.length;
        for (int i = 0; i < length; i++) {
            this.f35888t[i].a(j4, z10, zArr[i]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getBufferedPositionUs() {
        long jA;
        c();
        if (this.f35869L || this.f35863F == 0) {
            return Long.MIN_VALUE;
        }
        long j4 = this.f35866I;
        if (j4 != -9223372036854775807L) {
            return j4;
        }
        if (this.f35892x) {
            int length = this.f35888t.length;
            jA = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e eVar = this.f35893y;
                if (eVar.f35912b[i] && eVar.f35913c[i] && !this.f35888t[i].f()) {
                    jA = Math.min(jA, this.f35888t[i].b());
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = a(false);
        }
        return jA == Long.MIN_VALUE ? this.f35865H : jA;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final m52 getTrackGroups() {
        c();
        return this.f35893y.f35911a;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean isLoading() {
        return this.f35880l.d() && this.f35882n.d();
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void maybeThrowPrepareError() throws IOException {
        this.f35880l.a(this.f35874e.a(this.f35860C));
        if (this.f35869L && !this.f35891w) {
            throw yf1.a("Loading finished before preparation is complete.", (Exception) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final long readDiscontinuity() {
        if (!this.f35862E) {
            return -9223372036854775807L;
        }
        if (!this.f35869L) {
            int iE = 0;
            for (et1 et1Var : this.f35888t) {
                iE += et1Var.e();
            }
            if (iE <= this.f35868K) {
                return -9223372036854775807L;
            }
        }
        this.f35862E = false;
        return this.f35865H;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    @Override // com.yandex.mobile.ads.impl.dw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r7) {
        /*
            r6 = this;
            r6.c()
            com.yandex.mobile.ads.impl.yl1$e r0 = r6.f35893y
            boolean[] r0 = r0.f35912b
            com.yandex.mobile.ads.impl.tw1 r1 = r6.f35894z
            boolean r1 = r1.b()
            if (r1 == 0) goto L10
            goto L12
        L10:
            r7 = 0
        L12:
            r1 = 0
            r6.f35862E = r1
            r6.f35865H = r7
            long r2 = r6.f35866I
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            r6.f35866I = r7
            return r7
        L25:
            int r2 = r6.f35860C
            r3 = 7
            if (r2 == r3) goto L46
            com.yandex.mobile.ads.impl.et1[] r2 = r6.f35888t
            int r2 = r2.length
            r3 = r1
        L2e:
            if (r3 >= r2) goto L7a
            com.yandex.mobile.ads.impl.et1[] r4 = r6.f35888t
            r4 = r4[r3]
            boolean r4 = r4.b(r7, r1)
            if (r4 != 0) goto L43
            boolean r4 = r0[r3]
            if (r4 != 0) goto L46
            boolean r4 = r6.f35892x
            if (r4 != 0) goto L43
            goto L46
        L43:
            int r3 = r3 + 1
            goto L2e
        L46:
            r6.f35867J = r1
            r6.f35866I = r7
            r6.f35869L = r1
            com.yandex.mobile.ads.impl.ur0 r0 = r6.f35880l
            boolean r0 = r0.d()
            if (r0 == 0) goto L67
            com.yandex.mobile.ads.impl.et1[] r0 = r6.f35888t
            int r2 = r0.length
        L57:
            if (r1 >= r2) goto L61
            r3 = r0[r1]
            r3.a()
            int r1 = r1 + 1
            goto L57
        L61:
            com.yandex.mobile.ads.impl.ur0 r0 = r6.f35880l
            r0.a()
            return r7
        L67:
            com.yandex.mobile.ads.impl.ur0 r0 = r6.f35880l
            r0.b()
            com.yandex.mobile.ads.impl.et1[] r0 = r6.f35888t
            int r2 = r0.length
            r3 = r1
        L70:
            if (r3 >= r2) goto L7a
            r4 = r0[r3]
            r4.b(r1)
            int r3 = r3 + 1
            goto L70
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yl1.seekToUs(long):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(tw1 tw1Var) {
        this.f35894z = this.f35887s == null ? tw1Var : new tw1.b(-9223372036854775807L, 0L);
        this.f35858A = tw1Var.c();
        boolean z10 = !this.f35864G && tw1Var.c() == -9223372036854775807L;
        this.f35859B = z10;
        this.f35860C = z10 ? 7 : 1;
        ((am1) this.f35877h).a(this.f35858A, tw1Var.b(), this.f35859B);
        if (this.f35891w) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!this.f35891w) {
            throw new IllegalStateException();
        }
        this.f35893y.getClass();
        this.f35894z.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f35870M) {
            return;
        }
        dw0.a aVar = this.f35886r;
        aVar.getClass();
        aVar.a((dw0.a) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f35864G = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f35870M || this.f35891w || !this.f35890v || this.f35894z == null) {
            return;
        }
        for (et1 et1Var : this.f35888t) {
            if (et1Var.d() == null) {
                return;
            }
        }
        this.f35882n.c();
        int length = this.f35888t.length;
        l52[] l52VarArr = new l52[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            dc0 dc0VarD = this.f35888t[i].d();
            dc0VarD.getClass();
            String str = dc0VarD.f26083m;
            boolean zD = k01.d(str);
            boolean z10 = zD || k01.f(str);
            zArr[i] = z10;
            this.f35892x = z10 | this.f35892x;
            bi0 bi0Var = this.f35887s;
            if (bi0Var != null) {
                if (zD || this.f35889u[i].f35910b) {
                    yz0 yz0Var = dc0VarD.f26081k;
                    dc0VarD = dc0VarD.a().a(yz0Var == null ? new yz0(bi0Var) : yz0Var.a(bi0Var)).a();
                }
                if (zD && dc0VarD.f26078g == -1 && dc0VarD.f26079h == -1 && bi0Var.f25279b != -1) {
                    dc0VarD = dc0VarD.a().b(bi0Var.f25279b).a();
                }
            }
            l52VarArr[i] = new l52(Integer.toString(i), dc0VarD.a(this.f35873d.a(dc0VarD)));
        }
        this.f35893y = new e(new m52(l52VarArr), zArr);
        this.f35891w = true;
        dw0.a aVar = this.f35886r;
        aVar.getClass();
        aVar.a((dw0) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f35885q.post(new J2(this, 2));
    }

    private void j() {
        a aVar = new a(this.f35871b, this.f35872c, this.f35881m, this, this.f35882n);
        if (this.f35891w) {
            long j4 = this.f35866I;
            if (j4 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j10 = this.f35858A;
            if (j10 != -9223372036854775807L && j4 > j10) {
                this.f35869L = true;
                this.f35866I = -9223372036854775807L;
                return;
            }
            tw1 tw1Var = this.f35894z;
            tw1Var.getClass();
            long j11 = tw1Var.b(this.f35866I).f33791a.f34728b;
            long j12 = this.f35866I;
            aVar.f35900f.f29169a = j11;
            aVar.i = j12;
            aVar.f35902h = true;
            aVar.f35905l = false;
            for (et1 et1Var : this.f35888t) {
                et1Var.a(this.f35866I);
            }
            this.f35866I = -9223372036854775807L;
        }
        int iE = 0;
        for (et1 et1Var2 : this.f35888t) {
            iE += et1Var2.e();
        }
        this.f35868K = iE;
        this.f35880l.a(aVar, this, this.f35874e.a(this.f35860C));
        sv svVar = aVar.f35903j;
        kw0.a aVar2 = this.f35875f;
        Uri uri = svVar.f33250a;
        aVar2.b(new rr0(), null, aVar.i, this.f35858A);
    }

    @Override // com.yandex.mobile.ads.impl.w70
    public final void a() {
        this.f35890v = true;
        this.f35885q.post(this.f35883o);
    }

    public final void h() {
        this.f35885q.post(this.f35883o);
    }

    public final void i() {
        if (this.f35891w) {
            for (et1 et1Var : this.f35888t) {
                et1Var.h();
            }
        }
        this.f35880l.a(this);
        this.f35885q.removeCallbacksAndMessages(null);
        this.f35886r = null;
        this.f35870M = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    @Override // com.yandex.mobile.ads.impl.dw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r18, com.yandex.mobile.ads.impl.uw1 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r0.c()
            com.yandex.mobile.ads.impl.tw1 r4 = r0.f35894z
            boolean r4 = r4.b()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.yandex.mobile.ads.impl.tw1 r4 = r0.f35894z
            com.yandex.mobile.ads.impl.tw1$a r4 = r4.b(r1)
            com.yandex.mobile.ads.impl.vw1 r7 = r4.f33791a
            long r7 = r7.f34727a
            com.yandex.mobile.ads.impl.vw1 r4 = r4.f33792b
            long r9 = r4.f34727a
            long r11 = r3.f34232a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r13 = r3.f34233b
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L2f
            return r1
        L2f:
            int r4 = com.yandex.mobile.ads.impl.s82.f32899a
            long r13 = r1 - r11
            long r11 = r11 ^ r1
            long r15 = r1 ^ r13
            long r11 = r11 & r15
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L3d
            r13 = -9223372036854775808
        L3d:
            long r3 = r3.f34233b
            long r11 = r1 + r3
            long r15 = r1 ^ r11
            long r3 = r3 ^ r11
            long r3 = r3 & r15
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L4e
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4e:
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 > 0) goto L5a
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 > 0) goto L5a
            r3 = r5
            goto L5b
        L5a:
            r3 = r4
        L5b:
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 > 0) goto L64
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L64
            r4 = r5
        L64:
            if (r3 == 0) goto L79
            if (r4 == 0) goto L79
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L7e
            goto L7b
        L79:
            if (r3 == 0) goto L7c
        L7b:
            return r7
        L7c:
            if (r4 == 0) goto L7f
        L7e:
            return r9
        L7f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yl1.a(long, com.yandex.mobile.ads.impl.uw1):long");
    }

    @Override // com.yandex.mobile.ads.impl.ur0.e
    public final void b() {
        for (et1 et1Var : this.f35888t) {
            et1Var.i();
        }
        ((hm) this.f35881m).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long a(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            com.yandex.mobile.ads.impl.et1[] r3 = r5.f35888t
            int r3 = r3.length
            if (r2 >= r3) goto L24
            if (r6 != 0) goto L15
            com.yandex.mobile.ads.impl.yl1$e r3 = r5.f35893y
            r3.getClass()
            boolean[] r3 = r3.f35913c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            com.yandex.mobile.ads.impl.et1[] r3 = r5.f35888t
            r3 = r3[r2]
            long r3 = r3.b()
            long r0 = java.lang.Math.max(r0, r3)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yl1.a(boolean):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        c();
        boolean[] zArr = this.f35893y.f35912b;
        if (this.f35867J && zArr[i] && !this.f35888t[i].a(false)) {
            this.f35866I = 0L;
            this.f35867J = false;
            this.f35862E = true;
            this.f35865H = 0L;
            this.f35868K = 0;
            for (et1 et1Var : this.f35888t) {
                et1Var.b(false);
            }
            dw0.a aVar = this.f35886r;
            aVar.getClass();
            aVar.a((dw0.a) this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ur0.a
    public final void a(ur0.d dVar, long j4, long j10, boolean z10) {
        a aVar = (a) dVar;
        aVar.f35896b.getClass();
        rr0 rr0Var = new rr0();
        this.f35874e.getClass();
        this.f35875f.a(rr0Var, aVar.i, this.f35858A);
        if (z10) {
            return;
        }
        for (et1 et1Var : this.f35888t) {
            et1Var.b(false);
        }
        if (this.f35863F > 0) {
            dw0.a aVar2 = this.f35886r;
            aVar2.getClass();
            aVar2.a((dw0.a) this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final void reevaluateBuffer(long j4) {
    }

    @Override // com.yandex.mobile.ads.impl.ur0.a
    public final void a(ur0.d dVar, long j4, long j10) {
        tw1 tw1Var;
        a aVar = (a) dVar;
        if (this.f35858A == -9223372036854775807L && (tw1Var = this.f35894z) != null) {
            boolean zB = tw1Var.b();
            long jA = a(true);
            long j11 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.f35858A = j11;
            ((am1) this.f35877h).a(j11, zB, this.f35859B);
        }
        aVar.f35896b.getClass();
        rr0 rr0Var = new rr0();
        this.f35874e.getClass();
        this.f35875f.a(rr0Var, (dc0) null, aVar.i, this.f35858A);
        this.f35869L = true;
        dw0.a aVar2 = this.f35886r;
        aVar2.getClass();
        aVar2.a((dw0.a) this);
    }

    @Override // com.yandex.mobile.ads.impl.ur0.a
    public final ur0.b a(ur0.d dVar, long j4, long j10, IOException iOException, int i) {
        ur0.b bVarA;
        tw1 tw1Var;
        a aVar = (a) dVar;
        aVar.f35896b.getClass();
        rr0 rr0Var = new rr0();
        s82.b(aVar.i);
        s82.b(this.f35858A);
        long jA = this.f35874e.a(new qr0.a(iOException, i));
        if (jA == -9223372036854775807L) {
            bVarA = ur0.f34191e;
        } else {
            int iE = 0;
            for (et1 et1Var : this.f35888t) {
                iE += et1Var.e();
            }
            boolean z10 = iE > this.f35868K;
            if (!this.f35864G && ((tw1Var = this.f35894z) == null || tw1Var.c() == -9223372036854775807L)) {
                boolean z11 = this.f35891w;
                if (z11 && !this.f35862E && this.f35866I == -9223372036854775807L) {
                    this.f35867J = true;
                    bVarA = ur0.f34190d;
                } else {
                    this.f35862E = z11;
                    this.f35865H = 0L;
                    this.f35868K = 0;
                    for (et1 et1Var2 : this.f35888t) {
                        et1Var2.b(false);
                    }
                    aVar.f35900f.f29169a = 0L;
                    aVar.i = 0L;
                    aVar.f35902h = true;
                    aVar.f35905l = false;
                }
            } else {
                this.f35868K = iE;
            }
            bVarA = ur0.a(jA, z10);
        }
        boolean zA = bVarA.a();
        this.f35875f.a(rr0Var, 1, null, aVar.i, this.f35858A, iOException, !zA);
        if (!zA) {
            this.f35874e.getClass();
        }
        return bVarA;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(dw0.a aVar, long j4) {
        this.f35886r = aVar;
        this.f35882n.e();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public et1 a(d dVar) {
        int length = this.f35888t.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f35889u[i])) {
                return this.f35888t[i];
            }
        }
        vc vcVar = this.i;
        d40 d40Var = this.f35873d;
        c40.a aVar = this.f35876g;
        d40Var.getClass();
        aVar.getClass();
        et1 et1Var = new et1(vcVar, d40Var, aVar);
        et1Var.a(this);
        int i10 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f35889u, i10);
        dVarArr[length] = dVar;
        this.f35889u = dVarArr;
        et1[] et1VarArr = (et1[]) Arrays.copyOf(this.f35888t, i10);
        et1VarArr[length] = et1Var;
        this.f35888t = et1VarArr;
        return et1Var;
    }

    @Override // com.yandex.mobile.ads.impl.w70
    public final void a(tw1 tw1Var) {
        this.f35885q.post(new L4(0, this, tw1Var));
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final long a(c70[] c70VarArr, boolean[] zArr, ft1[] ft1VarArr, boolean[] zArr2, long j4) {
        c70 c70Var;
        c();
        e eVar = this.f35893y;
        m52 m52Var = eVar.f35911a;
        boolean[] zArr3 = eVar.f35913c;
        int i = this.f35863F;
        int i10 = 0;
        for (int i11 = 0; i11 < c70VarArr.length; i11++) {
            ft1 ft1Var = ft1VarArr[i11];
            if (ft1Var != null && (c70VarArr[i11] == null || !zArr[i11])) {
                int i12 = ((c) ft1Var).f35907a;
                if (zArr3[i12]) {
                    this.f35863F--;
                    zArr3[i12] = false;
                    ft1VarArr[i11] = null;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        boolean z10 = !this.f35861D ? j4 == 0 : i != 0;
        for (int i13 = 0; i13 < c70VarArr.length; i13++) {
            if (ft1VarArr[i13] == null && (c70Var = c70VarArr[i13]) != null) {
                if (c70Var.b() == 1) {
                    if (c70Var.b(0) == 0) {
                        int iA = m52Var.a(c70Var.a());
                        if (!zArr3[iA]) {
                            this.f35863F++;
                            zArr3[iA] = true;
                            ft1VarArr[i13] = new c(iA);
                            zArr2[i13] = true;
                            if (!z10) {
                                et1 et1Var = this.f35888t[iA];
                                z10 = (et1Var.b(j4, true) || et1Var.c() == 0) ? false : true;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        if (this.f35863F == 0) {
            this.f35867J = false;
            this.f35862E = false;
            if (this.f35880l.d()) {
                et1[] et1VarArr = this.f35888t;
                int length = et1VarArr.length;
                while (i10 < length) {
                    et1VarArr[i10].a();
                    i10++;
                }
                this.f35880l.a();
            } else {
                for (et1 et1Var2 : this.f35888t) {
                    et1Var2.b(false);
                }
            }
        } else if (z10) {
            j4 = seekToUs(j4);
            while (i10 < ft1VarArr.length) {
                if (ft1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f35861D = true;
        return j4;
    }

    @Override // com.yandex.mobile.ads.impl.w70
    public final n52 a(int i, int i10) {
        return a(new d(false, i));
    }
}
