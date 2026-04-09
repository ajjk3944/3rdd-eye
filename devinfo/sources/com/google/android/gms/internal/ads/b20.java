package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b20 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c20 f9551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f9552c;

    public /* synthetic */ b20(c20 c20Var, Runnable runnable, int i4) {
        this.f9550a = i4;
        this.f9551b = c20Var;
        this.f9552c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kq0 kq0Var;
        switch (this.f9550a) {
            case 0:
                fx.f11279f.execute(new b20(this.f9551b, this.f9552c, 1));
                return;
            default:
                pb.y.d("Adapters must be initialized on the main thread.");
                HashMap map = ua.j.C.f35265h.i().s().f18211c;
                if (map.isEmpty()) {
                    return;
                }
                Runnable runnable = this.f9552c;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        za.i.i("Could not initialize rewarded ads.", th2);
                        return;
                    }
                }
                c20 c20Var = this.f9551b;
                if (((ar) ((AtomicReference) c20Var.f9926c.f10763a.f15075d).get()) != null) {
                    HashMap map2 = new HashMap();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        for (wq wqVar : ((xq) it.next()).f18443a) {
                            String str = wqVar.f18144b;
                            for (String str2 : wqVar.f18143a) {
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
                            ci0 ci0VarA = c20Var.f9927d.a(str3, jSONObject);
                            if (ci0VarA != null) {
                                qq0 qq0Var = (qq0) ci0VarA.f10135b;
                                boolean zA = qq0Var.a();
                                cr crVar = qq0Var.f15399a;
                                if (!zA) {
                                    try {
                                        if (crVar.O1()) {
                                            try {
                                                crVar.f0(new vb.b(c20Var.f9924a), (wi0) ci0VarA.f10136c, (List) entry.getValue());
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb2.append("Initialized rewarded video mediation adapter ");
                                                sb2.append(str3);
                                                za.i.c(sb2.toString());
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (kq0 e2) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 56);
                            sb3.append("Failed to initialize rewarded video mediation adapter \"");
                            sb3.append(str3);
                            sb3.append("\"");
                            za.i.i(sb3.toString(), e2);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
