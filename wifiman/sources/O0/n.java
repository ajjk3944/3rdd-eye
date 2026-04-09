package O0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class n extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16760a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16761b;

    public n(boolean z10, boolean z11) {
        this.f16760a = z10;
        this.f16761b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f16760a);
        textPaint.setStrikeThruText(this.f16761b);
    }
}
