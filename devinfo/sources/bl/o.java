package bl;

import al.f0;
import al.z0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.ApiException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2313b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f2314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2315d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f2317f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, int i4, String str2, ck.c cVar) {
        super(2, cVar);
        this.f2317f = str;
        this.g = str2;
        this.f2315d = i4;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2313b) {
            case 0:
                return new o((al.h[]) this.f2316e, this.f2315d, (AtomicInteger) this.f2317f, (zk.h) this.g, cVar);
            case 1:
                o oVar = new o((String) this.f2317f, this.f2315d, (String) this.g, cVar);
                oVar.f2316e = obj;
                return oVar;
            default:
                return new o((String) this.f2316e, (String) this.f2317f, this.f2315d, (hh.y) this.g, cVar);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2313b) {
            case 0:
                return ((o) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                return ((o) create((al.i) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((o) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object f0Var;
        int i4 = this.f2313b;
        int i10 = this.f2315d;
        yj.u uVar = yj.u.f37649a;
        dk.a aVar = dk.a.f22275a;
        Object obj2 = this.g;
        Serializable serializable = this.f2317f;
        switch (i4) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) serializable;
                zk.h hVar = (zk.h) obj2;
                int i11 = this.f2314c;
                try {
                    if (i11 == 0) {
                        ci.b.D(obj);
                        al.h hVar2 = ((al.h[]) this.f2316e)[i10];
                        n nVar = new n(hVar, i10);
                        this.f2314c = 1;
                        if (hVar2.a(nVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return uVar;
                    }
                    hVar.j(null);
                    return uVar;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        hVar.j(null);
                    }
                }
            case 1:
                al.i iVar = (al.i) this.f2316e;
                int i12 = this.f2314c;
                try {
                } catch (km.s e2) {
                    yj.l lVar = new yj.l(ci.b.h(new ApiException(e2.f28456a, e2.f28457b)));
                    this.f2316e = null;
                    this.f2314c = 2;
                    if (iVar.c(lVar, this) != aVar) {
                        return uVar;
                    }
                }
                if (i12 == 0) {
                    ci.b.D(obj);
                    ch.f fVar = ch.e.f2868a;
                    String str = (String) serializable;
                    String str2 = (String) obj2;
                    int i13 = this.f2315d;
                    this.f2316e = iVar;
                    this.f2314c = 1;
                    String string = fi.a.f24058a.getString(R.string._current_language);
                    nk.k.d(string, "getString(...)");
                    objC = fVar.c(str, str2, i13, string, this);
                    if (objC == aVar) {
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3 && i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                objC = obj;
                fh.e eVar = (fh.e) objC;
                if (eVar.d()) {
                    yj.l lVar2 = new yj.l(uVar);
                    this.f2316e = null;
                    this.f2314c = 3;
                    if (iVar.c(lVar2, this) != aVar) {
                        return uVar;
                    }
                } else {
                    yj.l lVar3 = new yj.l(ci.b.h(new ApiException(eVar.c(), null, 2, null)));
                    this.f2316e = null;
                    this.f2314c = 4;
                    if (iVar.c(lVar3, this) != aVar) {
                        return uVar;
                    }
                }
                return aVar;
            default:
                String str3 = (String) serializable;
                String str4 = (String) this.f2316e;
                hh.y yVar = (hh.y) obj2;
                int i14 = this.f2314c;
                ck.c cVar = null;
                if (i14 == 0) {
                    ci.b.D(obj);
                    ch.f fVar2 = ch.e.f2868a;
                    this.f2314c = 1;
                    f0Var = new f0(new o(str4, i10, str3, null));
                    if (f0Var != aVar) {
                    }
                    return aVar;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                f0Var = obj;
                al.t tVar = new al.t(new al.v(new al.v(new hh.w(yVar, null, 1), (al.h) f0Var), new hh.x(yVar, null, 1)), new dh.f(yVar, null, 2));
                bh.s sVar = new bh.s(yVar, str4, str3, cVar, 2);
                this.f2314c = 2;
                if (z0.h(tVar, sVar, this) != aVar) {
                    return uVar;
                }
                return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, int i4, hh.y yVar, ck.c cVar) {
        super(2, cVar);
        this.f2316e = str;
        this.f2317f = str2;
        this.f2315d = i4;
        this.g = yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(al.h[] hVarArr, int i4, AtomicInteger atomicInteger, zk.h hVar, ck.c cVar) {
        super(2, cVar);
        this.f2316e = hVarArr;
        this.f2315d = i4;
        this.f2317f = atomicInteger;
        this.g = hVar;
    }
}
