package f9;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ouw.ouw;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.google.android.gms.internal.play_billing.m1;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p6.i;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23840a;

    /* renamed from: d, reason: collision with root package name */
    public final File f23843d;

    /* renamed from: e, reason: collision with root package name */
    public final File f23844e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23845f;
    public RandomAccessFile j;

    /* renamed from: k, reason: collision with root package name */
    public final com.bykv.vk.openvk.ouw.ouw.ouw.lh.a f23848k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f23849l;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f23841b = -2147483648L;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23842c = new Object();
    public volatile int g = -100;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f23846h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f23847i = false;

    public a(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        this.f23845f = 0L;
        this.j = null;
        this.f23848k = aVar;
        try {
            String str = aVar.f6567lh;
            String strBly = aVar.bly();
            File fileA = m1.A(str, strBly);
            this.f23843d = fileA;
            File fileG = m1.G(str, strBly);
            this.f23844e = fileG;
            if (fileG.exists()) {
                this.j = new RandomAccessFile(fileG, "r");
            } else {
                this.j = new RandomAccessFile(fileA, "rw");
            }
            if (!fileG.exists()) {
                long length = fileA.length();
                this.f23845f = length;
                cf.ouw ouwVarVt = v8.a.a() != null ? v8.a.a().vt() : new cf.ouw((byte) 0);
                long j = aVar.vm;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ouwVarVt.ouw(j, timeUnit).vt(aVar.f6569th, timeUnit).lh(aVar.qbp, timeUnit);
                cf cfVarOuw = ouw.ouw(ouwVarVt);
                pk.a.y("CSJ_MediaDLPlay", "RANGE, bytes=", Long.valueOf(length), " file hash=", aVar.bly());
                ryl.ouw ouwVarOuw = new ryl.ouw().ouw("RANGE", "bytes=" + length + "-").ouw(aVar.pno()).ouw("GET", (mwh) null);
                ouwVarOuw.pno = "videoLoadWhenPlaying";
                ouwVarOuw.ra = 9;
                cfVarOuw.ouw(ouwVarOuw.ouw()).ouw(new i(this));
            }
            this.f23840a = t.g == 2;
        } catch (Throwable unused) {
            pk.a.y("CSJ_MediaDLPlay", "Error using file ", aVar.pno(), " as disc cache");
        }
    }

    public static /* synthetic */ void a(a aVar) {
        synchronized (aVar.f23842c) {
            if (aVar.f23844e.exists()) {
                pk.a.y("CSJ_MediaDLPlay", "complete: isCompleted ", aVar.f23848k.pno(), aVar.f23848k.bly());
                return;
            }
            try {
            } finally {
                return;
            }
            if (aVar.f23843d.renameTo(aVar.f23844e)) {
                RandomAccessFile randomAccessFile = aVar.j;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                aVar.j = new RandomAccessFile(aVar.f23844e, "rw");
                pk.a.y("CSJ_MediaDLPlay", "complete: rename ", aVar.f23848k.bly(), aVar.f23848k.pno());
                return;
            }
            throw new IOException("Error renaming file " + aVar.f23843d + " to " + aVar.f23844e + " for completion!");
        }
    }

    public static /* synthetic */ void b(a aVar, int i4, String str) {
        JSONObject jSONObject;
        aVar.f23847i = false;
        aVar.g = i4;
        aVar.f23841b = -1L;
        qbp.vt("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i4), " ", str);
        if (!aVar.f23848k.ouw() || (jSONObject = aVar.f23848k.ex) == null) {
            return;
        }
        try {
            jSONObject.put("error_real_code", i4);
            jSONObject.put("error_real_msg", str);
        } catch (Throwable th2) {
            qbp.ouw("CSJ_MediaDLPlay", "handleFailResponse: ", th2);
        }
    }
}
