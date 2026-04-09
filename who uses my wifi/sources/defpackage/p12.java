package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p12 extends hv1 implements b22 {
    public final Drawable f;
    public final Uri g;
    public final double h;
    public final int i;
    public final int j;
    public final Map k;

    public p12(Drawable drawable, Uri uri, double d, int i, int i2, HashMap map) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f = drawable;
        this.g = uri;
        this.h = d;
        this.i = i;
        this.j = i2;
        this.k = map;
    }

    public static b22 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof b22 ? (b22) iInterfaceQueryLocalInterface : new a22(iBinder);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                u10 u10VarD = d();
                parcel2.writeNoException();
                iv1.e(parcel2, u10VarD);
                return true;
            case 2:
                parcel2.writeNoException();
                iv1.d(parcel2, this.g);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.h);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.i);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.j);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.k);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.b22
    public final int b() {
        return this.i;
    }

    @Override // defpackage.b22
    public final int c() {
        return this.j;
    }

    @Override // defpackage.b22
    public final u10 d() {
        return new oi0(this.f);
    }

    @Override // defpackage.b22
    public final Map e() {
        return this.k;
    }

    @Override // defpackage.b22
    public final Uri h() {
        return this.g;
    }

    @Override // defpackage.b22
    public final double l() {
        return this.h;
    }
}
