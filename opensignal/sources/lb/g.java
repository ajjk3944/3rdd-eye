package lb;

import android.text.Layout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f15115a;

    /* renamed from: b, reason: collision with root package name */
    public int f15116b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15117c;

    /* renamed from: d, reason: collision with root package name */
    public int f15118d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15119e;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public String f15124l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f15127o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f15128p;

    /* renamed from: r, reason: collision with root package name */
    public b f15130r;

    /* renamed from: f, reason: collision with root package name */
    public int f15120f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f15121g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f15122h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f15123i = -1;
    public int j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f15125m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f15126n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f15129q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f15131s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f15117c && gVar.f15117c) {
                this.f15116b = gVar.f15116b;
                this.f15117c = true;
            }
            if (this.f15122h == -1) {
                this.f15122h = gVar.f15122h;
            }
            if (this.f15123i == -1) {
                this.f15123i = gVar.f15123i;
            }
            if (this.f15115a == null && (str = gVar.f15115a) != null) {
                this.f15115a = str;
            }
            if (this.f15120f == -1) {
                this.f15120f = gVar.f15120f;
            }
            if (this.f15121g == -1) {
                this.f15121g = gVar.f15121g;
            }
            if (this.f15126n == -1) {
                this.f15126n = gVar.f15126n;
            }
            if (this.f15127o == null && (alignment2 = gVar.f15127o) != null) {
                this.f15127o = alignment2;
            }
            if (this.f15128p == null && (alignment = gVar.f15128p) != null) {
                this.f15128p = alignment;
            }
            if (this.f15129q == -1) {
                this.f15129q = gVar.f15129q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.k = gVar.k;
            }
            if (this.f15130r == null) {
                this.f15130r = gVar.f15130r;
            }
            if (this.f15131s == Float.MAX_VALUE) {
                this.f15131s = gVar.f15131s;
            }
            if (!this.f15119e && gVar.f15119e) {
                this.f15118d = gVar.f15118d;
                this.f15119e = true;
            }
            if (this.f15125m != -1 || (i10 = gVar.f15125m) == -1) {
                return;
            }
            this.f15125m = i10;
        }
    }
}
