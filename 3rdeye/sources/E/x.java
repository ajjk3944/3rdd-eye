package E;

import C.T;
import E.z;
import android.content.res.Configuration;
import androidx.fragment.app.ActivityC1762o;
import com.applovin.impl.v4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements K0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1346b;

    public /* synthetic */ x(Object obj, int i) {
        this.f1345a = i;
        this.f1346b = obj;
    }

    @Override // K0.b
    public final void accept(Object obj) throws Exception {
        switch (this.f1345a) {
            case 0:
                z.b bVar = (z.b) obj;
                z zVar = (z) this.f1346b;
                if (!bVar.b().f1274f.f1284g) {
                    zVar.f1349a.execute(new T(2, zVar, bVar));
                    break;
                } else {
                    bVar.a().close();
                    break;
                }
            case 1:
                ((ActivityC1762o) this.f1346b).lambda$init$1((Configuration) obj);
                break;
            case 2:
                y0.j jVar = (y0.j) obj;
                androidx.fragment.app.x xVar = (androidx.fragment.app.x) this.f1346b;
                if (xVar.I()) {
                    xVar.m(jVar.f47872a, false);
                    break;
                }
                break;
            default:
                ((com.applovin.impl.sdk.ad.a) this.f1346b).t((v4) obj);
                break;
        }
    }
}
