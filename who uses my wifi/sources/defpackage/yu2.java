package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbub;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yu2 {
    public final t83 a;
    public final xu2 b;

    public yu2(t83 t83Var, xu2 xu2Var) {
        this.a = t83Var;
        this.b = xu2Var;
    }

    public final u83 a(String str, JSONObject jSONObject) {
        w62 w62VarW;
        xu2 xu2Var = this.b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                w62VarW = new m72(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                w62VarW = new m72(new zzbub());
            } else {
                u62 u62Var = (u62) ((AtomicReference) this.a.i).get();
                if (u62Var == null) {
                    gi2.i0("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        w62VarW = u62Var.P(string) ? u62Var.w("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : u62Var.J(string) ? u62Var.w(string) : u62Var.w("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        gi2.c0("Invalid custom event.", e);
                    }
                } else {
                    w62VarW = u62Var.w(str);
                }
            }
            u83 u83Var = new u83(w62VarW);
            xu2Var.a(str, u83Var);
            return u83Var;
        } catch (Throwable th) {
            if (((Boolean) tw1.e.c.a(mz1.fa)).booleanValue()) {
                xu2Var.a(str, null);
            }
            throw new n83(th);
        }
    }

    public final d82 b(String str) throws RemoteException {
        u62 u62Var = (u62) ((AtomicReference) this.a.i).get();
        if (u62Var == null) {
            gi2.i0("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        d82 d82VarG = u62Var.G(str);
        xu2 xu2Var = this.b;
        synchronized (xu2Var) {
            if (xu2Var.a.containsKey(str)) {
                return d82VarG;
            }
            try {
                xu2Var.a.put(str, new wu2(str, d82VarG.c(), d82VarG.e(), true));
                return d82VarG;
            } catch (Throwable unused) {
                return d82VarG;
            }
        }
    }
}
