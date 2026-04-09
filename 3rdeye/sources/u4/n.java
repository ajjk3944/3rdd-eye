package u4;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46575b;

    public /* synthetic */ n(Object obj, int i) {
        this.f46574a = i;
        this.f46575b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f46574a) {
            case 0:
                u uVar = (u) this.f46575b;
                uVar.f46587b.a("reportBinderDeath", new Object[0]);
                q qVar = (q) uVar.i.get();
                if (qVar != null) {
                    uVar.f46587b.a("calling onBinderDied", new Object[0]);
                    qVar.zza();
                } else {
                    uVar.f46587b.a("%s : Binder has died.", uVar.f46588c);
                    Iterator it = uVar.f46589d.iterator();
                    while (it.hasNext()) {
                        m mVar = (m) it.next();
                        RemoteException remoteException = new RemoteException(String.valueOf(uVar.f46588c).concat(" : Binder has died."));
                        TaskCompletionSource taskCompletionSource = mVar.f46573b;
                        if (taskCompletionSource != null) {
                            taskCompletionSource.trySetException(remoteException);
                        }
                    }
                    uVar.f46589d.clear();
                }
                synchronized (uVar.f46591f) {
                    uVar.d();
                }
                return;
            default:
                y4.n nVar = (y4.n) this.f46575b;
                nVar.f48119b.a("reportBinderDeath", new Object[0]);
                y4.k kVar = (y4.k) nVar.i.get();
                y4.g gVar = nVar.f48119b;
                if (kVar != null) {
                    gVar.a("calling onBinderDied", new Object[0]);
                    kVar.zza();
                } else {
                    String str = nVar.f48120c;
                    gVar.a("%s : Binder has died.", str);
                    ArrayList arrayList = nVar.f48121d;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        y4.h hVar = (y4.h) it2.next();
                        RemoteException remoteException2 = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                        TaskCompletionSource taskCompletionSource2 = hVar.f48110b;
                        if (taskCompletionSource2 != null) {
                            taskCompletionSource2.trySetException(remoteException2);
                        }
                    }
                    arrayList.clear();
                }
                nVar.b();
                return;
        }
    }
}
