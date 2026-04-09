package androidx.recyclerview.widget;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1552a;

    /* renamed from: b, reason: collision with root package name */
    public int f1553b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1554c;

    /* renamed from: d, reason: collision with root package name */
    public int f1555d;

    public final void a(int i4, int i10) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.f1555d;
        int i12 = i11 * 2;
        int[] iArr = this.f1554c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1554c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.f1554c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f1554c;
        iArr4[i12] = i4;
        iArr4[i12 + 1] = i10;
        this.f1555d++;
    }

    public final void b(RecyclerView recyclerView, boolean z3) {
        this.f1555d = 0;
        int[] iArr = this.f1554c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        f1 f1Var = recyclerView.f1243n;
        if (recyclerView.f1241m == null || f1Var == null || !f1Var.isItemPrefetchEnabled()) {
            return;
        }
        if (z3) {
            if (!recyclerView.f1227e.w()) {
                f1Var.collectInitialPrefetchPositions(recyclerView.f1241m.getItemCount(), this);
            }
        } else if (!recyclerView.S()) {
            f1Var.collectAdjacentPrefetchPositions(this.f1552a, this.f1553b, recyclerView.f1233h0, this);
        }
        int i4 = this.f1555d;
        if (i4 > f1Var.mPrefetchMaxCountObserved) {
            f1Var.mPrefetchMaxCountObserved = i4;
            f1Var.mPrefetchMaxObservedInInitialPrefetch = z3;
            recyclerView.f1223c.n();
        }
    }
}
