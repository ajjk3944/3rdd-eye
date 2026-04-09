package h3;

import a.AbstractC0241a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2363b extends AbstractC0241a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20477c;

    @Override // a.AbstractC0241a
    public final int g(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.f20477c) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // a.AbstractC0241a
    public final int h() {
        switch (this.f20477c) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // a.AbstractC0241a
    public final ViewPropertyAnimator i(int i, View view) {
        switch (this.f20477c) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
