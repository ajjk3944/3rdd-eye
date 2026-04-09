package Wh;

import Uh.c;
import Uh.j;
import Uh.k;
import Uh.x;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: A, reason: collision with root package name */
    public static final C0908b f23921A;

    /* renamed from: B, reason: collision with root package name */
    public static final C0908b f23922B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0908b f23923C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0908b f23924D;

    /* renamed from: E, reason: collision with root package name */
    public static final C0908b f23925E;

    /* renamed from: F, reason: collision with root package name */
    public static final C0908b f23926F;

    /* renamed from: G, reason: collision with root package name */
    public static final C0908b f23927G;

    /* renamed from: H, reason: collision with root package name */
    public static final C0908b f23928H;

    /* renamed from: I, reason: collision with root package name */
    public static final C0908b f23929I;

    /* renamed from: J, reason: collision with root package name */
    public static final C0908b f23930J;

    /* renamed from: K, reason: collision with root package name */
    public static final C0908b f23931K;

    /* renamed from: L, reason: collision with root package name */
    public static final C0908b f23932L;

    /* renamed from: M, reason: collision with root package name */
    public static final C0908b f23933M;

    /* renamed from: N, reason: collision with root package name */
    public static final C0908b f23934N;

    /* renamed from: O, reason: collision with root package name */
    public static final C0908b f23935O;

    /* renamed from: P, reason: collision with root package name */
    public static final C0908b f23936P;

    /* renamed from: a, reason: collision with root package name */
    public static final C0908b f23937a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0908b f23938b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0908b f23939c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f23940d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f23941e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f23942f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0908b f23943g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0908b f23944h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0908b f23945i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0908b f23946j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0908b f23947k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0908b f23948l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0908b f23949m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0908b f23950n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0908b f23951o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f23952p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0908b f23953q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0908b f23954r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0908b f23955s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0908b f23956t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0908b f23957u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0908b f23958v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0908b f23959w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0908b f23960x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0908b f23961y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0908b f23962z;

    /* renamed from: Wh.b$b, reason: collision with other inner class name */
    public static class C0908b extends d {
        public C0908b(int i10) {
            super(i10, 1);
        }

        @Override // Wh.b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f23964a)) != 0);
        }

        @Override // Wh.b.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f23964a;
            }
            return 0;
        }
    }

    private static class c extends d {

        /* renamed from: c, reason: collision with root package name */
        private final i.a[] f23963c;

        public c(int i10, i.a[] aVarArr) {
            super(i10, g(aVarArr));
            this.f23963c = aVarArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static int g(Object[] objArr) {
            if (objArr == null) {
                f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + objArr.getClass());
        }

        @Override // Wh.b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public i.a d(int i10) {
            int i11 = (1 << this.f23965b) - 1;
            int i12 = this.f23964a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (i.a aVar : this.f23963c) {
                if (aVar.getNumber() == i13) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // Wh.b.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(i.a aVar) {
            return aVar.getNumber() << this.f23964a;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f23964a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23965b;

        public static d a(d dVar, i.a[] aVarArr) {
            return new c(dVar.f23964a + dVar.f23965b, aVarArr);
        }

        public static C0908b b(d dVar) {
            return new C0908b(dVar.f23964a + dVar.f23965b);
        }

        public static C0908b c() {
            return new C0908b(0);
        }

        public abstract Object d(int i10);

        public abstract int e(Object obj);

        private d(int i10, int i11) {
            this.f23964a = i10;
            this.f23965b = i11;
        }
    }

    static {
        C0908b c0908bC = d.c();
        f23937a = c0908bC;
        f23938b = d.b(c0908bC);
        C0908b c0908bC2 = d.c();
        f23939c = c0908bC2;
        d dVarA = d.a(c0908bC2, x.values());
        f23940d = dVarA;
        d dVarA2 = d.a(dVarA, k.values());
        f23941e = dVarA2;
        d dVarA3 = d.a(dVarA2, c.EnumC0834c.values());
        f23942f = dVarA3;
        C0908b c0908bB = d.b(dVarA3);
        f23943g = c0908bB;
        C0908b c0908bB2 = d.b(c0908bB);
        f23944h = c0908bB2;
        C0908b c0908bB3 = d.b(c0908bB2);
        f23945i = c0908bB3;
        C0908b c0908bB4 = d.b(c0908bB3);
        f23946j = c0908bB4;
        C0908b c0908bB5 = d.b(c0908bB4);
        f23947k = c0908bB5;
        C0908b c0908bB6 = d.b(c0908bB5);
        f23948l = c0908bB6;
        f23949m = d.b(c0908bB6);
        C0908b c0908bB7 = d.b(dVarA);
        f23950n = c0908bB7;
        f23951o = d.b(c0908bB7);
        d dVarA4 = d.a(dVarA2, j.values());
        f23952p = dVarA4;
        C0908b c0908bB8 = d.b(dVarA4);
        f23953q = c0908bB8;
        C0908b c0908bB9 = d.b(c0908bB8);
        f23954r = c0908bB9;
        C0908b c0908bB10 = d.b(c0908bB9);
        f23955s = c0908bB10;
        C0908b c0908bB11 = d.b(c0908bB10);
        f23956t = c0908bB11;
        C0908b c0908bB12 = d.b(c0908bB11);
        f23957u = c0908bB12;
        C0908b c0908bB13 = d.b(c0908bB12);
        f23958v = c0908bB13;
        C0908b c0908bB14 = d.b(c0908bB13);
        f23959w = c0908bB14;
        f23960x = d.b(c0908bB14);
        C0908b c0908bB15 = d.b(dVarA4);
        f23961y = c0908bB15;
        C0908b c0908bB16 = d.b(c0908bB15);
        f23962z = c0908bB16;
        C0908b c0908bB17 = d.b(c0908bB16);
        f23921A = c0908bB17;
        C0908b c0908bB18 = d.b(c0908bB17);
        f23922B = c0908bB18;
        C0908b c0908bB19 = d.b(c0908bB18);
        f23923C = c0908bB19;
        C0908b c0908bB20 = d.b(c0908bB19);
        f23924D = c0908bB20;
        C0908b c0908bB21 = d.b(c0908bB20);
        f23925E = c0908bB21;
        C0908b c0908bB22 = d.b(c0908bB21);
        f23926F = c0908bB22;
        f23927G = d.b(c0908bB22);
        C0908b c0908bB23 = d.b(c0908bC2);
        f23928H = c0908bB23;
        C0908b c0908bB24 = d.b(c0908bB23);
        f23929I = c0908bB24;
        f23930J = d.b(c0908bB24);
        C0908b c0908bB25 = d.b(dVarA2);
        f23931K = c0908bB25;
        C0908b c0908bB26 = d.b(c0908bB25);
        f23932L = c0908bB26;
        f23933M = d.b(c0908bB26);
        C0908b c0908bC3 = d.c();
        f23934N = c0908bC3;
        f23935O = d.b(c0908bC3);
        f23936P = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Wh.b.a(int):void");
    }

    public static int b(boolean z10, x xVar, k kVar, boolean z11, boolean z12, boolean z13) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f23939c.e(Boolean.valueOf(z10)) | f23941e.e(kVar) | f23940d.e(xVar) | f23931K.e(Boolean.valueOf(z11)) | f23932L.e(Boolean.valueOf(z12)) | f23933M.e(Boolean.valueOf(z13));
    }
}
