package N7;

import A7.b;
import N7.Ab;
import N7.C1453zb;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTooltip.kt */
/* renamed from: N7.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1439yb implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final C1332r2 f9975a;

    /* renamed from: b, reason: collision with root package name */
    public final C1332r2 f9976b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<String> f9977c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Boolean> f9978d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f9979e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.b<Long> f9980f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9981g;

    /* renamed from: h, reason: collision with root package name */
    public final Ab f9982h;
    public final C1325q8 i;

    /* renamed from: j, reason: collision with root package name */
    public final A7.b<a> f9983j;

    /* renamed from: k, reason: collision with root package name */
    public final List<C1175g0> f9984k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f9985l;

    /* compiled from: DivTooltip.kt */
    /* renamed from: N7.yb$a */
    public enum a {
        LEFT("left"),
        TOP_LEFT("top-left"),
        TOP("top"),
        TOP_RIGHT("top-right"),
        RIGHT("right"),
        BOTTOM_RIGHT("bottom-right"),
        BOTTOM("bottom"),
        BOTTOM_LEFT("bottom-left"),
        CENTER("center");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f9987g;
        public static final p9.l<String, a> FROM_STRING = C0115a.f9986g;

        /* compiled from: DivTooltip.kt */
        /* renamed from: N7.yb$a$a, reason: collision with other inner class name */
        public static final class C0115a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0115a f9986g = new C0115a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.LEFT;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.TOP_LEFT;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.TOP;
                if (value.equals(aVar3.value)) {
                    return aVar3;
                }
                a aVar4 = a.TOP_RIGHT;
                if (value.equals(aVar4.value)) {
                    return aVar4;
                }
                a aVar5 = a.RIGHT;
                if (value.equals(aVar5.value)) {
                    return aVar5;
                }
                a aVar6 = a.BOTTOM_RIGHT;
                if (value.equals(aVar6.value)) {
                    return aVar6;
                }
                a aVar7 = a.BOTTOM;
                if (value.equals(aVar7.value)) {
                    return aVar7;
                }
                a aVar8 = a.BOTTOM_LEFT;
                if (value.equals(aVar8.value)) {
                    return aVar8;
                }
                a aVar9 = a.CENTER;
                if (value.equals(aVar9.value)) {
                    return aVar9;
                }
                return null;
            }
        }

        /* compiled from: DivTooltip.kt */
        /* renamed from: N7.yb$a$b */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f9987g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivTooltip.kt */
        /* renamed from: N7.yb$a$c */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    static {
        new b.C0000b(Boolean.TRUE);
        new b.C0000b(5000L);
        new Ab.a(new Eb());
    }

    public C1439yb(C1332r2 c1332r2, C1332r2 c1332r22, A7.b<String> bVar, A7.b<Boolean> closeByTapOutside, Z z10, A7.b<Long> duration, String str, Ab ab, C1325q8 c1325q8, A7.b<a> bVar2, List<C1175g0> list) {
        kotlin.jvm.internal.l.f(closeByTapOutside, "closeByTapOutside");
        kotlin.jvm.internal.l.f(duration, "duration");
        this.f9975a = c1332r2;
        this.f9976b = c1332r22;
        this.f9977c = bVar;
        this.f9978d = closeByTapOutside;
        this.f9979e = z10;
        this.f9980f = duration;
        this.f9981g = str;
        this.f9982h = ab;
        this.i = c1325q8;
        this.f9983j = bVar2;
        this.f9984k = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.C1439yb r8, A7.d r9, A7.d r10) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.C1439yb.a(N7.yb, A7.d, A7.d):boolean");
    }

    public final int b() {
        int iHashCode;
        int iIntValue;
        int iIntValue2;
        Integer num = this.f9985l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode2 = kotlin.jvm.internal.x.a(C1439yb.class).hashCode();
        int iB = 0;
        C1332r2 c1332r2 = this.f9975a;
        int iB2 = iHashCode2 + (c1332r2 != null ? c1332r2.b() : 0);
        C1332r2 c1332r22 = this.f9976b;
        int iB3 = iB2 + (c1332r22 != null ? c1332r22.b() : 0);
        A7.b<String> bVar = this.f9977c;
        int iHashCode3 = this.f9981g.hashCode() + this.f9980f.hashCode() + this.f9979e.b() + this.f9978d.hashCode() + iB3 + (bVar != null ? bVar.hashCode() : 0);
        Ab ab = this.f9982h;
        Integer num2 = ab.f4825a;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            int iHashCode4 = kotlin.jvm.internal.x.a(ab.getClass()).hashCode();
            if (ab instanceof Ab.b) {
                Jb jb = ((Ab.b) ab).f4827b;
                Integer num3 = jb.f5607a;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                    int i = iHashCode4 + iIntValue;
                    ab.f4825a = Integer.valueOf(i);
                    iIntValue2 = i;
                } else {
                    iHashCode = kotlin.jvm.internal.x.a(Jb.class).hashCode();
                    jb.f5607a = Integer.valueOf(iHashCode);
                    iIntValue = iHashCode;
                    int i10 = iHashCode4 + iIntValue;
                    ab.f4825a = Integer.valueOf(i10);
                    iIntValue2 = i10;
                }
            } else {
                if (!(ab instanceof Ab.a)) {
                    throw new b9.j();
                }
                Eb eb = ((Ab.a) ab).f4826b;
                Integer num4 = eb.f5156a;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                    int i102 = iHashCode4 + iIntValue;
                    ab.f4825a = Integer.valueOf(i102);
                    iIntValue2 = i102;
                } else {
                    iHashCode = kotlin.jvm.internal.x.a(Eb.class).hashCode();
                    eb.f5156a = Integer.valueOf(iHashCode);
                    iIntValue = iHashCode;
                    int i1022 = iHashCode4 + iIntValue;
                    ab.f4825a = Integer.valueOf(i1022);
                    iIntValue2 = i1022;
                }
            }
        }
        int i11 = iIntValue2 + iHashCode3;
        C1325q8 c1325q8 = this.i;
        int iHashCode5 = this.f9983j.hashCode() + i11 + (c1325q8 != null ? c1325q8.b() : 0);
        List<C1175g0> list = this.f9984k;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iB += ((C1175g0) it.next()).b();
            }
        }
        int i12 = iHashCode5 + iB;
        this.f9985l = Integer.valueOf(i12);
        return i12;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1453zb.b) D7.a.f1071b.f6572P8.getValue()).b(D7.a.f1070a, this);
    }
}
