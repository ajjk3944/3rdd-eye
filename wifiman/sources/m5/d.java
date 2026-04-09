package m5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f53144b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f53145a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f53144b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f53144b;
                    if (dVar == null) {
                        dVar = new d();
                        f53144b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f53145a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f53145a);
        }
        return setUnmodifiableSet;
    }
}
