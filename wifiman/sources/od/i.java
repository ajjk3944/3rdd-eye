package od;

import S8.l;
import Yg.m;
import Yg.n;
import b8.AbstractC4075b;
import j7.InterfaceC6258b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;

/* loaded from: classes4.dex */
public final class i implements InterfaceC6258b {

    /* renamed from: a, reason: collision with root package name */
    private final W7.d f55644a;

    /* renamed from: b, reason: collision with root package name */
    private a f55645b;

    /* renamed from: c, reason: collision with root package name */
    private W7.f f55646c;

    /* renamed from: d, reason: collision with root package name */
    private W7.a f55647d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC4075b f55648e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f55649f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC6835l f55650g;

    /* renamed from: h, reason: collision with root package name */
    private int f55651h;

    static final class b implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f55656a = new b();

        b() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(i it) {
            AbstractC6492s.i(it, "it");
            return null;
        }
    }

    public i(W7.d coordinates) {
        AbstractC6492s.i(coordinates, "coordinates");
        this.f55644a = coordinates;
        this.f55645b = new a(null, null, null, 0.0d, 7, null);
        this.f55649f = new LinkedHashMap();
        this.f55650g = b.f55656a;
    }

    private final double h(W7.d dVar, W7.d dVar2) {
        double d10 = 2;
        return Math.sqrt(Math.pow(dVar.a() - dVar2.a(), d10) + Math.pow(dVar.b() - dVar2.b(), d10));
    }

    private final int i(W7.d dVar) {
        return dVar.a() * 527 * dVar.b();
    }

    private final double n(a aVar) {
        if (aVar.a() > 0.0d) {
            return 1 / Math.pow(aVar.a(), 3);
        }
        return 1.0d;
    }

    private final void q() {
        Integer num = (Integer) this.f55650g.invoke(this);
        o(num != null ? num.intValue() : 0);
    }

    private final void r() {
        m mVarB = n.b(new InterfaceC6824a() { // from class: od.h
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return i.t(this.f55643a);
            }
        });
        if (l().c() != null) {
            this.f55646c = l().c();
        } else {
            this.f55646c = s(mVarB).c();
        }
        if (l().d() != null) {
            this.f55647d = l().d();
        } else {
            this.f55647d = s(mVarB).d();
        }
        if (l().b() != null) {
            this.f55648e = l().b();
        } else {
            this.f55648e = s(mVarB).b();
        }
    }

    private static final a s(m mVar) {
        return (a) mVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a t(i iVar) {
        Iterator it;
        i iVar2 = iVar;
        Iterator it2 = iVar2.f55649f.entrySet().iterator();
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        while (it2.hasNext()) {
            a aVar = (a) ((Map.Entry) it2.next()).getValue();
            double dN = iVar2.n(aVar);
            if (aVar.c() != null) {
                d10 += dN;
            }
            if (aVar.d() != null) {
                d11 += dN;
            }
            if (aVar.b() != null) {
                d12 += dN;
            }
        }
        Iterator it3 = iVar2.f55649f.entrySet().iterator();
        double dB = 0.0d;
        double dC = 0.0d;
        double dB2 = 0.0d;
        while (it3.hasNext()) {
            a aVar2 = (a) ((Map.Entry) it3.next()).getValue();
            double dN2 = iVar2.n(aVar2);
            if (aVar2.c() != null) {
                it = it3;
                dB += (r3.b() * dN2) / d10;
            } else {
                it = it3;
            }
            if (aVar2.d() != null) {
                dC += (r0.c() * dN2) / d11;
            }
            if (aVar2.b() != null) {
                dB2 += (r0.b() * dN2) / d12;
            }
            iVar2 = iVar;
            it3 = it;
        }
        return new a(d10 == 0.0d ? null : l.f20404f.a(AbstractC7137b.d(dB)), d11 == 0.0d ? null : W7.a.f23676b.d(AbstractC7137b.d(dC)), d12 == 0.0d ? null : AbstractC4075b.f33002a.a(AbstractC7137b.d(dB2)), 0.0d);
    }

    @Override // l7.InterfaceC6546a
    public int b() {
        return this.f55651h;
    }

    @Override // l7.InterfaceC6554i
    public W7.d c() {
        return this.f55644a;
    }

    @Override // j7.InterfaceC6258b
    public void d(W7.d point, InterfaceC6835l update) {
        AbstractC6492s.i(point, "point");
        AbstractC6492s.i(update, "update");
        Map map = this.f55649f;
        Integer numValueOf = Integer.valueOf(i(point));
        Object aVar = map.get(numValueOf);
        if (aVar == null) {
            aVar = new a(null, null, null, h(point, c()), 7, null);
            map.put(numValueOf, aVar);
        }
        update.invoke(aVar);
        r();
        q();
    }

    @Override // j7.InterfaceC6258b
    public void f(InterfaceC6835l update) {
        AbstractC6492s.i(update, "update");
        update.invoke(l());
        r();
        q();
    }

    public final AbstractC4075b j() {
        return this.f55648e;
    }

    public final W7.f k() {
        return this.f55646c;
    }

    public a l() {
        return this.f55645b;
    }

    public final W7.a m() {
        return this.f55647d;
    }

    public void o(int i10) {
        this.f55651h = i10;
    }

    public final void p(InterfaceC6835l value) {
        AbstractC6492s.i(value, "value");
        this.f55650g = value;
        q();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private W7.f f55652a;

        /* renamed from: b, reason: collision with root package name */
        private W7.a f55653b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC4075b f55654c;

        /* renamed from: d, reason: collision with root package name */
        private double f55655d;

        public a(W7.f fVar, W7.a aVar, AbstractC4075b abstractC4075b, double d10) {
            this.f55652a = fVar;
            this.f55653b = aVar;
            this.f55654c = abstractC4075b;
            this.f55655d = d10;
        }

        public final double a() {
            return this.f55655d;
        }

        public final AbstractC4075b b() {
            return this.f55654c;
        }

        public final W7.f c() {
            return this.f55652a;
        }

        public final W7.a d() {
            return this.f55653b;
        }

        public final void e(W7.f fVar) {
            this.f55652a = fVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f55652a, aVar.f55652a) && AbstractC6492s.d(this.f55653b, aVar.f55653b) && AbstractC6492s.d(this.f55654c, aVar.f55654c) && Double.compare(this.f55655d, aVar.f55655d) == 0;
        }

        public int hashCode() {
            W7.f fVar = this.f55652a;
            int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
            W7.a aVar = this.f55653b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            AbstractC4075b abstractC4075b = this.f55654c;
            return ((iHashCode2 + (abstractC4075b != null ? abstractC4075b.hashCode() : 0)) * 31) + Double.hashCode(this.f55655d);
        }

        public String toString() {
            return "Stats(signalStrength=" + this.f55652a + ", throughput=" + this.f55653b + ", latency=" + this.f55654c + ", dataPointDistance=" + this.f55655d + ")";
        }

        public /* synthetic */ a(W7.f fVar, W7.a aVar, AbstractC4075b abstractC4075b, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : fVar, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : abstractC4075b, d10);
        }
    }
}
