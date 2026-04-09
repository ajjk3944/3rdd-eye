package Ne;

import L0.C3174d;
import L0.D;
import S8.g;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.q;
import s9.d;

/* loaded from: classes4.dex */
public abstract class k {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.g f16419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16420b;

        a(S8.g gVar, boolean z10) {
            this.f16419a = gVar;
            this.f16420b = z10;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-475669527);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-475669527, i10, -1, "com.ui.wifiman.ui.domain.text.<anonymous> (WifiExperienceExtensions.kt:14)");
            }
            String string = context.getString(AbstractC6780c.f53606w4);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f16419a.a())}, 1));
            AbstractC6492s.h(str, "format(...)");
            CharSequence charSequenceP = str;
            if (this.f16420b) {
                S8.g gVar = this.f16419a;
                C3174d.a aVar = new C3174d.a(0, 1, null);
                int iN = aVar.n(new D(k.a(gVar, interfaceC3540l, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    aVar.i(str);
                    J j10 = J.f24997a;
                    aVar.l(iN);
                    charSequenceP = aVar.p();
                } catch (Throwable th2) {
                    aVar.l(iN);
                    throw th2;
                }
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return charSequenceP;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final long a(S8.g gVar, InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        AbstractC6492s.i(gVar, "<this>");
        interfaceC3540l.U(1935730346);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1935730346, i10, -1, "com.ui.wifiman.ui.domain.color (WifiExperienceExtensions.kt:50)");
        }
        if (gVar instanceof g.b) {
            interfaceC3540l.U(1612210079);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            interfaceC3540l.J();
        } else if (gVar instanceof g.c) {
            interfaceC3540l.U(1612212063);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().e().f();
            interfaceC3540l.J();
        } else {
            if (!(gVar instanceof g.d)) {
                interfaceC3540l.U(1612207759);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(1612214015);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().l().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }

    public static final s9.d b(S8.g gVar, boolean z10) {
        AbstractC6492s.i(gVar, "<this>");
        return new d.a(String.valueOf(gVar.a()), new a(gVar, z10));
    }
}
