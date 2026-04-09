package U1;

import android.content.Context;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3692a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bykv.vk.openvk.emc.emc.emc.xq.b f3693b;

    /* renamed from: d, reason: collision with root package name */
    public final File f3695d;

    /* renamed from: e, reason: collision with root package name */
    public final File f3696e;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f3694c = false;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3697f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f3698g = false;

    public c(Context context, com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        this.f3695d = null;
        this.f3696e = null;
        this.f3692a = context;
        this.f3693b = bVar;
        this.f3695d = R3.b.A(bVar.bw(), bVar.aa());
        this.f3696e = R3.b.z(bVar.bw(), bVar.aa());
    }

    public static void a(c cVar) {
        File file = cVar.f3696e;
        File file2 = cVar.f3695d;
        try {
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Error renaming file " + file2 + " to " + file + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void c(c cVar, com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, int i, String str) {
        synchronized (K1.a.class) {
            try {
                ArrayList arrayList = cVar.f3697f;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    K1.a aVar = (K1.a) obj;
                    if (aVar != null) {
                        aVar.emc(bVar, i, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(c cVar, Closeable closeable) {
        cVar.getClass();
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public final void b(K1.a aVar) {
        if (this.f3698g) {
            synchronized (K1.a.class) {
                this.f3697f.add(aVar);
            }
            return;
        }
        this.f3697f.add(aVar);
        File file = this.f3695d;
        com.bykv.vk.openvk.emc.emc.emc.xq.b bVar = this.f3693b;
        boolean z6 = true;
        if (this.f3696e.exists() || (!bVar.sz() && (file.length() >= bVar.ycc() || (bVar.dg() > 0 && file.length() >= bVar.dg())))) {
            this.f3693b.msw(1);
            e(this.f3693b, TTAdConstant.MATE_VALID);
            a.a(this.f3693b);
            return;
        }
        this.f3698g = true;
        this.f3693b.msw(0);
        com.bykv.vk.openvk.emc.emc.emc.xq.b bVar2 = this.f3693b;
        gbl.emc emcVarYpw = J1.c.a() != null ? J1.c.a().ypw() : new gbl.emc("v_preload");
        long jYzg = bVar2.yzg();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        emcVarYpw.emc(jYzg, timeUnit).ypw(bVar2.ul(), timeUnit).xq(bVar2.ylm(), timeUnit);
        gbl gblVarEmc = emcVarYpw.emc();
        sup.emc emcVar = new sup.emc();
        long length = this.f3695d.length();
        int iYcc = bVar2.ycc();
        boolean zSz = bVar2.sz();
        int iDg = bVar2.dg();
        if (iDg <= 0) {
            z6 = zSz;
        } else if (iDg < bVar2.sup()) {
            z6 = zSz;
            iYcc = iDg;
        }
        emcVar.emc("videoPreload").emc(6);
        if (z6) {
            emcVar.emc("RANGE", "bytes=" + length + "-").ypw(bVar2.vk()).emc().ypw();
        } else {
            emcVar.emc("RANGE", "bytes=" + length + "-" + iYcc).ypw(bVar2.vk()).emc().ypw();
        }
        gblVarEmc.emc(emcVar.ypw()).emc(new b(this, length, 0));
    }

    public final void e(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, int i) {
        synchronized (K1.a.class) {
            try {
                ArrayList arrayList = this.f3697f;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    K1.a aVar = (K1.a) obj;
                    if (aVar != null) {
                        aVar.emc(bVar, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
