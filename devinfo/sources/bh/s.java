package bh;

import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.Sku;
import com.liuzh.deviceinfo.pro.account.mode.User;
import hh.y;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2228b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg.e f2230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, WeakReference weakReference, String str, ck.c cVar) {
        super(2, cVar);
        this.f2228b = 0;
        this.f2230d = wVar;
        this.f2232f = weakReference;
        this.f2231e = str;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2228b) {
            case 0:
                s sVar = new s((w) this.f2230d, (WeakReference) this.f2232f, this.f2231e, cVar);
                sVar.f2229c = ((yj.l) obj).f37641a;
                return sVar;
            case 1:
                s sVar2 = new s((w) this.f2230d, this.f2231e, (si.c) this.f2232f, cVar, 1);
                sVar2.f2229c = ((yj.l) obj).f37641a;
                return sVar2;
            default:
                s sVar3 = new s((y) this.f2230d, this.f2231e, (String) this.f2232f, cVar, 2);
                sVar3.f2229c = ((yj.l) obj).f37641a;
                return sVar3;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        yj.l lVar = (yj.l) obj;
        switch (this.f2228b) {
            case 0:
                Object obj3 = lVar.f37641a;
                s sVar = new s((w) this.f2230d, (WeakReference) this.f2232f, this.f2231e, (ck.c) obj2);
                sVar.f2229c = obj3;
                yj.u uVar = yj.u.f37649a;
                sVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                Object obj4 = lVar.f37641a;
                String str = this.f2231e;
                s sVar2 = new s((w) this.f2230d, str, (si.c) this.f2232f, (ck.c) obj2, 1);
                sVar2.f2229c = obj4;
                yj.u uVar2 = yj.u.f37649a;
                sVar2.invokeSuspend(uVar2);
                return uVar2;
            default:
                Object obj5 = lVar.f37641a;
                String str2 = this.f2231e;
                s sVar3 = new s((y) this.f2230d, str2, (String) this.f2232f, (ck.c) obj2, 2);
                sVar3.f2229c = obj5;
                yj.u uVar3 = yj.u.f37649a;
                sVar3.invokeSuspend(uVar3);
                return uVar3;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2228b) {
            case 0:
                w wVar = (w) this.f2230d;
                l0 l0Var = wVar.f2244b;
                wi.e eVar = wVar.f2246d;
                Object obj2 = this.f2229c;
                ci.b.D(obj);
                fh.e eVar2 = (fh.e) (obj2 instanceof yj.k ? null : obj2);
                if (eVar2 != null) {
                    if (eVar2.b() == null) {
                        w.j(wVar, new NullPointerException("null data in result"));
                    } else {
                        c.f2188a.e((User) eVar2.b());
                        if (((User) eVar2.b()).getVip().getAvailable()) {
                            eVar.h(hg.e.e(R.string.pro_version_activaed));
                            l0Var.h(new ng.a(false));
                        } else {
                            Sku sku = wVar.f2252l;
                            r5.c.t(false, l0Var);
                        }
                    }
                }
                Throwable thA = yj.l.a(obj2);
                if (thA != null) {
                    w.j(wVar, thA);
                }
                break;
            case 1:
                w wVar2 = (w) this.f2230d;
                Object obj3 = this.f2229c;
                ci.b.D(obj);
                fh.e eVar3 = (fh.e) (obj3 instanceof yj.k ? null : obj3);
                if (eVar3 != null) {
                    si.c cVar = (si.c) this.f2232f;
                    if (eVar3.b() == null) {
                        w.m(wVar2, new NullPointerException("null data in result."));
                    } else {
                        c.f2188a.e((User) eVar3.b());
                        String str = cVar.f33799b;
                        ah.o.f400d.p(fi.a.f24058a, str, new yb.e(wVar2, this.f2231e, str, 3));
                    }
                }
                Throwable thA2 = yj.l.a(obj3);
                if (thA2 != null) {
                    w.m(wVar2, thA2);
                }
                break;
            default:
                y yVar = (y) this.f2230d;
                Object obj4 = this.f2229c;
                ci.b.D(obj);
                if (((yj.u) (obj4 instanceof yj.k ? null : obj4)) != null) {
                    yVar.f25147h.h(new hh.s(this.f2231e, (String) this.f2232f));
                }
                Throwable thA3 = yj.l.a(obj4);
                if (thA3 != null) {
                    wi.e eVar4 = yVar.f25142b;
                    String message = thA3.getMessage();
                    if (message == null) {
                        message = a0.g.o("error@", thA3);
                    }
                    eVar4.h(message);
                }
                break;
        }
        return yj.u.f37649a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(hg.e eVar, String str, Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2228b = i4;
        this.f2230d = eVar;
        this.f2231e = str;
        this.f2232f = obj;
    }
}
