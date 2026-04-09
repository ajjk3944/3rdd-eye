package androidx.recyclerview.widget;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1516b;

    public /* synthetic */ u(int i4, Object obj) {
        this.f1515a = i4;
        this.f1516b = obj;
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onScrolled(RecyclerView recyclerView, int i4, int i10) {
        switch (this.f1515a) {
            case 0:
                x xVar = (x) this.f1516b;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i11 = xVar.f1527a;
                int iComputeVerticalScrollRange = xVar.f1543s.computeVerticalScrollRange();
                int i12 = xVar.f1542r;
                xVar.f1544t = iComputeVerticalScrollRange - i12 > 0 && i12 >= i11;
                int iComputeHorizontalScrollRange = xVar.f1543s.computeHorizontalScrollRange();
                int i13 = xVar.f1541q;
                boolean z3 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= i11;
                xVar.f1545u = z3;
                boolean z10 = xVar.f1544t;
                if (!z10 && !z3) {
                    if (xVar.f1546v != 0) {
                        xVar.e(0);
                        break;
                    }
                } else {
                    if (z10) {
                        float f10 = i12;
                        xVar.f1536l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
                        xVar.f1535k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
                    }
                    if (xVar.f1545u) {
                        float f11 = iComputeHorizontalScrollOffset;
                        float f12 = i13;
                        xVar.f1539o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
                        xVar.f1538n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
                    }
                    int i14 = xVar.f1546v;
                    if (i14 == 0 || i14 == 1) {
                        xVar.e(1);
                        break;
                    }
                }
                break;
            default:
                ((ql.b) this.f1516b).run();
                break;
        }
    }
}
