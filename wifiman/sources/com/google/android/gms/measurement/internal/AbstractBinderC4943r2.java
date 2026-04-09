package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC4307b0;
import com.google.android.gms.internal.measurement.AbstractC4298a0;
import com.google.ar.core.ImageFormat;
import java.util.List;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4943r2 extends AbstractBinderC4307b0 implements InterfaceC4951s2 {
    public AbstractBinderC4943r2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC4307b0
    protected final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC4999y2 a22 = null;
        InterfaceC4959t2 c4975v2 = null;
        switch (i10) {
            case 1:
                L l10 = (L) AbstractC4298a0.a(parcel, L.CREATOR);
                t7 t7Var = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                X(l10, t7Var);
                parcel2.writeNoException();
                return true;
            case 2:
                r7 r7Var = (r7) AbstractC4298a0.a(parcel, r7.CREATOR);
                t7 t7Var2 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                o(r7Var, t7Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                t7 t7Var3 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                u(t7Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                L l11 = (L) AbstractC4298a0.a(parcel, L.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC4298a0.f(parcel);
                j0(l11, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                t7 t7Var4 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                a0(t7Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                t7 t7Var5 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                boolean zH = AbstractC4298a0.h(parcel);
                AbstractC4298a0.f(parcel);
                List listW = W(t7Var5, zH);
                parcel2.writeNoException();
                parcel2.writeTypedList(listW);
                return true;
            case 9:
                L l12 = (L) AbstractC4298a0.a(parcel, L.CREATOR);
                String string3 = parcel.readString();
                AbstractC4298a0.f(parcel);
                byte[] bArrX = x(l12, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrX);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                AbstractC4298a0.f(parcel);
                G(j10, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                t7 t7Var6 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                String strE = e(t7Var6);
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 12:
                C4877j c4877j = (C4877j) AbstractC4298a0.a(parcel, C4877j.CREATOR);
                t7 t7Var7 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                i(c4877j, t7Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C4877j c4877j2 = (C4877j) AbstractC4298a0.a(parcel, C4877j.CREATOR);
                AbstractC4298a0.f(parcel);
                g(c4877j2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zH2 = AbstractC4298a0.h(parcel);
                t7 t7Var8 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                List listM0 = m0(string7, string8, zH2, t7Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM0);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zH3 = AbstractC4298a0.h(parcel);
                AbstractC4298a0.f(parcel);
                List listP = p(string9, string10, string11, zH3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                t7 t7Var9 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                List listC0 = c0(string12, string13, t7Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC0);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                AbstractC4298a0.f(parcel);
                List listI = I(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case 18:
                t7 t7Var10 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                d0(t7Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC4298a0.a(parcel, Bundle.CREATOR);
                t7 t7Var11 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                J(bundle, t7Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                t7 t7Var12 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                k0(t7Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                t7 t7Var13 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                C4917o c4917oH = H(t7Var13);
                parcel2.writeNoException();
                AbstractC4298a0.g(parcel2, c4917oH);
                return true;
            case 24:
                t7 t7Var14 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC4298a0.a(parcel, Bundle.CREATOR);
                AbstractC4298a0.f(parcel);
                List listH = h(t7Var14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH);
                return true;
            case 25:
                t7 t7Var15 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                D(t7Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                t7 t7Var16 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                Q(t7Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                t7 t7Var17 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                AbstractC4298a0.f(parcel);
                t(t7Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                t7 t7Var18 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                Q6 q62 = (Q6) AbstractC4298a0.a(parcel, Q6.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    a22 = iInterfaceQueryLocalInterface instanceof InterfaceC4999y2 ? (InterfaceC4999y2) iInterfaceQueryLocalInterface : new A2(strongBinder);
                }
                AbstractC4298a0.f(parcel);
                O(t7Var18, q62, a22);
                parcel2.writeNoException();
                return true;
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                t7 t7Var19 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                C4861h c4861h = (C4861h) AbstractC4298a0.a(parcel, C4861h.CREATOR);
                AbstractC4298a0.f(parcel);
                N(t7Var19, c4861h);
                parcel2.writeNoException();
                return true;
            case 31:
                t7 t7Var20 = (t7) AbstractC4298a0.a(parcel, t7.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC4298a0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c4975v2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC4959t2 ? (InterfaceC4959t2) iInterfaceQueryLocalInterface2 : new C4975v2(strongBinder2);
                }
                AbstractC4298a0.f(parcel);
                g0(t7Var20, bundle3, c4975v2);
                parcel2.writeNoException();
                return true;
        }
    }
}
