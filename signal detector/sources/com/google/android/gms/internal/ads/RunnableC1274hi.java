package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1274hi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC1327ii f14536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f14537c;

    public /* synthetic */ RunnableC1274hi(BinderC1327ii binderC1327ii, Runnable runnable, int i) {
        this.f14535a = i;
        this.f14536b = binderC1327ii;
        this.f14537c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1123eu c1123eu;
        switch (this.f14535a) {
            case 0:
                AbstractC0640Nf.f10010f.execute(new RunnableC1274hi(this.f14536b, this.f14537c, 1));
                return;
            default:
                M2.u.c("Adapters must be initialized on the main thread.");
                HashMap map = p2.j.f22785C.f22795h.i().s().f7974c;
                if (map.isEmpty()) {
                    return;
                }
                Runnable runnable = this.f14537c;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        u2.k.i("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                BinderC1327ii binderC1327ii = this.f14536b;
                if (((InterfaceC0603Lc) ((AtomicReference) binderC1327ii.f14756c.f9163a.f14824d).get()) != null) {
                    HashMap map2 = new HashMap();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        for (C0535Hc c0535Hc : ((C0552Ic) it.next()).f9106a) {
                            String str = c0535Hc.f8962b;
                            for (String str2 : c0535Hc.f8961a) {
                                if (!map2.containsKey(str2)) {
                                    map2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) map2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            C1119eq c1119eqA = binderC1327ii.f14757d.a(str3, jSONObject);
                            if (c1119eqA != null) {
                                C1392ju c1392ju = (C1392ju) c1119eqA.f13987b;
                                boolean zA = c1392ju.a();
                                InterfaceC0637Nc interfaceC0637Nc = c1392ju.f15016a;
                                if (!zA) {
                                    try {
                                        if (interfaceC0637Nc.G()) {
                                            try {
                                                interfaceC0637Nc.g3(new S2.b(binderC1327ii.f14754a), (BinderC0430Aq) c1119eqA.f13988c, (List) entry.getValue());
                                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb.append("Initialized rewarded video mediation adapter ");
                                                sb.append(str3);
                                                u2.k.c(sb.toString());
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (C1123eu e6) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 56);
                            sb2.append("Failed to initialize rewarded video mediation adapter \"");
                            sb2.append(str3);
                            sb2.append("\"");
                            u2.k.i(sb2.toString(), e6);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
