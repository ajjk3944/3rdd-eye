package pf;

import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31926b;

    /* renamed from: c, reason: collision with root package name */
    public int f31927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f31928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(c1 c1Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f31926b = i4;
        this.f31928d = c1Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f31926b) {
            case 0:
                return new y0(this.f31928d, cVar, 0);
            default:
                return new y0(this.f31928d, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f31926b) {
        }
        return ((y0) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31926b) {
            case 0:
                int i4 = this.f31927c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    c1 c1Var = this.f31928d;
                    al.v vVar = new al.v(c1Var.f31785e.getData(), new al.k0(c1Var, (ck.c) null));
                    al.o oVar = new al.o(3, c1Var);
                    this.f31927c = 1;
                    Object objA = vVar.a(oVar, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            default:
                int i10 = this.f31927c;
                ck.c cVar = null;
                c1 c1Var2 = this.f31928d;
                try {
                    if (i10 == 0) {
                        ci.b.D(obj);
                        p4.g gVar = c1Var2.f31785e;
                        a1 a1Var = new a1(c1Var2, cVar, 0);
                        this.f31927c = 1;
                        Object objA2 = gVar.a(a1Var, this);
                        dk.a aVar2 = dk.a.f22275a;
                        if (objA2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                    }
                } catch (Exception e2) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e2.getMessage());
                    j0 j0Var = c1Var2.f31787h;
                    if (j0Var == null) {
                        nk.k.k("localSessionData");
                        throw null;
                    }
                    c1Var2.f31787h = j0.a(j0Var, null, c1Var2.f31784d.a(), null, 5);
                }
                return yj.u.f37649a;
        }
    }
}
