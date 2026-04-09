package td;

import gg.C;
import gg.InterfaceC5910A;
import gg.i;
import gg.z;
import kg.InterfaceC6467d;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;

/* renamed from: td.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8081c {

    /* renamed from: a, reason: collision with root package name */
    private final String f62086a;

    /* renamed from: b, reason: collision with root package name */
    private final i f62087b;

    /* renamed from: td.c$a */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f62088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC8081c f62089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f62090c;

        public a(Object obj, AbstractC8081c abstractC8081c, N n10) {
            this.f62088a = obj;
            this.f62089b = abstractC8081c;
            this.f62090c = n10;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Z7.b.g("Initialized with state - " + this.f62088a, this.f62089b.d());
                interfaceC5910A.onSuccess(this.f62090c.f51689a);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: td.c$b */
    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Object it) {
            AbstractC6492s.i(it, "it");
            return AbstractC8081c.this.j(it);
        }
    }

    /* renamed from: td.c$c, reason: collision with other inner class name */
    static final class C2178c implements InterfaceC6469f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f62093b;

        C2178c(N n10) {
            this.f62093b = n10;
        }

        @Override // kg.InterfaceC6469f
        public final void accept(Object newState) {
            AbstractC6492s.i(newState, "newState");
            Z7.b.g("updating internal state - " + newState, AbstractC8081c.this.d());
            this.f62093b.f51689a = newState;
        }
    }

    /* renamed from: td.c$d */
    public static final class d implements C {
        public d() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(AbstractC8081c.this.e().w(AbstractC8081c.this.new e()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: td.c$e */
    static final class e implements n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Object initialState) {
            AbstractC6492s.i(initialState, "initialState");
            return AbstractC8081c.this.h(initialState);
        }
    }

    /* renamed from: td.c$f */
    static final class f implements n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(i it) {
            AbstractC6492s.i(it, "it");
            return it.z1(AbstractC8081c.this.c());
        }
    }

    public AbstractC8081c() {
        String strV = O.b(getClass()).v();
        if (strV == null) {
            strV = "RxStateMachine" + hashCode();
        }
        this.f62086a = strV;
        z zVarI = z.i(new d());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        i iVarI2 = zVarI.w(new f()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f62087b = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i h(Object obj) {
        final N n10 = new N();
        n10.f51689a = obj;
        z zVarI = z.i(new a(obj, this, n10));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        i iVarM1 = zVarI.w(new b()).Y0(Gg.a.a(), false, 1).f0(new C2178c(n10)).m1(new InterfaceC6467d() { // from class: td.b
            @Override // kg.InterfaceC6467d
            public final boolean a() {
                return AbstractC8081c.i(this.f62084a, n10);
            }
        });
        AbstractC6492s.h(iVarM1, "repeatUntil(...)");
        return iVarM1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(AbstractC8081c abstractC8081c, N n10) {
        boolean zG = abstractC8081c.g(n10.f51689a);
        if (zG) {
            Z7.b.g("reached final state}", abstractC8081c.d());
        }
        return zG;
    }

    protected abstract Object c();

    protected abstract String d();

    protected abstract z e();

    public final i f() {
        return this.f62087b;
    }

    protected abstract boolean g(Object obj);

    protected abstract i j(Object obj);
}
