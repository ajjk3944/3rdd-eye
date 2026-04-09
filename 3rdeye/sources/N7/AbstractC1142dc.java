package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivVariable.kt */
/* renamed from: N7.dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1142dc implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f8134a;

    /* compiled from: DivVariable.kt */
    /* renamed from: N7.dc$a */
    public static final class a extends AbstractC1142dc {

        /* renamed from: b, reason: collision with root package name */
        public final C1159f f8135b;

        public a(C1159f c1159f) {
            this.f8135b = c1159f;
        }
    }

    /* compiled from: DivVariable.kt */
    /* renamed from: N7.dc$b */
    public static final class b extends AbstractC1142dc {

        /* renamed from: b, reason: collision with root package name */
        public final C1302p f8136b;

        public b(C1302p c1302p) {
            this.f8136b = c1302p;
        }
    }

    /* compiled from: DivVariable.kt */
    /* renamed from: N7.dc$c */
    public static final class c extends AbstractC1142dc {

        /* renamed from: b, reason: collision with root package name */
        public final C1441z f8137b;

        public c(C1441z c1441z) {
            this.f8137b = c1441z;
        }
    }

    /* compiled from: DivVariable.kt */
    /* renamed from: N7.dc$d */
    public static final class d extends AbstractC1142dc {

        /* renamed from: b, reason: collision with root package name */
        public final U f8138b;

        public d(U u8) {
            this.f8138b = u8;
        }
    }

    /* compiled from: DivVariable.kt */
    /* renamed from: N7.dc$e */
    public static final class e extends AbstractC1142dc {

        /* renamed from: b, reason: collision with root package name */
        public final Pc f8139b;

        public e(Pc pc) {
            this.f8139b = pc;
        }
    }

    /* compiled from: DivVariable.kt */
    /* renamed from: N7.dc$f */
    public static final class f extends AbstractC1142dc {

        /* renamed from: b, reason: collision with root package name */
        public final C1098ad f8140b;

        public f(C1098ad c1098ad) {
            this.f8140b = c1098ad;
        }
    }

    /* compiled from: DivVariable.kt */
    /* renamed from: N7.dc$g */
    public static final class g extends AbstractC1142dc {

        /* renamed from: b, reason: collision with root package name */
        public final td f8141b;

        public g(td tdVar) {
            this.f8141b = tdVar;
        }
    }

    /* compiled from: DivVariable.kt */
    /* renamed from: N7.dc$h */
    public static final class h extends AbstractC1142dc {

        /* renamed from: b, reason: collision with root package name */
        public final Dd f8142b;

        public h(Dd dd) {
            this.f8142b = dd;
        }
    }

    public final boolean a(AbstractC1142dc abstractC1142dc, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (abstractC1142dc == null) {
            return false;
        }
        if (this instanceof g) {
            g gVar = (g) this;
            Object objC = abstractC1142dc.c();
            td tdVar = objC instanceof td ? (td) objC : null;
            td tdVar2 = gVar.f8141b;
            tdVar2.getClass();
            return tdVar != null && kotlin.jvm.internal.l.b(tdVar2.f9350a, tdVar.f9350a) && kotlin.jvm.internal.l.b(tdVar2.f9351b, tdVar.f9351b);
        }
        if (this instanceof f) {
            f fVar = (f) this;
            Object objC2 = abstractC1142dc.c();
            C1098ad c1098ad = objC2 instanceof C1098ad ? (C1098ad) objC2 : null;
            C1098ad c1098ad2 = fVar.f8140b;
            c1098ad2.getClass();
            return c1098ad != null && kotlin.jvm.internal.l.b(c1098ad2.f7903a, c1098ad.f7903a) && c1098ad2.f7904b == c1098ad.f7904b;
        }
        if (this instanceof e) {
            e eVar = (e) this;
            Object objC3 = abstractC1142dc.c();
            Pc pc = objC3 instanceof Pc ? (Pc) objC3 : null;
            Pc pc2 = eVar.f8139b;
            pc2.getClass();
            return pc != null && kotlin.jvm.internal.l.b(pc2.f6030a, pc.f6030a) && pc2.f6031b == pc.f6031b;
        }
        if (this instanceof b) {
            b bVar = (b) this;
            Object objC4 = abstractC1142dc.c();
            C1302p c1302p = objC4 instanceof C1302p ? (C1302p) objC4 : null;
            C1302p c1302p2 = bVar.f8136b;
            c1302p2.getClass();
            return c1302p != null && kotlin.jvm.internal.l.b(c1302p2.f8879a, c1302p.f8879a) && c1302p2.f8880b == c1302p.f8880b;
        }
        if (this instanceof c) {
            c cVar = (c) this;
            Object objC5 = abstractC1142dc.c();
            C1441z c1441z = objC5 instanceof C1441z ? (C1441z) objC5 : null;
            C1441z c1441z2 = cVar.f8137b;
            c1441z2.getClass();
            return c1441z != null && kotlin.jvm.internal.l.b(c1441z2.f9991a, c1441z.f9991a) && c1441z2.f9992b == c1441z.f9992b;
        }
        if (this instanceof h) {
            h hVar = (h) this;
            Object objC6 = abstractC1142dc.c();
            Dd dd = objC6 instanceof Dd ? (Dd) objC6 : null;
            Dd dd2 = hVar.f8142b;
            dd2.getClass();
            return dd != null && kotlin.jvm.internal.l.b(dd2.f5121a, dd.f5121a) && kotlin.jvm.internal.l.b(dd2.f5122b, dd.f5122b);
        }
        if (this instanceof d) {
            d dVar = (d) this;
            Object objC7 = abstractC1142dc.c();
            U u8 = objC7 instanceof U ? (U) objC7 : null;
            U u10 = dVar.f8138b;
            u10.getClass();
            return u8 != null && kotlin.jvm.internal.l.b(u10.f6354a, u8.f6354a) && kotlin.jvm.internal.l.b(u10.f6355b, u8.f6355b);
        }
        if (!(this instanceof a)) {
            throw new b9.j();
        }
        a aVar = (a) this;
        Object objC8 = abstractC1142dc.c();
        C1159f c1159f = objC8 instanceof C1159f ? (C1159f) objC8 : null;
        C1159f c1159f2 = aVar.f8135b;
        c1159f2.getClass();
        return c1159f != null && kotlin.jvm.internal.l.b(c1159f2.f8178a, c1159f.f8178a) && kotlin.jvm.internal.l.b(c1159f2.f8179b, c1159f.f8179b);
    }

    public final int b() {
        int iHashCode;
        int iIntValue;
        int iHashCode2;
        int i;
        Integer num = this.f8134a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode3 = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof g) {
            td tdVar = ((g) this).f8141b;
            Integer num2 = tdVar.f9352c;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iHashCode = tdVar.f9351b.hashCode() + tdVar.f9350a.hashCode() + kotlin.jvm.internal.x.a(td.class).hashCode();
                tdVar.f9352c = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else if (this instanceof f) {
            C1098ad c1098ad = ((f) this).f8140b;
            Integer num3 = c1098ad.f7905c;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                int iHashCode4 = c1098ad.f7903a.hashCode() + kotlin.jvm.internal.x.a(C1098ad.class).hashCode();
                long jDoubleToLongBits = Double.doubleToLongBits(c1098ad.f7904b);
                i = iHashCode4 + ((int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits));
                c1098ad.f7905c = Integer.valueOf(i);
                iIntValue = i;
            }
        } else if (this instanceof e) {
            Pc pc = ((e) this).f8139b;
            Integer num4 = pc.f6032c;
            if (num4 != null) {
                iIntValue = num4.intValue();
            } else {
                int iHashCode5 = pc.f6030a.hashCode() + kotlin.jvm.internal.x.a(Pc.class).hashCode();
                long j4 = pc.f6031b;
                i = iHashCode5 + ((int) ((j4 >>> 32) ^ j4));
                pc.f6032c = Integer.valueOf(i);
                iIntValue = i;
            }
        } else if (this instanceof b) {
            C1302p c1302p = ((b) this).f8136b;
            Integer num5 = c1302p.f8881c;
            if (num5 != null) {
                iIntValue = num5.intValue();
            } else {
                iHashCode2 = c1302p.f8879a.hashCode() + kotlin.jvm.internal.x.a(C1302p.class).hashCode() + (c1302p.f8880b ? 1231 : 1237);
                c1302p.f8881c = Integer.valueOf(iHashCode2);
                iIntValue = iHashCode2;
            }
        } else if (this instanceof c) {
            C1441z c1441z = ((c) this).f8137b;
            Integer num6 = c1441z.f9993c;
            if (num6 != null) {
                iIntValue = num6.intValue();
            } else {
                iHashCode2 = c1441z.f9991a.hashCode() + kotlin.jvm.internal.x.a(C1441z.class).hashCode() + c1441z.f9992b;
                c1441z.f9993c = Integer.valueOf(iHashCode2);
                iIntValue = iHashCode2;
            }
        } else if (this instanceof h) {
            Dd dd = ((h) this).f8142b;
            Integer num7 = dd.f5123c;
            if (num7 != null) {
                iIntValue = num7.intValue();
            } else {
                iHashCode = dd.f5122b.hashCode() + dd.f5121a.hashCode() + kotlin.jvm.internal.x.a(Dd.class).hashCode();
                dd.f5123c = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else if (this instanceof d) {
            U u8 = ((d) this).f8138b;
            Integer num8 = u8.f6356c;
            if (num8 != null) {
                iIntValue = num8.intValue();
            } else {
                iHashCode = u8.f6355b.hashCode() + u8.f6354a.hashCode() + kotlin.jvm.internal.x.a(U.class).hashCode();
                u8.f6356c = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else {
            if (!(this instanceof a)) {
                throw new b9.j();
            }
            C1159f c1159f = ((a) this).f8135b;
            Integer num9 = c1159f.f8180c;
            if (num9 != null) {
                iIntValue = num9.intValue();
            } else {
                iHashCode = c1159f.f8179b.hashCode() + c1159f.f8178a.hashCode() + kotlin.jvm.internal.x.a(C1159f.class).hashCode();
                c1159f.f8180c = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        }
        int i10 = iHashCode3 + iIntValue;
        this.f8134a = Integer.valueOf(i10);
        return i10;
    }

    public final Object c() {
        if (this instanceof g) {
            return ((g) this).f8141b;
        }
        if (this instanceof f) {
            return ((f) this).f8140b;
        }
        if (this instanceof e) {
            return ((e) this).f8139b;
        }
        if (this instanceof b) {
            return ((b) this).f8136b;
        }
        if (this instanceof c) {
            return ((c) this).f8137b;
        }
        if (this instanceof h) {
            return ((h) this).f8142b;
        }
        if (this instanceof d) {
            return ((d) this).f8138b;
        }
        if (this instanceof a) {
            return ((a) this).f8135b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1157ec) D7.a.f1071b.f6703b9.getValue()).b(D7.a.f1070a, this);
    }
}
