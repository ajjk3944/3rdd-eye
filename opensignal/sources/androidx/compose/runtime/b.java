package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import n0.t0;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {
    public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
        t0 t0Var;
        if (classLoader == null) {
            classLoader = b.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            t0Var = t0.f17318g;
        } else if (i10 == 1) {
            t0Var = t0.f17321y;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(h0.b.m("Unsupported MutableState policy ", i10, " was restored"));
            }
            t0Var = t0.f17319r;
        }
        return new ParcelableSnapshotMutableState(value, t0Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ParcelableSnapshotMutableState[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
