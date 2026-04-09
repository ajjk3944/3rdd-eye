package wt;

/* loaded from: classes.dex */
public final class m extends b1 implements l {
    public final Object X(rq.c cVar) throws Throwable {
        Object objZ;
        while (true) {
            Object obj = b1.f24604a.get(this);
            if (obj instanceof p0) {
                if (S(obj) >= 0) {
                    x0 x0Var = new x0(xu.l.D(cVar), this);
                    x0Var.v();
                    x0Var.y(new e(2, w.p(this, true, new s0(1, x0Var))));
                    objZ = x0Var.u();
                    qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                    break;
                }
            } else {
                if (obj instanceof o) {
                    throw ((o) obj).f24644a;
                }
                objZ = w.z(obj);
            }
        }
        qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
        return objZ;
    }
}
