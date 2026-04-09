package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.In, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563In {

    /* renamed from: a, reason: collision with root package name */
    public final C1338iu f9163a;

    /* renamed from: b, reason: collision with root package name */
    public final C0546Hn f9164b;

    public C0563In(C1338iu c1338iu, C0546Hn c0546Hn) {
        this.f9163a = c1338iu;
        this.f9164b = c0546Hn;
    }

    public final C1392ju a(String str, JSONObject jSONObject) {
        InterfaceC0637Nc interfaceC0637NcV;
        C0546Hn c0546Hn = this.f9164b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                interfaceC0637NcV = new BinderC0997cd(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                interfaceC0637NcV = new BinderC0997cd(new zzbwl());
            } else {
                InterfaceC0603Lc interfaceC0603Lc = (InterfaceC0603Lc) ((AtomicReference) this.f9163a.f14824d).get();
                if (interfaceC0603Lc == null) {
                    u2.k.h("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        interfaceC0637NcV = interfaceC0603Lc.O(string) ? interfaceC0603Lc.v("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC0603Lc.F(string) ? interfaceC0603Lc.v(string) : interfaceC0603Lc.v("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e6) {
                        u2.k.f("Invalid custom event.", e6);
                    }
                } else {
                    interfaceC0637NcV = interfaceC0603Lc.v(str);
                }
            }
            C1392ju c1392ju = new C1392ju(interfaceC0637NcV);
            c0546Hn.a(str, c1392ju);
            return c1392ju;
        } catch (Throwable th) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ca)).booleanValue()) {
                c0546Hn.a(str, null);
            }
            throw new C1123eu(th);
        }
    }

    public final InterfaceC1860sd b(String str) throws RemoteException {
        InterfaceC0603Lc interfaceC0603Lc = (InterfaceC0603Lc) ((AtomicReference) this.f9163a.f14824d).get();
        if (interfaceC0603Lc == null) {
            u2.k.h("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        InterfaceC1860sd interfaceC1860sdX = interfaceC0603Lc.x(str);
        C0546Hn c0546Hn = this.f9164b;
        synchronized (c0546Hn) {
            if (c0546Hn.f8999a.containsKey(str)) {
                return interfaceC1860sdX;
            }
            try {
                c0546Hn.f8999a.put(str, new C0529Gn(str, interfaceC1860sdX.d(), interfaceC1860sdX.e(), true));
                return interfaceC1860sdX;
            } catch (Throwable unused) {
                return interfaceC1860sdX;
            }
        }
    }
}
