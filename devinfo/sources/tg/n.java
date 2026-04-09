package tg;

import i0.q;
import java.util.List;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends ek.j implements mk.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34597b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f34598c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f34599d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f34600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i4, ck.c cVar, int i10) {
        super(i4, cVar);
        this.f34597b = i10;
    }

    @Override // mk.g
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f34597b) {
            case 0:
                n nVar = new n(this.f34598c, (ck.c) obj4);
                nVar.f34599d = (q) obj2;
                nVar.f34600e = (q) obj3;
                u uVar = u.f37649a;
                nVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                n nVar2 = new n(4, (ck.c) obj4, 1);
                nVar2.f34598c = (List) obj;
                nVar2.f34599d = (th.j) obj2;
                nVar2.f34600e = (th.l) obj3;
                return nVar2.invokeSuspend(u.f37649a);
            default:
                n nVar3 = new n(4, (ck.c) obj4, 2);
                nVar3.f34599d = (th.k) obj;
                nVar3.f34598c = (List) obj2;
                nVar3.f34600e = (String) obj3;
                return nVar3.invokeSuspend(u.f37649a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, ck.c cVar) {
        super(4, cVar);
        this.f34597b = 0;
        this.f34598c = list;
    }
}
