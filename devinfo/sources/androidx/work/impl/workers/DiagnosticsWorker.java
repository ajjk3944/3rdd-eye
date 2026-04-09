package androidx.work.impl.workers;

import a0.q0;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import b7.a0;
import b7.n;
import b7.x;
import b7.y;
import com.bumptech.glide.f;
import e7.h;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nk.k;
import t6.s;
import t6.t;
import t6.v;
import u6.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.e(context, "context");
        k.e(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final t doWork() {
        r rVarD = r.D(getApplicationContext());
        WorkDatabase workDatabase = rVarD.f35177f;
        k.d(workDatabase, "getWorkDatabase(...)");
        y yVarW = workDatabase.w();
        n nVarU = workDatabase.u();
        a0 a0VarX = workDatabase.x();
        b7.k kVarT = workDatabase.t();
        rVarD.f35176e.f34315d.getClass();
        List list = (List) f.r(yVarW.f2066a, true, false, new x(0, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L)));
        List list2 = (List) f.r(yVarW.f2066a, true, false, new q0(23));
        List list3 = (List) f.r(yVarW.f2066a, true, false, new q0(28));
        if (!list.isEmpty()) {
            v vVarE = v.e();
            String str = h.f22445a;
            vVarE.f(str, "Recently completed work:\n\n");
            v.e().f(str, h.a(nVarU, a0VarX, kVarT, list));
        }
        if (!list2.isEmpty()) {
            v vVarE2 = v.e();
            String str2 = h.f22445a;
            vVarE2.f(str2, "Running work:\n\n");
            v.e().f(str2, h.a(nVarU, a0VarX, kVarT, list2));
        }
        if (!list3.isEmpty()) {
            v vVarE3 = v.e();
            String str3 = h.f22445a;
            vVarE3.f(str3, "Enqueued work:\n\n");
            v.e().f(str3, h.a(nVarU, a0VarX, kVarT, list3));
        }
        return new s();
    }
}
