package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ea implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ga g;

    public /* synthetic */ ea(ga gaVar, int i) {
        this.f = i;
        this.g = gaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ga gaVar = this.g;
                if (gaVar.i > 0) {
                    SystemClock.uptimeMillis();
                }
                gaVar.setVisibility(0);
                break;
            default:
                ga gaVar2 = this.g;
                ((aq) gaVar2.getCurrentDrawable()).d(false, false, true);
                if ((gaVar2.getProgressDrawable() == null || !gaVar2.getProgressDrawable().isVisible()) && (gaVar2.getIndeterminateDrawable() == null || !gaVar2.getIndeterminateDrawable().isVisible())) {
                    gaVar2.setVisibility(4);
                }
                gaVar2.getClass();
                break;
        }
    }
}
