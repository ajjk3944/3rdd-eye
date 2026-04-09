package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c1 implements Parcelable.ClassLoaderCreator {
    public static d1 a(Parcel parcel, ClassLoader classLoader) {
        e eVar;
        if (classLoader == null) {
            classLoader = c1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i4 = parcel.readInt();
        if (i4 == 0) {
            eVar = e.f34769d;
        } else if (i4 == 1) {
            eVar = e.g;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException(r5.c.h(i4, "Unsupported MutableState policy ", " was restored"));
            }
            eVar = e.f34770e;
        }
        return new d1(value, eVar);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new d1[i4];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
