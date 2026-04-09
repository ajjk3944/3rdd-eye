package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivRadialGradientCenter.kt */
/* renamed from: N7.w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1408w8 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f9723a;

    /* compiled from: DivRadialGradientCenter.kt */
    /* renamed from: N7.w8$a */
    public static final class a extends AbstractC1408w8 {

        /* renamed from: b, reason: collision with root package name */
        public final D8 f9724b;

        public a(D8 d82) {
            this.f9724b = d82;
        }
    }

    /* compiled from: DivRadialGradientCenter.kt */
    /* renamed from: N7.w8$b */
    public static final class b extends AbstractC1408w8 {

        /* renamed from: b, reason: collision with root package name */
        public final N8 f9725b;

        public b(N8 n82) {
            this.f9725b = n82;
        }
    }

    public final boolean a(AbstractC1408w8 abstractC1408w8, A7.d resolver, A7.d otherResolver) {
        InterfaceC5868a interfaceC5868a;
        InterfaceC5868a interfaceC5868a2;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (abstractC1408w8 == null) {
            return false;
        }
        if (this instanceof a) {
            a aVar = (a) this;
            if (abstractC1408w8 instanceof a) {
                interfaceC5868a2 = ((a) abstractC1408w8).f9724b;
            } else {
                if (!(abstractC1408w8 instanceof b)) {
                    throw new b9.j();
                }
                interfaceC5868a2 = ((b) abstractC1408w8).f9725b;
            }
            D8 d82 = interfaceC5868a2 instanceof D8 ? (D8) interfaceC5868a2 : null;
            D8 d83 = aVar.f9724b;
            d83.getClass();
            return d82 != null && d83.f5115a.a(resolver) == d82.f5115a.a(otherResolver) && d83.f5116b.a(resolver).longValue() == d82.f5116b.a(otherResolver).longValue();
        }
        if (!(this instanceof b)) {
            throw new b9.j();
        }
        b bVar = (b) this;
        if (abstractC1408w8 instanceof a) {
            interfaceC5868a = ((a) abstractC1408w8).f9724b;
        } else {
            if (!(abstractC1408w8 instanceof b)) {
                throw new b9.j();
            }
            interfaceC5868a = ((b) abstractC1408w8).f9725b;
        }
        N8 n82 = interfaceC5868a instanceof N8 ? (N8) interfaceC5868a : null;
        N8 n83 = bVar.f9725b;
        n83.getClass();
        return n82 != null && n83.f5938a.a(resolver).doubleValue() == n82.f5938a.a(otherResolver).doubleValue();
    }

    public final int b() {
        int iIntValue;
        Integer num = this.f9723a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof a) {
            D8 d82 = ((a) this).f9724b;
            Integer num2 = d82.f5117c;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode2 = d82.f5116b.hashCode() + d82.f5115a.hashCode() + kotlin.jvm.internal.x.a(D8.class).hashCode();
                d82.f5117c = Integer.valueOf(iHashCode2);
                iIntValue = iHashCode2;
            }
        } else {
            if (!(this instanceof b)) {
                throw new b9.j();
            }
            N8 n82 = ((b) this).f9725b;
            Integer num3 = n82.f5939b;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                int iHashCode3 = n82.f5938a.hashCode() + kotlin.jvm.internal.x.a(N8.class).hashCode();
                n82.f5939b = Integer.valueOf(iHashCode3);
                iIntValue = iHashCode3;
            }
        }
        int i = iHashCode + iIntValue;
        this.f9723a = Integer.valueOf(i);
        return i;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1422x8) D7.a.f1071b.f6644W5.getValue()).b(D7.a.f1070a, this);
    }
}
