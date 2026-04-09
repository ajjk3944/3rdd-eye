package Q1;

import Q1.f;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class g extends f.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f10916d;

    public g(f fVar) {
        this.f10916d = fVar;
    }

    @Override // Q1.f.e
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f10916d.g();
        }
    }

    @Override // Q1.f.e
    public final void onPageSelected(int i) {
        f fVar = this.f10916d;
        if (fVar.f10885e != i) {
            fVar.f10885e = i;
            fVar.f10900u.a();
        }
    }
}
