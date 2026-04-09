package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class et extends mg implements ft {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10855a = 0;

    public et() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                Bundle bundle = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                P3(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                C1();
                parcel2.writeNoException();
                return true;
            case 3:
                A1();
                parcel2.writeNoException();
                return true;
            case 4:
                D1();
                parcel2.writeNoException();
                return true;
            case 5:
                B1();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) ng.b(parcel, Bundle.CREATOR);
                ng.f(parcel);
                D(bundle2);
                parcel2.writeNoException();
                ng.d(parcel2, bundle2);
                return true;
            case 7:
                R();
                parcel2.writeNoException();
                return true;
            case 8:
                l();
                parcel2.writeNoException();
                return true;
            case 9:
                J1();
                parcel2.writeNoException();
                return true;
            case 10:
                c();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zE = e();
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 12:
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                Intent intent = (Intent) ng.b(parcel, Intent.CREATOR);
                ng.f(parcel);
                Z0(i10, i11, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                v(aVarR0);
                parcel2.writeNoException();
                return true;
            case 14:
                d();
                parcel2.writeNoException();
                return true;
            case 15:
                int i12 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                ng.f(parcel);
                P0(i12, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
