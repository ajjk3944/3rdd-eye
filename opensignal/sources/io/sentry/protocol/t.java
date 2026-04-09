package io.sentry.protocol;

import io.sentry.android.core.u0;
import io.sentry.c2;
import io.sentry.m6;
import io.sentry.y2;

/* loaded from: classes.dex */
public final class t implements c2 {

    /* renamed from: d, reason: collision with root package name */
    public static final t f12636d = new t("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.e f12637a;

    public t() {
        this.f12637a = new io.sentry.util.e(new u0(3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f12637a.a()).equals(((t) obj).f12637a.a());
    }

    public final int hashCode() {
        return ((String) this.f12637a.a()).hashCode();
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, io.sentry.u0 u0Var) {
        ((i4.b) y2Var).V(toString());
    }

    public final String toString() {
        return (String) this.f12637a.a();
    }

    public t(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
        }
        if (str2.length() == 36) {
            this.f12637a = new io.sentry.util.e(new m6(this, str2));
        } else {
            this.f12637a = new io.sentry.util.e(new m6(str2, 0));
        }
    }
}
