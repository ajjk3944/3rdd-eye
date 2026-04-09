package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1502b;

    public /* synthetic */ t(int i4, Object obj) {
        this.f1501a = i4;
        this.f1502b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f1501a;
        Object obj = this.f1502b;
        switch (i4) {
            case 0:
                x xVar = (x) obj;
                ValueAnimator valueAnimator = xVar.f1550z;
                int i10 = xVar.A;
                if (i10 == 1) {
                    valueAnimator.cancel();
                } else if (i10 != 2) {
                }
                xVar.A = 3;
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
