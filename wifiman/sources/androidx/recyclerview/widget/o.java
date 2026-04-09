package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class o extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f32250a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f32251b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.s f32252c = new a();

    class a extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        boolean f32253a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f32253a) {
                this.f32253a = false;
                o.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f32253a = true;
        }
    }

    private void f() {
        this.f32250a.X0(this.f32252c);
        this.f32250a.setOnFlingListener(null);
    }

    private void i() {
        if (this.f32250a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f32250a.k(this.f32252c);
        this.f32250a.setOnFlingListener(this);
    }

    private boolean j(RecyclerView.o oVar, int i10, int i11) {
        RecyclerView.y yVarD;
        int iH;
        if (!(oVar instanceof RecyclerView.y.b) || (yVarD = d(oVar)) == null || (iH = h(oVar, i10, i11)) == -1) {
            return false;
        }
        yVarD.p(iH);
        oVar.N1(yVarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(int i10, int i11) {
        RecyclerView.o layoutManager = this.f32250a.getLayoutManager();
        if (layoutManager == null || this.f32250a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f32250a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && j(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f32250a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f32250a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f32251b = new Scroller(this.f32250a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    protected RecyclerView.y d(RecyclerView.o oVar) {
        return e(oVar);
    }

    protected abstract g e(RecyclerView.o oVar);

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i10, int i11);

    void k() {
        RecyclerView.o layoutManager;
        View viewG;
        RecyclerView recyclerView = this.f32250a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewG);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f32250a.k1(i10, iArrC[1]);
    }
}
