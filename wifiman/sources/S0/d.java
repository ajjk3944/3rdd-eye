package S0;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20214b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Locale f20215a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Locale locale) {
        this.f20215a = locale;
    }

    public final Locale a() {
        return this.f20215a;
    }

    public final String b() {
        return h.a(this.f20215a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC6492s.d(b(), ((d) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    public d(String str) {
        this(g.a().c(str));
    }
}
