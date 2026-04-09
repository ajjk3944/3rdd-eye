package bf;

import Li.N;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import ze.AbstractC8735d;

/* renamed from: bf.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4107k extends AbstractC8735d {

    /* renamed from: bf.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f33200a;

        public a(List items) {
            AbstractC6492s.i(items, "items");
            this.f33200a = items;
        }

        public final List a() {
            return this.f33200a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f33200a, ((a) obj).f33200a);
        }

        public int hashCode() {
            return this.f33200a.hashCode();
        }

        public String toString() {
            return "Hosts(items=" + this.f33200a + ")";
        }
    }

    public abstract N C();

    public abstract N n0();

    public abstract void o0();

    public abstract void p0(String str);

    public abstract void q0();

    public abstract void r0();

    public abstract void s0(String str, int i10);
}
