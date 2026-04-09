package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2100a = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2101d = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2103r = parcel.readInt() == 1;
        int i10 = parcel.readInt();
        if (i10 > 0) {
            int[] iArr = new int[i10];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2102g = iArr;
            parcel.readIntArray(iArr);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i10];
    }
}
