package E;

import A3.w;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class g extends W.b {
    public static final Parcelable.Creator<g> CREATOR = new w(2);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1328c;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f1328c = new SparseArray(i);
        for (int i3 = 0; i3 < i; i3++) {
            this.f1328c.append(iArr[i3], parcelableArray[i3]);
        }
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f1328c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.f1328c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f1328c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
