package j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import u.AbstractC2939h;
import u.C2938g;
import u.C2941j;
import v.AbstractC2959a;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2536b extends Drawable.ConstantState {

    /* renamed from: A, reason: collision with root package name */
    public boolean f21222A;

    /* renamed from: B, reason: collision with root package name */
    public ColorFilter f21223B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21224C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f21225D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f21226E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f21227F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21228G;

    /* renamed from: H, reason: collision with root package name */
    public int[][] f21229H;

    /* renamed from: I, reason: collision with root package name */
    public C2938g f21230I;

    /* renamed from: J, reason: collision with root package name */
    public C2941j f21231J;

    /* renamed from: a, reason: collision with root package name */
    public final C2539e f21232a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f21233b;

    /* renamed from: c, reason: collision with root package name */
    public int f21234c;

    /* renamed from: d, reason: collision with root package name */
    public int f21235d;

    /* renamed from: e, reason: collision with root package name */
    public int f21236e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f21237f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f21238g;

    /* renamed from: h, reason: collision with root package name */
    public int f21239h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21240j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f21241k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21242l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21243m;

    /* renamed from: n, reason: collision with root package name */
    public int f21244n;

    /* renamed from: o, reason: collision with root package name */
    public int f21245o;

    /* renamed from: p, reason: collision with root package name */
    public int f21246p;

    /* renamed from: q, reason: collision with root package name */
    public int f21247q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21248r;

    /* renamed from: s, reason: collision with root package name */
    public int f21249s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21250t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21251u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21252v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21253w;

    /* renamed from: x, reason: collision with root package name */
    public int f21254x;

    /* renamed from: y, reason: collision with root package name */
    public int f21255y;

    /* renamed from: z, reason: collision with root package name */
    public int f21256z;

    public C2536b(C2536b c2536b, C2539e c2539e, Resources resources) {
        this.i = false;
        this.f21242l = false;
        this.f21253w = true;
        this.f21255y = 0;
        this.f21256z = 0;
        this.f21232a = c2539e;
        this.f21233b = resources != null ? resources : c2536b != null ? c2536b.f21233b : null;
        int i = c2536b != null ? c2536b.f21234c : 0;
        int i3 = C2539e.f21262H;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.f21234c = i;
        if (c2536b != null) {
            this.f21235d = c2536b.f21235d;
            this.f21236e = c2536b.f21236e;
            this.f21251u = true;
            this.f21252v = true;
            this.i = c2536b.i;
            this.f21242l = c2536b.f21242l;
            this.f21253w = c2536b.f21253w;
            this.f21254x = c2536b.f21254x;
            this.f21255y = c2536b.f21255y;
            this.f21256z = c2536b.f21256z;
            this.f21222A = c2536b.f21222A;
            this.f21223B = c2536b.f21223B;
            this.f21224C = c2536b.f21224C;
            this.f21225D = c2536b.f21225D;
            this.f21226E = c2536b.f21226E;
            this.f21227F = c2536b.f21227F;
            this.f21228G = c2536b.f21228G;
            if (c2536b.f21234c == i) {
                if (c2536b.f21240j) {
                    this.f21241k = c2536b.f21241k != null ? new Rect(c2536b.f21241k) : null;
                    this.f21240j = true;
                }
                if (c2536b.f21243m) {
                    this.f21244n = c2536b.f21244n;
                    this.f21245o = c2536b.f21245o;
                    this.f21246p = c2536b.f21246p;
                    this.f21247q = c2536b.f21247q;
                    this.f21243m = true;
                }
            }
            if (c2536b.f21248r) {
                this.f21249s = c2536b.f21249s;
                this.f21248r = true;
            }
            if (c2536b.f21250t) {
                this.f21250t = true;
            }
            Drawable[] drawableArr = c2536b.f21238g;
            this.f21238g = new Drawable[drawableArr.length];
            this.f21239h = c2536b.f21239h;
            SparseArray sparseArray = c2536b.f21237f;
            if (sparseArray != null) {
                this.f21237f = sparseArray.clone();
            } else {
                this.f21237f = new SparseArray(this.f21239h);
            }
            int i6 = this.f21239h;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f21237f.put(i7, constantState);
                    } else {
                        this.f21238g[i7] = drawableArr[i7];
                    }
                }
            }
        } else {
            this.f21238g = new Drawable[10];
            this.f21239h = 0;
        }
        if (c2536b != null) {
            this.f21229H = c2536b.f21229H;
        } else {
            this.f21229H = new int[this.f21238g.length][];
        }
        if (c2536b != null) {
            this.f21230I = c2536b.f21230I;
            this.f21231J = c2536b.f21231J;
        } else {
            this.f21230I = new C2938g();
            this.f21231J = new C2941j();
        }
    }

    public final int a(Drawable drawable) {
        int i = this.f21239h;
        if (i >= this.f21238g.length) {
            int i3 = i + 10;
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f21238g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f21238g = drawableArr;
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f21229H, 0, iArr, 0, i);
            this.f21229H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f21232a);
        this.f21238g[i] = drawable;
        this.f21239h++;
        this.f21236e = drawable.getChangingConfigurations() | this.f21236e;
        this.f21248r = false;
        this.f21250t = false;
        this.f21241k = null;
        this.f21240j = false;
        this.f21243m = false;
        this.f21251u = false;
        return i;
    }

    public final void b() {
        this.f21243m = true;
        c();
        int i = this.f21239h;
        Drawable[] drawableArr = this.f21238g;
        this.f21245o = -1;
        this.f21244n = -1;
        this.f21247q = 0;
        this.f21246p = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f21244n) {
                this.f21244n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f21245o) {
                this.f21245o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f21246p) {
                this.f21246p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f21247q) {
                this.f21247q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f21237f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f21237f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f21237f.valueAt(i);
                Drawable[] drawableArr = this.f21238g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f21233b);
                drawableNewDrawable.setLayoutDirection(this.f21254x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f21232a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f21237f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f21239h;
        Drawable[] drawableArr = this.f21238g;
        for (int i3 = 0; i3 < i; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f21237f.get(i3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f21238g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f21237f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f21237f.valueAt(iIndexOfKey)).newDrawable(this.f21233b);
        drawableNewDrawable.setLayoutDirection(this.f21254x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f21232a);
        this.f21238g[i] = drawableMutate;
        this.f21237f.removeAt(iIndexOfKey);
        if (this.f21237f.size() == 0) {
            this.f21237f = null;
        }
        return drawableMutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i) {
        ?? r52;
        if (i < 0) {
            return 0;
        }
        C2941j c2941j = this.f21231J;
        int i3 = 0;
        int iA = AbstractC2959a.a(c2941j.f23707b, c2941j.f23709d, i);
        if (iA >= 0 && (r52 = c2941j.f23708c[iA]) != AbstractC2939h.f23702b) {
            i3 = r52;
        }
        return i3.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f21229H;
        int i = this.f21239h;
        for (int i3 = 0; i3 < i; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f21235d | this.f21236e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C2539e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C2539e(this, resources);
    }
}
