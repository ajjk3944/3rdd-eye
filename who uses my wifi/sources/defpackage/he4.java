package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class he4 extends sb1 {
    public final u10 B1(oi0 oi0Var, int i, oi0 oi0Var2) {
        Parcel parcelU = U();
        cc2.c(parcelU, oi0Var);
        parcelU.writeString(ModuleDescriptor.MODULE_ID);
        parcelU.writeInt(i);
        cc2.c(parcelU, oi0Var2);
        return ga1.j(T(parcelU, 8));
    }

    public final u10 E1(oi0 oi0Var, int i) {
        Parcel parcelU = U();
        cc2.c(parcelU, oi0Var);
        parcelU.writeString(ModuleDescriptor.MODULE_ID);
        parcelU.writeInt(i);
        return ga1.j(T(parcelU, 4));
    }

    public final u10 G1(oi0 oi0Var, boolean z, long j) {
        Parcel parcelU = U();
        cc2.c(parcelU, oi0Var);
        parcelU.writeString(ModuleDescriptor.MODULE_ID);
        parcelU.writeInt(z ? 1 : 0);
        parcelU.writeLong(j);
        return ga1.j(T(parcelU, 7));
    }

    public final u10 l1(oi0 oi0Var, int i) {
        Parcel parcelU = U();
        cc2.c(parcelU, oi0Var);
        parcelU.writeString(ModuleDescriptor.MODULE_ID);
        parcelU.writeInt(i);
        return ga1.j(T(parcelU, 2));
    }
}
