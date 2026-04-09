package a3;

import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.ypw.emc.cf;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.component.ypw.emc.ypw;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f111a;

    /* renamed from: d, reason: collision with root package name */
    public File f114d;

    /* renamed from: e, reason: collision with root package name */
    public File f115e;

    /* renamed from: f, reason: collision with root package name */
    public long f116f;

    /* renamed from: k, reason: collision with root package name */
    public RandomAccessFile f121k;

    /* renamed from: l, reason: collision with root package name */
    public final xq f122l;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f123m;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f112b = -2147483648L;

    /* renamed from: c, reason: collision with root package name */
    public final Object f113c = new Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile long f117g = -1;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f118h = -100;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f119i = false;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f120j = false;

    public class a implements com.bytedance.sdk.component.ypw.emc.xq {
        public a() {
        }

        @Override // com.bytedance.sdk.component.ypw.emc.xq
        public void emc(ypw ypwVar, IOException iOException) {
            c.this.h(30000, iOException.getMessage());
        }

        @Override // com.bytedance.sdk.component.ypw.emc.xq
        public void emc(ypw ypwVar, qh qhVar) {
            cf cfVarYcc;
            if (qhVar == null) {
                c.this.h(Sdk$SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                return;
            }
            InputStream inputStreamXq = null;
            try {
                try {
                    c.this.f120j = qhVar.dg();
                    if (c.this.f120j) {
                        cfVarYcc = qhVar.ycc();
                        try {
                            if (c.this.f120j && cfVarYcc != null) {
                                c.this.f112b = cfVarYcc.emc() + c.this.f116f;
                                inputStreamXq = cfVarYcc.xq();
                            }
                            if (inputStreamXq == null) {
                                c.this.h(Sdk$SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                if (inputStreamXq != null) {
                                    inputStreamXq.close();
                                }
                                if (cfVarYcc != null) {
                                    cfVarYcc.close();
                                }
                                qhVar.close();
                                if (!c.this.f120j || c.this.f114d.length() != c.this.f112b) {
                                    return;
                                }
                                c.this.q();
                            }
                            int iG = x2.a.g();
                            byte[] bArr = new byte[iG];
                            long j10 = c.this.f116f;
                            long unused = c.this.f112b;
                            long unused2 = c.this.f116f;
                            c.this.f122l.vk();
                            long j11 = 0;
                            long j12 = 0;
                            int i10 = 0;
                            while (true) {
                                int i11 = inputStreamXq.read(bArr, i10, iG - i10);
                                if (i11 == -1) {
                                    break;
                                }
                                i10 += i11;
                                j12 += i11;
                                boolean z10 = j12 % ((long) iG) == j11 || j12 == c.this.f112b - c.this.f116f;
                                long unused3 = c.this.f112b;
                                StringBuilder sb = new StringBuilder();
                                sb.append(j12);
                                sb.append(", waitingAtPost=");
                                long unused4 = c.this.f123m;
                                if (z10) {
                                    synchronized (c.this.f113c) {
                                        try {
                                            y2.b.b(c.this.f121k, bArr, Long.valueOf(j10).intValue(), i10, c.this.f122l.aa());
                                            if (c.this.f111a && c.this.f123m > -1 && c.this.f116f + j12 >= c.this.f123m) {
                                                c.this.f113c.notify();
                                            }
                                        } finally {
                                        }
                                    }
                                    j10 += i10;
                                    i10 = 0;
                                }
                                j11 = 0;
                            }
                            long unused5 = c.this.f116f;
                            long unused6 = c.this.f112b;
                            long unused7 = c.this.f112b;
                            long unused8 = c.this.f116f;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                c.this.h(Sdk$SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                if (inputStreamXq != null) {
                                    inputStreamXq.close();
                                }
                                if (cfVarYcc != null) {
                                    cfVarYcc.close();
                                }
                                qhVar.close();
                                if (c.this.f120j && c.this.f114d.length() == c.this.f112b) {
                                    c.this.q();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                if (inputStreamXq != null) {
                                    try {
                                        inputStreamXq.close();
                                    } catch (Throwable unused9) {
                                        throw th2;
                                    }
                                }
                                if (cfVarYcc != null) {
                                    cfVarYcc.close();
                                }
                                qhVar.close();
                                if (c.this.f120j && c.this.f114d.length() == c.this.f112b) {
                                    c.this.q();
                                }
                                throw th2;
                            }
                        }
                    } else {
                        c.this.h(qhVar.xq(), qhVar.bw());
                        cfVarYcc = null;
                    }
                    if (inputStreamXq != null) {
                        inputStreamXq.close();
                    }
                    if (cfVarYcc != null) {
                        cfVarYcc.close();
                    }
                    qhVar.close();
                    if (!c.this.f120j || c.this.f114d.length() != c.this.f112b) {
                        return;
                    }
                    c.this.q();
                } catch (Throwable th3) {
                    th = th3;
                    cfVarYcc = null;
                }
            } catch (Throwable unused10) {
            }
        }
    }

    public c(xq xqVar) {
        this.f116f = 0L;
        this.f121k = null;
        this.f122l = xqVar;
        try {
            String strBw = xqVar.bw();
            String strAa = xqVar.aa();
            this.f114d = y2.b.d(strBw, strAa);
            this.f115e = y2.b.c(strBw, strAa);
            if (e()) {
                this.f121k = new RandomAccessFile(this.f115e, "r");
            } else {
                this.f121k = new RandomAccessFile(this.f114d, "rw");
            }
            if (!e()) {
                this.f116f = this.f114d.length();
                g();
            }
            this.f111a = x2.a.i() == 2;
        } catch (Throwable unused) {
            xqVar.vk();
        }
    }

    @Override // a3.b
    public int a(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (j10 == this.f112b) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.f119i) {
                synchronized (this.f113c) {
                    try {
                        if (j10 < b()) {
                            this.f121k.seek(j10);
                            i13 = this.f121k.read(bArr, i10, i11);
                        } else {
                            i12 += 33;
                            this.f123m = j10;
                            this.f113c.wait(33L);
                            this.f123m = -1L;
                        }
                    } finally {
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                xq xqVar = this.f122l;
                if (xqVar != null && xqVar.emc() && this.f118h != -100 && (!this.f120j || this.f112b == this.f117g)) {
                    throw new IOException();
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    public final long b() {
        return e() ? this.f115e.length() : this.f114d.length();
    }

    public final boolean e() {
        return this.f115e.exists();
    }

    public void g() {
        gbl.emc emcVarYpw = q2.b.b() != null ? q2.b.b().ypw() : new gbl.emc("v_cache");
        long jYzg = this.f122l.yzg();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        emcVarYpw.emc(jYzg, timeUnit).ypw(this.f122l.ul(), timeUnit).xq(this.f122l.ylm(), timeUnit);
        gbl gblVarEmc = emcVarYpw.emc();
        this.f122l.aa();
        gblVarEmc.emc(new sup.emc().emc("RANGE", "bytes=" + this.f116f + "-").ypw(this.f122l.vk()).emc().emc("videoLoadWhenPlaying").emc(9).ypw()).emc(new a());
    }

    public final void h(int i10, String str) {
        JSONObject jSONObjectXq;
        this.f120j = false;
        this.f118h = i10;
        this.f112b = this.f117g;
        ul.ypw("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i10), " ", str);
        xq xqVar = this.f122l;
        if (xqVar == null || !xqVar.emc() || (jSONObjectXq = this.f122l.xq()) == null) {
            return;
        }
        try {
            jSONObjectXq.put("error_real_code", i10);
            jSONObjectXq.put("error_real_msg", str);
        } catch (Throwable th) {
            ul.emc("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    public final void q() {
        synchronized (this.f113c) {
            if (e()) {
                this.f122l.vk();
                this.f122l.aa();
                return;
            }
            try {
            } finally {
            }
            if (!this.f114d.renameTo(this.f115e)) {
                throw new IOException("Error renaming file " + this.f114d + " to " + this.f115e + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.f121k;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f121k = new RandomAccessFile(this.f115e, "rw");
            this.f122l.aa();
            this.f122l.vk();
        }
    }

    @Override // a3.b
    public long xq() {
        if (e()) {
            this.f112b = this.f115e.length();
        } else {
            synchronized (this.f113c) {
                int i10 = 0;
                while (this.f112b == -2147483648L && !this.f119i) {
                    try {
                        i10 += 15;
                        try {
                            this.f113c.wait(5L);
                            if (i10 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return this.f112b;
    }

    @Override // a3.b
    public void ypw() {
        try {
            if (!this.f119i) {
                this.f121k.close();
            }
            File file = this.f114d;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.f115e;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.f119i = true;
    }
}
