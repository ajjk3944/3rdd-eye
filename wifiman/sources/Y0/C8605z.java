package y0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C7028t;

/* renamed from: y0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8605z {

    /* renamed from: a, reason: collision with root package name */
    private final C7028t f66347a = new C7028t(0, 1, null);

    /* renamed from: y0.z$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f66348a;

        /* renamed from: b, reason: collision with root package name */
        private final long f66349b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f66350c;

        /* renamed from: d, reason: collision with root package name */
        private final int f66351d;

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10, i10);
        }

        public final boolean a() {
            return this.f66350c;
        }

        public final long b() {
            return this.f66349b;
        }

        public final long c() {
            return this.f66348a;
        }

        private a(long j10, long j11, boolean z10, int i10) {
            this.f66348a = j10;
            this.f66349b = j11;
            this.f66350c = z10;
            this.f66351d = i10;
        }
    }

    public final void a() {
        this.f66347a.b();
    }

    public final C8585f b(C8561A c8561a, InterfaceC8573M interfaceC8573M) {
        long jK;
        boolean zA;
        long jR;
        C7028t c7028t = new C7028t(c8561a.b().size());
        List listB = c8561a.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8562B c8562b = (C8562B) listB.get(i10);
            a aVar = (a) this.f66347a.e(c8562b.d());
            if (aVar == null) {
                jK = c8562b.k();
                jR = c8562b.f();
                zA = false;
            } else {
                long jC = aVar.c();
                jK = jC;
                zA = aVar.a();
                jR = interfaceC8573M.r(aVar.b());
            }
            c7028t.k(c8562b.d(), new C8604y(c8562b.d(), c8562b.k(), c8562b.f(), c8562b.b(), c8562b.h(), jK, jR, zA, false, c8562b.j(), c8562b.c(), c8562b.i(), c8562b.e(), null));
            if (c8562b.b()) {
                this.f66347a.k(c8562b.d(), new a(c8562b.k(), c8562b.g(), c8562b.b(), c8562b.j(), null));
            } else {
                this.f66347a.m(c8562b.d());
            }
        }
        return new C8585f(c7028t, c8561a);
    }
}
