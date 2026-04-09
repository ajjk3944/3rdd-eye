package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import x.o;
import x.o0;
import x.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public o I;
    public o0 J;

    /* renamed from: a, reason: collision with root package name */
    public final e f27723a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f27724b;

    /* renamed from: c, reason: collision with root package name */
    public int f27725c;

    /* renamed from: d, reason: collision with root package name */
    public int f27726d;

    /* renamed from: e, reason: collision with root package name */
    public int f27727e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f27728f;
    public Drawable[] g;

    /* renamed from: h, reason: collision with root package name */
    public int f27729h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27730i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f27731k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27732l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27733m;

    /* renamed from: n, reason: collision with root package name */
    public int f27734n;

    /* renamed from: o, reason: collision with root package name */
    public int f27735o;

    /* renamed from: p, reason: collision with root package name */
    public int f27736p;

    /* renamed from: q, reason: collision with root package name */
    public int f27737q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f27738r;

    /* renamed from: s, reason: collision with root package name */
    public int f27739s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27740t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27741u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27742v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27743w;

    /* renamed from: x, reason: collision with root package name */
    public int f27744x;

    /* renamed from: y, reason: collision with root package name */
    public int f27745y;

    /* renamed from: z, reason: collision with root package name */
    public int f27746z;

    public b(b bVar, e eVar, Resources resources) {
        this.f27730i = false;
        this.f27732l = false;
        this.f27743w = true;
        this.f27745y = 0;
        this.f27746z = 0;
        this.f27723a = eVar;
        this.f27724b = resources != null ? resources : bVar != null ? bVar.f27724b : null;
        int i4 = bVar != null ? bVar.f27725c : 0;
        int i10 = e.f27752t;
        i4 = resources != null ? resources.getDisplayMetrics().densityDpi : i4;
        i4 = i4 == 0 ? 160 : i4;
        this.f27725c = i4;
        if (bVar != null) {
            this.f27726d = bVar.f27726d;
            this.f27727e = bVar.f27727e;
            this.f27741u = true;
            this.f27742v = true;
            this.f27730i = bVar.f27730i;
            this.f27732l = bVar.f27732l;
            this.f27743w = bVar.f27743w;
            this.f27744x = bVar.f27744x;
            this.f27745y = bVar.f27745y;
            this.f27746z = bVar.f27746z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f27725c == i4) {
                if (bVar.j) {
                    this.f27731k = bVar.f27731k != null ? new Rect(bVar.f27731k) : null;
                    this.j = true;
                }
                if (bVar.f27733m) {
                    this.f27734n = bVar.f27734n;
                    this.f27735o = bVar.f27735o;
                    this.f27736p = bVar.f27736p;
                    this.f27737q = bVar.f27737q;
                    this.f27733m = true;
                }
            }
            if (bVar.f27738r) {
                this.f27739s = bVar.f27739s;
                this.f27738r = true;
            }
            if (bVar.f27740t) {
                this.f27740t = true;
            }
            Drawable[] drawableArr = bVar.g;
            this.g = new Drawable[drawableArr.length];
            this.f27729h = bVar.f27729h;
            SparseArray sparseArray = bVar.f27728f;
            if (sparseArray != null) {
                this.f27728f = sparseArray.clone();
            } else {
                this.f27728f = new SparseArray(this.f27729h);
            }
            int i11 = this.f27729h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f27728f.put(i12, constantState);
                    } else {
                        this.g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.f27729h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new o((Object) null);
            this.J = new o0(0);
        }
    }

    public final int a(Drawable drawable) {
        int i4 = this.f27729h;
        if (i4 >= this.g.length) {
            int i10 = i4 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i4);
            }
            this.g = drawableArr;
            int[][] iArr = new int[i10][];
            System.arraycopy(this.H, 0, iArr, 0, i4);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f27723a);
        this.g[i4] = drawable;
        this.f27729h++;
        this.f27727e = drawable.getChangingConfigurations() | this.f27727e;
        this.f27738r = false;
        this.f27740t = false;
        this.f27731k = null;
        this.j = false;
        this.f27733m = false;
        this.f27741u = false;
        return i4;
    }

    public final void b() {
        this.f27733m = true;
        c();
        int i4 = this.f27729h;
        Drawable[] drawableArr = this.g;
        this.f27735o = -1;
        this.f27734n = -1;
        this.f27737q = 0;
        this.f27736p = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f27734n) {
                this.f27734n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f27735o) {
                this.f27735o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f27736p) {
                this.f27736p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f27737q) {
                this.f27737q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f27728f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = this.f27728f.keyAt(i4);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f27728f.valueAt(i4);
                Drawable[] drawableArr = this.g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f27724b);
                drawableNewDrawable.setLayoutDirection(this.f27744x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f27723a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f27728f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i4 = this.f27729h;
        Drawable[] drawableArr = this.g;
        for (int i10 = 0; i10 < i4; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f27728f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i4) {
        int iIndexOfKey;
        Drawable drawable = this.g[i4];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f27728f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i4)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f27728f.valueAt(iIndexOfKey)).newDrawable(this.f27724b);
        drawableNewDrawable.setLayoutDirection(this.f27744x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f27723a);
        this.g[i4] = drawableMutate;
        this.f27728f.removeAt(iIndexOfKey);
        if (this.f27728f.size() == 0) {
            this.f27728f = null;
        }
        return drawableMutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i4) {
        ?? r52;
        if (i4 < 0) {
            return 0;
        }
        o0 o0Var = this.J;
        int i10 = 0;
        int iA = y.a.a(o0Var.f36925a, o0Var.f36927c, i4);
        if (iA >= 0 && (r52 = o0Var.f36926b[iA]) != p.f36930c) {
            i10 = r52;
        }
        return i10.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i4 = this.f27729h;
        for (int i10 = 0; i10 < i4; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f27726d | this.f27727e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
