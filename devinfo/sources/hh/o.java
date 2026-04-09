package hh;

import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import com.liuzh.deviceinfo.pro.account.mode.LoginData;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25109b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f25109b = i4;
        this.f25111d = qVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f25109b) {
            case 0:
                o oVar = new o(this.f25111d, cVar, 0);
                oVar.f25110c = ((yj.l) obj).f37641a;
                return oVar;
            default:
                o oVar2 = new o(this.f25111d, cVar, 1);
                oVar2.f25110c = ((yj.l) obj).f37641a;
                return oVar2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        yj.l lVar = (yj.l) obj;
        switch (this.f25109b) {
            case 0:
                Object obj3 = lVar.f37641a;
                o oVar = new o(this.f25111d, (ck.c) obj2, 0);
                oVar.f25110c = obj3;
                yj.u uVar = yj.u.f37649a;
                oVar.invokeSuspend(uVar);
                return uVar;
            default:
                Object obj4 = lVar.f37641a;
                o oVar2 = new o(this.f25111d, (ck.c) obj2, 1);
                oVar2.f25110c = obj4;
                yj.u uVar2 = yj.u.f37649a;
                oVar2.invokeSuspend(uVar2);
                return uVar2;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25109b) {
            case 0:
                q qVar = this.f25111d;
                Object obj2 = this.f25110c;
                ci.b.D(obj);
                fh.e eVar = (fh.e) (obj2 instanceof yj.k ? null : obj2);
                if (eVar != null) {
                    if (eVar.b() == null) {
                        q.g(qVar, new NullPointerException("null data in result"));
                    } else {
                        bh.c cVar = bh.c.f2188a;
                        LoginData loginData = (LoginData) eVar.b();
                        cVar.getClass();
                        nk.k.e(loginData, "data");
                        bh.c.f2189b.edit().putString("user_info", bh.c.f2191d.g(loginData.getUser())).putString("ltoken", loginData.getLtoken()).apply();
                        if (loginData.getUser().getVip().getAvailable()) {
                            ah.o oVar = ah.o.f400d;
                            oVar.g(oVar.c());
                        } else {
                            ah.o oVar2 = ah.o.f400d;
                            oVar2.g(oVar2.c());
                        }
                        synchronized (cVar) {
                            bi.d.b(new o0(4, loginData));
                        }
                        l0 l0Var = qVar.f25121f;
                        Object objB = eVar.b();
                        nk.k.b(objB);
                        l0Var.h(objB);
                    }
                }
                Throwable thA = yj.l.a(obj2);
                if (thA != null) {
                    q.g(qVar, thA);
                }
                return yj.u.f37649a;
            default:
                q qVar2 = this.f25111d;
                Object obj3 = this.f25110c;
                ci.b.D(obj);
                if (((yj.u) (obj3 instanceof yj.k ? null : obj3)) != null) {
                    qVar2.f25122h.h(Boolean.TRUE);
                }
                Throwable thA2 = yj.l.a(obj3);
                if (thA2 != null) {
                    wi.e eVar2 = qVar2.f25117b;
                    String message = thA2.getMessage();
                    if (message == null) {
                        message = a0.g.o("error@", thA2);
                    }
                    eVar2.h(message);
                }
                return yj.u.f37649a;
        }
    }
}
