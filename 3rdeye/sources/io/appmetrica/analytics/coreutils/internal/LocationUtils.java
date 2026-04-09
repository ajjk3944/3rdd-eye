package io.appmetrica.analytics.coreutils.internal;

import android.location.Location;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class LocationUtils {
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    public static final Location bytesToLocation(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            Location location = (Location) parcelObtain.readValue(Location.class.getClassLoader());
            parcelObtain.recycle();
            return location;
        } catch (Throwable unused) {
            parcelObtain.recycle();
            return null;
        }
    }

    public static final byte[] locationToBytes(Location location) {
        if (location == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeValue(location);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable unused) {
            parcelObtain.recycle();
            return null;
        }
    }
}
