package N7;

import c9.C2092m;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivBackground.kt */
/* loaded from: classes.dex */
public abstract class N2 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5886a;

    /* compiled from: DivBackground.kt */
    public static final class a extends N2 {

        /* renamed from: b, reason: collision with root package name */
        public final A5 f5887b;

        public a(A5 a52) {
            this.f5887b = a52;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class b extends N2 {

        /* renamed from: b, reason: collision with root package name */
        public final R6 f5888b;

        public b(R6 r62) {
            this.f5888b = r62;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class c extends N2 {

        /* renamed from: b, reason: collision with root package name */
        public final C1137d7 f5889b;

        public c(C1137d7 c1137d7) {
            this.f5889b = c1137d7;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class d extends N2 {

        /* renamed from: b, reason: collision with root package name */
        public final C1394v8 f5890b;

        public d(C1394v8 c1394v8) {
            this.f5890b = c1394v8;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class e extends N2 {

        /* renamed from: b, reason: collision with root package name */
        public final S9 f5891b;

        public e(S9 s92) {
            this.f5891b = s92;
        }
    }

    public final boolean a(N2 n22, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (n22 != null) {
            if (this instanceof b) {
                b bVar = (b) this;
                Object objC = n22.c();
                return bVar.f5888b.a(objC instanceof R6 ? (R6) objC : null, resolver, otherResolver);
            }
            if (this instanceof d) {
                d dVar = (d) this;
                Object objC2 = n22.c();
                return dVar.f5890b.a(objC2 instanceof C1394v8 ? (C1394v8) objC2 : null, resolver, otherResolver);
            }
            if (this instanceof a) {
                a aVar = (a) this;
                Object objC3 = n22.c();
                A5 a52 = objC3 instanceof A5 ? (A5) objC3 : null;
                A5 a53 = aVar.f5887b;
                a53.getClass();
                if (a52 != null && a53.f4764a.a(resolver).doubleValue() == a52.f4764a.a(otherResolver).doubleValue() && a53.f4765b.a(resolver) == a52.f4765b.a(otherResolver) && a53.f4766c.a(resolver) == a52.f4766c.a(otherResolver)) {
                    List<F4> list = a52.f4767d;
                    List<F4> list2 = a53.f4767d;
                    if (list2 != null) {
                        if (list != null && list2.size() == list.size()) {
                            int i = 0;
                            for (Object obj : list2) {
                                int i10 = i + 1;
                                if (i < 0) {
                                    C2092m.a0();
                                    throw null;
                                }
                                if (!((F4) obj).a(list.get(i), resolver, otherResolver)) {
                                    break;
                                }
                                i = i10;
                            }
                            if (kotlin.jvm.internal.l.b(a53.f4768e.a(resolver), a52.f4768e.a(otherResolver)) || a53.f4769f.a(resolver).booleanValue() != a52.f4769f.a(otherResolver).booleanValue() || a53.f4770g.a(resolver) != a52.f4770g.a(otherResolver)) {
                                break;
                            }
                            return true;
                        }
                    } else if (list == null) {
                        if (kotlin.jvm.internal.l.b(a53.f4768e.a(resolver), a52.f4768e.a(otherResolver))) {
                        }
                    }
                }
            } else {
                if (this instanceof e) {
                    e eVar = (e) this;
                    Object objC4 = n22.c();
                    return eVar.f5891b.a(objC4 instanceof S9 ? (S9) objC4 : null, resolver, otherResolver);
                }
                if (!(this instanceof c)) {
                    throw new b9.j();
                }
                c cVar = (c) this;
                Object objC5 = n22.c();
                C1137d7 c1137d7 = objC5 instanceof C1137d7 ? (C1137d7) objC5 : null;
                C1137d7 c1137d72 = cVar.f5889b;
                c1137d72.getClass();
                if (c1137d7 != null && kotlin.jvm.internal.l.b(c1137d72.f8071a.a(resolver), c1137d7.f8071a.a(otherResolver))) {
                    C1085a0 c1085a0 = c1137d72.f8072b;
                    C1085a0 c1085a02 = c1137d7.f8072b;
                    if (c1085a0.f7880a.a(resolver).longValue() != c1085a02.f7880a.a(otherResolver).longValue() || c1085a0.f7881b.a(resolver).longValue() != c1085a02.f7881b.a(otherResolver).longValue() || c1085a0.f7882c.a(resolver).longValue() != c1085a02.f7882c.a(otherResolver).longValue() || c1085a0.f7883d.a(resolver).longValue() != c1085a02.f7883d.a(otherResolver).longValue()) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        int iIntValue;
        int iHashCode;
        int iIntValue2;
        Integer num = this.f5886a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode2 = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof b) {
            iIntValue2 = ((b) this).f5888b.b();
        } else if (this instanceof d) {
            iIntValue2 = ((d) this).f5890b.b();
        } else if (this instanceof a) {
            A5 a52 = ((a) this).f5887b;
            Integer num2 = a52.f4771h;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                int iHashCode3 = a52.f4766c.hashCode() + a52.f4765b.hashCode() + a52.f4764a.hashCode() + kotlin.jvm.internal.x.a(A5.class).hashCode();
                int iB = 0;
                List<F4> list = a52.f4767d;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        iB += ((F4) it.next()).b();
                    }
                }
                iHashCode = a52.f4770g.hashCode() + a52.f4769f.hashCode() + a52.f4768e.hashCode() + iHashCode3 + iB;
                a52.f4771h = Integer.valueOf(iHashCode);
                iIntValue2 = iHashCode;
            }
        } else if (this instanceof e) {
            iIntValue2 = ((e) this).f5891b.b();
        } else {
            if (!(this instanceof c)) {
                throw new b9.j();
            }
            C1137d7 c1137d7 = ((c) this).f5889b;
            Integer num3 = c1137d7.f8073c;
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                int iHashCode4 = c1137d7.f8071a.hashCode() + kotlin.jvm.internal.x.a(C1137d7.class).hashCode();
                C1085a0 c1085a0 = c1137d7.f8072b;
                Integer num4 = c1085a0.f7884e;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                } else {
                    int iHashCode5 = c1085a0.f7883d.hashCode() + c1085a0.f7882c.hashCode() + c1085a0.f7881b.hashCode() + c1085a0.f7880a.hashCode() + kotlin.jvm.internal.x.a(C1085a0.class).hashCode();
                    c1085a0.f7884e = Integer.valueOf(iHashCode5);
                    iIntValue = iHashCode5;
                }
                iHashCode = iIntValue + iHashCode4;
                c1137d7.f8073c = Integer.valueOf(iHashCode);
                iIntValue2 = iHashCode;
            }
        }
        int i = iHashCode2 + iIntValue2;
        this.f5886a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof b) {
            return ((b) this).f5888b;
        }
        if (this instanceof d) {
            return ((d) this).f5890b;
        }
        if (this instanceof a) {
            return ((a) this).f5887b;
        }
        if (this instanceof e) {
            return ((e) this).f5891b;
        }
        if (this instanceof c) {
            return ((c) this).f5889b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((O2) D7.a.f1071b.f6429C1.getValue()).b(D7.a.f1070a, this);
    }
}
