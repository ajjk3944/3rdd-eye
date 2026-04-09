package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b5.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f27752t = 0;

    /* renamed from: a, reason: collision with root package name */
    public b f27753a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f27754b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f27755c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f27756d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27758f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27759h;

    /* renamed from: i, reason: collision with root package name */
    public o f27760i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f27761k;

    /* renamed from: l, reason: collision with root package name */
    public f f27762l;

    /* renamed from: m, reason: collision with root package name */
    public b f27763m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27764n;

    /* renamed from: o, reason: collision with root package name */
    public b f27765o;

    /* renamed from: p, reason: collision with root package name */
    public com.bumptech.glide.d f27766p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27769s;

    /* renamed from: e, reason: collision with root package name */
    public int f27757e = 255;
    public int g = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f27767q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f27768r = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0279, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k.e c(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):k.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f27758f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f27755c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f27757e
            r3.setAlpha(r9)
            r13.j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            k.b r10 = r13.f27753a
            int r10 = r10.f27745y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f27757e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f27756d
            if (r9 == 0) goto L61
            long r10 = r13.f27761k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f27756d = r0
            r13.f27761k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            k.b r4 = r13.f27753a
            int r4 = r4.f27746z
            int r3 = r3 / r4
            int r4 = r13.f27757e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f27761k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            b5.o r14 = r13.f27760i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f27753a;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i4 = bVar.f27729h;
        Drawable[] drawableArr = bVar.g;
        for (int i10 = 0; i10 < i4; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i10].applyTheme(theme);
                bVar.f27727e |= drawableArr[i10].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f27724b = resources;
            int i11 = resources.getDisplayMetrics().densityDpi;
            if (i11 == 0) {
                i11 = 160;
            }
            int i12 = bVar.f27725c;
            bVar.f27725c = i11;
            if (i12 != i11) {
                bVar.f27733m = false;
                bVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f27753a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f27762l == null) {
            this.f27762l = new f();
        }
        f fVar = this.f27762l;
        fVar.f27771b = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f27753a.f27745y <= 0 && this.f27758f) {
                drawable.setAlpha(this.f27757e);
            }
            b bVar = this.f27753a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f27753a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f27753a.f27743w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f27753a.A);
            Rect rect = this.f27754b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.f27762l;
            Drawable.Callback callback = (Drawable.Callback) fVar2.f27771b;
            fVar2.f27771b = null;
            drawable.setCallback(callback);
        } catch (Throwable th2) {
            f fVar3 = this.f27762l;
            Drawable.Callback callback2 = (Drawable.Callback) fVar3.f27771b;
            fVar3.f27771b = null;
            drawable.setCallback(callback2);
            throw th2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f27756d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z3;
        Drawable drawable = this.f27756d;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f27756d = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f27755c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f27758f) {
                this.f27755c.setAlpha(this.f27757e);
            }
        }
        if (this.f27761k != 0) {
            this.f27761k = 0L;
            z3 = true;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else {
            z10 = z3;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f27759h && super.mutate() == this) {
            b bVar = new b(this.f27765o, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.f27759h = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f27764n) {
            f();
            b bVar = this.f27763m;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f27764n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f27757e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f27753a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z3;
        b bVar = this.f27753a;
        if (!bVar.f27741u) {
            bVar.c();
            bVar.f27741u = true;
            int i4 = bVar.f27729h;
            Drawable[] drawableArr = bVar.g;
            int i10 = 0;
            while (true) {
                if (i10 >= i4) {
                    bVar.f27742v = true;
                    z3 = true;
                    break;
                }
                if (drawableArr[i10].getConstantState() == null) {
                    bVar.f27742v = false;
                    z3 = false;
                    break;
                }
                i10++;
            }
        } else {
            z3 = bVar.f27742v;
        }
        if (!z3) {
            return null;
        }
        this.f27753a.f27726d = getChangingConfigurations();
        return this.f27753a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f27755c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f27754b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f27753a;
        if (bVar.f27732l) {
            if (!bVar.f27733m) {
                bVar.b();
            }
            return bVar.f27735o;
        }
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f27753a;
        if (bVar.f27732l) {
            if (!bVar.f27733m) {
                bVar.b();
            }
            return bVar.f27734n;
        }
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f27753a;
        if (bVar.f27732l) {
            if (!bVar.f27733m) {
                bVar.b();
            }
            return bVar.f27737q;
        }
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f27753a;
        if (bVar.f27732l) {
            if (!bVar.f27733m) {
                bVar.b();
            }
            return bVar.f27736p;
        }
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f27755c;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f27753a;
            if (bVar.f27738r) {
                return bVar.f27739s;
            }
            bVar.c();
            int i4 = bVar.f27729h;
            Drawable[] drawableArr = bVar.g;
            opacity = i4 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i4; i10++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i10].getOpacity());
            }
            bVar.f27739s = opacity;
            bVar.f27738r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f27753a;
        Rect rect2 = null;
        boolean padding = false;
        if (!bVar.f27730i) {
            Rect rect3 = bVar.f27731k;
            if (rect3 != null || bVar.j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i4 = bVar.f27729h;
                Drawable[] drawableArr = bVar.g;
                for (int i10 = 0; i10 < i4; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                bVar.j = true;
                bVar.f27731k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f27755c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f27753a.A && getLayoutDirection() == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            k.b r0 = r9.f27753a
            int r0 = r0.f27746z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f27756d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f27755c
            if (r0 == 0) goto L29
            r9.f27756d = r0
            k.b r0 = r9.f27753a
            int r0 = r0.f27746z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f27761k = r0
            goto L35
        L29:
            r9.f27756d = r4
            r9.f27761k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f27755c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            k.b r0 = r9.f27753a
            int r1 = r0.f27729h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f27755c = r0
            r9.g = r10
            if (r0 == 0) goto L5a
            k.b r10 = r9.f27753a
            int r10 = r10.f27745y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f27755c = r4
            r10 = -1
            r9.g = r10
        L5a:
            long r0 = r9.j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f27761k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7b
        L67:
            b5.o r10 = r9.f27760i
            if (r10 != 0) goto L75
            b5.o r10 = new b5.o
            r1 = 23
            r10.<init>(r1, r9)
            r9.f27760i = r10
            goto L78
        L75:
            r9.unscheduleSelf(r10)
        L78:
            r9.a(r0)
        L7b:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.h(int):boolean");
    }

    public final void i(b bVar) {
        this.f27753a = bVar;
        int i4 = this.g;
        if (i4 >= 0) {
            Drawable drawableD = bVar.d(i4);
            this.f27755c = drawableD;
            if (drawableD != null) {
                d(drawableD);
            }
        }
        this.f27756d = null;
        this.f27763m = bVar;
        this.f27765o = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f27753a;
        if (bVar != null) {
            bVar.f27738r = false;
            bVar.f27740t = false;
        }
        if (drawable != this.f27755c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f27753a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z3, boolean z10) {
        boolean visible = super.setVisible(z3, z10);
        Drawable drawable = this.f27756d;
        if (drawable != null) {
            drawable.setVisible(z3, z10);
        }
        Drawable drawable2 = this.f27755c;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        com.bumptech.glide.d dVar = this.f27766p;
        if (dVar != null) {
            dVar.B();
            this.f27766p = null;
            h(this.f27767q);
            this.f27767q = -1;
            this.f27768r = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f27769s) {
            g();
            b bVar = this.f27765o;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f27769s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f27756d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f27755c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        b bVar = this.f27753a;
        int i10 = this.g;
        int i11 = bVar.f27729h;
        Drawable[] drawableArr = bVar.g;
        boolean z3 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i4);
                if (i12 == i10) {
                    z3 = layoutDirection;
                }
            }
        }
        bVar.f27744x = i4;
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.f27756d;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.f27755c;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f27755c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f27758f && this.f27757e == i4) {
            return;
        }
        this.f27758f = true;
        this.f27757e = i4;
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            if (this.j == 0) {
                drawable.setAlpha(i4);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        b bVar = this.f27753a;
        if (bVar.A != z3) {
            bVar.A = z3;
            Drawable drawable = this.f27755c;
            if (drawable != null) {
                drawable.setAutoMirrored(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f27753a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f27755c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        b bVar = this.f27753a;
        if (bVar.f27743w != z3) {
            bVar.f27743w = z3;
            Drawable drawable = this.f27755c;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i4, int i10, int i11, int i12) {
        Rect rect = this.f27754b;
        if (rect == null) {
            this.f27754b = new Rect(i4, i10, i11, i12);
        } else {
            rect.set(i4, i10, i11, i12);
        }
        Drawable drawable = this.f27755c;
        if (drawable != null) {
            drawable.setHotspotBounds(i4, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f27753a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f27755c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f27753a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f27755c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z10) {
        boolean zJ = j(z3, z10);
        com.bumptech.glide.d dVar = this.f27766p;
        if (dVar != null && (zJ || z10)) {
            if (z3) {
                dVar.A();
                return zJ;
            }
            jumpToCurrentState();
        }
        return zJ;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f27755c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
