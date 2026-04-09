package y4;

import b9.C1998e;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;
import u4.t;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x4.g f48111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f48112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, TaskCompletionSource taskCompletionSource, x4.g gVar) {
        super(taskCompletionSource);
        this.f48112d = nVar;
        this.f48111c = gVar;
    }

    @Override // y4.h
    public final void a() {
        n nVar = this.f48112d;
        e eVar = nVar.f48129m;
        ArrayList arrayList = nVar.f48121d;
        x4.g gVar = this.f48111c;
        g gVar2 = nVar.f48119b;
        if (eVar != null || nVar.f48124g) {
            if (!nVar.f48124g) {
                gVar.run();
                return;
            } else {
                gVar2.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(gVar);
                return;
            }
        }
        gVar2.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(gVar);
        t tVar = new t(nVar, 1);
        nVar.f48128l = tVar;
        nVar.f48124g = true;
        if (nVar.f48118a.bindService(nVar.f48125h, tVar, 1)) {
            return;
        }
        gVar2.a("Failed to bind to the service.", new Object[0]);
        nVar.f48124g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            C1998e c1998e = new C1998e("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = hVar.f48110b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(c1998e);
            }
        }
        arrayList.clear();
    }
}
