package x3;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p3.C2772a;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public float f24178c;

    /* renamed from: d, reason: collision with root package name */
    public float f24179d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f24181f;

    /* renamed from: g, reason: collision with root package name */
    public D3.e f24182g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f24176a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final C2772a f24177b = new C2772a(1, this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f24180e = true;

    public y(x xVar) {
        this.f24181f = new WeakReference(null);
        this.f24181f = new WeakReference(xVar);
    }

    public final float a(String str) {
        if (!this.f24180e) {
            return this.f24178c;
        }
        b(str);
        return this.f24178c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f24176a;
        this.f24178c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f24179d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f24180e = false;
    }

    public final void c(D3.e eVar, Context context) {
        if (this.f24182g != eVar) {
            this.f24182g = eVar;
            if (eVar != null) {
                TextPaint textPaint = this.f24176a;
                C2772a c2772a = this.f24177b;
                eVar.e(context, textPaint, c2772a);
                x xVar = (x) this.f24181f.get();
                if (xVar != null) {
                    textPaint.drawableState = xVar.getState();
                }
                eVar.d(context, textPaint, c2772a);
                this.f24180e = true;
            }
            x xVar2 = (x) this.f24181f.get();
            if (xVar2 != null) {
                xVar2.a();
                xVar2.onStateChange(xVar2.getState());
            }
        }
    }
}
