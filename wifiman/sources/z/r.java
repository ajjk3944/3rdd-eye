package z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C7019j;
import z.AbstractC8697u;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f66945a;

    /* renamed from: b, reason: collision with root package name */
    private final C8698v f66946b;

    /* renamed from: c, reason: collision with root package name */
    private final long f66947c;

    /* renamed from: d, reason: collision with root package name */
    private final int f66948d;

    /* renamed from: e, reason: collision with root package name */
    private final int f66949e;

    /* renamed from: f, reason: collision with root package name */
    private final int f66950f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C0.B f66951a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.compose.ui.layout.t f66952b;

        /* renamed from: c, reason: collision with root package name */
        private final long f66953c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f66954d;

        public /* synthetic */ a(C0.B b10, androidx.compose.ui.layout.t tVar, long j10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(b10, tVar, j10, z10);
        }

        public final C0.B a() {
            return this.f66951a;
        }

        public final long b() {
            return this.f66953c;
        }

        public final boolean c() {
            return this.f66954d;
        }

        public final androidx.compose.ui.layout.t d() {
            return this.f66952b;
        }

        public final void e(boolean z10) {
            this.f66954d = z10;
        }

        private a(C0.B b10, androidx.compose.ui.layout.t tVar, long j10, boolean z10) {
            this.f66951a = b10;
            this.f66952b = tVar;
            this.f66953c = j10;
            this.f66954d = z10;
        }

        public /* synthetic */ a(C0.B b10, androidx.compose.ui.layout.t tVar, long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(b10, tVar, j10, (i10 & 8) != 0 ? true : z10, null);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f66955a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f66956b;

        public b(boolean z10, boolean z11) {
            this.f66955a = z10;
            this.f66956b = z11;
        }

        public final boolean a() {
            return this.f66956b;
        }

        public final boolean b() {
            return this.f66955a;
        }
    }

    public /* synthetic */ r(int i10, C8698v c8698v, long j10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, c8698v, j10, i11, i12, i13);
    }

    public final a a(b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        a aVarE;
        if (!bVar.a() || (aVarE = this.f66946b.e(z10, i10, i11)) == null) {
            return null;
        }
        aVarE.e(i10 >= 0 && (i13 == 0 || (i12 - C7019j.e(aVarE.b()) >= 0 && i13 < this.f66945a)));
        return aVarE;
    }

    public final b b(boolean z10, int i10, long j10, C7019j c7019j, int i11, int i12, int i13, boolean z11, boolean z12) {
        int i14 = i12 + i13;
        if (c7019j == null) {
            return new b(true, true);
        }
        if (this.f66946b.i() != AbstractC8697u.a.Visible && (i11 >= this.f66948d || C7019j.f(j10) - C7019j.f(c7019j.i()) < 0)) {
            return new b(true, true);
        }
        if (i10 != 0 && (i10 >= this.f66945a || C7019j.e(j10) - C7019j.e(c7019j.i()) < 0)) {
            return z11 ? new b(true, true) : new b(true, b(z10, 0, C7019j.b(Y0.b.l(this.f66947c), (C7019j.f(j10) - this.f66950f) - i13), C7019j.a(C7019j.b(C7019j.e(c7019j.i()) - this.f66949e, C7019j.f(c7019j.i()))), i11 + 1, i14, 0, true, false).a());
        }
        int iMax = i12 + Math.max(i13, C7019j.f(c7019j.i()));
        C7019j c7019jF = z12 ? null : this.f66946b.f(z10, i11, iMax);
        if (c7019jF != null) {
            c7019jF.i();
            if (i10 + 1 >= this.f66945a || ((C7019j.e(j10) - C7019j.e(c7019j.i())) - this.f66949e) - C7019j.e(c7019jF.i()) < 0) {
                if (z12) {
                    return new b(true, true);
                }
                b bVarB = b(false, 0, C7019j.b(Y0.b.l(this.f66947c), (C7019j.f(j10) - this.f66950f) - Math.max(i13, C7019j.f(c7019j.i()))), c7019jF, i11 + 1, iMax, 0, true, true);
                return new b(bVarB.a(), bVarB.a());
            }
        }
        return new b(false, false);
    }

    private r(int i10, C8698v c8698v, long j10, int i11, int i12, int i13) {
        this.f66945a = i10;
        this.f66946b = c8698v;
        this.f66947c = j10;
        this.f66948d = i11;
        this.f66949e = i12;
        this.f66950f = i13;
    }
}
