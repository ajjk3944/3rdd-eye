package V0;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f3818a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.f3818a.equals(((e) obj).f3818a);
    }

    public final int hashCode() {
        return this.f3818a.hashCode();
    }
}
