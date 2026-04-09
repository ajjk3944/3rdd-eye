package ze;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC4003a;
import androidx.lifecycle.E;
import androidx.lifecycle.N;
import f2.C5512k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.o;
import org.kodein.type.q;
import org.kodein.type.s;
import q2.InterfaceC7418f;
import rj.InterfaceC7733m2;

/* renamed from: ze.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8732a {

    /* renamed from: ze.a$a, reason: collision with other inner class name */
    public static final class C2390a extends AbstractC4003a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DI f67251e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f67252f;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"org/kodein/type/r", "Lorg/kodein/type/o;", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ze.a$a$a, reason: collision with other inner class name */
        public static final class C2391a extends o<E> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2390a(InterfaceC7418f interfaceC7418f, Bundle bundle, DI di2, String str) {
            super(interfaceC7418f, bundle);
            this.f67251e = di2;
            this.f67252f = str;
        }

        @Override // androidx.lifecycle.AbstractC4003a
        protected N f(String key, Class modelClass, E handle) {
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(modelClass, "modelClass");
            AbstractC6492s.i(handle, "handle");
            InterfaceC7733m2 interfaceC7733m2F = org.kodein.di.d.f(this.f67251e);
            q qVarA = s.a(modelClass);
            i iVarE = s.e(new C2391a().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            return (N) interfaceC7733m2F.c(new org.kodein.type.d(iVarE, E.class), qVarA, this.f67252f).invoke(handle);
        }
    }

    public static final AbstractC4003a a(DI di2, InterfaceC7418f owner, Bundle bundle, String str) {
        AbstractC6492s.i(di2, "di");
        AbstractC6492s.i(owner, "owner");
        return new C2390a(owner, bundle, di2, str);
    }

    public static final AbstractC4003a b(DI di2, InterfaceC7418f interfaceC7418f, Bundle bundle, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(-394553989);
        if ((i11 & 1) != 0) {
            di2 = (DI) interfaceC3540l.t(AbstractC8734c.c());
        }
        if ((i11 & 2) != 0) {
            interfaceC7418f = (InterfaceC7418f) interfaceC3540l.t(AndroidCompositionLocals_androidKt.j());
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-394553989, i10, -1, "com.ui.wifiman.ui.arch.kodein.rememberCustomKodeinVmFactory (KodeinViewModelFactory.kt:44)");
        }
        interfaceC3540l.U(126422139);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = a(di2, interfaceC7418f, bundle, str);
            interfaceC3540l.K(objF);
        }
        AbstractC4003a abstractC4003a = (AbstractC4003a) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return abstractC4003a;
    }

    public static final AbstractC4003a c(C5512k c5512k, DI di2, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(c5512k, "<this>");
        interfaceC3540l.U(1532253024);
        if ((i11 & 1) != 0) {
            di2 = (DI) interfaceC3540l.t(AbstractC8734c.c());
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1532253024, i10, -1, "com.ui.wifiman.ui.arch.kodein.rememberKodeinVmFactory (KodeinViewModelFactory.kt:57)");
        }
        interfaceC3540l.U(1505959179);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = a(di2, c5512k, c5512k.d(), str);
            interfaceC3540l.K(objF);
        }
        AbstractC4003a abstractC4003a = (AbstractC4003a) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return abstractC4003a;
    }
}
