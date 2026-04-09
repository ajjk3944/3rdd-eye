package j;

import D0.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import j.C5163d;
import kotlin.KotlinVersion;

/* compiled from: DrawableContainerCompat.java */
/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5161b extends Drawable implements Drawable.Callback {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f42626n = 0;

    /* renamed from: b, reason: collision with root package name */
    public c f42627b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f42628c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f42629d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f42630e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f42632g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public a f42634j;

    /* renamed from: k, reason: collision with root package name */
    public long f42635k;

    /* renamed from: l, reason: collision with root package name */
    public long f42636l;

    /* renamed from: m, reason: collision with root package name */
    public C0470b f42637m;

    /* renamed from: f, reason: collision with root package name */
    public int f42631f = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f42633h = -1;

    /* compiled from: DrawableContainerCompat.java */
    /* renamed from: j.b$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C5163d f42638b;

        public a(C5163d c5163d) {
            this.f42638b = c5163d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5163d c5163d = this.f42638b;
            c5163d.a(true);
            c5163d.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainerCompat.java */
    /* renamed from: j.b$c */
    public static abstract class c extends Drawable.ConstantState {

        /* renamed from: A, reason: collision with root package name */
        public boolean f42640A;

        /* renamed from: B, reason: collision with root package name */
        public ColorFilter f42641B;

        /* renamed from: C, reason: collision with root package name */
        public boolean f42642C;

        /* renamed from: D, reason: collision with root package name */
        public ColorStateList f42643D;

        /* renamed from: E, reason: collision with root package name */
        public PorterDuff.Mode f42644E;

        /* renamed from: F, reason: collision with root package name */
        public boolean f42645F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f42646G;

        /* renamed from: a, reason: collision with root package name */
        public final C5163d f42647a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f42648b;

        /* renamed from: c, reason: collision with root package name */
        public int f42649c;

        /* renamed from: d, reason: collision with root package name */
        public int f42650d;

        /* renamed from: e, reason: collision with root package name */
        public int f42651e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f42652f;

        /* renamed from: g, reason: collision with root package name */
        public Drawable[] f42653g;

        /* renamed from: h, reason: collision with root package name */
        public int f42654h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f42655j;

        /* renamed from: k, reason: collision with root package name */
        public Rect f42656k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f42657l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f42658m;

        /* renamed from: n, reason: collision with root package name */
        public int f42659n;

        /* renamed from: o, reason: collision with root package name */
        public int f42660o;

        /* renamed from: p, reason: collision with root package name */
        public int f42661p;

        /* renamed from: q, reason: collision with root package name */
        public int f42662q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f42663r;

        /* renamed from: s, reason: collision with root package name */
        public int f42664s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f42665t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f42666u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f42667v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f42668w;

        /* renamed from: x, reason: collision with root package name */
        public int f42669x;

        /* renamed from: y, reason: collision with root package name */
        public int f42670y;

        /* renamed from: z, reason: collision with root package name */
        public int f42671z;

        public c(C5163d.a aVar, C5163d c5163d, Resources resources) {
            this.i = false;
            this.f42657l = false;
            this.f42668w = true;
            this.f42670y = 0;
            this.f42671z = 0;
            this.f42647a = c5163d;
            this.f42648b = resources != null ? resources : aVar != null ? aVar.f42648b : null;
            int i = aVar != null ? aVar.f42649c : 0;
            int i10 = C5161b.f42626n;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? 160 : i;
            this.f42649c = i;
            if (aVar == null) {
                this.f42653g = new Drawable[10];
                this.f42654h = 0;
                return;
            }
            this.f42650d = aVar.f42650d;
            this.f42651e = aVar.f42651e;
            this.f42666u = true;
            this.f42667v = true;
            this.i = aVar.i;
            this.f42657l = aVar.f42657l;
            this.f42668w = aVar.f42668w;
            this.f42669x = aVar.f42669x;
            this.f42670y = aVar.f42670y;
            this.f42671z = aVar.f42671z;
            this.f42640A = aVar.f42640A;
            this.f42641B = aVar.f42641B;
            this.f42642C = aVar.f42642C;
            this.f42643D = aVar.f42643D;
            this.f42644E = aVar.f42644E;
            this.f42645F = aVar.f42645F;
            this.f42646G = aVar.f42646G;
            if (aVar.f42649c == i) {
                if (aVar.f42655j) {
                    this.f42656k = aVar.f42656k != null ? new Rect(aVar.f42656k) : null;
                    this.f42655j = true;
                }
                if (aVar.f42658m) {
                    this.f42659n = aVar.f42659n;
                    this.f42660o = aVar.f42660o;
                    this.f42661p = aVar.f42661p;
                    this.f42662q = aVar.f42662q;
                    this.f42658m = true;
                }
            }
            if (aVar.f42663r) {
                this.f42664s = aVar.f42664s;
                this.f42663r = true;
            }
            if (aVar.f42665t) {
                this.f42665t = true;
            }
            Drawable[] drawableArr = aVar.f42653g;
            this.f42653g = new Drawable[drawableArr.length];
            this.f42654h = aVar.f42654h;
            SparseArray<Drawable.ConstantState> sparseArray = aVar.f42652f;
            if (sparseArray != null) {
                this.f42652f = sparseArray.clone();
            } else {
                this.f42652f = new SparseArray<>(this.f42654h);
            }
            int i11 = this.f42654h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f42652f.put(i12, constantState);
                    } else {
                        this.f42653g[i12] = drawableArr[i12];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i = this.f42654h;
            if (i >= this.f42653g.length) {
                int i10 = i + 10;
                C5163d.a aVar = (C5163d.a) this;
                Drawable[] drawableArr = new Drawable[i10];
                Drawable[] drawableArr2 = aVar.f42653g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                aVar.f42653g = drawableArr;
                int[][] iArr = new int[i10][];
                System.arraycopy(aVar.f42675H, 0, iArr, 0, i);
                aVar.f42675H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f42647a);
            this.f42653g[i] = drawable;
            this.f42654h++;
            this.f42651e = drawable.getChangingConfigurations() | this.f42651e;
            this.f42663r = false;
            this.f42665t = false;
            this.f42656k = null;
            this.f42655j = false;
            this.f42658m = false;
            this.f42666u = false;
            return i;
        }

        public final void b() {
            this.f42658m = true;
            c();
            int i = this.f42654h;
            Drawable[] drawableArr = this.f42653g;
            this.f42660o = -1;
            this.f42659n = -1;
            this.f42662q = 0;
            this.f42661p = 0;
            for (int i10 = 0; i10 < i; i10++) {
                Drawable drawable = drawableArr[i10];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f42659n) {
                    this.f42659n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f42660o) {
                    this.f42660o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f42661p) {
                    this.f42661p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f42662q) {
                    this.f42662q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f42652f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = this.f42652f.keyAt(i);
                    Drawable.ConstantState constantStateValueAt = this.f42652f.valueAt(i);
                    Drawable[] drawableArr = this.f42653g;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.f42648b);
                    a.b.b(drawableNewDrawable, this.f42669x);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.f42647a);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f42652f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i = this.f42654h;
            Drawable[] drawableArr = this.f42653g;
            for (int i10 = 0; i10 < i; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f42652f.get(i10);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (a.C0009a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f42653g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f42652f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = this.f42652f.valueAt(iIndexOfKey).newDrawable(this.f42648b);
            a.b.b(drawableNewDrawable, this.f42669x);
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.f42647a);
            this.f42653g[i] = drawableMutate;
            this.f42652f.removeAt(iIndexOfKey);
            if (this.f42652f.size() == 0) {
                this.f42652f = null;
            }
            return drawableMutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f42650d | this.f42651e;
        }
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
            r13.f42632g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f42629d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f42635k
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f42631f
            r3.setAlpha(r9)
            r13.f42635k = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            j.b$c r10 = r13.f42627b
            int r10 = r10.f42670y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f42631f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f42635k = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f42630e
            if (r9 == 0) goto L61
            long r10 = r13.f42636l
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f42630e = r0
            r13.f42636l = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            j.b$c r4 = r13.f42627b
            int r4 = r4.f42671z
            int r3 = r3 / r4
            int r4 = r13.f42631f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f42636l = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            j.b$a r14 = r13.f42634j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C5161b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f42627b;
        if (theme == null) {
            cVar.getClass();
            return;
        }
        cVar.c();
        int i = cVar.f42654h;
        Drawable[] drawableArr = cVar.f42653g;
        for (int i10 = 0; i10 < i; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null && a.C0009a.b(drawable)) {
                a.C0009a.a(drawableArr[i10], theme);
                cVar.f42651e |= drawableArr[i10].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            cVar.f42648b = resources;
            int i11 = resources.getDisplayMetrics().densityDpi;
            if (i11 == 0) {
                i11 = 160;
            }
            int i12 = cVar.f42649c;
            cVar.f42649c = i11;
            if (i12 != i11) {
                cVar.f42658m = false;
                cVar.f42655j = false;
            }
        }
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f42637m == null) {
            this.f42637m = new C0470b();
        }
        C0470b c0470b = this.f42637m;
        c0470b.f42639b = drawable.getCallback();
        drawable.setCallback(c0470b);
        try {
            if (this.f42627b.f42670y <= 0 && this.f42632g) {
                drawable.setAlpha(this.f42631f);
            }
            c cVar = this.f42627b;
            if (cVar.f42642C) {
                drawable.setColorFilter(cVar.f42641B);
            } else {
                if (cVar.f42645F) {
                    a.C0009a.h(drawable, cVar.f42643D);
                }
                c cVar2 = this.f42627b;
                if (cVar2.f42646G) {
                    a.C0009a.i(drawable, cVar2.f42644E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f42627b.f42668w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            a.b.b(drawable, a.b.a(this));
            drawable.setAutoMirrored(this.f42627b.f42640A);
            Rect rect = this.f42628c;
            if (rect != null) {
                a.C0009a.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C0470b c0470b2 = this.f42637m;
            Drawable.Callback callback = c0470b2.f42639b;
            c0470b2.f42639b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            C0470b c0470b3 = this.f42637m;
            Drawable.Callback callback2 = c0470b3.f42639b;
            c0470b3.f42639b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f42627b.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f42633h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            j.b$c r0 = r9.f42627b
            int r0 = r0.f42671z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f42630e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f42629d
            if (r0 == 0) goto L29
            r9.f42630e = r0
            j.b$c r0 = r9.f42627b
            int r0 = r0.f42671z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f42636l = r0
            goto L35
        L29:
            r9.f42630e = r4
            r9.f42636l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f42629d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            j.b$c r0 = r9.f42627b
            int r1 = r0.f42654h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f42629d = r0
            r9.f42633h = r10
            if (r0 == 0) goto L5a
            j.b$c r10 = r9.f42627b
            int r10 = r10.f42670y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f42635k = r2
        L51:
            r9.c(r0)
            goto L5a
        L55:
            r9.f42629d = r4
            r10 = -1
            r9.f42633h = r10
        L5a:
            long r0 = r9.f42635k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f42636l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7c
        L67:
            j.b$a r10 = r9.f42634j
            if (r10 != 0) goto L76
            j.b$a r10 = new j.b$a
            r1 = r9
            j.d r1 = (j.C5163d) r1
            r10.<init>(r1)
            r9.f42634j = r10
            goto L79
        L76:
            r9.unscheduleSelf(r10)
        L79:
            r9.a(r0)
        L7c:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C5161b.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f42630e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f42631f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f42627b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        c cVar = this.f42627b;
        if (!cVar.f42666u) {
            cVar.c();
            cVar.f42666u = true;
            int i = cVar.f42654h;
            Drawable[] drawableArr = cVar.f42653g;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    cVar.f42667v = true;
                    z10 = true;
                    break;
                }
                if (drawableArr[i10].getConstantState() == null) {
                    cVar.f42667v = false;
                    z10 = false;
                    break;
                }
                i10++;
            }
        } else {
            z10 = cVar.f42667v;
        }
        if (!z10) {
            return null;
        }
        this.f42627b.f42650d = getChangingConfigurations();
        return this.f42627b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f42629d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f42628c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.f42627b;
        if (cVar.f42657l) {
            if (!cVar.f42658m) {
                cVar.b();
            }
            return cVar.f42660o;
        }
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.f42627b;
        if (cVar.f42657l) {
            if (!cVar.f42658m) {
                cVar.b();
            }
            return cVar.f42659n;
        }
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.f42627b;
        if (cVar.f42657l) {
            if (!cVar.f42658m) {
                cVar.b();
            }
            return cVar.f42662q;
        }
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.f42627b;
        if (cVar.f42657l) {
            if (!cVar.f42658m) {
                cVar.b();
            }
            return cVar.f42661p;
        }
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f42629d;
        if (drawable != null && drawable.isVisible()) {
            c cVar = this.f42627b;
            if (cVar.f42663r) {
                return cVar.f42664s;
            }
            cVar.c();
            int i = cVar.f42654h;
            Drawable[] drawableArr = cVar.f42653g;
            opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i; i10++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i10].getOpacity());
            }
            cVar.f42664s = opacity;
            cVar.f42663r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        c cVar = this.f42627b;
        boolean padding = false;
        Rect rect2 = null;
        if (!cVar.i) {
            Rect rect3 = cVar.f42656k;
            if (rect3 != null || cVar.f42655j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i = cVar.f42654h;
                Drawable[] drawableArr = cVar.f42653g;
                for (int i10 = 0; i10 < i; i10++) {
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
                cVar.f42655j = true;
                cVar.f42656k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f42629d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f42627b.f42640A && a.b.a(this) == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f42627b;
        if (cVar != null) {
            cVar.f42663r = false;
            cVar.f42665t = false;
        }
        if (drawable != this.f42629d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f42627b.f42640A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f42630e;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f42630e = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f42629d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f42632g) {
                this.f42629d.setAlpha(this.f42631f);
            }
        }
        if (this.f42636l != 0) {
            this.f42636l = 0L;
            z10 = true;
        }
        if (this.f42635k != 0) {
            this.f42635k = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            c cVarB = b();
            cVarB.e();
            e(cVarB);
            this.i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f42630e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f42629d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        c cVar = this.f42627b;
        int i10 = this.f42633h;
        int i11 = cVar.f42654h;
        Drawable[] drawableArr = cVar.f42653g;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean zB = a.b.b(drawable, i);
                if (i12 == i10) {
                    z10 = zB;
                }
            }
        }
        cVar.f42669x = i;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f42630e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f42629d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f42630e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f42629d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        if (drawable != this.f42629d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f42632g && this.f42631f == i) {
            return;
        }
        this.f42632g = true;
        this.f42631f = i;
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            if (this.f42635k == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f42627b;
        if (cVar.f42640A != z10) {
            cVar.f42640A = z10;
            Drawable drawable = this.f42629d;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f42627b;
        cVar.f42642C = true;
        if (cVar.f42641B != colorFilter) {
            cVar.f42641B = colorFilter;
            Drawable drawable = this.f42629d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        c cVar = this.f42627b;
        if (cVar.f42668w != z10) {
            cVar.f42668w = z10;
            Drawable drawable = this.f42629d;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            a.C0009a.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i10, int i11, int i12) {
        Rect rect = this.f42628c;
        if (rect == null) {
            this.f42628c = new Rect(i, i10, i11, i12);
        } else {
            rect.set(i, i10, i11, i12);
        }
        Drawable drawable = this.f42629d;
        if (drawable != null) {
            a.C0009a.f(drawable, i, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f42627b;
        cVar.f42645F = true;
        if (cVar.f42643D != colorStateList) {
            cVar.f42643D = colorStateList;
            D0.a.b(this.f42629d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f42627b;
        cVar.f42646G = true;
        if (cVar.f42644E != mode) {
            cVar.f42644E = mode;
            D0.a.c(this.f42629d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f42630e;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f42629d;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f42629d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* compiled from: DrawableContainerCompat.java */
    /* renamed from: j.b$b, reason: collision with other inner class name */
    public static class C0470b implements Drawable.Callback {

        /* renamed from: b, reason: collision with root package name */
        public Drawable.Callback f42639b;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            Drawable.Callback callback = this.f42639b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j4);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f42639b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }
    }
}
