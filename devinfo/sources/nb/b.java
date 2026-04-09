package nb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Arrays;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends qb.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f29884a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29885b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f29886c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29887d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f29888e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f29883f = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new j4.g(6);

    public b(int i4, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f29884a = i4;
        this.f29885b = i10;
        this.f29886c = pendingIntent;
        this.f29887d = str;
        this.f29888e = num;
    }

    public static String a(int i4) {
        if (i4 == 99) {
            return "UNFINISHED";
        }
        if (i4 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i4) {
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
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i4) {
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
                        return je.u.v(new StringBuilder(String.valueOf(i4).length() + 20), "UNKNOWN_ERROR_CODE(", i4, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29885b == bVar.f29885b && y.l(this.f29886c, bVar.f29886c) && y.l(this.f29887d, bVar.f29887d) && y.l(this.f29888e, bVar.f29888e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29885b), this.f29886c, this.f29887d, this.f29888e});
    }

    public final String toString() {
        km.n nVar = new km.n(this);
        nVar.f(a(this.f29885b), "statusCode");
        nVar.f(this.f29886c, "resolution");
        nVar.f(this.f29887d, PglCryptUtils.KEY_MESSAGE);
        nVar.f(this.f29888e, "clientMethodKey");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f29884a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f29885b);
        com.bumptech.glide.f.H(parcel, 3, this.f29886c, i4);
        com.bumptech.glide.f.I(parcel, 4, this.f29887d);
        Integer num = this.f29888e;
        if (num != null) {
            com.bumptech.glide.f.N(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        com.bumptech.glide.f.P(parcel, iO);
    }

    public b(int i4, PendingIntent pendingIntent, String str) {
        this(1, i4, pendingIntent, str, null);
    }
}
