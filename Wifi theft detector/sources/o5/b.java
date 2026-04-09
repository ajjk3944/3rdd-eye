package o5;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public abstract class b {
    public static b b(c cVar, d dVar) {
        t5.g.a();
        t5.g.c(cVar, "AdSessionConfiguration is null");
        t5.g.c(dVar, "AdSessionContext is null");
        return new g(cVar, dVar);
    }

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();

    public abstract void f(View view);

    public abstract void g();
}
