package x0;

import E5.o;
import G5.e;
import android.content.Context;
import android.os.Build;
import f4.InterfaceFutureC2326a;
import q5.i;
import u0.C2942a;
import u1.v;
import z0.C3014a;
import z0.d;
import z0.f;
import z5.AbstractC3046w;
import z5.D;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2987b {

    /* renamed from: a, reason: collision with root package name */
    public final f f24034a;

    public C2987b(f fVar) {
        this.f24034a = fVar;
    }

    public static final C2987b a(Context context) {
        d dVar;
        int i = Build.VERSION.SDK_INT;
        C2942a c2942a = C2942a.f23710a;
        if ((i >= 30 ? c2942a.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) v.t());
            i.d(systemService, "context.getSystemService…opicsManager::class.java)");
            dVar = new d(v.j(systemService), 1);
        } else {
            if ((i >= 30 ? c2942a.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) v.t());
                i.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                dVar = new d(v.j(systemService2), 0);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            return new C2987b(dVar);
        }
        return null;
    }

    public InterfaceFutureC2326a b(C3014a c3014a) {
        i.e(c3014a, "request");
        e eVar = D.f24485a;
        return com.bumptech.glide.d.f(AbstractC3046w.c(AbstractC3046w.a(o.f1409a), new C2986a(this, c3014a, null)));
    }
}
