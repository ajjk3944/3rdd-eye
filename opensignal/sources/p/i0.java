package p;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i0 extends j3.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20074h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20075i;
    public final /* synthetic */ WeakReference j;
    public final /* synthetic */ m0 k;

    public i0(m0 m0Var, int i10, int i11, WeakReference weakReference) {
        this.k = m0Var;
        this.f20074h = i10;
        this.f20075i = i11;
        this.j = weakReference;
    }

    @Override // j3.b
    public final void i(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f20074h) != -1) {
            typeface = l0.a(typeface, i10, (this.f20075i & 2) != 0);
        }
        m0 m0Var = this.k;
        if (m0Var.f20115m) {
            m0Var.f20114l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new c.f(textView, typeface, m0Var.j));
                } else {
                    textView.setTypeface(typeface, m0Var.j);
                }
            }
        }
    }

    @Override // j3.b
    public final void h(int i10) {
    }
}
