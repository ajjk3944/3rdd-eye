package j$.util.stream;

/* loaded from: classes2.dex */
public final class M3 extends AbstractC2452k2 implements Z3 {

    /* renamed from: b, reason: collision with root package name */
    public long f20917b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f20919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N3 f20920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(N3 n32, InterfaceC2472o2 interfaceC2472o2, boolean z6) {
        super(interfaceC2472o2);
        this.f20920e = n32;
        this.f20919d = z6;
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
            boolean r0 = r6.f20918c
            if (r0 != 0) goto L15
            j$.util.stream.N3 r0 = r6.f20920e
            java.util.function.Predicate r0 = r0.f20927s
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.f20918c = r1
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r1 = r6.f20919d
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            long r2 = r6.f20917b
            r4 = 1
            long r2 = r2 + r4
            r6.f20917b = r2
        L23:
            if (r1 != 0) goto L29
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            j$.util.stream.o2 r0 = r6.f21108a
            r0.accept(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.M3.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.Z3
    public final long h() {
        return this.f20917b;
    }
}
