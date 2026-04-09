package bh;

import al.f0;
import al.z0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.ApiException;
import hh.y;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2238b;

    /* renamed from: c, reason: collision with root package name */
    public int f2239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f2240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2241e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2242f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Serializable serializable, Object obj, int i4, ck.c cVar, int i10) {
        super(2, cVar);
        this.f2238b = i10;
        this.f2240d = serializable;
        this.f2242f = obj;
        this.f2241e = i4;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2238b) {
            case 0:
                return new u((String) this.f2240d, (w) this.f2242f, this.f2241e, cVar, 0);
            case 1:
                u uVar = new u((String) this.f2240d, this.f2241e, cVar);
                uVar.f2242f = obj;
                return uVar;
            case 2:
                return new u((String) this.f2240d, this.f2241e, (y) this.f2242f, cVar);
            default:
                return new u((ArrayList) this.f2240d, (jj.c) this.f2242f, this.f2241e, cVar, 3);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2238b) {
        }
        return ((u) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f2238b;
        int i10 = 4;
        yj.u uVar = yj.u.f37649a;
        ck.c cVar = null;
        int i11 = 0;
        int i12 = this.f2241e;
        Serializable serializable = this.f2240d;
        dk.a aVar = dk.a.f22275a;
        int i13 = 2;
        switch (i4) {
            case 0:
                String str = (String) serializable;
                w wVar = (w) this.f2242f;
                int i14 = this.f2239c;
                if (i14 == 0) {
                    ci.b.D(obj);
                    ch.f fVar = ch.e.f2868a;
                    this.f2239c = 1;
                    f0 f0Var = new f0(new ch.a(str, i13, cVar));
                    if (f0Var != aVar) {
                        obj = f0Var;
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
                al.v vVar = new al.v(new al.v(new k(wVar, cVar, i13), (al.h) obj), new l(wVar, cVar, i10));
                t tVar = new t(wVar, i12, str, (ck.c) null);
                this.f2239c = 2;
                if (z0.h(vVar, tVar, this) != aVar) {
                    return uVar;
                }
                return aVar;
            case 1:
                al.i iVar = (al.i) this.f2242f;
                int i15 = this.f2239c;
                try {
                } catch (km.s e2) {
                    yj.l lVar = new yj.l(ci.b.h(new ApiException(e2.f28456a, e2.f28457b)));
                    this.f2242f = null;
                    this.f2239c = 2;
                    if (iVar.c(lVar, this) != aVar) {
                        return uVar;
                    }
                }
                if (i15 == 0) {
                    ci.b.D(obj);
                    this.f2242f = iVar;
                    this.f2239c = 1;
                    String string = fi.a.f24058a.getString(R.string._current_language);
                    nk.k.d(string, "getString(...)");
                    obj = ch.e.f2868a.d((String) serializable, i12, string, this);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                if (i15 != 1) {
                    if (i15 != 2 && i15 != 3 && i15 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                fh.e eVar = (fh.e) obj;
                if (eVar.d()) {
                    yj.l lVar2 = new yj.l(uVar);
                    this.f2242f = null;
                    this.f2239c = 3;
                    if (iVar.c(lVar2, this) != aVar) {
                        return uVar;
                    }
                } else {
                    yj.l lVar3 = new yj.l(ci.b.h(new ApiException(eVar.c(), null, 2, null)));
                    this.f2242f = null;
                    this.f2239c = 4;
                    if (iVar.c(lVar3, this) != aVar) {
                        return uVar;
                    }
                }
                return aVar;
            case 2:
                y yVar = (y) this.f2242f;
                int i16 = this.f2239c;
                if (i16 == 0) {
                    ci.b.D(obj);
                    ch.f fVar2 = ch.e.f2868a;
                    this.f2239c = 1;
                    f0 f0Var2 = new f0(new u((String) serializable, i12, null));
                    if (f0Var2 != aVar) {
                        obj = f0Var2;
                    }
                    return aVar;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                al.v vVar2 = new al.v(new al.v(new hh.w(yVar, cVar, i11), (al.h) obj), new hh.x(yVar, cVar, i11));
                androidx.lifecycle.u uVar2 = new androidx.lifecycle.u(yVar, cVar, 5);
                this.f2239c = 2;
                if (z0.h(vVar2, uVar2, this) != aVar) {
                    return uVar;
                }
                return aVar;
            default:
                int i17 = this.f2239c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                jj.c cVar2 = (jj.c) this.f2242f;
                this.f2239c = 1;
                xk.h hVar = new xk.h(1, a.a.r(this));
                hVar.s();
                wi.c.d((ArrayList) serializable, new jj.a(0, hVar), new jj.b(cVar2, i12, hVar));
                Object objR = hVar.r();
                return objR == aVar ? aVar : objR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, int i4, ck.c cVar) {
        super(2, cVar);
        this.f2238b = 1;
        this.f2240d = str;
        this.f2241e = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, int i4, y yVar, ck.c cVar) {
        super(2, cVar);
        this.f2238b = 2;
        this.f2240d = str;
        this.f2241e = i4;
        this.f2242f = yVar;
    }
}
