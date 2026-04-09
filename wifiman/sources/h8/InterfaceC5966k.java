package h8;

import fg.AbstractC5824b;
import gg.AbstractC5912b;
import gg.s;
import h8.InterfaceC5966k;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: h8.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5966k {

    /* renamed from: h8.k$a */
    public static final class a {
        private static InterfaceC6464a e(InterfaceC5966k interfaceC5966k, final InterfaceC6824a interfaceC6824a) {
            return new InterfaceC6464a() { // from class: h8.g
                @Override // kg.InterfaceC6464a
                public final void run() {
                    InterfaceC5966k.a.f(interfaceC6824a);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void f(InterfaceC6824a interfaceC6824a) {
            interfaceC6824a.invoke();
        }

        private static InterfaceC6469f g(InterfaceC5966k interfaceC5966k, final InterfaceC6835l interfaceC6835l) {
            return new InterfaceC6469f() { // from class: h8.h
                @Override // kg.InterfaceC6469f
                public final void accept(Object obj) {
                    InterfaceC5966k.a.h(interfaceC6835l, obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void h(InterfaceC6835l interfaceC6835l, Object t10) {
            AbstractC6492s.i(t10, "t");
            interfaceC6835l.invoke(t10);
        }

        public static void i(InterfaceC5966k interfaceC5966k, AbstractC5912b receiver, EnumC5958c state, InterfaceC6464a onComplete, InterfaceC6469f interfaceC6469f, boolean z10) {
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(onComplete, "onComplete");
            if (z10) {
                receiver = receiver.L(AbstractC5824b.g());
            }
            AbstractC6492s.f(receiver);
            AbstractC5961f abstractC5961fK = interfaceC5966k.K();
            if (interfaceC6469f == null) {
                interfaceC6469f = AbstractC5968m.f48517a;
            }
            AbstractC6492s.g(interfaceC6469f, "null cannot be cast to non-null type io.reactivex.rxjava3.functions.Consumer<kotlin.Throwable>");
            InterfaceC6043c interfaceC6043cU = receiver.U(onComplete, interfaceC6469f);
            AbstractC6492s.h(interfaceC6043cU, "subscribe(...)");
            abstractC5961fK.d(interfaceC6043cU, state);
        }

        public static void j(InterfaceC5966k interfaceC5966k, AbstractC5912b receiver, EnumC5958c state, InterfaceC6835l interfaceC6835l, boolean z10, InterfaceC6824a onComplete) {
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(onComplete, "onComplete");
            interfaceC5966k.q(receiver, state, e(interfaceC5966k, onComplete), interfaceC6835l != null ? g(interfaceC5966k, interfaceC6835l) : null, z10);
        }

        public static void k(InterfaceC5966k interfaceC5966k, gg.i receiver, EnumC5958c state, InterfaceC6469f onNext, InterfaceC6469f interfaceC6469f, InterfaceC6464a interfaceC6464a, boolean z10) {
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(onNext, "onNext");
            if (z10) {
                receiver = receiver.X0(AbstractC5824b.g());
            }
            AbstractC6492s.f(receiver);
            AbstractC5961f abstractC5961fK = interfaceC5966k.K();
            if (interfaceC6469f == null) {
                interfaceC6469f = AbstractC5968m.f48517a;
            }
            AbstractC6492s.g(interfaceC6469f, "null cannot be cast to non-null type io.reactivex.rxjava3.functions.Consumer<kotlin.Throwable>");
            if (interfaceC6464a == null) {
                interfaceC6464a = new InterfaceC6464a() { // from class: h8.j
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        InterfaceC5966k.a.s();
                    }
                };
            }
            InterfaceC6043c interfaceC6043cC1 = receiver.C1(onNext, interfaceC6469f, interfaceC6464a);
            AbstractC6492s.h(interfaceC6043cC1, "subscribe(...)");
            abstractC5961fK.d(interfaceC6043cC1, state);
        }

        public static void l(InterfaceC5966k interfaceC5966k, gg.i receiver, EnumC5958c state, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC6835l onNext) {
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(onNext, "onNext");
            interfaceC5966k.k(receiver, state, g(interfaceC5966k, onNext), interfaceC6835l != null ? g(interfaceC5966k, interfaceC6835l) : null, interfaceC6824a != null ? e(interfaceC5966k, interfaceC6824a) : null, z10);
        }

        public static void m(InterfaceC5966k interfaceC5966k, s receiver, EnumC5958c state, InterfaceC6469f interfaceC6469f, InterfaceC6464a interfaceC6464a, boolean z10, InterfaceC6469f onNext) {
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(onNext, "onNext");
            if (z10) {
                receiver = receiver.o0(AbstractC5824b.g());
            }
            AbstractC6492s.f(receiver);
            AbstractC5961f abstractC5961fK = interfaceC5966k.K();
            if (interfaceC6469f == null) {
                interfaceC6469f = AbstractC5968m.f48517a;
            }
            AbstractC6492s.g(interfaceC6469f, "null cannot be cast to non-null type io.reactivex.rxjava3.functions.Consumer<kotlin.Throwable>");
            if (interfaceC6464a == null) {
                interfaceC6464a = new InterfaceC6464a() { // from class: h8.i
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        InterfaceC5966k.a.r();
                    }
                };
            }
            InterfaceC6043c interfaceC6043cK0 = receiver.K0(onNext, interfaceC6469f, interfaceC6464a);
            AbstractC6492s.h(interfaceC6043cK0, "subscribe(...)");
            abstractC5961fK.d(interfaceC6043cK0, state);
        }

        public static void n(InterfaceC5966k interfaceC5966k, s receiver, EnumC5958c state, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC6835l onNext) {
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(onNext, "onNext");
            interfaceC5966k.J(receiver, state, interfaceC6835l != null ? g(interfaceC5966k, interfaceC6835l) : null, interfaceC6824a != null ? e(interfaceC5966k, interfaceC6824a) : null, z10, g(interfaceC5966k, onNext));
        }

        public static /* synthetic */ void o(InterfaceC5966k interfaceC5966k, AbstractC5912b abstractC5912b, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, boolean z10, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeUntil");
            }
            if ((i10 & 2) != 0) {
                interfaceC6835l = null;
            }
            InterfaceC6835l interfaceC6835l2 = interfaceC6835l;
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            interfaceC5966k.B(abstractC5912b, enumC5958c, interfaceC6835l2, z10, interfaceC6824a);
        }

        public static /* synthetic */ void p(InterfaceC5966k interfaceC5966k, gg.i iVar, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC6835l interfaceC6835l2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeUntil");
            }
            interfaceC5966k.M(iVar, enumC5958c, (i10 & 2) != 0 ? null : interfaceC6835l, (i10 & 4) != 0 ? null : interfaceC6824a, (i10 & 8) != 0 ? true : z10, interfaceC6835l2);
        }

        public static /* synthetic */ void q(InterfaceC5966k interfaceC5966k, s sVar, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC6835l interfaceC6835l2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeUntil");
            }
            interfaceC5966k.c(sVar, enumC5958c, (i10 & 2) != 0 ? null : interfaceC6835l, (i10 & 4) != 0 ? null : interfaceC6824a, (i10 & 8) != 0 ? true : z10, interfaceC6835l2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void s() {
        }
    }

    void B(AbstractC5912b abstractC5912b, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, boolean z10, InterfaceC6824a interfaceC6824a);

    void J(s sVar, EnumC5958c enumC5958c, InterfaceC6469f interfaceC6469f, InterfaceC6464a interfaceC6464a, boolean z10, InterfaceC6469f interfaceC6469f2);

    AbstractC5961f K();

    void M(gg.i iVar, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC6835l interfaceC6835l2);

    void c(s sVar, EnumC5958c enumC5958c, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC6835l interfaceC6835l2);

    void k(gg.i iVar, EnumC5958c enumC5958c, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, boolean z10);

    void q(AbstractC5912b abstractC5912b, EnumC5958c enumC5958c, InterfaceC6464a interfaceC6464a, InterfaceC6469f interfaceC6469f, boolean z10);
}
