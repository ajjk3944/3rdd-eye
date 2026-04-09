package Q1;

import Q1.f;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class h extends f.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f10917d;

    public h(f fVar) {
        this.f10917d = fVar;
    }

    @Override // Q1.f.e
    public final void onPageSelected(int i) {
        f fVar = this.f10917d;
        fVar.clearFocus();
        if (fVar.hasFocus()) {
            fVar.f10890k.requestFocus(2);
        }
    }
}
