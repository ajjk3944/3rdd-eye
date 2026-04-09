package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g51;
import defpackage.h51;
import defpackage.k2;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k2(24);
    public final h51 f;

    public ParcelImpl(Parcel parcel) {
        this.f = new g51(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new g51(parcel).k(this.f);
    }
}
