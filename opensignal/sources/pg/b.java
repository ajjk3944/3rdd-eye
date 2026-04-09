package pg;

import com.google.android.gms.internal.measurement.e5;
import dd.r;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20489a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f20490d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ al.b f20491g;

    public b(al.b bVar, int i10, long j) {
        this.f20491g = bVar;
        this.f20489a = i10;
        this.f20490d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final al.b bVar = this.f20491g;
        int i10 = this.f20489a;
        final long j = this.f20490d;
        synchronized (bVar) {
            final int i11 = i10 - 1;
            final r rVarC = ((h) bVar.f812d).c(g.REALTIME, 3 - i11);
            final r rVarB = ((c) bVar.f813e).b();
            e5.V(rVarC, rVarB).f((ScheduledExecutorService) bVar.f815g, new dd.a() { // from class: pg.a
                @Override // dd.a
                public final Object j(r rVar) throws JSONException {
                    Boolean boolValueOf;
                    al.b bVar2 = bVar;
                    r rVar2 = rVarC;
                    r rVar3 = rVarB;
                    long j7 = j;
                    int i12 = i11;
                    if (!rVar2.j()) {
                        return e5.t(new og.c(rVar2.g(), "Failed to auto-fetch config update."));
                    }
                    if (!rVar3.j()) {
                        return e5.t(new og.c(rVar3.g(), "Failed to get activated config for auto-fetch"));
                    }
                    f fVar = (f) rVar2.h();
                    d dVarA = (d) rVar3.h();
                    d dVar = fVar.f20511b;
                    if (dVar != null) {
                        boolValueOf = Boolean.valueOf(dVar.f20503f >= j7);
                    } else {
                        boolValueOf = Boolean.valueOf(fVar.f20510a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        bVar2.a(i12, j7);
                        return e5.u(null);
                    }
                    if (fVar.f20511b == null) {
                        return e5.u(null);
                    }
                    if (dVarA == null) {
                        dVarA = d.c().a();
                    }
                    d dVar2 = fVar.f20511b;
                    JSONObject jSONObject = dVarA.f20502e;
                    JSONObject jSONObject2 = dVar2.f20498a;
                    JSONObject jSONObject3 = dVar2.f20499b;
                    JSONObject jSONObject4 = dVar2.f20502e;
                    JSONObject jSONObject5 = d.a(new JSONObject(jSONObject2.toString())).f20499b;
                    HashMap mapB = dVarA.b();
                    HashMap mapB2 = dVar2.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = dVarA.f20499b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        return e5.u(null);
                    }
                    synchronized (bVar2) {
                        Iterator it = ((LinkedHashSet) bVar2.f810b).iterator();
                        while (it.hasNext()) {
                            ((j) it.next()).getClass();
                        }
                    }
                    return e5.u(null);
                }
            });
        }
    }
}
