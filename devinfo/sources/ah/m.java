package ah;

import com.applovin.impl.l4;
import com.liuzh.deviceinfo.MainActivity;
import com.liuzh.deviceinfo.card.SensorAppCard;
import java.util.Iterator;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f399c;

    public /* synthetic */ m(int i4, Object obj, boolean z3) {
        this.f397a = i4;
        this.f399c = obj;
        this.f398b = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f397a) {
            case 0:
                o oVar = (o) this.f399c;
                boolean z3 = this.f398b;
                Iterator it = oVar.f403c.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).i(z3);
                }
                break;
            case 1:
                ((l4) this.f399c).a(this.f398b);
                break;
            default:
                b5.o oVar2 = (b5.o) this.f399c;
                boolean z10 = this.f398b;
                ((SensorAppCard) oVar2.f1845b).f21218i.run();
                if (!z10 || ((SensorAppCard) oVar2.f1845b).f21213c <= 1) {
                    SensorAppCard sensorAppCard = (SensorAppCard) oVar2.f1845b;
                    ig.m mVar = sensorAppCard.f21217h;
                    boolean z11 = sensorAppCard.f21213c <= 1;
                    sh.l lVar = ((sh.h) mVar).f33688a;
                    sh.l.j0("Apps");
                    i.g gVarN = lVar.n();
                    if (gVarN != null && !i0.l(gVarN) && lVar.y() && !lVar.C) {
                        if (!z11) {
                            ((MainActivity) gVarN).E(th.f.class);
                            break;
                        } else if (!zg.c.b()) {
                            zg.a.a(gVarN, new sh.g(lVar, 0));
                            break;
                        } else {
                            zg.a.b(gVarN);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
