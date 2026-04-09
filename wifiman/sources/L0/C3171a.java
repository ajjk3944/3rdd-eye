package L0;

import M0.f0;
import Zg.AbstractC3689v;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6533i;
import m0.AbstractC6670H;
import m0.AbstractC6688Y;
import m0.AbstractC6713l0;
import m0.InterfaceC6717n0;
import m0.U0;
import m0.b1;
import m0.g1;
import mh.InterfaceC6839p;
import o0.AbstractC7040g;
import sh.AbstractC7978m;

/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3171a implements InterfaceC3186p {

    /* renamed from: a, reason: collision with root package name */
    private final T0.d f11114a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11115b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11116c;

    /* renamed from: d, reason: collision with root package name */
    private final long f11117d;

    /* renamed from: e, reason: collision with root package name */
    private final f0 f11118e;

    /* renamed from: f, reason: collision with root package name */
    private final CharSequence f11119f;

    /* renamed from: g, reason: collision with root package name */
    private final List f11120g;

    /* renamed from: L0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0439a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11121a;

        static {
            int[] iArr = new int[W0.i.values().length];
            try {
                iArr[W0.i.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W0.i.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11121a = iArr;
        }
    }

    /* renamed from: L0.a$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f11122a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J j10) {
            super(2);
            this.f11122a = j10;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RectF rectF, RectF rectF2) {
            return Boolean.valueOf(this.f11122a.a(b1.f(rectF), b1.f(rectF2)));
        }
    }

    public /* synthetic */ C3171a(T0.d dVar, int i10, boolean z10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, z10, j10);
    }

    private final f0 D(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        return new f0(this.f11119f, getWidth(), G(), i10, truncateAt, this.f11114a.j(), 1.0f, 0.0f, T0.c.b(this.f11114a.i()), true, i12, i14, i15, i16, i13, i11, null, null, this.f11114a.h(), 196736, null);
    }

    private final V0.b[] F(f0 f0Var) {
        if (!(f0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = f0Var.G();
        AbstractC6492s.g(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!H((Spanned) charSequenceG, V0.b.class)) {
            return null;
        }
        CharSequence charSequenceG2 = f0Var.G();
        AbstractC6492s.g(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (V0.b[]) ((Spanned) charSequenceG2).getSpans(0, f0Var.G().length(), V0.b.class);
    }

    private final boolean H(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void I(InterfaceC6717n0 interfaceC6717n0) {
        Canvas canvasD = AbstractC6670H.d(interfaceC6717n0);
        if (x()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f11118e.L(canvasD);
        if (x()) {
            canvasD.restore();
        }
    }

    @Override // L0.InterfaceC3186p
    public U0 A(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11 && i11 <= this.f11119f.length()) {
            Path path = new Path();
            this.f11118e.F(i10, i11, path);
            return AbstractC6688Y.c(path);
        }
        throw new IllegalArgumentException(("start(" + i10 + ") or end(" + i11 + ") is out of range [0.." + this.f11119f.length() + "], or start > end!").toString());
    }

    @Override // L0.InterfaceC3186p
    public float B(int i10, boolean z10) {
        return z10 ? f0.B(this.f11118e, i10, false, 2, null) : f0.E(this.f11118e, i10, false, 2, null);
    }

    @Override // L0.InterfaceC3186p
    public float C(int i10) {
        return this.f11118e.t(i10);
    }

    public float E(int i10) {
        return this.f11118e.k(i10);
    }

    public final T0.g G() {
        return this.f11114a.k();
    }

    @Override // L0.InterfaceC3186p
    public float a() {
        return this.f11114a.a();
    }

    @Override // L0.InterfaceC3186p
    public float b() {
        return this.f11114a.b();
    }

    @Override // L0.InterfaceC3186p
    public void c(long j10, float[] fArr, int i10) {
        this.f11118e.a(S.l(j10), S.k(j10), fArr, i10);
    }

    @Override // L0.InterfaceC3186p
    public W0.i e(int i10) {
        return this.f11118e.z(this.f11118e.q(i10)) == 1 ? W0.i.Ltr : W0.i.Rtl;
    }

    @Override // L0.InterfaceC3186p
    public float f(int i10) {
        return this.f11118e.w(i10);
    }

    @Override // L0.InterfaceC3186p
    public float g() {
        return E(t() - 1);
    }

    @Override // L0.InterfaceC3186p
    public float getHeight() {
        return this.f11118e.f();
    }

    @Override // L0.InterfaceC3186p
    public float getWidth() {
        return Y0.b.l(this.f11117d);
    }

    @Override // L0.InterfaceC3186p
    public C6533i h(int i10) {
        if (i10 >= 0 && i10 <= this.f11119f.length()) {
            float fB = f0.B(this.f11118e, i10, false, 2, null);
            int iQ = this.f11118e.q(i10);
            return new C6533i(fB, this.f11118e.w(iQ), fB, this.f11118e.l(iQ));
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0," + this.f11119f.length() + ']').toString());
    }

    @Override // L0.InterfaceC3186p
    public long i(int i10) {
        N0.i iVarI = this.f11118e.I();
        return T.b(N0.h.b(iVarI, i10), N0.h.a(iVarI, i10));
    }

    @Override // L0.InterfaceC3186p
    public int j(int i10) {
        return this.f11118e.q(i10);
    }

    @Override // L0.InterfaceC3186p
    public float k() {
        return E(0);
    }

    @Override // L0.InterfaceC3186p
    public W0.i l(int i10) {
        return this.f11118e.K(i10) ? W0.i.Rtl : W0.i.Ltr;
    }

    @Override // L0.InterfaceC3186p
    public float m(int i10) {
        return this.f11118e.l(i10);
    }

    @Override // L0.InterfaceC3186p
    public long n(C6533i c6533i, int i10, J j10) {
        int[] iArrC = this.f11118e.C(b1.c(c6533i), AbstractC3172b.r(i10), new b(j10));
        return iArrC == null ? S.f11103b.a() : T.b(iArrC[0], iArrC[1]);
    }

    @Override // L0.InterfaceC3186p
    public int o(long j10) {
        return this.f11118e.y(this.f11118e.r((int) C6531g.n(j10)), C6531g.m(j10));
    }

    @Override // L0.InterfaceC3186p
    public C6533i p(int i10) {
        if (i10 >= 0 && i10 < this.f11119f.length()) {
            RectF rectFC = this.f11118e.c(i10);
            return new C6533i(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom);
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0," + this.f11119f.length() + ')').toString());
    }

    @Override // L0.InterfaceC3186p
    public List q() {
        return this.f11120g;
    }

    @Override // L0.InterfaceC3186p
    public int r(int i10) {
        return this.f11118e.v(i10);
    }

    @Override // L0.InterfaceC3186p
    public int s(int i10, boolean z10) {
        return z10 ? this.f11118e.x(i10) : this.f11118e.p(i10);
    }

    @Override // L0.InterfaceC3186p
    public int t() {
        return this.f11118e.m();
    }

    @Override // L0.InterfaceC3186p
    public float u(int i10) {
        return this.f11118e.u(i10);
    }

    @Override // L0.InterfaceC3186p
    public void v(InterfaceC6717n0 interfaceC6717n0, long j10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10) {
        int iB = G().b();
        T0.g gVarG = G();
        gVarG.f(j10);
        gVarG.h(g1Var);
        gVarG.i(kVar);
        gVarG.g(abstractC7040g);
        gVarG.d(i10);
        I(interfaceC6717n0);
        G().d(iB);
    }

    @Override // L0.InterfaceC3186p
    public boolean x() {
        return this.f11118e.d();
    }

    @Override // L0.InterfaceC3186p
    public void y(InterfaceC6717n0 interfaceC6717n0, AbstractC6713l0 abstractC6713l0, float f10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10) {
        int iB = G().b();
        T0.g gVarG = G();
        gVarG.e(abstractC6713l0, AbstractC6538n.a(getWidth(), getHeight()), f10);
        gVarG.h(g1Var);
        gVarG.i(kVar);
        gVarG.g(abstractC7040g);
        gVarG.d(i10);
        I(interfaceC6717n0);
        G().d(iB);
    }

    @Override // L0.InterfaceC3186p
    public int z(float f10) {
        return this.f11118e.r((int) f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3171a(T0.d dVar, int i10, boolean z10, long j10) {
        List listL;
        C6533i c6533i;
        float fB;
        float fK;
        int iB;
        float fW;
        float fB2;
        float fK2;
        this.f11114a = dVar;
        this.f11115b = i10;
        this.f11116c = z10;
        this.f11117d = j10;
        if (Y0.b.m(j10) != 0 || Y0.b.n(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        U uI = dVar.i();
        this.f11119f = AbstractC3172b.l(uI, z10) ? AbstractC3172b.j(dVar.f()) : dVar.f();
        int iM = AbstractC3172b.m(uI.z());
        boolean zK = W0.j.k(uI.z(), W0.j.f23523b.c());
        int iO = AbstractC3172b.o(uI.v().c());
        int iN = AbstractC3172b.n(W0.f.g(uI.r()));
        int iP = AbstractC3172b.p(W0.f.h(uI.r()));
        int iQ = AbstractC3172b.q(W0.f.i(uI.r()));
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        f0 f0VarD = D(iM, zK ? 1 : 0, truncateAt, i10, iO, iN, iP, iQ);
        if (!z10 || f0VarD.f() <= Y0.b.k(j10) || i10 <= 1) {
            this.f11118e = f0VarD;
        } else {
            int iK = AbstractC3172b.k(f0VarD, Y0.b.k(j10));
            if (iK >= 0 && iK != i10) {
                f0VarD = D(iM, zK ? 1 : 0, truncateAt, AbstractC7978m.d(iK, 1), iO, iN, iP, iQ);
            }
            this.f11118e = f0VarD;
        }
        G().e(uI.g(), AbstractC6538n.a(getWidth(), getHeight()), uI.d());
        V0.b[] bVarArrF = F(this.f11118e);
        if (bVarArrF != null) {
            Iterator itA = AbstractC6477c.a(bVarArrF);
            while (itA.hasNext()) {
                ((V0.b) itA.next()).c(AbstractC6538n.a(getWidth(), getHeight()));
            }
        }
        CharSequence charSequence = this.f11119f;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), O0.j.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                O0.j jVar = (O0.j) obj;
                int spanStart = spanned.getSpanStart(jVar);
                int spanEnd = spanned.getSpanEnd(jVar);
                int iQ2 = this.f11118e.q(spanStart);
                byte b10 = iQ2 >= this.f11115b;
                byte b11 = this.f11118e.n(iQ2) > 0 && spanEnd > this.f11118e.o(iQ2);
                byte b12 = spanEnd > this.f11118e.p(iQ2);
                if (b11 == true || b12 == true || b10 == true) {
                    c6533i = null;
                } else {
                    int i11 = C0439a.f11121a[l(spanStart).ordinal()];
                    if (i11 == 1) {
                        fB = B(spanStart, true);
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fB = B(spanStart, true) - jVar.d();
                    }
                    float fD = jVar.d() + fB;
                    f0 f0Var = this.f11118e;
                    switch (jVar.c()) {
                        case 0:
                            fK = f0Var.k(iQ2);
                            iB = jVar.b();
                            fW = fK - iB;
                            c6533i = new C6533i(fB, fW, fD, jVar.b() + fW);
                            break;
                        case 1:
                            fW = f0Var.w(iQ2);
                            c6533i = new C6533i(fB, fW, fD, jVar.b() + fW);
                            break;
                        case 2:
                            fK = f0Var.l(iQ2);
                            iB = jVar.b();
                            fW = fK - iB;
                            c6533i = new C6533i(fB, fW, fD, jVar.b() + fW);
                            break;
                        case 3:
                            fW = ((f0Var.w(iQ2) + f0Var.l(iQ2)) - jVar.b()) / 2;
                            c6533i = new C6533i(fB, fW, fD, jVar.b() + fW);
                            break;
                        case 4:
                            fB2 = jVar.a().ascent;
                            fK2 = f0Var.k(iQ2);
                            fW = fB2 + fK2;
                            c6533i = new C6533i(fB, fW, fD, jVar.b() + fW);
                            break;
                        case 5:
                            fW = (jVar.a().descent + f0Var.k(iQ2)) - jVar.b();
                            c6533i = new C6533i(fB, fW, fD, jVar.b() + fW);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntA = jVar.a();
                            fB2 = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar.b()) / 2;
                            fK2 = f0Var.k(iQ2);
                            fW = fB2 + fK2;
                            c6533i = new C6533i(fB, fW, fD, jVar.b() + fW);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(c6533i);
            }
            listL = arrayList;
        } else {
            listL = AbstractC3689v.l();
        }
        this.f11120g = listL;
    }
}
