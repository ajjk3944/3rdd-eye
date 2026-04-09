package Cc;

import Yg.J;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import le.InterfaceC6586g;
import mc.InterfaceC6794a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f2508a = new DI.g("model.device", false, null, new InterfaceC6835l() { // from class: Cc.g
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return i.c((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends org.kodein.type.o<n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<p> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<Ob.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<Dc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<wc.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<InterfaceC6794a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<com.ui.wifiman.model.bluetooth.le.a> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, n.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: Cc.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.d((uj.j) obj);
            }
        };
        uj.q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new uj.u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, p.class), null, true, interfaceC6835l));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p d(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Ob.a aVar = (Ob.a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Ob.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Dc.e eVar = (Dc.e) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, Dc.e.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6586g interfaceC6586g = (InterfaceC6586g) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, InterfaceC6586g.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        wc.h hVar = (wc.h) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, wc.h.class), null);
        InterfaceC7733m2 interfaceC7733m2G5 = singleton.g();
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6794a interfaceC6794a = (InterfaceC6794a) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE5, InterfaceC6794a.class), null);
        InterfaceC7733m2 interfaceC7733m2G6 = singleton.g();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new p(aVar, eVar, interfaceC6586g, hVar, (com.ui.wifiman.model.bluetooth.le.a) interfaceC7733m2G6.e(new org.kodein.type.d(iVarE6, com.ui.wifiman.model.bluetooth.le.a.class), null), interfaceC6794a);
    }

    public static final DI.g e() {
        return f2508a;
    }
}
