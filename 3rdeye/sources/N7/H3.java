package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivCount.kt */
/* loaded from: classes.dex */
public abstract class H3 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5386a;

    /* compiled from: DivCount.kt */
    public static final class a extends H3 {

        /* renamed from: b, reason: collision with root package name */
        public final P4 f5387b;

        public a(P4 p42) {
            this.f5387b = p42;
        }
    }

    /* compiled from: DivCount.kt */
    public static final class b extends H3 {

        /* renamed from: b, reason: collision with root package name */
        public final O5 f5388b;

        public b(O5 o52) {
            this.f5388b = o52;
        }
    }

    public final boolean a(H3 h32, A7.d resolver, A7.d otherResolver) {
        InterfaceC5868a interfaceC5868a;
        InterfaceC5868a interfaceC5868a2;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (h32 == null) {
            return false;
        }
        if (this instanceof b) {
            b bVar = (b) this;
            if (h32 instanceof b) {
                interfaceC5868a2 = ((b) h32).f5388b;
            } else {
                if (!(h32 instanceof a)) {
                    throw new b9.j();
                }
                interfaceC5868a2 = ((a) h32).f5387b;
            }
            O5 o52 = interfaceC5868a2 instanceof O5 ? (O5) interfaceC5868a2 : null;
            bVar.f5388b.getClass();
            return o52 != null;
        }
        if (!(this instanceof a)) {
            throw new b9.j();
        }
        a aVar = (a) this;
        if (h32 instanceof b) {
            interfaceC5868a = ((b) h32).f5388b;
        } else {
            if (!(h32 instanceof a)) {
                throw new b9.j();
            }
            interfaceC5868a = ((a) h32).f5387b;
        }
        P4 p42 = interfaceC5868a instanceof P4 ? (P4) interfaceC5868a : null;
        P4 p43 = aVar.f5387b;
        p43.getClass();
        return p42 != null && p43.f6004a.a(resolver).longValue() == p42.f6004a.a(otherResolver).longValue();
    }

    public final int b() {
        int iIntValue;
        Integer num = this.f5386a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof b) {
            O5 o52 = ((b) this).f5388b;
            Integer num2 = o52.f5951a;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode2 = kotlin.jvm.internal.x.a(O5.class).hashCode();
                o52.f5951a = Integer.valueOf(iHashCode2);
                iIntValue = iHashCode2;
            }
        } else {
            if (!(this instanceof a)) {
                throw new b9.j();
            }
            P4 p42 = ((a) this).f5387b;
            Integer num3 = p42.f6005b;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                int iHashCode3 = p42.f6004a.hashCode() + kotlin.jvm.internal.x.a(P4.class).hashCode();
                p42.f6005b = Integer.valueOf(iHashCode3);
                iIntValue = iHashCode3;
            }
        }
        int i = iHashCode + iIntValue;
        this.f5386a = Integer.valueOf(i);
        return i;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((I3) D7.a.f1071b.f6885s2.getValue()).b(D7.a.f1070a, this);
    }
}
