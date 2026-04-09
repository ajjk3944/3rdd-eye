package fb;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f8776w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f8777x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f8778y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f8779z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8780a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f8781b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f8782c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8783d;

    /* renamed from: e, reason: collision with root package name */
    public int f8784e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8785f;

    /* renamed from: g, reason: collision with root package name */
    public int f8786g;

    /* renamed from: h, reason: collision with root package name */
    public int f8787h;

    /* renamed from: i, reason: collision with root package name */
    public int f8788i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f8789l;

    /* renamed from: m, reason: collision with root package name */
    public int f8790m;

    /* renamed from: n, reason: collision with root package name */
    public int f8791n;

    /* renamed from: o, reason: collision with root package name */
    public int f8792o;

    /* renamed from: p, reason: collision with root package name */
    public int f8793p;

    /* renamed from: q, reason: collision with root package name */
    public int f8794q;

    /* renamed from: r, reason: collision with root package name */
    public int f8795r;

    /* renamed from: s, reason: collision with root package name */
    public int f8796s;

    /* renamed from: t, reason: collision with root package name */
    public int f8797t;

    /* renamed from: u, reason: collision with root package name */
    public int f8798u;

    /* renamed from: v, reason: collision with root package name */
    public int f8799v;

    static {
        int iC = c(0, 0, 0, 0);
        f8777x = iC;
        int iC2 = c(0, 0, 0, 3);
        f8778y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f8779z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            qb.b.i(r4, r0)
            qb.b.i(r5, r0)
            qb.b.i(r6, r0)
            qb.b.i(r7, r0)
            r0 = 1
            r1 = 255(0xff, float:3.57E-43)
            r2 = 0
            if (r7 == 0) goto L1b
            if (r7 == r0) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r1
            goto L21
        L1d:
            r7 = r2
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r0) goto L25
            r4 = r1
            goto L26
        L25:
            r4 = r2
        L26:
            if (r5 <= r0) goto L2a
            r5 = r1
            goto L2b
        L2a:
            r5 = r2
        L2b:
            if (r6 <= r0) goto L2e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.e.c(int, int, int, int):int");
    }

    public final void a(char c4) {
        SpannableStringBuilder spannableStringBuilder = this.f8781b;
        if (c4 != '\n') {
            spannableStringBuilder.append(c4);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f8780a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f8793p != -1) {
            this.f8793p = 0;
        }
        if (this.f8794q != -1) {
            this.f8794q = 0;
        }
        if (this.f8795r != -1) {
            this.f8795r = 0;
        }
        if (this.f8797t != -1) {
            this.f8797t = 0;
        }
        while (true) {
            if ((!this.k || arrayList.size() < this.j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8781b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f8793p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f8793p, length, 33);
            }
            if (this.f8794q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8794q, length, 33);
            }
            if (this.f8795r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8796s), this.f8795r, length, 33);
            }
            if (this.f8797t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8798u), this.f8797t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f8780a.clear();
        this.f8781b.clear();
        this.f8793p = -1;
        this.f8794q = -1;
        this.f8795r = -1;
        this.f8797t = -1;
        this.f8799v = 0;
        this.f8782c = false;
        this.f8783d = false;
        this.f8784e = 4;
        this.f8785f = false;
        this.f8786g = 0;
        this.f8787h = 0;
        this.f8788i = 0;
        this.j = 15;
        this.k = true;
        this.f8789l = 0;
        this.f8790m = 0;
        this.f8791n = 0;
        int i10 = f8777x;
        this.f8792o = i10;
        this.f8796s = f8776w;
        this.f8798u = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f8793p;
        SpannableStringBuilder spannableStringBuilder = this.f8781b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f8793p, spannableStringBuilder.length(), 33);
                this.f8793p = -1;
            }
        } else if (z10) {
            this.f8793p = spannableStringBuilder.length();
        }
        if (this.f8794q == -1) {
            if (z11) {
                this.f8794q = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8794q, spannableStringBuilder.length(), 33);
            this.f8794q = -1;
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f8795r;
        SpannableStringBuilder spannableStringBuilder = this.f8781b;
        if (i12 != -1 && this.f8796s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8796s), this.f8795r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f8776w) {
            this.f8795r = spannableStringBuilder.length();
            this.f8796s = i10;
        }
        if (this.f8797t != -1 && this.f8798u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8798u), this.f8797t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f8777x) {
            this.f8797t = spannableStringBuilder.length();
            this.f8798u = i11;
        }
    }
}
