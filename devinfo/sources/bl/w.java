package bl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends ek.c implements al.i {

    /* renamed from: a, reason: collision with root package name */
    public final al.i f2332a;

    /* renamed from: b, reason: collision with root package name */
    public final ck.h f2333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2334c;

    /* renamed from: d, reason: collision with root package name */
    public ck.h f2335d;

    /* renamed from: e, reason: collision with root package name */
    public ck.c f2336e;

    public w(al.i iVar, ck.h hVar) {
        super(t.f2329a, ck.i.f2898a);
        this.f2332a = iVar;
        this.f2333b = hVar;
        this.f2334c = ((Number) hVar.G(0, new v(0))).intValue();
    }

    @Override // al.i
    public final Object c(Object obj, ck.c cVar) {
        try {
            Object objD = d(cVar, obj);
            return objD == dk.a.f22275a ? objD : yj.u.f37649a;
        } catch (Throwable th2) {
            this.f2335d = new q(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object d(ck.c cVar, Object obj) {
        ck.h context = cVar.getContext();
        xk.x.j(context);
        ck.h hVar = this.f2335d;
        if (hVar != context) {
            if (hVar instanceof q) {
                throw new IllegalStateException(vk.j.l0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) hVar).f2327b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.G(0, new z(0, this))).intValue() != this.f2334c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f2333b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f2335d = context;
        }
        this.f2336e = cVar;
        mk.f fVar = y.f2338a;
        al.i iVar = this.f2332a;
        nk.k.c(iVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objA = fVar.a(iVar, obj, this);
        if (!nk.k.a(objA, dk.a.f22275a)) {
            this.f2336e = null;
        }
        return objA;
    }

    @Override // ek.a, ek.d
    public final ek.d getCallerFrame() {
        ck.c cVar = this.f2336e;
        if (cVar instanceof ek.d) {
            return (ek.d) cVar;
        }
        return null;
    }

    @Override // ek.c, ck.c
    public final ck.h getContext() {
        ck.h hVar = this.f2335d;
        return hVar == null ? ck.i.f2898a : hVar;
    }

    @Override // ek.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = yj.l.a(obj);
        if (thA != null) {
            this.f2335d = new q(getContext(), thA);
        }
        ck.c cVar = this.f2336e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return dk.a.f22275a;
    }
}
