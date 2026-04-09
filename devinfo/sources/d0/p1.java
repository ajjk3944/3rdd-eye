package d0;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p1 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f21814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(long j, ck.c cVar) {
        super(2, cVar);
        this.f21814c = j;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        p1 p1Var = new p1(this.f21814c, cVar);
        p1Var.f21813b = obj;
        return p1Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        p1 p1Var = (p1) create((x1) obj, (ck.c) obj2);
        yj.u uVar = yj.u.f37649a;
        p1Var.invokeSuspend(uVar);
        return uVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ci.b.D(obj);
        z1 z1Var = ((x1) this.f21813b).f21893a;
        z1Var.c(z1Var.f21927k, this.f21814c, 1);
        return yj.u.f37649a;
    }
}
