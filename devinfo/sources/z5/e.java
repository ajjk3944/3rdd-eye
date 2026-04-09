package z5;

import t5.s;
import t5.v;
import t5.w;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public v f37928b;

    /* renamed from: c, reason: collision with root package name */
    public int f37929c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f37932f;
    public final /* synthetic */ mk.c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ck.c cVar, mk.c cVar2, s sVar, boolean z3) {
        super(2, cVar);
        this.f37931e = z3;
        this.f37932f = sVar;
        this.g = cVar2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        e eVar = new e(cVar, this.g, this.f37932f, this.f37931e);
        eVar.f37930d = obj;
        return eVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((w) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[PHI: r0 r11
  0x0073: PHI (r0v7 t5.w) = (r0v4 t5.w), (r0v13 t5.w) binds: [B:23:0x0070, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0073: PHI (r11v14 java.lang.Object) = (r11v12 java.lang.Object), (r11v0 java.lang.Object) binds: [B:23:0x0070, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[RETURN] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f37929c
            mk.c r1 = r10.g
            if (r0 == 0) goto L9c
            t5.s r2 = r10.f37932f
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            dk.a r7 = dk.a.f22275a
            if (r0 == r6) goto L37
            if (r0 == r5) goto L2d
            if (r0 == r4) goto L25
            if (r0 != r3) goto L1d
            java.lang.Object r0 = r10.f37930d
            ci.b.D(r11)
            goto L85
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            java.lang.Object r0 = r10.f37930d
            t5.w r0 = (t5.w) r0
            ci.b.D(r11)
            goto L73
        L2d:
            t5.v r0 = r10.f37928b
            java.lang.Object r5 = r10.f37930d
            t5.w r5 = (t5.w) r5
            ci.b.D(r11)
            goto L5a
        L37:
            t5.v r0 = r10.f37928b
            java.lang.Object r6 = r10.f37930d
            t5.w r6 = (t5.w) r6
            ci.b.D(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L5d
            t5.g r11 = r2.f()
            r10.f37930d = r6
            r10.f37928b = r0
            r10.f37929c = r5
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r7) goto L59
            goto L81
        L59:
            r5 = r6
        L5a:
            r11 = r0
            r0 = r5
            goto L5f
        L5d:
            r11 = r0
            r0 = r6
        L5f:
            te.b r5 = new te.b
            r6 = 2
            r8 = 0
            r5.<init>(r8, r1, r6)
            r10.f37930d = r0
            r10.f37928b = r8
            r10.f37929c = r4
            java.lang.Object r11 = r0.b(r11, r5, r10)
            if (r11 != r7) goto L73
            goto L81
        L73:
            boolean r1 = r10.f37931e
            if (r1 != 0) goto L9b
            r10.f37930d = r11
            r10.f37929c = r3
            java.lang.Object r0 = r0.d(r10)
            if (r0 != r7) goto L82
        L81:
            return r7
        L82:
            r9 = r0
            r0 = r11
            r11 = r9
        L85:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L9a
            t5.g r11 = r2.f()
            t5.f0 r1 = r11.f34236b
            r0.i0 r2 = r11.f34239e
            t5.f r11 = r11.f34240f
            r1.e(r2, r11)
        L9a:
            return r0
        L9b:
            return r11
        L9c:
            ci.b.D(r11)
            java.lang.Object r11 = r10.f37930d
            t5.w r11 = (t5.w) r11
            java.lang.String r0 = "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"
            nk.k.c(r11, r0)
            v5.s r11 = (v5.s) r11
            d6.a r11 = r11.c()
            java.lang.Object r11 = r1.invoke(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
