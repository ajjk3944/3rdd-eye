package va;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.hl;
import com.google.android.gms.internal.ads.ip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h2 {

    /* renamed from: k, reason: collision with root package name */
    public static h2 f36106k;

    /* renamed from: a, reason: collision with root package name */
    public f2 f36107a;

    /* renamed from: b, reason: collision with root package name */
    public f2 f36108b;

    /* renamed from: c, reason: collision with root package name */
    public f2 f36109c;

    /* renamed from: i, reason: collision with root package name */
    public h1 f36114i;

    /* renamed from: d, reason: collision with root package name */
    public final Object f36110d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f36112f = false;
    public boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Object f36113h = new Object();
    public final pa.p j = new pa.p(new ArrayList());

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f36111e = new ArrayList();

    static {
        new HashSet(Arrays.asList(pa.b.APP_OPEN_AD, pa.b.INTERSTITIAL, pa.b.REWARDED));
    }

    public static hl a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ip ipVar = (ip) it.next();
            map.put(ipVar.f12405a, new hl(ipVar.f12406b ? 2 : 1, ipVar.f12407c, ipVar.f12408d));
        }
        return new hl(map);
    }

    public static h2 d() {
        h2 h2Var;
        synchronized (h2.class) {
            try {
                if (f36106k == null) {
                    f36106k = new h2();
                }
                h2Var = f36106k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h2Var;
    }

    public final void b(Context context) {
        if (this.f36114i == null) {
            this.f36114i = (h1) new m(r.g.f36158b, context).d(context, false);
        }
    }

    public final void c() {
        h1 h1Var = this.f36114i;
        if (h1Var == null) {
            return;
        }
        try {
            h1Var.c();
            this.f36114i.n3(null, new vb.b(null));
        } catch (RemoteException e2) {
            za.i.i("MobileAdsSettingManager initialization failed", e2);
        }
    }

    public final ta.a e() {
        synchronized (this.f36113h) {
            pb.y.j("MobileAds.initialize() must be called prior to getting initialization status.", this.f36114i != null);
            h1 h1Var = this.f36114i;
            if (h1Var == null) {
                return new b3(this);
            }
            try {
                return a(h1Var.E1());
            } catch (RemoteException unused) {
                za.i.e("Unable to get Initialization status.");
                return new b3(this);
            }
        }
    }
}
