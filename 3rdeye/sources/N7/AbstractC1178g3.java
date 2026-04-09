package N7;

import c9.C2092m;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivChangeTransition.kt */
/* renamed from: N7.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1178g3 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f8272a;

    /* compiled from: DivChangeTransition.kt */
    /* renamed from: N7.g3$a */
    public static final class a extends AbstractC1178g3 {

        /* renamed from: b, reason: collision with root package name */
        public final C1088a3 f8273b;

        public a(C1088a3 c1088a3) {
            this.f8273b = c1088a3;
        }
    }

    /* compiled from: DivChangeTransition.kt */
    /* renamed from: N7.g3$b */
    public static final class b extends AbstractC1178g3 {

        /* renamed from: b, reason: collision with root package name */
        public final C1133d3 f8274b;

        public b(C1133d3 c1133d3) {
            this.f8274b = c1133d3;
        }
    }

    public final boolean a(AbstractC1178g3 abstractC1178g3, A7.d resolver, A7.d otherResolver) {
        InterfaceC5868a interfaceC5868a;
        InterfaceC5868a interfaceC5868a2;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (abstractC1178g3 != null) {
            if (this instanceof b) {
                b bVar = (b) this;
                if (abstractC1178g3 instanceof b) {
                    interfaceC5868a2 = ((b) abstractC1178g3).f8274b;
                } else {
                    if (!(abstractC1178g3 instanceof a)) {
                        throw new b9.j();
                    }
                    interfaceC5868a2 = ((a) abstractC1178g3).f8273b;
                }
                C1133d3 c1133d3 = interfaceC5868a2 instanceof C1133d3 ? (C1133d3) interfaceC5868a2 : null;
                C1133d3 c1133d32 = bVar.f8274b;
                c1133d32.getClass();
                if (c1133d3 != null) {
                    List<AbstractC1178g3> list = c1133d32.f8063a;
                    int size = list.size();
                    List<AbstractC1178g3> list2 = c1133d3.f8063a;
                    if (size == list2.size()) {
                        int i = 0;
                        for (Object obj : list) {
                            int i10 = i + 1;
                            if (i < 0) {
                                C2092m.a0();
                                throw null;
                            }
                            if (((AbstractC1178g3) obj).a(list2.get(i), resolver, otherResolver)) {
                                i = i10;
                            }
                        }
                        return true;
                    }
                }
            } else {
                if (!(this instanceof a)) {
                    throw new b9.j();
                }
                a aVar = (a) this;
                if (abstractC1178g3 instanceof b) {
                    interfaceC5868a = ((b) abstractC1178g3).f8274b;
                } else {
                    if (!(abstractC1178g3 instanceof a)) {
                        throw new b9.j();
                    }
                    interfaceC5868a = ((a) abstractC1178g3).f8273b;
                }
                C1088a3 c1088a3 = interfaceC5868a instanceof C1088a3 ? (C1088a3) interfaceC5868a : null;
                C1088a3 c1088a32 = aVar.f8273b;
                c1088a32.getClass();
                if (c1088a3 != null && c1088a32.f7889a.a(resolver).longValue() == c1088a3.f7889a.a(otherResolver).longValue() && c1088a32.f7890b.a(resolver) == c1088a3.f7890b.a(otherResolver) && c1088a32.f7891c.a(resolver).longValue() == c1088a3.f7891c.a(otherResolver).longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        int iIntValue;
        int iHashCode;
        Integer num = this.f8272a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode2 = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof b) {
            C1133d3 c1133d3 = ((b) this).f8274b;
            Integer num2 = c1133d3.f8065c;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                Integer num3 = c1133d3.f8064b;
                if (num3 != null) {
                    iHashCode = num3.intValue();
                } else {
                    iHashCode = kotlin.jvm.internal.x.a(C1133d3.class).hashCode();
                    c1133d3.f8064b = Integer.valueOf(iHashCode);
                }
                Iterator<T> it = c1133d3.f8063a.iterator();
                int iB = 0;
                while (it.hasNext()) {
                    iB += ((AbstractC1178g3) it.next()).b();
                }
                int i = iHashCode + iB;
                c1133d3.f8065c = Integer.valueOf(i);
                iIntValue = i;
            }
        } else {
            if (!(this instanceof a)) {
                throw new b9.j();
            }
            C1088a3 c1088a3 = ((a) this).f8273b;
            Integer num4 = c1088a3.f7892d;
            if (num4 != null) {
                iIntValue = num4.intValue();
            } else {
                int iHashCode3 = c1088a3.f7891c.hashCode() + c1088a3.f7890b.hashCode() + c1088a3.f7889a.hashCode() + kotlin.jvm.internal.x.a(C1088a3.class).hashCode();
                c1088a3.f7892d = Integer.valueOf(iHashCode3);
                iIntValue = iHashCode3;
            }
        }
        int i10 = iHashCode2 + iIntValue;
        this.f8272a = Integer.valueOf(i10);
        return i10;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1193h3) D7.a.f1071b.f6586R1.getValue()).b(D7.a.f1070a, this);
    }
}
