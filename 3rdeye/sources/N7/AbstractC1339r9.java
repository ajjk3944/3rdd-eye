package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivShape.kt */
/* renamed from: N7.r9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1339r9 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f9078a;

    /* compiled from: DivShape.kt */
    /* renamed from: N7.r9$a */
    public static final class a extends AbstractC1339r9 {

        /* renamed from: b, reason: collision with root package name */
        public final C1250l3 f9079b;

        public a(C1250l3 c1250l3) {
            this.f9079b = c1250l3;
        }
    }

    /* compiled from: DivShape.kt */
    /* renamed from: N7.r9$b */
    public static final class b extends AbstractC1339r9 {

        /* renamed from: b, reason: collision with root package name */
        public final W8 f9080b;

        public b(W8 w82) {
            this.f9080b = w82;
        }
    }

    public final boolean a(AbstractC1339r9 abstractC1339r9, A7.d dVar, A7.d dVar2) {
        InterfaceC5868a interfaceC5868a;
        InterfaceC5868a interfaceC5868a2;
        if (abstractC1339r9 != null) {
            if (this instanceof b) {
                b bVar = (b) this;
                if (abstractC1339r9 instanceof b) {
                    interfaceC5868a2 = ((b) abstractC1339r9).f9080b;
                } else {
                    if (!(abstractC1339r9 instanceof a)) {
                        throw new b9.j();
                    }
                    interfaceC5868a2 = ((a) abstractC1339r9).f9079b;
                }
                return bVar.f9080b.a(interfaceC5868a2 instanceof W8 ? (W8) interfaceC5868a2 : null, dVar, dVar2);
            }
            if (!(this instanceof a)) {
                throw new b9.j();
            }
            a aVar = (a) this;
            if (abstractC1339r9 instanceof b) {
                interfaceC5868a = ((b) abstractC1339r9).f9080b;
            } else {
                if (!(abstractC1339r9 instanceof a)) {
                    throw new b9.j();
                }
                interfaceC5868a = ((a) abstractC1339r9).f9079b;
            }
            C1250l3 c1250l3 = interfaceC5868a instanceof C1250l3 ? (C1250l3) interfaceC5868a : null;
            C1250l3 c1250l32 = aVar.f9079b;
            c1250l32.getClass();
            if (c1250l3 != null) {
                A7.b<Integer> bVar2 = c1250l32.f8727a;
                Integer numA = bVar2 != null ? bVar2.a(dVar) : null;
                A7.b<Integer> bVar3 = c1250l3.f8727a;
                if (kotlin.jvm.internal.l.b(numA, bVar3 != null ? bVar3.a(dVar2) : null) && c1250l32.f8728b.a(c1250l3.f8728b, dVar, dVar2)) {
                    C1185ga c1185ga = c1250l3.f8729c;
                    C1185ga c1185ga2 = c1250l32.f8729c;
                    if (c1185ga2 != null ? c1185ga2.a(c1185ga, dVar, dVar2) : c1185ga == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int iIntValue;
        Integer num = this.f9078a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof b) {
            iIntValue = ((b) this).f9080b.b();
        } else {
            if (!(this instanceof a)) {
                throw new b9.j();
            }
            C1250l3 c1250l3 = ((a) this).f9079b;
            Integer num2 = c1250l3.f8730d;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode2 = kotlin.jvm.internal.x.a(C1250l3.class).hashCode();
                A7.b<Integer> bVar = c1250l3.f8727a;
                int iB = c1250l3.f8728b.b() + iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
                C1185ga c1185ga = c1250l3.f8729c;
                int iB2 = iB + (c1185ga != null ? c1185ga.b() : 0);
                c1250l3.f8730d = Integer.valueOf(iB2);
                iIntValue = iB2;
            }
        }
        int i = iHashCode + iIntValue;
        this.f9078a = Integer.valueOf(i);
        return i;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1423x9) D7.a.f1071b.f6570P6.getValue()).b(D7.a.f1070a, this);
    }
}
