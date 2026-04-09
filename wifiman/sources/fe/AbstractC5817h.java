package fe;

import Wc.b;
import com.google.gson.JsonParseException;
import gg.D;
import gg.z;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import mh.InterfaceC6835l;
import retrofit2.HttpException;

/* renamed from: fe.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5817h {

    /* renamed from: fe.h$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47304a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wc.b apply(Object it) {
            AbstractC6492s.i(it, "it");
            return new b.a.C0897b(it);
        }
    }

    /* renamed from: fe.h$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f47305a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wc.b apply(Object it) {
            AbstractC6492s.i(it, "it");
            return new b.a.C0897b(it);
        }
    }

    /* renamed from: fe.h$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f47306a;

        c(InterfaceC6835l interfaceC6835l) {
            this.f47306a = interfaceC6835l;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wc.b apply(Wc.b it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof b.a.C0897b) {
                try {
                    return new b.a.C0897b(this.f47306a.invoke(((b.a.C0897b) it).b()));
                } catch (Exception e10) {
                    return new b.a.C0896a(e10);
                }
            }
            if (it instanceof b.a.C0896a) {
                return new b.a.C0896a(((b.a.C0896a) it).c());
            }
            if (it instanceof b.C0898b) {
                return new b.C0898b(null, 1, null);
            }
            if (it instanceof b.c) {
                return new b.c();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: fe.h$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f47307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f47308b;

        /* renamed from: fe.h$d$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f47309a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Wc.b apply(Object it) {
                AbstractC6492s.i(it, "it");
                return new b.a.C0897b(it);
            }
        }

        /* renamed from: fe.h$d$b */
        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f47310a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Throwable error) {
                int iA;
                AbstractC6492s.i(error, "error");
                if ((!(error instanceof HttpException) || 400 > (iA = ((HttpException) error).a()) || iA >= 500) && !(error instanceof JsonParseException)) {
                    return z.z(new b.a.C0896a(error));
                }
                return z.z(new b.c());
            }
        }

        /* renamed from: fe.h$d$c */
        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f47311a;

            c(long j10) {
                this.f47311a = j10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.R(this.f47311a, TimeUnit.MILLISECONDS);
            }
        }

        d(InterfaceC6835l interfaceC6835l, long j10) {
            this.f47307a = interfaceC6835l;
            this.f47308b = j10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Object objA = c6556a.a();
            return objA == null ? gg.i.K0(new b.c()) : ((z) this.f47307a.invoke(objA)).A(a.f47309a).O(Gg.a.d()).F(b.f47310a).K(new c(this.f47308b));
        }
    }

    /* renamed from: fe.h$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC6835l f47312a;

        e(InterfaceC6835l function) {
            AbstractC6492s.i(function, "function");
            this.f47312a = function;
        }

        @Override // kg.n
        public final /* synthetic */ Object apply(Object obj) {
            return this.f47312a.invoke(obj);
        }
    }

    public static final gg.i c(gg.i iVar, InterfaceC6835l onErrorFallback) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(onErrorFallback, "onErrorFallback");
        gg.i iVarZ1 = iVar.N0(b.f47305a).f1(new e(onErrorFallback)).z1(new b.C0898b(null, 1, null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }

    public static final gg.s d(z zVar, InterfaceC6835l onErrorFallback) {
        AbstractC6492s.i(zVar, "<this>");
        AbstractC6492s.i(onErrorFallback, "onErrorFallback");
        gg.s sVarI0 = zVar.A(a.f47304a).F(new e(onErrorFallback)).Y().I0(new b.C0898b(null, 1, null));
        AbstractC6492s.h(sVarI0, "startWithItem(...)");
        return sVarI0;
    }

    public static /* synthetic */ gg.i e(gg.i iVar, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6835l = new InterfaceC6835l() { // from class: fe.f
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj2) {
                    return AbstractC5817h.f((Throwable) obj2);
                }
            };
        }
        return c(iVar, interfaceC6835l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i f(Throwable it) {
        AbstractC6492s.i(it, "it");
        return gg.i.K0(new b.a.C0896a(it));
    }

    public static final gg.i g(gg.i iVar, final boolean z10) {
        AbstractC6492s.i(iVar, "<this>");
        gg.i iVarF1 = iVar.r1(new InterfaceC6465b() { // from class: fe.g
            @Override // kg.InterfaceC6465b
            public final Object apply(Object obj, Object obj2) {
                return AbstractC5817h.i(z10, (Wc.b) obj, (Wc.b) obj2);
            }
        }).z1(new b.C0898b(null, 1, null)).o1(1).i2().F1(Gg.a.d());
        AbstractC6492s.h(iVarF1, "subscribeOn(...)");
        return iVarF1;
    }

    public static /* synthetic */ gg.i h(gg.i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(iVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Wc.b i(boolean z10, Wc.b emitted, Wc.b current) {
        AbstractC6492s.i(emitted, "emitted");
        AbstractC6492s.i(current, "current");
        return (z10 && !(current instanceof b.a.C0897b) && (emitted instanceof b.a.C0897b)) ? emitted : current;
    }

    public static final gg.i j(gg.i iVar, InterfaceC6835l mapper) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(mapper, "mapper");
        gg.i iVarN0 = iVar.N0(new c(mapper));
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    public static final gg.i k(gg.i iVar, long j10, boolean z10, InterfaceC6835l endPointMapper) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(endPointMapper, "endPointMapper");
        return g(m(iVar, j10, endPointMapper), z10);
    }

    public static /* synthetic */ gg.i l(gg.i iVar, long j10, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return k(iVar, j10, z10, interfaceC6835l);
    }

    public static final gg.i m(gg.i iVar, long j10, InterfaceC6835l endPointMapper) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(endPointMapper, "endPointMapper");
        gg.i iVarI1 = iVar.I1(new d(endPointMapper, j10));
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        return iVarI1;
    }
}
