package Z4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f25172a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25173b;

    /* renamed from: Z4.b$b, reason: collision with other inner class name */
    public static final class C0964b {

        /* renamed from: a, reason: collision with root package name */
        private final String f25174a;

        /* renamed from: b, reason: collision with root package name */
        private Map f25175b = null;

        C0964b(String str) {
            this.f25174a = str;
        }

        public b a() {
            return new b(this.f25174a, this.f25175b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f25175b)));
        }

        public C0964b b(Annotation annotation) {
            if (this.f25175b == null) {
                this.f25175b = new HashMap();
            }
            this.f25175b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static C0964b a(String str) {
        return new C0964b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.emptyMap());
    }

    public String b() {
        return this.f25172a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f25173b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25172a.equals(bVar.f25172a) && this.f25173b.equals(bVar.f25173b);
    }

    public int hashCode() {
        return (this.f25172a.hashCode() * 31) + this.f25173b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f25172a + ", properties=" + this.f25173b.values() + "}";
    }

    private b(String str, Map map) {
        this.f25172a = str;
        this.f25173b = map;
    }
}
