package androidx.core.app;

import N0.a;
import N0.b;
import N0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f5079a;
        boolean z6 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f5079a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f5080b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2976e);
        }
        remoteActionCompat.f5080b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f5081c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2976e);
        }
        remoteActionCompat.f5081c = charSequence2;
        remoteActionCompat.f5082d = (PendingIntent) aVar.f(remoteActionCompat.f5082d, 4);
        boolean z7 = remoteActionCompat.f5083e;
        if (aVar.e(5)) {
            z7 = ((b) aVar).f2976e.readInt() != 0;
        }
        remoteActionCompat.f5083e = z7;
        boolean z8 = remoteActionCompat.f5084f;
        if (!aVar.e(6)) {
            z6 = z8;
        } else if (((b) aVar).f2976e.readInt() == 0) {
            z6 = false;
        }
        remoteActionCompat.f5084f = z6;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f5079a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5080b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f2976e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f5081c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f5082d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z6 = remoteActionCompat.f5083e;
        aVar.h(5);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = remoteActionCompat.f5084f;
        aVar.h(6);
        parcel.writeInt(z7 ? 1 : 0);
    }
}
