package id;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.internal.measurement.e5;

/* loaded from: classes.dex */
public final class c extends e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11331a;

    @Override // com.google.android.gms.internal.measurement.e5
    public final int D(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i10;
        switch (this.f11331a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i10 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i10 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i10 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final int E() {
        switch (this.f11331a) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e5
    public final ViewPropertyAnimator F(View view, int i10) {
        switch (this.f11331a) {
            case 0:
                return view.animate().translationY(i10);
            case 1:
                return view.animate().translationX(-i10);
            default:
                return view.animate().translationX(i10);
        }
    }
}
