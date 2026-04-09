package com.google.android.gms.common.api;

import A.f;
import A3.q;
import J2.b;
import M2.u;
import N2.a;
import V2.h;
import a.AbstractC0241a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new q(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f6904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6905b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f6906c;

    /* renamed from: d, reason: collision with root package name */
    public final b f6907d;

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.f6904a = i;
        this.f6905b = str;
        this.f6906c = pendingIntent;
        this.f6907d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6904a == status.f6904a && u.g(this.f6905b, status.f6905b) && u.g(this.f6906c, status.f6906c) && u.g(this.f6907d, status.f6907d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6904a), this.f6905b, this.f6906c, this.f6907d});
    }

    public final String toString() {
        h hVar = new h(this);
        String strI = this.f6905b;
        if (strI == null) {
            int i = this.f6904a;
            switch (i) {
                case -1:
                    strI = "SUCCESS_CACHE";
                    break;
                case 0:
                    strI = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strI = f.i(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
                    break;
                case 2:
                    strI = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strI = "SERVICE_DISABLED";
                    break;
                case 4:
                    strI = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strI = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strI = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strI = "NETWORK_ERROR";
                    break;
                case 8:
                    strI = "INTERNAL_ERROR";
                    break;
                case 10:
                    strI = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strI = "ERROR";
                    break;
                case 14:
                    strI = "INTERRUPTED";
                    break;
                case 15:
                    strI = "TIMEOUT";
                    break;
                case 16:
                    strI = "CANCELED";
                    break;
                case 17:
                    strI = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strI = "DEAD_CLIENT";
                    break;
                case 19:
                    strI = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strI = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strI = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strI = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        hVar.g(strI, "statusCode");
        hVar.g(this.f6906c, "resolution");
        return hVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f6904a);
        AbstractC0241a.u(parcel, 2, this.f6905b);
        AbstractC0241a.t(parcel, 3, this.f6906c, i);
        AbstractC0241a.t(parcel, 4, this.f6907d, i);
        AbstractC0241a.H(parcel, iE);
    }
}
