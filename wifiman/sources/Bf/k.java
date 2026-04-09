package Bf;

import Bf.c;
import S8.e;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import Y5.c;
import Yg.J;
import Zg.AbstractC3689v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h6.C5953a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k6.InterfaceC6394a;
import k6.InterfaceC6395b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.AbstractC6737x0;
import m0.C6733v0;
import m8.AbstractC6779b;
import ma.AbstractC6784a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o6.C7091b;
import sh.C7974i;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public abstract class k {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1744a;

        static {
            int[] iArr = new int[S8.c.values().length];
            try {
                iArr[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1744a = iArr;
        }
    }

    public static final class b implements z6.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.c f1745a;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1746a;

            static {
                int[] iArr = new int[S8.c.values().length];
                try {
                    iArr[S8.c.GHZ_2_4.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[S8.c.GHZ_5.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[S8.c.GHZ_6.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f1746a = iArr;
            }
        }

        b(S8.c cVar) {
            this.f1745a = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
        @Override // z6.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.CharSequence a(float r3, k6.InterfaceC6395b r4) {
            /*
                r2 = this;
                java.lang.String r0 = "chartValues"
                kotlin.jvm.internal.AbstractC6492s.i(r4, r0)
                S8.c r4 = r2.f1745a
                int[] r0 = Bf.k.b.a.f1746a
                int r4 = r4.ordinal()
                r4 = r0[r4]
                r0 = 1
                r1 = 0
                if (r4 == r0) goto La9
                r0 = 2
                if (r4 == r0) goto L65
                r0 = 3
                if (r4 != r0) goto L5f
                r4 = 1169823744(0x45ba1800, float:5955.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L21
                goto L58
            L21:
                r4 = 1170151424(0x45bf1800, float:6115.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L29
                goto L58
            L29:
                r4 = 1170479104(0x45c41800, float:6275.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L31
                goto L58
            L31:
                r4 = 1170806784(0x45c91800, float:6435.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L39
                goto L58
            L39:
                r4 = 1171134464(0x45ce1800, float:6595.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L41
                goto L58
            L41:
                r4 = 1171462144(0x45d31800, float:6755.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L49
                goto L58
            L49:
                r4 = 1171789824(0x45d81800, float:6915.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L51
                goto L58
            L51:
                r4 = 1172117504(0x45dd1800, float:7075.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L5d
            L58:
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto Lad
            L5d:
                r3 = r1
                goto Lad
            L5f:
                kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
                r3.<init>()
                throw r3
            L65:
                r4 = 1168216064(0x45a19000, float:5170.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L6d
                goto La4
            L6d:
                r4 = 1168379904(0x45a41000, float:5250.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L75
                goto La4
            L75:
                r4 = 1168564224(0x45a6e000, float:5340.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L7d
                goto La4
            L7d:
                r4 = 1168850944(0x45ab4000, float:5480.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L85
                goto La4
            L85:
                r4 = 1169035264(0x45ae1000, float:5570.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L8d
                goto La4
            L8d:
                r4 = 1169281024(0x45b1d000, float:5690.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L95
                goto La4
            L95:
                r4 = 1169475584(0x45b4c800, float:5785.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L9d
                goto La4
            L9d:
                r4 = 1169598464(0x45b6a800, float:5845.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 != 0) goto L5d
            La4:
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto Lad
            La9:
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
            Lad:
                if (r3 == 0) goto Lca
                float r3 = r3.floatValue()
                com.ubnt.usurvey.wifi.WifiChannelUtils r4 = com.ubnt.usurvey.wifi.WifiChannelUtils.f41035a
                int r3 = oh.AbstractC7137b.e(r3)
                java.lang.Integer r3 = r4.c(r3)
                if (r3 == 0) goto Lc7
                int r3 = r3.intValue()
                java.lang.String r1 = vf.AbstractC8227g.a(r3)
            Lc7:
                if (r1 == 0) goto Lca
                goto Lcc
            Lca:
                java.lang.String r1 = ""
            Lcc:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Bf.k.b.a(float, k6.b):java.lang.CharSequence");
        }
    }

    public static final class c implements z6.c {

        /* renamed from: a, reason: collision with root package name */
        private final String f1747a = "%.0f";

        c() {
        }

        @Override // z6.c
        public CharSequence a(float f10, InterfaceC6395b chartValues) {
            AbstractC6492s.i(chartValues, "chartValues");
            String str = String.format(this.f1747a, Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1));
            AbstractC6492s.h(str, "format(...)");
            return str;
        }
    }

    public static final void e(final androidx.compose.ui.e modifier, final Bf.b model, InterfaceC3540l interfaceC3540l, final int i10) throws Resources.NotFoundException {
        int i11;
        int i12;
        Typeface typeface;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-317032242);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-317032242, i13, -1, "com.ui.wifiman.ui.wifi.component.chart.WifiSpectrumChart (WifiSpectrumChart.kt:89)");
            }
            Bf.b bVar = (Bf.b) o1.b(e.b(model, interfaceC3540lR, (i13 >> 3) & 14), null, interfaceC3540lR, 0, 1).getValue();
            f fVarN = n(interfaceC3540lR, 0);
            C7091b c7091bA = P5.a.a(fVarN.a(), Y0.h.j(1), E.h.a(0.5f), null, null, 0.0f, 0L, interfaceC3540lR, 48, 120);
            if (Build.VERSION.SDK_INT > 26) {
                interfaceC3540lR.U(23441074);
                Typeface font = ((Context) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.g())).getResources().getFont(AbstractC6779b.f53268a);
                interfaceC3540lR.J();
                typeface = font;
                i12 = 0;
            } else {
                interfaceC3540lR.U(23523720);
                i12 = 0;
                Typeface typefaceH = W5.b.a(interfaceC3540lR, 0).a().h();
                interfaceC3540lR.J();
                typeface = typefaceH;
            }
            AbstractC6492s.f(typeface);
            c.b.C0938b c0938b = c.b.C0938b.f24605a;
            List listR = r(interfaceC3540lR, i12);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            Typeface typeface2 = typeface;
            Ie.d dVar = new Ie.d(c0938b, listR, m(interfaceC3540lR, 0), L5.a.a(c6562a.a(interfaceC3540lR, i14).f().c(), 0L, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, typeface2, null, interfaceC3540lR, 0, 0, 1534), c7091bA, null, null, 64, null);
            Ie.c cVar = new Ie.c(o(bVar.c(), interfaceC3540lR, 0), l(bVar.c(), interfaceC3540lR, 0), L5.a.a(c6562a.a(interfaceC3540lR, i14).f().c(), 0L, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, typeface2, null, interfaceC3540lR, 0, 0, 1534), c7091bA, c7091bA);
            interfaceC3540lR.U(416427544);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = new b6.d(2.0f);
                interfaceC3540lR.K(objF);
            }
            b6.d dVar2 = (b6.d) objF;
            interfaceC3540lR.J();
            InterfaceC8780j interfaceC8780jD0 = AbstractC3689v.d0(bVar.d());
            interfaceC3540lR.U(416434527);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new InterfaceC6835l() { // from class: Bf.g
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(k.f((c) obj));
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            InterfaceC8780j interfaceC8780jC = AbstractC8783m.C(interfaceC8780jD0, (InterfaceC6835l) objF2);
            interfaceC3540l2 = interfaceC3540lR;
            M5.a.a(N5.a.a(j(interfaceC8780jC, dVar2, fVarN.b(), interfaceC3540lR, 0), 0.0f, C5953a.b.Start, null, null, k(bVar.c(), interfaceC3540lR, 0), null, interfaceC3540lR, 384, 90), h(bVar.c(), interfaceC8780jC, interfaceC3540lR, 0), modifier, dVar, null, null, cVar, null, null, null, O5.b.a(false, null, null, null, interfaceC3540lR, 6, 14), false, null, null, null, null, interfaceC3540l2, (i13 << 6) & 896, 48, 62384);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Bf.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return k.g(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Bf.c it) {
        AbstractC6492s.i(it, "it");
        return it.f() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, Bf.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        e(eVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    private static final x6.b h(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(734668411);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(734668411, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.chartEntryModel (WifiSpectrumChart.kt:332)");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC8780j.iterator();
        while (it.hasNext()) {
            Bf.c cVar2 = (Bf.c) it.next();
            if (cVar2.f() != null) {
                ArrayList arrayList2 = new ArrayList();
                for (c.a aVar : cVar2.c()) {
                    float f10 = 2;
                    arrayList2.add(new x6.c(aVar.a() - (aVar.b() / f10), -95.0f));
                    arrayList2.add(new x6.c(aVar.a() - ((aVar.b() / f10) * 0.8f), Math.min(-30.0f, cVar2.f().floatValue())));
                    arrayList2.add(new x6.c(aVar.a() + ((aVar.b() / f10) * 0.8f), Math.min(-30.0f, cVar2.f().floatValue())));
                    arrayList2.add(new x6.c(aVar.a() + (aVar.b() / f10), -95.0f));
                }
                arrayList.add(arrayList2);
            }
        }
        C7974i c7974iS = s(cVar);
        Bf.a aVar2 = new Bf.a(arrayList, c7974iS.i(), c7974iS.j(), -95.0f, -30.0f, -95.0f, -95.0f, 1.0f, cVar.hashCode());
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return aVar2;
    }

    private static final long i(Bf.c cVar, InterfaceC3540l interfaceC3540l, int i10) {
        long jD;
        interfaceC3540l.U(-1826034638);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1826034638, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.color (WifiSpectrumChart.kt:146)");
        }
        if (cVar.g() != null && cVar.g().booleanValue()) {
            interfaceC3540l.U(85107951);
            jD = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
            interfaceC3540l.J();
        } else if (cVar.g() == null || cVar.g().booleanValue()) {
            interfaceC3540l.U(85111186);
            interfaceC3540l.J();
            jD = cVar.d();
        } else {
            interfaceC3540l.U(85110575);
            jD = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jD;
    }

    private static final List j(InterfaceC8780j interfaceC8780j, C5953a.C1790a.InterfaceC1791a interfaceC1791a, float f10, InterfaceC3540l interfaceC3540l, int i10) {
        List listA;
        interfaceC3540l.U(1236293128);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1236293128, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.lineSpecs (WifiSpectrumChart.kt:280)");
        }
        if (AbstractC8783m.x(interfaceC8780j) == 0) {
            C6733v0.a aVar = C6733v0.f52951b;
            int iJ = AbstractC6737x0.j(aVar.d());
            AbstractC6713l0.a aVar2 = AbstractC6713l0.f52928b;
            long jD = aVar.d();
            listA = AbstractC3689v.e(new C5953a.C1790a(iJ, 0.0f, new R5.a(AbstractC6713l0.a.i(aVar2, AbstractC3689v.o(C6733v0.g(jD), C6733v0.g(jD)), 0.0f, 0.0f, 0, 14, null)), null, null, 0.0f, null, null, null, 0.0f, interfaceC1791a, 1018, null));
        } else {
            List listC = AbstractC3689v.c();
            interfaceC3540l.U(1816428845);
            Iterator it = interfaceC8780j.iterator();
            while (it.hasNext()) {
                long jI = i((Bf.c) it.next(), interfaceC3540l, 0);
                int iJ2 = AbstractC6737x0.j(jI);
                AbstractC6713l0.a aVar3 = AbstractC6713l0.f52928b;
                long jK = C6733v0.k(jI, f10, 0.0f, 0.0f, 0.0f, 14, null);
                listC.add(new C5953a.C1790a(iJ2, 0.0f, new R5.a(AbstractC6713l0.a.i(aVar3, AbstractC3689v.o(C6733v0.g(jK), C6733v0.g(jK)), 0.0f, 0.0f, 0, 14, null)), null, null, 0.0f, null, null, null, 0.0f, interfaceC1791a, 1018, null));
            }
            interfaceC3540l.J();
            listA = AbstractC3689v.a(listC);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return listA;
    }

    private static final InterfaceC6394a k(S8.c cVar, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(2055642557);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(2055642557, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.rememberChartAxisValuesOverrider (WifiSpectrumChart.kt:265)");
        }
        interfaceC3540l.U(1473223973);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(cVar)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            C7974i c7974iS = s(cVar);
            objF = InterfaceC6394a.f51233a.a(Float.valueOf(c7974iS.i()), Float.valueOf(c7974iS.j()), Float.valueOf(-95.0f), Float.valueOf(-30.0f));
            interfaceC3540l.K(objF);
        }
        InterfaceC6394a interfaceC6394a = (InterfaceC6394a) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return interfaceC6394a;
    }

    private static final z6.c l(S8.c cVar, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1205108127);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1205108127, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.rememberFrequencyValueFormatter (WifiSpectrumChart.kt:182)");
        }
        interfaceC3540l.U(1507043271);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(cVar)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new b(cVar);
            interfaceC3540l.K(objF);
        }
        b bVar = (b) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }

    private static final z6.c m(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(659986739);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(659986739, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.rememberSignalValueFormatter (WifiSpectrumChart.kt:173)");
        }
        interfaceC3540l.U(-779936472);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new c();
            interfaceC3540l.K(objF);
        }
        c cVar = (c) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return cVar;
    }

    private static final f n(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-565667838);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-565667838, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.rememberUiTabLayoutColors (WifiSpectrumChart.kt:153)");
        }
        AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b);
        interfaceC3540l.U(2013119092);
        boolean zT = interfaceC3540l.T(abstractC6784aA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new f(abstractC6784aA.a().g().f(), abstractC6784aA.f().c(), 0.15f, null);
            interfaceC3540l.K(objF);
        }
        f fVar = (f) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List o(final S8.c r3, T.InterfaceC3540l r4, int r5) {
        /*
            r0 = -1444994537(0xffffffffa9df2217, float:-9.909103E-14)
            r4.U(r0)
            boolean r1 = T.AbstractC3546o.H()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "com.ui.wifiman.ui.wifi.component.chart.rememberXAxisLabels (WifiSpectrumChart.kt:223)"
            T.AbstractC3546o.Q(r0, r5, r1, r2)
        L12:
            r0 = 827856201(0x31581549, float:3.1444236E-9)
            r4.U(r0)
            r0 = r5 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto L25
            boolean r0 = r4.T(r3)
            if (r0 != 0) goto L29
        L25:
            r5 = r5 & 6
            if (r5 != r1) goto L2b
        L29:
            r5 = 1
            goto L2c
        L2b:
            r5 = 0
        L2c:
            java.lang.Object r0 = r4.f()
            if (r5 != 0) goto L3a
            T.l$a r5 = T.InterfaceC3540l.f21100a
            java.lang.Object r5 = r5.a()
            if (r0 != r5) goto L8c
        L3a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r5 = r3.getChannels()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            zi.j r5 = Zg.AbstractC3689v.d0(r5)
            Bf.i r1 = new Bf.i
            r1.<init>()
            zi.j r5 = zi.AbstractC8783m.C(r5, r1)
            Bf.j r1 = new Bf.j
            r1.<init>()
            zi.j r5 = zi.AbstractC8783m.N(r5, r1)
            zi.j r5 = zi.AbstractC8783m.y(r5)
            java.util.Iterator r5 = r5.iterator()
        L63:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r5.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.add(r1)
            goto L63
        L7b:
            S8.c r5 = S8.c.GHZ_2_4
            if (r3 != r5) goto L89
            r3 = 1159413760(0x451b4000, float:2484.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.add(r3)
        L89:
            r4.K(r0)
        L8c:
            java.util.List r0 = (java.util.List) r0
            r4.J()
            boolean r3 = T.AbstractC3546o.H()
            if (r3 == 0) goto L9a
            T.AbstractC3546o.P()
        L9a:
            r4.J()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.k.o(S8.c, T.l, int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float p(S8.e it) {
        int iD;
        AbstractC6492s.i(it, "it");
        e.b bVarE = it.e();
        if (bVarE instanceof e.b.C0729b) {
            iD = ((e.b.C0729b) bVarE).a();
        } else {
            if (!(bVarE instanceof e.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            iD = ((e.b.a) bVarE).d();
        }
        return iD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(S8.c cVar, S8.e it) {
        AbstractC6492s.i(it, "it");
        int i10 = a.f1744a[cVar.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return it.e().a() < 5900;
        }
        if (i10 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final List r(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-267372244);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-267372244, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.rememberYAxisLabels (WifiSpectrumChart.kt:218)");
        }
        interfaceC3540l.U(534447697);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = AbstractC3689v.o(Float.valueOf(-40.0f), Float.valueOf(-50.0f), Float.valueOf(-60.0f), Float.valueOf(-70.0f), Float.valueOf(-80.0f), Float.valueOf(-90.0f));
            interfaceC3540l.K(objF);
        }
        List list = (List) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return list;
    }

    private static final C7974i s(S8.c cVar) {
        int i10 = a.f1744a[cVar.ordinal()];
        if (i10 == 1) {
            return new C7974i(2401, 2495);
        }
        if (i10 == 2) {
            return new C7974i(5150, 5895);
        }
        if (i10 == 3) {
            return new C7974i(5945, 7125);
        }
        throw new NoWhenBranchMatchedException();
    }
}
