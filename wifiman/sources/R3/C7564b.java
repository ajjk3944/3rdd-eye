package r3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.ar.core.ImageFormat;
import s3.AbstractC7900o;
import t3.AbstractC8026a;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7564b extends AbstractC8026a {

    /* renamed from: a, reason: collision with root package name */
    final int f60071a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60072b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f60073c;

    /* renamed from: d, reason: collision with root package name */
    private final String f60074d;

    /* renamed from: e, reason: collision with root package name */
    public static final C7564b f60070e = new C7564b(0);
    public static final Parcelable.Creator<C7564b> CREATOR = new m();

    C7564b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f60071a = i10;
        this.f60072b = i11;
        this.f60073c = pendingIntent;
        this.f60074d = str;
    }

    static String j(int i10) {
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
                    case ImageFormat.RGBA_FP16 /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int b() {
        return this.f60072b;
    }

    public String e() {
        return this.f60074d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7564b)) {
            return false;
        }
        C7564b c7564b = (C7564b) obj;
        return this.f60072b == c7564b.f60072b && AbstractC7900o.a(this.f60073c, c7564b.f60073c) && AbstractC7900o.a(this.f60074d, c7564b.f60074d);
    }

    public PendingIntent f() {
        return this.f60073c;
    }

    public boolean g() {
        return (this.f60072b == 0 || this.f60073c == null) ? false : true;
    }

    public int hashCode() {
        return AbstractC7900o.b(Integer.valueOf(this.f60072b), this.f60073c, this.f60074d);
    }

    public boolean i() {
        return this.f60072b == 0;
    }

    public String toString() {
        AbstractC7900o.a aVarC = AbstractC7900o.c(this);
        aVarC.a("statusCode", j(this.f60072b));
        aVarC.a("resolution", this.f60073c);
        aVarC.a("message", this.f60074d);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f60071a;
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i11);
        t3.b.k(parcel, 2, b());
        t3.b.p(parcel, 3, f(), i10, false);
        t3.b.q(parcel, 4, e(), false);
        t3.b.b(parcel, iA);
    }

    public C7564b(int i10) {
        this(i10, null, null);
    }

    public C7564b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C7564b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
