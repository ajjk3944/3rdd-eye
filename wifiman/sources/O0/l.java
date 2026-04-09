package O0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    private final int f16755a;

    /* renamed from: b, reason: collision with root package name */
    private final float f16756b;

    /* renamed from: c, reason: collision with root package name */
    private final float f16757c;

    /* renamed from: d, reason: collision with root package name */
    private final float f16758d;

    public l(int i10, float f10, float f11, float f12) {
        this.f16755a = i10;
        this.f16756b = f10;
        this.f16757c = f11;
        this.f16758d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f16758d, this.f16756b, this.f16757c, this.f16755a);
    }
}
