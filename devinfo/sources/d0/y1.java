package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y1 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public long f21902b;

    /* renamed from: c, reason: collision with root package name */
    public int f21903c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f21904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f21905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, ck.c cVar) {
        super(2, cVar);
        this.f21905e = z1Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        y1 y1Var = new y1(this.f21905e, cVar);
        y1Var.f21904d = ((d3.p) obj).f21974a;
        return y1Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        long j = ((d3.p) obj).f21974a;
        y1 y1Var = new y1(this.f21905e, (ck.c) obj2);
        y1Var.f21904d = j;
        return y1Var.invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f21903c
            r1 = 3
            r2 = 2
            r3 = 1
            d0.z1 r4 = r14.f21905e
            dk.a r5 = dk.a.f22275a
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L29
            if (r0 == r2) goto L21
            if (r0 != r1) goto L19
            long r0 = r14.f21902b
            long r2 = r14.f21904d
            ci.b.D(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r2 = r14.f21902b
            long r6 = r14.f21904d
            ci.b.D(r15)
            goto L57
        L29:
            long r6 = r14.f21904d
            ci.b.D(r15)
            goto L41
        L2f:
            ci.b.D(r15)
            long r6 = r14.f21904d
            b2.e r15 = r4.f21924f
            r14.f21904d = r6
            r14.f21903c = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L41
            goto L6e
        L41:
            d3.p r15 = (d3.p) r15
            long r8 = r15.f21974a
            long r8 = d3.p.d(r6, r8)
            r14.f21904d = r6
            r14.f21902b = r8
            r14.f21903c = r2
            java.lang.Object r15 = r4.a(r8, r14)
            if (r15 != r5) goto L56
            goto L6e
        L56:
            r2 = r8
        L57:
            d3.p r15 = (d3.p) r15
            long r11 = r15.f21974a
            b2.e r8 = r4.f21924f
            long r9 = d3.p.d(r2, r11)
            r14.f21904d = r6
            r14.f21902b = r11
            r14.f21903c = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r2 = r6
            r0 = r11
        L71:
            d3.p r15 = (d3.p) r15
            long r4 = r15.f21974a
            long r0 = d3.p.d(r0, r4)
            long r0 = d3.p.d(r2, r0)
            d3.p r15 = new d3.p
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.y1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
