package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1007cn extends B7 implements InterfaceC0788Wa {

    /* renamed from: a, reason: collision with root package name */
    public final String f13668a;

    /* renamed from: b, reason: collision with root package name */
    public final C1278hm f13669b;

    /* renamed from: c, reason: collision with root package name */
    public final C1492lm f13670c;

    public BinderC1007cn(String str, C1278hm c1278hm, C1492lm c1492lm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f13668a = str;
        this.f13669b = c1278hm;
        this.f13670c = c1492lm;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        C1278hm c1278hm = this.f13669b;
        C1492lm c1492lm = this.f13670c;
        switch (i) {
            case 2:
                S2.b bVar = new S2.b(c1278hm);
                parcel2.writeNoException();
                C7.e(parcel2, bVar);
                return true;
            case 3:
                String strB = c1492lm.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 4:
                List listC = c1492lm.c();
                parcel2.writeNoException();
                parcel2.writeList(listC);
                return true;
            case 5:
                String strG = c1492lm.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 6:
                InterfaceC0635Na interfaceC0635NaO = c1492lm.o();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0635NaO);
                return true;
            case 7:
                String strI = c1492lm.i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 8:
                double dN = c1492lm.n();
                parcel2.writeNoException();
                parcel2.writeDouble(dN);
                return true;
            case 9:
                String strL = c1492lm.l();
                parcel2.writeNoException();
                parcel2.writeString(strL);
                return true;
            case 10:
                String strM = c1492lm.m();
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 11:
                Bundle bundleH = c1492lm.h();
                parcel2.writeNoException();
                C7.d(parcel2, bundleH);
                return true;
            case 12:
                c1278hm.t();
                parcel2.writeNoException();
                return true;
            case 13:
                q2.B0 b0X = c1492lm.X();
                parcel2.writeNoException();
                C7.e(parcel2, b0X);
                return true;
            case 14:
                Bundle bundle = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                c1278hm.s(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                boolean zU = c1278hm.u(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                c1278hm.v(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC0550Ia interfaceC0550IaY = c1492lm.Y();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0550IaY);
                return true;
            case 18:
                S2.a aVarK = c1492lm.k();
                parcel2.writeNoException();
                C7.e(parcel2, aVarK);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f13668a);
                return true;
            default:
                return false;
        }
    }
}
