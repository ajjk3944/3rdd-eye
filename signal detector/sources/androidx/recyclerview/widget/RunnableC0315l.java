package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0315l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5514b;

    public /* synthetic */ RunnableC0315l(int i, Object obj) {
        this.f5513a = i;
        this.f5514b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5513a;
        Object obj = this.f5514b;
        switch (i) {
            case 0:
                C0317n c0317n = (C0317n) obj;
                ValueAnimator valueAnimator = c0317n.f5553z;
                int i3 = c0317n.f5527A;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                }
                c0317n.f5527A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).d();
                break;
        }
    }
}
