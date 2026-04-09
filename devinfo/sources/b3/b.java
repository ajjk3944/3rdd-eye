package b3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import o1.e;
import p1.p;
import u0.d0;
import u0.d1;
import u0.q;
import z2.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final p f1662a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1663b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f1664c = q.r(new e(9205357640488583168L));

    /* renamed from: d, reason: collision with root package name */
    public final d0 f1665d = q.l(new a6.e(3, this));

    public b(p pVar, float f10) {
        this.f1662a = pVar;
        this.f1663b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        i.b(textPaint, this.f1663b);
        textPaint.setShader((Shader) this.f1665d.getValue());
    }
}
