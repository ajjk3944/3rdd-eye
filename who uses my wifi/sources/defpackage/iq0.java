package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iq0 implements Serializable {
    public final Throwable f;

    public iq0(Throwable th) {
        i30.m(th, "exception");
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iq0) {
            return i30.c(this.f, ((iq0) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f + ')';
    }
}
