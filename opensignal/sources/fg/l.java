package fg;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final long f8861b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8862c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static l f8863d;

    /* renamed from: a, reason: collision with root package name */
    public final sm.f f8864a;

    public l(sm.f fVar) {
        this.f8864a = fVar;
    }

    public final boolean a(gg.b bVar) {
        if (TextUtils.isEmpty(bVar.f9572c)) {
            return true;
        }
        long j = bVar.f9575f + bVar.f9574e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f8864a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f8861b;
    }
}
