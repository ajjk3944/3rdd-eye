package j2;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends nk.l implements mk.a {
    public static final e0 A;
    public static final e0 B;
    public static final e0 C;
    public static final e0 D;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f27110b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f27111c;

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f27112d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f27113e;

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f27114f;
    public static final e0 g;

    /* renamed from: h, reason: collision with root package name */
    public static final e0 f27115h;

    /* renamed from: i, reason: collision with root package name */
    public static final e0 f27116i;
    public static final e0 j;

    /* renamed from: k, reason: collision with root package name */
    public static final e0 f27117k;

    /* renamed from: l, reason: collision with root package name */
    public static final e0 f27118l;

    /* renamed from: m, reason: collision with root package name */
    public static final e0 f27119m;

    /* renamed from: n, reason: collision with root package name */
    public static final e0 f27120n;

    /* renamed from: o, reason: collision with root package name */
    public static final e0 f27121o;

    /* renamed from: p, reason: collision with root package name */
    public static final e0 f27122p;

    /* renamed from: q, reason: collision with root package name */
    public static final e0 f27123q;

    /* renamed from: r, reason: collision with root package name */
    public static final e0 f27124r;

    /* renamed from: s, reason: collision with root package name */
    public static final e0 f27125s;

    /* renamed from: t, reason: collision with root package name */
    public static final e0 f27126t;

    /* renamed from: u, reason: collision with root package name */
    public static final e0 f27127u;

    /* renamed from: v, reason: collision with root package name */
    public static final e0 f27128v;

    /* renamed from: w, reason: collision with root package name */
    public static final e0 f27129w;

    /* renamed from: x, reason: collision with root package name */
    public static final e0 f27130x;

    /* renamed from: y, reason: collision with root package name */
    public static final e0 f27131y;

    /* renamed from: z, reason: collision with root package name */
    public static final e0 f27132z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27133a;

    static {
        int i4 = 0;
        f27110b = new e0(i4, 0);
        f27111c = new e0(i4, 1);
        f27112d = new e0(i4, 2);
        f27113e = new e0(i4, 3);
        f27114f = new e0(i4, 4);
        g = new e0(i4, 5);
        f27115h = new e0(i4, 6);
        f27116i = new e0(i4, 7);
        j = new e0(i4, 8);
        f27117k = new e0(i4, 9);
        f27118l = new e0(i4, 10);
        f27119m = new e0(i4, 11);
        f27120n = new e0(i4, 12);
        f27121o = new e0(i4, 13);
        f27122p = new e0(i4, 14);
        f27123q = new e0(i4, 15);
        f27124r = new e0(i4, 16);
        f27125s = new e0(i4, 17);
        f27126t = new e0(i4, 18);
        f27127u = new e0(i4, 19);
        f27128v = new e0(i4, 20);
        f27129w = new e0(i4, 21);
        f27130x = new e0(i4, 22);
        f27131y = new e0(i4, 23);
        f27132z = new e0(i4, 24);
        A = new e0(i4, 25);
        B = new e0(i4, 26);
        C = new e0(i4, 27);
        D = new e0(i4, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i4, int i10) {
        super(i4);
        this.f27133a = i10;
    }

    @Override // mk.a
    public final Object invoke() {
        Choreographer choreographer;
        ck.c cVar = null;
        switch (this.f27133a) {
            case 0:
                h0.b("LocalConfiguration");
                throw null;
            case 1:
                h0.b("LocalContext");
                throw null;
            case 2:
                h0.b("LocalImageVectorCache");
                throw null;
            case 3:
                h0.b("LocalResourceIdCache");
                throw null;
            case 4:
                h0.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    el.e eVar = xk.g0.f37189a;
                    choreographer = (Choreographer) xk.x.z(cl.o.f2935a, new bh.p(2, cVar, 5));
                }
                j0 j0Var = new j0(choreographer, com.bumptech.glide.e.r(Looper.getMainLooper()));
                return wd.b.O(j0Var, j0Var.f27198l);
            case 6:
            case 7:
                return null;
            case 8:
                a1.b("LocalAutofillManager");
                throw null;
            case 9:
                a1.b("LocalAutofillTree");
                throw null;
            case 10:
                a1.b("LocalClipboard");
                throw null;
            case 11:
                a1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                a1.b("LocalDensity");
                throw null;
            case 14:
                a1.b("LocalFocusManager");
                throw null;
            case 15:
                a1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                a1.b("LocalFontLoader");
                throw null;
            case 17:
                a1.b("LocalGraphicsContext");
                throw null;
            case 18:
                a1.b("LocalHapticFeedback");
                throw null;
            case 19:
                a1.b("LocalInputManager");
                throw null;
            case 20:
                a1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                a1.b("LocalTextToolbar");
                throw null;
            case 26:
                a1.b("LocalUriHandler");
                throw null;
            case 27:
                a1.b("LocalViewConfiguration");
                throw null;
            default:
                a1.b("LocalWindowInfo");
                throw null;
        }
    }
}
