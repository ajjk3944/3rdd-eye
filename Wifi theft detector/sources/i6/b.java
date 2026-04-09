package i6;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class b {
    public static b a(c cVar, d dVar) {
        n6.g.a();
        n6.g.d(cVar, "AdSessionConfiguration is null");
        n6.g.d(dVar, "AdSessionContext is null");
        return new h(cVar, dVar);
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
