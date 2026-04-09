package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dl3 implements Serializable, cl3 {
    public final List f;

    @Override // defpackage.cl3
    public final boolean c(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f;
            if (i >= list.size()) {
                return true;
            }
            if (!((cl3) list.get(i)).c(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dl3) {
            return this.f.equals(((dl3) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
