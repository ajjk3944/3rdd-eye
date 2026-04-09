package Te;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.graphics.RectF;
import d6.InterfaceC5303a;
import e6.InterfaceC5422a;
import k6.C6396c;
import k6.C6397d;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import o6.C7090a;
import o6.C7093d;
import o6.C7094e;
import t6.C8034b;
import t6.EnumC8033a;
import t6.EnumC8035c;

/* loaded from: classes4.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f21763a = new V();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f21764a;

        /* renamed from: b, reason: collision with root package name */
        private final long f21765b;

        /* renamed from: c, reason: collision with root package name */
        private final C7093d f21766c;

        /* renamed from: d, reason: collision with root package name */
        private final C7093d f21767d;

        /* renamed from: e, reason: collision with root package name */
        private final C7093d f21768e;

        /* renamed from: f, reason: collision with root package name */
        private final C7093d f21769f;

        /* renamed from: g, reason: collision with root package name */
        private final C8034b f21770g;

        public /* synthetic */ a(long j10, long j11, C7093d c7093d, C7093d c7093d2, C7093d c7093d3, C7093d c7093d4, C8034b c8034b, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, c7093d, c7093d2, c7093d3, c7093d4, c8034b);
        }

        public final C7093d a() {
            return this.f21767d;
        }

        public final C8034b b() {
            return this.f21770g;
        }

        public final C7093d c() {
            return this.f21769f;
        }

        public final C7093d d() {
            return this.f21768e;
        }

        public final C7093d e() {
            return this.f21766c;
        }

        private a(long j10, long j11, C7093d line, C7093d dot, C7093d labelBackgroundArrow, C7093d labelBackground, C8034b label) {
            AbstractC6492s.i(line, "line");
            AbstractC6492s.i(dot, "dot");
            AbstractC6492s.i(labelBackgroundArrow, "labelBackgroundArrow");
            AbstractC6492s.i(labelBackground, "labelBackground");
            AbstractC6492s.i(label, "label");
            this.f21764a = j10;
            this.f21765b = j11;
            this.f21766c = line;
            this.f21767d = dot;
            this.f21768e = labelBackgroundArrow;
            this.f21769f = labelBackground;
            this.f21770g = label;
        }

        public /* synthetic */ a(long j10, long j11, C7093d c7093d, C7093d c7093d2, C7093d c7093d3, C7093d c7093d4, C8034b c8034b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            C8034b c8034bA;
            C7093d c7093d5 = (i10 & 4) != 0 ? new C7093d(new C7090a(C7094e.f55502a.a(), 5.0f, 5.0f, null, 8, null), AbstractC6737x0.j(j11), null, null, 0.0f, 0, 60, null) : c7093d;
            C7093d c7093d6 = (i10 & 8) != 0 ? new C7093d(C7094e.f55502a.c(100), AbstractC6737x0.j(j11), null, null, 0.0f, 0, 60, null) : c7093d2;
            C7093d f10 = (i10 & 16) != 0 ? new F(C7094e.f55502a.c(12), 45.0f, AbstractC6737x0.j(j11)) : c7093d3;
            C7093d c7093d7 = (i10 & 32) != 0 ? new C7093d(C7094e.f55502a.c(12), AbstractC6737x0.j(j11), null, null, 0.0f, 0, 60, null) : c7093d4;
            if ((i10 & 64) != 0) {
                C8034b.a aVar = new C8034b.a();
                aVar.c(AbstractC6737x0.j(j10));
                aVar.i(12.0f);
                c8034bA = aVar.a();
            } else {
                c8034bA = c8034b;
            }
            this(j10, j11, c7093d5, c7093d6, f10, c7093d7, c8034bA, null);
        }
    }

    public static final class b implements InterfaceC5303a {

        /* renamed from: a, reason: collision with root package name */
        private final float f21771a;

        /* renamed from: b, reason: collision with root package name */
        private final float f21772b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21773c;

        /* renamed from: d, reason: collision with root package name */
        private final a f21774d;

        /* renamed from: e, reason: collision with root package name */
        public RectF f21775e;

        public b(float f10, float f11, String str, a components) {
            AbstractC6492s.i(components, "components");
            this.f21771a = f10;
            this.f21772b = f11;
            this.f21773c = str;
            this.f21774d = components;
        }

        @Override // d6.InterfaceC5303a
        public void a(InterfaceC5422a interfaceC5422a, RectF rectF) {
            InterfaceC5303a.C1695a.a(this, interfaceC5422a, rectF);
        }

        @Override // d6.InterfaceC5303a
        public void b(InterfaceC5422a context, RectF bounds) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(bounds, "bounds");
            C6397d c6397dB = C6396c.b(context.c(), null, 1, null);
            float fE = ((this.f21771a - c6397dB.e()) / (c6397dB.b() - c6397dB.e())) * bounds.width();
            float fHeight = (bounds.height() - (((this.f21772b - c6397dB.c()) / (c6397dB.a() - c6397dB.c())) * bounds.height())) + context.m(9.0f);
            this.f21774d.e().b(context, fE - context.b(0.5f), bounds.top, fE + context.b(0.5f), bounds.bottom);
            this.f21774d.a().b(context, fE - context.b(3.0f), fHeight - context.b(3.0f), fE + context.b(3.0f), fHeight + context.b(3.0f));
            if (this.f21773c != null) {
                d(C8034b.m(this.f21774d.b(), context, this.f21773c, 0, 0, null, false, 0.0f, 124, null));
                float fSqrt = (float) Math.sqrt(((float) Math.pow((c().height() * 0.5f) / 2.0f, 2)) * 2);
                this.f21774d.d().b(context, fE + context.b(7.0f), fHeight - ((c().height() / 2.0f) * 0.5f), context.b(7.0f) + fE + (c().height() * 0.5f), fHeight + ((c().height() / 2.0f) * 0.5f));
                float f10 = fSqrt / 2.0f;
                this.f21774d.c().b(context, context.b(7.0f) + fE + f10, (fHeight - (c().height() / 2.0f)) - context.b(1.0f), context.b(7.0f) + fE + f10 + c().width() + context.b(8.0f), (c().height() / 2.0f) + fHeight + context.b(1.0f));
                C8034b.d(this.f21774d.b(), context, this.f21773c, fE + context.b(11.0f) + f10, fHeight, EnumC8033a.End, EnumC8035c.Center, 0, 0, 0.0f, 448, null);
            }
        }

        public final RectF c() {
            RectF rectF = this.f21775e;
            if (rectF != null) {
                return rectF;
            }
            AbstractC6492s.v("textBounds");
            return null;
        }

        public final void d(RectF rectF) {
            AbstractC6492s.i(rectF, "<set-?>");
            this.f21775e = rectF;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f21771a, bVar.f21771a) == 0 && Float.compare(this.f21772b, bVar.f21772b) == 0 && AbstractC6492s.d(this.f21773c, bVar.f21773c) && AbstractC6492s.d(this.f21774d, bVar.f21774d);
        }

        public int hashCode() {
            int iHashCode = ((Float.hashCode(this.f21771a) * 31) + Float.hashCode(this.f21772b)) * 31;
            String str = this.f21773c;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f21774d.hashCode();
        }

        public String toString() {
            return "Marker(x=" + this.f21771a + ", y=" + this.f21772b + ", text=" + this.f21773c + ", components=" + this.f21774d + ")";
        }
    }

    private V() {
    }

    public final a a(long j10, long j11, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1489375424);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1489375424, i10, -1, "com.ui.wifiman.ui.signal.components.SignalChartMarker.rememberSignalMapperChartMarkerComponents (SignalChartMarker.kt:62)");
        }
        interfaceC3540l.U(1139435879);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.j(j10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.j(j11)) || (i10 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new a(j10, j11, null, null, null, null, null, 124, null);
            interfaceC3540l.K(objF);
        }
        a aVar = (a) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return aVar;
    }
}
