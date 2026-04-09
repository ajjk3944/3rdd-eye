package R9;

import O9.l;
import Q9.C1524d;
import Q9.C1526e;
import c9.C2099t;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonElementSerializers.kt */
/* renamed from: R9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1567d implements M9.b<C1565b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1567d f11786a = new C1567d();

    /* renamed from: b, reason: collision with root package name */
    public static final a f11787b = a.f11788b;

    /* compiled from: JsonElementSerializers.kt */
    /* renamed from: R9.d$a */
    public static final class a implements O9.e {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11788b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f11789c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1524d f11790a;

        public a() {
            O9.e elementDesc = p.f11812a.getDescriptor();
            kotlin.jvm.internal.l.f(elementDesc, "elementDesc");
            this.f11790a = new C1524d(elementDesc);
        }

        @Override // O9.e
        public final String a() {
            return f11789c;
        }

        @Override // O9.e
        public final boolean c() {
            this.f11790a.getClass();
            return false;
        }

        @Override // O9.e
        public final int d(String name) {
            kotlin.jvm.internal.l.f(name, "name");
            return this.f11790a.d(name);
        }

        @Override // O9.e
        public final O9.k e() {
            this.f11790a.getClass();
            return l.b.f10524a;
        }

        @Override // O9.e
        public final int f() {
            this.f11790a.getClass();
            return 1;
        }

        @Override // O9.e
        public final String g(int i) {
            this.f11790a.getClass();
            return String.valueOf(i);
        }

        @Override // O9.e
        public final List<Annotation> getAnnotations() {
            this.f11790a.getClass();
            return C2099t.f18581b;
        }

        @Override // O9.e
        public final List<Annotation> h(int i) {
            this.f11790a.h(i);
            return C2099t.f18581b;
        }

        @Override // O9.e
        public final O9.e i(int i) {
            return this.f11790a.i(i);
        }

        @Override // O9.e
        public final boolean isInline() {
            this.f11790a.getClass();
            return false;
        }

        @Override // O9.e
        public final boolean j(int i) {
            this.f11790a.j(i);
            return false;
        }
    }

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        B7.d.c(dVar);
        return new C1565b((List) new C1526e(p.f11812a).deserialize(dVar));
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11787b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        C1565b value = (C1565b) obj;
        kotlin.jvm.internal.l.f(value, "value");
        B7.d.d(eVar);
        p pVar = p.f11812a;
        O9.e elementDesc = pVar.getDescriptor();
        kotlin.jvm.internal.l.f(elementDesc, "elementDesc");
        C1524d c1524d = new C1524d(elementDesc);
        int size = value.size();
        P9.c cVarV = eVar.v(c1524d, size);
        Iterator<i> it = value.iterator();
        for (int i = 0; i < size; i++) {
            cVarV.y(c1524d, i, pVar, it.next());
        }
        cVarV.b(c1524d);
    }
}
