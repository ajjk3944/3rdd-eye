package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final f f51965b = new f(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f51966a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f51967a;

        /* renamed from: b, reason: collision with root package name */
        private final int f51968b;

        a(Object obj, int i10) {
            this.f51967a = obj;
            this.f51968b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f51967a == aVar.f51967a && this.f51968b == aVar.f51968b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f51967a) * 65535) + this.f51968b;
        }
    }

    f() {
        this.f51966a = new HashMap();
    }

    public static f c() {
        return f51965b;
    }

    public static f d() {
        return new f();
    }

    public final void a(h.f fVar) {
        this.f51966a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public h.f b(n nVar, int i10) {
        return (h.f) this.f51966a.get(new a(nVar, i10));
    }

    private f(boolean z10) {
        this.f51966a = Collections.emptyMap();
    }
}
