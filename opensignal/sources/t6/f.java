package t6;

import android.text.Layout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f22436a;

    /* renamed from: b, reason: collision with root package name */
    public int f22437b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22438c;

    /* renamed from: d, reason: collision with root package name */
    public int f22439d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22440e;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public String f22445l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f22448o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f22449p;

    /* renamed from: r, reason: collision with root package name */
    public b f22451r;

    /* renamed from: f, reason: collision with root package name */
    public int f22441f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f22442g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f22443h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f22444i = -1;
    public int j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f22446m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f22447n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f22450q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f22452s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f22438c && fVar.f22438c) {
                this.f22437b = fVar.f22437b;
                this.f22438c = true;
            }
            if (this.f22443h == -1) {
                this.f22443h = fVar.f22443h;
            }
            if (this.f22444i == -1) {
                this.f22444i = fVar.f22444i;
            }
            if (this.f22436a == null && (str = fVar.f22436a) != null) {
                this.f22436a = str;
            }
            if (this.f22441f == -1) {
                this.f22441f = fVar.f22441f;
            }
            if (this.f22442g == -1) {
                this.f22442g = fVar.f22442g;
            }
            if (this.f22447n == -1) {
                this.f22447n = fVar.f22447n;
            }
            if (this.f22448o == null && (alignment2 = fVar.f22448o) != null) {
                this.f22448o = alignment2;
            }
            if (this.f22449p == null && (alignment = fVar.f22449p) != null) {
                this.f22449p = alignment;
            }
            if (this.f22450q == -1) {
                this.f22450q = fVar.f22450q;
            }
            if (this.j == -1) {
                this.j = fVar.j;
                this.k = fVar.k;
            }
            if (this.f22451r == null) {
                this.f22451r = fVar.f22451r;
            }
            if (this.f22452s == Float.MAX_VALUE) {
                this.f22452s = fVar.f22452s;
            }
            if (!this.f22440e && fVar.f22440e) {
                this.f22439d = fVar.f22439d;
                this.f22440e = true;
            }
            if (this.f22446m != -1 || (i10 = fVar.f22446m) == -1) {
                return;
            }
            this.f22446m = i10;
        }
    }
}
