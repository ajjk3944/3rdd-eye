package ch;

import com.liuzh.deviceinfo.pro.account.mode.ApiException;
import ek.j;
import km.s;
import yj.l;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2869b;

    /* renamed from: c, reason: collision with root package name */
    public int f2870c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2873f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, long j, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2869b = i4;
        this.f2872e = str;
        this.f2873f = j;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2869b) {
            case 0:
                g gVar = new g(this.f2872e, this.f2873f, cVar, 0);
                gVar.f2871d = obj;
                return gVar;
            default:
                g gVar2 = new g(this.f2872e, this.f2873f, cVar, 1);
                gVar2.f2871d = obj;
                return gVar2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        al.i iVar = (al.i) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2869b) {
        }
        return ((g) create(iVar, cVar)).invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2869b) {
            case 0:
                al.i iVar = (al.i) this.f2871d;
                int i4 = this.f2870c;
                u uVar = u.f37649a;
                dk.a aVar = dk.a.f22275a;
                try {
                } catch (s e2) {
                    l lVar = new l(ci.b.h(new ApiException(e2.f28456a, e2.f28457b)));
                    this.f2871d = null;
                    this.f2870c = 2;
                    if (iVar.c(lVar, this) != aVar) {
                        return uVar;
                    }
                }
                if (i4 == 0) {
                    ci.b.D(obj);
                    i iVar2 = h.f2874a;
                    String str = this.f2872e;
                    long j = this.f2873f;
                    this.f2871d = iVar;
                    this.f2870c = 1;
                    obj = iVar2.c(str, j, this);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3 && i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                fh.e eVar = (fh.e) obj;
                if (eVar.d()) {
                    l lVar2 = new l(eVar);
                    this.f2871d = null;
                    this.f2870c = 3;
                    if (iVar.c(lVar2, this) != aVar) {
                        return uVar;
                    }
                } else {
                    l lVar3 = new l(ci.b.h(new ApiException(eVar.c(), null, 2, null)));
                    this.f2871d = null;
                    this.f2870c = 4;
                    if (iVar.c(lVar3, this) != aVar) {
                        return uVar;
                    }
                }
                return aVar;
            default:
                al.i iVar3 = (al.i) this.f2871d;
                int i10 = this.f2870c;
                u uVar2 = u.f37649a;
                dk.a aVar2 = dk.a.f22275a;
                try {
                } catch (s e10) {
                    l lVar4 = new l(ci.b.h(new ApiException(e10.f28456a, e10.f28457b)));
                    this.f2871d = null;
                    this.f2870c = 2;
                    if (iVar3.c(lVar4, this) != aVar2) {
                        return uVar2;
                    }
                }
                if (i10 == 0) {
                    ci.b.D(obj);
                    i iVar4 = h.f2874a;
                    String str2 = this.f2872e;
                    long j8 = this.f2873f;
                    this.f2871d = iVar3;
                    this.f2870c = 1;
                    obj = iVar4.d(str2, j8, this);
                    if (obj == aVar2) {
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                fh.e eVar2 = (fh.e) obj;
                if (eVar2.d()) {
                    l lVar5 = new l(eVar2);
                    this.f2871d = null;
                    this.f2870c = 3;
                    if (iVar3.c(lVar5, this) != aVar2) {
                        return uVar2;
                    }
                } else {
                    l lVar6 = new l(ci.b.h(new ApiException(eVar2.c(), null, 2, null)));
                    this.f2871d = null;
                    this.f2870c = 4;
                    if (iVar3.c(lVar6, this) != aVar2) {
                        return uVar2;
                    }
                }
                return aVar2;
        }
    }
}
