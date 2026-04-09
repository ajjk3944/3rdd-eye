package E0;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3944c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f3945d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final V.b f3946a = new V.b(new G[16], 0);

    /* renamed from: b, reason: collision with root package name */
    private G[] f3947b;

    public static final class a {

        /* renamed from: E0.k0$a$a, reason: collision with other inner class name */
        private static final class C0171a implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            public static final C0171a f3948a = new C0171a();

            private C0171a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(G g10, G g11) {
                int iK = AbstractC6492s.k(g11.L(), g10.L());
                return iK != 0 ? iK : AbstractC6492s.k(g10.hashCode(), g11.hashCode());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void b(G g10) {
        g10.A();
        int i10 = 0;
        g10.F1(false);
        V.b bVarW0 = g10.w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            do {
                b((G) objArrM[i10]);
                i10++;
            } while (i10 < iO);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r4 = this;
            V.b r0 = r4.f3946a
            E0.k0$a$a r1 = E0.k0.a.C0171a.f3948a
            r0.F(r1)
            V.b r0 = r4.f3946a
            int r0 = r0.o()
            E0.G[] r1 = r4.f3947b
            if (r1 == 0) goto L14
            int r2 = r1.length
            if (r2 >= r0) goto L22
        L14:
            V.b r1 = r4.f3946a
            int r1 = r1.o()
            r2 = 16
            int r1 = java.lang.Math.max(r2, r1)
            E0.G[] r1 = new E0.G[r1]
        L22:
            r2 = 0
            r4.f3947b = r2
            r2 = 0
        L26:
            if (r2 >= r0) goto L35
            V.b r3 = r4.f3946a
            java.lang.Object[] r3 = r3.m()
            r3 = r3[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L26
        L35:
            V.b r2 = r4.f3946a
            r2.h()
            int r0 = r0 + (-1)
        L3c:
            r2 = -1
            if (r2 >= r0) goto L50
            r2 = r1[r0]
            kotlin.jvm.internal.AbstractC6492s.f(r2)
            boolean r3 = r2.j0()
            if (r3 == 0) goto L4d
            r4.b(r2)
        L4d:
            int r0 = r0 + (-1)
            goto L3c
        L50:
            r4.f3947b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.k0.a():void");
    }

    public final boolean c() {
        return this.f3946a.u();
    }

    public final void d(G g10) {
        this.f3946a.b(g10);
        g10.F1(true);
    }

    public final void e(G g10) {
        this.f3946a.h();
        this.f3946a.b(g10);
        g10.F1(true);
    }

    public final void f(G g10) {
        this.f3946a.x(g10);
    }
}
