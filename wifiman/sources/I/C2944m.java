package I;

import H.f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: I.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2944m implements f.a {

    /* renamed from: a, reason: collision with root package name */
    private V.b f8372a;

    /* renamed from: b, reason: collision with root package name */
    private V.b f8373b;

    /* renamed from: I.m$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f8374a;

        /* renamed from: b, reason: collision with root package name */
        private int f8375b;

        /* renamed from: c, reason: collision with root package name */
        private int f8376c;

        /* renamed from: d, reason: collision with root package name */
        private int f8377d;

        public a(int i10, int i11, int i12, int i13) {
            this.f8374a = i10;
            this.f8375b = i11;
            this.f8376c = i12;
            this.f8377d = i13;
        }

        public final int a() {
            return this.f8377d;
        }

        public final int b() {
            return this.f8376c;
        }

        public final int c() {
            return this.f8375b;
        }

        public final int d() {
            return this.f8374a;
        }

        public final void e(int i10) {
            this.f8377d = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8374a == aVar.f8374a && this.f8375b == aVar.f8375b && this.f8376c == aVar.f8376c && this.f8377d == aVar.f8377d;
        }

        public final void f(int i10) {
            this.f8376c = i10;
        }

        public final void g(int i10) {
            this.f8375b = i10;
        }

        public final void h(int i10) {
            this.f8374a = i10;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f8374a) * 31) + Integer.hashCode(this.f8375b)) * 31) + Integer.hashCode(this.f8376c)) * 31) + Integer.hashCode(this.f8377d);
        }

        public String toString() {
            return "Change(preStart=" + this.f8374a + ", preEnd=" + this.f8375b + ", originalStart=" + this.f8376c + ", originalEnd=" + this.f8377d + ')';
        }
    }

    public C2944m(C2944m c2944m) {
        V.b bVar;
        int iO;
        int i10 = 0;
        this.f8372a = new V.b(new a[16], 0);
        this.f8373b = new V.b(new a[16], 0);
        if (c2944m == null || (bVar = c2944m.f8372a) == null || (iO = bVar.o()) <= 0) {
            return;
        }
        Object[] objArrM = bVar.m();
        do {
            a aVar = (a) objArrM[i10];
            this.f8372a.b(new a(aVar.d(), aVar.c(), aVar.b(), aVar.a()));
            i10++;
        } while (i10 < iO);
    }

    private final void d(a aVar, int i10, int i11, int i12) {
        int iC;
        if (this.f8373b.s()) {
            iC = 0;
        } else {
            a aVar2 = (a) this.f8373b.v();
            iC = aVar2.c() - aVar2.a();
        }
        if (aVar == null) {
            int i13 = i10 - iC;
            aVar = new a(i10, i11 + i12, i13, (i11 - i10) + i13);
        } else {
            if (aVar.d() > i10) {
                aVar.h(i10);
                aVar.f(i10);
            }
            if (i11 > aVar.c()) {
                int iC2 = aVar.c() - aVar.a();
                aVar.g(i11);
                aVar.e(i11 - iC2);
            }
            aVar.g(aVar.c() + i12);
        }
        this.f8373b.b(aVar);
    }

    @Override // H.f.a
    public int a() {
        return this.f8372a.o();
    }

    @Override // H.f.a
    public long b(int i10) {
        a aVar = (a) this.f8372a.m()[i10];
        return L0.T.b(aVar.b(), aVar.a());
    }

    @Override // H.f.a
    public long c(int i10) {
        a aVar = (a) this.f8372a.m()[i10];
        return L0.T.b(aVar.d(), aVar.c());
    }

    public final void e() {
        this.f8372a.h();
    }

    public final void f(int i10, int i11, int i12) {
        int iC;
        if (i10 == i11 && i12 == 0) {
            return;
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i13 = i12 - (iMax - iMin);
        a aVar = null;
        boolean z10 = false;
        for (int i14 = 0; i14 < this.f8372a.o(); i14++) {
            a aVar2 = (a) this.f8372a.m()[i14];
            int iD = aVar2.d();
            if ((iMin > iD || iD > iMax) && (iMin > (iC = aVar2.c()) || iC > iMax)) {
                if (aVar2.d() > iMax && !z10) {
                    d(aVar, iMin, iMax, i13);
                    z10 = true;
                }
                if (z10) {
                    aVar2.h(aVar2.d() + i13);
                    aVar2.g(aVar2.c() + i13);
                }
                this.f8373b.b(aVar2);
            } else if (aVar == null) {
                aVar = aVar2;
            } else {
                aVar.g(aVar2.c());
                aVar.e(aVar2.a());
            }
        }
        if (!z10) {
            d(aVar, iMin, iMax, i13);
        }
        V.b bVar = this.f8372a;
        this.f8372a = this.f8373b;
        this.f8373b = bVar;
        bVar.h();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChangeList(changes=[");
        V.b bVar = this.f8372a;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                a aVar = (a) objArrM[i10];
                sb2.append('(' + aVar.b() + ',' + aVar.a() + ")->(" + aVar.d() + ',' + aVar.c() + ')');
                if (i10 < a() - 1) {
                    sb2.append(", ");
                }
                i10++;
            } while (i10 < iO);
        }
        sb2.append("])");
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ C2944m(C2944m c2944m, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : c2944m);
    }
}
