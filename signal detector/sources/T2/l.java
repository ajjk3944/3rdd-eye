package T2;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class l extends W2.a {
    public final S2.a n1(S2.b bVar, int i, S2.b bVar2) {
        Parcel parcelH0 = h0();
        X2.g.b(parcelH0, bVar);
        parcelH0.writeString(ModuleDescriptor.MODULE_ID);
        parcelH0.writeInt(i);
        X2.g.b(parcelH0, bVar2);
        return AbstractC2763b.c(g0(parcelH0, 2));
    }

    public final S2.a x1(S2.b bVar, int i, S2.b bVar2) {
        Parcel parcelH0 = h0();
        X2.g.b(parcelH0, bVar);
        parcelH0.writeString(ModuleDescriptor.MODULE_ID);
        parcelH0.writeInt(i);
        X2.g.b(parcelH0, bVar2);
        return AbstractC2763b.c(g0(parcelH0, 3));
    }
}
