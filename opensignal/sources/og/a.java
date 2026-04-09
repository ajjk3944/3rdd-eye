package og;

import com.google.android.gms.internal.measurement.e5;
import dd.r;
import io.sentry.android.core.e0;
import io.sentry.h4;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import pg.n;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements dd.g, dd.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f19427a;

    public /* synthetic */ a(b bVar) {
        this.f19427a = bVar;
    }

    @Override // dd.a
    public Object j(r rVar) throws Throwable {
        boolean z10;
        b bVar = this.f19427a;
        bVar.getClass();
        if (rVar.j()) {
            pg.c cVar = bVar.f19431d;
            synchronized (cVar) {
                cVar.f20496c = e5.u(null);
            }
            n nVar = cVar.f20495b;
            synchronized (nVar) {
                nVar.f20555a.deleteFile(nVar.f20556b);
            }
            pg.d dVar = (pg.d) rVar.h();
            if (dVar != null) {
                JSONArray jSONArray = dVar.f20501d;
                te.c cVar2 = bVar.f19429b;
                if (cVar2 != null) {
                    try {
                        cVar2.c(b.f(jSONArray));
                    } catch (JSONException e4) {
                        e0.c("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e4);
                    } catch (te.a e10) {
                        e0.q("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    }
                }
                js.e eVar = bVar.k;
                try {
                    sg.d dVarX0 = ((q3.a) eVar.f13799r).x0(dVar);
                    Iterator it = ((Set) eVar.f13797d).iterator();
                    while (it.hasNext()) {
                        ((Executor) eVar.f13800x).execute(new qg.a((ef.b) it.next(), dVarX0, 1));
                    }
                } catch (e e11) {
                    e0.q("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
                }
            } else {
                e0.d("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // dd.g
    public r o(Object obj) {
        b bVar = this.f19427a;
        r rVarB = bVar.f19431d.b();
        r rVarB2 = bVar.f19432e.b();
        return e5.V(rVarB, rVarB2).f(bVar.f19430c, new h4(bVar, rVarB, rVarB2, 7));
    }
}
