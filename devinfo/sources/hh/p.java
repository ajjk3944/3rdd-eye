package hh;

import al.f0;
import al.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25112b;

    /* renamed from: c, reason: collision with root package name */
    public int f25113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f25115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f25116f;
    public final /* synthetic */ q g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, String str2, String str3, q qVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f25112b = i4;
        this.f25114d = str;
        this.f25115e = str2;
        this.f25116f = str3;
        this.g = qVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f25112b) {
            case 0:
                return new p(this.f25114d, this.f25115e, this.f25116f, this.g, cVar, 0);
            default:
                return new p(this.f25114d, this.f25115e, this.f25116f, this.g, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f25112b) {
        }
        return ((p) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f25112b;
        yj.u uVar = yj.u.f37649a;
        dk.a aVar = dk.a.f22275a;
        q qVar = this.g;
        int i10 = 1;
        switch (i4) {
            case 0:
                int i11 = this.f25113c;
                ck.c cVar = null;
                if (i11 == 0) {
                    ci.b.D(obj);
                    ch.f fVar = ch.e.f2868a;
                    this.f25113c = 1;
                    obj = new f0(new ch.c(this.f25114d, this.f25115e, 0, this.f25116f, null));
                    if (obj != aVar) {
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                al.v vVar = new al.v(new al.t(new al.v(new l(qVar, null, 0), (al.h) obj), new m(qVar, null, 0)), new n(qVar, null, 0));
                o oVar = new o(qVar, cVar, 0);
                this.f25113c = 2;
                if (z0.h(vVar, oVar, this) != aVar) {
                    return uVar;
                }
                return aVar;
            default:
                int i12 = this.f25113c;
                ck.c cVar2 = null;
                if (i12 == 0) {
                    ci.b.D(obj);
                    ch.f fVar2 = ch.e.f2868a;
                    this.f25113c = 1;
                    obj = new f0(new ch.c(this.f25114d, this.f25115e, 1, this.f25116f, null));
                    if (obj != aVar) {
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                al.v vVar2 = new al.v(new al.t(new al.v(new l(qVar, null, 1), (al.h) obj), new m(qVar, null, 1)), new n(qVar, null, 1));
                o oVar2 = new o(qVar, cVar2, i10);
                this.f25113c = 2;
                if (z0.h(vVar2, oVar2, this) != aVar) {
                    return uVar;
                }
                return aVar;
        }
    }
}
