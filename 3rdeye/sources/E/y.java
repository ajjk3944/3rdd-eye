package E;

import C.S;
import C.k0;
import E.z;
import android.content.Intent;
import androidx.fragment.app.ActivityC1762o;
import com.applovin.impl.v4;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements K0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1348b;

    public /* synthetic */ y(Object obj, int i) {
        this.f1347a = i;
        this.f1348b = obj;
    }

    @Override // K0.b
    public final void accept(Object obj) throws Exception {
        switch (this.f1347a) {
            case 0:
                z.b bVar = (z.b) obj;
                z zVar = (z) this.f1348b;
                if (!bVar.b().f1274f.f1284g) {
                    zVar.f1349a.execute(new B.a(3, zVar, bVar));
                    break;
                } else {
                    S.g("ProcessingNode", "The postview image is closed due to request aborted");
                    bVar.a().close();
                    break;
                }
            case 1:
                ((ActivityC1762o) this.f1348b).lambda$init$2((Intent) obj);
                break;
            case 2:
                y0.w wVar = (y0.w) obj;
                androidx.fragment.app.x xVar = (androidx.fragment.app.x) this.f1348b;
                if (xVar.I()) {
                    xVar.r(wVar.f47917a, false);
                    break;
                }
                break;
            case 3:
                com.applovin.impl.sdk.ad.b.a((String) this.f1348b, (v4) obj);
                break;
            case 4:
                S.a("SurfaceViewImpl", "Safe to release surface.");
                D3.b bVar2 = (D3.b) this.f1348b;
                if (bVar2 != null) {
                    bVar2.b();
                    break;
                }
                break;
            default:
                ((b.a) this.f1348b).b((k0.c) obj);
                break;
        }
    }
}
