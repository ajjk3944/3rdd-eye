package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d.h;
import j4.g;
import java.util.Arrays;
import km.n;
import nb.b;
import pb.y;
import qb.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new g(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f9060a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9061b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f9062c;

    /* renamed from: d, reason: collision with root package name */
    public final b f9063d;

    public Status(int i4, String str, PendingIntent pendingIntent, b bVar) {
        this.f9060a = i4;
        this.f9061b = str;
        this.f9062c = pendingIntent;
        this.f9063d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f9060a == status.f9060a && y.l(this.f9061b, status.f9061b) && y.l(this.f9062c, status.f9062c) && y.l(this.f9063d, status.f9063d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9060a), this.f9061b, this.f9062c, this.f9063d});
    }

    public final String toString() {
        n nVar = new n(this);
        String strQ = this.f9061b;
        if (strQ == null) {
            int i4 = this.f9060a;
            switch (i4) {
                case -1:
                    strQ = "SUCCESS_CACHE";
                    break;
                case 0:
                    strQ = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strQ = h.q(i4, "unknown status code: ", new StringBuilder(String.valueOf(i4).length() + 21));
                    break;
                case 2:
                    strQ = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strQ = "SERVICE_DISABLED";
                    break;
                case 4:
                    strQ = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strQ = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strQ = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strQ = "NETWORK_ERROR";
                    break;
                case 8:
                    strQ = "INTERNAL_ERROR";
                    break;
                case 10:
                    strQ = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strQ = "ERROR";
                    break;
                case 14:
                    strQ = "INTERRUPTED";
                    break;
                case 15:
                    strQ = "TIMEOUT";
                    break;
                case 16:
                    strQ = "CANCELED";
                    break;
                case 17:
                    strQ = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strQ = "DEAD_CLIENT";
                    break;
                case 19:
                    strQ = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strQ = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strQ = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strQ = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        nVar.f(strQ, "statusCode");
        nVar.f(this.f9062c, "resolution");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.N(parcel, 1, 4);
        parcel.writeInt(this.f9060a);
        f.I(parcel, 2, this.f9061b);
        f.H(parcel, 3, this.f9062c, i4);
        f.H(parcel, 4, this.f9063d, i4);
        f.P(parcel, iO);
    }
}
