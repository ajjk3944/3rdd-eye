package Ne;

import L0.C3174d;
import L0.D;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import b8.AbstractC4075b;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import ma.AbstractC6784a;
import mh.q;
import s9.d;

/* loaded from: classes4.dex */
public abstract class d {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4075b f16405a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16406b;

        a(AbstractC4075b abstractC4075b, boolean z10) {
            this.f16405a = abstractC4075b;
            this.f16406b = z10;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(609194285);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(609194285, i10, -1, "com.ui.wifiman.ui.domain.text.<anonymous> (LatencyExtensions.kt:15)");
            }
            String string = context.getString(AbstractC6780c.f53599v4);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f16405a.b())}, 1));
            AbstractC6492s.h(str, "format(...)");
            CharSequence charSequenceP = str;
            if (this.f16406b) {
                AbstractC4075b abstractC4075b = this.f16405a;
                C3174d.a aVar = new C3174d.a(0, 1, null);
                int iN = aVar.n(new D(d.a(abstractC4075b, interfaceC3540l, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
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

    public static final long a(AbstractC4075b abstractC4075b, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(abstractC4075b, "<this>");
        interfaceC3540l.U(-1130237150);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1130237150, i10, -1, "com.ui.wifiman.ui.domain.color (LatencyExtensions.kt:38)");
        }
        long jB = b(abstractC4075b, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jB;
    }

    public static final long b(AbstractC4075b abstractC4075b, AbstractC6784a palette) {
        AbstractC6492s.i(abstractC4075b, "<this>");
        AbstractC6492s.i(palette, "palette");
        if (abstractC4075b instanceof AbstractC4075b.c) {
            return palette.a().d().f();
        }
        if (abstractC4075b instanceof AbstractC4075b.e) {
            return palette.a().e().f();
        }
        if (abstractC4075b instanceof AbstractC4075b.d) {
            return palette.a().h().f();
        }
        if (abstractC4075b instanceof AbstractC4075b.a) {
            return palette.a().l().f();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final s9.d c(AbstractC4075b abstractC4075b, boolean z10) {
        AbstractC6492s.i(abstractC4075b, "<this>");
        return new d.a(String.valueOf(abstractC4075b.b()), new a(abstractC4075b, z10));
    }
}
