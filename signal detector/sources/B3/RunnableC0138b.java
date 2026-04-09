package B3;

import android.os.SystemClock;

/* renamed from: B3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0138b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f542b;

    public /* synthetic */ RunnableC0138b(d dVar, int i) {
        this.f541a = i;
        this.f542b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f541a) {
            case 0:
                d dVar = this.f542b;
                if (dVar.f550e > 0) {
                    dVar.f551f = SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                break;
            default:
                d dVar2 = this.f542b;
                ((q) dVar2.getCurrentDrawable()).d(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.f551f = -1L;
                break;
        }
    }
}
