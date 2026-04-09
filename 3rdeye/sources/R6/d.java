package R6;

import N7.H9;
import O6.C;
import O6.t;
import O6.v;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import kotlin.jvm.internal.l;

/* compiled from: DivViewWithItems.kt */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: DivViewWithItems.kt */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final v f11733a;

        /* renamed from: b, reason: collision with root package name */
        public final R6.a f11734b;

        /* renamed from: c, reason: collision with root package name */
        public final DisplayMetrics f11735c;

        /* compiled from: DivViewWithItems.kt */
        /* renamed from: R6.d$a$a, reason: collision with other inner class name */
        public static final class C0158a extends u {

            /* renamed from: q, reason: collision with root package name */
            public final float f11736q;

            public C0158a(Context context) {
                super(context);
                this.f11736q = 50.0f;
            }

            @Override // androidx.recyclerview.widget.u
            public final float j(DisplayMetrics displayMetrics) {
                l.f(displayMetrics, "displayMetrics");
                return this.f11736q / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.u
            public final int l() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.u
            public final int m() {
                return -1;
            }
        }

        public a(v vVar, R6.a direction) {
            l.f(direction, "direction");
            this.f11733a = vVar;
            this.f11734b = direction;
            this.f11735c = vVar.getResources().getDisplayMetrics();
        }

        @Override // R6.d
        public final int a() {
            return f.a(this.f11733a, this.f11734b);
        }

        @Override // R6.d
        public final int b() {
            return f.b(this.f11733a);
        }

        @Override // R6.d
        public final DisplayMetrics c() {
            return this.f11735c;
        }

        @Override // R6.d
        public final int d() {
            v vVar = this.f11733a;
            LinearLayoutManager linearLayoutManagerC = f.c(vVar);
            Integer numValueOf = linearLayoutManagerC != null ? Integer.valueOf(linearLayoutManagerC.f16414p) : null;
            return (numValueOf != null && numValueOf.intValue() == 0) ? vVar.computeHorizontalScrollOffset() : vVar.computeVerticalScrollOffset();
        }

        @Override // R6.d
        public final int e() {
            return f.d(this.f11733a);
        }

        @Override // R6.d
        public final void f(int i, H9 sizeUnit, boolean z10) {
            l.f(sizeUnit, "sizeUnit");
            DisplayMetrics metrics = this.f11735c;
            l.e(metrics, "metrics");
            f.e(this.f11733a, i, sizeUnit, metrics, z10);
        }

        @Override // R6.d
        public final void g(boolean z10) {
            DisplayMetrics metrics = this.f11735c;
            l.e(metrics, "metrics");
            v vVar = this.f11733a;
            f.e(vVar, f.d(vVar), H9.PX, metrics, z10);
        }

        @Override // R6.d
        public final void h(int i) {
            v vVar = this.f11733a;
            int iB = f.b(vVar);
            if (i < 0 || i >= iB) {
                return;
            }
            C0158a c0158a = new C0158a(vVar.getContext());
            c0158a.f16448a = i;
            RecyclerView.p layoutManager = vVar.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.W0(c0158a);
            }
        }

        @Override // R6.d
        public final void i(int i) {
            v vVar = this.f11733a;
            int iB = f.b(vVar);
            if (i < 0 || i >= iB) {
                return;
            }
            vVar.scrollToPosition(i);
        }
    }

    /* compiled from: DivViewWithItems.kt */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final t f11737a;

        /* renamed from: b, reason: collision with root package name */
        public final DisplayMetrics f11738b;

        public b(t tVar) {
            this.f11737a = tVar;
            this.f11738b = tVar.getResources().getDisplayMetrics();
        }

        @Override // R6.d
        public final int a() {
            return this.f11737a.getViewPager().getCurrentItem();
        }

        @Override // R6.d
        public final int b() {
            RecyclerView.h adapter = this.f11737a.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @Override // R6.d
        public final DisplayMetrics c() {
            return this.f11738b;
        }

        @Override // R6.d
        public final void g(boolean z10) {
            this.f11737a.getViewPager().d(b() - 1, z10);
        }

        @Override // R6.d
        public final void h(int i) {
            int iB = b();
            if (i < 0 || i >= iB) {
                return;
            }
            this.f11737a.getViewPager().d(i, true);
        }

        @Override // R6.d
        public final void i(int i) {
            int iB = b();
            if (i < 0 || i >= iB) {
                return;
            }
            this.f11737a.getViewPager().d(i, false);
        }
    }

    /* compiled from: DivViewWithItems.kt */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final v f11739a;

        /* renamed from: b, reason: collision with root package name */
        public final R6.a f11740b;

        /* renamed from: c, reason: collision with root package name */
        public final DisplayMetrics f11741c;

        public c(v vVar, R6.a direction) {
            l.f(direction, "direction");
            this.f11739a = vVar;
            this.f11740b = direction;
            this.f11741c = vVar.getResources().getDisplayMetrics();
        }

        @Override // R6.d
        public final int a() {
            return f.a(this.f11739a, this.f11740b);
        }

        @Override // R6.d
        public final int b() {
            return f.b(this.f11739a);
        }

        @Override // R6.d
        public final DisplayMetrics c() {
            return this.f11741c;
        }

        @Override // R6.d
        public final int d() {
            v vVar = this.f11739a;
            LinearLayoutManager linearLayoutManagerC = f.c(vVar);
            Integer numValueOf = linearLayoutManagerC != null ? Integer.valueOf(linearLayoutManagerC.f16414p) : null;
            return (numValueOf != null && numValueOf.intValue() == 0) ? vVar.computeHorizontalScrollOffset() : vVar.computeVerticalScrollOffset();
        }

        @Override // R6.d
        public final int e() {
            return f.d(this.f11739a);
        }

        @Override // R6.d
        public final void f(int i, H9 sizeUnit, boolean z10) {
            l.f(sizeUnit, "sizeUnit");
            DisplayMetrics metrics = this.f11741c;
            l.e(metrics, "metrics");
            f.e(this.f11739a, i, sizeUnit, metrics, z10);
        }

        @Override // R6.d
        public final void g(boolean z10) {
            DisplayMetrics metrics = this.f11741c;
            l.e(metrics, "metrics");
            v vVar = this.f11739a;
            f.e(vVar, f.d(vVar), H9.PX, metrics, z10);
        }

        @Override // R6.d
        public final void h(int i) {
            v vVar = this.f11739a;
            int iB = f.b(vVar);
            if (i < 0 || i >= iB) {
                return;
            }
            vVar.smoothScrollToPosition(i);
        }

        @Override // R6.d
        public final void i(int i) {
            v vVar = this.f11739a;
            int iB = f.b(vVar);
            if (i < 0 || i >= iB) {
                return;
            }
            vVar.scrollToPosition(i);
        }
    }

    /* compiled from: DivViewWithItems.kt */
    /* renamed from: R6.d$d, reason: collision with other inner class name */
    public static final class C0159d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final C f11742a;

        /* renamed from: b, reason: collision with root package name */
        public final DisplayMetrics f11743b;

        public C0159d(C c10) {
            this.f11742a = c10;
            this.f11743b = c10.getResources().getDisplayMetrics();
        }

        @Override // R6.d
        public final int a() {
            return this.f11742a.getViewPager().getCurrentItem();
        }

        @Override // R6.d
        public final int b() {
            androidx.viewpager.widget.a adapter = this.f11742a.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getCount();
            }
            return 0;
        }

        @Override // R6.d
        public final DisplayMetrics c() {
            return this.f11743b;
        }

        @Override // R6.d
        public final void g(boolean z10) throws Resources.NotFoundException {
            this.f11742a.getViewPager().setCurrentItem(b() - 1, z10);
        }

        @Override // R6.d
        public final void h(int i) throws Resources.NotFoundException {
            int iB = b();
            if (i < 0 || i >= iB) {
                return;
            }
            this.f11742a.getViewPager().setCurrentItem(i, true);
        }

        @Override // R6.d
        public final void i(int i) throws Resources.NotFoundException {
            int iB = b();
            if (i < 0 || i >= iB) {
                return;
            }
            this.f11742a.getViewPager().setCurrentItem(i, false);
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract DisplayMetrics c();

    public int d() {
        return 0;
    }

    public int e() {
        return 0;
    }

    public void f(int i, H9 sizeUnit, boolean z10) {
        l.f(sizeUnit, "sizeUnit");
    }

    public abstract void g(boolean z10);

    public abstract void h(int i);

    public abstract void i(int i);
}
