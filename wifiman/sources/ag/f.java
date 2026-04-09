package Ag;

import Yg.J;
import gg.AbstractC5912b;
import gg.i;
import gg.s;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mg.AbstractC6822a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f759a = c.f764a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6835l f760b = b.f763a;

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC6824a f761c = a.f762a;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f762a = new a();

        a() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f763a = new b();

        b() {
            super(1);
        }

        public final void a(Throwable it) {
            AbstractC6492s.i(it, "it");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f764a = new c();

        c() {
            super(1);
        }

        public final void a(Object it) {
            AbstractC6492s.i(it, "it");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return J.f24997a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Ag.h] */
    private static final InterfaceC6469f a(InterfaceC6835l interfaceC6835l) {
        if (interfaceC6835l == f759a) {
            InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
            AbstractC6492s.h(interfaceC6469fE, "Functions.emptyConsumer()");
            return interfaceC6469fE;
        }
        if (interfaceC6835l != null) {
            interfaceC6835l = new h(interfaceC6835l);
        }
        return (InterfaceC6469f) interfaceC6835l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Ag.g] */
    private static final InterfaceC6464a b(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a == f761c) {
            InterfaceC6464a interfaceC6464a = AbstractC6822a.f54016c;
            AbstractC6492s.h(interfaceC6464a, "Functions.EMPTY_ACTION");
            return interfaceC6464a;
        }
        if (interfaceC6824a != null) {
            interfaceC6824a = new g(interfaceC6824a);
        }
        return (InterfaceC6464a) interfaceC6824a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Ag.h] */
    private static final InterfaceC6469f c(InterfaceC6835l interfaceC6835l) {
        if (interfaceC6835l == f760b) {
            InterfaceC6469f interfaceC6469f = AbstractC6822a.f54019f;
            AbstractC6492s.h(interfaceC6469f, "Functions.ON_ERROR_MISSING");
            return interfaceC6469f;
        }
        if (interfaceC6835l != null) {
            interfaceC6835l = new h(interfaceC6835l);
        }
        return (InterfaceC6469f) interfaceC6835l;
    }

    public static final InterfaceC6043c d(AbstractC5912b subscribeBy, InterfaceC6835l onError, InterfaceC6824a onComplete) {
        AbstractC6492s.i(subscribeBy, "$this$subscribeBy");
        AbstractC6492s.i(onError, "onError");
        AbstractC6492s.i(onComplete, "onComplete");
        InterfaceC6835l interfaceC6835l = f760b;
        if (onError == interfaceC6835l && onComplete == f761c) {
            InterfaceC6043c interfaceC6043cS = subscribeBy.S();
            AbstractC6492s.h(interfaceC6043cS, "subscribe()");
            return interfaceC6043cS;
        }
        if (onError == interfaceC6835l) {
            InterfaceC6043c interfaceC6043cT = subscribeBy.T(new g(onComplete));
            AbstractC6492s.h(interfaceC6043cT, "subscribe(onComplete)");
            return interfaceC6043cT;
        }
        InterfaceC6043c interfaceC6043cU = subscribeBy.U(b(onComplete), new h(onError));
        AbstractC6492s.h(interfaceC6043cU, "subscribe(onComplete.asO…ion(), Consumer(onError))");
        return interfaceC6043cU;
    }

    public static final InterfaceC6043c e(i subscribeBy, InterfaceC6835l onError, InterfaceC6824a onComplete, InterfaceC6835l onNext) {
        AbstractC6492s.i(subscribeBy, "$this$subscribeBy");
        AbstractC6492s.i(onError, "onError");
        AbstractC6492s.i(onComplete, "onComplete");
        AbstractC6492s.i(onNext, "onNext");
        InterfaceC6043c interfaceC6043cC1 = subscribeBy.C1(a(onNext), c(onError), b(onComplete));
        AbstractC6492s.h(interfaceC6043cC1, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return interfaceC6043cC1;
    }

    public static final InterfaceC6043c f(s subscribeBy, InterfaceC6835l onError, InterfaceC6824a onComplete, InterfaceC6835l onNext) {
        AbstractC6492s.i(subscribeBy, "$this$subscribeBy");
        AbstractC6492s.i(onError, "onError");
        AbstractC6492s.i(onComplete, "onComplete");
        AbstractC6492s.i(onNext, "onNext");
        InterfaceC6043c interfaceC6043cK0 = subscribeBy.K0(a(onNext), c(onError), b(onComplete));
        AbstractC6492s.h(interfaceC6043cK0, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return interfaceC6043cK0;
    }

    public static /* synthetic */ InterfaceC6043c g(AbstractC5912b abstractC5912b, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6835l = f760b;
        }
        if ((i10 & 2) != 0) {
            interfaceC6824a = f761c;
        }
        return d(abstractC5912b, interfaceC6835l, interfaceC6824a);
    }

    public static /* synthetic */ InterfaceC6043c h(i iVar, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, InterfaceC6835l interfaceC6835l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6835l = f760b;
        }
        if ((i10 & 2) != 0) {
            interfaceC6824a = f761c;
        }
        if ((i10 & 4) != 0) {
            interfaceC6835l2 = f759a;
        }
        return e(iVar, interfaceC6835l, interfaceC6824a, interfaceC6835l2);
    }

    public static /* synthetic */ InterfaceC6043c i(s sVar, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, InterfaceC6835l interfaceC6835l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6835l = f760b;
        }
        if ((i10 & 2) != 0) {
            interfaceC6824a = f761c;
        }
        if ((i10 & 4) != 0) {
            interfaceC6835l2 = f759a;
        }
        return f(sVar, interfaceC6835l, interfaceC6824a, interfaceC6835l2);
    }
}
