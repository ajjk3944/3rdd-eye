package j2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f13156a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13157b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13158c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13159d;

    public j(float f10, float f11, float f12, int i10) {
        this.f13156a = i10;
        this.f13157b = f10;
        this.f13158c = f11;
        this.f13159d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f13159d, this.f13157b, this.f13158c, this.f13156a);
    }
}
