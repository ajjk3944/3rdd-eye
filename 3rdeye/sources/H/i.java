package h;

import L0.I;
import L0.S;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class i extends A2.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4402f f38070c;

    public i(LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f) {
        super(13);
        this.f38070c = layoutInflaterFactory2C4402f;
    }

    @Override // A2.l, L0.T
    public final void d() {
        LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = this.f38070c;
        layoutInflaterFactory2C4402f.f38029w.setVisibility(0);
        if (layoutInflaterFactory2C4402f.f38029w.getParent() instanceof View) {
            View view = (View) layoutInflaterFactory2C4402f.f38029w.getParent();
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            I.c.c(view);
        }
    }

    @Override // L0.T
    public final void e() {
        LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = this.f38070c;
        layoutInflaterFactory2C4402f.f38029w.setAlpha(1.0f);
        layoutInflaterFactory2C4402f.f38032z.d(null);
        layoutInflaterFactory2C4402f.f38032z = null;
    }
}
