package dd;

import com.staircase3.opensignal.goldstar.loadingconfig.LoadConfigActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends bc.e {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7317d;

    public q(bc.f fVar) {
        super(fVar);
        this.f7317d = new ArrayList();
        fVar.b("TaskOnStopCallback", this);
    }

    public static q i(LoadConfigActivity loadConfigActivity) {
        q qVar;
        bc.f fVarB = bc.e.b(loadConfigActivity);
        synchronized (fVarB) {
            try {
                qVar = (q) fVarB.c(q.class, "TaskOnStopCallback");
                if (qVar == null) {
                    qVar = new q(fVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    @Override // bc.e
    public final void h() {
        ArrayList arrayList = this.f7317d;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n nVar = (n) ((WeakReference) it.next()).get();
                    if (nVar != null) {
                        nVar.b();
                    }
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(n nVar) {
        ArrayList arrayList = this.f7317d;
        synchronized (arrayList) {
            arrayList.add(new WeakReference(nVar));
        }
    }
}
