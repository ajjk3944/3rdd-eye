package T1;

import A2.C0117e;
import J1.c;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.sup;
import d5.y;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3558a;

    /* renamed from: d, reason: collision with root package name */
    public final File f3561d;

    /* renamed from: e, reason: collision with root package name */
    public final File f3562e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3563f;

    /* renamed from: j, reason: collision with root package name */
    public RandomAccessFile f3566j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3567k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f3568l;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f3559b = -2147483648L;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3560c = new Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile int f3564g = -100;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f3565h = false;
    public volatile boolean i = false;

    public a(b bVar) {
        this.f3563f = 0L;
        this.f3566j = null;
        this.f3567k = bVar;
        try {
            String strBw = bVar.bw();
            String strAa = bVar.aa();
            File fileA = R3.b.A(strBw, strAa);
            this.f3561d = fileA;
            File fileZ = R3.b.z(strBw, strAa);
            this.f3562e = fileZ;
            if (fileZ.exists()) {
                this.f3566j = new RandomAccessFile(fileZ, "r");
            } else {
                this.f3566j = new RandomAccessFile(fileA, "rw");
            }
            if (!fileZ.exists()) {
                this.f3563f = fileA.length();
                a();
            }
            this.f3558a = y.f19836g == 2;
        } catch (Throwable unused) {
            bVar.vk();
        }
    }

    public static void b(a aVar, int i, String str) {
        JSONObject jSONObjectXq;
        aVar.i = false;
        aVar.f3564g = i;
        aVar.f3559b = -1L;
        ul.ypw("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i), " ", str);
        if (!aVar.f3567k.emc() || (jSONObjectXq = aVar.f3567k.xq()) == null) {
            return;
        }
        try {
            jSONObjectXq.put("error_real_code", i);
            jSONObjectXq.put("error_real_msg", str);
        } catch (Throwable th) {
            ul.emc("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    public static void c(a aVar) {
        synchronized (aVar.f3560c) {
            if (aVar.f3562e.exists()) {
                aVar.f3567k.vk();
                aVar.f3567k.aa();
                return;
            }
            try {
            } finally {
            }
            if (!aVar.f3561d.renameTo(aVar.f3562e)) {
                throw new IOException("Error renaming file " + aVar.f3561d + " to " + aVar.f3562e + " for completion!");
            }
            RandomAccessFile randomAccessFile = aVar.f3566j;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            aVar.f3566j = new RandomAccessFile(aVar.f3562e, "rw");
            aVar.f3567k.aa();
            aVar.f3567k.vk();
        }
    }

    public final void a() {
        gbl.emc emcVarYpw = c.a() != null ? c.a().ypw() : new gbl.emc("v_cache");
        b bVar = this.f3567k;
        long jYzg = bVar.yzg();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        emcVarYpw.emc(jYzg, timeUnit).ypw(bVar.ul(), timeUnit).xq(bVar.ylm(), timeUnit);
        gbl gblVarEmc = emcVarYpw.emc();
        bVar.aa();
        gblVarEmc.emc(new sup.emc().emc("RANGE", "bytes=" + this.f3563f + "-").ypw(bVar.vk()).emc().emc("videoLoadWhenPlaying").emc(9).ypw()).emc(new C0117e(17, this));
    }
}
