package ie;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i implements x7.e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f11354a;

    /* renamed from: b, reason: collision with root package name */
    public int f11355b;

    /* renamed from: c, reason: collision with root package name */
    public int f11356c;

    public i(TabLayout tabLayout) {
        this.f11354a = new WeakReference(tabLayout);
    }

    @Override // x7.e
    public final void a(int i10) {
        this.f11355b = this.f11356c;
        this.f11356c = i10;
        TabLayout tabLayout = (TabLayout) this.f11354a.get();
        if (tabLayout != null) {
            tabLayout.f5735t0 = this.f11356c;
        }
    }

    @Override // x7.e
    public final void b(int i10) {
        TabLayout tabLayout = (TabLayout) this.f11354a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
            return;
        }
        int i11 = this.f11356c;
        tabLayout.f((i10 < 0 || i10 >= tabLayout.getTabCount()) ? null : (h) tabLayout.f5716d.get(i10), i11 == 0 || (i11 == 2 && this.f11355b == 0));
    }

    @Override // x7.e
    public final void c(int i10, float f10) {
        boolean z10;
        TabLayout tabLayout = (TabLayout) this.f11354a.get();
        if (tabLayout != null) {
            int i11 = this.f11356c;
            boolean z11 = true;
            if (i11 != 2 || this.f11355b == 1) {
                z10 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            if (i11 == 2 && this.f11355b == 0) {
                z10 = false;
            }
            tabLayout.h(i10, f10, z11, z10, false);
        }
    }
}
