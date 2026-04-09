package N4;

import N4.F;
import java.util.List;

/* loaded from: classes3.dex */
final class r extends F.e.d.a.b.AbstractC0574e {

    /* renamed from: a, reason: collision with root package name */
    private final String f15251a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15252b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15253c;

    static final class b extends F.e.d.a.b.AbstractC0574e.AbstractC0575a {

        /* renamed from: a, reason: collision with root package name */
        private String f15254a;

        /* renamed from: b, reason: collision with root package name */
        private int f15255b;

        /* renamed from: c, reason: collision with root package name */
        private List f15256c;

        /* renamed from: d, reason: collision with root package name */
        private byte f15257d;

        b() {
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0575a
        public F.e.d.a.b.AbstractC0574e a() {
            String str;
            List list;
            if (this.f15257d == 1 && (str = this.f15254a) != null && (list = this.f15256c) != null) {
                return new r(str, this.f15255b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15254a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f15257d) == 0) {
                sb2.append(" importance");
            }
            if (this.f15256c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0575a
        public F.e.d.a.b.AbstractC0574e.AbstractC0575a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f15256c = list;
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0575a
        public F.e.d.a.b.AbstractC0574e.AbstractC0575a c(int i10) {
            this.f15255b = i10;
            this.f15257d = (byte) (this.f15257d | 1);
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0575a
        public F.e.d.a.b.AbstractC0574e.AbstractC0575a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f15254a = str;
            return this;
        }
    }

    @Override // N4.F.e.d.a.b.AbstractC0574e
    public List b() {
        return this.f15253c;
    }

    @Override // N4.F.e.d.a.b.AbstractC0574e
    public int c() {
        return this.f15252b;
    }

    @Override // N4.F.e.d.a.b.AbstractC0574e
    public String d() {
        return this.f15251a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0574e)) {
            return false;
        }
        F.e.d.a.b.AbstractC0574e abstractC0574e = (F.e.d.a.b.AbstractC0574e) obj;
        return this.f15251a.equals(abstractC0574e.d()) && this.f15252b == abstractC0574e.c() && this.f15253c.equals(abstractC0574e.b());
    }

    public int hashCode() {
        return ((((this.f15251a.hashCode() ^ 1000003) * 1000003) ^ this.f15252b) * 1000003) ^ this.f15253c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f15251a + ", importance=" + this.f15252b + ", frames=" + this.f15253c + "}";
    }

    private r(String str, int i10, List list) {
        this.f15251a = str;
        this.f15252b = i10;
        this.f15253c = list;
    }
}
