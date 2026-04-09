package C4;

import F4.a;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: AbtExperimentInfo.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f912g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f913h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f915b;

    /* renamed from: c, reason: collision with root package name */
    public final String f916c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f917d;

    /* renamed from: e, reason: collision with root package name */
    public final long f918e;

    /* renamed from: f, reason: collision with root package name */
    public final long f919f;

    public b(String str, String str2, String str3, Date date, long j4, long j10) {
        this.f914a = str;
        this.f915b = str2;
        this.f916c = str3;
        this.f917d = date;
        this.f918e = j4;
        this.f919f = j10;
    }

    public final a.C0028a a() {
        a.C0028a c0028a = new a.C0028a();
        c0028a.f1635a = "frc";
        c0028a.f1646m = this.f917d.getTime();
        c0028a.f1636b = this.f914a;
        c0028a.f1637c = this.f915b;
        String str = this.f916c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        c0028a.f1638d = str;
        c0028a.f1639e = this.f918e;
        c0028a.f1643j = this.f919f;
        return c0028a;
    }
}
