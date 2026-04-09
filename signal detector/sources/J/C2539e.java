package j;

import C0.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2539e extends Drawable implements Drawable.Callback {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f21262H = 0;

    /* renamed from: C, reason: collision with root package name */
    public C2536b f21263C;

    /* renamed from: D, reason: collision with root package name */
    public com.bumptech.glide.d f21264D;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21267G;

    /* renamed from: a, reason: collision with root package name */
    public C2536b f21268a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f21269b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f21270c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f21271d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21273f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21275h;
    public k i;

    /* renamed from: j, reason: collision with root package name */
    public long f21276j;

    /* renamed from: k, reason: collision with root package name */
    public long f21277k;

    /* renamed from: l, reason: collision with root package name */
    public M0.c f21278l;

    /* renamed from: m, reason: collision with root package name */
    public C2536b f21279m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21280n;

    /* renamed from: e, reason: collision with root package name */
    public int f21272e = 255;

    /* renamed from: g, reason: collision with root package name */
    public int f21274g = -1;

    /* renamed from: E, reason: collision with root package name */
    public int f21265E = -1;

    /* renamed from: F, reason: collision with root package name */
    public int f21266F = -1;

    public C2539e(C2536b c2536b, Resources resources) {
        i(new C2536b(c2536b, this, resources));
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
    public static j.C2539e c(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C2539e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):j.e");
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
            r13.f21273f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f21270c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f21276j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f21272e
            r3.setAlpha(r9)
            r13.f21276j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            j.b r10 = r13.f21268a
            int r10 = r10.f21255y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f21272e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f21276j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f21271d
            if (r9 == 0) goto L61
            long r10 = r13.f21277k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f21271d = r0
            r13.f21277k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            j.b r4 = r13.f21268a
            int r4 = r4.f21256z
            int r3 = r3 / r4
            int r4 = r13.f21272e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f21277k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            C0.k r14 = r13.i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C2539e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        C2536b c2536b = this.f21268a;
        if (theme == null) {
            c2536b.getClass();
            return;
        }
        c2536b.c();
        int i = c2536b.f21239h;
        Drawable[] drawableArr = c2536b.f21238g;
        for (int i3 = 0; i3 < i; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i3].applyTheme(theme);
                c2536b.f21236e |= drawableArr[i3].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c2536b.f21233b = resources;
            int i6 = resources.getDisplayMetrics().densityDpi;
            if (i6 == 0) {
                i6 = 160;
            }
            int i7 = c2536b.f21234c;
            c2536b.f21234c = i6;
            if (i7 != i6) {
                c2536b.f21243m = false;
                c2536b.f21240j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f21268a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f21278l == null) {
            this.f21278l = new M0.c();
        }
        M0.c cVar = this.f21278l;
        cVar.f2628b = drawable.getCallback();
        drawable.setCallback(cVar);
        try {
            if (this.f21268a.f21255y <= 0 && this.f21273f) {
                drawable.setAlpha(this.f21272e);
            }
            C2536b c2536b = this.f21268a;
            if (c2536b.f21224C) {
                drawable.setColorFilter(c2536b.f21223B);
            } else {
                if (c2536b.f21227F) {
                    drawable.setTintList(c2536b.f21225D);
                }
                C2536b c2536b2 = this.f21268a;
                if (c2536b2.f21228G) {
                    drawable.setTintMode(c2536b2.f21226E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f21268a.f21253w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f21268a.f21222A);
            Rect rect = this.f21269b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            M0.c cVar2 = this.f21278l;
            Drawable.Callback callback = (Drawable.Callback) cVar2.f2628b;
            cVar2.f2628b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            M0.c cVar3 = this.f21278l;
            Drawable.Callback callback2 = (Drawable.Callback) cVar3.f2628b;
            cVar3.f2628b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f21271d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z6;
        Drawable drawable = this.f21271d;
        boolean z7 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f21271d = null;
            z6 = true;
        } else {
            z6 = false;
        }
        Drawable drawable2 = this.f21270c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f21273f) {
                this.f21270c.setAlpha(this.f21272e);
            }
        }
        if (this.f21277k != 0) {
            this.f21277k = 0L;
            z6 = true;
        }
        if (this.f21276j != 0) {
            this.f21276j = 0L;
        } else {
            z7 = z6;
        }
        if (z7) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f21275h && super.mutate() == this) {
            C2536b c2536b = new C2536b(this.f21263C, this, null);
            c2536b.f21230I = c2536b.f21230I.clone();
            c2536b.f21231J = c2536b.f21231J.clone();
            i(c2536b);
            this.f21275h = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f21280n) {
            f();
            C2536b c2536b = this.f21279m;
            c2536b.f21230I = c2536b.f21230I.clone();
            c2536b.f21231J = c2536b.f21231J.clone();
            this.f21280n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21272e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f21268a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z6;
        C2536b c2536b = this.f21268a;
        if (!c2536b.f21251u) {
            c2536b.c();
            c2536b.f21251u = true;
            int i = c2536b.f21239h;
            Drawable[] drawableArr = c2536b.f21238g;
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    c2536b.f21252v = true;
                    z6 = true;
                    break;
                }
                if (drawableArr[i3].getConstantState() == null) {
                    c2536b.f21252v = false;
                    z6 = false;
                    break;
                }
                i3++;
            }
        } else {
            z6 = c2536b.f21252v;
        }
        if (!z6) {
            return null;
        }
        this.f21268a.f21235d = getChangingConfigurations();
        return this.f21268a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f21270c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f21269b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C2536b c2536b = this.f21268a;
        if (c2536b.f21242l) {
            if (!c2536b.f21243m) {
                c2536b.b();
            }
            return c2536b.f21245o;
        }
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C2536b c2536b = this.f21268a;
        if (c2536b.f21242l) {
            if (!c2536b.f21243m) {
                c2536b.b();
            }
            return c2536b.f21244n;
        }
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C2536b c2536b = this.f21268a;
        if (c2536b.f21242l) {
            if (!c2536b.f21243m) {
                c2536b.b();
            }
            return c2536b.f21247q;
        }
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C2536b c2536b = this.f21268a;
        if (c2536b.f21242l) {
            if (!c2536b.f21243m) {
                c2536b.b();
            }
            return c2536b.f21246p;
        }
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f21270c;
        if (drawable != null && drawable.isVisible()) {
            C2536b c2536b = this.f21268a;
            if (c2536b.f21248r) {
                return c2536b.f21249s;
            }
            c2536b.c();
            int i = c2536b.f21239h;
            Drawable[] drawableArr = c2536b.f21238g;
            opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            c2536b.f21249s = opacity;
            c2536b.f21248r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C2536b c2536b = this.f21268a;
        Rect rect2 = null;
        boolean padding = false;
        if (!c2536b.i) {
            Rect rect3 = c2536b.f21241k;
            if (rect3 != null || c2536b.f21240j) {
                rect2 = rect3;
            } else {
                c2536b.c();
                Rect rect4 = new Rect();
                int i = c2536b.f21239h;
                Drawable[] drawableArr = c2536b.f21238g;
                for (int i3 = 0; i3 < i; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i6 = rect4.left;
                        if (i6 > rect2.left) {
                            rect2.left = i6;
                        }
                        int i7 = rect4.top;
                        if (i7 > rect2.top) {
                            rect2.top = i7;
                        }
                        int i8 = rect4.right;
                        if (i8 > rect2.right) {
                            rect2.right = i8;
                        }
                        int i9 = rect4.bottom;
                        if (i9 > rect2.bottom) {
                            rect2.bottom = i9;
                        }
                    }
                }
                c2536b.f21240j = true;
                c2536b.f21241k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f21270c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f21268a.f21222A && getLayoutDirection() == 1) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
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
            int r0 = r9.f21274g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            j.b r0 = r9.f21268a
            int r0 = r0.f21256z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f21271d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f21270c
            if (r0 == 0) goto L29
            r9.f21271d = r0
            j.b r0 = r9.f21268a
            int r0 = r0.f21256z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f21277k = r0
            goto L35
        L29:
            r9.f21271d = r4
            r9.f21277k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f21270c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            j.b r0 = r9.f21268a
            int r1 = r0.f21239h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f21270c = r0
            r9.f21274g = r10
            if (r0 == 0) goto L5a
            j.b r10 = r9.f21268a
            int r10 = r10.f21255y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f21276j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f21270c = r4
            r10 = -1
            r9.f21274g = r10
        L5a:
            long r0 = r9.f21276j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f21277k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7b
        L67:
            C0.k r10 = r9.i
            if (r10 != 0) goto L75
            C0.k r10 = new C0.k
            r1 = 24
            r10.<init>(r1, r9)
            r9.i = r10
            goto L78
        L75:
            r9.unscheduleSelf(r10)
        L78:
            r9.a(r0)
        L7b:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C2539e.h(int):boolean");
    }

    public final void i(C2536b c2536b) {
        this.f21268a = c2536b;
        int i = this.f21274g;
        if (i >= 0) {
            Drawable drawableD = c2536b.d(i);
            this.f21270c = drawableD;
            if (drawableD != null) {
                d(drawableD);
            }
        }
        this.f21271d = null;
        this.f21279m = c2536b;
        this.f21263C = c2536b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C2536b c2536b = this.f21268a;
        if (c2536b != null) {
            c2536b.f21248r = false;
            c2536b.f21250t = false;
        }
        if (drawable != this.f21270c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f21268a.f21222A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        Drawable drawable = this.f21271d;
        if (drawable != null) {
            drawable.setVisible(z6, z7);
        }
        Drawable drawable2 = this.f21270c;
        if (drawable2 != null) {
            drawable2.setVisible(z6, z7);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        com.bumptech.glide.d dVar = this.f21264D;
        if (dVar != null) {
            dVar.c0();
            this.f21264D = null;
            h(this.f21265E);
            this.f21265E = -1;
            this.f21266F = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f21267G) {
            g();
            C2536b c2536b = this.f21263C;
            c2536b.f21230I = c2536b.f21230I.clone();
            c2536b.f21231J = c2536b.f21231J.clone();
            this.f21267G = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21271d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f21270c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        C2536b c2536b = this.f21268a;
        int i3 = this.f21274g;
        int i6 = c2536b.f21239h;
        Drawable[] drawableArr = c2536b.f21238g;
        boolean z6 = false;
        for (int i7 = 0; i7 < i6; i7++) {
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i7 == i3) {
                    z6 = layoutDirection;
                }
            }
        }
        c2536b.f21254x = i;
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f21271d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f21270c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
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
        throw new UnsupportedOperationException("Method not decompiled: j.C2539e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        if (drawable != this.f21270c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f21273f && this.f21272e == i) {
            return;
        }
        this.f21273f = true;
        this.f21272e = i;
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            if (this.f21276j == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        C2536b c2536b = this.f21268a;
        if (c2536b.f21222A != z6) {
            c2536b.f21222A = z6;
            Drawable drawable = this.f21270c;
            if (drawable != null) {
                drawable.setAutoMirrored(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C2536b c2536b = this.f21268a;
        c2536b.f21224C = true;
        if (c2536b.f21223B != colorFilter) {
            c2536b.f21223B = colorFilter;
            Drawable drawable = this.f21270c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        C2536b c2536b = this.f21268a;
        if (c2536b.f21253w != z6) {
            c2536b.f21253w = z6;
            Drawable drawable = this.f21270c;
            if (drawable != null) {
                drawable.setDither(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f5) {
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            drawable.setHotspot(f2, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i3, int i6, int i7) {
        Rect rect = this.f21269b;
        if (rect == null) {
            this.f21269b = new Rect(i, i3, i6, i7);
        } else {
            rect.set(i, i3, i6, i7);
        }
        Drawable drawable = this.f21270c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i3, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C2536b c2536b = this.f21268a;
        c2536b.f21227F = true;
        if (c2536b.f21225D != colorStateList) {
            c2536b.f21225D = colorStateList;
            this.f21270c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C2536b c2536b = this.f21268a;
        c2536b.f21228G = true;
        if (c2536b.f21226E != mode) {
            c2536b.f21226E = mode;
            this.f21270c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        boolean zJ = j(z6, z7);
        com.bumptech.glide.d dVar = this.f21264D;
        if (dVar != null && (zJ || z7)) {
            if (z6) {
                dVar.Z();
                return zJ;
            }
            jumpToCurrentState();
        }
        return zJ;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f21270c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
