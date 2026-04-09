package d9;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.component.pno.ouw.ouw;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.mwh.yu.lh;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class o implements v8.c, a, b, c, d, e, f, g, jae.ouw {

    /* renamed from: jg, reason: collision with root package name */
    private static final SparseIntArray f22080jg = new SparseIntArray();
    public boolean fkw;
    private ArrayList<Runnable> jae;
    private final Runnable jvy;
    private boolean ksc;
    public boolean mwh;

    /* renamed from: od, reason: collision with root package name */
    private int f22085od;
    private volatile boolean osn;
    public SurfaceTexture ouw;
    private boolean rrs;
    private boolean uq;
    public SurfaceHolder vt;
    private final n zih;
    private boolean zin;
    private final boolean ko = false;
    private final List<WeakReference<v8.b>> rn = new CopyOnWriteArrayList();

    /* renamed from: lh, reason: collision with root package name */
    public int f22084lh = 0;
    public int yu = 3;
    private boolean vm = false;

    /* renamed from: th, reason: collision with root package name */
    private volatile h f22087th = null;
    private boolean qbp = false;

    /* renamed from: le, reason: collision with root package name */
    public volatile int f22083le = 201;
    private long vpp = -1;
    public boolean pno = false;
    public long bly = 0;
    private long jqy = Long.MIN_VALUE;
    public long tlj = 0;
    private long ex = 0;
    private long tc = 0;

    /* renamed from: cd, reason: collision with root package name */
    private String f22081cd = "0";

    /* renamed from: pd, reason: collision with root package name */
    private com.bykv.vk.openvk.ouw.ouw.ouw.lh.a f22086pd = null;
    private boolean fvf = false;
    private CountDownLatch bs = new CountDownLatch(1);
    private volatile int fak = TTAdConstant.MATE_VALID;

    /* renamed from: cf, reason: collision with root package name */
    public AtomicBoolean f22082cf = new AtomicBoolean(false);
    private Surface uoy = null;
    private long ey = 0;
    public long ryl = 0;
    public jae ra = ouw.ouw().ouw(this, "csj_".concat("SSMediaPlayerWrapper"));

    public o() {
        lh lhVar = (lh) this;
        this.zih = new n(lhVar);
        this.f22085od = 0;
        this.rrs = false;
        this.jvy = new b5.o(9, lhVar);
        this.f22085od = 0;
        this.rrs = true;
        g();
    }

    public static /* synthetic */ boolean bly(o oVar) {
        oVar.qbp = false;
        return false;
    }

    public static /* synthetic */ boolean ryl(o oVar) {
        oVar.osn = false;
        return false;
    }

    public final void a() {
        ArrayList<Runnable> arrayList = this.jae;
        boolean z3 = arrayList == null || arrayList.isEmpty();
        pk.a.p("isPendingAction:".concat(String.valueOf(z3)));
        if (z3 || this.zin) {
            return;
        }
        this.zin = true;
        ArrayList arrayList2 = new ArrayList(this.jae);
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((Runnable) obj).run();
        }
        this.jae.clear();
        this.zin = false;
    }

    public final void b(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        pk.a.p("setDataSource：paly net:" + aVar.pno());
        k kVar = (k) this.f22087th;
        synchronized (kVar) {
            e9.a aVar2 = new e9.a(v8.a.f35974a, aVar);
            e9.a.f22461e.put(aVar.bly(), aVar2);
            kVar.f22068k = aVar2;
            g9.a.a(aVar);
            kVar.f22067i.setDataSource(kVar.f22068k);
        }
        pk.a.p("setDataSource: MediaDataSource url" + aVar.pno());
    }

    public final void c(File file) {
        pk.a.p("setDataSource: try play local:" + file.getAbsolutePath());
        try {
            if (!v8.a.f35976c) {
                ((k) this.f22087th).c(file.getAbsolutePath());
            } else {
                FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
                ((k) this.f22087th).f22067i.setDataSource(fileInputStream.getFD());
                fileInputStream.close();
            }
        } catch (Throwable unused) {
        }
    }

    public final void d(int i4) {
        if (i4 == 701) {
            this.ey = SystemClock.elapsedRealtime();
            this.f22084lh++;
            for (WeakReference<v8.b> weakReference : this.rn) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ouw(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            pk.a.y("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f22084lh));
            return;
        }
        if (i4 == 702) {
            if (this.ey > 0) {
                this.ryl = (SystemClock.elapsedRealtime() - this.ey) + this.ryl;
                this.ey = 0L;
            }
            for (WeakReference<v8.b> weakReference2 : this.rn) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().ouw((v8.c) this, Integer.MAX_VALUE);
                }
            }
            pk.a.y("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f22084lh), " mBufferTotalTime = ", Long.valueOf(this.ryl));
            return;
        }
        if (!this.rrs || i4 != 3) {
            if (i4 == 805) {
                this.mwh = true;
                return;
            }
            return;
        }
        pk.a.x("CSJ_VIDEO_MEDIA", "hasPendingPauseCommand:" + this.osn);
        a();
        i();
        vt(this.fvf);
        pk.a.x("CSJ_VIDEO_MEDIA", "onRenderStart");
    }

    public final void e(long j) {
        n nVar = this.zih;
        nVar.f22077a = j;
        if (this.uq) {
            ouw(nVar);
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar = this.f22086pd;
        if (aVar == null || !aVar.ryl) {
            h(nVar);
        } else {
            ouw(nVar);
        }
    }

    public final void f() {
        jae jaeVar = this.ra;
        if (jaeVar == null || jaeVar.getLooper() == null) {
            return;
        }
        try {
            this.ra.post(new l(this, 5));
        } catch (Throwable th2) {
            pk.a.q("onDestroy error: ", th2);
        }
    }

    public final void g() {
        StringBuilder sb2 = new StringBuilder("initMediaPlayer: ");
        sb2.append(this.ra != null);
        pk.a.p(sb2.toString());
        jae jaeVar = this.ra;
        if (jaeVar != null) {
            jaeVar.post(new l(this, 0));
        }
    }

    public final void h(Runnable runnable) {
        try {
            pk.a.p("enqueueAction()");
            if (this.jae == null) {
                this.jae = new ArrayList<>();
            }
            this.jae.add(runnable);
        } catch (Throwable th2) {
            pk.a.m("CSJ_VIDEO_MEDIA", th2.getMessage());
        }
    }

    public final void i() {
        this.vm = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.tc;
        for (WeakReference<v8.b> weakReference : this.rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw(this, jElapsedRealtime);
            }
        }
    }

    public final void jg() {
        if (this.fkw) {
            return;
        }
        this.fkw = true;
        ArrayList<Runnable> arrayList = this.jae;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.jae.clear();
        }
        jae jaeVar = this.ra;
        if (jaeVar != null) {
            try {
                jaeVar.removeCallbacksAndMessages(null);
                if (this.f22087th != null) {
                    this.ra.sendEmptyMessage(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT);
                }
            } catch (Throwable th2) {
                try {
                    pk.a.q("release error: ", th2);
                } finally {
                    f();
                }
            }
        }
    }

    public long ko() {
        long j = this.ex;
        long duration = 0;
        if (j != 0) {
            return j;
        }
        if (this.f22083le == 206 || this.f22083le == 207) {
            try {
                k kVar = (k) this.f22087th;
                kVar.getClass();
                try {
                    duration = kVar.f22067i.getDuration();
                } catch (Throwable th2) {
                    pk.a.n("CSJ_VIDEO", "getDuration error: ", th2);
                }
                this.ex = duration;
            } catch (Throwable unused) {
            }
        }
        return this.ex;
    }

    public long rn() {
        if (this.fkw) {
            return 0L;
        }
        if (this.f22083le != 206 && this.f22083le != 207) {
            return 0L;
        }
        try {
            ((k) this.f22087th).getClass();
            try {
                return r0.f22067i.getCurrentPosition();
            } catch (Throwable th2) {
                pk.a.n("CSJ_VIDEO", "getCurrentPosition error: ", th2);
                return 0L;
            }
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final void zih() {
        if (this.fkw) {
            return;
        }
        this.fak = 500;
    }

    @Override // d9.f
    public final void bly() {
        this.f22083le = 209;
        f22080jg.delete(this.f22085od);
        jae jaeVar = this.ra;
        if (jaeVar != null) {
            jaeVar.removeCallbacks(this.jvy);
        }
        for (WeakReference<v8.b> weakReference : this.rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw(this);
            }
        }
    }

    @Override // d9.b
    public final void cf() {
        for (WeakReference<v8.b> weakReference : this.rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw((v8.c) this, true);
            }
        }
    }

    @Override // v8.c
    public final int fkw() {
        MediaPlayer mediaPlayer;
        if (this.f22087th == null || this.fkw || (mediaPlayer = ((k) this.f22087th).f22067i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoHeight();
    }

    @Override // v8.c
    public final boolean le() {
        jae jaeVar;
        return (this.f22083le == 206 || ((jaeVar = this.ra) != null && jaeVar.hasMessages(100))) && !this.osn;
    }

    public final void mwh() {
        jae jaeVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2;
        pk.a.x("CSJ_VIDEO_MEDIA", "pause: from outer");
        if (this.fkw || (jaeVar = this.ra) == null) {
            return;
        }
        jaeVar.removeMessages(100);
        this.osn = true;
        if (this.rrs) {
            if (!this.vm && ((aVar = this.f22086pd) == null || !aVar.ryl)) {
                h(new l(this, 3));
                return;
            }
            jae jaeVar2 = this.ra;
            if (jaeVar2 != null) {
                jaeVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.ksc && ((aVar2 = this.f22086pd) == null || !aVar2.ryl)) {
            h(new l(this, 2));
            return;
        }
        jae jaeVar3 = this.ra;
        if (jaeVar3 != null) {
            jaeVar3.sendEmptyMessage(101);
        }
    }

    @Override // v8.c
    public final boolean pno() {
        return this.fkw;
    }

    @Override // v8.c
    public final boolean ra() {
        jae jaeVar;
        return ((this.f22083le != 207 && !this.osn) || (jaeVar = this.ra) == null || jaeVar.hasMessages(100)) ? false : true;
    }

    public final void ryl() {
        if (this.fkw) {
            return;
        }
        pk.a.p("[video] MediaPlayerProxy#restart:" + this.f22083le);
        if (this.f22087th == null) {
            return;
        }
        this.f22082cf.set(true);
        if (this.f22083le != 206) {
            this.bly = 0L;
            this.f22084lh = 0;
            this.tlj = 0L;
            this.pno = false;
            this.jqy = Long.MIN_VALUE;
            this.osn = false;
            this.zih.f22078b = true;
            e(0L);
            jae jaeVar = this.ra;
            if (jaeVar != null) {
                jaeVar.removeCallbacks(this.jvy);
                this.ra.postDelayed(this.jvy, this.fak);
            }
        }
        pk.a.p("start:end");
        this.bs.countDown();
    }

    @Override // d9.a
    public final void tlj() {
        if (this.fkw) {
            return;
        }
        this.f22083le = 205;
        try {
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar = this.f22086pd;
            if (aVar != null) {
                float fRa = aVar.ra();
                if (fRa > 0.0f) {
                    MediaPlayer mediaPlayer = ((k) this.f22087th).f22067i;
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(fRa));
                }
            }
        } catch (Throwable th2) {
            pk.a.q("speed error: ", th2);
        }
        if (this.ra != null) {
            if (this.osn) {
                jae jaeVar = this.ra;
                if (jaeVar != null) {
                    jaeVar.post(new l(this, 6));
                }
            } else {
                pk.a.m("CSJ_VIDEO_MEDIA", "onPrepared op_Start");
                jae jaeVar2 = this.ra;
                jaeVar2.sendMessage(jaeVar2.obtainMessage(100, -1, -1));
            }
        }
        f22080jg.delete(this.f22085od);
        pk.a.m("CSJ_VIDEO_MEDIA", "onPrepared:" + this.rrs + " " + this.ksc);
        if (!this.rrs && !this.ksc) {
            i();
            this.ksc = true;
        }
        for (WeakReference<v8.b> weakReference : this.rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().vt(this);
            }
        }
    }

    @Override // v8.c
    public final boolean lh() {
        return this.f22083le == 205 || le() || ra();
    }

    @Override // v8.c
    public final int yu() {
        MediaPlayer mediaPlayer;
        if (this.f22087th == null || this.fkw || (mediaPlayer = ((k) this.f22087th).f22067i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoWidth();
    }

    @Override // v8.c
    public final boolean vt() {
        return this.f22083le == 209;
    }

    @Override // d9.e
    public final void vt(int i4, int i10) {
        for (WeakReference<v8.b> weakReference : this.rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw((v8.c) this, i4, i10);
            }
        }
    }

    public final void ouw(boolean z3, long j, boolean z10) {
        StringBuilder sb2 = new StringBuilder("[video] MediaPlayerProxy#start firstSeekToPosition=");
        sb2.append(j);
        sb2.append(",isFirst :");
        sb2.append(z3);
        sb2.append(",isPauseOtherMusicVolume=");
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(this.f22083le);
        sb2.append(" ");
        sb2.append(this.f22087th == null);
        pk.a.p(sb2.toString());
        if (this.fkw) {
            return;
        }
        g();
        this.fvf = z10;
        this.f22082cf.set(true);
        this.osn = false;
        vt(z10);
        if (z3) {
            pk.a.p("[video] first start , SSMediaPlayer  start method !");
            this.vpp = j;
            pk.a.p("[video] MediaPlayerProxy#start first play prepare invoke !");
            ouw(new l(this, 4));
        } else {
            e(j);
        }
        jae jaeVar = this.ra;
        if (jaeVar != null) {
            jaeVar.removeCallbacks(this.jvy);
            this.ra.postDelayed(this.jvy, this.fak);
        }
        pk.a.p("start:end");
        this.bs.countDown();
    }

    public final void vt(boolean z3) {
        if (this.fkw) {
            return;
        }
        jae jaeVar = this.ra;
        if (jaeVar == null) {
            pk.a.x("CSJ_VIDEO_MEDIA", "quietPlay set opHandler is null");
        } else {
            jaeVar.post(new m(this, z3, 0));
        }
    }

    @Override // v8.c
    public final boolean ouw() {
        return this.vm;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4 A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #6 {all -> 0x0148, blocks: (B:65:0x0163, B:67:0x0171, B:68:0x0175, B:73:0x0180, B:75:0x01a3, B:77:0x01a9, B:79:0x01b0, B:80:0x01b4), top: B:246:0x0163 }] */
    @Override // com.bytedance.sdk.component.utils.jae.ouw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(android.os.Message r18) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.o.ouw(android.os.Message):void");
    }

    @Override // d9.d
    public final void ouw(h hVar, int i4) {
        if (this.f22087th != hVar) {
            return;
        }
        for (WeakReference<v8.b> weakReference : this.rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().vt(this, i4);
            }
        }
    }

    @Override // d9.c
    public final boolean ouw(int i4, int i10) {
        pk.a.m("CSJ_VIDEO_MEDIA", "what=" + i4 + "extra=" + i10);
        SparseIntArray sparseIntArray = f22080jg;
        sparseIntArray.put(this.f22085od, sparseIntArray.get(this.f22085od) + 1);
        this.f22083le = TTAdConstant.MATE_VALID;
        jae jaeVar = this.ra;
        if (jaeVar != null) {
            jaeVar.removeCallbacks(this.jvy);
        }
        pk.a.p("OnError - Error code: " + i4 + " Extra code: " + i10);
        boolean z3 = i4 == -1010 || i4 == -1007 || i4 == -1004 || i4 == -110 || i4 == 100 || i4 == 200;
        if (i10 == 1 || i10 == 700 || i10 == 800) {
            z3 = true;
        }
        if (z3) {
            f();
        }
        if (this.f22082cf.get()) {
            this.f22082cf.set(false);
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.b(i4, i10);
            for (WeakReference<v8.b> weakReference : this.rn) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ouw(this, bVar);
                }
            }
        }
        return true;
    }

    @Override // d9.g
    public final boolean ouw(h hVar, int i4, int i10) {
        pk.a.m("CSJ_VIDEO_MEDIA", "what,extra:" + i4 + "," + i10);
        if (this.f22087th != hVar) {
            return false;
        }
        if (i10 == -1004) {
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.b(i4, i10);
            for (WeakReference<v8.b> weakReference : this.rn) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ouw(this, bVar);
                }
            }
        }
        d(i4);
        return false;
    }

    public void ouw(v8.b bVar) {
        if (bVar == null) {
            return;
        }
        for (WeakReference<v8.b> weakReference : this.rn) {
            if (weakReference != null && weakReference.get() == bVar) {
                return;
            }
        }
        this.rn.add(new WeakReference<>(bVar));
    }

    public final boolean ouw(float f10) {
        PlaybackParams playbackParams;
        if (f10 <= 0.0f) {
            return false;
        }
        try {
            if (this.f22087th == null || !lh()) {
                return false;
            }
            try {
                playbackParams = ((k) this.f22087th).f22067i.getPlaybackParams();
            } catch (Throwable th2) {
                qbp.lh("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th2.getMessage());
                playbackParams = null;
            }
            if ((playbackParams != null ? playbackParams.getSpeed() : 0.0f) == f10) {
                return true;
            }
            MediaPlayer mediaPlayer = ((k) this.f22087th).f22067i;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
            return true;
        } catch (Throwable th3) {
            qbp.ouw("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th3);
            return false;
        }
    }

    public final void ouw(boolean z3) {
        if (this.fkw) {
            return;
        }
        this.uq = z3;
        if (this.f22087th != null) {
            ((i) this.f22087th).f22065h = z3;
            return;
        }
        jae jaeVar = this.ra;
        if (jaeVar != null) {
            jaeVar.post(new m(this, z3, 1));
        }
    }

    public final void ouw(SurfaceTexture surfaceTexture) {
        if (this.fkw) {
            return;
        }
        this.ouw = surfaceTexture;
        ouw(true);
        ouw(new vd.a(this, false, surfaceTexture, 9));
    }

    public final void ouw(SurfaceHolder surfaceHolder) {
        if (this.fkw) {
            return;
        }
        this.vt = surfaceHolder;
        ouw(true);
        ouw(new vd.a(this, false, surfaceHolder, 10));
    }

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        if (this.fkw) {
            return;
        }
        this.f22086pd = aVar;
        if (aVar != null) {
            this.rrs = this.rrs && !aVar.ryl;
        }
        ouw(new vd.a(this, false, aVar, 11));
    }

    public final void ouw(Runnable runnable) {
        boolean z3;
        if (runnable == null || (z3 = this.fkw)) {
            return;
        }
        if (!z3) {
            runnable.run();
        } else {
            h(runnable);
        }
    }

    public static /* synthetic */ void ouw(o oVar, long j, long j8) {
        o oVar2;
        long j9;
        long j10;
        for (WeakReference<v8.b> weakReference : oVar.rn) {
            if (weakReference == null || weakReference.get() == null) {
                oVar2 = oVar;
                j9 = j;
                j10 = j8;
            } else {
                oVar2 = oVar;
                j9 = j;
                j10 = j8;
                weakReference.get().ouw(oVar2, j9, j10);
            }
            oVar = oVar2;
            j = j9;
            j8 = j10;
        }
    }
}
