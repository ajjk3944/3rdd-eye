package pf;

import android.adservices.topics.TopicsManager;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.nio.charset.Charset;
import me.n2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements de.d, q1.i, ba.d, u0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31903a;

    public /* synthetic */ u(int i4) {
        this.f31903a = i4;
    }

    public static /* bridge */ /* synthetic */ TopicsManager b(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return TopicsManager.class;
    }

    @Override // q1.i
    public double a(double d10) {
        switch (this.f31903a) {
            case 1:
                double d11 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case 2:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            case 3:
                float[] fArr = q1.d.f32076a;
                return q1.d.b(q1.d.f32078c, d10);
            case 4:
                float[] fArr2 = q1.d.f32076a;
                return q1.d.a(q1.d.f32078c, d10);
            case 5:
                float[] fArr3 = q1.d.f32076a;
                return q1.d.d(q1.d.f32079d, d10);
            case 6:
                float[] fArr4 = q1.d.f32076a;
                return q1.d.c(q1.d.f32079d, d10);
            default:
                return d10;
        }
    }

    @Override // ba.d
    public Object apply(Object obj) {
        qe.a.f32268b.getClass();
        return ne.a.f29941a.n((n2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // de.d
    public Object c(androidx.lifecycle.f1 f1Var) {
        switch (this.f31903a) {
            case 0:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(f1Var);
            case 18:
                return TransportRegistrar.lambda$getComponents$0(f1Var);
            case 19:
                return TransportRegistrar.lambda$getComponents$1(f1Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(f1Var);
        }
    }

    public void g(t7.c cVar) {
        switch (this.f31903a) {
            case 12:
                nk.k.e(cVar, "it");
                break;
            default:
                nk.k.e(cVar, "it");
                break;
        }
    }

    @Override // u0.f
    public void cancel() {
    }
}
