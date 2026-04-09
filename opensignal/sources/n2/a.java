package n2;

import br.l;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f17377a;

    public a(Locale locale) {
        this.f17377a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l.a(this.f17377a.toLanguageTag(), ((a) obj).f17377a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f17377a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f17377a.toLanguageTag();
    }
}
