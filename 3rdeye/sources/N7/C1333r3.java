package N7;

import A7.b;
import N7.C1347s3;
import N7.C1361t3;
import c9.C2092m;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivCollectionItemBuilder.kt */
/* renamed from: N7.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1333r3 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<JSONArray> f9032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9033b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f9034c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f9035d;

    /* compiled from: DivCollectionItemBuilder.kt */
    /* renamed from: N7.r3$a */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final Z f9036a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<String> f9037b;

        /* renamed from: c, reason: collision with root package name */
        public final A7.b<Boolean> f9038c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f9039d;

        static {
            new b.C0000b(Boolean.TRUE);
        }

        public a(Z z10, A7.b<String> bVar, A7.b<Boolean> selector) {
            kotlin.jvm.internal.l.f(selector, "selector");
            this.f9036a = z10;
            this.f9037b = bVar;
            this.f9038c = selector;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((C1361t3.a) D7.a.f1071b.f6720d2.getValue()).b(D7.a.f1070a, this);
        }
    }

    public C1333r3(A7.b<JSONArray> bVar, String str, List<a> list) {
        this.f9032a = bVar;
        this.f9033b = str;
        this.f9034c = list;
    }

    public final boolean a(C1333r3 c1333r3, A7.d dVar, A7.d dVar2) {
        if (c1333r3 != null && kotlin.jvm.internal.l.b(this.f9032a.a(dVar), c1333r3.f9032a.a(dVar2)) && this.f9033b.equals(c1333r3.f9033b)) {
            List<a> list = this.f9034c;
            int size = list.size();
            List<a> list2 = c1333r3.f9034c;
            if (size == list2.size()) {
                int i = 0;
                for (Object obj : list) {
                    int i10 = i + 1;
                    if (i < 0) {
                        C2092m.a0();
                        throw null;
                    }
                    a aVar = list2.get(i);
                    a aVar2 = (a) obj;
                    aVar2.getClass();
                    if (aVar != null && aVar2.f9036a.a(aVar.f9036a, dVar, dVar2)) {
                        A7.b<String> bVar = aVar2.f9037b;
                        String strA = bVar != null ? bVar.a(dVar) : null;
                        A7.b<String> bVar2 = aVar.f9037b;
                        if (kotlin.jvm.internal.l.b(strA, bVar2 != null ? bVar2.a(dVar2) : null) && aVar2.f9038c.a(dVar).booleanValue() == aVar.f9038c.a(dVar2).booleanValue()) {
                            i = i10;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int b() {
        int iIntValue;
        Integer num = this.f9035d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f9033b.hashCode() + this.f9032a.hashCode() + kotlin.jvm.internal.x.a(C1333r3.class).hashCode();
        int i = 0;
        for (a aVar : this.f9034c) {
            Integer num2 = aVar.f9039d;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iB = aVar.f9036a.b() + kotlin.jvm.internal.x.a(a.class).hashCode();
                A7.b<String> bVar = aVar.f9037b;
                int iHashCode2 = aVar.f9038c.hashCode() + iB + (bVar != null ? bVar.hashCode() : 0);
                aVar.f9039d = Integer.valueOf(iHashCode2);
                iIntValue = iHashCode2;
            }
            i += iIntValue;
        }
        int i10 = iHashCode + i;
        this.f9035d = Integer.valueOf(i10);
        return i10;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1347s3.a) D7.a.f1071b.f6684a2.getValue()).b(D7.a.f1070a, this);
    }
}
