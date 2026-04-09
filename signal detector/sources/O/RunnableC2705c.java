package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2705c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f22486b;

    public /* synthetic */ RunnableC2705c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f22485a = i;
        this.f22486b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22485a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f22486b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f4826K = actionBarOverlayLayout.f4834d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4827L);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f22486b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f4826K = actionBarOverlayLayout2.f4834d.animate().translationY(-actionBarOverlayLayout2.f4834d.getHeight()).setListener(actionBarOverlayLayout2.f4827L);
                break;
        }
    }
}
