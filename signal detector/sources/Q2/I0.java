package q2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0772Vb;
import com.google.android.gms.internal.ads.W9;
import com.lefan.signal.MyApplication;
import j2.C2560p;
import j2.EnumC2546b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o2.InterfaceC2760a;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: k, reason: collision with root package name */
    public static I0 f23117k;

    /* renamed from: a, reason: collision with root package name */
    public G0 f23118a;

    /* renamed from: b, reason: collision with root package name */
    public G0 f23119b;

    /* renamed from: c, reason: collision with root package name */
    public G0 f23120c;
    public InterfaceC2823i0 i;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23121d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f23123f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23124g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Object f23125h = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final C2560p f23126j = new C2560p(new ArrayList());

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f23122e = new ArrayList();

    static {
        new HashSet(Arrays.asList(EnumC2546b.APP_OPEN_AD, EnumC2546b.INTERSTITIAL, EnumC2546b.REWARDED));
    }

    public static W9 a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put(((C0772Vb) it.next()).f12033a, new W9(2));
        }
        return new W9(3);
    }

    public static I0 d() {
        I0 i02;
        synchronized (I0.class) {
            try {
                if (f23117k == null) {
                    f23117k = new I0();
                }
                i02 = f23117k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i02;
    }

    public final void b(MyApplication myApplication) {
        if (this.i == null) {
            this.i = (InterfaceC2823i0) new C2830m(r.f23260g.f23262b, myApplication).d(myApplication, false);
        }
    }

    public final void c() {
        InterfaceC2823i0 interfaceC2823i0 = this.i;
        if (interfaceC2823i0 == null) {
            return;
        }
        try {
            interfaceC2823i0.b();
            this.i.V1(new S2.b(null), null);
        } catch (RemoteException e6) {
            u2.k.i("MobileAdsSettingManager initialization failed", e6);
        }
    }

    public final InterfaceC2760a e() {
        synchronized (this.f23125h) {
            InterfaceC2823i0 interfaceC2823i0 = this.i;
            if (!(interfaceC2823i0 != null)) {
                throw new IllegalStateException("MobileAds.initialize() must be called prior to getting initialization status.");
            }
            if (interfaceC2823i0 == null) {
                return new c1();
            }
            try {
                return a(interfaceC2823i0.l());
            } catch (RemoteException unused) {
                u2.k.e("Unable to get Initialization status.");
                return new c1();
            }
        }
    }
}
