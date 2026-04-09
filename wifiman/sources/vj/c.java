package vj;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.kodein.di.DI;
import org.kodein.di.e;
import rj.C7712j2;

/* loaded from: classes3.dex */
public final class c implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f63646a;

    /* renamed from: b, reason: collision with root package name */
    private final List f63647b;

    /* renamed from: c, reason: collision with root package name */
    private final List f63648c;

    /* renamed from: d, reason: collision with root package name */
    private final a f63649d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        public static final a ALLOW_SILENT = new b("ALLOW_SILENT", 0);
        public static final a ALLOW_EXPLICIT = new C2263a("ALLOW_EXPLICIT", 1);
        public static final a FORBID = new d("FORBID", 2);
        private static final /* synthetic */ a[] $VALUES = $values();
        public static final C2264c Companion = new C2264c(null);

        /* renamed from: vj.c$a$a, reason: collision with other inner class name */
        static final class C2263a extends a {
            C2263a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // vj.c.a
            public boolean isAllowed() {
                return true;
            }

            @Override // vj.c.a
            public Boolean must(Boolean bool) {
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        }

        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // vj.c.a
            public boolean isAllowed() {
                return true;
            }

            @Override // vj.c.a
            public Boolean must(Boolean bool) {
                return bool;
            }
        }

        /* renamed from: vj.c$a$c, reason: collision with other inner class name */
        public static final class C2264c {
            public /* synthetic */ C2264c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(boolean z10, boolean z11) {
                return !z10 ? a.FORBID : z11 ? a.ALLOW_SILENT : a.ALLOW_EXPLICIT;
            }

            private C2264c() {
            }
        }

        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // vj.c.a
            public boolean isAllowed() {
                return false;
            }

            @Override // vj.c.a
            public Boolean must(Boolean bool) {
                if (bool == null || !bool.booleanValue()) {
                    return Boolean.FALSE;
                }
                throw new DI.OverridingException("Overriding has been forbidden");
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{ALLOW_SILENT, ALLOW_EXPLICIT, FORBID};
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract boolean isAllowed();

        public abstract Boolean must(Boolean bool);

        private a(String str, int i10) {
        }
    }

    public c(boolean z10, boolean z11, Map bindingsMap, List callbacks, List translators) {
        AbstractC6492s.i(bindingsMap, "bindingsMap");
        AbstractC6492s.i(callbacks, "callbacks");
        AbstractC6492s.i(translators, "translators");
        this.f63646a = bindingsMap;
        this.f63647b = callbacks;
        this.f63648c = translators;
        this.f63649d = a.Companion.a(z10, z11);
    }

    private final void b(boolean z10) {
        if (!this.f63649d.isAllowed() && z10) {
            throw new DI.OverridingException("Overriding has been forbidden");
        }
    }

    private final void c(DI.e eVar, Boolean bool) {
        Boolean boolMust = this.f63649d.must(bool);
        if (boolMust != null) {
            if (boolMust.booleanValue() && !this.f63646a.containsKey(eVar)) {
                throw new DI.OverridingException("Binding " + eVar + " must override an existing binding.");
            }
            if (boolMust.booleanValue() || !this.f63646a.containsKey(eVar)) {
                return;
            }
            throw new DI.OverridingException("Binding " + eVar + " must not override an existing binding.");
        }
    }

    public void a(DI.e key, uj.e binding, String str, Boolean bool) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(binding, "binding");
        c(key, bool);
        Map map = this.f63646a;
        Object objB = map.get(key);
        if (objB == null) {
            objB = j.b();
            map.put(key, objB);
        }
        ((List) objB).add(0, new C7712j2(binding, str));
    }

    public final Map d() {
        return this.f63646a;
    }

    public final List e() {
        return this.f63647b;
    }

    public final List f() {
        return this.f63648c;
    }

    public c g(boolean z10, boolean z11) {
        b(z10);
        return new c(z10, z11, this.f63646a, this.f63647b, this.f63648c);
    }
}
