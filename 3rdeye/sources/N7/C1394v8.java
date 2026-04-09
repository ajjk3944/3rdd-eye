package N7;

import A7.b;
import D7.a;
import N7.AbstractC1408w8;
import N7.C8;
import N7.H8;
import N7.I8;
import N7.S8;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivRadialGradient.kt */
/* renamed from: N7.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394v8 implements InterfaceC5868a {

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC1408w8.b f9627g = new AbstractC1408w8.b(new N8(b.a.a(Double.valueOf(0.5d))));

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC1408w8.b f9628h = new AbstractC1408w8.b(new N8(b.a.a(Double.valueOf(0.5d))));
    public static final I8.b i = new I8.b(new S8(b.a.a(S8.a.FARTHEST_CORNER)));

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1408w8 f9629a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1408w8 f9630b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f9631c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.c<Integer> f9632d;

    /* renamed from: e, reason: collision with root package name */
    public final I8 f9633e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f9634f;

    /* compiled from: DivRadialGradient.kt */
    /* renamed from: N7.v8$a */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final A7.b<Integer> f9635a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<Double> f9636b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f9637c;

        public a(A7.b<Integer> bVar, A7.b<Double> bVar2) {
            this.f9635a = bVar;
            this.f9636b = bVar2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            C8.a aVar = (C8.a) D7.a.f1071b.f6846o6.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            aVar.getClass();
            return C8.a.d(c0011a, this);
        }
    }

    public C1394v8() {
        this(f9627g, f9628h, null, null, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.C1394v8 r10, A7.d r11, A7.d r12) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.C1394v8.a(N7.v8, A7.d, A7.d):boolean");
    }

    public final int b() {
        int i10;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Integer num = this.f9634f;
        if (num != null) {
            return num.intValue();
        }
        int iB = this.f9630b.b() + this.f9629a.b() + kotlin.jvm.internal.x.a(C1394v8.class).hashCode();
        List<a> list = this.f9631c;
        if (list != null) {
            i10 = 0;
            for (a aVar : list) {
                Integer num2 = aVar.f9637c;
                if (num2 != null) {
                    iIntValue3 = num2.intValue();
                } else {
                    int iHashCode = aVar.f9636b.hashCode() + aVar.f9635a.hashCode() + kotlin.jvm.internal.x.a(a.class).hashCode();
                    aVar.f9637c = Integer.valueOf(iHashCode);
                    iIntValue3 = iHashCode;
                }
                i10 += iIntValue3;
            }
        } else {
            i10 = 0;
        }
        int i11 = iB + i10;
        A7.c<Integer> cVar = this.f9632d;
        int iHashCode2 = i11 + (cVar != null ? cVar.hashCode() : 0);
        I8 i82 = this.f9633e;
        Integer num3 = i82.f5475a;
        if (num3 != null) {
            iIntValue2 = num3.intValue();
        } else {
            int iHashCode3 = kotlin.jvm.internal.x.a(i82.getClass()).hashCode();
            if (i82 instanceof I8.a) {
                iIntValue = ((I8.a) i82).f5476b.b();
            } else {
                if (!(i82 instanceof I8.b)) {
                    throw new b9.j();
                }
                S8 s82 = ((I8.b) i82).f5477b;
                Integer num4 = s82.f6208b;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                } else {
                    int iHashCode4 = s82.f6207a.hashCode() + kotlin.jvm.internal.x.a(S8.class).hashCode();
                    s82.f6208b = Integer.valueOf(iHashCode4);
                    iIntValue = iHashCode4;
                }
            }
            int i12 = iHashCode3 + iIntValue;
            i82.f5475a = Integer.valueOf(i12);
            iIntValue2 = i12;
        }
        int i13 = iIntValue2 + iHashCode2;
        this.f9634f = Integer.valueOf(i13);
        return i13;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((H8.a) D7.a.f1071b.f6814l6.getValue()).b(D7.a.f1070a, this);
    }

    public C1394v8(AbstractC1408w8 centerX, AbstractC1408w8 centerY, List<a> list, A7.c<Integer> cVar, I8 radius) {
        kotlin.jvm.internal.l.f(centerX, "centerX");
        kotlin.jvm.internal.l.f(centerY, "centerY");
        kotlin.jvm.internal.l.f(radius, "radius");
        this.f9629a = centerX;
        this.f9630b = centerY;
        this.f9631c = list;
        this.f9632d = cVar;
        this.f9633e = radius;
    }
}
