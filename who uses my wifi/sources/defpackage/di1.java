package defpackage;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class di1 {
    public final long a;
    public final long b;
    public final int c;

    public di1(int i, long j, long j2) {
        zt0.D(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && di1.class == obj.getClass()) {
            di1 di1Var = (di1) obj;
            if (this.a == di1Var.a && this.b == di1Var.b && this.c == di1Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = v23.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }
}
