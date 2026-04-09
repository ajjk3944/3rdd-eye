package Fh;

import Gh.AbstractC2914f;
import Sh.x;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* loaded from: classes4.dex */
public final class f implements x {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6672c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Class f6673a;

    /* renamed from: b, reason: collision with root package name */
    private final Th.a f6674b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Class klass) {
            AbstractC6492s.i(klass, "klass");
            Th.b bVar = new Th.b();
            c.f6670a.b(klass, bVar);
            Th.a aVarN = bVar.n();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (aVarN == null) {
                return null;
            }
            return new f(klass, aVarN, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Class cls, Th.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, aVar);
    }

    @Override // Sh.x
    public Th.a a() {
        return this.f6674b;
    }

    @Override // Sh.x
    public Zh.b b() {
        return AbstractC2914f.e(this.f6673a);
    }

    @Override // Sh.x
    public void c(x.d visitor, byte[] bArr) {
        AbstractC6492s.i(visitor, "visitor");
        c.f6670a.i(this.f6673a, visitor);
    }

    @Override // Sh.x
    public void d(x.c visitor, byte[] bArr) {
        AbstractC6492s.i(visitor, "visitor");
        c.f6670a.b(this.f6673a, visitor);
    }

    public final Class e() {
        return this.f6673a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && AbstractC6492s.d(this.f6673a, ((f) obj).f6673a);
    }

    @Override // Sh.x
    public String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f6673a.getName();
        AbstractC6492s.h(name, "getName(...)");
        sb2.append(t.K(name, '.', '/', false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    public int hashCode() {
        return this.f6673a.hashCode();
    }

    public String toString() {
        return f.class.getName() + ": " + this.f6673a;
    }

    private f(Class cls, Th.a aVar) {
        this.f6673a = cls;
        this.f6674b = aVar;
    }
}
