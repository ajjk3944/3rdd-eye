package y4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8610a {

    /* renamed from: b, reason: collision with root package name */
    public static final C8610a f66361b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f66362a;

    /* renamed from: y4.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private HashMap f66363a = new HashMap();

        public C8610a a() {
            if (this.f66363a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C8610a c8610a = new C8610a(Collections.unmodifiableMap(this.f66363a));
            this.f66363a = null;
            return c8610a;
        }
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.f66362a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8610a) {
            return this.f66362a.equals(((C8610a) obj).f66362a);
        }
        return false;
    }

    public int hashCode() {
        return this.f66362a.hashCode();
    }

    public String toString() {
        return this.f66362a.toString();
    }

    private C8610a(Map map) {
        this.f66362a = map;
    }
}
