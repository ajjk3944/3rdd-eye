package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vm3 extends ql3 {
    public final xm3 i;

    public vm3(xm3 xm3Var, int i) {
        super(xm3Var.size(), i);
        this.i = xm3Var;
    }

    @Override // defpackage.ql3
    public final Object b(int i) {
        return this.i.get(i);
    }
}
