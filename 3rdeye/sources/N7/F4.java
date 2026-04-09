package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFilter.kt */
/* loaded from: classes.dex */
public abstract class F4 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5170a;

    /* compiled from: DivFilter.kt */
    public static final class a extends F4 {

        /* renamed from: b, reason: collision with root package name */
        public final U2 f5171b;

        public a(U2 u22) {
            this.f5171b = u22;
        }
    }

    /* compiled from: DivFilter.kt */
    public static final class b extends F4 {

        /* renamed from: b, reason: collision with root package name */
        public final J4 f5172b;

        public b(J4 j4) {
            this.f5172b = j4;
        }
    }

    public final boolean a(F4 f42, A7.d resolver, A7.d otherResolver) {
        InterfaceC5868a interfaceC5868a;
        InterfaceC5868a interfaceC5868a2;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (f42 == null) {
            return false;
        }
        if (this instanceof a) {
            a aVar = (a) this;
            if (f42 instanceof a) {
                interfaceC5868a2 = ((a) f42).f5171b;
            } else {
                if (!(f42 instanceof b)) {
                    throw new b9.j();
                }
                interfaceC5868a2 = ((b) f42).f5172b;
            }
            U2 u22 = interfaceC5868a2 instanceof U2 ? (U2) interfaceC5868a2 : null;
            U2 u23 = aVar.f5171b;
            u23.getClass();
            return u22 != null && u23.f6372a.a(resolver).longValue() == u22.f6372a.a(otherResolver).longValue();
        }
        if (!(this instanceof b)) {
            throw new b9.j();
        }
        b bVar = (b) this;
        if (f42 instanceof a) {
            interfaceC5868a = ((a) f42).f5171b;
        } else {
            if (!(f42 instanceof b)) {
                throw new b9.j();
            }
            interfaceC5868a = ((b) f42).f5172b;
        }
        J4 j4 = interfaceC5868a instanceof J4 ? (J4) interfaceC5868a : null;
        bVar.f5172b.getClass();
        return j4 != null;
    }

    public final int b() {
        int iHashCode;
        int iIntValue;
        Integer num = this.f5170a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode2 = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof a) {
            U2 u22 = ((a) this).f5171b;
            Integer num2 = u22.f6373b;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iHashCode = kotlin.jvm.internal.x.a(U2.class).hashCode() + u22.f6372a.hashCode();
                u22.f6373b = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else {
            if (!(this instanceof b)) {
                throw new b9.j();
            }
            J4 j4 = ((b) this).f5172b;
            Integer num3 = j4.f5569a;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iHashCode = kotlin.jvm.internal.x.a(J4.class).hashCode();
                j4.f5569a = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        }
        int i = iHashCode2 + iIntValue;
        this.f5170a = Integer.valueOf(i);
        return i;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((G4) D7.a.f1071b.f6768h3.getValue()).b(D7.a.f1070a, this);
    }
}
