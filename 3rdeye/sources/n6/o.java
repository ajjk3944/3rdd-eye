package N6;

import H6.C0672i;
import H6.C0675l;
import H6.L;
import H6.M;
import K6.C0745n;
import N7.Ba;
import N7.Z;
import O6.C;
import androidx.viewpager.widget.ViewPager;
import j6.g;

/* compiled from: DivTabsEventManager.kt */
/* loaded from: classes.dex */
public final class o implements ViewPager.j {

    /* renamed from: a, reason: collision with root package name */
    public final C0672i f4742a;

    /* renamed from: b, reason: collision with root package name */
    public final C0745n f4743b;

    /* renamed from: c, reason: collision with root package name */
    public final g.a f4744c;

    /* renamed from: d, reason: collision with root package name */
    public final L f4745d;

    /* renamed from: e, reason: collision with root package name */
    public final C f4746e;

    /* renamed from: f, reason: collision with root package name */
    public Ba f4747f;

    /* renamed from: g, reason: collision with root package name */
    public int f4748g;

    public o(C0672i c0672i, C0745n actionBinder, g.a div2Logger, L visibilityActionTracker, C tabLayout, Ba div) {
        kotlin.jvm.internal.l.f(actionBinder, "actionBinder");
        kotlin.jvm.internal.l.f(div2Logger, "div2Logger");
        kotlin.jvm.internal.l.f(visibilityActionTracker, "visibilityActionTracker");
        kotlin.jvm.internal.l.f(tabLayout, "tabLayout");
        kotlin.jvm.internal.l.f(div, "div");
        this.f4742a = c0672i;
        this.f4743b = actionBinder;
        this.f4744c = div2Logger;
        this.f4745d = visibilityActionTracker;
        this.f4746e = tabLayout;
        this.f4747f = div;
        this.f4748g = -1;
    }

    public final void a(int i) {
        int i10 = this.f4748g;
        if (i == i10) {
            return;
        }
        C0672i c0672i = this.f4742a;
        L l5 = this.f4745d;
        C root = this.f4746e;
        C0675l c0675l = c0672i.f2146a;
        if (i10 != -1) {
            Z z10 = this.f4747f.f4949q.get(i10).f4959a;
            l5.getClass();
            kotlin.jvm.internal.l.f(root, "root");
            L.g(c0672i, root, z10, new M(l5, c0672i));
            c0675l.N(root);
        }
        Ba.a aVar = this.f4747f.f4949q.get(i);
        l5.e(c0672i, root, aVar.f4959a);
        c0675l.q(root, aVar.f4959a);
        this.f4748g = i;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        this.f4744c.getClass();
        a(i);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f10, int i10) {
    }
}
