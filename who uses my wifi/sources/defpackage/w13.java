package defpackage;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w13 implements b03 {
    public final /* synthetic */ int a;
    public final yu2 b;
    public final Object c;

    public w13(h23 h23Var, yu2 yu2Var) {
        this.a = 1;
        this.c = h23Var;
        this.b = yu2Var;
    }

    @Override // defpackage.b03
    public final c03 a(String str, JSONObject jSONObject) {
        c03 c03Var;
        d82 d82VarB;
        switch (this.a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap map = (HashMap) this.c;
                        c03Var = (c03) map.get(str);
                        if (c03Var == null) {
                            c03Var = new c03(this.b.a(str, jSONObject), new w03(), str);
                            map.put(str, c03Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c03Var;
            default:
                if (((Boolean) tw1.e.c.a(mz1.M1)).booleanValue()) {
                    try {
                        d82VarB = this.b.b(str);
                    } catch (RemoteException e) {
                        gi2.c0("Coundn't create RTB adapter: ", e);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((h23) this.c).a;
                    d82VarB = concurrentHashMap.containsKey(str) ? (d82) concurrentHashMap.get(str) : null;
                }
                if (d82VarB == null) {
                    return null;
                }
                return new c03(d82VarB, new u03(), str);
        }
    }

    public w13(yu2 yu2Var) {
        this.a = 0;
        this.c = new HashMap();
        this.b = yu2Var;
    }
}
