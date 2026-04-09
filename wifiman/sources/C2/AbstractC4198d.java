package c2;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import androidx.lifecycle.InterfaceC4011i;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import b2.AbstractC4056a;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract /* synthetic */ class AbstractC4198d {
    public static final N a(S s10, th.d modelClass, String str, P.c cVar, AbstractC4056a extras) {
        AbstractC6492s.i(s10, "<this>");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(extras, "extras");
        P pA = cVar != null ? P.f31623b.a(s10.o(), cVar, extras) : s10 instanceof InterfaceC4011i ? P.f31623b.a(s10.o(), ((InterfaceC4011i) s10).g(), extras) : P.b.c(P.f31623b, s10, null, null, 6, null);
        return str != null ? pA.c(str, modelClass) : pA.d(modelClass);
    }

    public static final N b(th.d modelClass, S s10, String str, P.c cVar, AbstractC4056a abstractC4056a, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(modelClass, "modelClass");
        interfaceC3540l.e(1673618944);
        if ((i11 & 2) != 0 && (s10 = C4195a.f33733a.a(interfaceC3540l, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            cVar = null;
        }
        if ((i11 & 16) != 0) {
            abstractC4056a = s10 instanceof InterfaceC4011i ? ((InterfaceC4011i) s10).h() : AbstractC4056a.C1139a.f32794b;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1673618944, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
        }
        N nA = AbstractC4197c.a(s10, modelClass, str, cVar, abstractC4056a);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return nA;
    }
}
