package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hu extends ko0 {
    public final /* synthetic */ iu a;

    public hu(iu iuVar) {
        this.a = iuVar;
    }

    @Override // defpackage.ko0
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        iu iuVar = this.a;
        int i3 = iuVar.a;
        int iComputeVerticalScrollRange = iuVar.s.computeVerticalScrollRange();
        int i4 = iuVar.r;
        iuVar.t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = iuVar.s.computeHorizontalScrollRange();
        int i5 = iuVar.q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        iuVar.u = z;
        boolean z2 = iuVar.t;
        if (!z2 && !z) {
            if (iuVar.v != 0) {
                iuVar.g(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            iuVar.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            iuVar.k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (iuVar.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            iuVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            iuVar.n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = iuVar.v;
        if (i6 == 0 || i6 == 1) {
            iuVar.g(1);
        }
    }
}
