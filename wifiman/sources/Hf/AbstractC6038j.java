package hf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import ff.AbstractC5822c;
import ff.EnumC5820a;
import h6.C5953a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6713l0;
import m0.AbstractC6737x0;
import m0.C6733v0;
import mh.InterfaceC6839p;
import x6.b;

/* renamed from: hf.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6038j {

    /* renamed from: hf.j$a */
    public static final class a implements x6.b {

        /* renamed from: a, reason: collision with root package name */
        private final List f48670a;

        /* renamed from: b, reason: collision with root package name */
        private final float f48671b;

        /* renamed from: c, reason: collision with root package name */
        private final float f48672c;

        /* renamed from: d, reason: collision with root package name */
        private final float f48673d;

        /* renamed from: e, reason: collision with root package name */
        private final float f48674e;

        /* renamed from: f, reason: collision with root package name */
        private final float f48675f;

        /* renamed from: g, reason: collision with root package name */
        private final float f48676g;

        /* renamed from: h, reason: collision with root package name */
        private final float f48677h;

        a(C6036h[] c6036hArr) {
            ArrayList arrayList = new ArrayList(c6036hArr.length);
            for (C6036h c6036h : c6036hArr) {
                float[] fArrA = c6036h.a();
                ArrayList arrayList2 = new ArrayList(fArrA.length);
                int length = fArrA.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    arrayList2.add(new x6.c(i11, fArrA[i10]));
                    i10++;
                    i11++;
                }
                arrayList.add(arrayList2);
            }
            this.f48670a = arrayList;
            this.f48671b = 1.0f;
            if (c6036hArr.length == 0) {
                throw new NoSuchElementException();
            }
            float f10 = 2;
            float length2 = c6036hArr[0].a().length - f10;
            int iG0 = AbstractC3682n.g0(c6036hArr);
            int i12 = 1;
            if (1 <= iG0) {
                while (true) {
                    length2 = Math.min(length2, c6036hArr[i12].a().length - f10);
                    if (i12 == iG0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f48672c = length2;
            this.f48673d = 0.01f;
            this.f48674e = 1.0f;
            this.f48676g = 1.0f;
            this.f48677h = 1.0f;
        }

        @Override // x6.b
        public float a() {
            return this.f48674e;
        }

        @Override // x6.b
        public float b() {
            return this.f48672c;
        }

        @Override // x6.b
        public float c() {
            return this.f48673d;
        }

        @Override // x6.b
        public float d() {
            return this.f48677h;
        }

        @Override // x6.b
        public float e() {
            return this.f48671b;
        }

        @Override // x6.b
        public List f() {
            return this.f48670a;
        }

        @Override // x6.b
        public float g() {
            return this.f48676g;
        }

        @Override // x6.b
        public int getId() {
            return b.a.a(this);
        }

        @Override // x6.b
        public float h() {
            return this.f48675f;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final C6036h[] model, InterfaceC3540l interfaceC3540l, final int i10) {
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-898620024);
        int i11 = (i10 & 6) == 0 ? (interfaceC3540lR.T(modifier) ? 4 : 2) | i10 : i10;
        interfaceC3540lR.s(741330545, Integer.valueOf(model.length));
        for (C6036h c6036h : model) {
            i11 |= interfaceC3540lR.T(c6036h) ? 32 : 0;
        }
        interfaceC3540lR.N();
        if ((i11 & 112) == 0) {
            i11 |= 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-898620024, i11, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestChart (SpeedtestChart.kt:56)");
            }
            interfaceC3540lR.U(741333984);
            ArrayList arrayList = new ArrayList(model.length);
            for (C6036h c6036h2 : model) {
                long jA = AbstractC5822c.a(c6036h2.b(), interfaceC3540lR, 0);
                arrayList.add(new C5953a.C1790a(AbstractC6737x0.j(jA), 1.0f, new R5.a(AbstractC6713l0.a.i(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(C6733v0.k(jA, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(jA, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, null)), null, null, 0.0f, null, null, null, 0.0f, null, 2040, null));
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            M5.a.a(N5.a.a(arrayList, 0.0f, C5953a.b.Start, null, null, null, null, interfaceC3540lR, 384, 122), d(model, interfaceC3540lR, (i11 >> 3) & 14), modifier, null, null, null, null, null, null, null, O5.b.a(false, null, null, null, interfaceC3540lR, 6, 14), false, null, null, null, null, interfaceC3540l2, (i11 << 6) & 896, 48, 62456);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6038j.c(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, C6036h[] c6036hArr, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, (C6036h[]) Arrays.copyOf(c6036hArr, c6036hArr.length), interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final x6.b d(C6036h[] c6036hArr, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(139059416);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(139059416, i10, -1, "com.ui.wifiman.ui.speedtest.component.chartEntryModel (SpeedtestChart.kt:87)");
        }
        a aVar = new a(c6036hArr);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return aVar;
    }

    public static final C6036h e(EnumC5820a enumC5820a, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(1302243195);
        if ((i11 & 1) != 0) {
            enumC5820a = EnumC5820a.DOWN;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1302243195, i10, -1, "com.ui.wifiman.ui.speedtest.component.previewSpeedtestChartModel (SpeedtestChart.kt:109)");
        }
        C6036h c6036h = new C6036h(enumC5820a, new float[]{0.25f, 0.35f, 0.45f, 0.85f, 0.75f, 0.7f, 0.7f, 0.7f, 0.6f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f});
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c6036h;
    }
}
