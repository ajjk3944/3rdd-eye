package x5;

import a6.f;
import a6.h;
import android.content.Context;
import d6.e;
import d6.g;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24978a;

    public String a() {
        return "1.4.9-Unity3d";
    }

    public void b(Context context) {
        d(context);
        if (e()) {
            return;
        }
        c(true);
        h.d().b(context);
        a6.b.k().b(context);
        d6.a.b(context);
        d6.c.d(context);
        e.c(context);
        f.c().b(context);
        a6.a.a().b(context);
    }

    public void c(boolean z10) {
        this.f24978a = z10;
    }

    public final void d(Context context) {
        g.c(context, "Application Context cannot be null");
    }

    public boolean e() {
        return this.f24978a;
    }
}
