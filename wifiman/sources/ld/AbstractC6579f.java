package ld;

import Yg.J;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import md.InterfaceC6797b;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7733m2;
import uj.j;
import uj.q;
import uj.u;

/* renamed from: ld.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6579f {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f52555a = new DI.g("model.session", false, null, new InterfaceC6835l() { // from class: ld.d
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return AbstractC6579f.c((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ld.f$a */
    public static final class a extends o<InterfaceC6575b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ld.f$b */
    public static final class b extends o<C6576c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ld.f$c */
    public static final class c extends o<Ub.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ld.f$d */
    public static final class d extends o<InterfaceC6797b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ld.f$e */
    public static final class e extends o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ld.f$f, reason: collision with other inner class name */
    public static final class C1941f extends o<Q7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ld.f$g */
    public static final class g extends o<com.ui.wifiman.model.support.a> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, InterfaceC6575b.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: ld.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC6579f.d((j) obj);
            }
        };
        q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        i iVarE2 = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, C6576c.class), null, true, interfaceC6835l));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6576c d(j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        i iVarE = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Ub.a aVar = (Ub.a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Ub.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        i iVarE2 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6797b interfaceC6797b = (InterfaceC6797b) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC6797b.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        i iVarE3 = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        P7.a aVar2 = (P7.a) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, P7.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        i iVarE4 = s.e(new C1941f().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Q7.a aVar3 = (Q7.a) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, Q7.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G5 = singleton.g();
        i iVarE5 = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C6576c(aVar, interfaceC6797b, aVar2, aVar3, (com.ui.wifiman.model.support.a) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE5, com.ui.wifiman.model.support.a.class), null));
    }

    public static final DI.g e() {
        return f52555a;
    }
}
