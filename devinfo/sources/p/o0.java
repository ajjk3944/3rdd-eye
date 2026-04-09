package p;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 extends u3.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f30796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f30797i;
    public final /* synthetic */ WeakReference j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t0 f30798k;

    public o0(t0 t0Var, int i4, int i10, WeakReference weakReference) {
        this.f30798k = t0Var;
        this.f30796h = i4;
        this.f30797i = i10;
        this.j = weakReference;
    }

    @Override // u3.b
    public final void j(Typeface typeface) {
        int i4;
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f30796h) != -1) {
            typeface = s0.a(typeface, i4, (this.f30797i & 2) != 0);
        }
        t0 t0Var = this.f30798k;
        if (t0Var.f30865b) {
            t0Var.f30874m = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new oc.a(textView, typeface, t0Var.f30864a));
                } else {
                    textView.setTypeface(typeface, t0Var.f30864a);
                }
            }
        }
    }

    @Override // u3.b
    public final void i(int i4) {
    }
}
