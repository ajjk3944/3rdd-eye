package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6697d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52884a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f52885b = D(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f52886c = D(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f52887d = D(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f52888e = D(3);

    /* renamed from: f, reason: collision with root package name */
    private static final int f52889f = D(4);

    /* renamed from: g, reason: collision with root package name */
    private static final int f52890g = D(5);

    /* renamed from: h, reason: collision with root package name */
    private static final int f52891h = D(6);

    /* renamed from: i, reason: collision with root package name */
    private static final int f52892i = D(7);

    /* renamed from: j, reason: collision with root package name */
    private static final int f52893j = D(8);

    /* renamed from: k, reason: collision with root package name */
    private static final int f52894k = D(9);

    /* renamed from: l, reason: collision with root package name */
    private static final int f52895l = D(10);

    /* renamed from: m, reason: collision with root package name */
    private static final int f52896m = D(11);

    /* renamed from: n, reason: collision with root package name */
    private static final int f52897n = D(12);

    /* renamed from: o, reason: collision with root package name */
    private static final int f52898o = D(13);

    /* renamed from: p, reason: collision with root package name */
    private static final int f52899p = D(14);

    /* renamed from: q, reason: collision with root package name */
    private static final int f52900q = D(15);

    /* renamed from: r, reason: collision with root package name */
    private static final int f52901r = D(16);

    /* renamed from: s, reason: collision with root package name */
    private static final int f52902s = D(17);

    /* renamed from: t, reason: collision with root package name */
    private static final int f52903t = D(18);

    /* renamed from: u, reason: collision with root package name */
    private static final int f52904u = D(19);

    /* renamed from: v, reason: collision with root package name */
    private static final int f52905v = D(20);

    /* renamed from: w, reason: collision with root package name */
    private static final int f52906w = D(21);

    /* renamed from: x, reason: collision with root package name */
    private static final int f52907x = D(22);

    /* renamed from: y, reason: collision with root package name */
    private static final int f52908y = D(23);

    /* renamed from: z, reason: collision with root package name */
    private static final int f52909z = D(24);

    /* renamed from: A, reason: collision with root package name */
    private static final int f52880A = D(25);

    /* renamed from: B, reason: collision with root package name */
    private static final int f52881B = D(26);

    /* renamed from: C, reason: collision with root package name */
    private static final int f52882C = D(27);

    /* renamed from: D, reason: collision with root package name */
    private static final int f52883D = D(28);

    /* renamed from: m0.d0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return AbstractC6697d0.f52892i;
        }

        public final int B() {
            return AbstractC6697d0.f52888e;
        }

        public final int C() {
            return AbstractC6697d0.f52896m;
        }

        public final int a() {
            return AbstractC6697d0.f52885b;
        }

        public final int b() {
            return AbstractC6697d0.f52882C;
        }

        public final int c() {
            return AbstractC6697d0.f52904u;
        }

        public final int d() {
            return AbstractC6697d0.f52903t;
        }

        public final int e() {
            return AbstractC6697d0.f52901r;
        }

        public final int f() {
            return AbstractC6697d0.f52907x;
        }

        public final int g() {
            return AbstractC6697d0.f52887d;
        }

        public final int h() {
            return AbstractC6697d0.f52895l;
        }

        public final int i() {
            return AbstractC6697d0.f52891h;
        }

        public final int j() {
            return AbstractC6697d0.f52893j;
        }

        public final int k() {
            return AbstractC6697d0.f52889f;
        }

        public final int l() {
            return AbstractC6697d0.f52908y;
        }

        public final int m() {
            return AbstractC6697d0.f52905v;
        }

        public final int n() {
            return AbstractC6697d0.f52880A;
        }

        public final int o() {
            return AbstractC6697d0.f52902s;
        }

        public final int p() {
            return AbstractC6697d0.f52883D;
        }

        public final int q() {
            return AbstractC6697d0.f52898o;
        }

        public final int r() {
            return AbstractC6697d0.f52909z;
        }

        public final int s() {
            return AbstractC6697d0.f52900q;
        }

        public final int t() {
            return AbstractC6697d0.f52897n;
        }

        public final int u() {
            return AbstractC6697d0.f52881B;
        }

        public final int v() {
            return AbstractC6697d0.f52899p;
        }

        public final int w() {
            return AbstractC6697d0.f52906w;
        }

        public final int x() {
            return AbstractC6697d0.f52886c;
        }

        public final int y() {
            return AbstractC6697d0.f52894k;
        }

        public final int z() {
            return AbstractC6697d0.f52890g;
        }

        private a() {
        }
    }

    public static int D(int i10) {
        return i10;
    }

    public static final boolean E(int i10, int i11) {
        return i10 == i11;
    }

    public static int F(int i10) {
        return Integer.hashCode(i10);
    }

    public static String G(int i10) {
        return E(i10, f52885b) ? "Clear" : E(i10, f52886c) ? "Src" : E(i10, f52887d) ? "Dst" : E(i10, f52888e) ? "SrcOver" : E(i10, f52889f) ? "DstOver" : E(i10, f52890g) ? "SrcIn" : E(i10, f52891h) ? "DstIn" : E(i10, f52892i) ? "SrcOut" : E(i10, f52893j) ? "DstOut" : E(i10, f52894k) ? "SrcAtop" : E(i10, f52895l) ? "DstAtop" : E(i10, f52896m) ? "Xor" : E(i10, f52897n) ? "Plus" : E(i10, f52898o) ? "Modulate" : E(i10, f52899p) ? "Screen" : E(i10, f52900q) ? "Overlay" : E(i10, f52901r) ? "Darken" : E(i10, f52902s) ? "Lighten" : E(i10, f52903t) ? "ColorDodge" : E(i10, f52904u) ? "ColorBurn" : E(i10, f52905v) ? "HardLight" : E(i10, f52906w) ? "Softlight" : E(i10, f52907x) ? "Difference" : E(i10, f52908y) ? "Exclusion" : E(i10, f52909z) ? "Multiply" : E(i10, f52880A) ? "Hue" : E(i10, f52881B) ? "Saturation" : E(i10, f52882C) ? "Color" : E(i10, f52883D) ? "Luminosity" : "Unknown";
    }
}
