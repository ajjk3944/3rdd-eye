package N4;

import N4.F;
import java.util.List;

/* renamed from: N4.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3364f extends F.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f15122a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15123b;

    /* renamed from: N4.f$b */
    static final class b extends F.d.a {

        /* renamed from: a, reason: collision with root package name */
        private List f15124a;

        /* renamed from: b, reason: collision with root package name */
        private String f15125b;

        b() {
        }

        @Override // N4.F.d.a
        public F.d a() {
            List list = this.f15124a;
            if (list != null) {
                return new C3364f(list, this.f15125b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // N4.F.d.a
        public F.d.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f15124a = list;
            return this;
        }

        @Override // N4.F.d.a
        public F.d.a c(String str) {
            this.f15125b = str;
            return this;
        }
    }

    @Override // N4.F.d
    public List b() {
        return this.f15122a;
    }

    @Override // N4.F.d
    public String c() {
        return this.f15123b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d)) {
            return false;
        }
        F.d dVar = (F.d) obj;
        if (this.f15122a.equals(dVar.b())) {
            String str = this.f15123b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f15122a.hashCode() ^ 1000003) * 1000003;
        String str = this.f15123b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f15122a + ", orgId=" + this.f15123b + "}";
    }

    private C3364f(List list, String str) {
        this.f15122a = list;
        this.f15123b = str;
    }
}
