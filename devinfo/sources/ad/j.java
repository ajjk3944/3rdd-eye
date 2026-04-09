package ad;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends a {
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f338h;

    /* renamed from: i, reason: collision with root package name */
    public final float f339i;

    public j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f338h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f339i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(int i4, float f10, boolean z3) {
        float interpolation = this.f321a.getInterpolation(f10);
        View view = this.f322b;
        boolean z10 = (Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 3) == 3;
        boolean z11 = z3 == z10;
        int width = view.getWidth();
        int height = view.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.g / f11;
            float f14 = this.f338h / f11;
            float f15 = this.f339i / f12;
            if (z10) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fA = jc.a.a(0.0f, f14, interpolation);
            float f16 = fA + 1.0f;
            float fA2 = 1.0f - jc.a.a(0.0f, f15, interpolation);
            if (Float.isNaN(f16) || Float.isNaN(fA2)) {
                return;
            }
            view.setScaleX(f16);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotX(z10 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fA : 1.0f;
                    float f18 = fA2 != 0.0f ? (f16 / fA2) * f17 : 1.0f;
                    if (!Float.isNaN(f17) && !Float.isNaN(f18)) {
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }
}
