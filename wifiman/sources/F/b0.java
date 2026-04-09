package F;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.view.KeyEvent;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import w0.C8248b;

/* loaded from: classes.dex */
public abstract class b0 {

    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f5008a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M.G f5009b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ R0.Q f5010c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5011d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5012e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ R0.H f5013f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ u0 f5014g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5015h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f5016i;

        /* renamed from: F.b0$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0213a extends C6490p implements InterfaceC6835l {
            C0213a(Object obj) {
                super(1, obj, a0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean a(KeyEvent keyEvent) {
                return Boolean.valueOf(((a0) this.receiver).l(keyEvent));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((C8248b) obj).f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E e10, M.G g10, R0.Q q10, boolean z10, boolean z11, R0.H h10, u0 u0Var, InterfaceC6835l interfaceC6835l, int i10) {
            super(3);
            this.f5008a = e10;
            this.f5009b = g10;
            this.f5010c = q10;
            this.f5011d = z10;
            this.f5012e = z11;
            this.f5013f = h10;
            this.f5014g = u0Var;
            this.f5015h = interfaceC6835l;
            this.f5016i = i10;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(851809892);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(851809892, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = new M.J();
                interfaceC3540l.K(objF);
            }
            M.J j10 = (M.J) objF;
            Object objF2 = interfaceC3540l.f();
            if (objF2 == aVar.a()) {
                objF2 = new C2724n();
                interfaceC3540l.K(objF2);
            }
            a0 a0Var = new a0(this.f5008a, this.f5009b, this.f5010c, this.f5011d, this.f5012e, j10, this.f5013f, this.f5014g, (C2724n) objF2, null, this.f5015h, this.f5016i, 512, null);
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            boolean zL = interfaceC3540l.l(a0Var);
            Object objF3 = interfaceC3540l.f();
            if (zL || objF3 == aVar.a()) {
                objF3 = new C0213a(a0Var);
                interfaceC3540l.K(objF3);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.input.key.a.a(aVar2, (InterfaceC6835l) ((th.g) objF3));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarA;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, E e10, M.G g10, R0.Q q10, InterfaceC6835l interfaceC6835l, boolean z10, boolean z11, R0.H h10, u0 u0Var, int i10) {
        return androidx.compose.ui.c.c(eVar, null, new a(e10, g10, q10, z10, z11, h10, u0Var, interfaceC6835l, i10), 1, null);
    }
}
