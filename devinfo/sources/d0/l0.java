package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21775a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f21776b;

    /* renamed from: c, reason: collision with root package name */
    public int f21777c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yj.c f21779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(a6.e eVar, ck.c cVar) {
        super(2, cVar);
        this.f21779e = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ek.i, mk.e] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f21775a) {
            case 0:
                l0 l0Var = new l0((ck.h) this.f21778d, (ek.i) this.f21779e, cVar);
                l0Var.f21776b = obj;
                return l0Var;
            default:
                l0 l0Var2 = new l0((a6.e) this.f21779e, cVar);
                l0Var2.f21778d = obj;
                return l0Var2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21775a) {
            case 0:
                return ((l0) create((c2.k0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((l0) create((uk.h) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [c2.k0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ek.i, mk.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:15:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x009f -> B:28:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00b4 -> B:28:0x006e). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f21775a
            switch(r0) {
                case 0: goto L42;
                default: goto L5;
            }
        L5:
            int r0 = r9.f21777c
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L16
            java.lang.Object r0 = r9.f21776b
            java.lang.Object r2 = r9.f21778d
            uk.h r2 = (uk.h) r2
            ci.b.D(r10)
            goto L3d
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            ci.b.D(r10)
            java.lang.Object r10 = r9.f21778d
            uk.h r10 = (uk.h) r10
            r2 = r10
        L26:
            yj.c r10 = r9.f21779e
            a6.e r10 = (a6.e) r10
            java.lang.Object r10 = r10.invoke()
            if (r10 == 0) goto L3c
            r9.f21778d = r2
            r9.f21776b = r10
            r9.f21777c = r1
            r2.a(r9, r10)
            dk.a r10 = dk.a.f22275a
            goto L41
        L3c:
            r0 = 0
        L3d:
            if (r0 != 0) goto L26
            yj.u r10 = yj.u.f37649a
        L41:
            return r10
        L42:
            java.lang.Object r0 = r9.f21778d
            ck.h r0 = (ck.h) r0
            int r1 = r9.f21777c
            c2.k r2 = c2.k.f2636c
            r3 = 3
            r4 = 2
            r5 = 1
            dk.a r6 = dk.a.f22275a
            if (r1 == 0) goto L7a
            if (r1 == r5) goto L72
            if (r1 == r4) goto L67
            if (r1 != r3) goto L5f
            java.lang.Object r1 = r9.f21776b
            c2.k0 r1 = (c2.k0) r1
            ci.b.D(r10)
            goto L6e
        L5f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L67:
            java.lang.Object r1 = r9.f21776b
            c2.k0 r1 = (c2.k0) r1
            ci.b.D(r10)     // Catch: java.util.concurrent.CancellationException -> L70
        L6e:
            r10 = r1
            goto L81
        L70:
            r10 = move-exception
            goto La6
        L72:
            java.lang.Object r1 = r9.f21776b
            c2.k0 r1 = (c2.k0) r1
            ci.b.D(r10)     // Catch: java.util.concurrent.CancellationException -> L70
            goto L97
        L7a:
            ci.b.D(r10)
            java.lang.Object r10 = r9.f21776b
            c2.k0 r10 = (c2.k0) r10
        L81:
            boolean r1 = xk.x.s(r0)
            if (r1 == 0) goto Lb8
            yj.c r1 = r9.f21779e     // Catch: java.util.concurrent.CancellationException -> La2
            ek.i r1 = (ek.i) r1     // Catch: java.util.concurrent.CancellationException -> La2
            r9.f21776b = r10     // Catch: java.util.concurrent.CancellationException -> La2
            r9.f21777c = r5     // Catch: java.util.concurrent.CancellationException -> La2
            java.lang.Object r1 = r1.invoke(r10, r9)     // Catch: java.util.concurrent.CancellationException -> La2
            if (r1 != r6) goto L96
            goto Lba
        L96:
            r1 = r10
        L97:
            r9.f21776b = r1     // Catch: java.util.concurrent.CancellationException -> L70
            r9.f21777c = r4     // Catch: java.util.concurrent.CancellationException -> L70
            java.lang.Object r10 = d0.m1.e(r1, r2, r9)     // Catch: java.util.concurrent.CancellationException -> L70
            if (r10 != r6) goto L6e
            goto Lba
        La2:
            r1 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
        La6:
            boolean r7 = xk.x.s(r0)
            if (r7 == 0) goto Lb7
            r9.f21776b = r1
            r9.f21777c = r3
            java.lang.Object r10 = d0.m1.e(r1, r2, r9)
            if (r10 != r6) goto L6e
            goto Lba
        Lb7:
            throw r10
        Lb8:
            yj.u r6 = yj.u.f37649a
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(ck.h hVar, mk.e eVar, ck.c cVar) {
        super(2, cVar);
        this.f21778d = hVar;
        this.f21779e = (ek.i) eVar;
    }
}
