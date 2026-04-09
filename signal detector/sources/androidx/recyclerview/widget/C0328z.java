package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.recyclerview.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328z extends A {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0328z(Q q3, int i) {
        super(q3);
        this.f5633d = i;
    }

    @Override // androidx.recyclerview.widget.A
    public final int b(View view) {
        int decoratedRight;
        int i;
        switch (this.f5633d) {
            case 0:
                S s5 = (S) view.getLayoutParams();
                decoratedRight = this.f5272a.getDecoratedRight(view);
                i = ((ViewGroup.MarginLayoutParams) s5).rightMargin;
                break;
            default:
                S s6 = (S) view.getLayoutParams();
                decoratedRight = this.f5272a.getDecoratedBottom(view);
                i = ((ViewGroup.MarginLayoutParams) s6).bottomMargin;
                break;
        }
        return decoratedRight + i;
    }

    @Override // androidx.recyclerview.widget.A
    public final int c(View view) {
        int decoratedMeasuredWidth;
        int i;
        switch (this.f5633d) {
            case 0:
                S s5 = (S) view.getLayoutParams();
                decoratedMeasuredWidth = this.f5272a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) s5).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) s5).rightMargin;
                break;
            default:
                S s6 = (S) view.getLayoutParams();
                decoratedMeasuredWidth = this.f5272a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) s6).topMargin;
                i = ((ViewGroup.MarginLayoutParams) s6).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i;
    }

    @Override // androidx.recyclerview.widget.A
    public final int d(View view) {
        int decoratedMeasuredHeight;
        int i;
        switch (this.f5633d) {
            case 0:
                S s5 = (S) view.getLayoutParams();
                decoratedMeasuredHeight = this.f5272a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) s5).topMargin;
                i = ((ViewGroup.MarginLayoutParams) s5).bottomMargin;
                break;
            default:
                S s6 = (S) view.getLayoutParams();
                decoratedMeasuredHeight = this.f5272a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) s6).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) s6).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i;
    }

    @Override // androidx.recyclerview.widget.A
    public final int e(View view) {
        int decoratedLeft;
        int i;
        switch (this.f5633d) {
            case 0:
                S s5 = (S) view.getLayoutParams();
                decoratedLeft = this.f5272a.getDecoratedLeft(view);
                i = ((ViewGroup.MarginLayoutParams) s5).leftMargin;
                break;
            default:
                S s6 = (S) view.getLayoutParams();
                decoratedLeft = this.f5272a.getDecoratedTop(view);
                i = ((ViewGroup.MarginLayoutParams) s6).topMargin;
                break;
        }
        return decoratedLeft - i;
    }

    @Override // androidx.recyclerview.widget.A
    public final int f() {
        switch (this.f5633d) {
            case 0:
                return this.f5272a.getWidth();
            default:
                return this.f5272a.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.A
    public final int g() {
        int width;
        int paddingRight;
        switch (this.f5633d) {
            case 0:
                Q q3 = this.f5272a;
                width = q3.getWidth();
                paddingRight = q3.getPaddingRight();
                break;
            default:
                Q q6 = this.f5272a;
                width = q6.getHeight();
                paddingRight = q6.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.A
    public final int h() {
        switch (this.f5633d) {
            case 0:
                return this.f5272a.getPaddingRight();
            default:
                return this.f5272a.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.A
    public final int i() {
        switch (this.f5633d) {
            case 0:
                return this.f5272a.getWidthMode();
            default:
                return this.f5272a.getHeightMode();
        }
    }

    @Override // androidx.recyclerview.widget.A
    public final int j() {
        switch (this.f5633d) {
            case 0:
                return this.f5272a.getHeightMode();
            default:
                return this.f5272a.getWidthMode();
        }
    }

    @Override // androidx.recyclerview.widget.A
    public final int k() {
        switch (this.f5633d) {
            case 0:
                return this.f5272a.getPaddingLeft();
            default:
                return this.f5272a.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.A
    public final int l() {
        int width;
        int paddingRight;
        switch (this.f5633d) {
            case 0:
                Q q3 = this.f5272a;
                width = q3.getWidth() - q3.getPaddingLeft();
                paddingRight = q3.getPaddingRight();
                break;
            default:
                Q q6 = this.f5272a;
                width = q6.getHeight() - q6.getPaddingTop();
                paddingRight = q6.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.A
    public final int m(View view) {
        switch (this.f5633d) {
            case 0:
                Q q3 = this.f5272a;
                Rect rect = this.f5274c;
                q3.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                Q q6 = this.f5272a;
                Rect rect2 = this.f5274c;
                q6.getTransformedBoundingBox(view, true, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.A
    public final int n(View view) {
        switch (this.f5633d) {
            case 0:
                Q q3 = this.f5272a;
                Rect rect = this.f5274c;
                q3.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                Q q6 = this.f5272a;
                Rect rect2 = this.f5274c;
                q6.getTransformedBoundingBox(view, true, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.A
    public final void o(int i) {
        switch (this.f5633d) {
            case 0:
                this.f5272a.offsetChildrenHorizontal(i);
                break;
            default:
                this.f5272a.offsetChildrenVertical(i);
                break;
        }
    }
}
