package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTypedValue.kt */
/* loaded from: classes.dex */
public abstract class Yb implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f7802a;

    /* compiled from: DivTypedValue.kt */
    public static final class a extends Yb {

        /* renamed from: b, reason: collision with root package name */
        public final C1084a f7803b;

        public a(C1084a c1084a) {
            this.f7803b = c1084a;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class b extends Yb {

        /* renamed from: b, reason: collision with root package name */
        public final C1232k f7804b;

        public b(C1232k c1232k) {
            this.f7804b = c1232k;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class c extends Yb {

        /* renamed from: b, reason: collision with root package name */
        public final C1371u f7805b;

        public c(C1371u c1371u) {
            this.f7805b = c1371u;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class d extends Yb {

        /* renamed from: b, reason: collision with root package name */
        public final O f7806b;

        public d(O o10) {
            this.f7806b = o10;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class e extends Yb {

        /* renamed from: b, reason: collision with root package name */
        public final Kc f7807b;

        public e(Kc kc) {
            this.f7807b = kc;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class f extends Yb {

        /* renamed from: b, reason: collision with root package name */
        public final Vc f7808b;

        public f(Vc vc) {
            this.f7808b = vc;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class g extends Yb {

        /* renamed from: b, reason: collision with root package name */
        public final od f7809b;

        public g(od odVar) {
            this.f7809b = odVar;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class h extends Yb {

        /* renamed from: b, reason: collision with root package name */
        public final yd f7810b;

        public h(yd ydVar) {
            this.f7810b = ydVar;
        }
    }

    public final boolean a(Yb yb, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (yb == null) {
            return false;
        }
        if (this instanceof g) {
            g gVar = (g) this;
            Object objC = yb.c();
            od odVar = objC instanceof od ? (od) objC : null;
            od odVar2 = gVar.f7809b;
            odVar2.getClass();
            if (odVar == null) {
                return false;
            }
            return kotlin.jvm.internal.l.b(odVar2.f8877a.a(resolver), odVar.f8877a.a(otherResolver));
        }
        if (this instanceof e) {
            e eVar = (e) this;
            Object objC2 = yb.c();
            Kc kc = objC2 instanceof Kc ? (Kc) objC2 : null;
            Kc kc2 = eVar.f7807b;
            kc2.getClass();
            return kc != null && kc2.f5746a.a(resolver).longValue() == kc.f5746a.a(otherResolver).longValue();
        }
        if (this instanceof f) {
            f fVar = (f) this;
            Object objC3 = yb.c();
            Vc vc = objC3 instanceof Vc ? (Vc) objC3 : null;
            Vc vc2 = fVar.f7808b;
            vc2.getClass();
            return vc != null && vc2.f7605a.a(resolver).doubleValue() == vc.f7605a.a(otherResolver).doubleValue();
        }
        if (this instanceof c) {
            c cVar = (c) this;
            Object objC4 = yb.c();
            C1371u c1371u = objC4 instanceof C1371u ? (C1371u) objC4 : null;
            C1371u c1371u2 = cVar.f7805b;
            c1371u2.getClass();
            return c1371u != null && c1371u2.f9353a.a(resolver).intValue() == c1371u.f9353a.a(otherResolver).intValue();
        }
        if (this instanceof b) {
            b bVar = (b) this;
            Object objC5 = yb.c();
            C1232k c1232k = objC5 instanceof C1232k ? (C1232k) objC5 : null;
            C1232k c1232k2 = bVar.f7804b;
            c1232k2.getClass();
            return c1232k != null && c1232k2.f8623a.a(resolver).booleanValue() == c1232k.f8623a.a(otherResolver).booleanValue();
        }
        if (this instanceof h) {
            h hVar = (h) this;
            Object objC6 = yb.c();
            yd ydVar = objC6 instanceof yd ? (yd) objC6 : null;
            yd ydVar2 = hVar.f7810b;
            ydVar2.getClass();
            if (ydVar == null) {
                return false;
            }
            return kotlin.jvm.internal.l.b(ydVar2.f9989a.a(resolver), ydVar.f9989a.a(otherResolver));
        }
        if (this instanceof d) {
            d dVar = (d) this;
            Object objC7 = yb.c();
            O o10 = objC7 instanceof O ? (O) objC7 : null;
            O o11 = dVar.f7806b;
            o11.getClass();
            if (o10 == null) {
                return false;
            }
            return kotlin.jvm.internal.l.b(o11.f5942a.a(resolver), o10.f5942a.a(otherResolver));
        }
        if (!(this instanceof a)) {
            throw new b9.j();
        }
        a aVar = (a) this;
        Object objC8 = yb.c();
        C1084a c1084a = objC8 instanceof C1084a ? (C1084a) objC8 : null;
        C1084a c1084a2 = aVar.f7803b;
        c1084a2.getClass();
        if (c1084a == null) {
            return false;
        }
        return kotlin.jvm.internal.l.b(c1084a2.f7875a.a(resolver), c1084a.f7875a.a(otherResolver));
    }

    public final int b() {
        int iHashCode;
        int iIntValue;
        Integer num = this.f7802a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode2 = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof g) {
            od odVar = ((g) this).f7809b;
            Integer num2 = odVar.f8878b;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode3 = kotlin.jvm.internal.x.a(od.class).hashCode() + odVar.f8877a.hashCode();
                odVar.f8878b = Integer.valueOf(iHashCode3);
                iIntValue = iHashCode3;
            }
        } else if (this instanceof e) {
            Kc kc = ((e) this).f7807b;
            Integer num3 = kc.f5747b;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iHashCode = kc.f5746a.hashCode() + kotlin.jvm.internal.x.a(Kc.class).hashCode();
                kc.f5747b = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else if (this instanceof f) {
            Vc vc = ((f) this).f7808b;
            Integer num4 = vc.f7606b;
            if (num4 != null) {
                iIntValue = num4.intValue();
            } else {
                iHashCode = vc.f7605a.hashCode() + kotlin.jvm.internal.x.a(Vc.class).hashCode();
                vc.f7606b = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else if (this instanceof c) {
            C1371u c1371u = ((c) this).f7805b;
            Integer num5 = c1371u.f9354b;
            if (num5 != null) {
                iIntValue = num5.intValue();
            } else {
                iHashCode = c1371u.f9353a.hashCode() + kotlin.jvm.internal.x.a(C1371u.class).hashCode();
                c1371u.f9354b = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else if (this instanceof b) {
            C1232k c1232k = ((b) this).f7804b;
            Integer num6 = c1232k.f8624b;
            if (num6 != null) {
                iIntValue = num6.intValue();
            } else {
                iHashCode = c1232k.f8623a.hashCode() + kotlin.jvm.internal.x.a(C1232k.class).hashCode();
                c1232k.f8624b = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else if (this instanceof h) {
            yd ydVar = ((h) this).f7810b;
            Integer num7 = ydVar.f9990b;
            if (num7 != null) {
                iIntValue = num7.intValue();
            } else {
                iHashCode = ydVar.f9989a.hashCode() + kotlin.jvm.internal.x.a(yd.class).hashCode();
                ydVar.f9990b = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else if (this instanceof d) {
            O o10 = ((d) this).f7806b;
            Integer num8 = o10.f5943b;
            if (num8 != null) {
                iIntValue = num8.intValue();
            } else {
                iHashCode = o10.f5942a.hashCode() + kotlin.jvm.internal.x.a(O.class).hashCode();
                o10.f5943b = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else {
            if (!(this instanceof a)) {
                throw new b9.j();
            }
            C1084a c1084a = ((a) this).f7803b;
            Integer num9 = c1084a.f7876b;
            if (num9 != null) {
                iIntValue = num9.intValue();
            } else {
                iHashCode = c1084a.f7875a.hashCode() + kotlin.jvm.internal.x.a(C1084a.class).hashCode();
                c1084a.f7876b = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        }
        int i = iHashCode2 + iIntValue;
        this.f7802a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof g) {
            return ((g) this).f7809b;
        }
        if (this instanceof e) {
            return ((e) this).f7807b;
        }
        if (this instanceof f) {
            return ((f) this).f7808b;
        }
        if (this instanceof c) {
            return ((c) this).f7805b;
        }
        if (this instanceof b) {
            return ((b) this).f7804b;
        }
        if (this instanceof h) {
            return ((h) this).f7810b;
        }
        if (this instanceof d) {
            return ((d) this).f7806b;
        }
        if (this instanceof a) {
            return ((a) this).f7803b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Zb) D7.a.f1071b.f6668Y8.getValue()).b(D7.a.f1070a, this);
    }
}
