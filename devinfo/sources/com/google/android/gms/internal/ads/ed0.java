package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ed0 {

    /* renamed from: a, reason: collision with root package name */
    public final pq0 f10763a;

    /* renamed from: b, reason: collision with root package name */
    public final dd0 f10764b;

    public ed0(pq0 pq0Var, dd0 dd0Var) {
        this.f10763a = pq0Var;
        this.f10764b = dd0Var;
    }

    public final qq0 a(String str, JSONObject jSONObject) {
        cr crVarJ;
        dd0 dd0Var = this.f10764b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                crVarJ = new sr(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                crVarJ = new sr(new zzbwl());
            } else {
                ar arVar = (ar) ((AtomicReference) this.f10763a.f15075d).get();
                if (arVar == null) {
                    za.i.h("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        crVarJ = arVar.x(string) ? arVar.j("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : arVar.q(string) ? arVar.j(string) : arVar.j("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e2) {
                        za.i.f("Invalid custom event.", e2);
                    }
                } else {
                    crVarJ = arVar.j(str);
                }
            }
            qq0 qq0Var = new qq0(crVarJ);
            dd0Var.a(str, qq0Var);
            return qq0Var;
        } catch (Throwable th2) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Ea)).booleanValue()) {
                dd0Var.a(str, null);
            }
            throw new kq0(th2);
        }
    }

    public final is b(String str) throws RemoteException {
        ar arVar = (ar) ((AtomicReference) this.f10763a.f15075d).get();
        if (arVar == null) {
            za.i.h("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        is isVarK = arVar.k(str);
        dd0 dd0Var = this.f10764b;
        synchronized (dd0Var) {
            if (dd0Var.f10435a.containsKey(str)) {
                return isVarK;
            }
            try {
                dd0Var.f10435a.put(str, new cd0(str, isVarK.d(), isVarK.e(), true));
                return isVarK;
            } catch (Throwable unused) {
                return isVarK;
            }
        }
    }
}
