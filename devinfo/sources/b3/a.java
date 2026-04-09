package b3;

import ac.m;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import nk.k;
import r1.c;
import r1.f;
import r1.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final c f1661a;

    public a(c cVar) {
        this.f1661a = cVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            f fVar = f.f32723b;
            c cVar = this.f1661a;
            if (k.a(cVar, fVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(cVar instanceof g)) {
                throw new m();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            g gVar = (g) cVar;
            textPaint.setStrokeWidth(gVar.f32724b);
            textPaint.setStrokeMiter(gVar.f32725c);
            int i4 = gVar.f32727e;
            textPaint.setStrokeJoin(i4 == 0 ? Paint.Join.MITER : i4 == 1 ? Paint.Join.ROUND : i4 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i10 = gVar.f32726d;
            textPaint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
