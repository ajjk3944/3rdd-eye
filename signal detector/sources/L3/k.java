package L3;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k extends S0.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2600a;

    /* renamed from: c, reason: collision with root package name */
    public int f2602c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2601b = 0;

    public k(TabLayout tabLayout) {
        this.f2600a = new WeakReference(tabLayout);
    }

    @Override // S0.i
    public final void a(int i) {
        this.f2601b = this.f2602c;
        this.f2602c = i;
        TabLayout tabLayout = (TabLayout) this.f2600a.get();
        if (tabLayout != null) {
            tabLayout.f18479e0 = this.f2602c;
        }
    }

    @Override // S0.i
    public final void b(int i, float f2, int i3) {
        boolean z6;
        TabLayout tabLayout = (TabLayout) this.f2600a.get();
        if (tabLayout != null) {
            int i6 = this.f2602c;
            boolean z7 = true;
            if (i6 != 2 || this.f2601b == 1) {
                z6 = true;
            } else {
                z6 = true;
                z7 = false;
            }
            if (i6 == 2 && this.f2601b == 0) {
                z6 = false;
            }
            tabLayout.h(i, f2, z7, z6, false);
        }
    }

    @Override // S0.i
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.f2600a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i3 = this.f2602c;
        tabLayout.g((i < 0 || i >= tabLayout.getTabCount()) ? null : (g) tabLayout.f18473b.get(i), i3 == 0 || (i3 == 2 && this.f2601b == 0));
    }
}
