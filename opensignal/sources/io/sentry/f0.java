package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12249a;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f12250b;

    public f0(String str) {
        Pattern patternCompile;
        this.f12249a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            c4.c().k().getLogger().m(b5.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f12250b = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f12249a, ((f0) obj).f12249a);
    }

    public final int hashCode() {
        return Objects.hash(this.f12249a);
    }
}
