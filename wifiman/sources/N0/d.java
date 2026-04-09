package N0;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f14870a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f14871b;

    public d(CharSequence charSequence, TextPaint textPaint) {
        this.f14870a = charSequence;
        this.f14871b = textPaint;
    }

    @Override // N0.b
    public int e(int i10) {
        TextPaint textPaint = this.f14871b;
        CharSequence charSequence = this.f14870a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // N0.b
    public int f(int i10) {
        TextPaint textPaint = this.f14871b;
        CharSequence charSequence = this.f14870a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
