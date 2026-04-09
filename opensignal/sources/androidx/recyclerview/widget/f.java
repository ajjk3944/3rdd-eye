package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f2104a = parcel.readInt();
        savedState.f2105d = parcel.readInt();
        int i10 = parcel.readInt();
        savedState.f2106g = i10;
        if (i10 > 0) {
            int[] iArr = new int[i10];
            savedState.f2107r = iArr;
            parcel.readIntArray(iArr);
        }
        int i11 = parcel.readInt();
        savedState.f2108x = i11;
        if (i11 > 0) {
            int[] iArr2 = new int[i11];
            savedState.f2109y = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.D = parcel.readInt() == 1;
        savedState.E = parcel.readInt() == 1;
        savedState.F = parcel.readInt() == 1;
        savedState.B = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new StaggeredGridLayoutManager.SavedState[i10];
    }
}
