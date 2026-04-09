package com.bytedance.sdk.openadsdk.core.mwh.ouw;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import b9.b;
import b9.c;
import b9.e;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.fkw;
import com.bytedance.sdk.openadsdk.core.mwh.yu.lh;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.ryl.le;
import com.bytedance.sdk.openadsdk.core.widget.qbp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.vm.yu;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.google.android.gms.internal.ads.sz;
import d9.l;
import i9.a;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import x8.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw implements e, jae.ouw, com.bytedance.sdk.openadsdk.core.mwh.vt.ouw {
    public long bs;

    /* renamed from: cd, reason: collision with root package name */
    public le f8333cd;

    /* renamed from: cf, reason: collision with root package name */
    protected final Context f8334cf;
    public vt ex;
    protected SurfaceTexture fkw;
    protected WeakReference<c> jae;
    public final ViewGroup ksc;

    /* renamed from: le, reason: collision with root package name */
    public lh f8336le;

    /* renamed from: od, reason: collision with root package name */
    public b f8338od;

    /* renamed from: pd, reason: collision with root package name */
    protected long f8339pd;
    public final vpp pno;
    public fkw ra;
    public boolean rn;
    private long rrs;
    public boolean tc;
    protected boolean uq;
    public boolean vpp;
    protected SurfaceHolder yu;
    public String ouw = "TTAD.VideoController";
    protected final int vt = 100;

    /* renamed from: lh, reason: collision with root package name */
    public final jae f8337lh = new jae(Looper.getMainLooper(), this);
    public long bly = 0;
    public long tlj = 0;
    protected final List<Runnable> ryl = new ArrayList();
    protected boolean mwh = false;

    /* renamed from: jg, reason: collision with root package name */
    public boolean f8335jg = false;
    public boolean ko = true;
    public boolean zih = false;
    protected boolean vm = false;

    /* renamed from: th, reason: collision with root package name */
    public boolean f8340th = false;
    public AtomicBoolean qbp = new AtomicBoolean(false);
    public AtomicBoolean zin = new AtomicBoolean(false);
    protected boolean jqy = true;
    protected boolean fvf = false;
    protected Runnable fak = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.1
        @Override // java.lang.Runnable
        public final void run() {
            ouw ouwVar = ouw.this;
            ko.vt(ouwVar.ouw, "resumeVideo: run ", Boolean.valueOf(ouwVar.mwh));
            ouw.this.cd();
        }
    };
    public long uoy = 0;
    public boolean osn = true;
    public int ey = 1;
    private final AtomicBoolean jvy = new AtomicBoolean(false);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[qbp.ouw.values().length];
            ouw = iArr;
            try {
                iArr[qbp.ouw.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[qbp.ouw.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[qbp.ouw.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ouw(Context context, vpp vppVar, ViewGroup viewGroup) {
        this.pno = vppVar;
        this.f8334cf = context;
        this.ksc = viewGroup;
        this.ouw += hashCode();
    }

    private void ey() throws JSONException {
        this.fvf = true;
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.ouw(this.bly);
        ouwVar.vt(th() / this.ey);
        ouwVar.vt = zih();
        ouwVar.f8763le = this.f8339pd;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.ra, ouwVar);
    }

    private void ksc() {
        com.bytedance.sdk.component.utils.ko.lh(this.ouw, "execPendingActions: before ");
        if (this.ryl.isEmpty()) {
            return;
        }
        com.bytedance.sdk.component.utils.ko.lh(this.ouw, "execPendingActions:  exec");
        ArrayList arrayList = new ArrayList(this.ryl);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Runnable) obj).run();
        }
        this.ryl.clear();
    }

    @Override // b9.e
    public abstract /* synthetic */ void bly();

    public final void bs() {
        if (vpp.le(this.pno) && this.zin.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.vm.lh.vt(new yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.5
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    try {
                        ouwVar.f8751lh = "video_player";
                        ouwVar.pno = uoy.ouw(ouw.this.pno);
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                    } catch (Throwable unused) {
                    }
                    return ouwVar;
                }
            });
        }
    }

    public final void cd() {
        this.f8337lh.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                ouw ouwVar = ouw.this;
                if (ouwVar.f8336le != null) {
                    int i4 = 1;
                    com.bytedance.sdk.component.utils.ko.vt(ouwVar.ouw, "resumeVideo: execResumePlay", Boolean.valueOf(ouwVar.mwh));
                    lh lhVar = ouw.this.f8336le;
                    if (lhVar.fkw || lhVar.ra == null) {
                        return;
                    }
                    lhVar.f22082cf.set(true);
                    lhVar.ra.post(new l(lhVar, i4));
                }
            }
        });
    }

    @Override // b9.e
    public final void cf() {
        lh lhVar = this.f8336le;
        if (lhVar != null) {
            lhVar.mwh();
        }
        if (this.vpp || !this.qbp.get()) {
            return;
        }
        ey();
    }

    @Override // b9.e
    public final boolean ex() {
        return this.tc;
    }

    public final void fak() throws JSONException {
        this.fvf = true;
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.ouw(this.bly);
        ouwVar.vt(th() / this.ey);
        ouwVar.vt = zih();
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.ra, ouwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void fkw() {
        if (!this.f8340th) {
            jg();
            return;
        }
        this.f8340th = false;
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.vt(this.ksc);
        }
        lh(1);
    }

    public final boolean fvf() {
        lh lhVar = this.f8336le;
        return lhVar != null && lhVar.le();
    }

    public final long jae() {
        return this.f8339pd;
    }

    public abstract /* synthetic */ void jg();

    @Override // b9.e
    public final boolean jqy() {
        return this.f8335jg;
    }

    @Override // b9.e
    public abstract /* synthetic */ void ko();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw, b9.f
    public final void le() {
        pd();
    }

    public final void lh(boolean z3) {
        this.jqy = z3;
    }

    @Override // b9.e
    public abstract /* synthetic */ void mwh();

    public final void od() {
        lh lhVar = this.f8336le;
        if (lhVar == null) {
            return;
        }
        fkw fkwVar = this.ra;
        if (fkwVar != null ? fkwVar.f8344le instanceof g : false) {
            SurfaceTexture surfaceTexture = this.fkw;
            if (surfaceTexture == null || surfaceTexture == lhVar.ouw) {
                return;
            }
            lhVar.ouw(surfaceTexture);
            return;
        }
        SurfaceHolder surfaceHolder = this.yu;
        if (surfaceHolder == null || surfaceHolder == lhVar.vt) {
            return;
        }
        lhVar.ouw(surfaceHolder);
    }

    public final void osn() {
        ArrayList arrayList;
        vpp vppVar = this.pno;
        List<String> list = vppVar.ksc;
        String strOuw = ryl.ouw(zih.ouw());
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.contains("{TS}") || next.contains("__TS__")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
                }
                if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strOuw)) {
                    next = next.replace("{UID}", strOuw).replace("__UID__", strOuw);
                }
                if (next.contains("__CID__") && vppVar != null && !TextUtils.isEmpty(vppVar.pv)) {
                    next = next.replace("__CID__", vppVar.pv);
                }
                if (next.contains("__CTYPE__") && vppVar != null) {
                    int i4 = vppVar.ucs;
                    int i10 = 2;
                    if (i4 != 2) {
                        i10 = 3;
                        if (i4 != 3) {
                            i10 = 4;
                            if (i4 != 4) {
                                i10 = (i4 == 5 || i4 == 15) ? 5 : -1;
                            }
                        }
                    }
                    next = next.replace("__CTYPE__", String.valueOf(i10));
                }
                if (next.contains("__GAID__")) {
                    next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
                }
                if (next.contains("__OS__")) {
                    next = next.replace("__OS__", "0");
                }
                if (next.contains("__UA1__")) {
                    next = next.replace("__UA1__", URLEncoder.encode(uoy.fkw()));
                }
                arrayList2.add(com.bytedance.sdk.openadsdk.tc.ouw.ouw(next));
            }
            arrayList = arrayList2;
        }
        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(arrayList, 5, this.pno.pv);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public abstract /* synthetic */ void ouw();

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void pno() {
        this.mwh = false;
        com.bytedance.sdk.component.utils.ko.lh(this.ouw, "surfaceTextureDestroyed: ");
        lh lhVar = this.f8336le;
        if (lhVar != null) {
            lhVar.ouw(false);
        }
        this.fkw = null;
        ksc();
    }

    @Override // b9.e
    public final int qbp() {
        return a.a(this.tlj, this.bs);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ra() {
        this.mwh = false;
        this.yu = null;
        lh lhVar = this.f8336le;
        if (lhVar != null) {
            lhVar.ouw(false);
        }
    }

    @Override // b9.e
    public final long rn() {
        return this.bly;
    }

    @Override // b9.e
    public abstract /* synthetic */ void ryl();

    @Override // b9.e
    public final boolean tc() {
        return true;
    }

    @Override // b9.e
    public final long th() {
        lh lhVar = this.f8336le;
        if (lhVar == null) {
            return 0L;
        }
        return lhVar.ko();
    }

    @Override // b9.e
    public final void tlj() {
        this.uq = true;
    }

    public final void uoy() throws JSONException {
        this.fvf = true;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.pno, this.ra, this.ex);
    }

    public boolean uq() {
        return this.osn;
    }

    @Override // b9.e
    public final int vm() {
        lh lhVar = this.f8336le;
        if (lhVar == null) {
            return 0;
        }
        return lhVar.f22084lh;
    }

    @Override // b9.e
    public final /* bridge */ /* synthetic */ b9.g vpp() {
        return this.ra;
    }

    public final void vt(long j) {
        this.bly = j;
        this.tlj = Math.max(this.tlj, j);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void yu() {
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.cf();
        }
        jg();
    }

    @Override // b9.e
    public final long zih() {
        lh lhVar = this.f8336le;
        if (lhVar == null) {
            return 0L;
        }
        if (lhVar.pno) {
            long j = lhVar.tlj;
            if (j > 0) {
                return lhVar.bly + j;
            }
        }
        return lhVar.bly;
    }

    @Override // b9.e
    public final v8.c zin() {
        return this.f8336le;
    }

    public final void lh(int i4) {
        Context context = this.f8334cf;
        if (context == null) {
            return;
        }
        boolean z3 = i4 == 0 || i4 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i4);
            } catch (Throwable unused) {
            }
            if (z3) {
                activity.getWindow().clearFlags(Segment.SHARE_MINIMUM);
            } else {
                activity.getWindow().setFlags(Segment.SHARE_MINIMUM, Segment.SHARE_MINIMUM);
            }
        }
    }

    @Override // b9.e
    public boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        if (!vpp.le(this.pno)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.vm.lh.ouw(new yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.2
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                try {
                    ouwVar.f8751lh = "video_player";
                    ouwVar.pno = uoy.ouw(ouw.this.pno);
                    ouwVar.vt = BuildConfig.VERSION_NAME;
                } catch (Throwable unused) {
                }
                return ouwVar;
            }
        });
        return false;
    }

    public final void vt(Runnable runnable) {
        this.ryl.add(runnable);
    }

    public final void ouw(Runnable runnable) {
        if (this.ra.ex && this.mwh) {
            runnable.run();
        } else {
            vt(runnable);
        }
    }

    public final void vt(boolean z3) {
        this.ko = z3;
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.fkw(z3);
        }
    }

    public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        vt vtVar = (vt) aVar;
        this.ex = vtVar;
        this.rn = vtVar.f6564cf;
        aVar.f6565jg = String.valueOf(this.pno.fqk());
    }

    public final void lh(long j) {
        this.bly = j;
        this.tlj = Math.max(this.tlj, j);
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.ouw();
        }
        lh lhVar = this.f8336le;
        if (lhVar != null) {
            lhVar.ouw(true, this.bly, this.rn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ouw(SurfaceHolder surfaceHolder) {
        this.mwh = true;
        this.yu = surfaceHolder;
        lh lhVar = this.f8336le;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(surfaceHolder);
        com.bytedance.sdk.component.utils.ko.lh(this.ouw, "surfaceCreated: ");
        ksc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void vt(int i4) {
        if (this.f8334cf == null) {
            return;
        }
        long j = (long) (((i4 * r2) * 1.0f) / 100.0f);
        if (this.bs > 0) {
            this.rrs = (int) j;
        } else {
            this.rrs = 0L;
        }
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.ouw(this.rrs);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void lh() {
        boolean z3 = this.f8340th;
        this.f8340th = !z3;
        Context context = this.f8334cf;
        if (context != null) {
            if (!(context instanceof Activity)) {
                com.bytedance.sdk.component.utils.ko.vt(this.ouw, "context is not activity, not support this function.");
                return;
            }
            if (!z3) {
                lh(0);
                fkw fkwVar = this.ra;
                if (fkwVar != null) {
                    fkwVar.ouw(this.ksc);
                    this.ra.yu(false);
                }
            } else {
                lh(1);
                fkw fkwVar2 = this.ra;
                if (fkwVar2 != null) {
                    fkwVar2.vt(this.ksc);
                    this.ra.yu(false);
                }
            }
            WeakReference<c> weakReference = this.jae;
            c cVar = weakReference != null ? weakReference.get() : null;
            if (cVar != null) {
                cVar.ouw(this.f8340th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ouw(SurfaceTexture surfaceTexture) {
        this.mwh = true;
        this.fkw = surfaceTexture;
        lh lhVar = this.f8336le;
        if (lhVar != null) {
            lhVar.ouw(surfaceTexture);
            this.f8336le.ouw(this.mwh);
        }
        com.bytedance.sdk.component.utils.ko.lh(this.ouw, "surfaceTextureCreated: ");
        ksc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void vt() {
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.pno();
        }
    }

    public final void vt(ra raVar) throws JSONException {
        this.fvf = true;
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.ouw(this.bly);
        ouwVar.vt(th() / this.ey);
        ouwVar.vt = zih();
        ouwVar.ryl = vm();
        ouwVar.f8763le = this.f8339pd;
        ouwVar.fkw = this.uq;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.ra, ouwVar, raVar);
    }

    @Override // b9.e
    public final void ouw(final boolean z3, String str) {
        this.rn = z3;
        lh lhVar = this.f8336le;
        if (lhVar != null) {
            lhVar.vt(z3);
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.ra, z3, str);
        }
        if (this.f8333cd != null) {
            if (nh.a.o()) {
                this.f8333cd.ouw(z3);
            } else {
                this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.f8333cd.ouw(z3);
                    }
                });
            }
        }
    }

    public void pd() {
    }

    public final void ouw(c cVar) {
        this.jae = new WeakReference<>(cVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ouw(boolean z3) {
        lh lhVar;
        if (this.ko) {
            cf();
        }
        if (!this.ko && (lhVar = this.f8336le) != null && !lhVar.vt()) {
            this.ra.le(!fvf());
            this.ra.vt(z3);
        }
        lh lhVar2 = this.f8336le;
        if (lhVar2 != null && lhVar2.le()) {
            this.ra.pno();
            this.ra.ra();
        } else {
            this.ra.pno();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ouw(int i4) {
        fkw fkwVar;
        if (this.f8336le == null) {
            return;
        }
        long j = this.rrs;
        boolean zVt = this.ra.vt(i4);
        if (this.f8336le != null) {
            if (zVt && (fkwVar = this.ra) != null) {
                fkwVar.yu(0);
                this.ra.lh(false);
                this.ra.yu(false);
                this.ra.ra();
                this.ra.tlj();
            }
            lh lhVar = this.f8336le;
            if (lhVar.fkw) {
                return;
            }
            if (lhVar.f22083le == 207 || lhVar.f22083le == 206 || lhVar.f22083le == 209) {
                lhVar.ouw(new sz(lhVar, j, 1));
            }
        }
    }

    public final void ouw(ra raVar) throws JSONException {
        boolean z3 = false;
        if (this.qbp.compareAndSet(false, true)) {
            this.fvf = true;
            final le leVar = this.f8333cd;
            if (leVar != null) {
                final long jTh = th();
                final boolean z10 = this.rn;
                if (nh.a.o()) {
                    leVar.ouw(jTh, z10);
                } else {
                    bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.9
                        final /* synthetic */ long ouw;
                        final /* synthetic */ boolean vt;

                        public AnonymousClass9(final long jTh2, final boolean z102) {
                            j = jTh2;
                            z = z102;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            le.this.ouw(j, z);
                        }
                    });
                }
            }
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.ra = uq();
            ouwVar.vt(th());
            lh lhVar = this.f8336le;
            if (lhVar != null && lhVar.mwh) {
                z3 = true;
            }
            ouwVar.yu = z3;
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(zih.ouw(), this.ra, ouwVar, raVar);
        }
    }

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar) throws JSONException {
        this.fvf = true;
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.vt = zih();
        ouwVar.vt(th() / this.ey);
        ouwVar.ouw(this.bly);
        ouwVar.f8762jg = bVar;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.lh(this.ra, ouwVar);
    }

    @Override // b9.e
    public final void ouw(b bVar) {
        this.f8338od = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ouw(qbp.ouw ouwVar) {
        int i4 = AnonymousClass6.ouw[ouwVar.ordinal()];
        if (i4 == 1) {
            cf();
            return;
        }
        if (i4 == 2) {
            mwh();
        } else {
            if (i4 != 3) {
                return;
            }
            ryl();
            this.zih = false;
            this.vm = true;
        }
    }

    @Override // b9.e
    public final void ouw(long j) {
        this.f8339pd = j;
    }

    @Override // b9.e
    public final boolean ouw(float f10) {
        lh lhVar = this.f8336le;
        if (lhVar != null) {
            return lhVar.ouw(f10);
        }
        return false;
    }

    public final void ouw(long j, long j8) {
        if (!this.jvy.get() && com.bytedance.sdk.openadsdk.le.ouw.ouw().mwh && (j * 1.0d) / j8 > 0.3d) {
            this.jvy.set(true);
            if (this.pno != null) {
                com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoPercent30", this.pno);
            }
        }
    }
}
