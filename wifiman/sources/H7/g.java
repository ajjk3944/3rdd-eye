package h7;

import Yg.J;
import Zg.AbstractC3689v;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import i7.InterfaceC6078a;
import j7.InterfaceC6258b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.InterfaceC6398a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.InterfaceC6548c;
import l7.InterfaceC6553h;
import m7.AbstractC6776a;
import m7.AbstractC6777b;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;

/* loaded from: classes3.dex */
public abstract class g extends AbstractC6777b {

    /* renamed from: i, reason: collision with root package name */
    public static final a f48482i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C5954a f48483a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6078a f48484b;

    /* renamed from: c, reason: collision with root package name */
    private int f48485c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f48486d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f48487e;

    /* renamed from: f, reason: collision with root package name */
    private final Fg.c f48488f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f48489g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC6824a f48490h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6835l {
        b(Object obj) {
            super(1, obj, g.class, "realWorldMetresToRects", "realWorldMetresToRects(F)F", 0);
        }

        public final Float a(float f10) {
            return Float.valueOf(((g) this.receiver).N(f10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    /* synthetic */ class c extends C6490p implements InterfaceC6835l {
        c(Object obj) {
            super(1, obj, g.class, "realWorldMetresToRects", "realWorldMetresToRects(F)F", 0);
        }

        public final Float a(float f10) {
            return Float.valueOf(((g) this.receiver).N(f10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    /* synthetic */ class d extends C6490p implements InterfaceC6835l {
        d(Object obj) {
            super(1, obj, g.class, "realWorldMetresToHeatmapRects", "realWorldMetresToHeatmapRects(F)F", 0);
        }

        public final Float a(float f10) {
            return Float.valueOf(((g) this.receiver).M(f10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public g(C5954a renderer) {
        AbstractC6492s.i(renderer, "renderer");
        this.f48483a = renderer;
        renderer.O().k(1.5f);
        this.f48485c = Color.argb(255, 255, 255, 255);
        this.f48486d = true;
        this.f48487e = true;
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f48488f = cVarJ2;
        gg.i iVarI2 = cVarJ2.e1().h1().i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f48489g = iVarI2;
        this.f48490h = new InterfaceC6824a() { // from class: h7.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return g.I();
            }
        };
    }

    private final List D(float f10, float f11, float f12, InterfaceC6835l interfaceC6835l) {
        ArrayList arrayList = new ArrayList();
        float fFloatValue = 1.0f / ((Number) interfaceC6835l.invoke(Float.valueOf(1.0f))).floatValue();
        float fFloatValue2 = ((Number) interfaceC6835l.invoke(Float.valueOf(f10))).floatValue();
        float fFloatValue3 = ((Number) interfaceC6835l.invoke(Float.valueOf(f11))).floatValue();
        float fFloatValue4 = ((Number) interfaceC6835l.invoke(Float.valueOf(f12))).floatValue();
        Point point = new Point(AbstractC7137b.e(fFloatValue2 - fFloatValue4), AbstractC7137b.e(fFloatValue3 - fFloatValue4));
        Point point2 = new Point(AbstractC7137b.e(fFloatValue2 + fFloatValue4), AbstractC7137b.e(fFloatValue3 + fFloatValue4));
        int i10 = point.x;
        int i11 = point2.x;
        for (int i12 = i10; i12 < i11; i12++) {
            int i13 = point.y;
            int i14 = point2.y;
            int i15 = i13;
            while (i15 < i14) {
                float f13 = fFloatValue / 2.0f;
                float f14 = fFloatValue4;
                float f15 = fFloatValue4;
                int i16 = i15;
                if (G(fFloatValue2, fFloatValue3, f14, i12 + f13, i15 + f13)) {
                    arrayList.add(new W7.d(i12, i16));
                }
                i15 = i16 + 1;
                fFloatValue4 = f15;
            }
        }
        return arrayList;
    }

    private final boolean G(float f10, float f11, float f12, float f13, float f14) {
        return Math.pow(((double) f13) - ((double) f10), 2.0d) + Math.pow(((double) f14) - ((double) f11), 2.0d) < Math.pow((double) f12, 2.0d);
    }

    private final void H() {
        A().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J I() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J L(g gVar, InterfaceC6398a interfaceC6398a, InterfaceC6398a o10) {
        AbstractC6492s.i(o10, "o");
        gVar.Y(o10, interfaceC6398a);
        gVar.f48483a.R(AbstractC3689v.e(o10));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float M(float f10) {
        return N(f10) * (this.f48483a.r() / this.f48483a.N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float N(float f10) {
        return f10 * 10.0f;
    }

    private final float O(float f10) {
        return f10 / 10.0f;
    }

    private final void S(float f10, float f11, Float f12, final InterfaceC6835l interfaceC6835l) {
        final ArrayList arrayList = new ArrayList();
        final W7.d dVar = new W7.d((int) Math.rint(M(f10)), (int) Math.rint(M(f11)));
        v().b(dVar, new InterfaceC6835l() { // from class: h7.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return g.T(interfaceC6835l, arrayList, (InterfaceC6258b) obj);
            }
        });
        if (f12 != null) {
            Iterator it = D(f10, f11, f12.floatValue(), new d(this)).iterator();
            while (it.hasNext()) {
                v().b((W7.d) it.next(), new InterfaceC6835l() { // from class: h7.e
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return g.U(dVar, interfaceC6835l, arrayList, (InterfaceC6258b) obj);
                    }
                });
            }
        }
        this.f48483a.Q(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J T(InterfaceC6835l interfaceC6835l, List list, InterfaceC6258b tile) {
        AbstractC6492s.i(tile, "tile");
        tile.f(interfaceC6835l);
        list.add(tile);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J U(W7.d dVar, InterfaceC6835l interfaceC6835l, List list, InterfaceC6258b tile) {
        AbstractC6492s.i(tile, "tile");
        if (!AbstractC6492s.d(tile.c(), dVar)) {
            tile.d(dVar, interfaceC6835l);
            list.add(tile);
        }
        return J.f24997a;
    }

    private final void q(float f10, float f11, float f12) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = D(f10, f11, f12, new b(this)).iterator();
        while (it.hasNext()) {
            w().b((W7.d) it.next(), new InterfaceC6835l() { // from class: h7.f
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return g.r(this.f48480a, arrayList, (InterfaceC6548c) obj);
                }
            });
        }
        this.f48483a.S(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J r(g gVar, List list, InterfaceC6548c tile) {
        AbstractC6492s.i(tile, "tile");
        if (!tile.a().e()) {
            tile.a().d(true);
            tile.a().a(gVar.f48485c);
            list.add(tile);
        }
        return J.f24997a;
    }

    public InterfaceC6824a A() {
        return this.f48490h;
    }

    public PointF B() {
        return new PointF(O(this.f48483a.O().d()), O(this.f48483a.O().e()));
    }

    public float C() {
        return this.f48483a.O().f();
    }

    public final C5954a E() {
        return this.f48483a;
    }

    public boolean F() {
        return this.f48487e;
    }

    public final void J(float f10, float f11, InterfaceC6835l update) {
        AbstractC6492s.i(update, "update");
        q(f10, f11, 0.4f);
        S(f10, f11, Float.valueOf(3.3f), update);
    }

    public void K(float f10, float f11, final InterfaceC6398a obj) {
        AbstractC6492s.i(obj, "obj");
        x().b(new W7.d((int) Math.rint(N(f10)), (int) Math.rint(N(f11))), new InterfaceC6835l() { // from class: h7.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj2) {
                return g.L(this.f48473a, obj, (InterfaceC6398a) obj2);
            }
        });
    }

    public final void P(InterfaceC6078a interfaceC6078a) {
        this.f48484b = interfaceC6078a;
    }

    public void Q(PointF value) {
        AbstractC6492s.i(value, "value");
        this.f48483a.z(N(value.x), N(value.y));
        H();
    }

    public final void R(int i10) {
        this.f48485c = i10;
    }

    public void V(InterfaceC6824a interfaceC6824a) {
        AbstractC6492s.i(interfaceC6824a, "<set-?>");
        this.f48490h = interfaceC6824a;
    }

    public void W(PointF value) {
        AbstractC6492s.i(value, "value");
        this.f48483a.O().h(N(value.x), N(value.y), false);
        if (t()) {
            Q(value);
        }
        H();
    }

    public void X(float f10) {
        this.f48483a.O().j(f10);
        if (F()) {
            this.f48483a.E(f10);
        }
        H();
    }

    protected abstract void Y(InterfaceC6398a interfaceC6398a, InterfaceC6398a interfaceC6398a2);

    @Override // m7.AbstractC6777b
    public PointF a() {
        return new PointF(this.f48483a.f(), this.f48483a.g());
    }

    @Override // m7.AbstractC6777b
    public float b() {
        return this.f48483a.h();
    }

    @Override // m7.AbstractC6777b
    public float c() {
        return this.f48483a.t();
    }

    @Override // m7.AbstractC6777b
    public void d(boolean z10) {
        this.f48486d = z10;
        if (z10) {
            Q(B());
        }
        H();
    }

    @Override // m7.AbstractC6777b
    public void e(PointF value) {
        AbstractC6492s.i(value, "value");
        this.f48483a.z(value.x, value.y);
        H();
    }

    @Override // m7.AbstractC6777b
    public void f(boolean z10) {
        this.f48487e = z10;
        if (z10) {
            g(C());
        }
        H();
    }

    @Override // m7.AbstractC6777b
    public void g(float f10) {
        this.f48483a.A(f10);
        H();
    }

    @Override // m7.AbstractC6777b
    public void h(float f10) {
        this.f48483a.B(f10);
        H();
    }

    public void p() {
        C5954a c5954a = this.f48483a;
        AbstractC6776a.j(c5954a, c5954a.O().d(), this.f48483a.O().e(), this.f48483a.O().f(), 0L, 8, null);
        d(true);
        f(true);
    }

    public PointF s() {
        return new PointF(O(this.f48483a.f()), O(this.f48483a.g()));
    }

    public boolean t() {
        return this.f48486d;
    }

    public final Fg.c u() {
        return this.f48488f;
    }

    protected abstract InterfaceC6553h v();

    protected abstract InterfaceC6553h w();

    protected abstract InterfaceC6553h x();

    public final gg.i y() {
        return this.f48489g;
    }

    public final List z(float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Iterator it = D(f10, f11, f12, new c(this)).iterator();
        while (it.hasNext()) {
            InterfaceC6398a interfaceC6398a = (InterfaceC6398a) x().a((W7.d) it.next());
            if (interfaceC6398a != null) {
                arrayList.add(interfaceC6398a);
            }
        }
        return arrayList;
    }
}
