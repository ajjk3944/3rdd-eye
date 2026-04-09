package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.ar.core.ImageFormat;
import java.util.ArrayList;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

/* loaded from: classes.dex */
public final class O6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolM = null;
        ArrayList arrayListG = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        long jT4 = 0;
        long jT5 = 0;
        long jT6 = 0;
        long jT7 = 0;
        boolean zL = true;
        boolean zL2 = true;
        boolean zL3 = false;
        int iS = 0;
        boolean zL4 = false;
        boolean zL5 = false;
        int iS2 = 0;
        int iS3 = 0;
        long jT8 = -2147483648L;
        String strF11 = "";
        String strF12 = strF11;
        String strF13 = strF12;
        String strF14 = strF13;
        int iS4 = 100;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 2:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 4:
                    strF3 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 6:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 7:
                    jT2 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 8:
                    strF5 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 9:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                case 10:
                    zL3 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 11:
                    jT8 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 12:
                    strF6 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 13:
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
                case 14:
                    jT3 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 15:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 16:
                    zL2 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 18:
                    zL4 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 19:
                    strF7 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 21:
                    boolM = SafeParcelReader.m(parcel, iQ);
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    jT4 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 23:
                    arrayListG = SafeParcelReader.g(parcel, iQ);
                    break;
                case 24:
                    strF8 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 25:
                    strF11 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 26:
                    strF12 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 27:
                    strF9 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 28:
                    zL5 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 29:
                    jT5 = SafeParcelReader.t(parcel, iQ);
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    iS4 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 31:
                    strF13 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 32:
                    iS2 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 34:
                    jT6 = SafeParcelReader.t(parcel, iQ);
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    strF10 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 36:
                    strF14 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 37:
                    jT7 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 38:
                    iS3 = SafeParcelReader.s(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new t7(strF, strF2, strF3, strF4, jT, jT2, strF5, zL, zL3, jT8, strF6, jT3, iS, zL2, zL4, strF7, boolM, jT4, arrayListG, strF8, strF11, strF12, strF9, zL5, jT5, iS4, strF13, iS2, jT6, strF10, strF14, jT7, iS3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t7[i10];
    }
}
