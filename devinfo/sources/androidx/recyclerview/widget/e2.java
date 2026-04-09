package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e2 implements Parcelable {
    public static final Parcelable.Creator<e2> CREATOR = new i0(1);

    /* renamed from: a, reason: collision with root package name */
    public int f1345a;

    /* renamed from: b, reason: collision with root package name */
    public int f1346b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1347c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1348d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1345a + ", mGapDir=" + this.f1346b + ", mHasUnwantedGapAfter=" + this.f1348d + ", mGapPerSpan=" + Arrays.toString(this.f1347c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f1345a);
        parcel.writeInt(this.f1346b);
        parcel.writeInt(this.f1348d ? 1 : 0);
        int[] iArr = this.f1347c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1347c);
        }
    }
}
