package S0;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f3467b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i) {
        this.f3466a = i;
        this.f3467b = viewPager2;
    }

    @Override // S0.i
    public void a(int i) {
        switch (this.f3466a) {
            case 0:
                if (i == 0) {
                    this.f3467b.c();
                    break;
                }
                break;
        }
    }

    @Override // S0.i
    public final void c(int i) {
        switch (this.f3466a) {
            case 0:
                ViewPager2 viewPager2 = this.f3467b;
                if (viewPager2.f5648d != i) {
                    viewPager2.f5648d = i;
                    viewPager2.f5644H.H();
                    break;
                }
                break;
            default:
                ViewPager2 viewPager22 = this.f3467b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.f5653j.requestFocus(2);
                    break;
                }
                break;
        }
    }
}
