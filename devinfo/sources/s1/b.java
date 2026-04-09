package s1;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import c2.l0;
import c2.s;
import java.util.Locale;
import me.t1;
import p1.d0;
import p1.e0;
import p1.f0;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f33231a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f33236f;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public z f33239k;

    /* renamed from: l, reason: collision with root package name */
    public p1.j f33240l;

    /* renamed from: m, reason: collision with root package name */
    public p1.j f33241m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33242n;

    /* renamed from: o, reason: collision with root package name */
    public r1.b f33243o;

    /* renamed from: p, reason: collision with root package name */
    public l7.d f33244p;

    /* renamed from: q, reason: collision with root package name */
    public int f33245q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33247s;

    /* renamed from: t, reason: collision with root package name */
    public long f33248t;

    /* renamed from: u, reason: collision with root package name */
    public long f33249u;

    /* renamed from: v, reason: collision with root package name */
    public long f33250v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33251w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f33252x;

    /* renamed from: b, reason: collision with root package name */
    public d3.c f33232b = r1.c.f32721a;

    /* renamed from: c, reason: collision with root package name */
    public d3.l f33233c = d3.l.f21966a;

    /* renamed from: d, reason: collision with root package name */
    public nk.l f33234d = a.f33228b;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f33235e = new l0(25, this);
    public boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f33237h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f33238i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final s f33246r = new s();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public b(d dVar) {
        this.f33231a = dVar;
        dVar.B(false);
        this.f33248t = 0L;
        this.f33249u = 0L;
        this.f33250v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z3 = this.f33251w;
            Outline outline2 = null;
            d dVar = this.f33231a;
            if (z3 || dVar.J() > 0.0f) {
                p1.j jVar = this.f33240l;
                if (jVar != null) {
                    RectF rectF = this.f33252x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f33252x = rectF;
                    }
                    boolean z10 = jVar instanceof p1.j;
                    if (!z10) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    jVar.f30986a.computeBounds(rectF, false);
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 > 28 || jVar.f30986a.isConvex()) {
                        outline = this.f33236f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f33236f = outline;
                        }
                        if (i4 >= 30) {
                            a4.a.A(outline, jVar);
                        } else {
                            if (!z10) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(jVar.f30986a);
                        }
                        this.f33242n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f33236f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f33242n = true;
                        outline = null;
                    }
                    this.f33240l = jVar;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.e(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f33242n && this.f33251w) {
                        dVar.B(false);
                        dVar.g();
                    } else {
                        dVar.B(this.f33251w);
                    }
                } else {
                    dVar.B(this.f33251w);
                    Outline outline4 = this.f33236f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f33236f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jF = t1.F(this.f33249u);
                    long j = this.f33237h;
                    long j8 = this.f33238i;
                    if (j8 != 9205357640488583168L) {
                        jF = j8;
                    }
                    int i10 = (int) (j >> 32);
                    int i11 = (int) (j & 4294967295L);
                    int i12 = (int) (jF >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12) + Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat((int) (jF & 4294967295L)) + Float.intBitsToFloat(i11)), this.j);
                    outline5.setAlpha(dVar.a());
                    dVar.e(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i12)) << 32));
                }
            } else {
                dVar.B(false);
                dVar.e(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.f33247s
            if (r0 == 0) goto L75
            int r0 = r15.f33245q
            if (r0 != 0) goto L75
            c2.s r0 = r15.f33246r
            java.lang.Object r1 = r0.f2684b
            s1.b r1 = (s1.b) r1
            if (r1 == 0) goto L1c
            int r2 = r1.f33245q
            int r2 = r2 + (-1)
            r1.f33245q = r2
            r1.b()
            r1 = 0
            r0.f2684b = r1
        L1c:
            java.lang.Object r0 = r0.f2686d
            x.f0 r0 = (x.f0) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.f36883b
            long[] r2 = r0.f36882a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            s1.b r11 = (s1.b) r11
            int r12 = r11.f33245q
            int r12 = r12 + (-1)
            r11.f33245q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            s1.d r0 = r15.f33231a
            r0.g()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.b.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Type inference failed for: r1v5, types: [mk.c, nk.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(r1.d r15) {
        /*
            r14 = this;
            c2.s r0 = r14.f33246r
            java.lang.Object r1 = r0.f2684b
            s1.b r1 = (s1.b) r1
            r0.f2685c = r1
            java.lang.Object r1 = r0.f2686d
            x.f0 r1 = (x.f0) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f2687e
            x.f0 r2 = (x.f0) r2
            if (r2 != 0) goto L23
            x.f0 r2 = x.m0.f36916a
            x.f0 r2 = new x.f0
            r2.<init>()
            r0.f2687e = r2
        L23:
            r2.k(r1)
            r1.b()
        L29:
            r1 = 1
            r0.f2683a = r1
            nk.l r1 = r14.f33234d
            r1.invoke(r15)
            r15 = 0
            r0.f2683a = r15
            java.lang.Object r1 = r0.f2685c
            s1.b r1 = (s1.b) r1
            if (r1 == 0) goto L43
            int r2 = r1.f33245q
            int r2 = r2 + (-1)
            r1.f33245q = r2
            r1.b()
        L43:
            java.lang.Object r0 = r0.f2687e
            x.f0 r0 = (x.f0) r0
            if (r0 == 0) goto L9c
            boolean r1 = r0.h()
            if (r1 == 0) goto L9c
            java.lang.Object[] r1 = r0.f36883b
            long[] r2 = r0.f36882a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L99
            r4 = r15
        L59:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L94
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L73:
            if (r9 >= r7) goto L92
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L8e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            s1.b r10 = (s1.b) r10
            int r11 = r10.f33245q
            int r11 = r11 + (-1)
            r10.f33245q = r11
            r10.b()
        L8e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L73
        L92:
            if (r7 != r8) goto L99
        L94:
            if (r4 == r3) goto L99
            int r4 = r4 + 1
            goto L59
        L99:
            r0.b()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.b.c(r1.d):void");
    }

    public final z d() {
        z e0Var;
        z zVar = this.f33239k;
        p1.j jVar = this.f33240l;
        if (zVar != null) {
            return zVar;
        }
        if (jVar != null) {
            d0 d0Var = new d0(jVar);
            this.f33239k = d0Var;
            return d0Var;
        }
        long jF = t1.F(this.f33249u);
        long j = this.f33237h;
        long j8 = this.f33238i;
        if (j8 != 9205357640488583168L) {
            jF = j8;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jF >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jF & 4294967295L)) + fIntBitsToFloat2;
        if (this.j > 0.0f) {
            e0Var = new f0(com.bumptech.glide.f.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            e0Var = new e0(new o1.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f33239k = e0Var;
        return e0Var;
    }

    public final void e(float f10) {
        d dVar = this.f33231a;
        if (dVar.a() == f10) {
            return;
        }
        dVar.s(f10);
    }

    public final void f(long j, long j8, float f10) {
        if (o1.b.b(this.f33237h, j) && o1.e.a(this.f33238i, j8) && this.j == f10 && this.f33240l == null) {
            return;
        }
        this.f33239k = null;
        this.f33240l = null;
        this.g = true;
        this.f33242n = false;
        this.f33237h = j;
        this.f33238i = j8;
        this.j = f10;
        a();
    }
}
