package E3;

import G3.b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements b.a, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1396d;

    public /* synthetic */ i(j jVar, y3.j jVar2, long j4) {
        this.f1395c = jVar;
        this.f1396d = jVar2;
        this.f1394b = j4;
    }

    @Override // G3.b.a
    public Object execute() {
        j jVar = (j) this.f1395c;
        jVar.f1399c.O(jVar.f1403g.b() + this.f1394b, (y3.j) this.f1396d);
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((com.google.firebase.remoteconfig.internal.c) this.f1395c).b(task, this.f1394b, (HashMap) this.f1396d);
    }

    public /* synthetic */ i(com.google.firebase.remoteconfig.internal.c cVar, long j4, HashMap map) {
        this.f1395c = cVar;
        this.f1394b = j4;
        this.f1396d = map;
    }
}
