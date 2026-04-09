package s5;

import a5.d0;
import d5.w;
import d5.z;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21921a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q3.a f21922d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d5.c f21923g;

    public /* synthetic */ j(q3.a aVar, d5.c cVar, int i10) {
        this.f21921a = i10;
        this.f21922d = aVar;
        this.f21923g = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21921a) {
            case 0:
                q3.a aVar = this.f21922d;
                d5.c cVar = this.f21923g;
                w wVar = (w) aVar.f20680g;
                int i10 = d0.f105a;
                z zVar = wVar.f7095a;
                zVar.A0 = cVar;
                zVar.O.onVideoEnabled(cVar);
                break;
            default:
                q3.a aVar2 = this.f21922d;
                d5.c cVar2 = this.f21923g;
                aVar2.getClass();
                synchronized (cVar2) {
                }
                w wVar2 = (w) aVar2.f20680g;
                int i11 = d0.f105a;
                z zVar2 = wVar2.f7095a;
                zVar2.O.onVideoDisabled(cVar2);
                zVar2.f7127p0 = null;
                zVar2.A0 = null;
                break;
        }
    }
}
