package n1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final D1.f f22254a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f22255b;

    public n(D1.f fVar, Executor executor) {
        this.f22254a = fVar;
        this.f22255b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f22254a.equals(((n) obj).f22254a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22254a.hashCode();
    }
}
