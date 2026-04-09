package j$.util.stream;

/* loaded from: classes2.dex */
public final class k8 extends i5 implements u8 {

    /* renamed from: b, reason: collision with root package name */
    public long f26650b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j8 f26653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(j8 j8Var, m5 m5Var, boolean z3) {
        super(m5Var);
        this.f26653e = j8Var;
        this.f26652d = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.f26651c
            if (r0 != 0) goto L15
            j$.util.stream.j8 r0 = r6.f26653e
            java.util.function.Predicate r0 = r0.f26637t
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.f26651c = r1
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r1 = r6.f26652d
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            long r2 = r6.f26650b
            r4 = 1
            long r2 = r2 + r4
            r6.f26650b = r2
        L23:
            if (r1 != 0) goto L29
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            j$.util.stream.m5 r0 = r6.f26617a
            r0.accept(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.k8.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.u8
    public final long h() {
        return this.f26650b;
    }
}
