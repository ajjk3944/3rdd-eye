package M6;

import H6.C0672i;
import H6.C0675l;
import K6.C0713c;
import N7.G7;
import N7.Z;
import Q1.f;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c9.AbstractC2082c;
import c9.C2092m;

/* compiled from: DivPagerPageChangeCallback.kt */
/* loaded from: classes.dex */
public final class k extends f.e {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2082c f4262d;

    /* renamed from: e, reason: collision with root package name */
    public final C0672i f4263e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f4264f;

    /* renamed from: g, reason: collision with root package name */
    public final O6.t f4265g;

    /* renamed from: h, reason: collision with root package name */
    public int f4266h;
    public final C0675l i;

    /* renamed from: j, reason: collision with root package name */
    public int f4267j;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            view.removeOnLayoutChangeListener(this);
            k.this.a();
        }
    }

    public k(G7 divPager, AbstractC2082c items, C0672i c0672i, RecyclerView recyclerView, O6.t pagerView) {
        kotlin.jvm.internal.l.f(divPager, "divPager");
        kotlin.jvm.internal.l.f(items, "items");
        kotlin.jvm.internal.l.f(pagerView, "pagerView");
        this.f4262d = items;
        this.f4263e = c0672i;
        this.f4264f = recyclerView;
        this.f4265g = pagerView;
        this.f4266h = -1;
        C0675l c0675l = c0672i.f2146a;
        this.i = c0675l;
        c0675l.getConfig().getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int i = 0;
        while (true) {
            RecyclerView recyclerView = this.f4264f;
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i10 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == -1) {
                return;
            }
            i7.b bVar = (i7.b) this.f4262d.get(childAdapterPosition);
            this.i.getDiv2Component$div_release().B().e(this.f4263e.a(bVar.f38461b), childAt, bVar.f38460a);
            i = i10;
        }
    }

    public final void b() {
        int i = 0;
        int i10 = 0;
        while (true) {
            RecyclerView recyclerView = this.f4264f;
            if (!(i10 < recyclerView.getChildCount())) {
                if (i > 0) {
                    a();
                    return;
                } else if (!C6.r.c(recyclerView) || recyclerView.isLayoutRequested()) {
                    recyclerView.addOnLayoutChangeListener(new a());
                    return;
                } else {
                    a();
                    return;
                }
            }
            int i11 = i10 + 1;
            if (recyclerView.getChildAt(i10) == null) {
                throw new IndexOutOfBoundsException();
            }
            i++;
            if (i < 0) {
                C2092m.Z();
                throw null;
            }
            i10 = i11;
        }
    }

    @Override // Q1.f.e
    @SuppressLint({"SwitchIntDef"})
    public final void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        if (i == 0) {
            b();
        }
    }

    @Override // Q1.f.e
    public final void onPageScrolled(int i, float f10, int i10) {
        super.onPageScrolled(i, f10, i10);
        RecyclerView.p layoutManager = this.f4264f.getLayoutManager();
        int i11 = (layoutManager != null ? layoutManager.f16510n : 0) / 20;
        int i12 = this.f4267j + i10;
        this.f4267j = i12;
        if (i12 > i11) {
            this.f4267j = 0;
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q1.f.e
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        b();
        int i10 = this.f4266h;
        if (i == i10) {
            return;
        }
        O6.t tVar = this.f4265g;
        C0675l c0675l = this.i;
        if (i10 != -1) {
            c0675l.N(tVar);
        }
        if (i == -1) {
            this.f4266h = i;
            return;
        }
        int i11 = this.f4266h;
        AbstractC2082c abstractC2082c = this.f4262d;
        if (i11 != -1) {
            c0675l.getDiv2Component$div_release().q();
            A7.d dVar = ((i7.b) abstractC2082c.get(i)).f38461b;
        }
        Z z10 = ((i7.b) abstractC2082c.get(i)).f38460a;
        if (C0713c.M(z10.d())) {
            c0675l.q(tVar, z10);
        }
        this.f4266h = i;
    }
}
