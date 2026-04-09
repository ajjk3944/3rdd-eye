package t6;

import androidx.work.CoroutineWorker;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34346b;

    /* renamed from: c, reason: collision with root package name */
    public int f34347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f34348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CoroutineWorker coroutineWorker, ck.c cVar, int i4) {
        super(2, cVar);
        this.f34346b = i4;
        this.f34348d = coroutineWorker;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f34346b) {
            case 0:
                return new g(this.f34348d, cVar, 0);
            default:
                return new g(this.f34348d, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f34346b) {
            case 0:
                g gVar = (g) create(vVar, cVar);
                yj.u uVar = yj.u.f37649a;
                gVar.invokeSuspend(uVar);
                return uVar;
            default:
                return ((g) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f34346b) {
            case 0:
                int i4 = this.f34347c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    this.f34347c = 1;
                    throw new IllegalStateException("Not implemented");
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ci.b.D(obj);
                return obj;
            default:
                int i10 = this.f34347c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                this.f34347c = 1;
                Object objA = this.f34348d.a(this);
                dk.a aVar = dk.a.f22275a;
                return objA == aVar ? aVar : objA;
        }
    }
}
