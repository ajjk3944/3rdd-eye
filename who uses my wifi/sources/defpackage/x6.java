package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x6 extends ew {
    public final /* synthetic */ e7 o;
    public final /* synthetic */ h7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(h7 h7Var, h7 h7Var2, e7 e7Var) {
        super(h7Var2);
        this.p = h7Var;
        this.o = e7Var;
    }

    @Override // defpackage.ew
    public final uv0 b() {
        return this.o;
    }

    @Override // defpackage.ew
    public final boolean c() {
        h7 h7Var = this.p;
        if (h7Var.getInternalPopup().a()) {
            return true;
        }
        h7Var.k.m(h7Var.getTextDirection(), h7Var.getTextAlignment());
        return true;
    }
}
