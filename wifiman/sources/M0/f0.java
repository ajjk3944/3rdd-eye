package M0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f12390a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12391b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12392c;

    /* renamed from: d, reason: collision with root package name */
    private final H f12393d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12394e;

    /* renamed from: f, reason: collision with root package name */
    private N0.i f12395f;

    /* renamed from: g, reason: collision with root package name */
    private final Layout f12396g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12397h;

    /* renamed from: i, reason: collision with root package name */
    private final int f12398i;

    /* renamed from: j, reason: collision with root package name */
    private final int f12399j;

    /* renamed from: k, reason: collision with root package name */
    private final float f12400k;

    /* renamed from: l, reason: collision with root package name */
    private final float f12401l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f12402m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint.FontMetricsInt f12403n;

    /* renamed from: o, reason: collision with root package name */
    private final int f12404o;

    /* renamed from: p, reason: collision with root package name */
    private final O0.h[] f12405p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f12406q;

    /* renamed from: r, reason: collision with root package name */
    private G f12407r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public f0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, H h10) {
        boolean z12;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        this.f12390a = textPaint;
        this.f12391b = z10;
        this.f12392c = z11;
        this.f12393d = h10;
        this.f12406q = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = h0.k(i11);
        Layout.Alignment alignmentA = d0.f12384a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, O0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = h10.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsA == null || h10.b() > f10 || z14) {
                z12 = true;
                this.f12402m = false;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                layoutA = a0.f12360a.a(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristicK, alignmentA, i12, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                this.f12402m = true;
                z12 = true;
                layoutA = C3255k.f12411a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z10, z11, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicK;
                z13 = false;
            }
            this.f12396g = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i12);
            this.f12397h = iMin;
            int i18 = iMin - 1;
            this.f12394e = (iMin >= i12 && (layoutA.getEllipsisCount(i18) > 0 || layoutA.getLineEnd(i18) != charSequence.length())) ? z12 : z13;
            long jL = h0.l(this);
            O0.h[] hVarArrJ = h0.j(this);
            this.f12405p = hVarArrJ;
            long jI = hVarArrJ != null ? h0.i(hVarArrJ) : h0.f12409b;
            this.f12398i = Math.max(i0.c(jL), i0.c(jI));
            this.f12399j = Math.max(i0.b(jL), i0.b(jI));
            Paint.FontMetricsInt fontMetricsIntH = h0.h(this, textPaint, textDirectionHeuristic, hVarArrJ);
            this.f12404o = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) s(i18)) : z13;
            this.f12403n = fontMetricsIntH;
            this.f12400k = O0.d.b(layoutA, i18, null, 2, null);
            this.f12401l = O0.d.d(layoutA, i18, null, 2, null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ float B(f0 f0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return f0Var.A(i10, z10);
    }

    public static /* synthetic */ float E(f0 f0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return f0Var.D(i10, z10);
    }

    private final float g(int i10) {
        if (i10 == this.f12397h - 1) {
            return this.f12400k + this.f12401l;
        }
        return 0.0f;
    }

    private final G j() {
        G g10 = this.f12407r;
        if (g10 != null) {
            AbstractC6492s.f(g10);
            return g10;
        }
        G g11 = new G(this.f12396g);
        this.f12407r = g11;
        return g11;
    }

    public final float A(int i10, boolean z10) {
        return j().c(i10, true, z10) + g(q(i10));
    }

    public final int[] C(RectF rectF, int i10, InterfaceC6839p interfaceC6839p) {
        return Build.VERSION.SDK_INT >= 34 ? C3250f.f12389a.c(this, rectF, i10, interfaceC6839p) : g0.d(this, this.f12396g, j(), rectF, i10, interfaceC6839p);
    }

    public final float D(int i10, boolean z10) {
        return j().c(i10, false, z10) + g(q(i10));
    }

    public final void F(int i10, int i11, Path path) {
        this.f12396g.getSelectionPath(i10, i11, path);
        if (this.f12398i == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f12398i);
    }

    public final CharSequence G() {
        return this.f12396g.getText();
    }

    public final TextPaint H() {
        return this.f12390a;
    }

    public final N0.i I() {
        N0.i iVar = this.f12395f;
        if (iVar != null) {
            return iVar;
        }
        N0.i iVar2 = new N0.i(this.f12396g.getText(), 0, this.f12396g.getText().length(), this.f12390a.getTextLocale());
        this.f12395f = iVar2;
        return iVar2;
    }

    public final boolean J() {
        if (this.f12402m) {
            C3255k c3255k = C3255k.f12411a;
            Layout layout = this.f12396g;
            AbstractC6492s.g(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return c3255k.b((BoringLayout) layout);
        }
        a0 a0Var = a0.f12360a;
        Layout layout2 = this.f12396g;
        AbstractC6492s.g(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return a0Var.c((StaticLayout) layout2, this.f12392c);
    }

    public final boolean K(int i10) {
        return this.f12396g.isRtlCharAt(i10);
    }

    public final void L(Canvas canvas) {
        if (canvas.getClipBounds(this.f12406q)) {
            int i10 = this.f12398i;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            e0 e0Var = h0.f12408a;
            e0Var.a(canvas);
            this.f12396g.draw(e0Var);
            int i11 = this.f12398i;
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int i10, int i11, float[] fArr, int i12) {
        float fD;
        float fE;
        int length = G().length();
        if (i10 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (i10 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (i11 <= i10) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (i11 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i12 < (i11 - i10) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iQ = q(i10);
        int iQ2 = q(i11 - 1);
        D d10 = new D(this);
        if (iQ > iQ2) {
            return;
        }
        while (true) {
            int iV = v(iQ);
            int iP = p(iQ);
            int iMin = Math.min(i11, iP);
            float fW = w(iQ);
            float fL = l(iQ);
            boolean z10 = z(iQ) == 1;
            for (int iMax = Math.max(i10, iV); iMax < iMin; iMax++) {
                boolean zK = K(iMax);
                if (z10 && !zK) {
                    fD = d10.b(iMax);
                    fE = d10.c(iMax + 1);
                } else if (z10 && zK) {
                    fE = d10.d(iMax);
                    fD = d10.e(iMax + 1);
                } else if (z10 || !zK) {
                    fD = d10.d(iMax);
                    fE = d10.e(iMax + 1);
                } else {
                    fE = d10.b(iMax);
                    fD = d10.c(iMax + 1);
                }
                fArr[i12] = fD;
                fArr[i12 + 1] = fW;
                fArr[i12 + 2] = fE;
                fArr[i12 + 3] = fL;
                i12 += 4;
            }
            if (iQ == iQ2) {
                return;
            } else {
                iQ++;
            }
        }
    }

    public final void b(int i10, float[] fArr) {
        float fD;
        float fE;
        int iV = v(i10);
        int iP = p(i10);
        if (fArr.length < (iP - iV) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        D d10 = new D(this);
        int i11 = 0;
        boolean z10 = z(i10) == 1;
        while (iV < iP) {
            boolean zK = K(iV);
            if (z10 && !zK) {
                fD = d10.b(iV);
                fE = d10.c(iV + 1);
            } else if (z10 && zK) {
                fE = d10.d(iV);
                fD = d10.e(iV + 1);
            } else if (zK) {
                fE = d10.b(iV);
                fD = d10.c(iV + 1);
            } else {
                fD = d10.d(iV);
                fE = d10.e(iV + 1);
            }
            fArr[i11] = fD;
            fArr[i11 + 1] = fE;
            i11 += 2;
            iV++;
        }
    }

    public final RectF c(int i10) {
        float fD;
        float fD2;
        float fA;
        float fA2;
        int iQ = q(i10);
        float fW = w(iQ);
        float fL = l(iQ);
        boolean z10 = z(iQ) == 1;
        boolean zIsRtlCharAt = this.f12396g.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fA = D(i10, false);
                fA2 = D(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                fA = A(i10, false);
                fA2 = A(i10 + 1, true);
            } else {
                fD = D(i10, false);
                fD2 = D(i10 + 1, true);
            }
            float f10 = fA;
            fD = fA2;
            fD2 = f10;
        } else {
            fD = A(i10, false);
            fD2 = A(i10 + 1, true);
        }
        return new RectF(fD, fW, fD2, fL);
    }

    public final boolean d() {
        return this.f12394e;
    }

    public final boolean e() {
        return this.f12392c;
    }

    public final int f() {
        return (this.f12394e ? this.f12396g.getLineBottom(this.f12397h - 1) : this.f12396g.getHeight()) + this.f12398i + this.f12399j + this.f12404o;
    }

    public final boolean h() {
        return this.f12391b;
    }

    public final Layout i() {
        return this.f12396g;
    }

    public final float k(int i10) {
        return this.f12398i + ((i10 != this.f12397h + (-1) || this.f12403n == null) ? this.f12396g.getLineBaseline(i10) : w(i10) - this.f12403n.ascent);
    }

    public final float l(int i10) {
        if (i10 != this.f12397h - 1 || this.f12403n == null) {
            return this.f12398i + this.f12396g.getLineBottom(i10) + (i10 == this.f12397h + (-1) ? this.f12399j : 0);
        }
        return this.f12396g.getLineBottom(i10 - 1) + this.f12403n.bottom;
    }

    public final int m() {
        return this.f12397h;
    }

    public final int n(int i10) {
        return this.f12396g.getEllipsisCount(i10);
    }

    public final int o(int i10) {
        return this.f12396g.getEllipsisStart(i10);
    }

    public final int p(int i10) {
        return this.f12396g.getEllipsisStart(i10) == 0 ? this.f12396g.getLineEnd(i10) : this.f12396g.getText().length();
    }

    public final int q(int i10) {
        return this.f12396g.getLineForOffset(i10);
    }

    public final int r(int i10) {
        return this.f12396g.getLineForVertical(i10 - this.f12398i);
    }

    public final float s(int i10) {
        return l(i10) - w(i10);
    }

    public final float t(int i10) {
        return this.f12396g.getLineLeft(i10) + (i10 == this.f12397h + (-1) ? this.f12400k : 0.0f);
    }

    public final float u(int i10) {
        return this.f12396g.getLineRight(i10) + (i10 == this.f12397h + (-1) ? this.f12401l : 0.0f);
    }

    public final int v(int i10) {
        return this.f12396g.getLineStart(i10);
    }

    public final float w(int i10) {
        return this.f12396g.getLineTop(i10) + (i10 == 0 ? 0 : this.f12398i);
    }

    public final int x(int i10) {
        if (this.f12396g.getEllipsisStart(i10) == 0) {
            return j().e(i10);
        }
        return this.f12396g.getEllipsisStart(i10) + this.f12396g.getLineStart(i10);
    }

    public final int y(int i10, float f10) {
        return this.f12396g.getOffsetForHorizontal(i10, f10 + ((-1) * g(i10)));
    }

    public final int z(int i10) {
        return this.f12396g.getParagraphDirection(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, H h10, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        this(charSequence, f10, textPaint, i19, truncateAt2, i20, (i18 & 64) != 0 ? 1.0f : f11, (i18 & 128) != 0 ? 0.0f : f12, (i18 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z10, (i18 & 512) != 0 ? true : z11, (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12, (i18 & 2048) != 0 ? 0 : i13, (i18 & 4096) != 0 ? 0 : i14, (i18 & 8192) != 0 ? 0 : i15, (i18 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? 0 : i16, (32768 & i18) != 0 ? 0 : i17, (65536 & i18) != 0 ? null : iArr, (131072 & i18) != 0 ? null : iArr2, (i18 & 262144) != 0 ? new H(charSequence, textPaint, i20) : h10);
    }
}
