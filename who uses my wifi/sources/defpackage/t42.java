package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t42 extends hv1 {
    public final /* synthetic */ pd2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t42(u42 u42Var, pd2 pd2Var) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f = pd2Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) iv1.b(parcel, ParcelFileDescriptor.CREATOR);
        iv1.f(parcel);
        this.f.a(parcelFileDescriptor);
        return true;
    }
}
