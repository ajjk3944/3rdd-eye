package Te;

import Ee.C2706g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface E extends C2706g.b {

    public static final class a implements E {

        /* renamed from: a, reason: collision with root package name */
        private final String f21617a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f21618b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f21619c;

        /* renamed from: d, reason: collision with root package name */
        private final String f21620d;

        public a(String id2, s9.d key, s9.d value) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(value, "value");
            this.f21617a = id2;
            this.f21618b = key;
            this.f21619c = value;
            this.f21620d = "keyVal";
        }

        public final s9.d a() {
            return this.f21618b;
        }

        public final s9.d b() {
            return this.f21619c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f21617a, aVar.f21617a) && AbstractC6492s.d(this.f21618b, aVar.f21618b) && AbstractC6492s.d(this.f21619c, aVar.f21619c);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21617a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21620d;
        }

        public int hashCode() {
            return (((this.f21617a.hashCode() * 31) + this.f21618b.hashCode()) * 31) + this.f21619c.hashCode();
        }

        public String toString() {
            return "KeyVal(id=" + this.f21617a + ", key=" + this.f21618b + ", value=" + this.f21619c + ")";
        }
    }
}
