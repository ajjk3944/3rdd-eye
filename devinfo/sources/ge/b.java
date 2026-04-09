package ge;

import android.util.Log;
import de.o;
import java.util.concurrent.atomic.AtomicReference;
import je.u;
import me.k1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final e f24692c = new e();

    /* renamed from: a, reason: collision with root package name */
    public final o f24693a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f24694b = new AtomicReference(null);

    public b(o oVar) {
        this.f24693a = oVar;
        oVar.a(new ca.b(13, this));
    }

    public final e a(String str) {
        b bVar = (b) this.f24694b.get();
        return bVar == null ? f24692c : bVar.a(str);
    }

    public final boolean b() {
        b bVar = (b) this.f24694b.get();
        return bVar != null && bVar.b();
    }

    public final boolean c(String str) {
        b bVar = (b) this.f24694b.get();
        return bVar != null && bVar.c(str);
    }

    public final void d(String str, long j, k1 k1Var) {
        String strT = u.t("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strT, null);
        }
        this.f24693a.a(new a(str, j, k1Var));
    }
}
