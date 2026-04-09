package xd;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f37078h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f37079a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37080b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37081c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f37082d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37083e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37084f;

    public b(String str, String str2, String str3, Date date, long j, long j8) {
        this.f37079a = str;
        this.f37080b = str2;
        this.f37081c = str3;
        this.f37082d = date;
        this.f37083e = j;
        this.f37084f = j8;
    }

    public final ae.a a() {
        ae.a aVar = new ae.a();
        aVar.f340a = "frc";
        aVar.f350m = this.f37082d.getTime();
        aVar.f341b = this.f37079a;
        aVar.f342c = this.f37080b;
        String str = this.f37081c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.f343d = str;
        aVar.f344e = this.f37083e;
        aVar.j = this.f37084f;
        return aVar;
    }
}
