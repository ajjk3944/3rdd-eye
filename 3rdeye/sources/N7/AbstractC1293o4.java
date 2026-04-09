package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivDrawable.kt */
/* renamed from: N7.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1293o4 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f8854a;

    /* compiled from: DivDrawable.kt */
    /* renamed from: N7.o4$a */
    public static final class a extends AbstractC1293o4 {

        /* renamed from: b, reason: collision with root package name */
        public final C1353s9 f8855b;

        public a(C1353s9 c1353s9) {
            this.f8855b = c1353s9;
        }
    }

    public final boolean a(AbstractC1293o4 abstractC1293o4, A7.d dVar, A7.d dVar2) {
        if (abstractC1293o4 != null) {
            if (!(this instanceof a)) {
                throw new b9.j();
            }
            a aVar = (a) this;
            if (!(abstractC1293o4 instanceof a)) {
                throw new b9.j();
            }
            C1353s9 c1353s9 = ((a) abstractC1293o4).f8855b;
            if (c1353s9 == null) {
                c1353s9 = null;
            }
            C1353s9 c1353s92 = aVar.f8855b;
            c1353s92.getClass();
            if (c1353s9 != null && c1353s92.f9187a.a(dVar).intValue() == c1353s9.f9187a.a(dVar2).intValue() && c1353s92.f9188b.a(c1353s9.f9188b, dVar, dVar2)) {
                C1185ga c1185ga = c1353s9.f9189c;
                C1185ga c1185ga2 = c1353s92.f9189c;
                if (c1185ga2 != null ? c1185ga2.a(c1185ga, dVar, dVar2) : c1185ga == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        int iIntValue;
        Integer num = this.f8854a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (!(this instanceof a)) {
            throw new b9.j();
        }
        C1353s9 c1353s9 = ((a) this).f8855b;
        Integer num2 = c1353s9.f9190d;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            int iB = c1353s9.f9188b.b() + c1353s9.f9187a.hashCode() + kotlin.jvm.internal.x.a(C1353s9.class).hashCode();
            C1185ga c1185ga = c1353s9.f9189c;
            int iB2 = iB + (c1185ga != null ? c1185ga.b() : 0);
            c1353s9.f9190d = Integer.valueOf(iB2);
            iIntValue = iB2;
        }
        int i = iIntValue + iHashCode;
        this.f8854a = Integer.valueOf(i);
        return i;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1307p4) D7.a.f1071b.f6598S2.getValue()).b(D7.a.f1070a, this);
    }
}
