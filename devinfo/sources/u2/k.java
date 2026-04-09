package u2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35060a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35061b;

    public k(boolean z3, boolean z10) {
        this.f35060a = z3;
        this.f35061b = z10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f35060a);
        textPaint.setStrikeThruText(this.f35061b);
    }
}
