package j1;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import g1.a0;
import g1.b0;
import g1.f0;
import g1.z;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f13050a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f13055f;
    public float j;
    public f0 k;

    /* renamed from: l, reason: collision with root package name */
    public g1.i f13059l;

    /* renamed from: m, reason: collision with root package name */
    public g1.i f13060m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13061n;

    /* renamed from: o, reason: collision with root package name */
    public i1.b f13062o;

    /* renamed from: p, reason: collision with root package name */
    public yb.k f13063p;

    /* renamed from: q, reason: collision with root package name */
    public int f13064q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13066s;

    /* renamed from: t, reason: collision with root package name */
    public long f13067t;

    /* renamed from: u, reason: collision with root package name */
    public long f13068u;

    /* renamed from: v, reason: collision with root package name */
    public long f13069v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13070w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f13071x;

    /* renamed from: b, reason: collision with root package name */
    public t2.c f13051b = i1.c.f11144a;

    /* renamed from: c, reason: collision with root package name */
    public t2.i f13052c = t2.i.Ltr;

    /* renamed from: d, reason: collision with root package name */
    public br.n f13053d = b.f13047g;

    /* renamed from: e, reason: collision with root package name */
    public final a f13054e = new a(0, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f13056g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f13057h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f13058i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final g1.f f13065r = new g1.f();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        br.l.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public c(e eVar) {
        this.f13050a = eVar;
        eVar.D(false);
        this.f13067t = 0L;
        this.f13068u = 0L;
        this.f13069v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f13056g) {
            boolean z10 = this.f13070w;
            Outline outline2 = null;
            e eVar = this.f13050a;
            if (z10 || eVar.K() > 0.0f) {
                g1.i iVar = this.f13059l;
                if (iVar != null) {
                    RectF rectF = this.f13071x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f13071x = rectF;
                    }
                    boolean z11 = iVar instanceof g1.i;
                    if (!z11) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    iVar.f9238a.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || iVar.f9238a.isConvex()) {
                        outline = this.f13055f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f13055f = outline;
                        }
                        if (i10 >= 30) {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(iVar.f9238a);
                        } else {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(iVar.f9238a);
                        }
                        this.f13061n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f13055f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f13061n = true;
                        outline = null;
                    }
                    this.f13059l = iVar;
                    if (outline != null) {
                        outline.setAlpha(eVar.a());
                        outline2 = outline;
                    }
                    eVar.d(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f13061n && this.f13070w) {
                        eVar.D(false);
                        eVar.f();
                    } else {
                        eVar.D(this.f13070w);
                    }
                } else {
                    eVar.D(this.f13070w);
                    Outline outline4 = this.f13055f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f13055f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jV = kc.f.V(this.f13068u);
                    long j = this.f13057h;
                    long j7 = this.f13058i;
                    if (j7 != 9205357640488583168L) {
                        jV = j7;
                    }
                    int i11 = (int) (j >> 32);
                    int i12 = (int) (j & 4294967295L);
                    int i13 = (int) (jV >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (jV & 4294967295L)) + Float.intBitsToFloat(i12)), this.j);
                    outline5.setAlpha(eVar.a());
                    eVar.d(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i13)) << 32));
                }
            } else {
                eVar.D(false);
                eVar.d(null, 0L);
            }
        }
        this.f13056g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.f13066s
            if (r0 == 0) goto L69
            int r0 = r15.f13064q
            if (r0 != 0) goto L69
            g1.f r0 = r15.f13065r
            java.lang.Object r1 = r0.f9209d
            j1.c r1 = (j1.c) r1
            if (r1 == 0) goto L16
            r1.e()
            r1 = 0
            r0.f9209d = r1
        L16:
            java.lang.Object r0 = r0.f9211r
            u.b0 r0 = (u.b0) r0
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = r0.f23045b
            long[] r2 = r0.f23044a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L61
            r4 = 0
            r5 = r4
        L27:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5c
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L41:
            if (r10 >= r8) goto L5a
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            j1.c r11 = (j1.c) r11
            r11.e()
        L56:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L41
        L5a:
            if (r8 != r9) goto L61
        L5c:
            if (r5 == r3) goto L61
            int r5 = r5 + 1
            goto L27
        L61:
            r0.b()
        L64:
            j1.e r0 = r15.f13050a
            r0.f()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.c.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Type inference failed for: r1v5, types: [ar.k, br.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(i1.d r15) {
        /*
            r14 = this;
            g1.f r0 = r14.f13065r
            java.lang.Object r1 = r0.f9209d
            j1.c r1 = (j1.c) r1
            r0.f9210g = r1
            java.lang.Object r1 = r0.f9211r
            u.b0 r1 = (u.b0) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f9212x
            u.b0 r2 = (u.b0) r2
            if (r2 != 0) goto L23
            int r2 = u.h0.f23073a
            u.b0 r2 = new u.b0
            r2.<init>()
            r0.f9212x = r2
        L23:
            r2.j(r1)
            r1.b()
        L29:
            r1 = 1
            r0.f9208a = r1
            br.n r1 = r14.f13053d
            r1.a(r15)
            r15 = 0
            r0.f9208a = r15
            java.lang.Object r1 = r0.f9210g
            j1.c r1 = (j1.c) r1
            if (r1 == 0) goto L3d
            r1.e()
        L3d:
            java.lang.Object r0 = r0.f9212x
            u.b0 r0 = (u.b0) r0
            if (r0 == 0) goto L90
            boolean r1 = r0.h()
            if (r1 == 0) goto L90
            java.lang.Object[] r1 = r0.f23045b
            long[] r2 = r0.f23044a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8d
            r4 = r15
        L53:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L88
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6d:
            if (r9 >= r7) goto L86
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L82
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            j1.c r10 = (j1.c) r10
            r10.e()
        L82:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6d
        L86:
            if (r7 != r8) goto L8d
        L88:
            if (r4 == r3) goto L8d
            int r4 = r4 + 1
            goto L53
        L8d:
            r0.b()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.c.c(i1.d):void");
    }

    public final f0 d() {
        f0 a0Var;
        f0 f0Var = this.k;
        g1.i iVar = this.f13059l;
        if (f0Var != null) {
            return f0Var;
        }
        if (iVar != null) {
            z zVar = new z(iVar);
            this.k = zVar;
            return zVar;
        }
        long jV = kc.f.V(this.f13068u);
        long j = this.f13057h;
        long j7 = this.f13058i;
        if (j7 != 9205357640488583168L) {
            jV = j7;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jV >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jV & 4294967295L)) + fIntBitsToFloat2;
        if (this.j > 0.0f) {
            a0Var = new b0(kc.f.g(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            a0Var = new a0(new f1.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = a0Var;
        return a0Var;
    }

    public final void e() {
        this.f13064q--;
        b();
    }

    public final void f(long j, long j7, float f10) {
        if (f1.b.a(this.f13057h, j) && f1.e.a(this.f13058i, j7) && this.j == f10 && this.f13059l == null) {
            return;
        }
        this.k = null;
        this.f13059l = null;
        this.f13056g = true;
        this.f13061n = false;
        this.f13057h = j;
        this.f13058i = j7;
        this.j = f10;
        a();
    }
}
