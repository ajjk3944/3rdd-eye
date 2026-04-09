package h6;

import android.content.Context;
import k6.g;
import k6.i;
import k6.j;
import n6.e;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21414a;

    public void a(Context context) {
        c(context);
        if (d()) {
            return;
        }
        b(true);
        i.d().b(context);
        k6.b.k().a(context);
        n6.a.b(context);
        n6.c.d(context);
        e.c(context);
        g.c().b(context);
        k6.a.a().b(context);
        j.f().b(context);
    }

    public void b(boolean z10) {
        this.f21414a = z10;
    }

    public final void c(Context context) {
        n6.g.d(context, "Application Context cannot be null");
    }

    public boolean d() {
        return this.f21414a;
    }
}
