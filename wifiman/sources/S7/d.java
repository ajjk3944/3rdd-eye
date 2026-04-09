package S7;

import Sj.a;
import Yg.J;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7733m2;
import uj.j;
import uj.q;
import uj.u;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f20350a = new DI.g("analyticsLogging", false, null, new InterfaceC6835l() { // from class: S7.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return d.d((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends o<a.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<S7.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<a.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: S7.d$d, reason: collision with other inner class name */
    public static final class C0727d extends o<i> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends o<Q7.f> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, a.c.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: S7.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return d.e((j) obj);
            }
        };
        q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE2 = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, a.c.class), null, true, interfaceC6835l));
        org.kodein.type.i iVarE3 = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD2 = Module.d(new org.kodein.type.d(iVarE3, S7.e.class), null, null);
        InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: S7.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return d.f((j) obj);
            }
        };
        q qVarC2 = Module.c();
        org.kodein.type.q qVarB2 = Module.b();
        boolean zE2 = Module.e();
        org.kodein.type.i iVarE4 = s.e(new C0727d().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD2.a(new u(qVarC2, qVarB2, zE2, new org.kodein.type.d(iVarE4, i.class), null, true, interfaceC6835l2));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a.c e(j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (a.c) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Q7.f.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i f(j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new i();
    }

    public static final DI.g g() {
        return f20350a;
    }
}
