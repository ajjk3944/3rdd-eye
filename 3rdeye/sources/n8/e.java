package n8;

import A9.C0583j;
import E3.i;
import J4.n;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.c;
import java.util.HashMap;
import kotlin.jvm.internal.l;

/* compiled from: RemoteConfig.kt */
/* loaded from: classes3.dex */
public final class e<TResult, TContinuationResult> implements Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f44415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f44416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f44417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0583j f44418e;

    public e(f fVar, long j4, boolean z10, C0583j c0583j) {
        this.f44415b = fVar;
        this.f44416c = j4;
        this.f44417d = z10;
        this.f44418e = c0583j;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task it) {
        l.f(it, "it");
        r5.e eVar = this.f44415b.f44420a;
        if (eVar == null) {
            l.l("firebaseRemoteConfig");
            throw null;
        }
        com.google.firebase.remoteconfig.internal.c cVar = eVar.f45694e;
        long j4 = cVar.f23320h.f23326a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.c.f23311j);
        HashMap map = new HashMap(cVar.i);
        map.put("X-Firebase-RC-Fetch-Type", c.b.BASE.getValue() + "/1");
        return cVar.f23318f.b().continueWithTask(cVar.f23315c, new i(cVar, j4, map)).onSuccessTask(n.INSTANCE, new com.google.android.gms.measurement.internal.a()).onSuccessTask(eVar.f45691b, new B.f(eVar, 18)).addOnCompleteListener(new d(this.f44415b, this.f44416c, this.f44417d, this.f44418e));
    }
}
