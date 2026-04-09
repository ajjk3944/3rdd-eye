package p4;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z implements g {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f31358a;

    /* renamed from: b, reason: collision with root package name */
    public final c f31359b;

    /* renamed from: c, reason: collision with root package name */
    public final xk.v f31360c;

    /* renamed from: d, reason: collision with root package name */
    public final al.f0 f31361d;

    /* renamed from: f, reason: collision with root package name */
    public int f31363f;
    public xk.a0 g;

    /* renamed from: i, reason: collision with root package name */
    public final a0.x0 f31365i;

    /* renamed from: l, reason: collision with root package name */
    public final a0.x0 f31367l;

    /* renamed from: e, reason: collision with root package name */
    public final gl.c f31362e = gl.d.a();

    /* renamed from: h, reason: collision with root package name */
    public final km.y f31364h = new km.y(8);
    public final yj.n j = a.a.u(new l(this, 1));

    /* renamed from: k, reason: collision with root package name */
    public final yj.n f31366k = a.a.u(new l(this, 0));

    public z(d0 d0Var, List list, c cVar, xk.v vVar) {
        this.f31358a = d0Var;
        this.f31359b = cVar;
        this.f31360c = vVar;
        ck.c cVar2 = null;
        this.f31361d = new al.f0(new bh.t(this, cVar2, 19));
        this.f31365i = new a0.x0(this, list);
        this.f31367l = new a0.x0(vVar, new c2.l0(23, this), new al.p(this, cVar2, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(p4.z r4, ek.c r5) {
        /*
            boolean r0 = r5 instanceof p4.p
            if (r0 == 0) goto L13
            r0 = r5
            p4.p r0 = (p4.p) r0
            int r1 = r0.f31268e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31268e = r1
            goto L18
        L13:
            p4.p r0 = new p4.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31266c
            int r1 = r0.f31268e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            gl.c r4 = r0.f31265b
            p4.z r0 = r0.f31264a
            ci.b.D(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ci.b.D(r5)
            gl.c r5 = r4.f31362e
            r0.f31264a = r4
            r0.f31265b = r5
            r0.f31268e = r2
            java.lang.Object r0 = r5.c(r0)
            dk.a r1 = dk.a.f22275a
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f31363f     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            r4.f31363f = r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L5c
            xk.a0 r1 = r4.g     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            r1.e(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L62
        L5a:
            r4.g = r0     // Catch: java.lang.Throwable -> L58
        L5c:
            r5.e(r0)
            yj.u r4 = yj.u.f37649a
            return r4
        L62:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.z.b(p4.z, ek.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(8:68|(1:(1:(2:18|19))(3:20|21|22))|13|14|62|(1:64)(1:65)|66|67)(5:23|73|24|(3:26|71|27)(3:37|(1:39)(1:40)|(2:42|(2:44|(1:46))(2:53|54))(2:55|(2:57|58)(2:59|60)))|50)|47|69|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v3, types: [ek.j, mk.e] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ek.j, mk.e] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(p4.z r9, p4.l0 r10, ek.c r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.z.c(p4.z, p4.l0, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(p4.z r4, ek.c r5) {
        /*
            boolean r0 = r5 instanceof p4.r
            if (r0 == 0) goto L13
            r0 = r5
            p4.r r0 = (p4.r) r0
            int r1 = r0.f31291e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31291e = r1
            goto L18
        L13:
            p4.r r0 = new p4.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31289c
            int r1 = r0.f31291e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            gl.c r4 = r0.f31288b
            p4.z r0 = r0.f31287a
            ci.b.D(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ci.b.D(r5)
            gl.c r5 = r4.f31362e
            r0.f31287a = r4
            r0.f31288b = r5
            r0.f31291e = r2
            java.lang.Object r0 = r5.c(r0)
            dk.a r1 = dk.a.f22275a
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f31363f     // Catch: java.lang.Throwable -> L5f
            int r1 = r1 + r2
            r4.f31363f = r1     // Catch: java.lang.Throwable -> L5f
            if (r1 != r2) goto L61
            xk.v r1 = r4.f31360c     // Catch: java.lang.Throwable -> L5f
            p4.m r2 = new p4.m     // Catch: java.lang.Throwable -> L5f
            r3 = 1
            r2.<init>(r4, r0, r3)     // Catch: java.lang.Throwable -> L5f
            r3 = 3
            xk.a0 r1 = xk.x.v(r1, r0, r0, r2, r3)     // Catch: java.lang.Throwable -> L5f
            r4.g = r1     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r4 = move-exception
            goto L67
        L61:
            r5.e(r0)
            yj.u r4 = yj.u.f37649a
            return r4
        L67:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.z.d(p4.z, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(p4.z r8, boolean r9, ck.c r10) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.z.e(p4.z, boolean, ck.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: b -> 0x005f, TryCatch #2 {b -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:80:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:80:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(p4.z r9, boolean r10, ek.c r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.z.f(p4.z, boolean, ek.c):java.lang.Object");
    }

    @Override // p4.g
    public final Object a(mk.e eVar, ek.c cVar) {
        e1 e1Var = (e1) cVar.getContext().O(d1.f31185a);
        if (e1Var != null) {
            e1Var.a(this);
        }
        return xk.x.E(new e1(e1Var, this), new bh.t(this, eVar, (ck.c) null), cVar);
    }

    public final k0 g() {
        return (k0) this.f31366k.getValue();
    }

    @Override // p4.g
    public final al.h getData() {
        return this.f31361d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.J(r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(ek.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p4.s
            if (r0 == 0) goto L13
            r0 = r7
            p4.s r0 = (p4.s) r0
            int r1 = r0.f31304e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31304e = r1
            goto L18
        L13:
            p4.s r0 = new p4.s
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f31302c
            int r1 = r0.f31304e
            r2 = 2
            r3 = 1
            dk.a r4 = dk.a.f22275a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            int r1 = r0.f31301b
            p4.z r0 = r0.f31300a
            ci.b.D(r7)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r7 = move-exception
            goto L6e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            p4.z r1 = r0.f31300a
            ci.b.D(r7)
            goto L51
        L3e:
            ci.b.D(r7)
            p4.k0 r7 = r6.g()
            r0.f31300a = r6
            r0.f31304e = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r4) goto L50
            goto L65
        L50:
            r1 = r6
        L51:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            a0.x0 r3 = r1.f31365i     // Catch: java.lang.Throwable -> L69
            r0.f31300a = r1     // Catch: java.lang.Throwable -> L69
            r0.f31301b = r7     // Catch: java.lang.Throwable -> L69
            r0.f31304e = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r3.J(r0)     // Catch: java.lang.Throwable -> L69
            if (r7 != r4) goto L66
        L65:
            return r4
        L66:
            yj.u r7 = yj.u.f37649a
            return r7
        L69:
            r0 = move-exception
            r5 = r1
            r1 = r7
            r7 = r0
            r0 = r5
        L6e:
            km.y r0 = r0.f31364h
            p4.u0 r2 = new p4.u0
            r2.<init>(r1, r7)
            r0.C(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.z.h(ek.c):java.lang.Object");
    }

    public final Object i(ek.c cVar) {
        return ((g0) this.j.getValue()).a(new n(3, (ck.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r10, boolean r11, ek.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p4.x
            if (r0 == 0) goto L13
            r0 = r12
            p4.x r0 = (p4.x) r0
            int r1 = r0.f31344d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31344d = r1
            goto L18
        L13:
            p4.x r0 = new p4.x
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f31342b
            int r1 = r0.f31344d
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            nk.s r10 = r0.f31341a
            ci.b.D(r12)
            goto L56
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            ci.b.D(r12)
            nk.s r4 = new nk.s
            r4.<init>()
            yj.n r12 = r9.j
            java.lang.Object r12 = r12.getValue()
            p4.g0 r12 = (p4.g0) r12
            p4.y r3 = new p4.y
            r8 = 0
            r5 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f31341a = r4
            r0.f31344d = r2
            java.lang.Object r10 = r12.b(r3, r0)
            dk.a r11 = dk.a.f22275a
            if (r10 != r11) goto L55
            return r11
        L55:
            r10 = r4
        L56:
            int r10 = r10.f29984a
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.z.j(java.lang.Object, boolean, ek.c):java.lang.Object");
    }
}
