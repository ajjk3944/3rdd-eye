package M6;

import N7.G7;

/* compiled from: NeighbourPageSizeProvider.kt */
/* loaded from: classes.dex */
public final class v extends n implements u {

    /* renamed from: d, reason: collision with root package name */
    public final float f4303d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4304e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4305f;

    /* compiled from: NeighbourPageSizeProvider.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4306a;

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
            f4306a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(N7.Y6 r2, A7.d r3, android.util.DisplayMetrics r4, int r5, float r6, M6.j r7, N7.G7.a r8) {
        /*
            r1 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.l.f(r2, r0)
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.l.f(r3, r0)
            r1.<init>(r5, r7, r8)
            N7.W4 r2 = r2.f7771a
            float r2 = K6.C0713c.j0(r2, r4, r3)
            float r6 = r6 + r2
            r1.f4303d = r6
            int[] r3 = M6.v.a.f4306a
            int r4 = r8.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L37
            r8 = 2
            if (r3 == r8) goto L33
            r8 = 3
            if (r3 != r8) goto L2d
            float r3 = (float) r5
            float r5 = r7.f4258h
        L2a:
            float r3 = r3 - r5
        L2b:
            float r3 = r3 - r6
            goto L3b
        L2d:
            b9.j r2 = new b9.j
            r2.<init>()
            throw r2
        L33:
            float r3 = (float) r5
            float r5 = (float) r8
            float r6 = r6 * r5
            goto L2b
        L37:
            float r3 = (float) r5
            float r5 = r7.f4257g
            goto L2a
        L3b:
            r1.f4304e = r3
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L43
            goto L44
        L43:
            r4 = 0
        L44:
            r1.f4305f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.v.<init>(N7.Y6, A7.d, android.util.DisplayMetrics, int, float, M6.j, N7.G7$a):void");
    }

    @Override // M6.u
    public final boolean a() {
        return this.f4305f;
    }

    @Override // M6.u
    public final float b() {
        return this.f4303d;
    }

    @Override // M6.u
    public final float c() {
        return this.f4304e;
    }

    @Override // M6.n
    public final Float d(int i) {
        return Float.valueOf(this.f4304e);
    }
}
