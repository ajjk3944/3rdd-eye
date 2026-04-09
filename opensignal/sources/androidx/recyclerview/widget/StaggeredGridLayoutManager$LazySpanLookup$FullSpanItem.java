package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public int f2100a;

    /* renamed from: d, reason: collision with root package name */
    public int f2101d;

    /* renamed from: g, reason: collision with root package name */
    public int[] f2102g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2103r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2100a + ", mGapDir=" + this.f2101d + ", mHasUnwantedGapAfter=" + this.f2103r + ", mGapPerSpan=" + Arrays.toString(this.f2102g) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2100a);
        parcel.writeInt(this.f2101d);
        parcel.writeInt(this.f2103r ? 1 : 0);
        int[] iArr = this.f2102g;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2102g);
        }
    }
}
