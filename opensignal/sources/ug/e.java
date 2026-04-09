package ug;

import br.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f23560a;

    public e(String str) {
        l.e(str, "sessionId");
        this.f23560a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && l.a(this.f23560a, ((e) obj).f23560a);
    }

    public final int hashCode() {
        return this.f23560a.hashCode();
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("SessionDetails(sessionId="), this.f23560a, ')');
    }
}
