package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xb0 extends mg implements gn {

    /* renamed from: a, reason: collision with root package name */
    public final String f18343a;

    /* renamed from: b, reason: collision with root package name */
    public final ca0 f18344b;

    /* renamed from: c, reason: collision with root package name */
    public final ga0 f18345c;

    public xb0(String str, ca0 ca0Var, ga0 ga0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f18343a = str;
        this.f18344b = ca0Var;
        this.f18345c = ga0Var;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        ca0 ca0Var = this.f18344b;
        ga0 ga0Var = this.f18345c;
        switch (i4) {
            case 2:
                vb.b bVar = new vb.b(ca0Var);
                parcel2.writeNoException();
                ng.e(parcel2, bVar);
                return true;
            case 3:
                String strB = ga0Var.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 4:
                List listC = ga0Var.c();
                parcel2.writeNoException();
                parcel2.writeList(listC);
                return true;
            case 5:
                String strG = ga0Var.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 6:
                xm xmVarO = ga0Var.o();
                parcel2.writeNoException();
                ng.e(parcel2, xmVarO);
                return true;
            case 7:
                String strI = ga0Var.i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 8:
                double dN = ga0Var.n();
                parcel2.writeNoException();
                parcel2.writeDouble(dN);
                return true;
            case 9:
                String strL = ga0Var.l();
                parcel2.writeNoException();
                parcel2.writeString(strL);
                return true;
            case 10:
                String strM = ga0Var.m();
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 11:
                Bundle bundleH = ga0Var.h();
                parcel2.writeNoException();
                ng.d(parcel2, bundleH);
                return true;
            case 12:
                ca0Var.s();
                parcel2.writeNoException();
                return true;
            case 13:
                va.a2 a2VarX = ga0Var.X();
                parcel2.writeNoException();
                ng.e(parcel2, a2VarX);
                return true;
            case 14:
                Bundle bundle = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                ca0Var.r(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                boolean zT = ca0Var.t(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                ca0Var.u(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                tm tmVarY = ga0Var.Y();
                parcel2.writeNoException();
                ng.e(parcel2, tmVarY);
                return true;
            case 18:
                vb.a aVarK = ga0Var.k();
                parcel2.writeNoException();
                ng.e(parcel2, aVarK);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f18343a);
                return true;
            default:
                return false;
        }
    }
}
