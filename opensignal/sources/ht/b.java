package ht;

/* loaded from: classes.dex */
public abstract class b extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gt.o oVar) {
        super(oVar);
        if (oVar != null) {
        } else {
            h(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void h(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.b.h(int):void");
    }

    @Override // ht.h
    public final x c() {
        rr.f fVarP = p();
        if (fVarP == null) {
            or.h.a(107);
            throw null;
        }
        qs.g gVar = or.h.f19672e;
        if (or.h.b(fVarP, or.n.f19686a) || or.h.b(fVarP, or.n.f19688b)) {
            return null;
        }
        return n().e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[RETURN] */
    @Override // ht.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(rr.i r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof rr.f
            r1 = 0
            if (r0 == 0) goto L73
            rr.f r0 = r5.p()
            java.lang.String r2 = "first"
            br.l.e(r0, r2)
            qs.g r2 = r0.getName()
            qs.g r3 = r6.getName()
            boolean r2 = br.l.a(r2, r3)
            r3 = 1
            if (r2 != 0) goto L1f
        L1d:
            r6 = r1
            goto L70
        L1f:
            rr.l r0 = r0.o()
            rr.l r6 = r6.o()
        L27:
            if (r0 == 0) goto L51
            if (r6 == 0) goto L51
            boolean r2 = r0 instanceof rr.a0
            if (r2 == 0) goto L32
            boolean r6 = r6 instanceof rr.a0
            goto L70
        L32:
            boolean r2 = r6 instanceof rr.a0
            if (r2 == 0) goto L37
            goto L1d
        L37:
            boolean r2 = r0 instanceof rr.f0
            if (r2 == 0) goto L53
            boolean r2 = r6 instanceof rr.f0
            if (r2 == 0) goto L1d
            rr.f0 r0 = (rr.f0) r0
            ur.c0 r0 = (ur.c0) r0
            qs.c r0 = r0.f23629y
            rr.f0 r6 = (rr.f0) r6
            ur.c0 r6 = (ur.c0) r6
            qs.c r6 = r6.f23629y
            boolean r6 = br.l.a(r0, r6)
            if (r6 == 0) goto L1d
        L51:
            r6 = r3
            goto L70
        L53:
            boolean r2 = r6 instanceof rr.f0
            if (r2 == 0) goto L58
            goto L1d
        L58:
            qs.g r2 = r0.getName()
            qs.g r4 = r6.getName()
            boolean r2 = br.l.a(r2, r4)
            if (r2 != 0) goto L67
            goto L1d
        L67:
            rr.l r0 = r0.o()
            rr.l r6 = r6.o()
            goto L27
        L70:
            if (r6 == 0) goto L73
            return r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.b.f(rr.i):boolean");
    }

    @Override // ht.m0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract rr.f p();

    @Override // ht.m0
    public final or.h n() {
        or.h hVarE = xs.d.e(p());
        if (hVarE != null) {
            return hVarE;
        }
        h(1);
        throw null;
    }
}
