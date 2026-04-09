package V0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6685V;
import m0.V0;
import m0.k1;
import m0.l1;
import o0.AbstractC7040g;
import o0.C7043j;
import o0.C7044k;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7040g f22959a;

    public a(AbstractC7040g abstractC7040g) {
        this.f22959a = abstractC7040g;
    }

    private final Paint.Cap a(int i10) {
        k1.a aVar = k1.f52924a;
        return k1.e(i10, aVar.a()) ? Paint.Cap.BUTT : k1.e(i10, aVar.b()) ? Paint.Cap.ROUND : k1.e(i10, aVar.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i10) {
        l1.a aVar = l1.f52930a;
        return l1.e(i10, aVar.b()) ? Paint.Join.MITER : l1.e(i10, aVar.c()) ? Paint.Join.ROUND : l1.e(i10, aVar.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            AbstractC7040g abstractC7040g = this.f22959a;
            if (AbstractC6492s.d(abstractC7040g, C7043j.f55038a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC7040g instanceof C7044k) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((C7044k) this.f22959a).f());
                textPaint.setStrokeMiter(((C7044k) this.f22959a).d());
                textPaint.setStrokeJoin(b(((C7044k) this.f22959a).c()));
                textPaint.setStrokeCap(a(((C7044k) this.f22959a).b()));
                V0 v0E = ((C7044k) this.f22959a).e();
                textPaint.setPathEffect(v0E != null ? AbstractC6685V.c(v0E) : null);
            }
        }
    }
}
