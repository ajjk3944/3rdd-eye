package kf;

import a0.x0;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import km.o;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f28261a;

    public /* synthetic */ a(b bVar) {
        this.f28261a = bVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        b bVar = this.f28261a;
        Task taskB = bVar.f28265d.b();
        Task taskB2 = bVar.f28266e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(bVar.f28264c, new ah.d(bVar, taskB, taskB2, 9));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Throwable {
        boolean z3;
        b bVar = this.f28261a;
        if (task.isSuccessful()) {
            lf.b bVar2 = bVar.f28265d;
            synchronized (bVar2) {
                bVar2.f28744c = Tasks.forResult(null);
            }
            bVar2.f28743b.a();
            lf.c cVar = (lf.c) task.getResult();
            if (cVar != null) {
                JSONArray jSONArray = cVar.f28749d;
                xd.c cVar2 = bVar.f28263b;
                if (cVar2 != null) {
                    try {
                        cVar2.c(b.c(jSONArray));
                    } catch (JSONException e2) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    } catch (xd.a e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    }
                }
                x0 x0Var = bVar.j;
                try {
                    of.d dVarD = ((o) x0Var.f145b).d(cVar);
                    Iterator it = ((Set) x0Var.f147d).iterator();
                    while (it.hasNext()) {
                        ((Executor) x0Var.f146c).execute(new mf.a((ge.c) it.next(), dVarD, 0));
                    }
                } catch (d e11) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
