package o6;

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
    public static final int f19133w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f19134x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f19135y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f19136z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19137a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f19138b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f19139c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19140d;

    /* renamed from: e, reason: collision with root package name */
    public int f19141e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19142f;

    /* renamed from: g, reason: collision with root package name */
    public int f19143g;

    /* renamed from: h, reason: collision with root package name */
    public int f19144h;

    /* renamed from: i, reason: collision with root package name */
    public int f19145i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f19146l;

    /* renamed from: m, reason: collision with root package name */
    public int f19147m;

    /* renamed from: n, reason: collision with root package name */
    public int f19148n;

    /* renamed from: o, reason: collision with root package name */
    public int f19149o;

    /* renamed from: p, reason: collision with root package name */
    public int f19150p;

    /* renamed from: q, reason: collision with root package name */
    public int f19151q;

    /* renamed from: r, reason: collision with root package name */
    public int f19152r;

    /* renamed from: s, reason: collision with root package name */
    public int f19153s;

    /* renamed from: t, reason: collision with root package name */
    public int f19154t;

    /* renamed from: u, reason: collision with root package name */
    public int f19155u;

    /* renamed from: v, reason: collision with root package name */
    public int f19156v;

    static {
        int iC = c(0, 0, 0, 0);
        f19134x = iC;
        int iC2 = c(0, 0, 0, 3);
        f19135y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f19136z = new int[]{0, 0, 0, 0, 0, 0, 2};
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
            a5.a.g(r4, r0)
            a5.a.g(r5, r0)
            a5.a.g(r6, r0)
            a5.a.g(r7, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: o6.e.c(int, int, int, int):int");
    }

    public final void a(char c4) {
        SpannableStringBuilder spannableStringBuilder = this.f19138b;
        if (c4 != '\n') {
            spannableStringBuilder.append(c4);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f19137a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f19150p != -1) {
            this.f19150p = 0;
        }
        if (this.f19151q != -1) {
            this.f19151q = 0;
        }
        if (this.f19152r != -1) {
            this.f19152r = 0;
        }
        if (this.f19154t != -1) {
            this.f19154t = 0;
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f19138b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f19150p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f19150p, length, 33);
            }
            if (this.f19151q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f19151q, length, 33);
            }
            if (this.f19152r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f19153s), this.f19152r, length, 33);
            }
            if (this.f19154t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f19155u), this.f19154t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f19137a.clear();
        this.f19138b.clear();
        this.f19150p = -1;
        this.f19151q = -1;
        this.f19152r = -1;
        this.f19154t = -1;
        this.f19156v = 0;
        this.f19139c = false;
        this.f19140d = false;
        this.f19141e = 4;
        this.f19142f = false;
        this.f19143g = 0;
        this.f19144h = 0;
        this.f19145i = 0;
        this.j = 15;
        this.k = true;
        this.f19146l = 0;
        this.f19147m = 0;
        this.f19148n = 0;
        int i10 = f19134x;
        this.f19149o = i10;
        this.f19153s = f19133w;
        this.f19155u = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f19150p;
        SpannableStringBuilder spannableStringBuilder = this.f19138b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f19150p, spannableStringBuilder.length(), 33);
                this.f19150p = -1;
            }
        } else if (z10) {
            this.f19150p = spannableStringBuilder.length();
        }
        if (this.f19151q == -1) {
            if (z11) {
                this.f19151q = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f19151q, spannableStringBuilder.length(), 33);
            this.f19151q = -1;
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f19152r;
        SpannableStringBuilder spannableStringBuilder = this.f19138b;
        if (i12 != -1 && this.f19153s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f19153s), this.f19152r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f19133w) {
            this.f19152r = spannableStringBuilder.length();
            this.f19153s = i10;
        }
        if (this.f19154t != -1 && this.f19155u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f19155u), this.f19154t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f19134x) {
            this.f19154t = spannableStringBuilder.length();
            this.f19155u = i11;
        }
    }
}
