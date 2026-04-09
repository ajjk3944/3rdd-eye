package bh;

import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.User;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2213b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2214c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(w wVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2213b = i4;
        this.f2215d = wVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2213b) {
            case 0:
                n nVar = new n(this.f2215d, cVar, 0);
                nVar.f2214c = ((yj.l) obj).f37641a;
                return nVar;
            case 1:
                n nVar2 = new n(this.f2215d, cVar, 1);
                nVar2.f2214c = ((yj.l) obj).f37641a;
                return nVar2;
            default:
                n nVar3 = new n(this.f2215d, cVar, 2);
                nVar3.f2214c = ((yj.l) obj).f37641a;
                return nVar3;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        yj.l lVar = (yj.l) obj;
        switch (this.f2213b) {
            case 0:
                Object obj3 = lVar.f37641a;
                n nVar = new n(this.f2215d, (ck.c) obj2, 0);
                nVar.f2214c = obj3;
                yj.u uVar = yj.u.f37649a;
                nVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                Object obj4 = lVar.f37641a;
                n nVar2 = new n(this.f2215d, (ck.c) obj2, 1);
                nVar2.f2214c = obj4;
                yj.u uVar2 = yj.u.f37649a;
                nVar2.invokeSuspend(uVar2);
                return uVar2;
            default:
                Object obj5 = lVar.f37641a;
                n nVar3 = new n(this.f2215d, (ck.c) obj2, 2);
                nVar3.f2214c = obj5;
                yj.u uVar3 = yj.u.f37649a;
                nVar3.invokeSuspend(uVar3);
                return uVar3;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2213b) {
            case 0:
                w wVar = this.f2215d;
                wi.e eVar = wVar.f2249h;
                Object obj2 = this.f2214c;
                ci.b.D(obj);
                fh.e eVar2 = (fh.e) (obj2 instanceof yj.k ? null : obj2);
                if (eVar2 != null) {
                    if (eVar2.b() == null) {
                        w.g(wVar, new NullPointerException("null data in result for bind order"));
                    } else {
                        c.f2188a.e(((fh.f) eVar2.b()).b());
                        if (((fh.f) eVar2.b()).a()) {
                            eVar.h(Boolean.TRUE);
                        } else {
                            eVar.h(Boolean.FALSE);
                        }
                    }
                }
                Throwable thA = yj.l.a(obj2);
                if (thA != null) {
                    w.g(wVar, thA);
                }
                return yj.u.f37649a;
            case 1:
                Object obj3 = this.f2214c;
                ci.b.D(obj);
                fh.e eVar3 = (fh.e) (obj3 instanceof yj.k ? null : obj3);
                w wVar2 = this.f2215d;
                if (eVar3 != null) {
                    if (eVar3.b() != null) {
                        throw new UnsupportedOperationException();
                    }
                    w.i(wVar2, new NullPointerException("null data in result when prepay"));
                }
                Throwable thA2 = yj.l.a(obj3);
                if (thA2 != null) {
                    w.i(wVar2, thA2);
                }
                return yj.u.f37649a;
            default:
                w wVar3 = this.f2215d;
                wi.e eVar4 = wVar3.f2246d;
                Object obj4 = this.f2214c;
                ci.b.D(obj);
                fh.e eVar5 = (fh.e) (obj4 instanceof yj.k ? null : obj4);
                if (eVar5 != null) {
                    if (eVar5.b() == null) {
                        w.l(wVar3, new NullPointerException("null data in result"));
                    } else {
                        c.f2188a.e((User) eVar5.b());
                        if (((User) eVar5.b()).getVip().getAvailable()) {
                            eVar4.h(hg.e.e(R.string.pro_version_activaed));
                        } else {
                            eVar4.h(hg.e.e(R.string.no_purchase_history_found));
                        }
                    }
                }
                Throwable thA3 = yj.l.a(obj4);
                if (thA3 != null) {
                    w.l(wVar3, thA3);
                }
                return yj.u.f37649a;
        }
    }
}
