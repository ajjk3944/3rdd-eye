package M6;

import K6.C0749p;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FixedPageSizeOffScreenPagesController.kt */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final O6.t f4300a;

    /* renamed from: b, reason: collision with root package name */
    public final u f4301b;

    /* renamed from: c, reason: collision with root package name */
    public final C0795a f4302c;

    public t(O6.t parent, int i, float f10, u uVar, j jVar, boolean z10, C0795a c0795a) {
        kotlin.jvm.internal.l.f(parent, "parent");
        this.f4300a = parent;
        this.f4301b = uVar;
        this.f4302c = c0795a;
        if (uVar.c() == 0.0f) {
            return;
        }
        Q1.f viewPager = parent.getViewPager();
        float fC = i / (uVar.c() + f10);
        RecyclerView recyclerView = parent.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize(((int) Math.ceil(fC)) + 2);
        }
        if (uVar.a()) {
            viewPager.setOffscreenPageLimit(Math.max((int) Math.ceil(fC - 1), 1));
            return;
        }
        float fB = uVar.b();
        if (fB > f10) {
            viewPager.setOffscreenPageLimit(1);
            return;
        }
        if (z10 || (jVar.f4257g >= fB && jVar.f4258h >= fB)) {
            viewPager.setOffscreenPageLimit(-1);
            return;
        }
        C0749p c0749p = new C0749p(this, 3);
        c0749p.invoke(Integer.valueOf(viewPager.getCurrentItem()));
        parent.setChangePageCallbackForOffScreenPages$div_release(new s(c0749p));
    }
}
