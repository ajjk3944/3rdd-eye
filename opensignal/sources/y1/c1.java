package y1;

import androidx.compose.ui.node.Owner;

/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.h2 f25639a = new n0.h2(f0.E);

    /* renamed from: b, reason: collision with root package name */
    public static final n0.h2 f25640b = new n0.h2(f0.F);

    /* renamed from: c, reason: collision with root package name */
    public static final n0.h2 f25641c = new n0.h2(f0.H);

    /* renamed from: d, reason: collision with root package name */
    public static final n0.h2 f25642d = new n0.h2(f0.G);

    /* renamed from: e, reason: collision with root package name */
    public static final n0.h2 f25643e = new n0.h2(f0.J);

    /* renamed from: f, reason: collision with root package name */
    public static final n0.h2 f25644f = new n0.h2(f0.I);

    /* renamed from: g, reason: collision with root package name */
    public static final n0.h2 f25645g = new n0.h2(f0.P);

    /* renamed from: h, reason: collision with root package name */
    public static final n0.h2 f25646h = new n0.h2(f0.L);

    /* renamed from: i, reason: collision with root package name */
    public static final n0.h2 f25647i = new n0.h2(f0.M);
    public static final n0.h2 j = new n0.h2(f0.O);
    public static final n0.h2 k = new n0.h2(f0.N);

    /* renamed from: l, reason: collision with root package name */
    public static final n0.h2 f25648l = new n0.h2(f0.Q);

    /* renamed from: m, reason: collision with root package name */
    public static final n0.h2 f25649m = new n0.h2(f0.R);

    /* renamed from: n, reason: collision with root package name */
    public static final n0.h2 f25650n = new n0.h2(f0.S);

    /* renamed from: o, reason: collision with root package name */
    public static final n0.h2 f25651o = new n0.h2(f0.W);

    /* renamed from: p, reason: collision with root package name */
    public static final n0.h2 f25652p = new n0.h2(f0.V);

    /* renamed from: q, reason: collision with root package name */
    public static final n0.h2 f25653q = new n0.h2(f0.X);

    /* renamed from: r, reason: collision with root package name */
    public static final n0.h2 f25654r = new n0.h2(f0.Y);

    /* renamed from: s, reason: collision with root package name */
    public static final n0.h2 f25655s = new n0.h2(f0.Z);

    /* renamed from: t, reason: collision with root package name */
    public static final n0.h2 f25656t = new n0.h2(f0.f25676a0);

    /* renamed from: u, reason: collision with root package name */
    public static final n0.h2 f25657u = new n0.h2(f0.T);

    /* renamed from: v, reason: collision with root package name */
    public static final n0.a0 f25658v = new n0.a0(f0.U);

    static {
        kc.f.F(f0.K);
    }

    public static final void a(Owner owner, p0 p0Var, ar.n nVar, n0.p pVar, int i10) {
        pVar.T(1925803616);
        int i11 = (pVar.e(owner) ? 4 : 2) | i10 | (pVar.e(p0Var) ? 32 : 16) | (pVar.g(nVar) ? 256 : 128);
        if (pVar.K(i11 & 1, (i11 & 147) != 146)) {
            n0.i1 i1VarA = f25639a.a(owner.getAccessibilityManager());
            n0.i1 i1VarA2 = f25640b.a(owner.getAutofill());
            n0.i1 i1VarA3 = f25642d.a(owner.getAutofillManager());
            n0.i1 i1VarA4 = f25641c.a(owner.getAutofillTree());
            n0.i1 i1VarA5 = f25643e.a(owner.getClipboardManager());
            n0.i1 i1VarA6 = f25644f.a(owner.getClipboard());
            n0.i1 i1VarA7 = f25646h.a(owner.getDensity());
            n0.i1 i1VarA8 = f25647i.a(owner.getFocusOwner());
            n0.i1 i1VarA9 = j.a(owner.getFontLoader());
            i1VarA9.f17185c = false;
            n0.i1 i1VarA10 = k.a(owner.getFontFamilyResolver());
            i1VarA10.f17185c = false;
            n0.w.b(new n0.i1[]{i1VarA, i1VarA2, i1VarA3, i1VarA4, i1VarA5, i1VarA6, i1VarA7, i1VarA8, i1VarA9, i1VarA10, f25648l.a(owner.getHapticFeedBack()), f25649m.a(owner.getInputModeManager()), f25650n.a(owner.getLayoutDirection()), f25651o.a(owner.getTextInputService()), f25652p.a(owner.getSoftwareKeyboardController()), f25653q.a(owner.getTextToolbar()), f25654r.a(p0Var), f25655s.a(owner.getViewConfiguration()), f25656t.a(owner.getWindowInfo()), f25657u.a(owner.getPointerIconService()), f25645g.a(owner.getGraphicsContext())}, nVar, pVar, ((i11 >> 3) & 112) | 8);
        } else {
            pVar.N();
        }
        n0.k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new h0(owner, p0Var, nVar, i10);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
