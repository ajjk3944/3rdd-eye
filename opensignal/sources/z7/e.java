package z7;

import androidx.viewpager2.widget.ViewPager2;
import h7.s0;

/* loaded from: classes.dex */
public final class e extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26702b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f26701a = i10;
        this.f26702b = obj;
    }

    @Override // h7.s0
    public final void a() {
        switch (this.f26701a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f26702b;
                viewPager2.f2153r = true;
                viewPager2.G.f26700l = true;
                break;
            default:
                ((js.e) this.f26702b).q0();
                break;
        }
    }

    @Override // h7.s0
    public final void b(int i10, int i11) {
        a();
    }

    @Override // h7.s0
    public final void c(int i10, int i11) {
        a();
    }

    @Override // h7.s0
    public final void d(int i10, int i11) {
        a();
    }

    @Override // h7.s0
    public final void e(int i10, int i11) {
        a();
    }
}
