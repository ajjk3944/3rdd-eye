package F;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5621a;

    /* renamed from: b, reason: collision with root package name */
    private a f5622b;

    /* renamed from: c, reason: collision with root package name */
    private a f5623c;

    /* renamed from: d, reason: collision with root package name */
    private int f5624d;

    /* renamed from: e, reason: collision with root package name */
    private Long f5625e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5626f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private a f5627a;

        /* renamed from: b, reason: collision with root package name */
        private R0.Q f5628b;

        public a(a aVar, R0.Q q10) {
            this.f5627a = aVar;
            this.f5628b = q10;
        }

        public final a a() {
            return this.f5627a;
        }

        public final R0.Q b() {
            return this.f5628b;
        }

        public final void c(a aVar) {
            this.f5627a = aVar;
        }

        public final void d(R0.Q q10) {
            this.f5628b = q10;
        }
    }

    public u0(int i10) {
        this.f5621a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            r3 = this;
            F.u0$a r0 = r3.f5622b
            r1 = 0
            if (r0 == 0) goto La
            F.u0$a r2 = r0.a()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            F.u0$a r2 = r0.a()
            if (r2 == 0) goto L1b
            F.u0$a r2 = r2.a()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            F.u0$a r0 = r0.a()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.c(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F.u0.d():void");
    }

    public static /* synthetic */ void f(u0 u0Var, R0.Q q10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = w0.a();
        }
        u0Var.e(q10, j10);
    }

    public final void a() {
        this.f5626f = true;
    }

    public final void b(R0.Q q10) {
        R0.Q qB;
        this.f5626f = false;
        a aVar = this.f5622b;
        if (AbstractC6492s.d(q10, aVar != null ? aVar.b() : null)) {
            return;
        }
        String strI = q10.i();
        a aVar2 = this.f5622b;
        if (AbstractC6492s.d(strI, (aVar2 == null || (qB = aVar2.b()) == null) ? null : qB.i())) {
            a aVar3 = this.f5622b;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(q10);
            return;
        }
        this.f5622b = new a(this.f5622b, q10);
        this.f5623c = null;
        int length = this.f5624d + q10.i().length();
        this.f5624d = length;
        if (length > this.f5621a) {
            d();
        }
    }

    public final R0.Q c() {
        a aVar = this.f5623c;
        if (aVar == null) {
            return null;
        }
        this.f5623c = aVar.a();
        this.f5622b = new a(this.f5622b, aVar.b());
        this.f5624d += aVar.b().i().length();
        return aVar.b();
    }

    public final void e(R0.Q q10, long j10) {
        if (!this.f5626f) {
            Long l10 = this.f5625e;
            if (j10 <= (l10 != null ? l10.longValue() : 0L) + v0.a()) {
                return;
            }
        }
        this.f5625e = Long.valueOf(j10);
        b(q10);
    }

    public final R0.Q g() {
        a aVarA;
        a aVar = this.f5622b;
        if (aVar == null || (aVarA = aVar.a()) == null) {
            return null;
        }
        this.f5622b = aVarA;
        this.f5624d -= aVar.b().i().length();
        this.f5623c = new a(this.f5623c, aVar.b());
        return aVarA.b();
    }

    public /* synthetic */ u0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }
}
