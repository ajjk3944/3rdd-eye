package ri;

import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.f1;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import nk.k;
import org.json.JSONObject;
import pf.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements t7.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f32976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t7.g f32977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ si.a f32978c;

    public h(f1 f1Var, t7.g gVar, ah.e eVar) {
        this.f32976a = f1Var;
        this.f32977b = gVar;
        this.f32978c = eVar;
    }

    @Override // t7.h
    public final void a(t7.c cVar, List list) {
        k.e(cVar, "billingResult");
        f1 f1Var = this.f32976a;
        Handler handler = (Handler) f1Var.f1135c;
        ((CopyOnWriteArrayList) f1Var.f1138f).remove(this);
        int i4 = cVar.f34435a;
        si.a aVar = this.f32978c;
        if (i4 != 0 || list == null || list.isEmpty()) {
            if (cVar.f34435a == 1) {
                handler.post(new g(aVar, 1));
                return;
            } else {
                handler.post(new g(aVar, 2));
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            ArrayList arrayListA = purchase.a();
            JSONObject jSONObject = purchase.f3001c;
            int size = arrayListA.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListA.get(i10);
                i10++;
                String str = (String) obj;
                if (TextUtils.equals(str, this.f32977b.f34452c)) {
                    if ((jSONObject.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 1) {
                        if (!jSONObject.optBoolean("acknowledged", true)) {
                            String strB = purchase.b();
                            if (strB == null) {
                                throw new IllegalArgumentException("Purchase token must be set");
                            }
                            km.i iVar = new km.i(19, false);
                            iVar.f28426b = strB;
                            ((t7.a) f1Var.f1134b).a(iVar, new u(13));
                        }
                        handler.post(new oi.f(aVar, str, purchase, f1Var, 5));
                        return;
                    }
                }
            }
        }
        handler.post(new g(aVar, 3));
    }
}
