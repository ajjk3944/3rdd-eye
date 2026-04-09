package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f720a;

    public /* synthetic */ t0() {
        this(mq.w.f16945a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && br.l.a(this.f720a, ((t0) obj).f720a);
    }

    public final int hashCode() {
        return this.f720a.hashCode();
    }

    public final String toString() {
        return h0.b.t(new StringBuilder("TaskConfig(crossTaskDelays="), this.f720a, ')');
    }

    public t0(List list) {
        this.f720a = list;
    }
}
