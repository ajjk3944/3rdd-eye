package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new A3.q(20);

    /* renamed from: a, reason: collision with root package name */
    public int f5554a;

    /* renamed from: b, reason: collision with root package name */
    public int f5555b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5556c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5557d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f5554a + ", mGapDir=" + this.f5555b + ", mHasUnwantedGapAfter=" + this.f5557d + ", mGapPerSpan=" + Arrays.toString(this.f5556c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5554a);
        parcel.writeInt(this.f5555b);
        parcel.writeInt(this.f5557d ? 1 : 0);
        int[] iArr = this.f5556c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f5556c);
        }
    }
}
