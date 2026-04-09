package c5;

import android.util.Log;
import b5.u0;
import b5.z;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2759a = b.f2758a;

    public static b a(z zVar) {
        while (zVar != null) {
            if (zVar.y()) {
                zVar.s();
            }
            zVar = zVar.f1950x;
        }
        return f2759a;
    }

    public static void b(e eVar) {
        if (u0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(eVar.f2761a.getClass().getName()), eVar);
        }
    }

    public static final void c(z zVar, String str) {
        k.e(zVar, "fragment");
        k.e(str, "previousFragmentId");
        b(new a(zVar, "Attempting to reuse fragment " + zVar + " with previous ID " + str));
        a(zVar).getClass();
    }
}
