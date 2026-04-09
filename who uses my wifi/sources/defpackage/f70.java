package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f70 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ i70 g;

    public /* synthetic */ f70(i70 i70Var, int i) {
        this.f = i;
        this.g = i70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                kq kqVar = this.g.h;
                if (kqVar != null) {
                    kqVar.setListSelectionHidden(true);
                    kqVar.requestLayout();
                    break;
                }
                break;
            default:
                i70 i70Var = this.g;
                kq kqVar2 = i70Var.h;
                if (kqVar2 != null && kqVar2.isAttachedToWindow() && i70Var.h.getCount() > i70Var.h.getChildCount() && i70Var.h.getChildCount() <= i70Var.r) {
                    i70Var.E.setInputMethodMode(2);
                    i70Var.c();
                    break;
                }
                break;
        }
    }
}
