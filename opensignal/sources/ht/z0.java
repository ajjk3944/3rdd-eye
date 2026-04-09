package ht;

/* loaded from: classes.dex */
public final class z0 extends o {

    /* renamed from: d, reason: collision with root package name */
    public final String f10961d;

    public z0(String str) {
        this.f10961d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void O0(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L42
        L3b:
            r5[r1] = r7
            goto L42
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L42:
            if (r9 == r1) goto L56
            if (r9 == r4) goto L52
            if (r9 == r3) goto L4f
            if (r9 == r0) goto L56
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L56
        L4f:
            r5[r4] = r7
            goto L56
        L52:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L56:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.z0.O0(int):void");
    }

    @Override // ht.o
    public final b0 C0() {
        throw new IllegalStateException(this.f10961d);
    }

    @Override // ht.o
    /* renamed from: E0 */
    public final b0 h0(jt.f fVar) {
        if (fVar != null) {
            return this;
        }
        O0(3);
        throw null;
    }

    @Override // ht.o
    public final o M0(b0 b0Var) {
        throw new IllegalStateException(this.f10961d);
    }

    @Override // ht.o, ht.x
    /* renamed from: h0 */
    public final x q0(jt.f fVar) {
        if (fVar != null) {
            return this;
        }
        O0(3);
        throw null;
    }

    @Override // ht.b0, ht.c1
    public final /* bridge */ /* synthetic */ c1 p0(boolean z10) {
        p0(z10);
        throw null;
    }

    @Override // ht.o, ht.c1
    public final c1 q0(jt.f fVar) {
        if (fVar != null) {
            return this;
        }
        O0(3);
        throw null;
    }

    @Override // ht.b0, ht.c1
    public final /* bridge */ /* synthetic */ c1 r0(i0 i0Var) {
        r0(i0Var);
        throw null;
    }

    @Override // ht.b0
    public final String toString() {
        String str = this.f10961d;
        if (str != null) {
            return str;
        }
        O0(1);
        throw null;
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        throw new IllegalStateException(this.f10961d);
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        if (i0Var != null) {
            throw new IllegalStateException(this.f10961d);
        }
        O0(0);
        throw null;
    }
}
