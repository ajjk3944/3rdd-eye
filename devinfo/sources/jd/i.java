package jd;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements n6.e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f27512a;

    /* renamed from: b, reason: collision with root package name */
    public int f27513b;

    /* renamed from: c, reason: collision with root package name */
    public int f27514c;

    public i(TabLayout tabLayout) {
        this.f27512a = new WeakReference(tabLayout);
    }

    @Override // n6.e
    public final void a(int i4) {
        this.f27513b = this.f27514c;
        this.f27514c = i4;
        TabLayout tabLayout = (TabLayout) this.f27512a.get();
        if (tabLayout != null) {
            tabLayout.U = this.f27514c;
        }
    }

    @Override // n6.e
    public final void b(int i4) {
        TabLayout tabLayout = (TabLayout) this.f27512a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i4 || i4 >= tabLayout.getTabCount()) {
            return;
        }
        int i10 = this.f27514c;
        tabLayout.h(tabLayout.f(i4), i10 == 0 || (i10 == 2 && this.f27513b == 0));
    }

    @Override // n6.e
    public final void c(int i4, float f10) {
        boolean z3;
        TabLayout tabLayout = (TabLayout) this.f27512a.get();
        if (tabLayout != null) {
            int i10 = this.f27514c;
            boolean z10 = true;
            if (i10 != 2 || this.f27513b == 1) {
                z3 = true;
            } else {
                z3 = true;
                z10 = false;
            }
            if (i10 == 2 && this.f27513b == 0) {
                z3 = false;
            }
            tabLayout.j(i4, f10, z10, z3, false);
        }
    }
}
