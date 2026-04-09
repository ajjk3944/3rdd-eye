package y2;

import java.util.Locale;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f37318a;

    public b(Locale locale) {
        this.f37318a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k.a(this.f37318a.toLanguageTag(), ((b) obj).f37318a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f37318a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f37318a.toLanguageTag();
    }
}
