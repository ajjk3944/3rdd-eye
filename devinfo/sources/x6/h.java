package x6;

import ek.j;
import nk.k;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public int f36989b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ al.i f36990c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object[] f36991d;

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        h hVar = new h(3, (ck.c) obj3);
        hVar.f36990c = (al.i) obj;
        hVar.f36991d = (Object[]) obj2;
        return hVar.invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        int i4 = this.f36989b;
        if (i4 == 0) {
            ci.b.D(obj);
            al.i iVar = this.f36990c;
            c[] cVarArr = (c[]) this.f36991d;
            int length = cVarArr.length;
            int i10 = 0;
            while (true) {
                cVar = a.f36977a;
                if (i10 >= length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArr[i10];
                if (!k.a(cVar2, cVar)) {
                    break;
                }
                i10++;
            }
            if (cVar2 != null) {
                cVar = cVar2;
            }
            this.f36989b = 1;
            Object objC = iVar.c(cVar, this);
            dk.a aVar = dk.a.f22275a;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
        }
        return u.f37649a;
    }
}
