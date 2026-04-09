package F3;

import android.content.Context;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class d0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f5894f = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    private final Context f5895a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5896b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5897c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5898d;

    /* renamed from: e, reason: collision with root package name */
    private final g0 f5899e;

    public d0(Context context, String str, String str2, String str3, long j10, long j11, g0 g0Var) {
        this.f5895a = context;
        this.f5896b = str;
        this.f5897c = str2;
        Matcher matcher = f5894f.matcher(str);
        this.f5898d = matcher.matches() ? matcher.group(1) : null;
        this.f5899e = g0Var;
    }
}
