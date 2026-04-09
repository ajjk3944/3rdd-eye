package j2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13161b;

    public k(boolean z10, boolean z11) {
        this.f13160a = z10;
        this.f13161b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f13160a);
        textPaint.setStrikeThruText(this.f13161b);
    }
}
