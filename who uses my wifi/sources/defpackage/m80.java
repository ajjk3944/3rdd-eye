package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m80 {
    public static final ArrayList A;
    public static final HashMap B;
    public static final int C;
    public static final j10 D;
    public static final i80 y = k80.d(m80.class);
    public static final wt z;
    public vp0 a;
    public final ArrayList b;
    public final int c;
    public tc d;
    public boolean e;
    public final int f;
    public final gg0 g;
    public final int h;
    public final int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ArrayList n;
    public tn0[] o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final int w;
    public final j10 x;

    static {
        synchronized (m80.class) {
            z = new wt();
            A = wp0.a().b;
            B = new HashMap();
            C = wp0.a().c;
            D = new j10();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m80(defpackage.gg0 r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 12
            defpackage.k31.a(r0)
            r1 = 1
            defpackage.yl.a(r1)
            r4.g = r5
            r4.h = r0
            r4.i = r1
            java.lang.Class<m80> r5 = defpackage.m80.class
            monitor-enter(r5)
            java.lang.Class<m80> r0 = defpackage.m80.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L7d
            wt r2 = defpackage.m80.z     // Catch: java.lang.Throwable -> L84
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            r4.a = r2     // Catch: java.lang.Throwable -> L7d
            java.lang.Class<m80> r0 = defpackage.m80.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r2 = defpackage.m80.A     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            r4.b = r2     // Catch: java.lang.Throwable -> L7d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.Class<m80> r2 = defpackage.m80.class
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7d
            defpackage.yl.a(r1)     // Catch: java.lang.Throwable -> L44
            java.util.HashMap r3 = defpackage.m80.B     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L44
            tc r3 = (defpackage.tc) r3     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L46
            tc r3 = new tc     // Catch: java.lang.Throwable -> L44
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L44
            java.util.HashMap r1 = defpackage.m80.B     // Catch: java.lang.Throwable -> L44
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r0 = move-exception
            goto L7f
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            r4.d = r3     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            int r5 = defpackage.m80.C
            r4.c = r5
            r5 = 3
            r4.f = r5
            r5 = -1
            r4.p = r5
            java.lang.String r5 = "dnsjava.lookup.max_iterations"
            java.lang.String r0 = "16"
            java.lang.String r5 = java.lang.System.getProperty(r5, r0)
            int r5 = java.lang.Integer.parseInt(r5)
            r4.w = r5
            java.lang.String r5 = "dnsjava.lookup.use_hosts_file"
            java.lang.String r0 = "true"
            java.lang.String r5 = java.lang.System.getProperty(r5, r0)
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L7c
            java.lang.Class<m80> r5 = defpackage.m80.class
            monitor-enter(r5)
            j10 r0 = defpackage.m80.D     // Catch: java.lang.Throwable -> L79
            monitor-exit(r5)
            r4.x = r0
            return
        L79:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            throw r0
        L7c:
            return
        L7d:
            r0 = move-exception
            goto L87
        L7f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L7d
        L81:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            throw r1     // Catch: java.lang.Throwable -> L7d
        L84:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L7d
        L87:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m80.<init>(gg0):void");
    }

    public final void a() {
        if (!this.l || this.p == -1) {
            StringBuilder sb = new StringBuilder("Lookup of " + this.g + " ");
            int i = this.i;
            if (i != 1) {
                sb.append(yl.a.e(i));
                sb.append(" ");
            }
            sb.append(k31.a.e(this.h));
            sb.append(" isn't done");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void b(gg0 gg0Var, gg0 gg0Var2) {
        this.k = true;
        this.r = false;
        this.s = false;
        this.t = false;
        this.q = false;
        this.v = false;
        int i = this.j + 1;
        this.j = i;
        if (i >= this.w || gg0Var.equals(gg0Var2)) {
            this.p = 1;
            this.l = true;
        } else {
            if (this.n == null) {
                this.n = new ArrayList();
            }
            this.n.add(gg0Var2);
            c(gg0Var);
        }
    }

    public final void c(gg0 gg0Var) {
        me0 me0VarJ;
        me0 me0Var;
        nu0 nu0VarG;
        long jMin;
        long jMin2;
        int i;
        int i2;
        gg0 gg0Var2;
        int i3 = this.h;
        j10 j10Var = this.x;
        int i4 = 0;
        if (j10Var != null && (i3 == 1 || i3 == 28)) {
            try {
                Optional optionalA = j10Var.a(gg0Var, i3);
                if (optionalA.isPresent()) {
                    this.p = 0;
                    this.l = true;
                    if (i3 == 1) {
                        int i5 = this.i;
                        InetAddress inetAddress = (InetAddress) optionalA.get();
                        f fVar = new f(gg0Var, 1, i5);
                        if (a30.d(inetAddress) != 1) {
                            throw new IllegalArgumentException("invalid IPv4 address");
                        }
                        fVar.k = f.q(inetAddress.getAddress());
                        this.o = new f[]{fVar};
                        return;
                    }
                    int i6 = this.i;
                    InetAddress inetAddress2 = (InetAddress) optionalA.get();
                    b bVar = new b(gg0Var, 28, i6);
                    if (a30.d(inetAddress2) != 1 && a30.d(inetAddress2) != 2) {
                        throw new IllegalArgumentException("invalid IPv4/IPv6 address");
                    }
                    bVar.k = inetAddress2.getAddress();
                    this.o = new b[]{bVar};
                    return;
                }
            } catch (IOException e) {
                y.t(e);
            }
        }
        nu0 nu0VarG2 = this.d.g(gg0Var, this.h, this.f);
        y.e("Lookup for {}/{}, cache answer: {}", gg0Var, k31.a.e(this.h), nu0VarG2);
        d(gg0Var, nu0VarG2);
        if (this.l || this.m) {
            return;
        }
        tn0 tn0VarI = tn0.i(gg0Var, this.h, this.i, 0L);
        me0 me0Var2 = new me0();
        me0Var2.f.e();
        l00 l00Var = me0Var2.f;
        l00Var.getClass();
        l00.a(7);
        int i7 = l00Var.g;
        l00.a(7);
        l00Var.g = i7 | 256;
        me0Var2.b(tn0VarI, 0);
        try {
            me0 me0VarC = this.a.c(me0Var2);
            me0VarC.getClass();
            try {
                me0VarJ = me0VarC.j(me0Var2);
            } catch (t91 unused) {
                me0VarJ = null;
            }
            int i8 = me0VarJ.f.g & 15;
            if (i8 != 0 && i8 != 3) {
                this.r = true;
                pn0.a.e(i8);
                return;
            }
            if (!me0Var2.e().equals(me0VarJ.e())) {
                this.r = true;
                return;
            }
            tc tcVar = this.d;
            tcVar.getClass();
            boolean zC = l00.c(me0VarJ.f.g, 5);
            boolean zC2 = l00.c(me0VarJ.f.g, 10);
            tn0 tn0VarE = me0VarJ.e();
            int i9 = me0VarJ.f.g & 15;
            if ((i9 == 0 || i9 == 3) && tn0VarE != null) {
                gg0 gg0Var3 = tn0VarE.f;
                int i10 = tn0VarE.g;
                int i11 = tn0VarE.h;
                HashSet hashSet = new HashSet();
                List listG = me0VarJ.g(1);
                gg0 gg0VarI = gg0Var3;
                boolean z2 = false;
                nu0 nu0VarB = null;
                while (i4 < listG.size()) {
                    kn0 kn0Var = (kn0) listG.get(i4);
                    if (kn0Var.e().h != i11) {
                        i = i4;
                        i2 = i11;
                    } else {
                        int type = kn0Var.getType();
                        i = i4;
                        gg0 gg0Var4 = kn0Var.e().f;
                        i2 = i11;
                        int iF = tc.f(1, zC);
                        if ((type == i10 || i10 == 255) && gg0Var4.equals(gg0VarI)) {
                            tcVar.c(iF, kn0Var, zC2);
                            if (gg0VarI == gg0Var3) {
                                if (nu0VarB == null) {
                                    nu0VarB = nu0.b(7, null, false);
                                }
                                nu0 nu0Var = nu0VarB;
                                nu0Var.a(kn0Var);
                                nu0VarB = nu0Var;
                            }
                            tc.h(kn0Var, hashSet);
                            z2 = true;
                        } else if (type == 39 && gg0VarI.o(gg0Var4)) {
                            tcVar.c(iF, kn0Var, zC2);
                            if (gg0VarI == gg0Var3) {
                                nu0VarB = nu0.b(6, kn0Var, zC2);
                            }
                            int i12 = i + 1;
                            if (i12 < listG.size()) {
                                kn0 kn0Var2 = (kn0) listG.get(i12);
                                if (kn0Var2.getType() != 5 || !kn0Var2.e().f.equals(gg0VarI)) {
                                }
                            }
                            try {
                                gg0VarI = gg0VarI.i((bm) kn0Var.e());
                            } catch (hg0 unused2) {
                            }
                        } else if (type == 5 && gg0Var4.equals(gg0VarI)) {
                            tcVar.c(iF, kn0Var, zC2);
                            if (gg0VarI == gg0Var3) {
                                nu0VarB = nu0.b(5, kn0Var, zC2);
                            }
                            gg0VarI = ((oc) kn0Var.e()).k;
                        }
                        i4 = i + 1;
                        i11 = i2;
                    }
                    i4 = i + 1;
                    i11 = i2;
                }
                kn0 kn0Var3 = null;
                kn0 kn0Var4 = null;
                for (kn0 kn0Var5 : me0VarJ.g(2)) {
                    if (kn0Var5.getType() == 6 && gg0VarI.o(kn0Var5.e().f)) {
                        kn0Var4 = kn0Var5;
                    } else if (kn0Var5.getType() == 2 && gg0VarI.o(kn0Var5.e().f)) {
                        kn0Var3 = kn0Var5;
                    }
                }
                if (z2) {
                    me0Var = me0VarJ;
                    if (i9 == 0 && kn0Var3 != null) {
                        tcVar.c(tc.f(2, zC), kn0Var3, zC2);
                        tc.h(kn0Var3, hashSet);
                    }
                } else {
                    if (i9 == 3) {
                        i10 = 0;
                    }
                    if (i9 == 3 || kn0Var4 != null || kn0Var3 == null) {
                        int iF2 = tc.f(2, zC);
                        rr0 rr0Var = kn0Var4 != null ? (rr0) kn0Var4.e() : null;
                        synchronized (tcVar) {
                            if (rr0Var != null) {
                                try {
                                    jMin = Math.min(rr0Var.q, rr0Var.i);
                                } finally {
                                }
                            } else {
                                jMin = 0;
                            }
                            rc rcVarE = tcVar.e(gg0VarI, i10);
                            if (jMin != 0) {
                                if (rcVarE != null && rcVarE.a(iF2) <= 0) {
                                    rcVarE = null;
                                }
                                if (rcVarE == null) {
                                    long j = -1;
                                    sc scVar = new sc();
                                    scVar.g = gg0VarI;
                                    scVar.f = i10;
                                    if (rr0Var != null) {
                                        me0Var = me0VarJ;
                                        jMin2 = Math.min(rr0Var.q, rr0Var.i);
                                    } else {
                                        me0Var = me0VarJ;
                                        jMin2 = 0;
                                    }
                                    scVar.h = iF2;
                                    scVar.i = tc.a(jMin2, j);
                                    tcVar.b(gg0VarI, scVar);
                                }
                            } else if (rcVarE != null && rcVarE.a(iF2) <= 0) {
                                tcVar.j(gg0VarI, i10);
                            }
                            me0Var = me0VarJ;
                        }
                        if (nu0VarB == null) {
                            nu0VarB = nu0.b(i9 == 3 ? 2 : 3, null, false);
                        }
                    } else {
                        tcVar.c(tc.f(2, zC), kn0Var3, zC2);
                        tc.h(kn0Var3, hashSet);
                        if (nu0VarB == null) {
                            nu0VarB = nu0.b(4, kn0Var3, zC2);
                        }
                        me0Var = me0VarJ;
                    }
                }
                nu0VarG = nu0VarB;
                for (kn0 kn0Var6 : me0Var.g(3)) {
                    int type2 = kn0Var6.getType();
                    if (type2 == 1 || type2 == 28 || type2 == 38) {
                        if (hashSet.contains(kn0Var6.e().f)) {
                            tcVar.c(1, kn0Var6, zC2);
                        }
                    }
                }
                tc.b.e("Caching {} for {}/{}", nu0VarG, me0Var.e().f, k31.a.e(me0Var.e().g));
            } else {
                me0Var = me0VarJ;
                nu0VarG = null;
            }
            if (nu0VarG == null) {
                gg0Var2 = gg0Var;
                nu0VarG = this.d.g(gg0Var2, this.h, this.f);
            } else {
                gg0Var2 = gg0Var;
            }
            y.e("Queried {}/{}, id={}: {}", gg0Var2, k31.a.e(this.h), Integer.valueOf(me0Var.f.f), nu0VarG);
            d(gg0Var2, nu0VarG);
        } catch (IOException e2) {
            y.e("Lookup for {}/{}, id={} failed using resolver {}", gg0Var, k31.a.e(me0Var2.e().g), Integer.valueOf(me0Var2.f.f), this.a, e2);
            if (e2 instanceof InterruptedIOException) {
                this.t = true;
            } else {
                this.s = true;
            }
        }
    }

    public final void d(gg0 gg0Var, nu0 nu0Var) {
        int i = nu0Var.a;
        if (i == 7) {
            ArrayList arrayList = i == 7 ? nu0Var.c : null;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList2.addAll(((kn0) obj).f(true));
            }
            this.p = 0;
            this.o = (tn0[]) arrayList2.toArray(new tn0[0]);
            this.l = true;
            return;
        }
        if (i == 2) {
            this.q = true;
            this.m = true;
            if (this.j > 0) {
                this.p = 3;
                this.l = true;
                return;
            }
            return;
        }
        if (i == 3) {
            this.p = 4;
            this.o = null;
            this.l = true;
        } else {
            if (i == 5) {
                b(((oc) ((kn0) nu0Var.c.get(0)).e()).k, gg0Var);
                return;
            }
            if (i != 6) {
                if (i == 4) {
                    this.v = true;
                }
            } else {
                try {
                    b(gg0Var.i((bm) ((kn0) nu0Var.c.get(0)).e()), gg0Var);
                } catch (hg0 unused) {
                    this.p = 1;
                    this.l = true;
                }
            }
        }
    }

    public final void e(gg0 gg0Var, gg0 gg0Var2) {
        this.m = false;
        if (gg0Var2 != null) {
            try {
                gg0Var = gg0.e(gg0Var, gg0Var2);
            } catch (hg0 unused) {
                this.u = true;
                return;
            }
        }
        c(gg0Var);
    }

    public final void f() {
        int i = 0;
        if (this.l) {
            this.j = 0;
            this.k = false;
            this.l = false;
            this.m = false;
            this.n = null;
            this.o = null;
            this.p = -1;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = false;
            this.u = false;
            this.v = false;
            if (this.e) {
                tc tcVar = this.d;
                synchronized (tcVar) {
                    tcVar.a.clear();
                }
            }
        }
        if (this.g.isAbsolute()) {
            e(this.g, null);
        } else if (this.b == null) {
            e(this.g, gg0.l);
        } else {
            gg0 gg0Var = this.g;
            if (gg0Var.i > this.c) {
                e(gg0Var, gg0.l);
            }
            if (this.l) {
                return;
            }
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e(this.g, (gg0) obj);
                if (this.l) {
                    return;
                }
                if (this.k) {
                    break;
                }
            }
            e(this.g, gg0.l);
        }
        if (this.l) {
            return;
        }
        if (this.r) {
            this.p = 2;
            this.l = true;
            return;
        }
        if (this.t) {
            this.p = 2;
            this.l = true;
            return;
        }
        if (this.s) {
            this.p = 2;
            this.l = true;
            return;
        }
        if (this.q) {
            this.p = 3;
            this.l = true;
        } else if (this.v) {
            this.p = 1;
            this.l = true;
        } else if (this.u) {
            this.p = 1;
            this.l = true;
        }
    }
}
