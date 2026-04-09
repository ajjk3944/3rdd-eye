package com.bytedance.sdk.openadsdk.core.sz.emc;

import L1.c;
import L1.e;
import L1.f;
import L1.g;
import O1.b;
import R1.a;
import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.ycc;
import com.bytedance.sdk.openadsdk.core.sz.dg.xq;
import com.bytedance.sdk.openadsdk.core.sz.ypw.bw;
import com.bytedance.sdk.openadsdk.core.widget.ul;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;
import com.bytedance.sdk.openadsdk.dg.uym;
import com.bytedance.sdk.openadsdk.sba.dg;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class emc implements f, sf.emc, com.bytedance.sdk.openadsdk.core.sz.ypw.emc {
    protected SurfaceTexture bw;
    protected final ViewGroup db;
    protected SurfaceHolder dg;
    protected ycc dr;
    protected boolean ee;
    protected final Context gbl;
    protected ypw hxp;
    private long iyl;
    protected long lt;
    protected final rie msw;
    protected long rtt;
    protected WeakReference<e> sb;
    protected c sf;
    protected boolean sra;
    protected bw uym;
    protected boolean vk;
    protected boolean xmt;
    protected xq ycc;
    protected String emc = "TTAD.VideoController";
    protected final int ypw = 100;
    protected final sf xq = new sf(Looper.getMainLooper(), this);
    protected long zz = 0;
    protected long ru = 0;
    protected final List<Runnable> sup = new ArrayList();
    protected boolean sz = false;
    protected boolean qh = false;
    protected boolean cf = true;
    protected boolean aa = false;
    protected boolean sba = false;
    protected boolean yzg = false;
    protected AtomicBoolean ul = new AtomicBoolean(false);
    protected AtomicBoolean ylm = new AtomicBoolean(false);
    protected boolean rie = true;
    protected boolean cuf = false;
    protected Runnable mkp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.emc.emc.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z6 = emc.this.sz;
            emc.this.ul();
        }
    };
    private long mxo = 0;
    private boolean tp = true;
    private int vw = 1;
    private final AtomicBoolean ra = new AtomicBoolean(false);

    /* renamed from: com.bytedance.sdk.openadsdk.core.sz.emc.emc$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[ul.emc.values().length];
            emc = iArr;
            try {
                iArr[ul.emc.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[ul.emc.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[ul.emc.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public emc(Context context, rie rieVar, ViewGroup viewGroup) {
        this.msw = rieVar;
        this.gbl = context;
        this.db = viewGroup;
        this.emc += hashCode();
    }

    private void iyl() {
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.dg(0);
            this.uym.emc(false, false);
            this.uym.xq(false);
            this.uym.bw();
            this.uym.uym();
        }
    }

    private boolean vk() {
        bw bwVar = this.uym;
        if (bwVar != null) {
            return bwVar.sz() instanceof b;
        }
        return false;
    }

    public long aa() {
        return this.lt;
    }

    @Override // L1.f
    public abstract /* synthetic */ void bw();

    public void bw(boolean z6) {
        this.rie = z6;
    }

    @Override // L1.f
    public boolean cf() {
        return true;
    }

    public int cuf() {
        return this.vw;
    }

    public final boolean db() {
        xq xqVar = this.ycc;
        return xqVar == null || xqVar.ypw();
    }

    @Override // L1.f
    public abstract /* synthetic */ void dg();

    public void dg(long j6) {
        this.rtt = j6;
    }

    public final void dr() {
        this.cuf = true;
        cf.emc emcVar = new cf.emc();
        emcVar.ypw(ycc());
        emcVar.dg(zz() / cuf());
        emcVar.xq(uym());
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.ypw(sup(), emcVar);
    }

    public boolean ee() {
        return this.tp;
    }

    @Override // L1.f
    public abstract /* synthetic */ void emc();

    public abstract /* synthetic */ void emc(g gVar, View view);

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
    }

    public abstract /* synthetic */ void emc(boolean z6, int i);

    @Override // L1.f
    public J1.b gbl() {
        return this.ycc;
    }

    public boolean hxp() {
        return this.vk;
    }

    public final void lt() {
        this.cuf = true;
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.msw, this.uym, this.hxp);
    }

    public final void mkp() {
        com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(com.bytedance.sdk.openadsdk.ee.emc.emc(this.msw.wq(), true, this.msw), 5, this.msw.ye());
    }

    @Override // L1.f
    public final int msw() {
        xq xqVar = this.ycc;
        if (xqVar == null) {
            return 0;
        }
        return xqVar.vk();
    }

    @Override // L1.f
    public final boolean qh() {
        return this.ee;
    }

    public boolean rie() {
        return this.aa;
    }

    public final long rtt() {
        return uym() + ycc();
    }

    @Override // L1.f
    public final int ru() {
        return a.a(this.ru, this.rtt);
    }

    public final boolean sb() {
        xq xqVar = this.ycc;
        return xqVar != null && xqVar.ycc();
    }

    public void sba() {
        if (this.ycc == null) {
            return;
        }
        if (vk()) {
            SurfaceTexture surfaceTexture = this.bw;
            if (surfaceTexture == null || surfaceTexture == this.ycc.ul()) {
                return;
            }
            this.ycc.emc(this.bw);
            return;
        }
        SurfaceHolder surfaceHolder = this.dg;
        if (surfaceHolder == null || surfaceHolder == this.ycc.yzg()) {
            return;
        }
        this.ycc.emc(this.dg);
    }

    public final void sf() {
        if (rie.ycc(this.msw) && this.ylm.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.sba.xq.ypw(new dg() { // from class: com.bytedance.sdk.openadsdk.core.sz.emc.emc.5
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                    try {
                        emcVar.ypw("video_player");
                        emcVar.dg(tp.emc(emc.this.msw));
                        emcVar.emc(BuildConfig.VERSION_NAME);
                    } catch (Throwable unused) {
                    }
                    return emcVar;
                }
            });
        }
    }

    public boolean sra() {
        return this.cf;
    }

    @Override // L1.f
    public boolean sz() {
        return this.qh;
    }

    public void ul() {
        this.xq.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.emc.emc.3
            @Override // java.lang.Runnable
            public void run() {
                emc emcVar = emc.this;
                if (emcVar.ycc != null) {
                    boolean z6 = emcVar.sz;
                    emc.this.ycc.ru();
                }
            }
        });
    }

    @Override // L1.f
    public final long uym() {
        xq xqVar = this.ycc;
        if (xqVar == null) {
            return 0L;
        }
        return xqVar.cf();
    }

    public final void xmt() {
        this.cuf = true;
        cf.emc emcVar = new cf.emc();
        emcVar.ypw(ycc());
        emcVar.dg(zz() / cuf());
        emcVar.xq(uym());
        emcVar.emc(aa());
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.uym, emcVar);
    }

    @Override // L1.f
    public abstract /* synthetic */ void xq();

    public void xq(long j6) {
        this.mxo = j6;
    }

    @Override // L1.f
    public long ycc() {
        return this.zz;
    }

    @Override // L1.f
    /* renamed from: ylm, reason: merged with bridge method [inline-methods] */
    public final bw sup() {
        return this.uym;
    }

    public void ypw(long j6) {
        this.zz = j6;
        this.ru = Math.max(this.ru, j6);
    }

    public void yzg() {
        if (this.sup.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.sup);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        this.sup.clear();
    }

    @Override // L1.f
    public final long zz() {
        xq xqVar = this.ycc;
        if (xqVar == null) {
            return 0L;
        }
        return xqVar.aa();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc, L1.a
    public final void bw(g gVar, View view) {
        emc(gVar, view, false);
    }

    public final void dg(boolean z6) {
        this.tp = z6;
    }

    @Override // L1.f
    public boolean emc(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        if (!rie.ycc(this.msw)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.sba.xq.emc(new dg() { // from class: com.bytedance.sdk.openadsdk.core.sz.emc.emc.2
            @Override // com.bytedance.sdk.openadsdk.sba.dg
            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                try {
                    emcVar.ypw("video_player");
                    emcVar.dg(tp.emc(emc.this.msw));
                    emcVar.emc(BuildConfig.VERSION_NAME);
                } catch (Throwable unused) {
                }
                return emcVar;
            }
        });
        return false;
    }

    public void xq(boolean z6) {
        this.yzg = z6;
    }

    public final void bw(long j6) {
        this.zz = j6;
        this.ru = Math.max(this.ru, j6);
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc();
        }
        xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.emc(true, this.zz, this.vk);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public final void dg(g gVar, View view) {
        if (this.yzg) {
            xq(false);
            bw bwVar = this.uym;
            if (bwVar != null) {
                bwVar.ypw(this.db);
            }
            emc(1);
            return;
        }
        emc(true, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public final void xq(g gVar, View view) {
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.zz();
        }
        emc(true, 3);
    }

    public void ypw(Runnable runnable) {
        this.sup.add(runnable);
    }

    public void emc(Runnable runnable) {
        if (this.uym.sra() && this.sz) {
            runnable.run();
        } else {
            ypw(runnable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public void ypw(g gVar, SurfaceHolder surfaceHolder) {
        this.sz = false;
        this.dg = null;
        xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.emc(false);
        }
    }

    private boolean xq(int i) {
        return this.uym.ypw(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public void emc(g gVar, SurfaceHolder surfaceHolder) {
        this.sz = true;
        this.dg = surfaceHolder;
        xq xqVar = this.ycc;
        if (xqVar == null) {
            return;
        }
        xqVar.emc(surfaceHolder);
        yzg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public void ypw(g gVar, SurfaceTexture surfaceTexture) {
        this.sz = false;
        xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.emc(false);
        }
        this.bw = null;
        yzg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public void emc(g gVar, SurfaceTexture surfaceTexture) {
        this.sz = true;
        this.bw = surfaceTexture;
        xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.emc(surfaceTexture);
            this.ycc.emc(this.sz);
        }
        yzg();
    }

    public final void ypw(boolean z6) {
        this.qh = z6;
    }

    public void ypw(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        ypw ypwVar = (ypw) bVar;
        this.hxp = ypwVar;
        this.vk = ypwVar.gbl();
        bVar.dg(String.valueOf(this.msw.tx()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public final void ypw(g gVar, View view) {
        ypw(gVar, view, false, false);
    }

    public void emc(boolean z6) {
        this.cf = z6;
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.dg(z6);
        }
    }

    public final void ypw(g gVar, View view, boolean z6, boolean z7) {
        xq(!this.yzg);
        Context context = this.gbl;
        if (context != null && (context instanceof Activity)) {
            if (this.yzg) {
                emc(z6 ? 8 : 0);
                bw bwVar = this.uym;
                if (bwVar != null) {
                    bwVar.emc(this.db);
                    this.uym.xq(false);
                }
            } else {
                emc(1);
                bw bwVar2 = this.uym;
                if (bwVar2 != null) {
                    bwVar2.ypw(this.db);
                    this.uym.xq(false);
                }
            }
            WeakReference<e> weakReference = this.sb;
            e eVar = weakReference != null ? weakReference.get() : null;
            if (eVar != null) {
                eVar.emc(this.yzg);
            }
        }
    }

    @Override // L1.f
    public final void emc(final boolean z6, String str) {
        this.vk = z6;
        xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.ypw(z6);
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.uym, z6, str);
        }
        if (this.dr != null) {
            if (R2.a.i()) {
                this.dr.emc(z6);
            } else {
                this.xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.emc.emc.4
                    @Override // java.lang.Runnable
                    public void run() {
                        emc.this.dr.emc(z6);
                    }
                });
            }
        }
    }

    public final void emc(e eVar) {
        this.sb = new WeakReference<>(eVar);
    }

    public void emc(g gVar, View view, boolean z6) {
    }

    public final void emc(int i) {
        Context context = this.gbl;
        if (context == null) {
            return;
        }
        boolean z6 = i == 0 || i == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
            if (!z6) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public final void ypw(g gVar, int i) {
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.ycc();
        }
    }

    public final void ypw(uym uymVar) {
        this.cuf = true;
        cf.emc emcVar = new cf.emc();
        emcVar.ypw(ycc());
        emcVar.dg(zz() / cuf());
        emcVar.xq(uym());
        emcVar.dg(msw());
        emcVar.emc(aa());
        emcVar.xq(this.xmt);
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.ypw(this.uym, emcVar, uymVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public final void emc(g gVar, View view, boolean z6, boolean z7) {
        if (this.cf) {
            ypw();
        }
        if (z6 && !this.cf && !db()) {
            this.uym.ypw(!sb(), false);
            this.uym.emc(z7, true, false);
        }
        xq xqVar = this.ycc;
        if (xqVar != null && xqVar.ycc()) {
            this.uym.ycc();
            this.uym.bw();
        } else {
            this.uym.ycc();
        }
    }

    public void ypw(int i) {
        this.vw = i;
    }

    @Override // L1.f
    public final void ypw() {
        xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.gbl();
        }
        if (this.sra || !this.ul.get()) {
            return;
        }
        xmt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public final void emc(g gVar, int i, boolean z6) {
        if (this.gbl == null) {
            return;
        }
        long j6 = (long) (((i * r0) * 1.0f) / 100.0f);
        if (this.rtt > 0) {
            this.iyl = (int) j6;
        } else {
            this.iyl = 0L;
        }
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc(this.iyl);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public final void emc(g gVar, int i) {
        if (this.ycc == null) {
            return;
        }
        emc(this.iyl, xq(i));
    }

    private void emc(long j6, boolean z6) {
        if (this.ycc == null) {
            return;
        }
        if (z6) {
            iyl();
        }
        this.ycc.emc(j6);
    }

    public final void emc(uym uymVar) {
        boolean z6 = false;
        if (this.ul.compareAndSet(false, true)) {
            this.cuf = true;
            ycc yccVar = this.dr;
            if (yccVar != null) {
                yccVar.emc(zz(), hxp());
            }
            cf.emc emcVar = new cf.emc();
            emcVar.emc(ee());
            emcVar.dg(zz());
            xq xqVar = this.ycc;
            if (xqVar != null && xqVar.qh()) {
                z6 = true;
            }
            emcVar.ypw(z6);
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(aa.emc(), this.uym, emcVar, uymVar);
        }
    }

    public final void emc(com.bykv.vk.openvk.emc.emc.emc.xq.a aVar) {
        this.cuf = true;
        cf.emc emcVar = new cf.emc();
        emcVar.xq(uym());
        emcVar.dg(zz() / cuf());
        emcVar.ypw(ycc());
        emcVar.emc(aVar);
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.xq(sup(), emcVar);
    }

    @Override // L1.f
    public final void emc(c cVar) {
        this.sf = cVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public final void emc(ul.emc emcVar, String str) {
        int i = AnonymousClass6.emc[emcVar.ordinal()];
        if (i == 1) {
            ypw();
            return;
        }
        if (i == 2) {
            dg();
        } else {
            if (i != 3) {
                return;
            }
            xq();
            this.aa = false;
            this.sba = true;
        }
    }

    public void emc(L1.b bVar) {
    }

    @Override // L1.f
    public void emc(long j6) {
        this.lt = j6;
    }

    @Override // L1.f
    public boolean emc(float f2) {
        xq xqVar = this.ycc;
        if (xqVar != null) {
            return xqVar.emc(f2);
        }
        return false;
    }

    public void emc(long j6, long j7) {
        if (!this.ra.get() && com.bytedance.sdk.openadsdk.ycc.emc.emc().xq() && (j6 * 1.0d) / j7 > 0.3d) {
            this.ra.set(true);
            if (this.msw != null) {
                com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("videoPercent30", this.msw);
            }
        }
    }

    @Override // L1.f
    public void emc(SurfaceTexture surfaceTexture) {
        this.xmt = true;
    }
}
