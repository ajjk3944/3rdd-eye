package sc;

import Yg.J;
import android.content.Context;
import com.ui.wifiman.model.android.secure.AndroidPassphraseManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7733m2;
import uj.j;
import uj.q;
import uj.u;

/* renamed from: sc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7938e {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f61439a = new DI.g("model.secure", false, null, new InterfaceC6835l() { // from class: sc.c
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return AbstractC7938e.c((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: sc.e$a */
    public static final class a extends o<AndroidPassphraseManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: sc.e$b */
    public static final class b extends o<com.ui.wifiman.model.android.secure.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: sc.e$c */
    public static final class c extends o<Context> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, AndroidPassphraseManager.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: sc.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC7938e.d((j) obj);
            }
        };
        q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        i iVarE2 = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.android.secure.a.class), null, true, interfaceC6835l));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.android.secure.a d(j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        i iVarE = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.android.secure.a((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null), O7.d.PASSCODES.getId());
    }

    public static final DI.g e() {
        return f61439a;
    }
}
