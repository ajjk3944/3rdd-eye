package N4;

import N4.F;
import java.util.List;

/* loaded from: classes3.dex */
final class y extends F.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final List f15306a;

    static final class b extends F.e.d.f.a {

        /* renamed from: a, reason: collision with root package name */
        private List f15307a;

        b() {
        }

        @Override // N4.F.e.d.f.a
        public F.e.d.f a() {
            List list = this.f15307a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // N4.F.e.d.f.a
        public F.e.d.f.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f15307a = list;
            return this;
        }
    }

    @Override // N4.F.e.d.f
    public List b() {
        return this.f15306a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.f15306a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f15306a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f15306a + "}";
    }

    private y(List list) {
        this.f15306a = list;
    }
}
