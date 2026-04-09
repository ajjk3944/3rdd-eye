package hh;

import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.User;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25081b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25082c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f25083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f25081b = i4;
        this.f25083d = iVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f25081b) {
            case 0:
                g gVar = new g(this.f25083d, cVar, 0);
                gVar.f25082c = ((yj.l) obj).f37641a;
                return gVar;
            case 1:
                g gVar2 = new g(this.f25083d, cVar, 1);
                gVar2.f25082c = ((yj.l) obj).f37641a;
                return gVar2;
            default:
                g gVar3 = new g(this.f25083d, cVar, 2);
                gVar3.f25082c = ((yj.l) obj).f37641a;
                return gVar3;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        yj.l lVar = (yj.l) obj;
        switch (this.f25081b) {
            case 0:
                Object obj3 = lVar.f37641a;
                g gVar = new g(this.f25083d, (ck.c) obj2, 0);
                gVar.f25082c = obj3;
                yj.u uVar = yj.u.f37649a;
                gVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                Object obj4 = lVar.f37641a;
                g gVar2 = new g(this.f25083d, (ck.c) obj2, 1);
                gVar2.f25082c = obj4;
                yj.u uVar2 = yj.u.f37649a;
                gVar2.invokeSuspend(uVar2);
                return uVar2;
            default:
                Object obj5 = lVar.f37641a;
                g gVar3 = new g(this.f25083d, (ck.c) obj2, 2);
                gVar3.f25082c = obj5;
                yj.u uVar3 = yj.u.f37649a;
                gVar3.invokeSuspend(uVar3);
                return uVar3;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25081b) {
            case 0:
                Object obj2 = this.f25082c;
                ci.b.D(obj);
                yj.u uVar = (yj.u) (obj2 instanceof yj.k ? null : obj2);
                i iVar = this.f25083d;
                if (uVar != null) {
                    iVar.f25095m.start();
                    iVar.f25086b.h(hg.e.e(R.string.send_verify_code_success));
                }
                Throwable thA = yj.l.a(obj2);
                if (thA != null) {
                    i.g(iVar, thA);
                }
                break;
            case 1:
                Object obj3 = this.f25082c;
                ci.b.D(obj);
                yj.u uVar2 = (yj.u) (obj3 instanceof yj.k ? null : obj3);
                i iVar2 = this.f25083d;
                if (uVar2 != null) {
                    iVar2.f25094l.start();
                    iVar2.f25086b.h(hg.e.e(R.string.send_verify_code_success));
                }
                Throwable thA2 = yj.l.a(obj3);
                if (thA2 != null) {
                    i.h(iVar2, thA2);
                }
                break;
            default:
                Object obj4 = this.f25082c;
                ci.b.D(obj);
                fh.e eVar = (fh.e) (obj4 instanceof yj.k ? null : obj4);
                i iVar3 = this.f25083d;
                if (eVar != null) {
                    if (eVar.b() == null) {
                        i.i(iVar3, new NullPointerException("null data in result."));
                    } else {
                        l0 l0Var = iVar3.j;
                        Object objB = eVar.b();
                        nk.k.b(objB);
                        l0Var.h(objB);
                        bh.c.f2188a.e((User) eVar.b());
                    }
                }
                Throwable thA3 = yj.l.a(obj4);
                if (thA3 != null) {
                    i.i(iVar3, thA3);
                }
                break;
        }
        return yj.u.f37649a;
    }
}
