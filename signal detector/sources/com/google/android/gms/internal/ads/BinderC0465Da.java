package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0465Da extends B7 implements InterfaceC0635Na {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f7781a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7782b;

    /* renamed from: c, reason: collision with root package name */
    public final double f7783c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7784d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7785e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f7786f;

    public BinderC0465Da(Drawable drawable, Uri uri, double d6, int i, int i3, HashMap map) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f7781a = drawable;
        this.f7782b = uri;
        this.f7783c = d6;
        this.f7784d = i;
        this.f7785e = i3;
        this.f7786f = map;
    }

    public static InterfaceC0635Na K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0635Na ? (InterfaceC0635Na) iInterfaceQueryLocalInterface : new C0618Ma(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                S2.a aVarC = c();
                parcel2.writeNoException();
                C7.e(parcel2, aVarC);
                return true;
            case 2:
                parcel2.writeNoException();
                C7.d(parcel2, this.f7782b);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.f7783c);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.f7784d);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.f7785e);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.f7786f);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final int b() {
        return this.f7784d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final S2.a c() {
        return new S2.b(this.f7781a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final int d() {
        return this.f7785e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final Map e() {
        return this.f7786f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final Uri f() {
        return this.f7782b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final double m() {
        return this.f7783c;
    }
}
