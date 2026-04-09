package y0;

import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f25612a;

    public a(dr.a aVar, Integer num) {
        this.f25612a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return l.a(null, null) && l.a(this.f25612a, ((a) obj).f25612a);
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposeStackTraceFrame(sourceInfo=");
        sb2.append((Object) null);
        sb2.append(", groupOffset=");
        return w.g.i(sb2, this.f25612a, ')');
    }
}
