package h7;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class v extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f10217a;

    public v(x xVar) {
        this.f10217a = xVar;
    }

    @Override // h7.c1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        x xVar = this.f10217a;
        int i12 = xVar.f10235a;
        int iComputeVerticalScrollRange = xVar.f10251s.computeVerticalScrollRange();
        int i13 = xVar.f10250r;
        xVar.f10252t = iComputeVerticalScrollRange - i13 > 0 && i13 >= i12;
        int iComputeHorizontalScrollRange = xVar.f10251s.computeHorizontalScrollRange();
        int i14 = xVar.f10249q;
        boolean z10 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i12;
        xVar.f10253u = z10;
        boolean z11 = xVar.f10252t;
        if (!z11 && !z10) {
            if (xVar.f10254v != 0) {
                xVar.i(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i13;
            xVar.f10244l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            xVar.k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
        }
        if (xVar.f10253u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i14;
            xVar.f10247o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            xVar.f10246n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = xVar.f10254v;
        if (i15 == 0 || i15 == 1) {
            xVar.i(1);
        }
    }
}
