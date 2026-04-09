package p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f30909b;

    public /* synthetic */ y1(b2 b2Var, int i4) {
        this.f30908a = i4;
        this.f30909b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30908a) {
            case 0:
                p1 p1Var = this.f30909b.f30633c;
                if (p1Var != null) {
                    p1Var.setListSelectionHidden(true);
                    p1Var.requestLayout();
                    break;
                }
                break;
            default:
                b2 b2Var = this.f30909b;
                p1 p1Var2 = b2Var.f30633c;
                if (p1Var2 != null && p1Var2.isAttachedToWindow() && b2Var.f30633c.getCount() > b2Var.f30633c.getChildCount() && b2Var.f30633c.getChildCount() <= b2Var.f30641m) {
                    b2Var.f30654z.setInputMethodMode(2);
                    b2Var.show();
                    break;
                }
                break;
        }
    }
}
