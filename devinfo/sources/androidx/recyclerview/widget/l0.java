package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 extends m0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(f1 f1Var, int i4) {
        super(f1Var);
        this.f1446d = i4;
    }

    @Override // androidx.recyclerview.widget.m0
    public final int b(View view) {
        int decoratedRight;
        int i4;
        switch (this.f1446d) {
            case 0:
                g1 g1Var = (g1) view.getLayoutParams();
                decoratedRight = this.f1452a.getDecoratedRight(view);
                i4 = ((ViewGroup.MarginLayoutParams) g1Var).rightMargin;
                break;
            default:
                g1 g1Var2 = (g1) view.getLayoutParams();
                decoratedRight = this.f1452a.getDecoratedBottom(view);
                i4 = ((ViewGroup.MarginLayoutParams) g1Var2).bottomMargin;
                break;
        }
        return decoratedRight + i4;
    }

    @Override // androidx.recyclerview.widget.m0
    public final int c(View view) {
        int decoratedMeasuredWidth;
        int i4;
        switch (this.f1446d) {
            case 0:
                g1 g1Var = (g1) view.getLayoutParams();
                decoratedMeasuredWidth = this.f1452a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) g1Var).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) g1Var).rightMargin;
                break;
            default:
                g1 g1Var2 = (g1) view.getLayoutParams();
                decoratedMeasuredWidth = this.f1452a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) g1Var2).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) g1Var2).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i4;
    }

    @Override // androidx.recyclerview.widget.m0
    public final int d(View view) {
        int decoratedMeasuredHeight;
        int i4;
        switch (this.f1446d) {
            case 0:
                g1 g1Var = (g1) view.getLayoutParams();
                decoratedMeasuredHeight = this.f1452a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) g1Var).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) g1Var).bottomMargin;
                break;
            default:
                g1 g1Var2 = (g1) view.getLayoutParams();
                decoratedMeasuredHeight = this.f1452a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) g1Var2).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) g1Var2).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i4;
    }

    @Override // androidx.recyclerview.widget.m0
    public final int e(View view) {
        int decoratedLeft;
        int i4;
        switch (this.f1446d) {
            case 0:
                g1 g1Var = (g1) view.getLayoutParams();
                decoratedLeft = this.f1452a.getDecoratedLeft(view);
                i4 = ((ViewGroup.MarginLayoutParams) g1Var).leftMargin;
                break;
            default:
                g1 g1Var2 = (g1) view.getLayoutParams();
                decoratedLeft = this.f1452a.getDecoratedTop(view);
                i4 = ((ViewGroup.MarginLayoutParams) g1Var2).topMargin;
                break;
        }
        return decoratedLeft - i4;
    }

    @Override // androidx.recyclerview.widget.m0
    public final int f() {
        switch (this.f1446d) {
            case 0:
                return this.f1452a.getWidth();
            default:
                return this.f1452a.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.m0
    public final int g() {
        int width;
        int paddingRight;
        switch (this.f1446d) {
            case 0:
                f1 f1Var = this.f1452a;
                width = f1Var.getWidth();
                paddingRight = f1Var.getPaddingRight();
                break;
            default:
                f1 f1Var2 = this.f1452a;
                width = f1Var2.getHeight();
                paddingRight = f1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.m0
    public final int h() {
        switch (this.f1446d) {
            case 0:
                return this.f1452a.getPaddingRight();
            default:
                return this.f1452a.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.m0
    public final int i() {
        switch (this.f1446d) {
            case 0:
                return this.f1452a.getWidthMode();
            default:
                return this.f1452a.getHeightMode();
        }
    }

    @Override // androidx.recyclerview.widget.m0
    public final int j() {
        switch (this.f1446d) {
            case 0:
                return this.f1452a.getHeightMode();
            default:
                return this.f1452a.getWidthMode();
        }
    }

    @Override // androidx.recyclerview.widget.m0
    public final int k() {
        switch (this.f1446d) {
            case 0:
                return this.f1452a.getPaddingLeft();
            default:
                return this.f1452a.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.m0
    public final int l() {
        int width;
        int paddingRight;
        switch (this.f1446d) {
            case 0:
                f1 f1Var = this.f1452a;
                width = f1Var.getWidth() - f1Var.getPaddingLeft();
                paddingRight = f1Var.getPaddingRight();
                break;
            default:
                f1 f1Var2 = this.f1452a;
                width = f1Var2.getHeight() - f1Var2.getPaddingTop();
                paddingRight = f1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.m0
    public final int m(View view) {
        switch (this.f1446d) {
            case 0:
                f1 f1Var = this.f1452a;
                Rect rect = this.f1454c;
                f1Var.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                f1 f1Var2 = this.f1452a;
                Rect rect2 = this.f1454c;
                f1Var2.getTransformedBoundingBox(view, true, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.m0
    public final int n(View view) {
        switch (this.f1446d) {
            case 0:
                f1 f1Var = this.f1452a;
                Rect rect = this.f1454c;
                f1Var.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                f1 f1Var2 = this.f1452a;
                Rect rect2 = this.f1454c;
                f1Var2.getTransformedBoundingBox(view, true, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.m0
    public final void o(int i4) {
        switch (this.f1446d) {
            case 0:
                this.f1452a.offsetChildrenHorizontal(i4);
                break;
            default:
                this.f1452a.offsetChildrenVertical(i4);
                break;
        }
    }
}
