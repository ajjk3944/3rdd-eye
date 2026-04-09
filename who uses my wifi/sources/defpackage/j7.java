package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j7 extends g82 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ WeakReference t;
    public final /* synthetic */ o7 u;

    public j7(o7 o7Var, int i, int i2, WeakReference weakReference) {
        this.u = o7Var;
        this.r = i;
        this.s = i2;
        this.t = weakReference;
    }

    @Override // defpackage.g82
    public final void p(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.r) != -1) {
            typeface = n7.a(typeface, i, (this.s & 2) != 0);
        }
        o7 o7Var = this.u;
        if (o7Var.b) {
            o7Var.m = typeface;
            TextView textView = (TextView) this.t.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new k7(textView, typeface, o7Var.a, 0));
                } else {
                    textView.setTypeface(typeface, o7Var.a);
                }
            }
        }
    }

    @Override // defpackage.g82
    public final void o(int i) {
    }
}
