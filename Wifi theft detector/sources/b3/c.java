package b3;

import android.content.Context;
import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import com.bytedance.sdk.component.ypw.emc.cf;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.component.ypw.emc.ypw;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import r2.a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public Context f4582a;

    /* renamed from: b, reason: collision with root package name */
    public xq f4583b;

    /* renamed from: d, reason: collision with root package name */
    public File f4585d;

    /* renamed from: e, reason: collision with root package name */
    public File f4586e;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f4584c = false;

    /* renamed from: f, reason: collision with root package name */
    public final List f4587f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f4588g = false;

    public c(Context context, xq xqVar) {
        this.f4585d = null;
        this.f4586e = null;
        this.f4582a = context;
        this.f4583b = xqVar;
        this.f4585d = y2.b.d(xqVar.bw(), xqVar.aa());
        this.f4586e = y2.b.c(xqVar.bw(), xqVar.aa());
    }

    public final void a() {
        try {
            if (this.f4585d.renameTo(this.f4586e)) {
                return;
            }
            throw new IOException("Error renaming file " + this.f4585d + " to " + this.f4586e + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void c() {
        try {
            this.f4586e.delete();
            this.f4585d.delete();
        } catch (Throwable unused) {
        }
    }

    public xq e() {
        return this.f4583b;
    }

    public final void j(xq xqVar, int i10) {
        synchronized (a.InterfaceC0474a.class) {
            try {
                for (a.InterfaceC0474a interfaceC0474a : this.f4587f) {
                    if (interfaceC0474a != null) {
                        interfaceC0474a.emc(xqVar, i10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(xq xqVar, int i10, String str) {
        synchronized (a.InterfaceC0474a.class) {
            try {
                for (a.InterfaceC0474a interfaceC0474a : this.f4587f) {
                    if (interfaceC0474a != null) {
                        interfaceC0474a.emc(xqVar, i10, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public void m(a.InterfaceC0474a interfaceC0474a) {
        if (this.f4588g) {
            synchronized (a.InterfaceC0474a.class) {
                this.f4587f.add(interfaceC0474a);
            }
            return;
        }
        this.f4587f.add(interfaceC0474a);
        if (t()) {
            this.f4583b.msw(1);
            j(this.f4583b, 200);
            b.b(this.f4583b);
        } else {
            this.f4588g = true;
            this.f4583b.msw(0);
            o();
        }
    }

    public void n(boolean z10) {
        this.f4584c = z10;
    }

    public final void o() {
        gbl.emc emcVarYpw = q2.b.b() != null ? q2.b.b().ypw() : new gbl.emc("v_preload");
        long jYzg = this.f4583b.yzg();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        emcVarYpw.emc(jYzg, timeUnit).ypw(this.f4583b.ul(), timeUnit).xq(this.f4583b.ylm(), timeUnit);
        gbl gblVarEmc = emcVarYpw.emc();
        sup.emc emcVar = new sup.emc();
        long length = this.f4585d.length();
        int iYcc = this.f4583b.ycc();
        boolean zSz = this.f4583b.sz();
        int iDg = this.f4583b.dg();
        if (iDg > 0) {
            if (iDg >= this.f4583b.sup()) {
                zSz = true;
            } else {
                iYcc = iDg;
            }
        }
        emcVar.emc("videoPreload").emc(6);
        if (zSz) {
            emcVar.emc("RANGE", "bytes=" + length + "-").ypw(this.f4583b.vk()).emc().ypw();
        } else {
            emcVar.emc("RANGE", "bytes=" + length + "-" + iYcc).ypw(this.f4583b.vk()).emc().ypw();
        }
        gblVarEmc.emc(emcVar.ypw()).emc(new a(length));
    }

    public final void s(xq xqVar, int i10) {
        synchronized (a.InterfaceC0474a.class) {
            try {
                for (a.InterfaceC0474a interfaceC0474a : this.f4587f) {
                    if (interfaceC0474a != null) {
                        interfaceC0474a.ypw(xqVar, i10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        if (this.f4586e.exists()) {
            return true;
        }
        if (!this.f4583b.sz()) {
            if (this.f4585d.length() >= this.f4583b.ycc()) {
                return true;
            }
            if (this.f4583b.dg() > 0 && this.f4585d.length() >= this.f4583b.dg()) {
                return true;
            }
        }
        return false;
    }

    public class a implements com.bytedance.sdk.component.ypw.emc.xq {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f4589a;

        public a(long j10) {
            this.f4589a = j10;
        }

        @Override // com.bytedance.sdk.component.ypw.emc.xq
        public void emc(ypw ypwVar, IOException iOException) {
            c cVar = c.this;
            cVar.k(cVar.f4583b, 601, iOException.getMessage());
            b.b(c.this.f4583b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v3 */
        @Override // com.bytedance.sdk.component.ypw.emc.xq
        public void emc(ypw ypwVar, qh qhVar) throws IOException {
            InputStream inputStreamXq;
            Closeable closeable;
            cf cfVarYcc;
            RandomAccessFile randomAccessFile;
            long jEmc;
            long j10 = this.f4589a;
            cf cfVar = null;
            try {
            } catch (Throwable th) {
                th = th;
                inputStreamXq = null;
                closeable = null;
            }
            if (qhVar != null) {
                boolean zDg = qhVar.dg();
                if (!zDg) {
                    c cVar = c.this;
                    cVar.k(cVar.f4583b, qhVar.xq(), qhVar.bw());
                    c.this.l(null);
                    c.this.l(null);
                    c.this.l(cfVar);
                    c.this.l(qhVar);
                    c.this.f4583b.vk();
                    c.this.f4583b.ycc();
                    b.b(c.this.f4583b);
                }
                cfVarYcc = qhVar.ycc();
                try {
                    cfVarYcc = qhVar.ycc();
                    if (!zDg || cfVarYcc == null) {
                        inputStreamXq = null;
                        jEmc = 0;
                    } else {
                        jEmc = this.f4589a + cfVarYcc.emc();
                        inputStreamXq = cfVarYcc.xq();
                    }
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = cfVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamXq = null;
                    randomAccessFile = 0;
                }
                if (inputStreamXq == null) {
                    c cVar2 = c.this;
                    cVar2.k(cVar2.f4583b, qhVar.xq(), qhVar.bw());
                } else {
                    randomAccessFile = new RandomAccessFile(c.this.f4585d, "rw");
                    try {
                        int iG = x2.a.g();
                        byte[] bArr = new byte[iG];
                        int i10 = 0;
                        long j11 = 0;
                        while (true) {
                            int i11 = inputStreamXq.read(bArr, i10, iG - i10);
                            if (i11 != -1) {
                                if (c.this.f4584c) {
                                    c cVar3 = c.this;
                                    cVar3.s(cVar3.f4583b, qhVar.xq());
                                    c.this.l(randomAccessFile);
                                    break;
                                } else {
                                    i10 += i11;
                                    j11 += i11;
                                    if (j11 % iG == 0 || j11 == jEmc - this.f4589a) {
                                        y2.b.b(randomAccessFile, bArr, Long.valueOf(j10).intValue(), i10, c.this.f4583b.aa());
                                        j10 += i10;
                                        i10 = 0;
                                    }
                                }
                            } else {
                                if (c.this.f4583b.sz() && jEmc == c.this.f4585d.length()) {
                                    c.this.a();
                                }
                                c cVar4 = c.this;
                                cVar4.j(cVar4.f4583b, qhVar.xq());
                                cfVar = randomAccessFile;
                            }
                        }
                        c.this.l(inputStreamXq);
                        c.this.l(cfVarYcc);
                    } catch (Throwable th4) {
                        th = th4;
                        cfVar = cfVarYcc;
                        closeable = randomAccessFile;
                        try {
                            c.this.c();
                            c cVar5 = c.this;
                            cVar5.k(cVar5.f4583b, qhVar != null ? qhVar.xq() : 601, th.getMessage());
                            c.this.l(closeable);
                            c.this.l(inputStreamXq);
                            c.this.l(cfVar);
                            c.this.l(qhVar);
                            c.this.f4583b.vk();
                            c.this.f4583b.ycc();
                            b.b(c.this.f4583b);
                        } catch (Throwable th5) {
                            c.this.l(closeable);
                            c.this.l(inputStreamXq);
                            c.this.l(cfVar);
                            c.this.l(qhVar);
                            c.this.f4583b.vk();
                            c.this.f4583b.ycc();
                            b.b(c.this.f4583b);
                            throw th5;
                        }
                    }
                    c.this.l(qhVar);
                    c.this.f4583b.vk();
                    c.this.f4583b.ycc();
                    b.b(c.this.f4583b);
                }
            } else {
                c cVar6 = c.this;
                cVar6.k(cVar6.f4583b, 601, "Network link failed.");
                cfVarYcc = null;
                inputStreamXq = null;
            }
            c.this.l(cfVar);
            c.this.l(inputStreamXq);
            c.this.l(cfVarYcc);
            c.this.l(qhVar);
            c.this.f4583b.vk();
            c.this.f4583b.ycc();
            b.b(c.this.f4583b);
        }
    }
}
