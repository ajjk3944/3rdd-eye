package te;

import ek.j;
import mk.e;
import nk.k;
import v5.l;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends j implements e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34551b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f34552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk.c f34553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ck.c cVar, mk.c cVar2, int i4) {
        super(2, cVar);
        this.f34551b = i4;
        this.f34553d = cVar2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f34551b) {
            case 0:
                b bVar = new b(this.f34553d, cVar);
                bVar.f34552c = obj;
                return bVar;
            case 1:
                b bVar2 = new b(cVar, this.f34553d, 1);
                bVar2.f34552c = obj;
                return bVar2;
            default:
                b bVar3 = new b(cVar, this.f34553d, 2);
                bVar3.f34552c = obj;
                return bVar3;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34551b) {
            case 0:
                b bVar = (b) create((t4.b) obj, (ck.c) obj2);
                u uVar = u.f37649a;
                bVar.invokeSuspend(uVar);
                break;
        }
        return ((b) create((l) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f34551b;
        mk.c cVar = this.f34553d;
        switch (i4) {
            case 0:
                ci.b.D(obj);
                cVar.invoke((t4.b) this.f34552c);
                return u.f37649a;
            case 1:
                ci.b.D(obj);
                l lVar = (l) this.f34552c;
                k.c(lVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.invoke(lVar.c());
            default:
                ci.b.D(obj);
                l lVar2 = (l) this.f34552c;
                k.c(lVar2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.invoke(lVar2.c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mk.c cVar, ck.c cVar2) {
        super(2, cVar2);
        this.f34551b = 0;
        this.f34553d = cVar;
    }
}
