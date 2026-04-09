package q2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.c;
import androidx.lifecycle.p0;
import f1.e;
import g1.o;
import n0.d0;
import n0.d2;
import n0.x0;
import o2.j;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final o f20674a;

    /* renamed from: d, reason: collision with root package name */
    public final float f20675d;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f20676g = c.f(new e(9205357640488583168L));

    /* renamed from: r, reason: collision with root package name */
    public final d0 f20677r;

    public b(o oVar, float f10) {
        this.f20674a = oVar;
        this.f20675d = f10;
        p0 p0Var = new p0(16, this);
        qm.c cVar = d2.f17151a;
        this.f20677r = new d0(p0Var);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f20675d);
        textPaint.setShader((Shader) this.f20677r.getValue());
    }
}
