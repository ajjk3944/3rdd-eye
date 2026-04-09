package y5;

import android.view.View;
import d6.g;

/* loaded from: classes3.dex */
public abstract class b {
    public static b a(c cVar, d dVar) {
        g.a();
        g.c(cVar, "AdSessionConfiguration is null");
        g.c(dVar, "AdSessionContext is null");
        return new f(cVar, dVar);
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
