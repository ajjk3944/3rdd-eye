package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.xi0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10663c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10664d;

    public /* synthetic */ e1(Object obj, int i4, long j, int i10) {
        this.f10661a = i10;
        this.f10664d = obj;
        this.f10662b = i4;
        this.f10663c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10661a) {
            case 0:
                g1 g1Var = (g1) this.f10664d;
                int i4 = this.f10662b;
                long j = this.f10663c;
                g1Var.getClass();
                String str = bq0.f9768a;
                wu1 wu1Var = g1Var.f11342b.f9804a.f12465s;
                qu1 qu1VarO = wu1Var.o((jy1) wu1Var.f18200d.f9334e);
                wu1Var.l(qu1VarO, 1018, new s9(qu1VarO, i4, j));
                return;
            default:
                final xi0 xi0Var = (xi0) this.f10664d;
                int i10 = this.f10662b;
                final long j8 = this.f10663c;
                synchronized (xi0Var) {
                    final int i11 = i10 - 1;
                    final Task taskC = ((lf.g) xi0Var.f18395d).c(3 - i11);
                    final Task taskB = ((lf.b) xi0Var.f18396e).b();
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask((ScheduledExecutorService) xi0Var.g, new Continuation() { // from class: lf.a
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) throws JSONException {
                            Boolean boolValueOf;
                            xi0 xi0Var2 = xi0Var;
                            Task task2 = taskC;
                            Task task3 = taskB;
                            long j9 = j8;
                            int i12 = i11;
                            if (!task2.isSuccessful()) {
                                return Tasks.forException(new kf.c("Failed to auto-fetch config update.", task2.getException()));
                            }
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new kf.c("Failed to get activated config for auto-fetch", task3.getException()));
                            }
                            f fVar = (f) task2.getResult();
                            c cVarA = (c) task3.getResult();
                            c cVar = fVar.f28760b;
                            if (cVar != null) {
                                boolValueOf = Boolean.valueOf(cVar.f28751f >= j9);
                            } else {
                                boolValueOf = Boolean.valueOf(fVar.f28759a == 1);
                            }
                            if (!boolValueOf.booleanValue()) {
                                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                                xi0Var2.b(i12, j9);
                                return Tasks.forResult(null);
                            }
                            if (fVar.f28760b == null) {
                                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                                return Tasks.forResult(null);
                            }
                            if (cVarA == null) {
                                cVarA = c.c().a();
                            }
                            c cVar2 = fVar.f28760b;
                            JSONObject jSONObject = cVarA.f28750e;
                            JSONObject jSONObject2 = cVar2.f28746a;
                            JSONObject jSONObject3 = cVar2.f28747b;
                            JSONObject jSONObject4 = cVar2.f28750e;
                            JSONObject jSONObject5 = c.a(new JSONObject(jSONObject2.toString())).f28747b;
                            HashMap mapB = cVarA.b();
                            HashMap mapB2 = cVar2.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject6 = cVarA.f28747b;
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
                                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                                return Tasks.forResult(null);
                            }
                            synchronized (xi0Var2) {
                                Iterator it = ((LinkedHashSet) xi0Var2.f18392a).iterator();
                                while (it.hasNext()) {
                                    ((i) it.next()).getClass();
                                }
                            }
                            return Tasks.forResult(null);
                        }
                    });
                }
                return;
        }
    }
}
