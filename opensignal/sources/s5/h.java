package s5;

import a5.d0;
import android.view.Surface;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final rb.d f21902a;

    /* renamed from: b, reason: collision with root package name */
    public final f f21903b;

    /* renamed from: c, reason: collision with root package name */
    public final g f21904c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21905d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f21906e;

    /* renamed from: f, reason: collision with root package name */
    public float f21907f;

    /* renamed from: g, reason: collision with root package name */
    public float f21908g;

    /* renamed from: h, reason: collision with root package name */
    public float f21909h;

    /* renamed from: i, reason: collision with root package name */
    public float f21910i;
    public int j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f21911l;

    /* renamed from: m, reason: collision with root package name */
    public long f21912m;

    /* renamed from: n, reason: collision with root package name */
    public long f21913n;

    /* renamed from: o, reason: collision with root package name */
    public long f21914o;

    /* renamed from: p, reason: collision with root package name */
    public long f21915p;

    /* renamed from: q, reason: collision with root package name */
    public long f21916q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            rb.d r0 = new rb.d
            r0.<init>()
            rb.c r1 = new rb.c
            r2 = 1
            r1.<init>(r2)
            r0.f21455d = r1
            rb.c r1 = new rb.c
            r1.<init>(r2)
            r0.f21456e = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f21453b = r1
            r6.f21902a = r0
            r0 = 0
            if (r7 == 0) goto L52
            android.content.Context r7 = r7.getApplicationContext()
            int r3 = a5.d0.f105a
            r4 = 17
            if (r3 < r4) goto L3e
            java.lang.String r3 = "display"
            java.lang.Object r3 = r7.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L3e
            rb.o r4 = new rb.o
            r5 = 1
            r4.<init>(r3, r5)
            goto L3f
        L3e:
            r4 = r0
        L3f:
            if (r4 != 0) goto L53
            java.lang.String r3 = "window"
            java.lang.Object r7 = r7.getSystemService(r3)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            if (r7 == 0) goto L52
            rb.n r4 = new rb.n
            r3 = 1
            r4.<init>(r7, r3)
            goto L53
        L52:
            r4 = r0
        L53:
            r6.f21903b = r4
            if (r4 == 0) goto L59
            s5.g r0 = s5.g.f21897x
        L59:
            r6.f21904c = r0
            r6.k = r1
            r6.f21911l = r1
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.f21907f = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.f21910i = r7
            r7 = 0
            r6.j = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.h.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (d0.f105a < 30 || (surface = this.f21906e) == null || this.j == Integer.MIN_VALUE || this.f21909h == 0.0f) {
            return;
        }
        this.f21909h = 0.0f;
        e.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r9 = this;
            int r0 = a5.d0.f105a
            r1 = 30
            if (r0 < r1) goto L99
            android.view.Surface r0 = r9.f21906e
            if (r0 != 0) goto Lc
            goto L99
        Lc:
            rb.d r0 = r9.f21902a
            java.lang.Object r2 = r0.f21455d
            rb.c r2 = (rb.c) r2
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.f21455d
            rb.c r2 = (rb.c) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.f21455d
            rb.c r2 = (rb.c) r2
            long r4 = r2.f21448f
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L31
            goto L34
        L31:
            long r6 = r2.f21449g
            long r6 = r6 / r4
        L34:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L41
        L3d:
            r2 = r3
            goto L41
        L3f:
            float r2 = r9.f21907f
        L41:
            float r4 = r9.f21908g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L48
            goto L99
        L48:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L8c
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L8c
            java.lang.Object r1 = r0.f21455d
            rb.c r1 = (rb.c) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.f21455d
            rb.c r1 = (rb.c) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L6b
            java.lang.Object r0 = r0.f21455d
            rb.c r0 = (rb.c) r0
            long r0 = r0.f21449g
            goto L70
        L6b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L70:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L7d
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L7f
        L7d:
            r0 = 1065353216(0x3f800000, float:1.0)
        L7f:
            float r1 = r9.f21908g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L99
            goto L93
        L8c:
            if (r5 == 0) goto L8f
            goto L93
        L8f:
            int r0 = r0.f21454c
            if (r0 < r1) goto L99
        L93:
            r9.f21908g = r2
            r0 = 0
            r9.c(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.h.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r4) {
        /*
            r3 = this;
            int r0 = a5.d0.f105a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f21906e
            if (r0 == 0) goto L30
            int r1 = r3.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f21905d
            if (r1 == 0) goto L21
            float r1 = r3.f21908g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f21910i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f21909h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f21909h = r1
            s5.e.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.h.c(boolean):void");
    }
}
