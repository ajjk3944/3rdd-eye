package x0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;

/* loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24726a;

    public /* synthetic */ o(int i10) {
        this.f24726a = i10;
    }

    public static SnapshotStateList a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o.class.getClassLoader();
        }
        int i10 = parcel.readInt();
        if (i10 == 0) {
            return new SnapshotStateList();
        }
        r0.f fVarE = r0.i.f21133d.e();
        for (int i11 = 0; i11 < i10; i11++) {
            fVarE.add(parcel.readValue(classLoader));
        }
        return new SnapshotStateList(fVarE.c());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f24726a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f1242d;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new ExtendableSavedState(parcel, classLoader);
            default:
                return new ParcelableSparseArray(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f24726a) {
            case 0:
                return new SnapshotStateList[i10];
            case 1:
                return new AbsSavedState[i10];
            case 2:
                return new ExtendableSavedState[i10];
            default:
                return new ParcelableSparseArray[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f24726a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f1242d;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new ExtendableSavedState(parcel, null);
            default:
                return new ParcelableSparseArray(parcel, null);
        }
    }
}
