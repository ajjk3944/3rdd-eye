package o;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class O extends I.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22418h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f22419j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U f22420k;

    public O(U u6, int i, int i3, WeakReference weakReference) {
        this.f22420k = u6;
        this.f22418h = i;
        this.i = i3;
        this.f22419j = weakReference;
    }

    @Override // I.b
    public final void i(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f22418h) != -1) {
            typeface = T.a(typeface, i, (this.i & 2) != 0);
        }
        U u6 = this.f22420k;
        if (u6.f22430b) {
            u6.f22440m = typeface;
            TextView textView = (TextView) this.f22419j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new Y0.g(u6.f22429a, 3, textView, typeface));
                } else {
                    textView.setTypeface(typeface, u6.f22429a);
                }
            }
        }
    }

    @Override // I.b
    public final void h(int i) {
    }
}
