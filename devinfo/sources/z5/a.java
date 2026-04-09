package z5;

import t5.s;
import t5.v;
import t5.w;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public v f37908b;

    /* renamed from: c, reason: collision with root package name */
    public int f37909c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f37912f;
    public final /* synthetic */ s g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mk.c f37913h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ck.c cVar, mk.c cVar2, s sVar, boolean z3, boolean z10) {
        super(2, cVar);
        this.f37911e = z3;
        this.f37912f = z10;
        this.g = sVar;
        this.f37913h = cVar2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        a aVar = new a(cVar, this.f37913h, this.g, this.f37911e, this.f37912f);
        aVar.f37910d = obj;
        return aVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((w) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[PHI: r0 r12
  0x009f: PHI (r0v12 t5.w) = (r0v9 t5.w), (r0v19 t5.w) binds: [B:34:0x009c, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r12v17 java.lang.Object) = (r12v15 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x009c, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5 A[RETURN] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
