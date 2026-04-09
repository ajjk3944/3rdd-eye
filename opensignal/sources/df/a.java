package df;

import a2.g;
import android.os.Bundle;
import android.util.Log;
import b9.e;
import hf.o;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements gf.a, ff.a, eg.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f7336a;

    public /* synthetic */ a(b bVar) {
        this.f7336a = bVar;
    }

    @Override // gf.a
    public void c(o oVar) {
        b bVar = this.f7336a;
        synchronized (bVar) {
            try {
                if (((gf.a) bVar.f7339c) instanceof gf.b) {
                    ((ArrayList) bVar.f7337a).add(oVar);
                }
                ((gf.a) bVar.f7339c).c(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // eg.a
    public void k(eg.b bVar) {
        b bVar2 = this.f7336a;
        Log.isLoggable("FirebaseCrashlytics", 3);
        we.b bVar3 = (we.b) bVar.get();
        g gVar = new g(bVar3);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(15, false);
        we.c cVar2 = (we.c) bVar3;
        et.d dVarB = cVar2.b("clx", cVar);
        if (dVarB == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            dVarB = cVar2.b("crash", cVar);
            if (dVarB != null) {
                e0.q("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (dVarB == null) {
            e0.q("FirebaseCrashlytics", "Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        e eVar = new e(21, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bm.d dVar = new bm.d(gVar);
        synchronized (bVar2) {
            try {
                Iterator it = ((ArrayList) bVar2.f7337a).iterator();
                while (it.hasNext()) {
                    eVar.c((o) it.next());
                }
                cVar.f12354g = eVar;
                cVar.f12353d = dVar;
                bVar2.f7339c = eVar;
                bVar2.f7338b = dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ff.a
    public void l(Bundle bundle) {
        ((ff.a) this.f7336a.f7338b).l(bundle);
    }
}
