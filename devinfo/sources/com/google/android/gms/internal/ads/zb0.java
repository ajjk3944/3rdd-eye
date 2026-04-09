package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zb0 extends mg implements hn {

    /* renamed from: a, reason: collision with root package name */
    public final String f19053a;

    /* renamed from: b, reason: collision with root package name */
    public final ca0 f19054b;

    /* renamed from: c, reason: collision with root package name */
    public final ga0 f19055c;

    public zb0(String str, ca0 ca0Var, ga0 ga0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f19053a = str;
        this.f19054b = ca0Var;
        this.f19055c = ga0Var;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        xm xmVar;
        switch (i4) {
            case 2:
                vb.b bVar = new vb.b(this.f19054b);
                parcel2.writeNoException();
                ng.e(parcel2, bVar);
                return true;
            case 3:
                String strB = this.f19055c.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 4:
                List listC = this.f19055c.c();
                parcel2.writeNoException();
                parcel2.writeList(listC);
                return true;
            case 5:
                String strG = this.f19055c.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 6:
                ga0 ga0Var = this.f19055c;
                synchronized (ga0Var) {
                    xmVar = ga0Var.f11430t;
                }
                parcel2.writeNoException();
                ng.e(parcel2, xmVar);
                return true;
            case 7:
                String strI = this.f19055c.i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 8:
                String strP = this.f19055c.p();
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 9:
                Bundle bundleH = this.f19055c.h();
                parcel2.writeNoException();
                ng.d(parcel2, bundleH);
                return true;
            case 10:
                this.f19054b.s();
                parcel2.writeNoException();
                return true;
            case 11:
                va.a2 a2VarX = this.f19055c.X();
                parcel2.writeNoException();
                ng.e(parcel2, a2VarX);
                return true;
            case 12:
                Bundle bundle = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                this.f19054b.r(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                boolean zT = this.f19054b.t(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                this.f19054b.u(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                tm tmVarY = this.f19055c.Y();
                parcel2.writeNoException();
                ng.e(parcel2, tmVarY);
                return true;
            case 16:
                vb.a aVarK = this.f19055c.k();
                parcel2.writeNoException();
                ng.e(parcel2, aVarK);
                return true;
            case 17:
                String str = this.f19053a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
