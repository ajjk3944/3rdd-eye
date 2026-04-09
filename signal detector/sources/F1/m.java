package f1;

import Y2.W;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.k f20061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f20062c;

    public /* synthetic */ m(n nVar, g1.k kVar, int i) {
        this.f20060a = i;
        this.f20062c = nVar;
        this.f20061b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20060a) {
            case 0:
                this.f20061b.k(this.f20062c.f20067d.getForegroundInfoAsync());
                return;
            default:
                n nVar = this.f20062c;
                g1.k kVar = nVar.f20064a;
                ListenableWorker listenableWorker = nVar.f20067d;
                e1.h hVar = nVar.f20066c;
                try {
                    V0.g gVar = (V0.g) this.f20061b.get();
                    if (gVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + hVar.f19910c + ") but did not provide ForegroundInfo");
                    }
                    V0.m.f().a(n.f20063g, "Updating notification for " + hVar.f19910c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    o oVar = nVar.f20068e;
                    Context context = nVar.f20065b;
                    UUID id = listenableWorker.getId();
                    oVar.getClass();
                    g1.k kVar2 = new g1.k();
                    ((V2.e) oVar.f20070a).o(new W(oVar, kVar2, id, gVar, context));
                    kVar.k(kVar2);
                    return;
                } catch (Throwable th) {
                    kVar.j(th);
                    return;
                }
        }
    }
}
