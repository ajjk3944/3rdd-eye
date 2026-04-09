package c3;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import c3.c;
import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import com.bytedance.sdk.component.msw.emc.emc;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.ul;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import q2.a;

/* loaded from: classes.dex */
public abstract class a implements q2.a, c.a, c.b, c.InterfaceC0062c, c.d, c.e, c.f, c.g, sf.emc {
    private static final SparseIntArray emc = new SparseIntArray();
    private SurfaceTexture bw;
    private ArrayList<Runnable> hxp;
    private volatile boolean mkp;
    private boolean ra;
    private boolean rie;
    private boolean sb;
    private boolean sup;
    private boolean sz;
    private sf vk;
    private volatile boolean wo;
    private SurfaceHolder ycc;
    private final boolean ypw = false;
    private final List<WeakReference<a.InterfaceC0459a>> xq = new CopyOnWriteArrayList();
    private final o dg = new o();
    private int uym = 0;
    private int msw = 3;
    private boolean zz = false;
    private volatile c3.c ru = null;
    private boolean gbl = false;
    private volatile int qh = 201;
    private long cf = -1;

    /* renamed from: aa, reason: collision with root package name */
    private boolean f4703aa = false;
    private long sba = 0;
    private long yzg = Long.MIN_VALUE;
    private long ul = 0;
    private long ylm = 0;
    private long sra = 0;
    private int ee = 0;
    private String db = MBridgeConstans.ENDCARD_URL_TYPE_PL;
    private xq sf = null;
    private boolean dr = false;
    private CountDownLatch xmt = new CountDownLatch(1);
    private volatile int lt = 200;
    private AtomicBoolean cuf = new AtomicBoolean(false);
    private Surface rtt = null;
    private long iyl = 0;
    private long mxo = 0;
    private boolean tp = false;
    private final Runnable vw = new f();

    /* renamed from: c3.a$a, reason: collision with other inner class name */
    public class RunnableC0061a implements Runnable {
        public RunnableC0061a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.ru == null) {
                try {
                    a.this.ru = new c3.e();
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (a.this.ru == null) {
                    return;
                }
                c3.c unused = a.this.ru;
                a.this.db = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                a.this.ru.d(a.this);
                a.this.ru.h(a.this);
                a.this.ru.i(a.this);
                a.this.ru.j(a.this);
                a.this.ru.c(a.this);
                a.this.ru.b(a.this);
                a.this.ru.e(a.this);
                try {
                    a.this.ru.f(false);
                } catch (Throwable unused2) {
                }
                a.this.gbl = false;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!a.this.uym() || a.this.ru == null) {
                return;
            }
            try {
                a.this.ru.ycc();
                for (WeakReference weakReference : a.this.xq) {
                    if (weakReference != null && weakReference.get() != null) {
                        ((a.InterfaceC0459a) weakReference.get()).bw(a.this);
                    }
                }
                a.this.qh = Sdk$SDKError.Reason.AD_ALREADY_FAILED_VALUE;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.vk != null) {
                a.this.vk.sendEmptyMessage(101);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.vk != null) {
                a.this.vk.sendEmptyMessage(101);
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.vk != null) {
                a.this.vk.sendEmptyMessage(104);
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.ru == null) {
                return;
            }
            long jSba = a.this.sba();
            if (jSba > 0 && a.this.ycc() && a.this.yzg != Long.MIN_VALUE) {
                try {
                    if (a.this.yzg == jSba) {
                        if (!a.this.f4703aa && a.this.ul >= 400) {
                            a.this.s(701, 800);
                            a.this.f4703aa = true;
                        }
                        a.this.ul += a.this.lt;
                    } else {
                        if (a.this.f4703aa) {
                            a.this.sba += a.this.ul;
                            a.this.s(702, 800);
                            long unused = a.this.sba;
                            int unused2 = a.this.uym;
                        }
                        a.this.ul = 0L;
                        a.this.f4703aa = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (a.this.aa() > 0) {
                if (a.this.yzg != jSba) {
                    if (q2.b.a()) {
                        long unused3 = a.this.yzg;
                    }
                    a aVar = a.this;
                    aVar.d(jSba, aVar.aa());
                }
                a.this.yzg = jSba;
            }
            if (a.this.ypw()) {
                a aVar2 = a.this;
                aVar2.d(aVar2.aa(), a.this.aa());
            } else if (a.this.vk != null) {
                a.this.vk.postDelayed(this, a.this.lt);
            }
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f4710a;

        public g(long j10) {
            this.f4710a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.vk != null) {
                a.this.vk.obtainMessage(106, Long.valueOf(this.f4710a)).sendToTarget();
            }
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f4712a;

        public h(SurfaceTexture surfaceTexture) {
            this.f4712a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o();
            if (a.this.vk != null) {
                a.this.vk.obtainMessage(111, this.f4712a).sendToTarget();
            }
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f4714a;

        public i(SurfaceHolder surfaceHolder) {
            this.f4714a = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o();
            if (a.this.vk != null) {
                a.this.vk.obtainMessage(110, this.f4714a).sendToTarget();
            }
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xq f4716a;

        public j(xq xqVar) {
            this.f4716a = xqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o();
            if (a.this.vk != null) {
                a.this.vk.obtainMessage(107, this.f4716a).sendToTarget();
            }
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.vk == null || a.this.vk.getLooper() == null) {
                return;
            }
            try {
                emc.emc().emc(a.this.vk);
                a.this.vk = null;
            } catch (Throwable unused) {
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.ru.msw();
                a.this.qh = Sdk$SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE;
                a.this.mkp = false;
            } catch (Throwable unused) {
            }
        }
    }

    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4720a;

        public m(boolean z10) {
            this.f4720a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.msw() || a.this.ru == null) {
                return;
            }
            try {
                a.this.dr = this.f4720a;
                a.this.ru.dg(this.f4720a);
            } catch (Throwable unused) {
            }
        }
    }

    public class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4722a;

        public n(boolean z10) {
            this.f4722a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.ru != null) {
                a.this.ru.emc(this.f4722a);
            }
        }
    }

    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public long f4724a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4725b;

        public o() {
        }

        public void a(long j10) {
            this.f4724a = j10;
        }

        public void b(boolean z10) {
            this.f4725b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.ru != null) {
                try {
                    if (!this.f4725b) {
                        long jRu = a.this.ru.ru();
                        a.this.cf = Math.max(this.f4724a, jRu);
                    }
                    long unused = a.this.cf;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (a.this.vk != null) {
                a.this.vk.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }

    public a() {
        h("SSMediaPlayerWrapper");
    }

    private void b() {
        if (this.sup) {
            return;
        }
        this.sup = true;
        ArrayList arrayList = new ArrayList(this.hxp);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        this.hxp.clear();
        this.sup = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j10, long j11) {
        long j12;
        long j13;
        if (!this.wo) {
            m();
        }
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference == null || weakReference.get() == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                weakReference.get().emc(this, j12, j13);
            }
            j10 = j12;
            j11 = j13;
        }
    }

    private void g(Runnable runnable) {
        try {
            if (this.hxp == null) {
                this.hxp = new ArrayList<>();
            }
            this.hxp.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void h(String str) {
        this.ee = 0;
        this.vk = emc.emc().emc(this, "csj_".concat(String.valueOf(str)));
        this.tp = true;
        o();
    }

    private void j() {
        if (this.ru == null) {
            return;
        }
        try {
            this.ru.sz();
        } catch (Throwable unused) {
        }
        this.ru.h(null);
        this.ru.e(null);
        this.ru.j(null);
        this.ru.b(null);
        this.ru.i(null);
        this.ru.d(null);
        this.ru.c(null);
        try {
            this.ru.sup();
        } catch (Throwable unused2) {
        }
    }

    private void k() {
        ArrayList<Runnable> arrayList = this.hxp;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.hxp.clear();
    }

    private void l() {
        v(new e());
    }

    private void m() {
        this.wo = true;
        this.zz = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.sra;
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc(this, jElapsedRealtime);
            }
        }
    }

    private void n() {
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.post(new l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.post(new RunnableC0061a());
        }
    }

    private void p() {
        ArrayList<Runnable> arrayList = this.hxp;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        b();
    }

    private void r() {
        this.sba = 0L;
        this.uym = 0;
        this.ul = 0L;
        this.f4703aa = false;
        this.yzg = Long.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i10, int i11) {
        if (i10 == 701) {
            this.iyl = SystemClock.elapsedRealtime();
            this.uym++;
            for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().emc(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i10 == 702) {
            if (this.iyl > 0) {
                this.mxo += SystemClock.elapsedRealtime() - this.iyl;
                this.iyl = 0L;
            }
            for (WeakReference<a.InterfaceC0459a> weakReference2 : this.xq) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().emc((q2.a) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.tp && i10 == 3) {
            p();
            m();
            ypw(this.dr);
        } else if (i10 == 805) {
            this.ra = true;
        }
    }

    private void t(long j10) {
        this.dg.a(j10);
        if (this.sb) {
            v(this.dg);
        } else if (x(this.sf)) {
            v(this.dg);
        } else {
            g(this.dg);
        }
    }

    private void v(Runnable runnable) {
        if (runnable == null || msw()) {
            return;
        }
        if (this.sz) {
            g(runnable);
        } else {
            runnable.run();
        }
    }

    private void w(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.ru.g(fileInputStream.getFD());
        fileInputStream.close();
    }

    public final void a() {
        SparseIntArray sparseIntArray = emc;
        sparseIntArray.put(this.ee, sparseIntArray.get(this.ee) + 1);
    }

    public long aa() {
        long j10 = this.ylm;
        if (j10 != 0) {
            return j10;
        }
        if (this.qh == 206 || this.qh == 207) {
            try {
                this.ylm = this.ru.gbl();
            } catch (Throwable unused) {
            }
        }
        return this.ylm;
    }

    public final void c() {
        sf sfVar = this.vk;
        if (sfVar == null || sfVar.getLooper() == null) {
            return;
        }
        try {
            this.vk.post(new k());
        } catch (Throwable unused) {
        }
    }

    public long cf() {
        if (this.f4703aa) {
            long j10 = this.ul;
            if (j10 > 0) {
                return this.sba + j10;
            }
        }
        return this.sba;
    }

    public final void e(xq xqVar, File file) {
        if (xqVar.emc()) {
            u(xqVar, file);
        } else {
            f(file);
        }
    }

    public final void f(File file) {
        file.getAbsolutePath();
        try {
            if (q2.b.h()) {
                w(file.getAbsolutePath());
            } else {
                this.ru.emc(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean i(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    public final void q(xq xqVar) {
        xqVar.vk();
        this.ru.emc(xqVar);
        xqVar.vk();
    }

    public boolean qh() {
        return this.ra;
    }

    public long sba() {
        if (msw()) {
            return 0L;
        }
        if (this.qh == 206 || this.qh == 207) {
            try {
                return this.ru.ru();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public void sup() {
        if (msw()) {
            return;
        }
        this.sz = true;
        k();
        sf sfVar = this.vk;
        if (sfVar != null) {
            try {
                sfVar.removeCallbacksAndMessages(null);
                if (this.ru != null) {
                    this.vk.sendEmptyMessage(103);
                }
                c();
            } catch (Throwable unused) {
                c();
            }
        }
    }

    public boolean sz() {
        return this.qh == 205;
    }

    public final void u(xq xqVar, File file) {
        try {
            String strA = u2.c.a(file);
            if (xqVar.aa().equals(strA)) {
                f(file);
                return;
            }
            JSONObject jSONObjectXq = xqVar.xq();
            boolean zYpw = xqVar.ypw();
            if (jSONObjectXq != null) {
                jSONObjectXq.put("file_hash", xqVar.aa());
                jSONObjectXq.put("file_real_hash", strA);
                jSONObjectXq.put("is_change_play_type", zYpw ? 1 : 0);
                jSONObjectXq.put("error_real_code", Sdk$SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                jSONObjectXq.put("error_real_msg", "md5_not_match");
            }
            if (zYpw) {
                boolean zDelete = file.delete();
                if (jSONObjectXq != null) {
                    jSONObjectXq.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    q(xqVar);
                    return;
                }
            }
            f(file);
        } catch (Throwable unused) {
        }
    }

    public SurfaceTexture ul() {
        return this.bw;
    }

    public int vk() {
        return this.uym;
    }

    public final boolean x(xq xqVar) {
        return xqVar != null && xqVar.uym();
    }

    public SurfaceHolder yzg() {
        return this.ycc;
    }

    @Override // q2.a
    public int bw() {
        if (this.ru == null || msw()) {
            return 0;
        }
        return this.ru.cf();
    }

    public void gbl() {
        sf sfVar;
        if (msw() || (sfVar = this.vk) == null) {
            return;
        }
        sfVar.removeMessages(100);
        this.mkp = true;
        if (this.tp) {
            if (!this.zz && !x(this.sf)) {
                g(new d());
                return;
            }
            sf sfVar2 = this.vk;
            if (sfVar2 != null) {
                sfVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.rie && !x(this.sf)) {
            g(new c());
            return;
        }
        sf sfVar3 = this.vk;
        if (sfVar3 != null) {
            sfVar3.sendEmptyMessage(101);
        }
    }

    @Override // q2.a
    public boolean msw() {
        return this.sz;
    }

    public void ru() {
        if (msw() || this.vk == null) {
            return;
        }
        this.cuf.set(true);
        this.vk.post(new b());
    }

    @Override // q2.a
    public boolean uym() {
        sf sfVar;
        return ((this.qh != 207 && !this.mkp) || (sfVar = this.vk) == null || sfVar.hasMessages(100)) ? false : true;
    }

    @Override // q2.a
    public boolean ycc() {
        sf sfVar;
        return (this.qh == 206 || ((sfVar = this.vk) != null && sfVar.hasMessages(100))) && !this.mkp;
    }

    public void zz() {
        if (msw() || this.ru == null) {
            return;
        }
        this.cuf.set(true);
        if (this.qh != 206) {
            r();
            this.mkp = false;
            this.dg.b(true);
            t(0L);
            sf sfVar = this.vk;
            if (sfVar != null) {
                sfVar.removeCallbacks(this.vw);
                this.vk.postDelayed(this.vw, this.lt);
            }
        }
        this.xmt.countDown();
    }

    @Override // q2.a
    public int dg() {
        if (this.ru == null || msw()) {
            return 0;
        }
        return this.ru.qh();
    }

    @Override // q2.a
    public boolean xq() {
        return sz() || ycc() || uym();
    }

    @Override // q2.a
    public boolean ypw() {
        return this.qh == 209;
    }

    @Override // c3.c.f
    public void xq(c3.c cVar) {
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc((q2.a) this, true);
            }
        }
    }

    @Override // c3.c.b
    public boolean ypw(c3.c cVar, int i10, int i11) {
        if (this.ru != cVar) {
            return false;
        }
        if (i11 == -1004) {
            com.bykv.vk.openvk.emc.emc.emc.xq.a aVar = new com.bykv.vk.openvk.emc.emc.emc.xq.a(i10, i11);
            for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().emc(this, aVar);
                }
            }
        }
        s(i10, i11);
        return false;
    }

    public void emc(boolean z10) {
        if (msw()) {
            return;
        }
        this.sb = z10;
        if (this.ru != null) {
            this.ru.emc(z10);
            return;
        }
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.post(new n(z10));
        }
    }

    @Override // c3.c.a
    public void ypw(c3.c cVar) {
        if (msw()) {
            return;
        }
        this.qh = Sdk$SDKError.Reason.AD_IS_PLAYING_VALUE;
        try {
            xq xqVar = this.sf;
            if (xqVar != null) {
                float fCf = xqVar.cf();
                if (fCf > 0.0f) {
                    q2.c cVar2 = new q2.c();
                    cVar2.b(fCf);
                    this.ru.k(cVar2);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.vk != null) {
            if (this.mkp) {
                n();
            } else {
                sf sfVar = this.vk;
                sfVar.sendMessage(sfVar.obtainMessage(100, -1, -1));
            }
        }
        emc.delete(this.ee);
        boolean z10 = this.tp;
        boolean z11 = this.rie;
        if (!z10 && !z11) {
            m();
            this.rie = true;
        }
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ypw(this);
            }
        }
    }

    public void emc(boolean z10, long j10, boolean z11) {
        if (msw()) {
            return;
        }
        o();
        this.dr = z11;
        this.cuf.set(true);
        this.mkp = false;
        ypw(z11);
        if (z10) {
            this.cf = j10;
            l();
        } else {
            t(j10);
        }
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.removeCallbacks(this.vw);
            this.vk.postDelayed(this.vw, this.lt);
        }
        this.xmt.countDown();
    }

    public void emc(long j10) {
        if (msw()) {
            return;
        }
        if (this.qh == 207 || this.qh == 206 || this.qh == 209) {
            v(new g(j10));
        }
    }

    public void ypw(boolean z10) {
        sf sfVar;
        if (msw() || (sfVar = this.vk) == null) {
            return;
        }
        sfVar.post(new m(z10));
    }

    @Override // q2.a
    public boolean emc() {
        return this.zz;
    }

    public void ypw(int i10) {
        this.msw = i10;
    }

    public void emc(SurfaceTexture surfaceTexture) {
        if (msw()) {
            return;
        }
        this.bw = surfaceTexture;
        emc(true);
        v(new h(surfaceTexture));
    }

    public void emc(SurfaceHolder surfaceHolder) {
        if (msw()) {
            return;
        }
        this.ycc = surfaceHolder;
        emc(true);
        v(new i(surfaceHolder));
    }

    public void emc(xq xqVar) {
        if (msw()) {
            return;
        }
        this.sf = xqVar;
        if (xqVar != null) {
            this.tp = this.tp && !xqVar.uym();
        }
        v(new j(xqVar));
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        int i10 = this.qh;
        int i11 = message.what;
        if (this.ru != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.qh == 205 || this.qh == 207 || this.qh == 209) {
                            this.ru.ycc();
                            this.sra = SystemClock.elapsedRealtime();
                            this.qh = Sdk$SDKError.Reason.AD_ALREADY_FAILED_VALUE;
                            if (this.cf > 0) {
                                this.ru.emc(this.cf, this.msw);
                                this.cf = -1L;
                            }
                            if (this.sf != null) {
                                ypw(this.dr);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.f4703aa) {
                            this.sba += this.ul;
                        }
                        this.f4703aa = false;
                        this.ul = 0L;
                        this.yzg = Long.MIN_VALUE;
                        if (this.qh == 206 || this.qh == 207 || this.qh == 209) {
                            this.ru.msw();
                            this.qh = Sdk$SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE;
                            this.mkp = false;
                            for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().dg(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.ru.sz();
                        this.qh = 201;
                        return;
                    case 103:
                        try {
                            j();
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<a.InterfaceC0459a> weakReference2 : this.xq) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().xq(this);
                            }
                        }
                        this.qh = Sdk$SDKError.Reason.AD_IS_LOADING_VALUE;
                        return;
                    case 104:
                        if (this.qh == 202 || this.qh == 208) {
                            this.ru.zz();
                            return;
                        }
                        break;
                    case 105:
                        if (this.qh == 205 || this.qh == 206 || this.qh == 208 || this.qh == 207 || this.qh == 209) {
                            this.ru.uym();
                            this.qh = Sdk$SDKError.Reason.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        break;
                    case 106:
                        if (this.qh == 206 || this.qh == 207 || this.qh == 209) {
                            this.ru.emc(((Long) message.obj).longValue(), this.msw);
                            return;
                        }
                        break;
                    case 107:
                        r();
                        if (this.qh == 201 || this.qh == 203) {
                            xq xqVar = (xq) message.obj;
                            if (TextUtils.isEmpty(xqVar.bw())) {
                                xqVar.emc(q2.b.j());
                            }
                            if (xqVar.ee()) {
                                this.ru.emc(xqVar.vk());
                                xqVar.vk();
                            } else {
                                File file = new File(xqVar.bw(), xqVar.aa());
                                if (file.exists()) {
                                    e(xqVar, file);
                                } else {
                                    q(xqVar);
                                }
                            }
                            this.qh = Sdk$SDKError.Reason.AD_CONSUMED_VALUE;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.ru.emc((SurfaceHolder) message.obj);
                        this.ru.ypw(true);
                        this.xmt.await(1L, TimeUnit.SECONDS);
                        p();
                        return;
                    case 111:
                        this.rtt = new Surface((SurfaceTexture) message.obj);
                        this.ru.a(this.rtt);
                        this.ru.ypw(true);
                        this.xmt.await(1L, TimeUnit.SECONDS);
                        p();
                        return;
                }
                this.qh = 200;
                if (this.gbl) {
                    return;
                }
                com.bykv.vk.openvk.emc.emc.emc.xq.a aVar = new com.bykv.vk.openvk.emc.emc.emc.xq.a(308, i11);
                aVar.b(i10 + "," + i11);
                for (WeakReference<a.InterfaceC0459a> weakReference3 : this.xq) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().emc(this, aVar);
                    }
                }
                this.gbl = true;
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // c3.c.InterfaceC0062c
    public void emc(c3.c cVar, int i10) {
        if (this.ru != cVar) {
            return;
        }
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ypw(this, i10);
            }
        }
    }

    @Override // c3.c.g
    public void emc(c3.c cVar) {
        this.qh = Sdk$SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE;
        emc.delete(this.ee);
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.removeCallbacks(this.vw);
        }
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc(this);
            }
        }
    }

    @Override // c3.c.e
    public boolean emc(c3.c cVar, int i10, int i11) {
        a();
        this.qh = 200;
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.removeCallbacks(this.vw);
        }
        if (i(i10, i11)) {
            c();
        }
        if (!this.cuf.get()) {
            return true;
        }
        this.cuf.set(false);
        com.bykv.vk.openvk.emc.emc.emc.xq.a aVar = new com.bykv.vk.openvk.emc.emc.emc.xq.a(i10, i11);
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc(this, aVar);
            }
        }
        return true;
    }

    @Override // c3.c.d
    public void emc(c3.c cVar, int i10, int i11, int i12, int i13) {
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc((q2.a) this, i10, i11);
            }
        }
    }

    public void emc(a.InterfaceC0459a interfaceC0459a) {
        if (interfaceC0459a == null) {
            return;
        }
        for (WeakReference<a.InterfaceC0459a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() == interfaceC0459a) {
                return;
            }
        }
        this.xq.add(new WeakReference<>(interfaceC0459a));
    }

    public void emc(int i10) {
        if (msw()) {
            return;
        }
        this.lt = i10;
    }

    public boolean emc(float f10) {
        PlaybackParams playbackParamsBw;
        if (f10 <= 0.0f) {
            return false;
        }
        try {
            if (this.ru == null || !xq()) {
                return false;
            }
            try {
                playbackParamsBw = this.ru.bw();
            } catch (Throwable th) {
                ul.xq("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParamsBw = null;
            }
            if ((playbackParamsBw != null ? playbackParamsBw.getSpeed() : 0.0f) == f10) {
                return true;
            }
            q2.c cVar = new q2.c();
            cVar.b(f10);
            this.ru.k(cVar);
            return true;
        } catch (Throwable th2) {
            ul.emc("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }
}
