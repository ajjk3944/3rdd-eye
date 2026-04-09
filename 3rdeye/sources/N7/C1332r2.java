package N7;

import A7.b;
import N7.C1374u2;
import N7.H3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAnimation.kt */
/* renamed from: N7.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332r2 implements InterfaceC5868a {

    /* renamed from: k, reason: collision with root package name */
    public static final b.C0000b f9018k;

    /* renamed from: l, reason: collision with root package name */
    public static final H3.b f9019l;

    /* renamed from: m, reason: collision with root package name */
    public static final b.C0000b f9020m;

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f9021a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Double> f9022b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f9023c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C1332r2> f9024d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<a> f9025e;

    /* renamed from: f, reason: collision with root package name */
    public final H3 f9026f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.b<Long> f9027g;

    /* renamed from: h, reason: collision with root package name */
    public final A7.b<Double> f9028h;
    public Integer i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f9029j;

    /* compiled from: DivAnimation.kt */
    /* renamed from: N7.r2$a */
    public enum a {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE("native"),
        SET("set"),
        NO_ANIMATION("no_animation");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f9031g;
        public static final p9.l<String, a> FROM_STRING = C0112a.f9030g;

        /* compiled from: DivAnimation.kt */
        /* renamed from: N7.r2$a$a, reason: collision with other inner class name */
        public static final class C0112a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0112a f9030g = new C0112a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.FADE;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.TRANSLATE;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.SCALE;
                if (value.equals(aVar3.value)) {
                    return aVar3;
                }
                a aVar4 = a.NATIVE;
                if (value.equals(aVar4.value)) {
                    return aVar4;
                }
                a aVar5 = a.SET;
                if (value.equals(aVar5.value)) {
                    return aVar5;
                }
                a aVar6 = a.NO_ANIMATION;
                if (value.equals(aVar6.value)) {
                    return aVar6;
                }
                return null;
            }
        }

        /* compiled from: DivAnimation.kt */
        /* renamed from: N7.r2$a$b */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f9031g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivAnimation.kt */
        /* renamed from: N7.r2$a$c */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    static {
        b.a.a(300L);
        f9018k = b.a.a(EnumC1360t2.SPRING);
        f9019l = new H3.b(new O5());
        f9020m = b.a.a(0L);
    }

    public C1332r2(A7.b<Long> duration, A7.b<Double> bVar, A7.b<EnumC1360t2> interpolator, List<C1332r2> list, A7.b<a> bVar2, H3 repeat, A7.b<Long> startDelay, A7.b<Double> bVar3) {
        kotlin.jvm.internal.l.f(duration, "duration");
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(repeat, "repeat");
        kotlin.jvm.internal.l.f(startDelay, "startDelay");
        this.f9021a = duration;
        this.f9022b = bVar;
        this.f9023c = interpolator;
        this.f9024d = list;
        this.f9025e = bVar2;
        this.f9026f = repeat;
        this.f9027g = startDelay;
        this.f9028h = bVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.C1332r2 r8, A7.d r9, A7.d r10) {
        /*
            r7 = this;
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "otherResolver"
            kotlin.jvm.internal.l.f(r10, r0)
            r0 = 0
            if (r8 != 0) goto Lf
            goto Led
        Lf:
            A7.b<java.lang.Long> r1 = r7.f9021a
            java.lang.Object r1 = r1.a(r9)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            A7.b<java.lang.Long> r3 = r8.f9021a
            java.lang.Object r3 = r3.a(r10)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Led
            r1 = 0
            A7.b<java.lang.Double> r2 = r7.f9022b
            if (r2 == 0) goto L37
            java.lang.Object r2 = r2.a(r9)
            java.lang.Double r2 = (java.lang.Double) r2
            goto L38
        L37:
            r2 = r1
        L38:
            A7.b<java.lang.Double> r3 = r8.f9022b
            if (r3 == 0) goto L43
            java.lang.Object r3 = r3.a(r10)
            java.lang.Double r3 = (java.lang.Double) r3
            goto L44
        L43:
            r3 = r1
        L44:
            boolean r2 = kotlin.jvm.internal.l.a(r2, r3)
            if (r2 == 0) goto Led
            A7.b<N7.t2> r2 = r7.f9023c
            java.lang.Object r2 = r2.a(r9)
            A7.b<N7.t2> r3 = r8.f9023c
            java.lang.Object r3 = r3.a(r10)
            if (r2 != r3) goto Led
            java.util.List<N7.r2> r2 = r8.f9024d
            java.util.List<N7.r2> r3 = r7.f9024d
            if (r3 == 0) goto L98
            if (r2 != 0) goto L62
            goto Led
        L62:
            int r4 = r3.size()
            int r5 = r2.size()
            if (r4 == r5) goto L6e
            goto Led
        L6e:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = r0
        L75:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r3.next()
            int r6 = r4 + 1
            if (r4 < 0) goto L94
            java.lang.Object r4 = r2.get(r4)
            N7.r2 r4 = (N7.C1332r2) r4
            N7.r2 r5 = (N7.C1332r2) r5
            boolean r4 = r5.a(r4, r9, r10)
            if (r4 != 0) goto L92
            goto Led
        L92:
            r4 = r6
            goto L75
        L94:
            c9.C2092m.a0()
            throw r1
        L98:
            if (r2 != 0) goto Led
        L9a:
            A7.b<N7.r2$a> r2 = r7.f9025e
            java.lang.Object r2 = r2.a(r9)
            A7.b<N7.r2$a> r3 = r8.f9025e
            java.lang.Object r3 = r3.a(r10)
            if (r2 != r3) goto Led
            N7.H3 r2 = r7.f9026f
            N7.H3 r3 = r8.f9026f
            boolean r2 = r2.a(r3, r9, r10)
            if (r2 == 0) goto Led
            A7.b<java.lang.Long> r2 = r7.f9027g
            java.lang.Object r2 = r2.a(r9)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            A7.b<java.lang.Long> r4 = r8.f9027g
            java.lang.Object r4 = r4.a(r10)
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Led
            A7.b<java.lang.Double> r2 = r7.f9028h
            if (r2 == 0) goto Ld9
            java.lang.Object r9 = r2.a(r9)
            java.lang.Double r9 = (java.lang.Double) r9
            goto Lda
        Ld9:
            r9 = r1
        Lda:
            A7.b<java.lang.Double> r8 = r8.f9028h
            if (r8 == 0) goto Le5
            java.lang.Object r8 = r8.a(r10)
            r1 = r8
            java.lang.Double r1 = (java.lang.Double) r1
        Le5:
            boolean r8 = kotlin.jvm.internal.l.a(r9, r1)
            if (r8 == 0) goto Led
            r8 = 1
            return r8
        Led:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.C1332r2.a(N7.r2, A7.d, A7.d):boolean");
    }

    public final int b() {
        int iHashCode;
        Integer num = this.f9029j;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.i;
        int iB = 0;
        if (num2 != null) {
            iHashCode = num2.intValue();
        } else {
            int iHashCode2 = this.f9021a.hashCode() + kotlin.jvm.internal.x.a(C1332r2.class).hashCode();
            A7.b<Double> bVar = this.f9022b;
            int iHashCode3 = this.f9027g.hashCode() + this.f9026f.b() + this.f9025e.hashCode() + this.f9023c.hashCode() + iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
            A7.b<Double> bVar2 = this.f9028h;
            iHashCode = (bVar2 != null ? bVar2.hashCode() : 0) + iHashCode3;
            this.i = Integer.valueOf(iHashCode);
        }
        List<C1332r2> list = this.f9024d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iB += ((C1332r2) it.next()).b();
            }
        }
        int i = iHashCode + iB;
        this.f9029j = Integer.valueOf(i);
        return i;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1374u2.c) D7.a.f1071b.f6831n1.getValue()).b(D7.a.f1070a, this);
    }

    public /* synthetic */ C1332r2(b.C0000b c0000b, b.C0000b c0000b2, b.C0000b c0000b3, b.C0000b c0000b4) {
        this(c0000b, c0000b2, f9018k, null, c0000b3, f9019l, f9020m, c0000b4);
    }
}
