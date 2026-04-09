package J2;

import A3.q;
import M2.u;
import a.AbstractC0241a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends N2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2045b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f2046c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2047d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f2048e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f2043f = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new q(4);

    public b(int i, int i3, PendingIntent pendingIntent, String str, Integer num) {
        this.f2044a = i;
        this.f2045b = i3;
        this.f2046c = pendingIntent;
        this.f2047d = str;
        this.f2048e = num;
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
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
                switch (i) {
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
                        return A.f.n(new StringBuilder(String.valueOf(i).length() + 20), "UNKNOWN_ERROR_CODE(", i, ")");
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
        return this.f2045b == bVar.f2045b && u.g(this.f2046c, bVar.f2046c) && u.g(this.f2047d, bVar.f2047d) && u.g(this.f2048e, bVar.f2048e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2045b), this.f2046c, this.f2047d, this.f2048e});
    }

    public final String toString() {
        V2.h hVar = new V2.h(this);
        hVar.g(a(this.f2045b), "statusCode");
        hVar.g(this.f2046c, "resolution");
        hVar.g(this.f2047d, PglCryptUtils.KEY_MESSAGE);
        hVar.g(this.f2048e, "clientMethodKey");
        return hVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f2044a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f2045b);
        AbstractC0241a.t(parcel, 3, this.f2046c, i);
        AbstractC0241a.u(parcel, 4, this.f2047d);
        Integer num = this.f2048e;
        if (num != null) {
            AbstractC0241a.B(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        AbstractC0241a.H(parcel, iE);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
