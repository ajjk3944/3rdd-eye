package S0;

import androidx.recyclerview.widget.I;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class e extends I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3465b;

    public /* synthetic */ e(int i, Object obj) {
        this.f3464a = i;
        this.f3465b = obj;
    }

    @Override // androidx.recyclerview.widget.I
    public final void a() {
        switch (this.f3464a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f3465b;
                viewPager2.f5649e = true;
                viewPager2.f5655l.f3463l = true;
                break;
            default:
                ((c1.g) this.f3465b).H();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final void b(int i, int i3, Object obj) {
        a();
    }

    @Override // androidx.recyclerview.widget.I
    public final void c(int i, int i3) {
        a();
    }

    @Override // androidx.recyclerview.widget.I
    public final void d(int i, int i3) {
        a();
    }

    @Override // androidx.recyclerview.widget.I
    public final void e(int i, int i3) {
        a();
    }
}
