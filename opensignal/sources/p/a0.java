package p;

/* loaded from: classes.dex */
public final class a0 extends l1 {
    public final /* synthetic */ f0 F;
    public final /* synthetic */ androidx.appcompat.widget.c G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.widget.c cVar, androidx.appcompat.widget.c cVar2, f0 f0Var) {
        super(cVar2);
        this.G = cVar;
        this.F = f0Var;
    }

    @Override // p.l1
    public final o.c0 b() {
        return this.F;
    }

    @Override // p.l1
    public final boolean c() {
        androidx.appcompat.widget.c cVar = this.G;
        if (cVar.getInternalPopup().a()) {
            return true;
        }
        cVar.f1054y.n(cVar.getTextDirection(), cVar.getTextAlignment());
        return true;
    }
}
