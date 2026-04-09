package g2;

import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 implements u0.h {

    /* renamed from: a, reason: collision with root package name */
    public final i2.e0 f24329a;

    /* renamed from: b, reason: collision with root package name */
    public u0.t f24330b;

    /* renamed from: c, reason: collision with root package name */
    public yb.i f24331c;

    /* renamed from: d, reason: collision with root package name */
    public int f24332d;

    /* renamed from: e, reason: collision with root package name */
    public int f24333e;

    /* renamed from: f, reason: collision with root package name */
    public final x.e0 f24334f;
    public final x.e0 g;

    /* renamed from: h, reason: collision with root package name */
    public final z f24335h;

    /* renamed from: i, reason: collision with root package name */
    public final w f24336i;
    public final x.e0 j;

    /* renamed from: k, reason: collision with root package name */
    public final e1 f24337k;

    /* renamed from: l, reason: collision with root package name */
    public final x.e0 f24338l;

    /* renamed from: m, reason: collision with root package name */
    public final w0.e f24339m;

    /* renamed from: n, reason: collision with root package name */
    public int f24340n;

    /* renamed from: o, reason: collision with root package name */
    public int f24341o;

    /* renamed from: p, reason: collision with root package name */
    public final String f24342p;

    public f0(i2.e0 e0Var, yb.i iVar) {
        this.f24329a = e0Var;
        this.f24331c = iVar;
        long[] jArr = x.l0.f36914a;
        this.f24334f = new x.e0();
        this.g = new x.e0();
        this.f24335h = new z(this);
        this.f24336i = new w(this);
        this.j = new x.e0();
        this.f24337k = new e1();
        this.f24338l = new x.e0();
        this.f24339m = new w0.e(new Object[16]);
        this.f24342p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void c(f0 f0Var, Object obj) {
        i2.e0 e0Var = f0Var.f24329a;
        f0Var.h();
        i2.e0 e0Var2 = (i2.e0) f0Var.j.k(obj);
        if (e0Var2 != null) {
            if (f0Var.f24341o <= 0) {
                f2.a.b("No pre-composed items to dispose");
            }
            int iJ = ((w0.b) e0Var.p()).f36391a.j(e0Var2);
            if (iJ < ((w0.b) e0Var.p()).f36391a.f36399c - f0Var.f24341o) {
                f2.a.b("Item is not in pre-composed item range");
            }
            f0Var.f24340n++;
            f0Var.f24341o--;
            x xVar = (x) f0Var.f24334f.g(e0Var2);
            if (xVar != null) {
                e(xVar);
            }
            int i4 = (((w0.b) e0Var.p()).f36391a.f36399c - f0Var.f24341o) - f0Var.f24340n;
            f0Var.j(iJ, i4);
            f0Var.g(i4);
        }
        if (f0Var.f24339m.i(obj)) {
            i2.e0.V(e0Var, true, 6);
        }
    }

    public static void e(x xVar) {
        x.f0 f0Var;
        u0.f1 f1Var = xVar.f24434f;
        if (f1Var != null) {
            f1Var.f34807h.set(u0.g1.f34814b);
            c1.o oVar = f1Var.f34809k;
            if (((x.f0) oVar.f2575h).h()) {
                f0Var = (x.f0) oVar.f2575h;
                x.f0 f0Var2 = x.m0.f36916a;
                oVar.f2575h = new x.f0();
                ((w0.e) oVar.f2572d).h();
            } else {
                f0Var = null;
            }
            oVar.b();
            u0.w wVar = f1Var.f34801a;
            wVar.f35006q = null;
            if (f0Var != null) {
                wVar.f35010u.j = f0Var;
                wVar.f35012w = 2;
            }
            xVar.f24434f = null;
            u0.w wVar2 = xVar.f24431c;
            if (wVar2 != null) {
                wVar2.m();
            }
            xVar.f24431c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // u0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            i2.e0 r2 = r0.f24329a
            r2.f25642r = r1
            x.e0 r1 = r0.f24334f
            java.lang.Object[] r3 = r1.f36875c
            long[] r4 = r1.f36873a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            g2.x r13 = (g2.x) r13
            u0.w r13 = r13.f24431c
            if (r13 == 0) goto L47
            r13.m()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.P()
            r2.f25642r = r6
            r1.a()
            x.e0 r1 = r0.g
            r1.a()
            r0.f24341o = r6
            r0.f24340n = r6
            x.e0 r1 = r0.j
            r1.a()
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.f0.a():void");
    }

    @Override // u0.h
    public final void b() {
        i(true);
    }

    public final void d(x xVar, boolean z3) {
        u0.f1 f1Var = xVar.f24434f;
        if (f1Var != null) {
            g1.g gVarF = g1.r.f();
            mk.c cVarE = gVarF != null ? gVarF.e() : null;
            g1.g gVarK = g1.r.k(gVarF);
            try {
                i2.e0 e0Var = this.f24329a;
                e0Var.f25642r = true;
                if (z3) {
                    while (!f1Var.c()) {
                        try {
                            f1Var.e(new f4.b(6));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                f1Var.a();
                xVar.f24434f = null;
                e0Var.f25642r = false;
            } finally {
                g1.r.o(gVarF, gVarK, cVarE);
            }
        }
    }

    public final a1 f(Object obj) {
        return !this.f24329a.H() ? new c0() : new d0(this, obj);
    }

    public final void g(int i4) {
        boolean z3;
        boolean z10 = false;
        this.f24340n = 0;
        List listP = this.f24329a.p();
        w0.b bVar = (w0.b) listP;
        int i10 = (bVar.f36391a.f36399c - this.f24341o) - 1;
        if (i4 <= i10) {
            this.f24337k.clear();
            if (i4 <= i10) {
                int i11 = i4;
                while (true) {
                    Object objG = this.f24334f.g((i2.e0) bVar.get(i11));
                    nk.k.b(objG);
                    ((x.b0) this.f24337k.f24327b).a(((x) objG).f24429a);
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            yb.i iVar = this.f24331c;
            e1 e1Var = this.f24337k;
            x.z zVar = (x.z) iVar.f37517c;
            zVar.a();
            x.b0 b0Var = (x.b0) e1Var.f24327b;
            Object[] objArr = b0Var.f36850b;
            long[] jArr = b0Var.f36851c;
            int i12 = b0Var.f36853e;
            while (i12 != Integer.MAX_VALUE) {
                int i13 = (int) ((jArr[i12] >> 31) & 2147483647L);
                Object obj = objArr[i12];
                Object objB = ((j0.b0) iVar.f37516b).b(obj);
                int iD = zVar.d(objB);
                int i14 = iD >= 0 ? zVar.f36967c[iD] : 0;
                if (i14 == 7) {
                    e1Var.remove(obj);
                } else {
                    zVar.g(i14 + 1, objB);
                }
                i12 = i13;
            }
            g1.g gVarF = g1.r.f();
            mk.c cVarE = gVarF != null ? gVarF.e() : null;
            g1.g gVarK = g1.r.k(gVarF);
            z3 = false;
            while (i10 >= i4) {
                try {
                    i2.e0 e0Var = (i2.e0) ((w0.b) listP).get(i10);
                    Object objG2 = this.f24334f.g(e0Var);
                    nk.k.b(objG2);
                    x xVar = (x) objG2;
                    Object obj2 = xVar.f24429a;
                    if (((x.b0) this.f24337k.f24327b).c(obj2)) {
                        this.f24340n++;
                        if (((Boolean) xVar.g.getValue()).booleanValue()) {
                            i2.i0 i0Var = e0Var.H;
                            i2.u0 u0Var = i0Var.f25687p;
                            i2.c0 c0Var = i2.c0.f25589c;
                            u0Var.f25790l = c0Var;
                            i2.q0 q0Var = i0Var.f25688q;
                            if (q0Var != null) {
                                q0Var.j = c0Var;
                            }
                            l(xVar, false);
                            if (xVar.f24435h) {
                                z3 = true;
                            }
                        }
                    } else {
                        i2.e0 e0Var2 = this.f24329a;
                        e0Var2.f25642r = true;
                        this.f24334f.k(e0Var);
                        u0.w wVar = xVar.f24431c;
                        if (wVar != null) {
                            wVar.m();
                        }
                        this.f24329a.Q(i10, 1);
                        e0Var2.f25642r = false;
                    }
                    this.g.k(obj2);
                    i10--;
                } catch (Throwable th2) {
                    g1.r.o(gVarF, gVarK, cVarE);
                    throw th2;
                }
            }
            g1.r.o(gVarF, gVarK, cVarE);
        } else {
            z3 = false;
        }
        if (z3) {
            synchronized (g1.m.f24260c) {
                x.f0 f0Var = g1.m.j.f24210h;
                if (f0Var != null) {
                    if (f0Var.h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                g1.m.a();
            }
        }
        h();
    }

    public final void h() {
        int i4 = ((w0.b) this.f24329a.p()).f36391a.f36399c;
        x.e0 e0Var = this.f24334f;
        if (e0Var.f36877e != i4) {
            f2.a.a("Inconsistency between the count of nodes tracked by the state (" + e0Var.f36877e + ") and the children count on the SubcomposeLayout (" + i4 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i4 - this.f24340n) - this.f24341o < 0) {
            StringBuilder sbW = je.u.w(i4, "Incorrect state. Total children ", ". Reusable children ");
            sbW.append(this.f24340n);
            sbW.append(". Precomposed children ");
            sbW.append(this.f24341o);
            f2.a.a(sbW.toString());
        }
        x.e0 e0Var2 = this.j;
        if (e0Var2.f36877e == this.f24341o) {
            return;
        }
        f2.a.a("Incorrect state. Precomposed children " + this.f24341o + ". Map size " + e0Var2.f36877e);
    }

    public final void i(boolean z3) {
        this.f24341o = 0;
        this.j.a();
        List listP = this.f24329a.p();
        int i4 = ((w0.b) listP).f36391a.f36399c;
        if (this.f24340n != i4) {
            this.f24340n = i4;
            g1.g gVarF = g1.r.f();
            mk.c cVarE = gVarF != null ? gVarF.e() : null;
            g1.g gVarK = g1.r.k(gVarF);
            for (int i10 = 0; i10 < i4; i10++) {
                try {
                    i2.e0 e0Var = (i2.e0) ((w0.b) listP).get(i10);
                    x xVar = (x) this.f24334f.g(e0Var);
                    if (xVar != null && ((Boolean) xVar.g.getValue()).booleanValue()) {
                        i2.i0 i0Var = e0Var.H;
                        i2.u0 u0Var = i0Var.f25687p;
                        i2.c0 c0Var = i2.c0.f25589c;
                        u0Var.f25790l = c0Var;
                        i2.q0 q0Var = i0Var.f25688q;
                        if (q0Var != null) {
                            q0Var.j = c0Var;
                        }
                        l(xVar, z3);
                        xVar.f24429a = n0.f24384a;
                    }
                } catch (Throwable th2) {
                    g1.r.o(gVarF, gVarK, cVarE);
                    throw th2;
                }
            }
            g1.r.o(gVarF, gVarK, cVarE);
            this.g.a();
        }
        h();
    }

    public final void j(int i4, int i10) {
        i2.e0 e0Var = this.f24329a;
        e0Var.f25642r = true;
        e0Var.L(i4, i10, 1);
        e0Var.f25642r = false;
    }

    public final void k(Object obj, mk.e eVar, boolean z3) {
        i2.e0 e0Var = this.f24329a;
        if (e0Var.H()) {
            h();
            if (this.g.c(obj)) {
                return;
            }
            this.f24338l.k(obj);
            x.e0 e0Var2 = this.j;
            Object objG = e0Var2.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((w0.b) e0Var.p()).f36391a.j(objG), ((w0.b) e0Var.p()).f36391a.f36399c);
                    this.f24341o++;
                } else {
                    int i4 = ((w0.b) e0Var.p()).f36391a.f36399c;
                    i2.e0 e0Var3 = new i2.e0(2);
                    e0Var.f25642r = true;
                    e0Var.B(i4, e0Var3);
                    e0Var.f25642r = false;
                    this.f24341o++;
                    objG = e0Var3;
                }
                e0Var2.m(obj, objG);
            }
            m((i2.e0) objG, obj, z3, eVar);
        }
    }

    public final void l(x xVar, boolean z3) {
        u0.w wVar;
        if (z3 || !xVar.f24435h) {
            xVar.g = u0.q.r(Boolean.FALSE);
        } else {
            xVar.g.setValue(Boolean.FALSE);
        }
        if (xVar.f24434f != null) {
            e(xVar);
            return;
        }
        if (z3) {
            u0.w wVar2 = xVar.f24431c;
            if (wVar2 != null) {
                wVar2.l();
                return;
            }
            return;
        }
        i2.k1 outOfFrameExecutor = ((j2.r) i2.h0.a(this.f24329a)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (xVar.f24435h || (wVar = xVar.f24431c) == null) {
                return;
            }
            wVar.l();
            return;
        }
        b2.b bVar = new b2.b(4, xVar);
        j2.r rVar = (j2.r) outOfFrameExecutor;
        zj.l lVar = rVar.f27265h;
        boolean zIsEmpty = lVar.isEmpty();
        lVar.addLast(bVar);
        if (zIsEmpty) {
            Handler handler = rVar.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(rVar.f27267i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010d, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x010a, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0117, B:76:0x0121), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010d, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x010a, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0117, B:76:0x0121), top: B:79:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(i2.e0 r10, java.lang.Object r11, boolean r12, mk.e r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.f0.m(i2.e0, java.lang.Object, boolean, mk.e):void");
    }

    public final i2.e0 n(Object obj) {
        x.e0 e0Var;
        int i4;
        if (this.f24340n == 0) {
            return null;
        }
        w0.b bVar = (w0.b) this.f24329a.p();
        int i10 = bVar.f36391a.f36399c - this.f24341o;
        int i11 = i10 - this.f24340n;
        int i12 = i10 - 1;
        int i13 = i12;
        while (true) {
            e0Var = this.f24334f;
            if (i13 < i11) {
                i4 = -1;
                break;
            }
            Object objG = e0Var.g((i2.e0) bVar.get(i13));
            nk.k.b(objG);
            if (((x) objG).f24429a.equals(obj)) {
                i4 = i13;
                break;
            }
            i13--;
        }
        if (i4 == -1) {
            while (i12 >= i11) {
                Object objG2 = e0Var.g((i2.e0) bVar.get(i12));
                nk.k.b(objG2);
                x xVar = (x) objG2;
                Object obj2 = xVar.f24429a;
                if (obj2 != n0.f24384a) {
                    j0.b0 b0Var = (j0.b0) this.f24331c.f37516b;
                    if (!nk.k.a(b0Var.b(obj), b0Var.b(obj2))) {
                        i12--;
                    }
                }
                xVar.f24429a = obj;
                i13 = i12;
                i4 = i13;
                break;
            }
            i13 = i12;
        }
        if (i4 == -1) {
            return null;
        }
        if (i13 != i11) {
            j(i13, i11);
        }
        this.f24340n--;
        i2.e0 e0Var2 = (i2.e0) bVar.get(i11);
        Object objG3 = e0Var.g(e0Var2);
        nk.k.b(objG3);
        x xVar2 = (x) objG3;
        xVar2.g = u0.q.r(Boolean.TRUE);
        xVar2.f24433e = true;
        xVar2.f24432d = true;
        return e0Var2;
    }
}
