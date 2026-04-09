package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import bm.e;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import g4.j;
import java.util.Arrays;
import wc.h;

/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4806a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4807d;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f4808g;

    /* renamed from: r, reason: collision with root package name */
    public final String f4809r;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f4810x;

    /* renamed from: y, reason: collision with root package name */
    public static final ConnectionResult f4805y = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new h(13);

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f4806a = i10;
        this.f4807d = i11;
        this.f4808g = pendingIntent;
        this.f4809r = str;
        this.f4810x = num;
    }

    public static String d(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case j.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f4807d == connectionResult.f4807d && s.k(this.f4808g, connectionResult.f4808g) && s.k(this.f4809r, connectionResult.f4809r) && s.k(this.f4810x, connectionResult.f4810x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4807d), this.f4808g, this.f4809r, this.f4810x});
    }

    public final String toString() {
        e eVar = new e(9, this);
        eVar.d(d(this.f4807d), "statusCode");
        eVar.d(this.f4808g, "resolution");
        eVar.d(this.f4809r, "message");
        eVar.d(this.f4810x, "clientMethodKey");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4806a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f4807d);
        i4.O(parcel, 3, this.f4808g, i10);
        i4.P(parcel, 4, this.f4809r);
        Integer num = this.f4810x;
        if (num != null) {
            i4.S(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        i4.W(parcel, iU);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
