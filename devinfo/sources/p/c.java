package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f30672b;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f30671a = i4;
        this.f30672b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30671a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f30672b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f741w = actionBarOverlayLayout.f724d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f742x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f30672b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f741w = actionBarOverlayLayout2.f724d.animate().translationY(-actionBarOverlayLayout2.f724d.getHeight()).setListener(actionBarOverlayLayout2.f742x);
                break;
        }
    }
}
