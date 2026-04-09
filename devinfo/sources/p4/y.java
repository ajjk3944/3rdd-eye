package p4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public nk.s f31347b;

    /* renamed from: c, reason: collision with root package name */
    public int f31348c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nk.s f31350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f31351f;
    public final /* synthetic */ Object g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f31352h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(nk.s sVar, z zVar, Object obj, boolean z3, ck.c cVar) {
        super(2, cVar);
        this.f31350e = sVar;
        this.f31351f = zVar;
        this.g = obj;
        this.f31352h = z3;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        y yVar = new y(this.f31350e, this.f31351f, this.g, this.f31352h, cVar);
        yVar.f31349d = obj;
        return yVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((i0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r5.b(r1, r7) == r6) goto L16;
     */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f31348c
            java.lang.Object r1 = r7.g
            p4.z r2 = r7.f31351f
            nk.s r3 = r7.f31350e
            r4 = 2
            r5 = 1
            dk.a r6 = dk.a.f22275a
            if (r0 == 0) goto L28
            if (r0 == r5) goto L1e
            if (r0 != r4) goto L16
            ci.b.D(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            nk.s r0 = r7.f31347b
            java.lang.Object r5 = r7.f31349d
            p4.i0 r5 = (p4.i0) r5
            ci.b.D(r8)
            goto L43
        L28:
            ci.b.D(r8)
            java.lang.Object r8 = r7.f31349d
            p4.i0 r8 = (p4.i0) r8
            p4.k0 r0 = r2.g()
            r7.f31349d = r8
            r7.f31347b = r3
            r7.f31348c = r5
            java.lang.Object r0 = r0.a(r7)
            if (r0 != r6) goto L40
            goto L58
        L40:
            r5 = r8
            r8 = r0
            r0 = r3
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f29984a = r8
            r8 = 0
            r7.f31349d = r8
            r7.f31347b = r8
            r7.f31348c = r4
            java.lang.Object r8 = r5.b(r1, r7)
            if (r8 != r6) goto L59
        L58:
            return r6
        L59:
            boolean r8 = r7.f31352h
            if (r8 == 0) goto L71
            km.y r8 = r2.f31364h
            p4.d r0 = new p4.d
            if (r1 == 0) goto L68
            int r2 = r1.hashCode()
            goto L69
        L68:
            r2 = 0
        L69:
            int r3 = r3.f29984a
            r0.<init>(r1, r2, r3)
            r8.C(r0)
        L71:
            yj.u r8 = yj.u.f37649a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
