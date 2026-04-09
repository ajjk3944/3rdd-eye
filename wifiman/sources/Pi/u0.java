package pi;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import ri.InterfaceC7613d;
import ri.InterfaceC7618i;
import ri.InterfaceC7619j;
import xi.C8545l;

/* loaded from: classes4.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f58170a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f58171b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f58172c;

    /* renamed from: d, reason: collision with root package name */
    private final ri.o f58173d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC7370q f58174e;

    /* renamed from: f, reason: collision with root package name */
    private final r f58175f;

    /* renamed from: g, reason: collision with root package name */
    private int f58176g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f58177h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayDeque f58178i;

    /* renamed from: j, reason: collision with root package name */
    private Set f58179j;

    public interface a {

        /* renamed from: pi.u0$a$a, reason: collision with other inner class name */
        public static final class C2045a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f58180a;

            @Override // pi.u0.a
            public void a(InterfaceC6824a block) {
                AbstractC6492s.i(block, "block");
                if (this.f58180a) {
                    return;
                }
                this.f58180a = ((Boolean) block.invoke()).booleanValue();
            }

            public final boolean b() {
                return this.f58180a;
            }
        }

        void a(InterfaceC6824a interfaceC6824a);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CHECK_ONLY_LOWER = new b("CHECK_ONLY_LOWER", 0);
        public static final b CHECK_SUBTYPE_AND_LOWER = new b("CHECK_SUBTYPE_AND_LOWER", 1);
        public static final b SKIP_LOWER = new b("SKIP_LOWER", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{CHECK_ONLY_LOWER, CHECK_SUBTYPE_AND_LOWER, SKIP_LOWER};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static abstract class c {

        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f58181a = new b();

            private b() {
                super(null);
            }

            @Override // pi.u0.c
            public InterfaceC7619j a(u0 state, InterfaceC7618i type) {
                AbstractC6492s.i(state, "state");
                AbstractC6492s.i(type, "type");
                return state.j().b0(type);
            }
        }

        /* renamed from: pi.u0$c$c, reason: collision with other inner class name */
        public static final class C2046c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C2046c f58182a = new C2046c();

            private C2046c() {
                super(null);
            }

            @Override // pi.u0.c
            public /* bridge */ /* synthetic */ InterfaceC7619j a(u0 u0Var, InterfaceC7618i interfaceC7618i) {
                return (InterfaceC7619j) b(u0Var, interfaceC7618i);
            }

            public Void b(u0 state, InterfaceC7618i type) {
                AbstractC6492s.i(state, "state");
                AbstractC6492s.i(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f58183a = new d();

            private d() {
                super(null);
            }

            @Override // pi.u0.c
            public InterfaceC7619j a(u0 state, InterfaceC7618i type) {
                AbstractC6492s.i(state, "state");
                AbstractC6492s.i(type, "type");
                return state.j().F0(type);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract InterfaceC7619j a(u0 u0Var, InterfaceC7618i interfaceC7618i);

        private c() {
        }
    }

    public u0(boolean z10, boolean z11, boolean z12, ri.o typeSystemContext, AbstractC7370q kotlinTypePreparator, r kotlinTypeRefiner) {
        AbstractC6492s.i(typeSystemContext, "typeSystemContext");
        AbstractC6492s.i(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f58170a = z10;
        this.f58171b = z11;
        this.f58172c = z12;
        this.f58173d = typeSystemContext;
        this.f58174e = kotlinTypePreparator;
        this.f58175f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(u0 u0Var, InterfaceC7618i interfaceC7618i, InterfaceC7618i interfaceC7618i2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return u0Var.c(interfaceC7618i, interfaceC7618i2, z10);
    }

    public Boolean c(InterfaceC7618i subType, InterfaceC7618i superType, boolean z10) {
        AbstractC6492s.i(subType, "subType");
        AbstractC6492s.i(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f58178i;
        AbstractC6492s.f(arrayDeque);
        arrayDeque.clear();
        Set set = this.f58179j;
        AbstractC6492s.f(set);
        set.clear();
        this.f58177h = false;
    }

    public boolean f(InterfaceC7618i subType, InterfaceC7618i superType) {
        AbstractC6492s.i(subType, "subType");
        AbstractC6492s.i(superType, "superType");
        return true;
    }

    public b g(InterfaceC7619j subType, InterfaceC7613d superType) {
        AbstractC6492s.i(subType, "subType");
        AbstractC6492s.i(superType, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque h() {
        return this.f58178i;
    }

    public final Set i() {
        return this.f58179j;
    }

    public final ri.o j() {
        return this.f58173d;
    }

    public final void k() {
        this.f58177h = true;
        if (this.f58178i == null) {
            this.f58178i = new ArrayDeque(4);
        }
        if (this.f58179j == null) {
            this.f58179j = C8545l.f66170c.a();
        }
    }

    public final boolean l(InterfaceC7618i type) {
        AbstractC6492s.i(type, "type");
        return this.f58172c && this.f58173d.H0(type);
    }

    public final boolean m() {
        return this.f58170a;
    }

    public final boolean n() {
        return this.f58171b;
    }

    public final InterfaceC7618i o(InterfaceC7618i type) {
        AbstractC6492s.i(type, "type");
        return this.f58174e.a(type);
    }

    public final InterfaceC7618i p(InterfaceC7618i type) {
        AbstractC6492s.i(type, "type");
        return this.f58175f.a(type);
    }

    public boolean q(InterfaceC6835l block) {
        AbstractC6492s.i(block, "block");
        a.C2045a c2045a = new a.C2045a();
        block.invoke(c2045a);
        return c2045a.b();
    }
}
