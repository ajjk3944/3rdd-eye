package bh;

import al.f0;
import al.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2216b;

    /* renamed from: c, reason: collision with root package name */
    public int f2217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f2220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, String str2, w wVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2216b = i4;
        this.f2218d = str;
        this.f2219e = str2;
        this.f2220f = wVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2216b) {
            case 0:
                return new o(this.f2218d, this.f2219e, this.f2220f, cVar, 0);
            default:
                return new o(this.f2218d, this.f2219e, this.f2220f, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2216b) {
        }
        return ((o) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f2216b;
        yj.u uVar = yj.u.f37649a;
        String str = this.f2219e;
        String str2 = this.f2218d;
        dk.a aVar = dk.a.f22275a;
        ck.c cVar = null;
        w wVar = this.f2220f;
        int i10 = 1;
        int i11 = 2;
        int i12 = 0;
        switch (i4) {
            case 0:
                int i13 = this.f2217c;
                if (i13 == 0) {
                    ci.b.D(obj);
                    ch.f fVar = ch.e.f2868a;
                    this.f2217c = 1;
                    obj = new f0(new ch.d(new al.l(str2, str, cVar, i10), (ck.c) null));
                    if (obj != aVar) {
                    }
                    return aVar;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                al.t tVar = new al.t(new al.v(new al.v(new k(wVar, cVar, i12), (al.h) obj), new l(wVar, cVar, i12)), new m(wVar, cVar, i12));
                n nVar = new n(wVar, cVar, i12);
                this.f2217c = 2;
                if (z0.h(tVar, nVar, this) != aVar) {
                    return uVar;
                }
                return aVar;
            default:
                int i14 = this.f2217c;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                ch.i iVar = ch.h.f2874a;
                al.t tVar2 = new al.t(new al.v(new al.v(new p(i11, cVar, i12), new f0(new ch.b(str2, 3, str, cVar))), new m(wVar, cVar, i10)), new m(wVar, cVar, i11));
                ah.a aVar2 = new ah.a(i11, cVar, i11);
                this.f2217c = 1;
                return z0.h(tVar2, aVar2, this) == aVar ? aVar : uVar;
        }
    }
}
