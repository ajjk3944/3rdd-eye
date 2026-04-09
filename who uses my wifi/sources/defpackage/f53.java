package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f53 {
    public static f53 h;
    public zn2 f;
    public final Object a = new Object();
    public boolean c = false;
    public boolean d = false;
    public final Object e = new Object();
    public pp0 g = new pp0(new ArrayList());
    public final ArrayList b = new ArrayList();

    static {
        new HashSet(Arrays.asList(s2.APP_OPEN_AD, s2.INTERSTITIAL, s2.REWARDED));
    }

    public static ts0 a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put(((w42) it.next()).f, new us0());
        }
        return new ts0();
    }

    public static f53 d() {
        f53 f53Var;
        synchronized (f53.class) {
            try {
                if (h == null) {
                    h = new f53();
                }
                f53Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f53Var;
    }

    public final void b(Context context) {
        if (this.f == null) {
            this.f = (zn2) new dr1(sv1.f.b, context).d(context, false);
        }
    }

    public final void c() {
        try {
            this.f.b();
            this.f.S2(new oi0(null), null);
        } catch (RemoteException unused) {
            gi2.q0(5);
        }
    }

    public final void e() {
        synchronized (this.e) {
            try {
                zn2 zn2Var = this.f;
                if (!(zn2Var != null)) {
                    throw new IllegalStateException("MobileAds.initialize() must be called prior to getting initialization status.");
                }
                try {
                    a(zn2Var.m());
                } catch (RemoteException unused) {
                    gi2.Z("Unable to get Initialization status.");
                }
            } finally {
            }
        }
    }
}
