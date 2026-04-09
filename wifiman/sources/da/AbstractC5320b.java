package da;

import Li.InterfaceC3220g;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import da.AbstractC5338u;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import y9.EnumC8633f;

/* renamed from: da.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5320b {

    /* renamed from: da.b$a */
    static final class a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5338u.a f45864a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f45865b;

        /* renamed from: da.b$a$a, reason: collision with other inner class name */
        static final class C1701a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5338u.a f45866a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f45867b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f45868c;

            C1701a(AbstractC5338u.a aVar, List list, InterfaceC6824a interfaceC6824a) {
                this.f45866a = aVar;
                this.f45867b = list;
                this.f45868c = interfaceC6824a;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1647120575, i10, -1, "com.ui.core.ui.sso.register.PasswordStrengthComponent.<anonymous>.<anonymous> (PasswordStrengthComponent.kt:146)");
                }
                y9.q.k(null, ((Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g())).getString(P9.b.f18448k0) + " " + AbstractC5320b.f(this.f45866a, interfaceC3540l, 0), 0, 0, 0L, null, null, new d.c(AbstractC5320b.g(this.f45867b)), null, null, this.f45868c, null, null, null, H0.f.a(P9.b.f18450l0, interfaceC3540l, 0), null, this.f45868c, null, null, interfaceC3540l, 0, 0, 441213);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        a(AbstractC5338u.a aVar, List list) {
            this.f45864a = aVar;
            this.f45865b = list;
        }

        public final void a(Object unused$var$, InterfaceC6824a dismissalAction, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(unused$var$, "$unused$var$");
            AbstractC6492s.i(dismissalAction, "dismissalAction");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(800041646, i10, -1, "com.ui.core.ui.sso.register.PasswordStrengthComponent.<anonymous> (PasswordStrengthComponent.kt:142)");
            }
            y9.s.b(EnumC8633f.BOTTOM, 0L, null, dismissalAction, b0.c.e(-1647120575, true, new C1701a(this.f45864a, this.f45865b, dismissalAction), interfaceC3540l, 54), interfaceC3540l, ((i10 << 6) & 7168) | 24582, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a(obj, (InterfaceC6824a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r67, final da.AbstractC5338u.a r68, final java.util.List r69, final mh.InterfaceC6824a r70, final Li.InterfaceC3220g r71, T.InterfaceC3540l r72, final int r73) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.AbstractC5320b.b(androidx.compose.ui.e, da.u$a, java.util.List, mh.a, Li.g, T.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, AbstractC5338u.a aVar, List list, InterfaceC6824a interfaceC6824a, InterfaceC3220g interfaceC3220g, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, aVar, list, interfaceC6824a, interfaceC3220g, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(AbstractC5338u.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        interfaceC3540l.U(-1090212339);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1090212339, i10, -1, "com.ui.core.ui.sso.register.getPasswordStrengthString (PasswordStrengthComponent.kt:168)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        if (AbstractC6492s.d(aVar, AbstractC5338u.a.C1713a.f45968a)) {
            i11 = P9.b.f18452m0;
        } else if (AbstractC6492s.d(aVar, AbstractC5338u.a.f.f45973a)) {
            i11 = P9.b.f18462r0;
        } else if (AbstractC6492s.d(aVar, AbstractC5338u.a.b.f45969a)) {
            i11 = P9.b.f18454n0;
        } else if (AbstractC6492s.d(aVar, AbstractC5338u.a.c.f45970a)) {
            i11 = P9.b.f18456o0;
        } else if (aVar instanceof AbstractC5338u.a.d) {
            i11 = P9.b.f18458p0;
        } else if (aVar instanceof AbstractC5338u.a.e) {
            i11 = P9.b.f18460q0;
        } else {
            if (!(aVar instanceof AbstractC5338u.a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = P9.b.f18464s0;
        }
        String string = context.getString(i11);
        AbstractC6492s.h(string, "getString(...)");
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb2.append("• " + ((String) it.next()) + "\n");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
