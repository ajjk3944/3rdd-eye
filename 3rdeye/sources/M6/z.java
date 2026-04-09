package M6;

import N7.G7;

/* compiled from: PercentagePageSizeProvider.kt */
/* loaded from: classes.dex */
public final class z extends n implements u {

    /* renamed from: d, reason: collision with root package name */
    public final float f4320d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4321e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4322f;

    /* compiled from: PercentagePageSizeProvider.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4323a;

        static {
            int[] iArr = new int[G7.a.values().length];
            try {
                iArr[G7.a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G7.a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G7.a.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4323a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(N7.C1324q7 r5, A7.d r6, int r7, M6.j r8, N7.G7.a r9) {
        /*
            r4 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.l.f(r5, r0)
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.l.f(r6, r0)
            r4.<init>(r7, r8, r9)
            N7.V7 r5 = r5.f8990a
            A7.b<java.lang.Double> r5 = r5.f7575a
            java.lang.Object r5 = r5.a(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            double r0 = (double) r7
            double r0 = r0 * r5
            r2 = 100
            double r2 = (double) r2
            double r0 = r0 / r2
            float r0 = (float) r0
            r4.f4320d = r0
            int[] r1 = M6.z.a.f4323a
            int r9 = r9.ordinal()
            r9 = r1[r9]
            r1 = 1
            if (r9 == r1) goto L46
            r2 = 2
            if (r9 == r2) goto L41
            r2 = 3
            if (r9 != r2) goto L3b
            float r7 = (float) r7
            float r8 = r8.f4258h
        L38:
            float r7 = r7 - r8
            float r7 = r7 - r0
            goto L4a
        L3b:
            b9.j r5 = new b9.j
            r5.<init>()
            throw r5
        L41:
            float r7 = (float) r7
            float r7 = r7 - r0
            float r8 = (float) r2
            float r7 = r7 / r8
            goto L4a
        L46:
            float r7 = (float) r7
            float r8 = r8.f4257g
            goto L38
        L4a:
            r4.f4321e = r7
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L53
            goto L54
        L53:
            r1 = 0
        L54:
            r4.f4322f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.z.<init>(N7.q7, A7.d, int, M6.j, N7.G7$a):void");
    }

    @Override // M6.u
    public final boolean a() {
        return this.f4322f;
    }

    @Override // M6.u
    public final float b() {
        return this.f4321e;
    }

    @Override // M6.u
    public final float c() {
        return this.f4320d;
    }

    @Override // M6.n
    public final Float d(int i) {
        return Float.valueOf(this.f4320d);
    }
}
