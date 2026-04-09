package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f30666a = (IconCompat) versionedParcel.v(remoteActionCompat.f30666a, 1);
        remoteActionCompat.f30667b = versionedParcel.l(remoteActionCompat.f30667b, 2);
        remoteActionCompat.f30668c = versionedParcel.l(remoteActionCompat.f30668c, 3);
        remoteActionCompat.f30669d = (PendingIntent) versionedParcel.r(remoteActionCompat.f30669d, 4);
        remoteActionCompat.f30670e = versionedParcel.h(remoteActionCompat.f30670e, 5);
        remoteActionCompat.f30671f = versionedParcel.h(remoteActionCompat.f30671f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f30666a, 1);
        versionedParcel.D(remoteActionCompat.f30667b, 2);
        versionedParcel.D(remoteActionCompat.f30668c, 3);
        versionedParcel.H(remoteActionCompat.f30669d, 4);
        versionedParcel.z(remoteActionCompat.f30670e, 5);
        versionedParcel.z(remoteActionCompat.f30671f, 6);
    }
}
