package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import l6.a;
import l6.b;
import l6.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f893a;
        boolean z3 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f893a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f894b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f28595e);
        }
        remoteActionCompat.f894b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f895c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f28595e);
        }
        remoteActionCompat.f895c = charSequence2;
        remoteActionCompat.f896d = (PendingIntent) aVar.f(remoteActionCompat.f896d, 4);
        boolean z10 = remoteActionCompat.f897e;
        if (aVar.e(5)) {
            z10 = ((b) aVar).f28595e.readInt() != 0;
        }
        remoteActionCompat.f897e = z10;
        boolean z11 = remoteActionCompat.f898f;
        if (!aVar.e(6)) {
            z3 = z11;
        } else if (((b) aVar).f28595e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f898f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f893a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f894b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f28595e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f895c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f896d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f897e;
        aVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z10 = remoteActionCompat.f898f;
        aVar.h(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
