package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0655Od extends B7 implements InterfaceC0672Pd {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10211a = 0;

    public AbstractBinderC0655Od() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                r3(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                j();
                parcel2.writeNoException();
                return true;
            case 3:
                h();
                parcel2.writeNoException();
                return true;
            case 4:
                k();
                parcel2.writeNoException();
                return true;
            case 5:
                i();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) C7.b(parcel, Bundle.CREATOR);
                C7.f(parcel);
                g1(bundle2);
                parcel2.writeNoException();
                C7.d(parcel2, bundle2);
                return true;
            case 7:
                I();
                parcel2.writeNoException();
                return true;
            case 8:
                y();
                parcel2.writeNoException();
                return true;
            case 9:
                r();
                parcel2.writeNoException();
                return true;
            case 10:
                b();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zE = e();
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 12:
                int i3 = parcel.readInt();
                int i6 = parcel.readInt();
                Intent intent = (Intent) C7.b(parcel, Intent.CREATOR);
                C7.f(parcel);
                l1(i3, i6, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                L(aVarD1);
                parcel2.writeNoException();
                return true;
            case 14:
                d();
                parcel2.writeNoException();
                return true;
            case 15:
                int i7 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                C7.f(parcel);
                b1(i7, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
