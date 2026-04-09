package Zd;

import Fd.D;
import Yg.J;
import ae.C3791c;
import ae.InterfaceC3790b;
import be.C4088b;
import be.C4090d;
import be.C4095i;
import be.InterfaceC4087a;
import be.InterfaceC4089c;
import be.InterfaceC4091e;
import com.ui.wifiman.model.teleport.TeleportConnection;
import fd.InterfaceC5808b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import nc.InterfaceC6924a;
import org.kodein.di.DI;
import org.kodein.type.s;
import rj.InterfaceC7733m2;
import rj.c6;
import uj.j;
import uj.u;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f25291a = new DI.g("model.unifi", false, null, new InterfaceC6835l() { // from class: Zd.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return f.f((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends org.kodein.type.o<InterfaceC4089c.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<InterfaceC4091e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<InterfaceC3790b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<InterfaceC4087a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<C4090d.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Zd.f$f, reason: collision with other inner class name */
    public static final class C0972f extends org.kodein.type.o<C4095i> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<C3791c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<C4088b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends org.kodein.type.o<com.ui.wifiman.model.support.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<InterfaceC5808b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<InterfaceC4089c.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<com.ui.wifiman.model.support.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<D> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends org.kodein.type.o<TeleportConnection> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends org.kodein.type.o<InterfaceC6924a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<nc.j> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, InterfaceC4089c.a.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: Zd.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.g((j) obj);
            }
        };
        org.kodein.type.q qVarB = Module.b();
        org.kodein.type.i iVarE2 = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new uj.n(qVarB, new org.kodein.type.d(iVarE2, C4090d.a.class), interfaceC6835l));
        org.kodein.type.i iVarE3 = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD2 = Module.d(new org.kodein.type.d(iVarE3, InterfaceC4091e.class), null, null);
        c6 c6Var = c6.f60607a;
        InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: Zd.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.h((j) obj);
            }
        };
        uj.q qVarC = Module.c();
        org.kodein.type.q qVarB2 = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE4 = s.e(new C0972f().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD2.a(new u(qVarC, qVarB2, zE, new org.kodein.type.d(iVarE4, C4095i.class), c6Var, true, interfaceC6835l2));
        org.kodein.type.i iVarE5 = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD3 = Module.d(new org.kodein.type.d(iVarE5, InterfaceC3790b.class), null, null);
        InterfaceC6835l interfaceC6835l3 = new InterfaceC6835l() { // from class: Zd.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.i((j) obj);
            }
        };
        uj.q qVarC2 = Module.c();
        org.kodein.type.q qVarB3 = Module.b();
        boolean zE2 = Module.e();
        org.kodein.type.i iVarE6 = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD3.a(new u(qVarC2, qVarB3, zE2, new org.kodein.type.d(iVarE6, C3791c.class), null, true, interfaceC6835l3));
        org.kodein.type.i iVarE7 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD4 = Module.d(new org.kodein.type.d(iVarE7, InterfaceC4087a.class), null, null);
        InterfaceC6835l interfaceC6835l4 = new InterfaceC6835l() { // from class: Zd.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.j((j) obj);
            }
        };
        uj.q qVarC3 = Module.c();
        org.kodein.type.q qVarB4 = Module.b();
        boolean zE3 = Module.e();
        org.kodein.type.i iVarE8 = s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD4.a(new u(qVarC3, qVarB4, zE3, new org.kodein.type.d(iVarE8, C4088b.class), null, true, interfaceC6835l4));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4090d.a g(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        com.ui.wifiman.model.support.a aVar = (com.ui.wifiman.model.support.a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, com.ui.wifiman.model.support.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = provider.g();
        org.kodein.type.i iVarE2 = s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C4090d.a(aVar, (InterfaceC5808b) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC5808b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4095i h(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Zc.f fVar = (Zc.f) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Zc.f.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC4089c.a aVar = (InterfaceC4089c.a) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC4089c.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        P7.a aVar2 = (P7.a) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, P7.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        com.ui.wifiman.model.support.a aVar3 = (com.ui.wifiman.model.support.a) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, com.ui.wifiman.model.support.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G5 = singleton.g();
        org.kodein.type.i iVarE5 = s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        D d10 = (D) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE5, D.class), null);
        InterfaceC7733m2 interfaceC7733m2G6 = singleton.g();
        org.kodein.type.i iVarE6 = s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C4095i(fVar, aVar, aVar2, (TeleportConnection) interfaceC7733m2G6.e(new org.kodein.type.d(iVarE6, TeleportConnection.class), null), d10, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3791c i(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6924a interfaceC6924a = (InterfaceC6924a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC6924a.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C3791c((nc.j) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, nc.j.class), null), interfaceC6924a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4088b j(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new C4088b(singleton.d());
    }

    public static final DI.g k() {
        return f25291a;
    }
}
