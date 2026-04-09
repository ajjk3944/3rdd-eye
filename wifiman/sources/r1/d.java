package R1;

import Zg.U;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f19549a;

        public a(String name) {
            AbstractC6492s.i(name, "name");
            this.f19549a = name;
        }

        public final String a() {
            return this.f19549a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return AbstractC6492s.d(this.f19549a, ((a) obj).f19549a);
            }
            return false;
        }

        public int hashCode() {
            return this.f19549a.hashCode();
        }

        public String toString() {
            return this.f19549a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final R1.a c() {
        return new R1.a(U.x(a()), false);
    }

    public final d d() {
        return new R1.a(U.x(a()), true);
    }
}
