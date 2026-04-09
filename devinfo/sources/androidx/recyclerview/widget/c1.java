package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c1 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f1315b;

    public /* synthetic */ c1(f1 f1Var, int i4) {
        this.f1314a = i4;
        this.f1315b = f1Var;
    }

    @Override // androidx.recyclerview.widget.i2
    public final int a(View view) {
        int decoratedLeft;
        int i4;
        switch (this.f1314a) {
            case 0:
                g1 g1Var = (g1) view.getLayoutParams();
                decoratedLeft = this.f1315b.getDecoratedLeft(view);
                i4 = ((ViewGroup.MarginLayoutParams) g1Var).leftMargin;
                break;
            default:
                g1 g1Var2 = (g1) view.getLayoutParams();
                decoratedLeft = this.f1315b.getDecoratedTop(view);
                i4 = ((ViewGroup.MarginLayoutParams) g1Var2).topMargin;
                break;
        }
        return decoratedLeft - i4;
    }

    @Override // androidx.recyclerview.widget.i2
    public final int b() {
        switch (this.f1314a) {
            case 0:
                return this.f1315b.getPaddingLeft();
            default:
                return this.f1315b.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.i2
    public final int c() {
        int width;
        int paddingRight;
        switch (this.f1314a) {
            case 0:
                f1 f1Var = this.f1315b;
                width = f1Var.getWidth();
                paddingRight = f1Var.getPaddingRight();
                break;
            default:
                f1 f1Var2 = this.f1315b;
                width = f1Var2.getHeight();
                paddingRight = f1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.i2
    public final View d(int i4) {
        switch (this.f1314a) {
        }
        return this.f1315b.getChildAt(i4);
    }

    @Override // androidx.recyclerview.widget.i2
    public final int e(View view) {
        int decoratedRight;
        int i4;
        switch (this.f1314a) {
            case 0:
                g1 g1Var = (g1) view.getLayoutParams();
                decoratedRight = this.f1315b.getDecoratedRight(view);
                i4 = ((ViewGroup.MarginLayoutParams) g1Var).rightMargin;
                break;
            default:
                g1 g1Var2 = (g1) view.getLayoutParams();
                decoratedRight = this.f1315b.getDecoratedBottom(view);
                i4 = ((ViewGroup.MarginLayoutParams) g1Var2).bottomMargin;
                break;
        }
        return decoratedRight + i4;
    }
}
