package p;

/* loaded from: classes.dex */
public final class q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20141a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f20142d;

    public /* synthetic */ q1(t1 t1Var, int i10) {
        this.f20141a = i10;
        this.f20142d = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20141a) {
            case 0:
                i1 i1Var = this.f20142d.f20173g;
                if (i1Var != null) {
                    i1Var.setListSelectionHidden(true);
                    i1Var.requestLayout();
                    break;
                }
                break;
            default:
                t1 t1Var = this.f20142d;
                i1 i1Var2 = t1Var.f20173g;
                if (i1Var2 != null && i1Var2.isAttachedToWindow() && t1Var.f20173g.getCount() > t1Var.f20173g.getChildCount() && t1Var.f20173g.getChildCount() <= t1Var.I) {
                    t1Var.V.setInputMethodMode(2);
                    t1Var.g();
                    break;
                }
                break;
        }
    }
}
