package kc;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;

/* loaded from: classes.dex */
public final class j extends x {
    public final jc.b U(jc.d dVar, String str, int i10, jc.d dVar2) {
        Parcel parcelR = R();
        oc.h.b(parcelR, dVar);
        parcelR.writeString(str);
        parcelR.writeInt(i10);
        oc.h.b(parcelR, dVar2);
        Parcel parcelD = d(parcelR, 2);
        jc.b bVarU = jc.d.U(parcelD.readStrongBinder());
        parcelD.recycle();
        return bVarU;
    }

    public final jc.b V(jc.d dVar, String str, int i10, jc.d dVar2) {
        Parcel parcelR = R();
        oc.h.b(parcelR, dVar);
        parcelR.writeString(str);
        parcelR.writeInt(i10);
        oc.h.b(parcelR, dVar2);
        Parcel parcelD = d(parcelR, 3);
        jc.b bVarU = jc.d.U(parcelD.readStrongBinder());
        parcelD.recycle();
        return bVarU;
    }
}
