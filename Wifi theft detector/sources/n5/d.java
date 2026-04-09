package n5;

import android.content.Context;
import q5.g;
import q5.i;
import q5.j;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23536a;

    public void a(Context context) {
        c(context);
        if (d()) {
            return;
        }
        b(true);
        i.d().b(context);
        q5.b.k().a(context);
        t5.a.b(context);
        t5.c.d(context);
        t5.e.c(context);
        g.c().b(context);
        q5.a.a().b(context);
        j.f().b(context);
    }

    public void b(boolean z10) {
        this.f23536a = z10;
    }

    public final void c(Context context) {
        t5.g.c(context, "Application Context cannot be null");
    }

    public boolean d() {
        return this.f23536a;
    }
}
