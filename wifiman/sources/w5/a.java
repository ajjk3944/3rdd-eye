package W5;

import Y0.h;
import Y0.v;
import Y0.w;
import Zg.AbstractC3689v;
import android.graphics.Paint;
import android.graphics.Typeface;
import c6.EnumC4226a;
import h6.C5953a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.AbstractC6737x0;
import m0.C6733v0;
import o6.C7091b;
import o6.C7093d;
import o6.C7094e;
import o6.InterfaceC7092c;
import org.conscrypt.PSKKeyManager;
import t6.C8034b;
import t6.EnumC8035c;
import z6.C8713a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final c f23630f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f23631g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C0877a f23632a;

    /* renamed from: b, reason: collision with root package name */
    private final b f23633b;

    /* renamed from: c, reason: collision with root package name */
    private final d f23634c;

    /* renamed from: d, reason: collision with root package name */
    private final e f23635d;

    /* renamed from: e, reason: collision with root package name */
    private final long f23636e;

    /* renamed from: W5.a$a, reason: collision with other inner class name */
    public static final class C0877a {

        /* renamed from: a, reason: collision with root package name */
        private final C7093d f23637a;

        /* renamed from: b, reason: collision with root package name */
        private final long f23638b;

        /* renamed from: c, reason: collision with root package name */
        private final long f23639c;

        /* renamed from: d, reason: collision with root package name */
        private final int f23640d;

        /* renamed from: e, reason: collision with root package name */
        private final float f23641e;

        /* renamed from: f, reason: collision with root package name */
        private final float f23642f;

        /* renamed from: g, reason: collision with root package name */
        private final float f23643g;

        /* renamed from: h, reason: collision with root package name */
        private final float f23644h;

        /* renamed from: i, reason: collision with root package name */
        private final float f23645i;

        /* renamed from: j, reason: collision with root package name */
        private final Typeface f23646j;

        /* renamed from: k, reason: collision with root package name */
        private final Paint.Align f23647k;

        /* renamed from: l, reason: collision with root package name */
        private final long f23648l;

        /* renamed from: m, reason: collision with root package name */
        private final float f23649m;

        /* renamed from: n, reason: collision with root package name */
        private final InterfaceC7092c f23650n;

        /* renamed from: o, reason: collision with root package name */
        private final long f23651o;

        /* renamed from: p, reason: collision with root package name */
        private final float f23652p;

        /* renamed from: q, reason: collision with root package name */
        private final InterfaceC7092c f23653q;

        /* renamed from: r, reason: collision with root package name */
        private final long f23654r;

        /* renamed from: s, reason: collision with root package name */
        private final float f23655s;

        /* renamed from: t, reason: collision with root package name */
        private final InterfaceC7092c f23656t;

        /* renamed from: u, reason: collision with root package name */
        private final float f23657u;

        /* renamed from: v, reason: collision with root package name */
        private final Z5.a f23658v;

        public /* synthetic */ C0877a(C7093d c7093d, long j10, long j11, int i10, float f10, float f11, float f12, float f13, float f14, Typeface typeface, Paint.Align align, long j12, float f15, InterfaceC7092c interfaceC7092c, long j13, float f16, InterfaceC7092c interfaceC7092c2, long j14, float f17, InterfaceC7092c interfaceC7092c3, float f18, Z5.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(c7093d, j10, j11, i10, f10, f11, f12, f13, f14, typeface, align, j12, f15, interfaceC7092c, j13, f16, interfaceC7092c2, j14, f17, interfaceC7092c3, f18, aVar);
        }

        public final C7093d a() {
            return this.f23637a;
        }

        public final long b() {
            return this.f23638b;
        }

        public final float c() {
            return this.f23644h;
        }

        public final float d() {
            return this.f23642f;
        }

        public final int e() {
            return this.f23640d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0877a)) {
                return false;
            }
            C0877a c0877a = (C0877a) obj;
            return AbstractC6492s.d(this.f23637a, c0877a.f23637a) && C6733v0.m(this.f23638b, c0877a.f23638b) && v.e(this.f23639c, c0877a.f23639c) && this.f23640d == c0877a.f23640d && h.n(this.f23641e, c0877a.f23641e) && h.n(this.f23642f, c0877a.f23642f) && h.n(this.f23643g, c0877a.f23643g) && h.n(this.f23644h, c0877a.f23644h) && Float.compare(this.f23645i, c0877a.f23645i) == 0 && AbstractC6492s.d(this.f23646j, c0877a.f23646j) && this.f23647k == c0877a.f23647k && C6733v0.m(this.f23648l, c0877a.f23648l) && h.n(this.f23649m, c0877a.f23649m) && AbstractC6492s.d(this.f23650n, c0877a.f23650n) && C6733v0.m(this.f23651o, c0877a.f23651o) && h.n(this.f23652p, c0877a.f23652p) && AbstractC6492s.d(this.f23653q, c0877a.f23653q) && C6733v0.m(this.f23654r, c0877a.f23654r) && h.n(this.f23655s, c0877a.f23655s) && AbstractC6492s.d(this.f23656t, c0877a.f23656t) && h.n(this.f23657u, c0877a.f23657u) && AbstractC6492s.d(this.f23658v, c0877a.f23658v);
        }

        public final Paint.Align f() {
            return this.f23647k;
        }

        public final long g() {
            return this.f23639c;
        }

        public final Typeface h() {
            return this.f23646j;
        }

        public int hashCode() {
            C7093d c7093d = this.f23637a;
            return ((((((((((((((((((((((((((((((((((((((((((c7093d == null ? 0 : c7093d.hashCode()) * 31) + C6733v0.s(this.f23638b)) * 31) + v.i(this.f23639c)) * 31) + Integer.hashCode(this.f23640d)) * 31) + h.p(this.f23641e)) * 31) + h.p(this.f23642f)) * 31) + h.p(this.f23643g)) * 31) + h.p(this.f23644h)) * 31) + Float.hashCode(this.f23645i)) * 31) + this.f23646j.hashCode()) * 31) + this.f23647k.hashCode()) * 31) + C6733v0.s(this.f23648l)) * 31) + h.p(this.f23649m)) * 31) + this.f23650n.hashCode()) * 31) + C6733v0.s(this.f23651o)) * 31) + h.p(this.f23652p)) * 31) + this.f23653q.hashCode()) * 31) + C6733v0.s(this.f23654r)) * 31) + h.p(this.f23655s)) * 31) + this.f23656t.hashCode()) * 31) + h.p(this.f23657u)) * 31) + this.f23658v.hashCode();
        }

        public final float i() {
            return this.f23643g;
        }

        public final float j() {
            return this.f23641e;
        }

        public String toString() {
            return "Axis(axisLabelBackground=" + this.f23637a + ", axisLabelColor=" + ((Object) C6733v0.t(this.f23638b)) + ", axisLabelTextSize=" + ((Object) v.j(this.f23639c)) + ", axisLabelLineCount=" + this.f23640d + ", axisLabelVerticalPadding=" + ((Object) h.r(this.f23641e)) + ", axisLabelHorizontalPadding=" + ((Object) h.r(this.f23642f)) + ", axisLabelVerticalMargin=" + ((Object) h.r(this.f23643g)) + ", axisLabelHorizontalMargin=" + ((Object) h.r(this.f23644h)) + ", axisLabelRotationDegrees=" + this.f23645i + ", axisLabelTypeface=" + this.f23646j + ", axisLabelTextAlign=" + this.f23647k + ", axisGuidelineColor=" + ((Object) C6733v0.t(this.f23648l)) + ", axisGuidelineWidth=" + ((Object) h.r(this.f23649m)) + ", axisGuidelineShape=" + this.f23650n + ", axisLineColor=" + ((Object) C6733v0.t(this.f23651o)) + ", axisLineWidth=" + ((Object) h.r(this.f23652p)) + ", axisLineShape=" + this.f23653q + ", axisTickColor=" + ((Object) C6733v0.t(this.f23654r)) + ", axisTickWidth=" + ((Object) h.r(this.f23655s)) + ", axisTickShape=" + this.f23656t + ", axisTickLength=" + ((Object) h.r(this.f23657u)) + ", axisValueFormatter=" + this.f23658v + ')';
        }

        private C0877a(C7093d c7093d, long j10, long j11, int i10, float f10, float f11, float f12, float f13, float f14, Typeface typeface, Paint.Align align, long j12, float f15, InterfaceC7092c interfaceC7092c, long j13, float f16, InterfaceC7092c interfaceC7092c2, long j14, float f17, InterfaceC7092c interfaceC7092c3, float f18, Z5.a aVar) {
            this.f23637a = c7093d;
            this.f23638b = j10;
            this.f23639c = j11;
            this.f23640d = i10;
            this.f23641e = f10;
            this.f23642f = f11;
            this.f23643g = f12;
            this.f23644h = f13;
            this.f23645i = f14;
            this.f23646j = typeface;
            this.f23647k = align;
            this.f23648l = j12;
            this.f23649m = f15;
            this.f23650n = interfaceC7092c;
            this.f23651o = j13;
            this.f23652p = f16;
            this.f23653q = interfaceC7092c2;
            this.f23654r = j14;
            this.f23655s = f17;
            this.f23656t = interfaceC7092c3;
            this.f23657u = f18;
            this.f23658v = aVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ C0877a(C7093d c7093d, long j10, long j11, int i10, float f10, float f11, float f12, float f13, float f14, Typeface typeface, Paint.Align align, long j12, float f15, InterfaceC7092c interfaceC7092c, long j13, float f16, InterfaceC7092c interfaceC7092c2, long j14, float f17, InterfaceC7092c interfaceC7092c3, float f18, Z5.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            Typeface typeface2;
            InterfaceC7092c interfaceC7092cD;
            C7093d c7093d2 = (i11 & 1) != 0 ? null : c7093d;
            long jG = (i11 & 4) != 0 ? w.g(12) : j11;
            int i12 = (i11 & 8) != 0 ? 1 : i10;
            float fJ = (i11 & 16) != 0 ? h.j(2) : f10;
            float fJ2 = (i11 & 32) != 0 ? h.j(4) : f11;
            float fJ3 = (i11 & 64) != 0 ? h.j(0) : f12;
            float fJ4 = (i11 & 128) != 0 ? h.j(0) : f13;
            float f19 = (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0.0f : f14;
            if ((i11 & 512) != 0) {
                Typeface MONOSPACE = Typeface.MONOSPACE;
                AbstractC6492s.h(MONOSPACE, "MONOSPACE");
                typeface2 = MONOSPACE;
            } else {
                typeface2 = typeface;
            }
            Paint.Align align2 = (i11 & 1024) != 0 ? Paint.Align.LEFT : align;
            float fJ5 = (i11 & 4096) != 0 ? h.j(1.0f) : f15;
            if ((i11 & 8192) != 0) {
                C7094e c7094e = C7094e.f55502a;
                interfaceC7092cD = Q5.a.d(c7094e, c7094e.b(), h.j(4.0f), h.j(2.0f), null, 8, null);
            } else {
                interfaceC7092cD = interfaceC7092c;
            }
            float fJ6 = (32768 & i11) != 0 ? h.j(1.0f) : f16;
            this(c7093d2, j10, jG, i12, fJ, fJ2, fJ3, fJ4, f19, typeface2, align2, j12, fJ5, interfaceC7092cD, j13, fJ6, (65536 & i11) != 0 ? C7094e.f55502a.b() : interfaceC7092c2, (131072 & i11) != 0 ? j13 : j14, (262144 & i11) != 0 ? fJ6 : f17, (524288 & i11) != 0 ? C7094e.f55502a.b() : interfaceC7092c3, (1048576 & i11) != 0 ? h.j(4.0f) : f18, (i11 & 2097152) != 0 ? new Z5.b() : aVar, null);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f23659a;

        /* renamed from: b, reason: collision with root package name */
        private final float f23660b;

        /* renamed from: c, reason: collision with root package name */
        private final float f23661c;

        /* renamed from: d, reason: collision with root package name */
        private final EnumC4226a f23662d;

        /* renamed from: e, reason: collision with root package name */
        private final C8034b f23663e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC8035c f23664f;

        /* renamed from: g, reason: collision with root package name */
        private final z6.c f23665g;

        /* renamed from: h, reason: collision with root package name */
        private final float f23666h;

        public /* synthetic */ b(List list, float f10, float f11, EnumC4226a enumC4226a, C8034b c8034b, EnumC8035c enumC8035c, z6.c cVar, float f12, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, f10, f11, enumC4226a, c8034b, enumC8035c, cVar, f12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f23659a, bVar.f23659a) && h.n(this.f23660b, bVar.f23660b) && h.n(this.f23661c, bVar.f23661c) && this.f23662d == bVar.f23662d && AbstractC6492s.d(this.f23663e, bVar.f23663e) && this.f23664f == bVar.f23664f && AbstractC6492s.d(this.f23665g, bVar.f23665g) && Float.compare(this.f23666h, bVar.f23666h) == 0;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f23659a.hashCode() * 31) + h.p(this.f23660b)) * 31) + h.p(this.f23661c)) * 31) + this.f23662d.hashCode()) * 31;
            C8034b c8034b = this.f23663e;
            return ((((((iHashCode + (c8034b == null ? 0 : c8034b.hashCode())) * 31) + this.f23664f.hashCode()) * 31) + this.f23665g.hashCode()) * 31) + Float.hashCode(this.f23666h);
        }

        public String toString() {
            return "ColumnChart(columns=" + this.f23659a + ", outsideSpacing=" + ((Object) h.r(this.f23660b)) + ", innerSpacing=" + ((Object) h.r(this.f23661c)) + ", mergeMode=" + this.f23662d + ", dataLabel=" + this.f23663e + ", dataLabelVerticalPosition=" + this.f23664f + ", dataLabelValueFormatter=" + this.f23665g + ", dataLabelRotationDegrees=" + this.f23666h + ')';
        }

        private b(List list, float f10, float f11, EnumC4226a enumC4226a, C8034b c8034b, EnumC8035c enumC8035c, z6.c cVar, float f12) {
            this.f23659a = list;
            this.f23660b = f10;
            this.f23661c = f11;
            this.f23662d = enumC4226a;
            this.f23663e = c8034b;
            this.f23664f = enumC8035c;
            this.f23665g = cVar;
            this.f23666h = f12;
        }

        public /* synthetic */ b(List list, float f10, float f11, EnumC4226a enumC4226a, C8034b c8034b, EnumC8035c enumC8035c, z6.c cVar, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? h.j(32.0f) : f10, (i10 & 4) != 0 ? h.j(8.0f) : f11, (i10 & 8) != 0 ? EnumC4226a.Grouped : enumC4226a, (i10 & 16) != 0 ? null : c8034b, (i10 & 32) != 0 ? EnumC8035c.Top : enumC8035c, (i10 & 64) != 0 ? new C8713a() : cVar, (i10 & 128) != 0 ? 0.0f : f12, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(long j10, long j11, long j12, List entityColors, long j13) {
            AbstractC6492s.i(entityColors, "entityColors");
            C0877a c0877a = new C0877a(null, j10, 0L, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, j11, 0.0f, null, j12, 0.0f, null, 0L, 0.0f, null, 0.0f, null, 4175869, null);
            List list = entityColors;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C7091b(AbstractC6737x0.j(((C6733v0) it.next()).u()), 8.0f, C7094e.f55502a.c(40), null, null, 0.0f, 0, 120, null));
            }
            b bVar = new b(arrayList, 0.0f, 0.0f, null, null, null, null, 0.0f, 254, null);
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                long jU = ((C6733v0) it2.next()).u();
                arrayList2.add(new C5953a.C1790a(AbstractC6737x0.j(jU), 0.0f, R5.b.a(r6.c.f60128a, AbstractC6713l0.a.i(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(C6733v0.k(jU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(jU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, null)), null, null, 0.0f, null, null, null, 0.0f, null, 2042, null));
            }
            return new a(c0877a, bVar, new d(arrayList2, 0.0f, 2, null), new e(0.0f, 0.0f, 0.0f, 7, null), j13, null);
        }

        public final a b(X5.a defaultColors) {
            AbstractC6492s.i(defaultColors, "defaultColors");
            long jD = AbstractC6737x0.d(defaultColors.d());
            long jD2 = AbstractC6737x0.d(defaultColors.g());
            long jD3 = AbstractC6737x0.d(defaultColors.c());
            List listO = AbstractC3689v.o(Long.valueOf(defaultColors.b()), Long.valueOf(defaultColors.e()), Long.valueOf(defaultColors.f()));
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(C6733v0.g(AbstractC6737x0.d(((Number) it.next()).longValue())));
            }
            return a(jD, jD2, jD3, arrayList, AbstractC6737x0.d(defaultColors.a()));
        }

        private c() {
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final List f23667a;

        /* renamed from: b, reason: collision with root package name */
        private final float f23668b;

        public /* synthetic */ d(List list, float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, f10);
        }

        public final List a() {
            return this.f23667a;
        }

        public final float b() {
            return this.f23668b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f23667a, dVar.f23667a) && h.n(this.f23668b, dVar.f23668b);
        }

        public int hashCode() {
            return (this.f23667a.hashCode() * 31) + h.p(this.f23668b);
        }

        public String toString() {
            return "LineChart(lines=" + this.f23667a + ", spacing=" + ((Object) h.r(this.f23668b)) + ')';
        }

        private d(List list, float f10) {
            this.f23667a = list;
            this.f23668b = f10;
        }

        public /* synthetic */ d(List list, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? h.j(16.0f) : f10, null);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final float f23669a;

        /* renamed from: b, reason: collision with root package name */
        private final float f23670b;

        /* renamed from: c, reason: collision with root package name */
        private final float f23671c;

        public /* synthetic */ e(float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, f12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return h.n(this.f23669a, eVar.f23669a) && h.n(this.f23670b, eVar.f23670b) && h.n(this.f23671c, eVar.f23671c);
        }

        public int hashCode() {
            return (((h.p(this.f23669a) * 31) + h.p(this.f23670b)) * 31) + h.p(this.f23671c);
        }

        public String toString() {
            return "Marker(indicatorSize=" + ((Object) h.r(this.f23669a)) + ", horizontalPadding=" + ((Object) h.r(this.f23670b)) + ", verticalPadding=" + ((Object) h.r(this.f23671c)) + ')';
        }

        private e(float f10, float f11, float f12) {
            this.f23669a = f10;
            this.f23670b = f11;
            this.f23671c = f12;
        }

        public /* synthetic */ e(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? h.j(36.0f) : f10, (i10 & 2) != 0 ? h.j(8.0f) : f11, (i10 & 4) != 0 ? h.j(4.0f) : f12, null);
        }
    }

    public /* synthetic */ a(C0877a c0877a, b bVar, d dVar, e eVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0877a, bVar, dVar, eVar, j10);
    }

    public final C0877a a() {
        return this.f23632a;
    }

    public final long b() {
        return this.f23636e;
    }

    public final d c() {
        return this.f23634c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f23632a, aVar.f23632a) && AbstractC6492s.d(this.f23633b, aVar.f23633b) && AbstractC6492s.d(this.f23634c, aVar.f23634c) && AbstractC6492s.d(this.f23635d, aVar.f23635d) && C6733v0.m(this.f23636e, aVar.f23636e);
    }

    public int hashCode() {
        return (((((((this.f23632a.hashCode() * 31) + this.f23633b.hashCode()) * 31) + this.f23634c.hashCode()) * 31) + this.f23635d.hashCode()) * 31) + C6733v0.s(this.f23636e);
    }

    public String toString() {
        return "ChartStyle(axis=" + this.f23632a + ", columnChart=" + this.f23633b + ", lineChart=" + this.f23634c + ", marker=" + this.f23635d + ", elevationOverlayColor=" + ((Object) C6733v0.t(this.f23636e)) + ')';
    }

    private a(C0877a c0877a, b bVar, d dVar, e eVar, long j10) {
        this.f23632a = c0877a;
        this.f23633b = bVar;
        this.f23634c = dVar;
        this.f23635d = eVar;
        this.f23636e = j10;
    }
}
