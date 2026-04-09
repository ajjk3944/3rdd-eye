package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.n f3992a;

    /* renamed from: b, reason: collision with root package name */
    public int f3993b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3994c;

    public class a extends i {
        public a(RecyclerView.n nVar) {
            super(nVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3992a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f3992a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f3992a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3992a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3992a.getWidth();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3992a.getWidth() - this.f3992a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3992a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3992a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3992a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return this.f3992a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.i
        public int o() {
            return (this.f3992a.getWidth() - this.f3992a.getPaddingLeft()) - this.f3992a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3992a.getTransformedBoundingBox(view, true, this.f3994c);
            return this.f3994c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int r(View view) {
            this.f3992a.getTransformedBoundingBox(view, true, this.f3994c);
            return this.f3994c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void s(int i10) {
            this.f3992a.offsetChildrenHorizontal(i10);
        }
    }

    public class b extends i {
        public b(RecyclerView.n nVar) {
            super(nVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3992a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f3992a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return this.f3992a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3992a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3992a.getHeight();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3992a.getHeight() - this.f3992a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3992a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3992a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3992a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return this.f3992a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.i
        public int o() {
            return (this.f3992a.getHeight() - this.f3992a.getPaddingTop()) - this.f3992a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3992a.getTransformedBoundingBox(view, true, this.f3994c);
            return this.f3994c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int r(View view) {
            this.f3992a.getTransformedBoundingBox(view, true, this.f3994c);
            return this.f3994c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void s(int i10) {
            this.f3992a.offsetChildrenVertical(i10);
        }
    }

    public /* synthetic */ i(RecyclerView.n nVar, a aVar) {
        this(nVar);
    }

    public static i a(RecyclerView.n nVar) {
        return new a(nVar);
    }

    public static i b(RecyclerView.n nVar, int i10) {
        if (i10 == 0) {
            return a(nVar);
        }
        if (i10 == 1) {
            return c(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.n nVar) {
        return new b(nVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.n k() {
        return this.f3992a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f3993b) {
            return 0;
        }
        return o() - this.f3993b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(int i10);

    public void t() {
        this.f3993b = o();
    }

    public i(RecyclerView.n nVar) {
        this.f3993b = Integer.MIN_VALUE;
        this.f3994c = new Rect();
        this.f3992a = nVar;
    }
}
