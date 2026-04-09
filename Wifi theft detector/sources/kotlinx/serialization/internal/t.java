package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class t implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final l9.l f22913a;

    /* renamed from: b, reason: collision with root package name */
    public final a f22914b;

    public static final class a extends ClassValue {
        public a() {
        }

        @Override // java.lang.ClassValue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m computeValue(Class type) {
            kotlin.jvm.internal.p.e(type, "type");
            return new m((kotlinx.serialization.b) t.this.f22913a.invoke(k9.a.c(type)));
        }
    }

    public t(l9.l compute) {
        kotlin.jvm.internal.p.e(compute, "compute");
        this.f22913a = compute;
        this.f22914b = c();
    }

    @Override // kotlinx.serialization.internal.x1
    public kotlinx.serialization.b a(r9.c key) {
        kotlin.jvm.internal.p.e(key, "key");
        return ((m) this.f22914b.get(k9.a.a(key))).f22884a;
    }

    public final a c() {
        return new a();
    }
}
