package d4;

import android.graphics.Typeface;
import android.text.TextPaint;
import h4.C4416d;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public float f37512c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference<b> f37514e;

    /* renamed from: f, reason: collision with root package name */
    public C4416d f37515f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f37510a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final a f37511b = new a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f37513d = true;

    /* compiled from: TextDrawableHelper.java */
    public class a extends I9.g {
        public a() {
        }

        @Override // I9.g
        public final void Y(int i) {
            h hVar = h.this;
            hVar.f37513d = true;
            b bVar = hVar.f37514e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // I9.g
        public final void Z(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            h hVar = h.this;
            hVar.f37513d = true;
            b bVar = hVar.f37514e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(com.google.android.material.chip.a aVar) {
        this.f37514e = new WeakReference<>(null);
        this.f37514e = new WeakReference<>(aVar);
    }

    public final float a(String str) {
        if (!this.f37513d) {
            return this.f37512c;
        }
        TextPaint textPaint = this.f37510a;
        this.f37512c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f37513d = false;
        return this.f37512c;
    }
}
