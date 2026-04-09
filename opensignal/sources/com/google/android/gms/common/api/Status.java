package com.google.android.gms.common.api;

import ac.l;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import bm.e;
import c7.a;
import cc.s;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import g4.j;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f4819a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4820d;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f4821g;

    /* renamed from: r, reason: collision with root package name */
    public final ConnectionResult f4822r;

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f4819a = i10;
        this.f4820d = str;
        this.f4821g = pendingIntent;
        this.f4822r = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4819a == status.f4819a && s.k(this.f4820d, status.f4820d) && s.k(this.f4821g, status.f4821g) && s.k(this.f4822r, status.f4822r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4819a), this.f4820d, this.f4821g, this.f4822r});
    }

    public final String toString() {
        e eVar = new e(9, this);
        String strL = this.f4820d;
        if (strL == null) {
            int i10 = this.f4819a;
            switch (i10) {
                case -1:
                    strL = "SUCCESS_CACHE";
                    break;
                case 0:
                    strL = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strL = a.l(i10, "unknown status code: ", new StringBuilder(String.valueOf(i10).length() + 21));
                    break;
                case 2:
                    strL = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strL = "SERVICE_DISABLED";
                    break;
                case 4:
                    strL = "SIGN_IN_REQUIRED";
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    strL = "INVALID_ACCOUNT";
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    strL = "RESOLUTION_REQUIRED";
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    strL = "NETWORK_ERROR";
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    strL = "INTERNAL_ERROR";
                    break;
                case 10:
                    strL = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strL = "ERROR";
                    break;
                case 14:
                    strL = "INTERRUPTED";
                    break;
                case 15:
                    strL = "TIMEOUT";
                    break;
                case 16:
                    strL = "CANCELED";
                    break;
                case 17:
                    strL = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strL = "DEAD_CLIENT";
                    break;
                case 19:
                    strL = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strL = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strL = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strL = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        eVar.d(strL, "statusCode");
        eVar.d(this.f4821g, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4819a);
        i4.P(parcel, 2, this.f4820d);
        i4.O(parcel, 3, this.f4821g, i10);
        i4.O(parcel, 4, this.f4822r, i10);
        i4.W(parcel, iU);
    }
}
