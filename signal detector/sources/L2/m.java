package L2;

import A2.C;
import M2.InterfaceC0164d;
import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.BA;
import com.google.android.gms.internal.ads.C0447Bq;
import com.google.android.gms.internal.ads.DA;
import com.google.android.gms.internal.ads.GA;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0828Yg;
import com.google.android.gms.internal.ads.JA;
import com.google.android.gms.internal.ads.KA;
import com.google.android.gms.internal.ads.RunnableC0912b0;
import com.google.android.gms.internal.ads.Wu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import q2.C2841s;
import t2.AbstractC2907C;

/* loaded from: classes.dex */
public final class m implements InterfaceC0164d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2536a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2537b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2538c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2539d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2540e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2541f;

    public static final void b(m mVar) {
        synchronized (mVar) {
            if (!mVar.f2536a && !((ConcurrentLinkedQueue) mVar.f2541f).isEmpty()) {
                NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) ((ConcurrentLinkedQueue) mVar.f2541f).poll();
                if (nsdServiceInfo != null) {
                    mVar.f2536a = true;
                    NsdManager nsdManager = (NsdManager) mVar.f2537b;
                    if (nsdManager != null) {
                        nsdManager.resolveService(nsdServiceInfo, new P4.b(mVar));
                    }
                }
            }
        }
    }

    @Override // M2.InterfaceC0164d
    public void a(J2.b bVar) {
        ((c) this.f2541f).f2517m.post(new A1.d(this, 9, bVar));
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f2540e;
        this.f2538c = null;
        NsdManager nsdManager = (NsdManager) this.f2537b;
        if (nsdManager == null) {
            return;
        }
        try {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                nsdManager.stopServiceDiscovery((NsdManager.DiscoveryListener) obj);
            }
        } catch (Throwable th) {
            R2.a.d(th);
        }
        ((ConcurrentLinkedQueue) this.f2541f).clear();
        arrayList.clear();
    }

    public void d(J2.b bVar) {
        k kVar = (k) ((c) this.f2541f).f2514j.get((a) this.f2538c);
        if (kVar != null) {
            M2.u.b(kVar.f2533m.f2517m);
            K2.c cVar = kVar.f2523b;
            String name = cVar.getClass().getName();
            String strValueOf = String.valueOf(bVar);
            cVar.c(AbstractC1135f5.o(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
            kVar.l(bVar, null);
        }
    }

    public synchronized boolean e(Context context) {
        if (!KA.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f2540e = new Wu(4, new GA(context));
        } catch (NullPointerException e6) {
            AbstractC2907C.m("Error connecting LMD Overlay service");
            p2.j.f22785C.f22795h.f("LastMileDeliveryOverlay.bindLastMileDeliveryService", e6);
        }
        if (((Wu) this.f2540e) == null) {
            this.f2536a = false;
            return false;
        }
        if (((h2.d) this.f2541f) == null) {
            this.f2541f = new h2.d(this);
        }
        this.f2536a = true;
        return true;
    }

    public void f(InterfaceC0828Yg interfaceC0828Yg, BA ba) {
        String str = ba.f7313b;
        if (interfaceC0828Yg == null) {
            g("adWebview missing", "onLMDShow");
            return;
        }
        this.f2539d = interfaceC0828Yg;
        if (!this.f2536a && !e(interfaceC0828Yg.getContext())) {
            g("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Jc)).booleanValue()) {
            this.f2538c = str;
        }
        if (((h2.d) this.f2541f) == null) {
            this.f2541f = new h2.d(this);
        }
        Wu wu = (Wu) this.f2540e;
        if (wu != null) {
            h2.d dVar = (h2.d) this.f2541f;
            GA ga = (GA) wu.f12337b;
            C0447Bq c0447Bq = ga.f8329a;
            if (c0447Bq == null) {
                GA.f8327c.f("error: %s", "Play Store not found.");
            } else if (GA.c(dVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                c0447Bq.b(new JA(c0447Bq, new RunnableC0912b0(ga, ba, dVar, 11), 0));
            }
        }
    }

    public void g(String str, String str2) {
        AbstractC2907C.m(str);
        if (((InterfaceC0828Yg) this.f2539d) != null) {
            HashMap map = new HashMap();
            map.put(PglCryptUtils.KEY_MESSAGE, str);
            map.put("action", str2);
            h(map, "onError");
        }
    }

    public void h(HashMap map, String str) {
        AbstractC0640Nf.f10010f.execute(new C(this, str, map, 17));
    }

    public DA i() {
        String str;
        String str2 = null;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Jc)).booleanValue() || TextUtils.isEmpty((String) this.f2538c)) {
            String str3 = (String) this.f2537b;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.f2538c;
        }
        return new DA(str2, str);
    }
}
