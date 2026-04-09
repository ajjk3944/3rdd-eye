package io.sentry;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n6 implements c2 {

    /* renamed from: d, reason: collision with root package name */
    public static final n6 f12450d = new n6("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.e f12451a;

    public n6(String str) {
        Objects.requireNonNull(str, "value is required");
        this.f12451a = new io.sentry.util.e(new m6(str, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n6.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f12451a.a()).equals(((n6) obj).f12451a.a());
    }

    public final int hashCode() {
        return ((String) this.f12451a.a()).hashCode();
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) {
        ((i4.b) y2Var).V((String) this.f12451a.a());
    }

    public final String toString() {
        return (String) this.f12451a.a();
    }

    public n6() {
        this.f12451a = new io.sentry.util.e(new d5.v(19));
    }
}
