package Q4;

import androidx.recyclerview.widget.C0317n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.U;

/* loaded from: classes.dex */
public final class a extends U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3190b;

    public /* synthetic */ a(int i, Object obj) {
        this.f3189a = i;
        this.f3190b = obj;
    }

    @Override // androidx.recyclerview.widget.U
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        switch (this.f3189a) {
            case 0:
                q5.l lVar = (q5.l) this.f3190b;
                if (i == 1) {
                    lVar.f23296a = true;
                }
                if (i == 0) {
                    lVar.f23296a = false;
                    break;
                }
                break;
            case 1:
                q5.l lVar2 = (q5.l) this.f3190b;
                if (i == 1) {
                    lVar2.f23296a = true;
                }
                if (i == 0) {
                    lVar2.f23296a = false;
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.U
    public void onScrolled(RecyclerView recyclerView, int i, int i3) {
        switch (this.f3189a) {
            case 2:
                C0317n c0317n = (C0317n) this.f3190b;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i6 = c0317n.f5529a;
                int iComputeVerticalScrollRange = c0317n.f5546s.computeVerticalScrollRange();
                int i7 = c0317n.f5545r;
                c0317n.f5547t = iComputeVerticalScrollRange - i7 > 0 && i7 >= i6;
                int iComputeHorizontalScrollRange = c0317n.f5546s.computeHorizontalScrollRange();
                int i8 = c0317n.f5544q;
                boolean z6 = iComputeHorizontalScrollRange - i8 > 0 && i8 >= i6;
                c0317n.f5548u = z6;
                boolean z7 = c0317n.f5547t;
                if (!z7 && !z6) {
                    if (c0317n.f5549v != 0) {
                        c0317n.d(0);
                        break;
                    }
                } else {
                    if (z7) {
                        float f2 = i7;
                        c0317n.f5539l = (int) ((((f2 / 2.0f) + iComputeVerticalScrollOffset) * f2) / iComputeVerticalScrollRange);
                        c0317n.f5538k = Math.min(i7, (i7 * i7) / iComputeVerticalScrollRange);
                    }
                    if (c0317n.f5548u) {
                        float f5 = iComputeHorizontalScrollOffset;
                        float f6 = i8;
                        c0317n.f5542o = (int) ((((f6 / 2.0f) + f5) * f6) / iComputeHorizontalScrollRange);
                        c0317n.f5541n = Math.min(i8, (i8 * i8) / iComputeHorizontalScrollRange);
                    }
                    int i9 = c0317n.f5549v;
                    if (i9 == 0 || i9 == 1) {
                        c0317n.d(1);
                        break;
                    }
                }
                break;
        }
    }
}
