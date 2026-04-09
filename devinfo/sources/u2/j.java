package u2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f35056a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35057b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35058c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35059d;

    public j(int i4, float f10, float f11, float f12) {
        this.f35056a = i4;
        this.f35057b = f10;
        this.f35058c = f11;
        this.f35059d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f35059d, this.f35057b, this.f35058c, this.f35056a);
    }
}
