package o;

/* renamed from: o.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2747x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0 f22653b;

    public /* synthetic */ RunnableC2747x0(A0 a02, int i) {
        this.f22652a = i;
        this.f22653b = a02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22652a) {
            case 0:
                C2732p0 c2732p0 = this.f22653b.f22350c;
                if (c2732p0 != null) {
                    c2732p0.setListSelectionHidden(true);
                    c2732p0.requestLayout();
                    break;
                }
                break;
            default:
                A0 a02 = this.f22653b;
                C2732p0 c2732p02 = a02.f22350c;
                if (c2732p02 != null && c2732p02.isAttachedToWindow() && a02.f22350c.getCount() > a02.f22350c.getChildCount() && a02.f22350c.getChildCount() <= a02.f22359m) {
                    a02.f22347N.setInputMethodMode(2);
                    a02.g();
                    break;
                }
                break;
        }
    }
}
