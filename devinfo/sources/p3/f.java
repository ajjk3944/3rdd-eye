package p3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import g1.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends m4.b {
    public static final Parcelable.Creator<f> CREATOR = new p(11);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f31161c;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i4 = parcel.readInt();
        int[] iArr = new int[i4];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f31161c = new SparseArray(i4);
        for (int i10 = 0; i10 < i4; i10++) {
            this.f31161c.append(iArr[i10], parcelableArray[i10]);
        }
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        SparseArray sparseArray = this.f31161c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f31161c.keyAt(i10);
            parcelableArr[i10] = (Parcelable) this.f31161c.valueAt(i10);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }
}
