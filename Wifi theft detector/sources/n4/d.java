package n4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes2.dex */
public final class d extends f {
    @Override // n4.f
    public int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // n4.f
    public int b() {
        return 0;
    }

    @Override // n4.f
    public int c() {
        return 0;
    }

    @Override // n4.f
    public ViewPropertyAnimator d(View view, int i10) {
        return view.animate().translationX(i10);
    }

    @Override // n4.f
    public void e(View view, int i10) {
        view.setTranslationX(i10);
    }
}
