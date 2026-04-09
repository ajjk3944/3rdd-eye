package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mm extends mz0 implements dy {
    public int j;

    @Override // defpackage.dy
    public final Object g(Object obj) {
        mm mmVar = new mm(1, (oj) obj);
        z31 z31Var = z31.a;
        mmVar.m(z31Var);
        return z31Var;
    }

    @Override // defpackage.s9
    public final Object m(Object obj) {
        int i = this.j;
        if (i == 0) {
            bd2.x(obj);
            this.j = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bd2.x(obj);
        return z31.a;
    }
}
