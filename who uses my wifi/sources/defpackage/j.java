package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return k.g;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new jb(parcel, classLoader);
            case 2:
                return new qb(parcel, classLoader);
            case 3:
                return new qe(parcel, classLoader);
            case 4:
                return new ak(parcel, classLoader);
            case 5:
                return new ot(parcel, classLoader);
            case 6:
                return new tb0(parcel, classLoader);
            case 7:
                return new qo0(parcel, classLoader);
            case 8:
                return new rt0(parcel, classLoader);
            case 9:
                return new xv0(parcel, classLoader);
            case 10:
                return new b11(parcel, classLoader);
            default:
                return new e21(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new k[i];
            case 1:
                return new jb[i];
            case 2:
                return new qb[i];
            case 3:
                return new qe[i];
            case 4:
                return new ak[i];
            case 5:
                return new ot[i];
            case 6:
                return new tb0[i];
            case 7:
                return new qo0[i];
            case 8:
                return new rt0[i];
            case 9:
                return new xv0[i];
            case 10:
                return new b11[i];
            default:
                return new e21[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return k.g;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new jb(parcel, null);
            case 2:
                return new qb(parcel, null);
            case 3:
                return new qe(parcel, null);
            case 4:
                return new ak(parcel, null);
            case 5:
                return new ot(parcel, null);
            case 6:
                return new tb0(parcel, null);
            case 7:
                return new qo0(parcel, null);
            case 8:
                return new rt0(parcel, null);
            case 9:
                return new xv0(parcel, null);
            case 10:
                return new b11(parcel, null);
            default:
                return new e21(parcel, null);
        }
    }
}
