package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import v7.a;
import v7.b;
import v7.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarH = remoteActionCompat.f1210a;
        boolean z10 = true;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        remoteActionCompat.f1210a = (IconCompat) cVarH;
        CharSequence charSequence = remoteActionCompat.f1211b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f23902e);
        }
        remoteActionCompat.f1211b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1212c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f23902e);
        }
        remoteActionCompat.f1212c = charSequence2;
        remoteActionCompat.f1213d = (PendingIntent) aVar.g(remoteActionCompat.f1213d, 4);
        boolean z11 = remoteActionCompat.f1214e;
        if (aVar.e(5)) {
            z11 = ((b) aVar).f23902e.readInt() != 0;
        }
        remoteActionCompat.f1214e = z11;
        boolean z12 = remoteActionCompat.f1215f;
        if (!aVar.e(6)) {
            z10 = z12;
        } else if (((b) aVar).f23902e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f1215f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1210a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1211b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f23902e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1212c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f1213d, 4);
        boolean z10 = remoteActionCompat.f1214e;
        aVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f1215f;
        aVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
