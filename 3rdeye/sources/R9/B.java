package R9;

import O9.l;
import Q9.C0;
import Q9.I;
import c9.C2099t;
import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes3.dex */
public final class B implements M9.b<z> {

    /* renamed from: a, reason: collision with root package name */
    public static final B f11773a = new B();

    /* renamed from: b, reason: collision with root package name */
    public static final a f11774b = a.f11775b;

    /* compiled from: JsonElementSerializers.kt */
    public static final class a implements O9.e {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11775b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f11776c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f11777a;

        public a() {
            C0 c02 = C0.f11399a;
            this.f11777a = N9.a.a(p.f11812a).f11460c;
        }

        @Override // O9.e
        public final String a() {
            return f11776c;
        }

        @Override // O9.e
        public final boolean c() {
            this.f11777a.getClass();
            return false;
        }

        @Override // O9.e
        public final int d(String name) {
            kotlin.jvm.internal.l.f(name, "name");
            return this.f11777a.d(name);
        }

        @Override // O9.e
        public final O9.k e() {
            this.f11777a.getClass();
            return l.c.f10525a;
        }

        @Override // O9.e
        public final int f() {
            this.f11777a.getClass();
            return 2;
        }

        @Override // O9.e
        public final String g(int i) {
            this.f11777a.getClass();
            return String.valueOf(i);
        }

        @Override // O9.e
        public final List<Annotation> getAnnotations() {
            this.f11777a.getClass();
            return C2099t.f18581b;
        }

        @Override // O9.e
        public final List<Annotation> h(int i) {
            this.f11777a.h(i);
            return C2099t.f18581b;
        }

        @Override // O9.e
        public final O9.e i(int i) {
            return this.f11777a.i(i);
        }

        @Override // O9.e
        public final boolean isInline() {
            this.f11777a.getClass();
            return false;
        }

        @Override // O9.e
        public final boolean j(int i) {
            this.f11777a.j(i);
            return false;
        }
    }

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        B7.d.c(dVar);
        C0 c02 = C0.f11399a;
        return new z(N9.a.a(p.f11812a).deserialize(dVar));
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11774b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        z value = (z) obj;
        kotlin.jvm.internal.l.f(value, "value");
        B7.d.d(eVar);
        C0 c02 = C0.f11399a;
        N9.a.a(p.f11812a).serialize(eVar, value);
    }
}
