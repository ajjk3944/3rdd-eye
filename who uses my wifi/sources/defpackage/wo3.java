package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wo3 extends yo3 {
    @Override // defpackage.yo3
    public final /* synthetic */ void s(Object obj) {
        m((n70) obj);
    }

    @Override // defpackage.yo3
    public final Object t(Object obj, Throwable th) {
        yp3 yp3Var = (yp3) obj;
        n70 n70VarC = yp3Var.c(th);
        if (n70VarC != null) {
            return n70VarC;
        }
        throw new NullPointerException(qb1.J("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", yp3Var));
    }
}
