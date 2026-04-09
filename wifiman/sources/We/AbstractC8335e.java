package we;

import Yg.J;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.c6;
import uj.j;
import uj.q;
import uj.u;
import we.InterfaceC8332b;

/* renamed from: we.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8335e {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f64898a = new DI.g("util.transport", false, null, new InterfaceC6835l() { // from class: we.c
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return AbstractC8335e.c((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: we.e$a */
    public static final class a extends o<InterfaceC8332b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: we.e$b */
    public static final class b extends o<C8331a> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        InterfaceC8332b.a aVar = InterfaceC8332b.a.BASE64;
        i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, InterfaceC8332b.class), aVar, null);
        c6 c6Var = c6.f60607a;
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: we.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8335e.d((j) obj);
            }
        };
        q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        i iVarE2 = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, C8331a.class), c6Var, true, interfaceC6835l));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8331a d(j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new C8331a();
    }

    public static final DI.g e() {
        return f64898a;
    }
}
