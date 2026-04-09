package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ni2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ oi2 g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ ni2(oi2 oi2Var, Runnable runnable, int i) {
        this.f = i;
        this.g = oi2Var;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n83 n83Var;
        switch (this.f) {
            case 0:
                md2.f.execute(new ni2(this.g, this.h, 1));
                return;
            default:
                ou1.h("Adapters must be initialized on the main thread.");
                HashMap map = hg4.C.h.g().m().c;
                if (map.isEmpty()) {
                    return;
                }
                Runnable runnable = this.h;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable unused) {
                        gi2.q0(5);
                        return;
                    }
                }
                oi2 oi2Var = this.g;
                if (((u62) ((AtomicReference) oi2Var.h.a.i).get()) != null) {
                    HashMap map2 = new HashMap();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        for (q62 q62Var : ((r62) it.next()).a) {
                            String str = q62Var.b;
                            for (String str2 : q62Var.a) {
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
                            c03 c03VarA = oi2Var.i.a(str3, jSONObject);
                            if (c03VarA != null) {
                                u83 u83Var = (u83) c03VarA.b;
                                boolean zA = u83Var.a();
                                w62 w62Var = u83Var.a;
                                if (!zA) {
                                    try {
                                        if (w62Var.K()) {
                                            try {
                                                w62Var.V2(new oi0(oi2Var.f), (w03) c03VarA.c, (List) entry.getValue());
                                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb.append("Initialized rewarded video mediation adapter ");
                                                sb.append(str3);
                                                gi2.U(sb.toString());
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (n83 unused2) {
                            new StringBuilder(String.valueOf(str3).length() + 56);
                            gi2.q0(5);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
