package u6;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import xk.a1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35107b;

    /* renamed from: c, reason: collision with root package name */
    public int f35108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f35109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f35107b = i4;
        this.f35109d = c0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f35107b) {
            case 0:
                return new a0(this.f35109d, cVar, 0);
            default:
                return new a0(this.f35109d, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f35107b) {
        }
        return ((a0) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object wVar;
        switch (this.f35107b) {
            case 0:
                int i4 = this.f35108c;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                this.f35108c = 1;
                Object objA = c0.a(this.f35109d, this);
                dk.a aVar = dk.a.f22275a;
                return objA == aVar ? aVar : objA;
            default:
                int i10 = this.f35108c;
                c0 c0Var = this.f35109d;
                try {
                    if (i10 == 0) {
                        ci.b.D(obj);
                        a1 a1Var = c0Var.f35143n;
                        a0 a0Var = new a0(c0Var, null, 0);
                        this.f35108c = 1;
                        obj = xk.x.E(a1Var, a0Var, this);
                        dk.a aVar2 = dk.a.f22275a;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                    }
                    wVar = (z) obj;
                } catch (u e2) {
                    wVar = new y(e2.f35192a);
                } catch (CancellationException unused) {
                    wVar = new w();
                } catch (Throwable th2) {
                    t6.v.e().d(d0.f35146a, "Unexpected error in WorkerWrapper", th2);
                    wVar = new w();
                }
                Object objN = c0Var.f35139i.n(new f7.e(2, wVar, c0Var));
                nk.k.d(objN, "runInTransaction(...)");
                return objN;
        }
    }
}
