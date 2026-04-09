package z7;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final p8.g f38059a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f38060b;

    public m(p8.g gVar, Executor executor) {
        this.f38059a = gVar;
        this.f38060b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f38059a.equals(((m) obj).f38059a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38059a.hashCode();
    }
}
