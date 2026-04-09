package V6;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: ShadowSpan.kt */
/* loaded from: classes.dex */
public final class h extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final g f12979a;

    public h(g shadow) {
        kotlin.jvm.internal.l.f(shadow, "shadow");
        this.f12979a = shadow;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = this.f12979a;
            textPaint.setShadowLayer(gVar.f12977c, gVar.f12975a, gVar.f12976b, gVar.f12978d);
        }
    }
}
