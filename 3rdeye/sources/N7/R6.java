package N7;

import A7.b;
import D7.a;
import N7.S6;
import N7.T6;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivLinearGradient.kt */
/* loaded from: classes.dex */
public final class R6 implements InterfaceC5868a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.C0000b f6150e = new b.C0000b(0L);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f6151a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f6152b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.c<Integer> f6153c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f6154d;

    /* compiled from: DivLinearGradient.kt */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final A7.b<Integer> f6155a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<Double> f6156b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f6157c;

        public a(A7.b<Integer> bVar, A7.b<Double> bVar2) {
            this.f6155a = bVar;
            this.f6156b = bVar2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            S6.a aVar = (S6.a) D7.a.f1071b.f6568P4.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            aVar.getClass();
            return S6.a.d(c0011a, this);
        }
    }

    public R6() {
        this(f6150e, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.R6 r10, A7.d r11, A7.d r12) {
        /*
            r9 = this;
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.l.f(r11, r0)
            java.lang.String r0 = "otherResolver"
            kotlin.jvm.internal.l.f(r12, r0)
            r0 = 0
            if (r10 != 0) goto Lf
            goto Lf5
        Lf:
            A7.b<java.lang.Long> r1 = r9.f6151a
            java.lang.Object r1 = r1.a(r11)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            A7.b<java.lang.Long> r3 = r10.f6151a
            java.lang.Object r3 = r3.a(r12)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Lf5
            r1 = 0
            java.util.List<N7.R6$a> r2 = r10.f6152b
            java.util.List<N7.R6$a> r3 = r9.f6152b
            if (r3 == 0) goto La2
            if (r2 != 0) goto L36
            goto Lf5
        L36:
            int r4 = r3.size()
            int r5 = r2.size()
            if (r4 == r5) goto L42
            goto Lf5
        L42:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = r0
        L49:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La4
            java.lang.Object r5 = r3.next()
            int r6 = r4 + 1
            if (r4 < 0) goto L9e
            java.lang.Object r4 = r2.get(r4)
            N7.R6$a r4 = (N7.R6.a) r4
            N7.R6$a r5 = (N7.R6.a) r5
            r5.getClass()
            if (r4 != 0) goto L66
            goto Lf5
        L66:
            A7.b<java.lang.Integer> r7 = r5.f6155a
            java.lang.Object r7 = r7.a(r11)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            A7.b<java.lang.Integer> r8 = r4.f6155a
            java.lang.Object r8 = r8.a(r12)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r7 != r8) goto Lf5
            A7.b<java.lang.Double> r5 = r5.f6156b
            java.lang.Object r5 = r5.a(r11)
            java.lang.Number r5 = (java.lang.Number) r5
            double r7 = r5.doubleValue()
            A7.b<java.lang.Double> r4 = r4.f6156b
            java.lang.Object r4 = r4.a(r12)
            java.lang.Number r4 = (java.lang.Number) r4
            double r4 = r4.doubleValue()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto Lf5
            r4 = r6
            goto L49
        L9e:
            c9.C2092m.a0()
            throw r1
        La2:
            if (r2 != 0) goto Lf5
        La4:
            A7.c<java.lang.Integer> r10 = r10.f6153c
            A7.c<java.lang.Integer> r2 = r9.f6153c
            if (r2 == 0) goto Lf1
            java.util.List r11 = r2.b(r11)
            if (r11 == 0) goto Lf1
            if (r10 == 0) goto Lf5
            java.util.List r10 = r10.b(r12)
            if (r10 != 0) goto Lb9
            goto Lf5
        Lb9:
            int r12 = r11.size()
            int r2 = r10.size()
            if (r12 == r2) goto Lc4
            goto Lf5
        Lc4:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r12 = r0
        Lcb:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r11.next()
            int r3 = r12 + 1
            if (r12 < 0) goto Led
            java.lang.Object r12 = r10.get(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r12) goto Lf5
            r12 = r3
            goto Lcb
        Led:
            c9.C2092m.a0()
            throw r1
        Lf1:
            if (r10 != 0) goto Lf5
        Lf3:
            r10 = 1
            return r10
        Lf5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.R6.a(N7.R6, A7.d, A7.d):boolean");
    }

    public final int b() {
        int i;
        int iIntValue;
        Integer num = this.f6154d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f6151a.hashCode() + kotlin.jvm.internal.x.a(R6.class).hashCode();
        List<a> list = this.f6152b;
        if (list != null) {
            i = 0;
            for (a aVar : list) {
                Integer num2 = aVar.f6157c;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    int iHashCode2 = aVar.f6156b.hashCode() + aVar.f6155a.hashCode() + kotlin.jvm.internal.x.a(a.class).hashCode();
                    aVar.f6157c = Integer.valueOf(iHashCode2);
                    iIntValue = iHashCode2;
                }
                i += iIntValue;
            }
        } else {
            i = 0;
        }
        int i10 = iHashCode + i;
        A7.c<Integer> cVar = this.f6153c;
        int iHashCode3 = i10 + (cVar != null ? cVar.hashCode() : 0);
        this.f6154d = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((T6.a) D7.a.f1071b.f6537M4.getValue()).b(D7.a.f1070a, this);
    }

    public R6(A7.b<Long> angle, List<a> list, A7.c<Integer> cVar) {
        kotlin.jvm.internal.l.f(angle, "angle");
        this.f6151a = angle;
        this.f6152b = list;
        this.f6153c = cVar;
    }
}
