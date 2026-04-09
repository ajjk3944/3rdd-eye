package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wp0 {
    public static final i80 d = k80.d(wp0.class);
    public static wp0 e;
    public static ArrayList f;
    public final ArrayList a = new ArrayList(2);
    public final ArrayList b = new ArrayList(0);
    public final int c;

    public wp0() {
        int i = 0;
        this.c = 1;
        synchronized (wp0.class) {
            try {
                if (f == null) {
                    f = new ArrayList(8);
                    if (!Boolean.getBoolean("dnsjava.configprovider.skipinit")) {
                        f.add(new um0(0));
                        ArrayList arrayList = f;
                        um0 um0Var = new um0(1);
                        um0Var.g = 1;
                        arrayList.add(um0Var);
                        ArrayList arrayList2 = f;
                        s91 s91Var = new s91();
                        if (System.getProperty("os.name").contains("Windows")) {
                            try {
                                s91Var.a = new r91();
                            } catch (NoClassDefFoundError unused) {
                                s91.b.r("JNA not available");
                            }
                        }
                        arrayList2.add(s91Var);
                        f.add(new y3());
                        ArrayList arrayList3 = f;
                        v30 v30Var = new v30();
                        if (!System.getProperty("java.vendor").contains("Android")) {
                            try {
                                v30Var.a = new u30();
                            } catch (NoClassDefFoundError unused2) {
                                v30.b.r("JNDI DNS not available");
                            }
                        }
                        arrayList3.add(v30Var);
                        f.add(new az0());
                        f.add(new cu(0));
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList4 = f;
        int size = arrayList4.size();
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            xp0 xp0Var = (xp0) obj;
            if (xp0Var.isEnabled()) {
                try {
                    xp0Var.a();
                    if (this.a.isEmpty()) {
                        this.a.addAll(xp0Var.c());
                    }
                    if (this.b.isEmpty()) {
                        List listD = xp0Var.d();
                        if (!listD.isEmpty()) {
                            this.b.addAll(listD);
                            this.c = xp0Var.b();
                        }
                    }
                    if (!this.a.isEmpty() && !this.b.isEmpty()) {
                        return;
                    }
                } catch (s20 e2) {
                    d.p("Failed to initialize provider", e2);
                }
            }
        }
        if (this.a.isEmpty()) {
            this.a.add(new InetSocketAddress(InetAddress.getLoopbackAddress(), 53));
        }
    }

    public static synchronized wp0 a() {
        if (e == null || f == null) {
            wp0 wp0Var = new wp0();
            synchronized (wp0.class) {
                e = wp0Var;
            }
        }
        return e;
    }
}
