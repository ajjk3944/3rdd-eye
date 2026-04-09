package zc;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public float f38230c;

    /* renamed from: d, reason: collision with root package name */
    public float f38231d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f38233f;
    public bd.d g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f38228a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final sc.a f38229b = new sc.a(1, this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f38232e = true;

    public k(j jVar) {
        this.f38233f = new WeakReference(null);
        this.f38233f = new WeakReference(jVar);
    }

    public final float a(String str) {
        if (!this.f38232e) {
            return this.f38230c;
        }
        b(str);
        return this.f38230c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f38228a;
        this.f38230c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f38231d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f38232e = false;
    }

    public final void c(bd.d dVar, Context context) {
        if (this.g != dVar) {
            this.g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f38228a;
                sc.a aVar = this.f38229b;
                dVar.e(context, textPaint, aVar);
                j jVar = (j) this.f38233f.get();
                if (jVar != null) {
                    textPaint.drawableState = jVar.getState();
                }
                dVar.d(context, textPaint, aVar);
                this.f38232e = true;
            }
            j jVar2 = (j) this.f38233f.get();
            if (jVar2 != null) {
                jVar2.a();
                jVar2.onStateChange(jVar2.getState());
            }
        }
    }
}
