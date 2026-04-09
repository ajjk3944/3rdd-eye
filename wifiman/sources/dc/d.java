package Dc;

import Yg.J;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f3184a = new DI.g("model.discovery", false, null, new InterfaceC6835l() { // from class: Dc.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return d.d((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends org.kodein.type.o<k> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<Dc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/c", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<String> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/d", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Dc.d$d, reason: collision with other inner class name */
    public static final class C0152d extends org.kodein.type.o<m> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<p> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<Zc.f> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        DI.b.a.a(Module, Ec.s.s(), false, 2, null);
        org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, k.class), null, null);
        InterfaceC6839p interfaceC6839p = new InterfaceC6839p() { // from class: Dc.b
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return d.e((uj.b) obj, (String) obj2);
            }
        };
        org.kodein.type.q qVarB = Module.b();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar = new org.kodein.type.d(iVarE2, String.class);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new C0152d().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new uj.g(qVarB, dVar, new org.kodein.type.d(iVarE3, m.class), interfaceC6839p));
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD2 = Module.d(new org.kodein.type.d(iVarE4, Dc.e.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: Dc.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return d.f((uj.j) obj);
            }
        };
        uj.q qVarC = Module.c();
        org.kodein.type.q qVarB2 = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD2.a(new uj.u(qVarC, qVarB2, zE, new org.kodein.type.d(iVarE5, p.class), null, true, interfaceC6835l));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m e(uj.b factory, String id2) {
        AbstractC6492s.i(factory, "$this$factory");
        AbstractC6492s.i(id2, "id");
        return new m(id2, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p f(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new p((Zc.f) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Zc.f.class), null), singleton.d());
    }

    public static final DI.g g() {
        return f3184a;
    }
}
