package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20028a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f20029d;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f20028a = i10;
        this.f20029d = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20028a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20029d;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.S = actionBarOverlayLayout.f952r.animate().translationY(0.0f).setListener(actionBarOverlayLayout.T);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20029d;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.S = actionBarOverlayLayout2.f952r.animate().translationY(-actionBarOverlayLayout2.f952r.getHeight()).setListener(actionBarOverlayLayout2.T);
                break;
        }
    }
}
