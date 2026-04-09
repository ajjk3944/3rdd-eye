package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2450a = (IconCompat) versionedParcel.v(remoteActionCompat.f2450a, 1);
        remoteActionCompat.f2451b = versionedParcel.l(remoteActionCompat.f2451b, 2);
        remoteActionCompat.f2452c = versionedParcel.l(remoteActionCompat.f2452c, 3);
        remoteActionCompat.f2453d = (PendingIntent) versionedParcel.r(remoteActionCompat.f2453d, 4);
        remoteActionCompat.f2454e = versionedParcel.h(remoteActionCompat.f2454e, 5);
        remoteActionCompat.f2455f = versionedParcel.h(remoteActionCompat.f2455f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f2450a, 1);
        versionedParcel.D(remoteActionCompat.f2451b, 2);
        versionedParcel.D(remoteActionCompat.f2452c, 3);
        versionedParcel.H(remoteActionCompat.f2453d, 4);
        versionedParcel.z(remoteActionCompat.f2454e, 5);
        versionedParcel.z(remoteActionCompat.f2455f, 6);
    }
}
