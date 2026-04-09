package h5;

import android.text.TextUtils;
import j5.C5194a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f38265b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f38266c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f38267d;

    /* renamed from: a, reason: collision with root package name */
    public final B7.d f38268a;

    public j(B7.d dVar) {
        this.f38268a = dVar;
    }

    public final boolean a(C5194a c5194a) {
        if (TextUtils.isEmpty(c5194a.f42958d)) {
            return true;
        }
        long j4 = c5194a.f42960f + c5194a.f42961g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f38268a.getClass();
        return j4 < timeUnit.toSeconds(System.currentTimeMillis()) + f38265b;
    }
}
