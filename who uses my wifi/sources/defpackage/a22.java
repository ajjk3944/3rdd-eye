package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a22 extends sb1 implements b22 {
    public a22(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 2);
    }

    @Override // defpackage.b22
    public final int b() {
        Parcel parcelY = Y(U(), 4);
        int i = parcelY.readInt();
        parcelY.recycle();
        return i;
    }

    @Override // defpackage.b22
    public final int c() {
        Parcel parcelY = Y(U(), 5);
        int i = parcelY.readInt();
        parcelY.recycle();
        return i;
    }

    @Override // defpackage.b22
    public final u10 d() {
        return ga1.j(Y(U(), 1));
    }

    @Override // defpackage.b22
    public final Map e() {
        Parcel parcelY = Y(U(), 6);
        HashMap hashMap = parcelY.readHashMap(iv1.a);
        parcelY.recycle();
        return hashMap;
    }

    @Override // defpackage.b22
    public final Uri h() {
        Parcel parcelY = Y(U(), 2);
        Uri uri = (Uri) iv1.b(parcelY, Uri.CREATOR);
        parcelY.recycle();
        return uri;
    }

    @Override // defpackage.b22
    public final double l() {
        Parcel parcelY = Y(U(), 3);
        double d = parcelY.readDouble();
        parcelY.recycle();
        return d;
    }
}
