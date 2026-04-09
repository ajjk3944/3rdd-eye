package y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f66358a;

    private f(int i10) {
        this.f66358a = new ArrayList(i10);
    }

    public static f c(int i10) {
        return new f(i10);
    }

    public f a(Object obj) {
        this.f66358a.add(e.c(obj, "Set contributions cannot be null"));
        return this;
    }

    public Set b() {
        return this.f66358a.isEmpty() ? Collections.emptySet() : this.f66358a.size() == 1 ? Collections.singleton(this.f66358a.get(0)) : Collections.unmodifiableSet(new HashSet(this.f66358a));
    }
}
