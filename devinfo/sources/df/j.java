package df;

import android.text.TextUtils;
import ec.z;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f22247b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f22248c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f22249d;

    /* renamed from: a, reason: collision with root package name */
    public final z f22250a;

    public j(z zVar) {
        this.f22250a = zVar;
    }

    public final boolean a(ef.b bVar) {
        if (TextUtils.isEmpty(bVar.f23443c)) {
            return true;
        }
        long j = bVar.f23446f + bVar.f23445e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f22250a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f22247b;
    }
}
