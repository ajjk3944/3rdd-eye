package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class om extends mg implements xm {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f14735a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f14736b;

    /* renamed from: c, reason: collision with root package name */
    public final double f14737c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14738d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14739e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f14740f;

    public om(Drawable drawable, Uri uri, double d10, int i4, int i10, HashMap map) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f14735a = drawable;
        this.f14736b = uri;
        this.f14737c = d10;
        this.f14738d = i4;
        this.f14739e = i10;
        this.f14740f = map;
    }

    public static xm h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof xm ? (xm) iInterfaceQueryLocalInterface : new wm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final vb.a a() {
        return new vb.b(this.f14735a);
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final int c() {
        return this.f14738d;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final int d() {
        return this.f14739e;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final Map e() {
        return this.f14740f;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final double f() {
        return this.f14737c;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                vb.a aVarA = a();
                parcel2.writeNoException();
                ng.e(parcel2, aVarA);
                return true;
            case 2:
                parcel2.writeNoException();
                ng.d(parcel2, this.f14736b);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.f14737c);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.f14738d);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.f14739e);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.f14740f);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final Uri zzc() {
        return this.f14736b;
    }
}
