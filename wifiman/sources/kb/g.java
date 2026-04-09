package kb;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Map f51358a;

    public g(Map headers) {
        AbstractC6492s.i(headers, "headers");
        this.f51358a = headers;
    }

    public final Map a() {
        return this.f51358a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && AbstractC6492s.d(this.f51358a, ((g) obj).f51358a);
    }

    public int hashCode() {
        return this.f51358a.hashCode();
    }

    public String toString() {
        return "Headers(headers=" + this.f51358a + ")";
    }
}
