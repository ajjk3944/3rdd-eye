package lf;

import androidx.lifecycle.l0;
import com.applovin.impl.c9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import t6.x;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Continuation, h3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28756e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f28752a = obj;
        this.f28753b = obj2;
        this.f28754c = obj3;
        this.f28755d = obj4;
        this.f28756e = obj5;
    }

    @Override // h3.i
    public Object i(h3.h hVar) {
        ((Executor) this.f28752a).execute(new c9((x) this.f28753b, (String) this.f28754c, (mk.a) this.f28755d, (l0) this.f28756e, hVar, 7));
        return u.f37649a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        g gVar = (g) this.f28752a;
        Task task2 = (Task) this.f28753b;
        Task task3 = (Task) this.f28754c;
        Date date = (Date) this.f28755d;
        HashMap map = (HashMap) this.f28756e;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new kf.c("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new kf.c("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            f fVarA = gVar.a((String) task2.getResult(), ((df.a) task3.getResult()).f22226a, date, map);
            return fVarA.f28759a != 0 ? Tasks.forResult(fVarA) : gVar.f28767e.e(fVarA.f28760b).onSuccessTask(gVar.f28765c, new e(0, fVarA));
        } catch (kf.d e2) {
            return Tasks.forException(e2);
        }
    }
}
