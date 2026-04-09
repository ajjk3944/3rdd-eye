package androidx.core.app;

import M1.a;
import M1.c;
import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarL = remoteActionCompat.f15485a;
        if (aVar.h(1)) {
            cVarL = aVar.l();
        }
        remoteActionCompat.f15485a = (IconCompat) cVarL;
        CharSequence charSequenceG = remoteActionCompat.f15486b;
        if (aVar.h(2)) {
            charSequenceG = aVar.g();
        }
        remoteActionCompat.f15486b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.f15487c;
        if (aVar.h(3)) {
            charSequenceG2 = aVar.g();
        }
        remoteActionCompat.f15487c = charSequenceG2;
        Parcelable parcelableJ = remoteActionCompat.f15488d;
        if (aVar.h(4)) {
            parcelableJ = aVar.j();
        }
        remoteActionCompat.f15488d = (PendingIntent) parcelableJ;
        boolean zE = remoteActionCompat.f15489e;
        if (aVar.h(5)) {
            zE = aVar.e();
        }
        remoteActionCompat.f15489e = zE;
        boolean zE2 = remoteActionCompat.f15490f;
        if (aVar.h(6)) {
            zE2 = aVar.e();
        }
        remoteActionCompat.f15490f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f15485a;
        aVar.m(1);
        aVar.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.f15486b;
        aVar.m(2);
        aVar.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f15487c;
        aVar.m(3);
        aVar.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f15488d;
        aVar.m(4);
        aVar.r(pendingIntent);
        boolean z10 = remoteActionCompat.f15489e;
        aVar.m(5);
        aVar.n(z10);
        boolean z11 = remoteActionCompat.f15490f;
        aVar.m(6);
        aVar.n(z11);
    }
}
