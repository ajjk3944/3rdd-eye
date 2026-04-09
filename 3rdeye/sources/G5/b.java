package G5;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class b {
    public static l a(c cVar, d dVar) {
        if (F5.a.f1654a.f1655a) {
            return new l(cVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
