package A1;

import android.view.View;
import h.AbstractActivityC2349g;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f104a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f105b;

    @Override // A1.g
    public final void a(AbstractActivityC2349g abstractActivityC2349g) {
        if (!this.f105b && this.f104a.add(abstractActivityC2349g)) {
            View decorView = abstractActivityC2349g.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new e(this, decorView));
        }
    }
}
