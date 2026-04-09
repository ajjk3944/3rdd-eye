package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.o f32239a;

    /* renamed from: b, reason: collision with root package name */
    private int f32240b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f32241c;

    static class a extends i {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f32239a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f32239a.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f32239a.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f32239a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f32239a.s0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f32239a.s0() - this.f32239a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f32239a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f32239a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f32239a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f32239a.i0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f32239a.s0() - this.f32239a.i0()) - this.f32239a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f32239a.r0(view, true, this.f32241c);
            return this.f32241c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f32239a.r0(view, true, this.f32241c);
            return this.f32241c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f32239a.G0(i10);
        }
    }

    static class b extends i {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f32239a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f32239a.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f32239a.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f32239a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f32239a.b0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f32239a.b0() - this.f32239a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f32239a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f32239a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f32239a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f32239a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f32239a.b0() - this.f32239a.k0()) - this.f32239a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f32239a.r0(view, true, this.f32241c);
            return this.f32241c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f32239a.r0(view, true, this.f32241c);
            return this.f32241c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f32239a.H0(i10);
        }
    }

    /* synthetic */ i(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static i a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static i b(RecyclerView.o oVar, int i10) {
        if (i10 == 0) {
            return a(oVar);
        }
        if (i10 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.o oVar) {
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
        if (Integer.MIN_VALUE == this.f32240b) {
            return 0;
        }
        return n() - this.f32240b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f32240b = n();
    }

    private i(RecyclerView.o oVar) {
        this.f32240b = PduHandle.NONE;
        this.f32241c = new Rect();
        this.f32239a = oVar;
    }
}
