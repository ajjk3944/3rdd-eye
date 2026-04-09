package fe;

import android.os.Bundle;
import android.util.Log;
import bf.f;
import ge.e;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import je.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ie.a, he.a, cf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f24014a;

    public /* synthetic */ a(b bVar) {
        this.f24014a = bVar;
    }

    @Override // ie.a
    public void b(o oVar) {
        b bVar = this.f24014a;
        synchronized (bVar) {
            try {
                if (((ie.a) bVar.f24017c) instanceof ie.b) {
                    ((ArrayList) bVar.f24016b).add(oVar);
                }
                ((ie.a) bVar.f24017c).b(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // cf.a
    public void d(cf.b bVar) {
        b bVar2 = this.f24014a;
        e eVar = e.f24699a;
        eVar.b("AnalyticsConnector now available.");
        ae.b bVar3 = (ae.b) bVar.get();
        o7.d dVar = new o7.d(23, bVar3);
        y4.a aVar = new y4.a();
        ae.c cVar = (ae.c) bVar3;
        f fVarB = cVar.b("clx", aVar);
        if (fVarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            fVarB = cVar.b("crash", aVar);
            if (fVarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (fVarB == null) {
            eVar.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        eVar.b("Registered Firebase Analytics listener.");
        o7.c cVar2 = new o7.c(23);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yb.e eVar2 = new yb.e(dVar);
        synchronized (bVar2) {
            try {
                ArrayList arrayList = (ArrayList) bVar2.f24016b;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    cVar2.b((o) obj);
                }
                aVar.f37324b = cVar2;
                aVar.f37323a = eVar2;
                bVar2.f24017c = cVar2;
                bVar2.f24015a = eVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // he.a
    public void j(Bundle bundle) {
        ((he.a) this.f24014a.f24015a).j(bundle);
    }
}
