package V6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineBackgroundSpan;
import java.util.LinkedList;

/* compiled from: VerticalAlignmentSpan.kt */
/* loaded from: classes.dex */
public final class o extends CharacterStyle implements LineBackgroundSpan {

    /* renamed from: h, reason: collision with root package name */
    public static final K0.d f13026h = new K0.d(16);

    /* renamed from: b, reason: collision with root package name */
    public final int f13027b;

    /* renamed from: c, reason: collision with root package name */
    public final n f13028c;

    /* renamed from: d, reason: collision with root package name */
    public final B.f f13029d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint.FontMetricsInt f13030e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f13031f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13032g;

    /* compiled from: VerticalAlignmentSpan.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13033a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13033a = iArr;
        }
    }

    public o(int i, n alignment, B.f fVar) {
        kotlin.jvm.internal.l.f(alignment, "alignment");
        this.f13027b = i;
        this.f13028c = alignment;
        this.f13029d = fVar;
        this.f13030e = new Paint.FontMetricsInt();
        this.f13031f = new LinkedList();
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i10, int i11, int i12, int i13, CharSequence text, int i14, int i15, int i16) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        kotlin.jvm.internal.l.f(paint, "paint");
        kotlin.jvm.internal.l.f(text, "text");
        boolean z10 = this.f13032g;
        LinkedList linkedList = this.f13031f;
        if (z10) {
            linkedList.clear();
        }
        this.f13032g = false;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i14 > spanned.getSpanEnd(this) || spanStart > i15) {
            return;
        }
        Layout layout = (Layout) this.f13029d.get();
        int iY = i16 == layout.getLineCount() - 1 ? 0 : com.google.gson.internal.c.y(layout.getSpacingAdd());
        int[] iArr = (int[]) f13026h.a();
        if (iArr == null) {
            iArr = new int[2];
        }
        iArr[0] = i11 - i12;
        iArr[1] = (i13 - i12) - iY;
        linkedList.add(iArr);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        kotlin.jvm.internal.l.f(paint, "paint");
        this.f13032g = true;
        LinkedList linkedList = this.f13031f;
        if (linkedList.isEmpty()) {
            return;
        }
        int[] iArr = (int[]) linkedList.remove();
        int i = iArr[0];
        int i10 = iArr[1];
        f13026h.c(iArr);
        int i11 = this.f13027b;
        if (i11 > 0) {
            paint.setTextSize(i11);
        }
        Paint.FontMetricsInt fontMetricsInt = this.f13030e;
        paint.getFontMetricsInt(fontMetricsInt);
        int i12 = a.f13033a[this.f13028c.ordinal()];
        if (i12 == 1) {
            paint.baselineShift = (i - fontMetricsInt.ascent) + paint.baselineShift;
        } else {
            if (i12 != 2) {
                if (i12 != 4) {
                    return;
                }
                paint.baselineShift = (i10 - fontMetricsInt.descent) + paint.baselineShift;
                return;
            }
            paint.baselineShift = (((i + i10) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2)) + paint.baselineShift;
        }
    }
}
