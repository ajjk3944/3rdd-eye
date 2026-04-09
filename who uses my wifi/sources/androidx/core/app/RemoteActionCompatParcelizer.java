package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.f51;
import defpackage.g51;
import defpackage.h51;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(f51 f51Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        h51 h51VarH = remoteActionCompat.a;
        boolean z = true;
        if (f51Var.e(1)) {
            h51VarH = f51Var.h();
        }
        remoteActionCompat.a = (IconCompat) h51VarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (f51Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((g51) f51Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (f51Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((g51) f51Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) f51Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (f51Var.e(5)) {
            z2 = ((g51) f51Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!f51Var.e(6)) {
            z = z3;
        } else if (((g51) f51Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, f51 f51Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f51Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        f51Var.i(1);
        f51Var.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        f51Var.i(2);
        Parcel parcel = ((g51) f51Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        f51Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        f51Var.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        f51Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        f51Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
