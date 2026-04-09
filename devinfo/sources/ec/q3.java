package ec;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.g5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q3 extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(Object obj, w1 w1Var, int i4) {
        super(w1Var);
        this.f23028e = i4;
        this.f23029f = obj;
    }

    @Override // ec.n
    public final void a() {
        switch (this.f23028e) {
            case 0:
                g5 g5Var = (g5) this.f23029f;
                r3 r3Var = (r3) g5Var.f11376d;
                r3Var.B();
                o1 o1Var = (o1) r3Var.f218b;
                o1Var.f22957k.getClass();
                g5Var.b(SystemClock.elapsedRealtime(), false, false);
                w wVar = o1Var.f22960n;
                o1.j(wVar);
                o1Var.f22957k.getClass();
                wVar.E(SystemClock.elapsedRealtime());
                break;
            case 1:
                w3 w3Var = (w3) this.f23029f;
                w3Var.F();
                s0 s0Var = ((o1) w3Var.f218b).f22954f;
                o1.m(s0Var);
                s0Var.f23060o.d("Starting upload from DelayedRunnable");
                w3Var.f23175c.q();
                break;
            default:
                g4 g4Var = (g4) this.f23029f;
                g4Var.b().B();
                String str = (String) g4Var.f22745q.pollFirst();
                if (str != null) {
                    g4Var.f().getClass();
                    g4Var.I = SystemClock.elapsedRealtime();
                    g4Var.a().f23060o.e(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    g4.S(g4Var.f22740l.f22949a, intent);
                }
                g4Var.H();
                break;
        }
    }
}
