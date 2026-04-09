package ch;

import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.ApiException;
import ek.j;
import km.s;
import nk.k;
import yj.l;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2850b;

    /* renamed from: c, reason: collision with root package name */
    public int f2851c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i4, ck.c cVar) {
        super(2, cVar);
        this.f2850b = i4;
        this.f2853e = str;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2850b) {
            case 0:
                a aVar = new a(this.f2853e, 0, cVar);
                aVar.f2852d = obj;
                return aVar;
            case 1:
                a aVar2 = new a(this.f2853e, 1, cVar);
                aVar2.f2852d = obj;
                return aVar2;
            default:
                a aVar3 = new a(this.f2853e, 2, cVar);
                aVar3.f2852d = obj;
                return aVar3;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        al.i iVar = (al.i) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2850b) {
        }
        return ((a) create(iVar, cVar)).invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f2850b;
        String str = this.f2853e;
        dk.a aVar = dk.a.f22275a;
        u uVar = u.f37649a;
        switch (i4) {
            case 0:
                al.i iVar = (al.i) this.f2852d;
                int i10 = this.f2851c;
                try {
                } catch (s e2) {
                    l lVar = new l(ci.b.h(new ApiException(e2.f28456a, e2.f28457b)));
                    this.f2852d = null;
                    this.f2851c = 2;
                    if (iVar.c(lVar, this) == aVar) {
                        return aVar;
                    }
                }
                if (i10 == 0) {
                    ci.b.D(obj);
                    f fVar = e.f2868a;
                    this.f2852d = iVar;
                    this.f2851c = 1;
                    obj = fVar.h(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3 && i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                        return uVar;
                    }
                    ci.b.D(obj);
                }
                fh.e eVar = (fh.e) obj;
                if (eVar.d()) {
                    l lVar2 = new l(uVar);
                    this.f2852d = null;
                    this.f2851c = 3;
                    if (iVar.c(lVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    l lVar3 = new l(ci.b.h(eVar.a()));
                    this.f2852d = null;
                    this.f2851c = 4;
                    if (iVar.c(lVar3, this) == aVar) {
                        return aVar;
                    }
                }
                return uVar;
            case 1:
                al.i iVar2 = (al.i) this.f2852d;
                int i11 = this.f2851c;
                try {
                } catch (s e10) {
                    l lVar4 = new l(ci.b.h(new ApiException(e10.f28456a, e10.f28457b)));
                    this.f2852d = null;
                    this.f2851c = 2;
                    if (iVar2.c(lVar4, this) == aVar) {
                        return aVar;
                    }
                }
                if (i11 == 0) {
                    ci.b.D(obj);
                    f fVar2 = e.f2868a;
                    this.f2852d = iVar2;
                    this.f2851c = 1;
                    String string = fi.a.f24058a.getString(R.string._current_language);
                    k.d(string, "getString(...)");
                    obj = fVar2.b(str, 3, string, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3 && i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                        return uVar;
                    }
                    ci.b.D(obj);
                }
                fh.e eVar2 = (fh.e) obj;
                if (eVar2.d()) {
                    l lVar5 = new l(uVar);
                    this.f2852d = null;
                    this.f2851c = 3;
                    if (iVar2.c(lVar5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    l lVar6 = new l(ci.b.h(new ApiException(eVar2.c(), null, 2, null)));
                    this.f2852d = null;
                    this.f2851c = 4;
                    if (iVar2.c(lVar6, this) == aVar) {
                        return aVar;
                    }
                }
                return uVar;
            default:
                al.i iVar3 = (al.i) this.f2852d;
                int i12 = this.f2851c;
                try {
                } catch (s e11) {
                    l lVar7 = new l(ci.b.h(new ApiException(e11.f28456a, e11.f28457b)));
                    this.f2852d = null;
                    this.f2851c = 2;
                    if (iVar3.c(lVar7, this) == aVar) {
                        return aVar;
                    }
                }
                if (i12 == 0) {
                    ci.b.D(obj);
                    f fVar3 = e.f2868a;
                    DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                    this.f2852d = iVar3;
                    this.f2851c = 1;
                    obj = fVar3.a(str, 1, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3 && i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                        return uVar;
                    }
                    ci.b.D(obj);
                }
                fh.e eVar3 = (fh.e) obj;
                if (eVar3.d()) {
                    l lVar8 = new l(eVar3);
                    this.f2852d = null;
                    this.f2851c = 3;
                    if (iVar3.c(lVar8, this) == aVar) {
                        return aVar;
                    }
                } else {
                    l lVar9 = new l(ci.b.h(eVar3.a()));
                    this.f2852d = null;
                    this.f2851c = 4;
                    if (iVar3.c(lVar9, this) == aVar) {
                        return aVar;
                    }
                }
                return uVar;
        }
    }
}
