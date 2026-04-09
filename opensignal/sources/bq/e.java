package bq;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import on.p;

/* loaded from: classes.dex */
public final class e implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2865d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f2866g;

    public e(View view, ViewGroup viewGroup) {
        this.f2865d = viewGroup;
        this.f2866g = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f2864a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                View view2 = this.f2865d;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view2.getResources().getDimensionPixelSize(p.survicate_micro_survey_point_image_container_height), this.f2866g.getMeasuredHeight());
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new f(0, view2));
                valueAnimatorOfInt.start();
                break;
            default:
                View view3 = this.f2865d;
                if (view3.getVisibility() == 0) {
                    ((ie.j) this.f2866g).c(view3);
                    break;
                }
                break;
        }
    }

    public e(ie.j jVar, View view) {
        this.f2866g = jVar;
        this.f2865d = view;
    }
}
