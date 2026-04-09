package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lw0 extends mz0 implements hy {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yw0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw0(yw0 yw0Var, oj ojVar, int i) {
        super(2, ojVar);
        this.j = i;
        this.m = yw0Var;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((lw0) h((oj) obj2, (jw0) obj)).m(z31.a);
            default:
                return ((lw0) h((oj) obj2, (av) obj)).m(z31.a);
        }
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        switch (this.j) {
            case 0:
                lw0 lw0Var = new lw0(this.m, ojVar, 0);
                lw0Var.l = obj;
                return lw0Var;
            default:
                lw0 lw0Var2 = new lw0(this.m, ojVar, 1);
                lw0Var2.l = obj;
                return lw0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.j
            switch(r0) {
                case 0: goto L58;
                default: goto L5;
            }
        L5:
            yw0 r0 = r6.m
            ay0 r1 = r0.e
            int r2 = r6.k
            r3 = 1
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L16
            defpackage.bd2.x(r7)
            z31 r7 = defpackage.z31.a
            goto L57
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            defpackage.bd2.x(r7)
            java.lang.Object r7 = r6.l
            av r7 = (defpackage.av) r7
            java.lang.Object r2 = r1.E()
            yx0 r2 = (defpackage.yx0) r2
            boolean r4 = r2 instanceof defpackage.jm
            if (r4 != 0) goto L39
            mc2 r0 = r0.g
            hw0 r4 = new hw0
            r4.<init>(r2)
            r0.f(r4)
        L39:
            pa0 r0 = new pa0
            r4 = 0
            r5 = 3
            r0.<init>(r2, r4, r5)
            r6.k = r3
            dv r2 = new dv
            r3 = 1
            r2.<init>(r3, r7)
            zo0 r7 = new zo0
            r7.<init>()
            cv r3 = new cv
            r3.<init>(r7, r2, r0)
            r1.b(r3, r6)
            rk r7 = defpackage.rk.f
        L57:
            return r7
        L58:
            int r0 = r6.k
            z31 r1 = defpackage.z31.a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L70
            if (r0 == r3) goto L64
            if (r0 != r2) goto L68
        L64:
            defpackage.bd2.x(r7)
            goto Lcd
        L68:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L70:
            defpackage.bd2.x(r7)
            java.lang.Object r7 = r6.l
            jw0 r7 = (defpackage.jw0) r7
            boolean r0 = r7 instanceof defpackage.hw0
            yw0 r4 = r6.m
            rk r5 = defpackage.rk.f
            if (r0 == 0) goto Lbe
            hw0 r7 = (defpackage.hw0) r7
            r6.k = r3
            ay0 r0 = r4.e
            java.lang.Object r0 = r0.E()
            yx0 r0 = (defpackage.yx0) r0
            boolean r2 = r0 instanceof defpackage.jm
            if (r2 == 0) goto L90
            goto Lb2
        L90:
            boolean r2 = r0 instanceof defpackage.qn0
            if (r2 == 0) goto L9f
            yx0 r7 = r7.a
            if (r0 != r7) goto Lb2
            java.lang.Object r7 = r4.e(r6)
            if (r7 != r5) goto Lb2
            goto Lb3
        L9f:
            v31 r7 = defpackage.v31.a
            boolean r7 = defpackage.i30.c(r0, r7)
            if (r7 == 0) goto Lae
            java.lang.Object r7 = r4.e(r6)
            if (r7 != r5) goto Lb2
            goto Lb3
        Lae:
            boolean r7 = r0 instanceof defpackage.mu
            if (r7 != 0) goto Lb6
        Lb2:
            r7 = r1
        Lb3:
            if (r7 != r5) goto Lcd
            goto Lcc
        Lb6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            r7.<init>(r0)
            throw r7
        Lbe:
            boolean r0 = r7 instanceof defpackage.iw0
            if (r0 == 0) goto Lcd
            iw0 r7 = (defpackage.iw0) r7
            r6.k = r2
            java.lang.Object r7 = defpackage.yw0.a(r4, r7, r6)
            if (r7 != r5) goto Lcd
        Lcc:
            r1 = r5
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw0.m(java.lang.Object):java.lang.Object");
    }
}
