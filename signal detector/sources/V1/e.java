package V1;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.component.msw.emc.emc;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.sz.dg.xq;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e implements J1.b, f, g, h, i, j, k, l, sf.emc {
    private static final SparseIntArray emc = new SparseIntArray();
    private SurfaceTexture bw;
    private final d dg;
    private int ee;
    private ArrayList<Runnable> hxp;
    private volatile boolean mkp;
    private boolean ra;
    private boolean rie;
    private boolean sb;
    private boolean sup;
    private boolean sz;
    private boolean tp;
    private sf vk;
    private final Runnable vw;
    private volatile boolean wo;
    private SurfaceHolder ycc;
    private final boolean ypw = false;
    private final List<WeakReference<J1.a>> xq = new CopyOnWriteArrayList();
    private int uym = 0;
    private int msw = 3;
    private boolean zz = false;
    private volatile m ru = null;
    private boolean gbl = false;
    private volatile int qh = 201;
    private long cf = -1;
    private boolean aa = false;
    private long sba = 0;
    private long yzg = Long.MIN_VALUE;
    private long ul = 0;
    private long ylm = 0;
    private long sra = 0;
    private String db = "0";
    private com.bykv.vk.openvk.emc.emc.emc.xq.b sf = null;
    private boolean dr = false;
    private CountDownLatch xmt = new CountDownLatch(1);
    private volatile int lt = TTAdConstant.MATE_VALID;
    private AtomicBoolean cuf = new AtomicBoolean(false);
    private Surface rtt = null;
    private long iyl = 0;
    private long mxo = 0;

    public e() {
        xq xqVar = (xq) this;
        this.dg = new d(xqVar);
        this.ee = 0;
        this.tp = false;
        this.vw = new C0.k(9, xqVar);
        this.ee = 0;
        sf sfVarEmc = emc.emc().emc(this, "csj_".concat("SSMediaPlayerWrapper"));
        this.vk = sfVarEmc;
        this.tp = true;
        if (sfVarEmc != null) {
            sfVarEmc.post(new a(this, 0));
        }
    }

    public static void ru(e eVar) {
        sf sfVar = eVar.vk;
        if (sfVar != null) {
            sfVar.post(new a(eVar, 0));
        }
    }

    public final void a() {
        sf sfVar = this.vk;
        if (sfVar == null || sfVar.getLooper() == null) {
            return;
        }
        try {
            this.vk.post(new a(this, 5));
        } catch (Throwable unused) {
        }
    }

    public long aa() {
        long j6 = this.ylm;
        long duration = 0;
        if (j6 != 0) {
            return j6;
        }
        if (this.qh == 206 || this.qh == 207) {
            try {
                o oVar = (o) this.ru;
                oVar.getClass();
                try {
                    duration = oVar.i.getDuration();
                } catch (Throwable unused) {
                }
                this.ylm = duration;
            } catch (Throwable unused2) {
            }
        }
        return this.ylm;
    }

    public final void b(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, File file) {
        if (!bVar.emc()) {
            c(file);
            return;
        }
        try {
            String strI = R3.b.i(file);
            if (bVar.aa().equals(strI)) {
                c(file);
                return;
            }
            JSONObject jSONObjectXq = bVar.xq();
            boolean zYpw = bVar.ypw();
            if (jSONObjectXq != null) {
                jSONObjectXq.put("file_hash", bVar.aa());
                jSONObjectXq.put("file_real_hash", strI);
                jSONObjectXq.put("is_change_play_type", zYpw ? 1 : 0);
                jSONObjectXq.put("error_real_code", 309);
                jSONObjectXq.put("error_real_msg", "md5_not_match");
            }
            if (zYpw) {
                boolean zDelete = file.delete();
                if (jSONObjectXq != null) {
                    jSONObjectXq.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    h(bVar);
                    return;
                }
            }
            c(file);
        } catch (Throwable unused) {
        }
    }

    public final void c(File file) {
        file.getAbsolutePath();
        try {
            if (!J1.c.f2038c) {
                ((o) this.ru).c(file.getAbsolutePath());
            } else {
                FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
                m mVar = this.ru;
                ((o) mVar).i.setDataSource(fileInputStream.getFD());
                fileInputStream.close();
            }
        } catch (Throwable unused) {
        }
    }

    public long cf() {
        if (this.aa) {
            long j6 = this.ul;
            if (j6 > 0) {
                return this.sba + j6;
            }
        }
        return this.sba;
    }

    public final void d(Runnable runnable) {
        try {
            if (this.hxp == null) {
                this.hxp = new ArrayList<>();
            }
            this.hxp.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void e() {
        if (this.ru == null) {
            return;
        }
        try {
            o oVar = (o) this.ru;
            oVar.getClass();
            try {
                oVar.i.reset();
            } catch (Throwable unused) {
            }
            S1.a aVar = oVar.f3859k;
            if (aVar != null) {
                try {
                    aVar.close();
                } catch (Throwable unused2) {
                }
                oVar.f3859k = null;
            }
            oVar.d();
            oVar.a();
        } catch (Throwable unused3) {
        }
        ((o) this.ru).f3851b = null;
        ((o) this.ru).f3854e = null;
        ((o) this.ru).f3852c = null;
        ((o) this.ru).f3856g = null;
        ((o) this.ru).f3855f = null;
        ((o) this.ru).f3850a = null;
        ((o) this.ru).f3853d = null;
        try {
            o oVar2 = (o) this.ru;
            synchronized (oVar2.f3861m) {
                try {
                    if (!oVar2.f3862n) {
                        oVar2.i.release();
                        oVar2.f3862n = true;
                        try {
                            Surface surface = oVar2.f3860l;
                            if (surface != null) {
                                surface.release();
                                oVar2.f3860l = null;
                            }
                        } catch (Throwable unused4) {
                        }
                        S1.a aVar2 = oVar2.f3859k;
                        if (aVar2 != null) {
                            try {
                                aVar2.close();
                            } catch (Throwable unused5) {
                            }
                            oVar2.f3859k = null;
                        }
                        oVar2.d();
                        oVar2.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused6) {
        }
    }

    public final void f() {
        this.wo = true;
        this.zz = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.sra;
        for (WeakReference<J1.a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc(this, jElapsedRealtime);
            }
        }
    }

    public final void g() {
        ArrayList<Runnable> arrayList = this.hxp;
        if (arrayList == null || arrayList.isEmpty() || this.sup) {
            return;
        }
        this.sup = true;
        ArrayList arrayList2 = new ArrayList(this.hxp);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((Runnable) obj).run();
        }
        this.hxp.clear();
        this.sup = false;
    }

    public final void h(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        bVar.vk();
        o oVar = (o) this.ru;
        synchronized (oVar) {
            S1.a aVar = new S1.a(J1.c.f2036a, bVar);
            S1.a.f3474e.put(bVar.aa(), aVar);
            oVar.f3859k = aVar;
            U1.a.a(bVar);
            oVar.i.setDataSource(oVar.f3859k);
        }
        bVar.vk();
    }

    public final void i(int i) {
        if (i == 701) {
            this.iyl = SystemClock.elapsedRealtime();
            this.uym++;
            for (WeakReference<J1.a> weakReference : this.xq) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().emc(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i != 702) {
            if (this.tp && i == 3) {
                g();
                f();
                ypw(this.dr);
                return;
            } else {
                if (i == 805) {
                    this.ra = true;
                    return;
                }
                return;
            }
        }
        if (this.iyl > 0) {
            this.mxo = (SystemClock.elapsedRealtime() - this.iyl) + this.mxo;
            this.iyl = 0L;
        }
        for (WeakReference<J1.a> weakReference2 : this.xq) {
            if (weakReference2 != null && weakReference2.get() != null) {
                weakReference2.get().emc((J1.b) this, Integer.MAX_VALUE);
            }
        }
    }

    public final void j(long j6) {
        d dVar = this.dg;
        dVar.f3846a = j6;
        if (this.sb) {
            k(dVar);
            return;
        }
        com.bykv.vk.openvk.emc.emc.emc.xq.b bVar = this.sf;
        if (bVar == null || !bVar.uym()) {
            d(this.dg);
        } else {
            k(this.dg);
        }
    }

    public final void k(Runnable runnable) {
        if (runnable == null || msw()) {
            return;
        }
        if (this.sz) {
            d(runnable);
        } else {
            runnable.run();
        }
    }

    public boolean qh() {
        return this.ra;
    }

    public long sba() {
        if (msw()) {
            return 0L;
        }
        if (this.qh != 206 && this.qh != 207) {
            return 0L;
        }
        try {
            ((o) this.ru).getClass();
            return r0.i.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void sup() {
        if (msw()) {
            return;
        }
        this.sz = true;
        ArrayList<Runnable> arrayList = this.hxp;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.hxp.clear();
        }
        sf sfVar = this.vk;
        if (sfVar != null) {
            try {
                sfVar.removeCallbacksAndMessages(null);
                if (this.ru != null) {
                    this.vk.sendEmptyMessage(103);
                }
                a();
            } catch (Throwable unused) {
                a();
            }
        }
    }

    public boolean sz() {
        return this.qh == 205;
    }

    public SurfaceTexture ul() {
        return this.bw;
    }

    public int vk() {
        return this.uym;
    }

    public SurfaceHolder yzg() {
        return this.ycc;
    }

    @Override // J1.b
    public int bw() {
        MediaPlayer mediaPlayer;
        if (this.ru == null || msw() || (mediaPlayer = ((o) this.ru).i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoHeight();
    }

    public void gbl() {
        sf sfVar;
        com.bykv.vk.openvk.emc.emc.emc.xq.b bVar;
        com.bykv.vk.openvk.emc.emc.emc.xq.b bVar2;
        if (msw() || (sfVar = this.vk) == null) {
            return;
        }
        sfVar.removeMessages(100);
        this.mkp = true;
        if (this.tp) {
            if (!this.zz && ((bVar = this.sf) == null || !bVar.uym())) {
                d(new a(this, 3));
                return;
            }
            sf sfVar2 = this.vk;
            if (sfVar2 != null) {
                sfVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.rie && ((bVar2 = this.sf) == null || !bVar2.uym())) {
            d(new a(this, 2));
            return;
        }
        sf sfVar3 = this.vk;
        if (sfVar3 != null) {
            sfVar3.sendEmptyMessage(101);
        }
    }

    @Override // J1.b
    public boolean msw() {
        return this.sz;
    }

    @Override // J1.b
    public boolean uym() {
        sf sfVar;
        return ((this.qh != 207 && !this.mkp) || (sfVar = this.vk) == null || sfVar.hasMessages(100)) ? false : true;
    }

    @Override // J1.b
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
            this.sba = 0L;
            this.uym = 0;
            this.ul = 0L;
            this.aa = false;
            this.yzg = Long.MIN_VALUE;
            this.mkp = false;
            this.dg.f3847b = true;
            j(0L);
            sf sfVar = this.vk;
            if (sfVar != null) {
                sfVar.removeCallbacks(this.vw);
                this.vk.postDelayed(this.vw, this.lt);
            }
        }
        this.xmt.countDown();
    }

    public void ru() {
        if (msw() || this.vk == null) {
            return;
        }
        this.cuf.set(true);
        this.vk.post(new a(this, 1));
    }

    @Override // J1.b
    public int dg() {
        MediaPlayer mediaPlayer;
        if (this.ru == null || msw() || (mediaPlayer = ((o) this.ru).i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoWidth();
    }

    @Override // J1.b
    public boolean xq() {
        return sz() || ycc() || uym();
    }

    @Override // J1.b
    public boolean ypw() {
        return this.qh == 209;
    }

    @Override // V1.k
    public void xq(m mVar) {
        for (WeakReference<J1.a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc((J1.b) this, true);
            }
        }
    }

    @Override // V1.g
    public boolean ypw(m mVar, int i, int i3) {
        if (this.ru != mVar) {
            return false;
        }
        if (i3 == -1004) {
            com.bykv.vk.openvk.emc.emc.emc.xq.a aVar = new com.bykv.vk.openvk.emc.emc.emc.xq.a(i, i3);
            for (WeakReference<J1.a> weakReference : this.xq) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().emc(this, aVar);
                }
            }
        }
        i(i);
        return false;
    }

    public static void emc(e eVar, long j6, long j7) {
        e eVar2;
        long j8;
        long j9;
        if (!eVar.wo) {
            eVar.f();
        }
        for (WeakReference<J1.a> weakReference : eVar.xq) {
            if (weakReference == null || weakReference.get() == null) {
                eVar2 = eVar;
                j8 = j6;
                j9 = j7;
            } else {
                eVar2 = eVar;
                j8 = j6;
                j9 = j7;
                weakReference.get().emc(eVar2, j8, j9);
            }
            eVar = eVar2;
            j6 = j8;
            j7 = j9;
        }
    }

    @Override // V1.f
    public void ypw(m mVar) {
        if (msw()) {
            return;
        }
        this.qh = 205;
        try {
            com.bykv.vk.openvk.emc.emc.emc.xq.b bVar = this.sf;
            if (bVar != null) {
                float fCf = bVar.cf();
                if (fCf > 0.0f) {
                    MediaPlayer mediaPlayer = ((o) this.ru).i;
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(fCf));
                }
            }
        } catch (Throwable unused) {
        }
        if (this.vk != null) {
            if (this.mkp) {
                sf sfVar = this.vk;
                if (sfVar != null) {
                    sfVar.post(new a(this, 6));
                }
            } else {
                sf sfVar2 = this.vk;
                sfVar2.sendMessage(sfVar2.obtainMessage(100, -1, -1));
            }
        }
        emc.delete(this.ee);
        boolean z6 = this.tp;
        boolean z7 = this.rie;
        if (!z6 && !z7) {
            f();
            this.rie = true;
        }
        for (WeakReference<J1.a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ypw(this);
            }
        }
    }

    public void emc(boolean z6) {
        if (msw()) {
            return;
        }
        this.sb = z6;
        if (this.ru != null) {
            ((o) this.ru).f3857h = z6;
            return;
        }
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.post(new c(this, z6, 1));
        }
    }

    public void emc(boolean z6, long j6, boolean z7) {
        if (msw()) {
            return;
        }
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.post(new a(this, 0));
        }
        this.dr = z7;
        this.cuf.set(true);
        this.mkp = false;
        ypw(z7);
        if (z6) {
            this.cf = j6;
            k(new a(this, 4));
        } else {
            j(j6);
        }
        sf sfVar2 = this.vk;
        if (sfVar2 != null) {
            sfVar2.removeCallbacks(this.vw);
            this.vk.postDelayed(this.vw, this.lt);
        }
        this.xmt.countDown();
    }

    public void ypw(boolean z6) {
        sf sfVar;
        if (msw() || (sfVar = this.vk) == null) {
            return;
        }
        sfVar.post(new c(this, z6, 0));
    }

    public void emc(long j6) {
        if (msw()) {
            return;
        }
        if (this.qh == 207 || this.qh == 206 || this.qh == 209) {
            k(new b(this, j6, 0));
        }
    }

    public void ypw(int i) {
        this.msw = i;
    }

    @Override // J1.b
    public boolean emc() {
        return this.zz;
    }

    public void emc(SurfaceTexture surfaceTexture) {
        if (msw()) {
            return;
        }
        this.bw = surfaceTexture;
        emc(true);
        k(new A1.d(this, 13, surfaceTexture));
    }

    public void emc(SurfaceHolder surfaceHolder) {
        if (msw()) {
            return;
        }
        this.ycc = surfaceHolder;
        emc(true);
        k(new A1.d(this, 14, surfaceHolder));
    }

    public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        if (msw()) {
            return;
        }
        this.sf = bVar;
        if (bVar != null) {
            this.tp = this.tp && !bVar.uym();
        }
        k(new A1.d(this, 15, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.component.utils.sf.emc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.e.emc(android.os.Message):void");
    }

    @Override // V1.h
    public void emc(m mVar, int i) {
        if (this.ru != mVar) {
            return;
        }
        for (WeakReference<J1.a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ypw(this, i);
            }
        }
    }

    @Override // V1.j
    public boolean emc(m mVar, int i, int i3) {
        SparseIntArray sparseIntArray = emc;
        sparseIntArray.put(this.ee, sparseIntArray.get(this.ee) + 1);
        this.qh = TTAdConstant.MATE_VALID;
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.removeCallbacks(this.vw);
        }
        boolean z6 = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i3 == 1 || i3 == 700 || i3 == 800) {
            z6 = true;
        }
        if (z6) {
            a();
        }
        if (!this.cuf.get()) {
            return true;
        }
        this.cuf.set(false);
        com.bykv.vk.openvk.emc.emc.emc.xq.a aVar = new com.bykv.vk.openvk.emc.emc.emc.xq.a(i, i3);
        for (WeakReference<J1.a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc(this, aVar);
            }
        }
        return true;
    }

    @Override // V1.l
    public void emc(m mVar) {
        this.qh = 209;
        emc.delete(this.ee);
        sf sfVar = this.vk;
        if (sfVar != null) {
            sfVar.removeCallbacks(this.vw);
        }
        for (WeakReference<J1.a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc(this);
            }
        }
    }

    @Override // V1.i
    public void emc(m mVar, int i, int i3, int i6, int i7) {
        for (WeakReference<J1.a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().emc((J1.b) this, i, i3);
            }
        }
    }

    public void emc(J1.a aVar) {
        if (aVar == null) {
            return;
        }
        for (WeakReference<J1.a> weakReference : this.xq) {
            if (weakReference != null && weakReference.get() == aVar) {
                return;
            }
        }
        this.xq.add(new WeakReference<>(aVar));
    }

    public void emc(int i) {
        if (msw()) {
            return;
        }
        this.lt = i;
    }

    public boolean emc(float f2) {
        PlaybackParams playbackParams;
        if (f2 <= 0.0f) {
            return false;
        }
        try {
            if (this.ru == null || !xq()) {
                return false;
            }
            try {
                playbackParams = ((o) this.ru).i.getPlaybackParams();
            } catch (Throwable th) {
                ul.xq("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParams = null;
            }
            if ((playbackParams != null ? playbackParams.getSpeed() : 0.0f) == f2) {
                return true;
            }
            MediaPlayer mediaPlayer = ((o) this.ru).i;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f2));
            return true;
        } catch (Throwable th2) {
            ul.emc("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }
}
