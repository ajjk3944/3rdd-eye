package th;

import java.util.List;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends ek.j implements mk.g {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f34645b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f34646c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f34647d;

    @Override // mk.g
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        p pVar = new p(4, (ck.c) obj4);
        pVar.f34645b = zBooleanValue;
        pVar.f34646c = (List) obj2;
        pVar.f34647d = zBooleanValue2;
        return pVar.invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        boolean z3 = this.f34645b;
        List list = this.f34646c;
        boolean z10 = this.f34647d;
        ci.b.D(obj);
        list.size();
        return !zg.c.b() ? k.f34628b : (z3 || z10) ? k.f34627a : k.f34629c;
    }
}
