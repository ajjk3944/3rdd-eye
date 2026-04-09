package s7;

import M6.C0795a;
import O6.t;
import Q1.f;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerIndicatorView.kt */
/* loaded from: classes.dex */
public final class h extends f.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f46162d;

    public h(i iVar) {
        this.f46162d = iVar;
    }

    public final int a(int i) {
        Q1.f viewPager;
        t tVar = this.f46162d.f46164c;
        RecyclerView.h adapter = (tVar == null || (viewPager = tVar.getViewPager()) == null) ? null : viewPager.getAdapter();
        C0795a c0795a = adapter instanceof C0795a ? (C0795a) adapter : null;
        if (c0795a == null) {
            return i;
        }
        int iC = c0795a.f3271l.c();
        return ((i - (c0795a.f4230y ? 2 : 0)) + iC) % iC;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b A[PHI: r1
  0x000b: PHI (r1v3 float) = (r1v0 float), (r1v1 float) binds: [B:5:0x0009, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Q1.f.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPageScrolled(int r4, float r5, int r6) {
        /*
            r3 = this;
            s7.i r6 = r3.f46162d
            s7.f r0 = r6.f46163b
            if (r0 == 0) goto L27
            r1 = 0
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 >= 0) goto Ld
        Lb:
            r5 = r1
            goto L14
        Ld:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L14
            goto Lb
        L14:
            int r4 = r3.a(r4)
            r0.f46151m = r4
            r0.f46152n = r5
            t7.a r1 = r0.f46142c
            r1.g(r5, r4)
            r0.a(r5, r4)
            r6.invalidate()
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.h.onPageScrolled(int, float, int):void");
    }

    @Override // Q1.f.e
    public final void onPageSelected(int i) {
        i iVar = this.f46162d;
        f fVar = iVar.f46163b;
        if (fVar != null) {
            int iA = a(i);
            fVar.f46151m = iA;
            fVar.f46152n = 0.0f;
            fVar.f46142c.onPageSelected(iA);
            fVar.a(0.0f, iA);
            iVar.invalidate();
        }
    }
}
