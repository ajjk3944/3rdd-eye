package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.o f2206a;

    /* renamed from: b, reason: collision with root package name */
    private int f2207b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f2208c;

    static class a extends h {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.h
        public int d(View view) {
            return this.f2206a.S(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f2206a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f2206a.Q(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int g(View view) {
            return this.f2206a.P(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int h() {
            return this.f2206a.m0();
        }

        @Override // androidx.recyclerview.widget.h
        public int i() {
            return this.f2206a.m0() - this.f2206a.d0();
        }

        @Override // androidx.recyclerview.widget.h
        public int j() {
            return this.f2206a.d0();
        }

        @Override // androidx.recyclerview.widget.h
        public int k() {
            return this.f2206a.n0();
        }

        @Override // androidx.recyclerview.widget.h
        public int l() {
            return this.f2206a.W();
        }

        @Override // androidx.recyclerview.widget.h
        public int m() {
            return this.f2206a.c0();
        }

        @Override // androidx.recyclerview.widget.h
        public int n() {
            return (this.f2206a.m0() - this.f2206a.c0()) - this.f2206a.d0();
        }

        @Override // androidx.recyclerview.widget.h
        public int p(View view) {
            this.f2206a.l0(view, true, this.f2208c);
            return this.f2208c.right;
        }

        @Override // androidx.recyclerview.widget.h
        public int q(View view) {
            this.f2206a.l0(view, true, this.f2208c);
            return this.f2208c.left;
        }

        @Override // androidx.recyclerview.widget.h
        public void r(int i2) {
            this.f2206a.A0(i2);
        }
    }

    static class b extends h {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.h
        public int d(View view) {
            return this.f2206a.N(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f2206a.Q(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f2206a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int g(View view) {
            return this.f2206a.T(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int h() {
            return this.f2206a.V();
        }

        @Override // androidx.recyclerview.widget.h
        public int i() {
            return this.f2206a.V() - this.f2206a.b0();
        }

        @Override // androidx.recyclerview.widget.h
        public int j() {
            return this.f2206a.b0();
        }

        @Override // androidx.recyclerview.widget.h
        public int k() {
            return this.f2206a.W();
        }

        @Override // androidx.recyclerview.widget.h
        public int l() {
            return this.f2206a.n0();
        }

        @Override // androidx.recyclerview.widget.h
        public int m() {
            return this.f2206a.e0();
        }

        @Override // androidx.recyclerview.widget.h
        public int n() {
            return (this.f2206a.V() - this.f2206a.e0()) - this.f2206a.b0();
        }

        @Override // androidx.recyclerview.widget.h
        public int p(View view) {
            this.f2206a.l0(view, true, this.f2208c);
            return this.f2208c.bottom;
        }

        @Override // androidx.recyclerview.widget.h
        public int q(View view) {
            this.f2206a.l0(view, true, this.f2208c);
            return this.f2208c.top;
        }

        @Override // androidx.recyclerview.widget.h
        public void r(int i2) {
            this.f2206a.B0(i2);
        }
    }

    private h(RecyclerView.o oVar) {
        this.f2207b = Integer.MIN_VALUE;
        this.f2208c = new Rect();
        this.f2206a = oVar;
    }

    /* synthetic */ h(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static h a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static h b(RecyclerView.o oVar, int i2) {
        if (i2 == 0) {
            return a(oVar);
        }
        if (i2 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static h c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f2207b) {
            return 0;
        }
        return n() - this.f2207b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i2);

    public void s() {
        this.f2207b = n();
    }
}
