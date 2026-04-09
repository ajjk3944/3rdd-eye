package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1444a = (IconCompat) aVar.v(remoteActionCompat.f1444a, 1);
        remoteActionCompat.f1445b = aVar.l(remoteActionCompat.f1445b, 2);
        remoteActionCompat.f1446c = aVar.l(remoteActionCompat.f1446c, 3);
        remoteActionCompat.f1447d = (PendingIntent) aVar.r(remoteActionCompat.f1447d, 4);
        remoteActionCompat.f1448e = aVar.h(remoteActionCompat.f1448e, 5);
        remoteActionCompat.f1449f = aVar.h(remoteActionCompat.f1449f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1444a, 1);
        aVar.D(remoteActionCompat.f1445b, 2);
        aVar.D(remoteActionCompat.f1446c, 3);
        aVar.H(remoteActionCompat.f1447d, 4);
        aVar.z(remoteActionCompat.f1448e, 5);
        aVar.z(remoteActionCompat.f1449f, 6);
    }
}
