package E;

import C.k0;
import W.C1631t;
import android.content.ContentValues;
import android.net.Uri;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements K0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1319b;

    public /* synthetic */ k(Object obj, int i) {
        this.f1318a = i;
        this.f1319b = obj;
    }

    @Override // K0.b
    public final void accept(Object obj) {
        switch (this.f1318a) {
            case 0:
                A a10 = (A) obj;
                o oVar = (o) this.f1319b;
                oVar.c(a10);
                v vVar = oVar.f1329f;
                A2.l.q("Pending request should be null", vVar.f1344b == null);
                vVar.f1344b = a10;
                break;
            case 1:
                k0.d dVar = (k0.d) obj;
                for (Map.Entry entry : ((Map) this.f1319b).entrySet()) {
                    int iB = dVar.b() - ((P.f) entry.getKey()).c();
                    if (((P.f) entry.getKey()).g()) {
                        iB = -iB;
                    }
                    int iH = G.o.h(iB);
                    N.s sVar = (N.s) entry.getValue();
                    sVar.getClass();
                    G.n.c(new N.q(sVar, iH, -1));
                }
                break;
            case 2:
                Uri uri = (Uri) obj;
                if (!uri.equals(Uri.EMPTY)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("is_pending", (Integer) 0);
                    ((C1631t) this.f1319b).f13299b.e().update(uri, contentValues, null, null);
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                androidx.fragment.app.x xVar = (androidx.fragment.app.x) this.f1319b;
                if (xVar.I() && num.intValue() == 80) {
                    xVar.l(false);
                    break;
                }
                break;
        }
    }
}
