package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.en, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1116en extends B7 implements InterfaceC0805Xa {

    /* renamed from: a, reason: collision with root package name */
    public final String f13972a;

    /* renamed from: b, reason: collision with root package name */
    public final C1278hm f13973b;

    /* renamed from: c, reason: collision with root package name */
    public final C1492lm f13974c;

    public BinderC1116en(String str, C1278hm c1278hm, C1492lm c1492lm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f13972a = str;
        this.f13973b = c1278hm;
        this.f13974c = c1492lm;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0635Na interfaceC0635Na;
        switch (i) {
            case 2:
                S2.b bVar = new S2.b(this.f13973b);
                parcel2.writeNoException();
                C7.e(parcel2, bVar);
                return true;
            case 3:
                String strB = this.f13974c.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 4:
                List listC = this.f13974c.c();
                parcel2.writeNoException();
                parcel2.writeList(listC);
                return true;
            case 5:
                String strG = this.f13974c.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 6:
                C1492lm c1492lm = this.f13974c;
                synchronized (c1492lm) {
                    interfaceC0635Na = c1492lm.f15453t;
                }
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0635Na);
                return true;
            case 7:
                String strI = this.f13974c.i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 8:
                String strP = this.f13974c.p();
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 9:
                Bundle bundleH = this.f13974c.h();
                parcel2.writeNoException();
                C7.d(parcel2, bundleH);
                return true;
            case 10:
                this.f13973b.t();
                parcel2.writeNoException();
                return true;
            case 11:
                q2.B0 b0X = this.f13974c.X();
                parcel2.writeNoException();
                C7.e(parcel2, b0X);
                return true;
            case 12:
                Bundle bundle = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                this.f13973b.s(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                boolean zU = this.f13973b.u(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                this.f13973b.v(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC0550Ia interfaceC0550IaY = this.f13974c.Y();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0550IaY);
                return true;
            case 16:
                S2.a aVarK = this.f13974c.k();
                parcel2.writeNoException();
                C7.e(parcel2, aVarK);
                return true;
            case 17:
                String str = this.f13972a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
