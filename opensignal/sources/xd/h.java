package xd;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public float f25290c;

    /* renamed from: d, reason: collision with root package name */
    public float f25291d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f25293f;

    /* renamed from: g, reason: collision with root package name */
    public be.d f25294g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f25288a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final qd.a f25289b = new qd.a(1, this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f25292e = true;

    public h(g gVar) {
        this.f25293f = new WeakReference(null);
        this.f25293f = new WeakReference(gVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f25288a;
        this.f25290c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f25291d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f25292e = false;
    }

    public final void b(be.d dVar, Context context) {
        if (this.f25294g != dVar) {
            this.f25294g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f25288a;
                qd.a aVar = this.f25289b;
                dVar.e(context, textPaint, aVar);
                g gVar = (g) this.f25293f.get();
                if (gVar != null) {
                    textPaint.drawableState = gVar.getState();
                }
                dVar.d(context, textPaint, aVar);
                this.f25292e = true;
            }
            g gVar2 = (g) this.f25293f.get();
            if (gVar2 != null) {
                gVar2.a();
                gVar2.onStateChange(gVar2.getState());
            }
        }
    }
}
