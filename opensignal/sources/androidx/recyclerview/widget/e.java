package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2111a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2112b;

    public final void a() {
        int[] iArr = this.f2111a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f2112b = null;
    }

    public final void b(int i10) {
        int[] iArr = this.f2111a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.f2111a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2111a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f2111a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i10, int i11) {
        int[] iArr = this.f2111a;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        b(i12);
        int[] iArr2 = this.f2111a;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill(this.f2111a, i10, i12, -1);
        ArrayList arrayList = this.f2112b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f2112b.get(size);
            int i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2100a;
            if (i13 >= i10) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2100a = i13 + i11;
            }
        }
    }

    public final void d(int i10, int i11) {
        int[] iArr = this.f2111a;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        b(i12);
        int[] iArr2 = this.f2111a;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = this.f2111a;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = this.f2112b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f2112b.get(size);
            int i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2100a;
            if (i13 >= i10) {
                if (i13 < i12) {
                    this.f2112b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2100a = i13 - i11;
                }
            }
        }
    }
}
