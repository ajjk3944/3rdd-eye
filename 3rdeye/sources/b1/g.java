package b1;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import c1.C2043a;
import java.nio.ByteBuffer;

/* compiled from: EmojiSpan.java */
/* loaded from: classes.dex */
public abstract class g extends ReplacementSpan {

    /* renamed from: c, reason: collision with root package name */
    public final k f17072c;

    /* renamed from: b, reason: collision with root package name */
    public final Paint.FontMetricsInt f17071b = new Paint.FontMetricsInt();

    /* renamed from: d, reason: collision with root package name */
    public short f17073d = -1;

    /* renamed from: e, reason: collision with root package name */
    public float f17074e = 1.0f;

    public g(k kVar) {
        A2.l.p(kVar, "rasterizer cannot be null");
        this.f17072c = kVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f17071b;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        k kVar = this.f17072c;
        this.f17074e = fAbs / (kVar.b().a(14) != 0 ? ((ByteBuffer) r8.f4178d).getShort(r1 + r8.f4175a) : (short) 0);
        C2043a c2043aB = kVar.b();
        int iA = c2043aB.a(14);
        if (iA != 0) {
            ((ByteBuffer) c2043aB.f4178d).getShort(iA + c2043aB.f4175a);
        }
        short s10 = (short) ((kVar.b().a(12) != 0 ? ((ByteBuffer) r5.f4178d).getShort(r7 + r5.f4175a) : (short) 0) * this.f17074e);
        this.f17073d = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
