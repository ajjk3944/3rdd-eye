package androidx.recyclerview.widget;

import java.util.Arrays;

/* renamed from: androidx.recyclerview.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318o implements O {

    /* renamed from: a, reason: collision with root package name */
    public int f5558a;

    /* renamed from: b, reason: collision with root package name */
    public int f5559b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5560c;

    /* renamed from: d, reason: collision with root package name */
    public int f5561d;

    public final void a(int i, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i6 = this.f5561d;
        int i7 = i6 * 2;
        int[] iArr = this.f5560c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f5560c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int[] iArr3 = new int[i6 * 4];
            this.f5560c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f5560c;
        iArr4[i7] = i;
        iArr4[i7 + 1] = i3;
        this.f5561d++;
    }

    public final void b(RecyclerView recyclerView, boolean z6) {
        this.f5561d = 0;
        int[] iArr = this.f5560c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        Q q3 = recyclerView.f5362m;
        if (recyclerView.f5360l == null || q3 == null || !q3.isItemPrefetchEnabled()) {
            return;
        }
        if (z6) {
            if (!recyclerView.f5345d.j()) {
                q3.collectInitialPrefetchPositions(recyclerView.f5360l.getItemCount(), this);
            }
        } else if (!recyclerView.M()) {
            q3.collectAdjacentPrefetchPositions(this.f5558a, this.f5559b, recyclerView.f5372u0, this);
        }
        int i = this.f5561d;
        if (i > q3.mPrefetchMaxCountObserved) {
            q3.mPrefetchMaxCountObserved = i;
            q3.mPrefetchMaxObservedInInitialPrefetch = z6;
            recyclerView.f5342b.l();
        }
    }
}
