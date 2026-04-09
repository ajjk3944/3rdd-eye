package c0;

import d0.x1;
import d0.z1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2366b;

    /* renamed from: c, reason: collision with root package name */
    public int f2367c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2368d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2370f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, long j, Object obj2, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2366b = i4;
        this.f2370f = obj;
        this.f2368d = j;
        this.g = obj2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2366b) {
            case 0:
                return new b((xk.y0) this.f2370f, this.f2368d, (e0.i) this.g, cVar, 0);
            case 1:
                b bVar = new b((String) this.f2370f, (String) this.g, this.f2368d, cVar, 1);
                bVar.f2369e = obj;
                return bVar;
            case 2:
                b bVar2 = new b((z1) this.f2370f, this.f2368d, (nk.r) this.g, cVar, 2);
                bVar2.f2369e = obj;
                return bVar2;
            default:
                return new b((j0.s) this.f2370f, (a0.z) this.g, this.f2368d, cVar, 3);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2366b) {
            case 0:
                return ((b) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                return ((b) create((al.i) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 2:
                return ((b) create((x1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((b) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (a0.e.c(r2, r3, r12, r3, r4, 4) != r10) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, long j, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2366b = i4;
        this.f2370f = obj;
        this.g = obj2;
        this.f2368d = j;
    }
}
