package androidx.compose.ui;

import T.InterfaceC3540l;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3964z0;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.V;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;

/* loaded from: classes.dex */
public abstract class c {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28736a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3540l f28737a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3540l interfaceC3540l) {
            super(2);
            this.f28737a = interfaceC3540l;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(e eVar, e.b bVar) {
            boolean z10 = bVar instanceof androidx.compose.ui.b;
            e eVarD = bVar;
            if (z10) {
                q qVarA = ((androidx.compose.ui.b) bVar).a();
                AbstractC6492s.g(qVarA, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                eVarD = c.d(this.f28737a, (e) ((q) V.f(qVarA, 3)).s(e.f28771b0, this.f28737a, 0));
            }
            return eVar.b0(eVarD);
        }
    }

    public static final e b(e eVar, InterfaceC6835l interfaceC6835l, q qVar) {
        return eVar.b0(new androidx.compose.ui.b(interfaceC6835l, qVar));
    }

    public static /* synthetic */ e c(e eVar, InterfaceC6835l interfaceC6835l, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6835l = AbstractC3964z0.a();
        }
        return b(eVar, interfaceC6835l, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e d(InterfaceC3540l interfaceC3540l, e eVar) {
        if (eVar.s(a.f28736a)) {
            return eVar;
        }
        interfaceC3540l.e(1219399079);
        e eVar2 = (e) eVar.L(e.f28771b0, new b(interfaceC3540l));
        interfaceC3540l.P();
        return eVar2;
    }

    public static final e e(InterfaceC3540l interfaceC3540l, e eVar) {
        interfaceC3540l.U(439770924);
        e eVarD = d(interfaceC3540l, eVar);
        interfaceC3540l.J();
        return eVarD;
    }

    public static final e f(InterfaceC3540l interfaceC3540l, e eVar) {
        return eVar == e.f28771b0 ? eVar : e(interfaceC3540l, new CompositionLocalMapInjectionElement(interfaceC3540l.G()).b0(eVar));
    }
}
