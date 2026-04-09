package bh;

import al.f0;
import al.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2222b;

    /* renamed from: c, reason: collision with root package name */
    public int f2223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f2226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, long j, w wVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2222b = i4;
        this.f2224d = str;
        this.f2225e = j;
        this.f2226f = wVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2222b) {
            case 0:
                return new q(this.f2224d, this.f2225e, this.f2226f, cVar, 0);
            default:
                return new q(this.f2224d, this.f2225e, this.f2226f, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2222b) {
        }
        return ((q) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f2222b;
        yj.u uVar = yj.u.f37649a;
        dk.a aVar = dk.a.f22275a;
        w wVar = this.f2226f;
        switch (i4) {
            case 0:
                int i10 = this.f2223c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                ch.i iVar = ch.h.f2874a;
                al.v vVar = new al.v(new f0(new ch.g(this.f2224d, this.f2225e, null, 0)), new l(wVar, null, 1));
                al.p pVar = new al.p(wVar, (ck.c) null, 4);
                this.f2223c = 1;
                return z0.h(vVar, pVar, this) == aVar ? aVar : uVar;
            default:
                int i11 = this.f2223c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                ch.i iVar2 = ch.h.f2874a;
                al.t tVar = new al.t(new al.v(new f0(new ch.g(this.f2224d, this.f2225e, null, 1)), new l(wVar, null, 2)), new m(wVar, null, 3));
                n nVar = new n(wVar, null, 1);
                this.f2223c = 1;
                return z0.h(tVar, nVar, this) == aVar ? aVar : uVar;
        }
    }
}
