package mc;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends wd.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29027b;

    @Override // wd.b
    public final int u(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i4;
        switch (this.f29027b) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i4 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i4 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i4 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i4;
    }

    @Override // wd.b
    public final int w() {
        switch (this.f29027b) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // wd.b
    public final ViewPropertyAnimator x(int i4, View view) {
        switch (this.f29027b) {
            case 0:
                return view.animate().translationY(i4);
            case 1:
                return view.animate().translationX(-i4);
            default:
                return view.animate().translationX(i4);
        }
    }
}
