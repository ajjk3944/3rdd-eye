package te;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f22704g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f22705h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f22706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22707b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22708c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f22709d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22710e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22711f;

    public b(String str, String str2, String str3, Date date, long j, long j7) {
        this.f22706a = str;
        this.f22707b = str2;
        this.f22708c = str3;
        this.f22709d = date;
        this.f22710e = j;
        this.f22711f = j7;
    }

    public final we.a a() {
        we.a aVar = new we.a();
        aVar.f24471a = "frc";
        aVar.f24481m = this.f22709d.getTime();
        aVar.f24472b = this.f22706a;
        aVar.f24473c = this.f22707b;
        String str = this.f22708c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.f24474d = str;
        aVar.f24475e = this.f22710e;
        aVar.j = this.f22711f;
        return aVar;
    }
}
