package y1;

import android.os.Looper;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class f0 extends br.n implements ar.a {
    public static final f0 B;
    public static final f0 D;
    public static final f0 E;
    public static final f0 F;
    public static final f0 G;
    public static final f0 H;
    public static final f0 I;
    public static final f0 J;
    public static final f0 K;
    public static final f0 L;
    public static final f0 M;
    public static final f0 N;
    public static final f0 O;
    public static final f0 P;
    public static final f0 Q;
    public static final f0 R;
    public static final f0 S;
    public static final f0 T;
    public static final f0 U;
    public static final f0 V;
    public static final f0 W;
    public static final f0 X;
    public static final f0 Y;
    public static final f0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final f0 f25676a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final f0 f25677b0;

    /* renamed from: g, reason: collision with root package name */
    public static final f0 f25678g;

    /* renamed from: r, reason: collision with root package name */
    public static final f0 f25679r;

    /* renamed from: x, reason: collision with root package name */
    public static final f0 f25680x;

    /* renamed from: y, reason: collision with root package name */
    public static final f0 f25681y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25682d;

    static {
        int i10 = 0;
        f25678g = new f0(i10, 0);
        f25679r = new f0(i10, 1);
        f25680x = new f0(i10, 2);
        f25681y = new f0(i10, 3);
        B = new f0(i10, 4);
        D = new f0(i10, 5);
        E = new f0(i10, 6);
        F = new f0(i10, 7);
        G = new f0(i10, 8);
        H = new f0(i10, 9);
        I = new f0(i10, 10);
        J = new f0(i10, 11);
        K = new f0(i10, 12);
        L = new f0(i10, 13);
        M = new f0(i10, 14);
        N = new f0(i10, 15);
        O = new f0(i10, 16);
        P = new f0(i10, 17);
        Q = new f0(i10, 18);
        R = new f0(i10, 19);
        S = new f0(i10, 20);
        T = new f0(i10, 21);
        U = new f0(i10, 22);
        V = new f0(i10, 23);
        W = new f0(i10, 24);
        X = new f0(i10, 25);
        Y = new f0(i10, 26);
        Z = new f0(i10, 27);
        f25676a0 = new f0(i10, 28);
        f25677b0 = new f0(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i10, int i11) {
        super(i10);
        this.f25682d = i11;
    }

    @Override // ar.a
    public final Object c() {
        Choreographer choreographer;
        pq.c cVar = null;
        switch (this.f25682d) {
            case 0:
                l0.b("LocalConfiguration");
                throw null;
            case 1:
                l0.b("LocalContext");
                throw null;
            case 2:
                l0.b("LocalImageVectorCache");
                throw null;
            case 3:
                l0.b("LocalResourceIdCache");
                throw null;
            case 4:
                l0.b("LocalView");
                throw null;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    du.f fVar = wt.d0.f24610a;
                    int i10 = 2;
                    choreographer = (Choreographer) wt.w.w(bu.n.f2983a, new d4.d1(i10, cVar, i10));
                }
                n0 n0Var = new n0(choreographer, dr.a.h(Looper.getMainLooper()));
                return se.b.M(n0Var, n0Var.H);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                c1.b("LocalAutofillManager");
                throw null;
            case 9:
                c1.b("LocalAutofillTree");
                throw null;
            case 10:
                c1.b("LocalClipboard");
                throw null;
            case 11:
                c1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                c1.b("LocalDensity");
                throw null;
            case 14:
                c1.b("LocalFocusManager");
                throw null;
            case 15:
                c1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                c1.b("LocalFontLoader");
                throw null;
            case 17:
                c1.b("LocalGraphicsContext");
                throw null;
            case 18:
                c1.b("LocalHapticFeedback");
                throw null;
            case 19:
                c1.b("LocalInputManager");
                throw null;
            case 20:
                c1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                c1.b("LocalTextToolbar");
                throw null;
            case 26:
                c1.b("LocalUriHandler");
                throw null;
            case 27:
                c1.b("LocalViewConfiguration");
                throw null;
            case 28:
                c1.b("LocalWindowInfo");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
