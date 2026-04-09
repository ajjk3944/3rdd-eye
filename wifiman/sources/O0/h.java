package O0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    private final float f16731a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16732b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16733c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16734d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16735e;

    /* renamed from: f, reason: collision with root package name */
    private final float f16736f;

    /* renamed from: g, reason: collision with root package name */
    private int f16737g = PduHandle.NONE;

    /* renamed from: h, reason: collision with root package name */
    private int f16738h = PduHandle.NONE;

    /* renamed from: i, reason: collision with root package name */
    private int f16739i = PduHandle.NONE;

    /* renamed from: j, reason: collision with root package name */
    private int f16740j = PduHandle.NONE;

    /* renamed from: k, reason: collision with root package name */
    private int f16741k;

    /* renamed from: l, reason: collision with root package name */
    private int f16742l;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, float f11) {
        this.f16731a = f10;
        this.f16732b = i10;
        this.f16733c = i11;
        this.f16734d = z10;
        this.f16735e = z11;
        this.f16736f = f11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.f16731a);
        int iA = iCeil - i.a(fontMetricsInt);
        float fAbs = this.f16736f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (iA <= 0 ? Math.ceil(iA * fAbs) : Math.ceil(iA * (1.0f - fAbs)));
        int i10 = fontMetricsInt.descent;
        int i11 = iCeil2 + i10;
        this.f16739i = i11;
        int i12 = i11 - iCeil;
        this.f16738h = i12;
        if (this.f16734d) {
            i12 = fontMetricsInt.ascent;
        }
        this.f16737g = i12;
        if (this.f16735e) {
            i11 = i10;
        }
        this.f16740j = i11;
        this.f16741k = fontMetricsInt.ascent - i12;
        this.f16742l = i11 - i10;
    }

    public final h b(int i10, int i11, boolean z10) {
        return new h(this.f16731a, i10, i11, z10, this.f16735e, this.f16736f);
    }

    public final int c() {
        return this.f16741k;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f16732b;
        boolean z11 = i11 == this.f16733c;
        if (z10 && z11 && this.f16734d && this.f16735e) {
            return;
        }
        if (this.f16737g == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.f16737g : this.f16738h;
        fontMetricsInt.descent = z11 ? this.f16740j : this.f16739i;
    }

    public final int d() {
        return this.f16742l;
    }

    public final boolean e() {
        return this.f16735e;
    }
}
