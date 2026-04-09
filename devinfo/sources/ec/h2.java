package ec;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.g5;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f22775c;

    public h2(q2 q2Var, long j, int i4) {
        this.f22773a = i4;
        switch (i4) {
            case 1:
                this.f22774b = j;
                Objects.requireNonNull(q2Var);
                this.f22775c = q2Var;
                break;
            default:
                this.f22774b = j;
                Objects.requireNonNull(q2Var);
                this.f22775c = q2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22773a) {
            case 0:
                o1 o1Var = (o1) this.f22775c.f218b;
                b1 b1Var = o1Var.f22953e;
                o1.k(b1Var);
                a1 a1Var = b1Var.f22563l;
                long j = this.f22774b;
                a1Var.b(j);
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.f23059n.e(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                q2 q2Var = this.f22775c;
                q2Var.B();
                q2Var.C();
                o1 o1Var2 = (o1) q2Var.f218b;
                s0 s0Var2 = o1Var2.f22954f;
                o1.m(s0Var2);
                s0Var2.f23059n.d("Resetting analytics data (FE)");
                r3 r3Var = o1Var2.f22955h;
                o1.l(r3Var);
                r3Var.B();
                g5 g5Var = r3Var.g;
                ((q3) g5Var.f11375c).c();
                ((o1) ((r3) g5Var.f11376d).f218b).f22957k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                g5Var.f11373a = jElapsedRealtime;
                g5Var.f11374b = jElapsedRealtime;
                o1Var2.r().G();
                boolean z3 = !o1Var2.e();
                b1 b1Var2 = o1Var2.f22953e;
                o1.k(b1Var2);
                b1Var2.g.b(this.f22774b);
                o1 o1Var3 = (o1) b1Var2.f218b;
                b1 b1Var3 = o1Var3.f22953e;
                o1.k(b1Var3);
                if (!TextUtils.isEmpty(b1Var3.f22574w.k())) {
                    b1Var2.f22574w.n(null);
                }
                b1Var2.f22568q.b(0L);
                b1Var2.f22569r.b(0L);
                if (!o1Var3.f22952d.O()) {
                    b1Var2.K(z3);
                }
                b1Var2.f22575x.n(null);
                b1Var2.f22576y.b(0L);
                b1Var2.f22577z.S(null);
                j3 j3VarP = o1Var2.p();
                j3VarP.B();
                j3VarP.C();
                n4 n4VarR = j3VarP.R(false);
                j3VarP.N();
                ((o1) j3VarP.f218b).o().F();
                j3VarP.P(new e3(j3VarP, n4VarR, 0));
                o1.l(r3Var);
                r3Var.f23048f.B();
                q2Var.f23023t = z3;
                o1Var2.p().F(new AtomicReference());
                break;
        }
    }
}
