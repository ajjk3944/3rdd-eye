package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a30;
import defpackage.ex0;
import defpackage.gw3;
import defpackage.kq0;
import defpackage.l0;
import defpackage.rh;
import defpackage.uk2;
import defpackage.zy1;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class Status extends l0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new kq0(16);
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final rh i;

    public Status(int i, String str, PendingIntent pendingIntent, rh rhVar) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = rhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && a30.c(this.g, status.g) && a30.c(this.h, status.h) && a30.c(this.i, status.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        gw3 gw3Var = new gw3(this);
        String strF = this.g;
        if (strF == null) {
            int i = this.f;
            switch (i) {
                case -1:
                    strF = "SUCCESS_CACHE";
                    break;
                case 0:
                    strF = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strF = ex0.f("unknown status code: ", i);
                    break;
                case 2:
                    strF = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strF = "SERVICE_DISABLED";
                    break;
                case 4:
                    strF = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strF = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strF = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strF = "NETWORK_ERROR";
                    break;
                case 8:
                    strF = "INTERNAL_ERROR";
                    break;
                case 10:
                    strF = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strF = "ERROR";
                    break;
                case 14:
                    strF = "INTERRUPTED";
                    break;
                case 15:
                    strF = "TIMEOUT";
                    break;
                case 16:
                    strF = "CANCELED";
                    break;
                case 17:
                    strF = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strF = "DEAD_CLIENT";
                    break;
                case 19:
                    strF = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strF = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case zy1.zzm /* 21 */:
                    strF = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strF = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        gw3Var.m(strF, "statusCode");
        gw3Var.m(this.h, "resolution");
        return gw3Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.D(parcel, 2, this.g);
        uk2.C(parcel, 3, this.h, i);
        uk2.C(parcel, 4, this.i, i);
        uk2.O(parcel, I);
    }
}
