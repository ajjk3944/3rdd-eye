package z;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8680c {

    /* renamed from: a, reason: collision with root package name */
    public static final C8680c f66832a = new C8680c();

    /* renamed from: b, reason: collision with root package name */
    private static final e f66833b = new k();

    /* renamed from: c, reason: collision with root package name */
    private static final e f66834c = new d();

    /* renamed from: d, reason: collision with root package name */
    private static final m f66835d = new l();

    /* renamed from: e, reason: collision with root package name */
    private static final m f66836e = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final f f66837f = new C2375c();

    /* renamed from: g, reason: collision with root package name */
    private static final f f66838g = new i();

    /* renamed from: h, reason: collision with root package name */
    private static final f f66839h = new h();

    /* renamed from: i, reason: collision with root package name */
    private static final f f66840i = new g();

    /* renamed from: z.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f66841a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final e f66842b = new b();

        /* renamed from: c, reason: collision with root package name */
        private static final e f66843c = new C2373a();

        /* renamed from: d, reason: collision with root package name */
        private static final e f66844d = new C2374c();

        /* renamed from: e, reason: collision with root package name */
        private static final e f66845e = new e();

        /* renamed from: f, reason: collision with root package name */
        private static final e f66846f = new f();

        /* renamed from: g, reason: collision with root package name */
        private static final e f66847g = new d();

        /* renamed from: z.c$a$a, reason: collision with other inner class name */
        public static final class C2373a implements e {
            C2373a() {
            }

            @Override // z.C8680c.e
            public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
                C8680c.f66832a.h(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* renamed from: z.c$a$b */
        public static final class b implements e {
            b() {
            }

            @Override // z.C8680c.e
            public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
                C8680c.f66832a.i(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* renamed from: z.c$a$c, reason: collision with other inner class name */
        public static final class C2374c implements e {
            C2374c() {
            }

            @Override // z.C8680c.e
            public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
                C8680c.f66832a.j(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        /* renamed from: z.c$a$d */
        public static final class d implements e {
            d() {
            }

            @Override // z.C8680c.e
            public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
                C8680c.f66832a.k(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        /* renamed from: z.c$a$e */
        public static final class e implements e {
            e() {
            }

            @Override // z.C8680c.e
            public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
                C8680c.f66832a.l(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        /* renamed from: z.c$a$f */
        public static final class f implements e {
            f() {
            }

            @Override // z.C8680c.e
            public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
                C8680c.f66832a.m(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        private a() {
        }

        public final e a() {
            return f66842b;
        }

        public final e b() {
            return f66844d;
        }

        public final f c(float f10) {
            return new j(f10, false, null, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: z.c$b */
    public static final class b implements m {
        b() {
        }

        @Override // z.C8680c.m
        public void b(Y0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C8680c.f66832a.j(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* renamed from: z.c$c, reason: collision with other inner class name */
    public static final class C2375c implements f {

        /* renamed from: a, reason: collision with root package name */
        private final float f66848a = Y0.h.j(0);

        C2375c() {
        }

        @Override // z.C8680c.e, z.C8680c.m
        public float a() {
            return this.f66848a;
        }

        @Override // z.C8680c.m
        public void b(Y0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C8680c.f66832a.h(i10, iArr, iArr2, false);
        }

        @Override // z.C8680c.e
        public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
            if (tVar == Y0.t.Ltr) {
                C8680c.f66832a.h(i10, iArr, iArr2, false);
            } else {
                C8680c.f66832a.h(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* renamed from: z.c$d */
    public static final class d implements e {
        d() {
        }

        @Override // z.C8680c.e
        public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
            if (tVar == Y0.t.Ltr) {
                C8680c.f66832a.j(i10, iArr, iArr2, false);
            } else {
                C8680c.f66832a.i(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* renamed from: z.c$e */
    public interface e {
        default float a() {
            return Y0.h.j(0);
        }

        void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2);
    }

    /* renamed from: z.c$f */
    public interface f extends e, m {
    }

    /* renamed from: z.c$g */
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final float f66849a = Y0.h.j(0);

        g() {
        }

        @Override // z.C8680c.e, z.C8680c.m
        public float a() {
            return this.f66849a;
        }

        @Override // z.C8680c.m
        public void b(Y0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C8680c.f66832a.k(i10, iArr, iArr2, false);
        }

        @Override // z.C8680c.e
        public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
            if (tVar == Y0.t.Ltr) {
                C8680c.f66832a.k(i10, iArr, iArr2, false);
            } else {
                C8680c.f66832a.k(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* renamed from: z.c$h */
    public static final class h implements f {

        /* renamed from: a, reason: collision with root package name */
        private final float f66850a = Y0.h.j(0);

        h() {
        }

        @Override // z.C8680c.e, z.C8680c.m
        public float a() {
            return this.f66850a;
        }

        @Override // z.C8680c.m
        public void b(Y0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C8680c.f66832a.l(i10, iArr, iArr2, false);
        }

        @Override // z.C8680c.e
        public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
            if (tVar == Y0.t.Ltr) {
                C8680c.f66832a.l(i10, iArr, iArr2, false);
            } else {
                C8680c.f66832a.l(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* renamed from: z.c$i */
    public static final class i implements f {

        /* renamed from: a, reason: collision with root package name */
        private final float f66851a = Y0.h.j(0);

        i() {
        }

        @Override // z.C8680c.e, z.C8680c.m
        public float a() {
            return this.f66851a;
        }

        @Override // z.C8680c.m
        public void b(Y0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C8680c.f66832a.m(i10, iArr, iArr2, false);
        }

        @Override // z.C8680c.e
        public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
            if (tVar == Y0.t.Ltr) {
                C8680c.f66832a.m(i10, iArr, iArr2, false);
            } else {
                C8680c.f66832a.m(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* renamed from: z.c$j */
    public static final class j implements f {

        /* renamed from: a, reason: collision with root package name */
        private final float f66852a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f66853b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC6839p f66854c;

        /* renamed from: d, reason: collision with root package name */
        private final float f66855d;

        public /* synthetic */ j(float f10, boolean z10, InterfaceC6839p interfaceC6839p, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, z10, interfaceC6839p);
        }

        @Override // z.C8680c.e, z.C8680c.m
        public float a() {
            return this.f66855d;
        }

        @Override // z.C8680c.m
        public void b(Y0.d dVar, int i10, int[] iArr, int[] iArr2) {
            c(dVar, i10, iArr, Y0.t.Ltr, iArr2);
        }

        @Override // z.C8680c.e
        public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
            int i11;
            int i12;
            if (iArr.length == 0) {
                return;
            }
            int iX1 = dVar.x1(this.f66852a);
            boolean z10 = this.f66853b && tVar == Y0.t.Rtl;
            C8680c c8680c = C8680c.f66832a;
            if (z10) {
                int length = iArr.length - 1;
                i11 = 0;
                i12 = 0;
                while (-1 < length) {
                    int i13 = iArr[length];
                    int iMin = Math.min(i11, i10 - i13);
                    iArr2[length] = iMin;
                    int iMin2 = Math.min(iX1, (i10 - iMin) - i13);
                    int i14 = iArr2[length] + i13 + iMin2;
                    length--;
                    i12 = iMin2;
                    i11 = i14;
                }
            } else {
                int length2 = iArr.length;
                int i15 = 0;
                i11 = 0;
                i12 = 0;
                int i16 = 0;
                while (i15 < length2) {
                    int i17 = iArr[i15];
                    int iMin3 = Math.min(i11, i10 - i17);
                    iArr2[i16] = iMin3;
                    int iMin4 = Math.min(iX1, (i10 - iMin3) - i17);
                    int i18 = iArr2[i16] + i17 + iMin4;
                    i15++;
                    i16++;
                    i12 = iMin4;
                    i11 = i18;
                }
            }
            int i19 = i11 - i12;
            InterfaceC6839p interfaceC6839p = this.f66854c;
            if (interfaceC6839p == null || i19 >= i10) {
                return;
            }
            int iIntValue = ((Number) interfaceC6839p.invoke(Integer.valueOf(i10 - i19), tVar)).intValue();
            int length3 = iArr2.length;
            for (int i20 = 0; i20 < length3; i20++) {
                iArr2[i20] = iArr2[i20] + iIntValue;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Y0.h.n(this.f66852a, jVar.f66852a) && this.f66853b == jVar.f66853b && AbstractC6492s.d(this.f66854c, jVar.f66854c);
        }

        public int hashCode() {
            int iP = ((Y0.h.p(this.f66852a) * 31) + Boolean.hashCode(this.f66853b)) * 31;
            InterfaceC6839p interfaceC6839p = this.f66854c;
            return iP + (interfaceC6839p == null ? 0 : interfaceC6839p.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f66853b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) Y0.h.r(this.f66852a));
            sb2.append(", ");
            sb2.append(this.f66854c);
            sb2.append(')');
            return sb2.toString();
        }

        private j(float f10, boolean z10, InterfaceC6839p interfaceC6839p) {
            this.f66852a = f10;
            this.f66853b = z10;
            this.f66854c = interfaceC6839p;
            this.f66855d = f10;
        }
    }

    /* renamed from: z.c$k */
    public static final class k implements e {
        k() {
        }

        @Override // z.C8680c.e
        public void c(Y0.d dVar, int i10, int[] iArr, Y0.t tVar, int[] iArr2) {
            if (tVar == Y0.t.Ltr) {
                C8680c.f66832a.i(iArr, iArr2, false);
            } else {
                C8680c.f66832a.j(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* renamed from: z.c$l */
    public static final class l implements m {
        l() {
        }

        @Override // z.C8680c.m
        public void b(Y0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C8680c.f66832a.i(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* renamed from: z.c$m */
    public interface m {
        default float a() {
            return Y0.h.j(0);
        }

        void b(Y0.d dVar, int i10, int[] iArr, int[] iArr2);
    }

    /* renamed from: z.c$n */
    static final class n extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final n f66856a = new n();

        n() {
            super(2);
        }

        public final Integer a(int i10, Y0.t tVar) {
            return Integer.valueOf(f0.c.f46573a.k().a(0, i10, tVar));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (Y0.t) obj2);
        }
    }

    private C8680c() {
    }

    public final m a() {
        return f66836e;
    }

    public final f b() {
        return f66837f;
    }

    public final e c() {
        return f66834c;
    }

    public final f d() {
        return f66840i;
    }

    public final f e() {
        return f66839h;
    }

    public final e f() {
        return f66833b;
    }

    public final m g() {
        return f66835d;
    }

    public final void h(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f10);
            f10 += i16;
        }
    }

    public final void i(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    public final void j(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    public final void k(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = !(iArr.length == 0) ? (i10 - i12) / iArr.length : 0.0f;
        float f10 = length / 2;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final void l(int i10, int[] iArr, int[] iArr2, boolean z10) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(AbstractC3682n.e0(iArr), 1);
        float f10 = (z10 && iArr.length == 1) ? fMax : 0.0f;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f10);
                f10 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public final void m(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final f n(float f10) {
        return new j(f10, true, n.f66856a, null);
    }
}
