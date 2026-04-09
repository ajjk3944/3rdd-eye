package Te;

import L0.C3174d;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.X0;
import Zg.AbstractC3689v;
import android.content.Context;
import b8.AbstractC4075b;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6839p;
import s9.d;
import sa.AbstractC7930a;
import z.AbstractC8696t;
import z.C8680c;
import z.InterfaceC8675A;

/* loaded from: classes4.dex */
public abstract class U {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f21760a;

        /* renamed from: Te.U$a$a, reason: collision with other inner class name */
        static final class C0802a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S f21761a;

            C0802a(S s10) {
                this.f21761a = s10;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.CharSequence a(android.content.Context r4, T.InterfaceC3540l r5, int r6) {
                /*
                    r3 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC6492s.i(r4, r0)
                    r0 = -889146586(0xffffffffcb00b326, float:-8434470.0)
                    r5.U(r0)
                    boolean r1 = T.AbstractC3546o.H()
                    if (r1 == 0) goto L17
                    r1 = -1
                    java.lang.String r2 = "com.ui.wifiman.ui.signal.components.SignalMapperChartLatencyOverlay.<anonymous>.<anonymous> (SignalChartLatencyStatsOverlay.kt:54)"
                    T.AbstractC3546o.Q(r0, r6, r1, r2)
                L17:
                    int r6 = m8.AbstractC6780c.f53625z2
                    java.lang.String r6 = r4.getString(r6)
                    java.lang.String r0 = "getString(...)"
                    kotlin.jvm.internal.AbstractC6492s.h(r6, r0)
                    Te.S r1 = r3.f21761a
                    b8.d r1 = r1.b()
                    if (r1 == 0) goto L41
                    int r1 = r1.b()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.String r1 = " %"
                    r2.append(r1)
                    java.lang.String r1 = r2.toString()
                    if (r1 != 0) goto L4a
                L41:
                    int r1 = m8.AbstractC6780c.f53627z4
                    java.lang.String r1 = r4.getString(r1)
                    kotlin.jvm.internal.AbstractC6492s.h(r1, r0)
                L4a:
                    java.lang.Object[] r4 = new java.lang.Object[]{r1}
                    r0 = 1
                    java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
                    java.lang.String r4 = java.lang.String.format(r6, r4)
                    java.lang.String r6 = "format(...)"
                    kotlin.jvm.internal.AbstractC6492s.h(r4, r6)
                    boolean r6 = T.AbstractC3546o.H()
                    if (r6 == 0) goto L65
                    T.AbstractC3546o.P()
                L65:
                    r5.J()
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: Te.U.a.C0802a.a(android.content.Context, T.l, int):java.lang.CharSequence");
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S f21762a;

            b(S s10) {
                this.f21762a = s10;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-1156423126);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1156423126, i10, -1, "com.ui.wifiman.ui.signal.components.SignalMapperChartLatencyOverlay.<anonymous>.<anonymous> (SignalChartLatencyStatsOverlay.kt:65)");
                }
                String string = context.getString(AbstractC6780c.f53569r2);
                AbstractC6492s.h(string, "getString(...)");
                AbstractC4075b abstractC4075bA = this.f21762a.a();
                s9.d dVarC = abstractC4075bA != null ? Ne.d.c(abstractC4075bA, false) : null;
                CharSequence charSequenceA = dVarC != null ? dVarC.a(context, interfaceC3540l, i10 & 14) : null;
                if (charSequenceA == null) {
                    charSequenceA = context.getString(AbstractC6780c.f53627z4);
                    AbstractC6492s.h(charSequenceA, "getString(...)");
                }
                String str = String.format(string, Arrays.copyOf(new Object[]{charSequenceA}, 1));
                AbstractC6492s.h(str, "format(...)");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return str;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        a(S s10) {
            this.f21760a = s10;
        }

        public final void a(InterfaceC8675A FlowRow, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1495422203, i10, -1, "com.ui.wifiman.ui.signal.components.SignalMapperChartLatencyOverlay.<anonymous> (SignalChartLatencyStatsOverlay.kt:52)");
            }
            b8.d dVarB = this.f21760a.b();
            C3174d c3174dA = AbstractC7930a.a(new d.a(String.valueOf(dVarB != null ? Integer.valueOf(dVarB.b()) : null), new C0802a(this.f21760a)), interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.c(c3174dA, null, c6562a.a(interfaceC3540l, i11).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().f(), interfaceC3540l, 0, 0, 131066);
            AbstractC4075b abstractC4075bA = this.f21760a.a();
            a1.c(AbstractC7930a.a(new d.a(String.valueOf(abstractC4075bA != null ? Integer.valueOf(abstractC4075bA.b()) : null), new b(this.f21760a)), interfaceC3540l, 0), null, c6562a.a(interfaceC3540l, i11).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().f(), interfaceC3540l, 0, 0, 131066);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8675A) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final S model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(401448138);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(401448138, i11, -1, "com.ui.wifiman.ui.signal.components.SignalMapperChartLatencyOverlay (SignalChartLatencyStatsOverlay.kt:36)");
            }
            AbstractC6713l0.a aVar = AbstractC6713l0.f52928b;
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarB = androidx.compose.foundation.b.b(modifier, AbstractC6713l0.a.i(aVar, AbstractC3689v.o(C6733v0.g(C6733v0.k(c6562a.a(interfaceC3540lR, i12).e().b(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(c6562a.a(interfaceC3540lR, i12).e().b(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
            float f10 = 8;
            float f11 = 4;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(eVarB, Y0.h.j(f10), Y0.h.j(f11));
            C8680c c8680c = C8680c.f66832a;
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC8696t.a(eVarJ, c8680c.n(Y0.h.j(f10)), c8680c.n(Y0.h.j(f11)), 0, 0, null, b0.c.e(-1495422203, true, new a(model), interfaceC3540lR, 54), interfaceC3540l2, 1573296, 56);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.T
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return U.c(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, S s10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, s10, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
