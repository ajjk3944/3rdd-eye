package com.bytedance.sdk.component.bw.xq;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.bw.gbl;
import com.bytedance.sdk.component.bw.msw;
import com.bytedance.sdk.component.bw.qh;
import com.bytedance.sdk.component.bw.ru;
import com.bytedance.sdk.component.bw.vk;
import com.bytedance.sdk.component.bw.ylm;
import com.bytedance.sdk.component.bw.yzg;
import com.bytedance.sdk.component.bw.zz;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class xq implements zz {

    /* renamed from: aa, reason: collision with root package name */
    private int f9236aa;
    private vk bw;
    private boolean cf;
    private int db;
    private String dg;
    private ExecutorService dr;
    private com.bytedance.sdk.component.bw.ypw ee;
    Future<?> emc;
    private int gbl;
    private com.bytedance.sdk.component.bw.xq.emc hxp;
    private qh lt;
    private int msw;
    private boolean qh;
    private ycc rie;
    private msw ru;
    private int sb;
    private Queue<com.bytedance.sdk.component.bw.bw.zz> sba;
    private boolean sf;
    private int sra;
    private WeakReference<ImageView> sup;
    private volatile boolean sz;
    private boolean ul;
    private Bitmap.Config uym;
    private yzg vk;
    private boolean xmt;
    private String xq;
    private ImageView.ScaleType ycc;
    private com.bytedance.sdk.component.bw.uym ylm;
    private String ypw;
    private final Handler yzg;
    private int zz;

    public class emc implements vk {
        private vk ypw;

        public emc(vk vkVar) {
            this.ypw = vkVar;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(final gbl gblVar) {
            Bitmap bitmapEmc;
            final ImageView imageView = (ImageView) xq.this.sup.get();
            if (imageView != null && xq.this.gbl != 3 && emc(imageView) && (gblVar.ypw() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) gblVar.ypw();
                xq.this.yzg.post(new Runnable() { // from class: com.bytedance.sdk.component.bw.xq.xq.emc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (xq.this.ru != null && (gblVar.ypw() instanceof Bitmap) && (bitmapEmc = xq.this.ru.emc((Bitmap) gblVar.ypw())) != null) {
                    gblVar.emc(bitmapEmc);
                }
            } catch (Throwable unused) {
            }
            if (xq.this.f9236aa == 5) {
                xq.this.yzg.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.bw.xq.xq.emc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (emc.this.ypw != null) {
                            emc.this.ypw.emc(gblVar);
                        }
                    }
                });
                return;
            }
            vk vkVar = this.ypw;
            if (vkVar != null) {
                vkVar.emc(gblVar);
            }
        }

        private boolean emc(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(xq.this.xq)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(final int i10, final String str, final Throwable th) {
            if (xq.this.f9236aa == 5) {
                xq.this.yzg.post(new Runnable() { // from class: com.bytedance.sdk.component.bw.xq.xq.emc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (emc.this.ypw != null) {
                            emc.this.ypw.emc(i10, str, th);
                        }
                    }
                });
                return;
            }
            vk vkVar = this.ypw;
            if (vkVar != null) {
                vkVar.emc(i10, str, th);
            }
        }
    }

    public static class ypw implements ru {

        /* renamed from: aa, reason: collision with root package name */
        private msw f9237aa;
        private ImageView.ScaleType bw;
        private com.bytedance.sdk.component.bw.ypw cf;
        private String dg;
        private vk emc;
        private yzg gbl;
        private int msw;
        private String qh;
        private qh rie;
        private int sba;
        private boolean sra;
        private boolean sup;
        private boolean sz;
        private boolean ul;
        private int uym;
        private ycc vk;
        private String xq;
        private Bitmap.Config ycc;
        private ExecutorService ylm;
        private ImageView ypw;
        private int yzg;
        private int zz = 1;
        private int ru = 5;

        public ypw(ycc yccVar) {
            this.vk = yccVar;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru bw(int i10) {
            this.yzg = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru dg(int i10) {
            this.sba = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru emc(String str) {
            this.xq = str;
            return this;
        }

        public ru xq(String str) {
            this.dg = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru ypw(int i10) {
            this.msw = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru emc(ImageView.ScaleType scaleType) {
            this.bw = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru xq(int i10) {
            this.zz = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru ypw(String str) {
            this.qh = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru emc(Bitmap.Config config) {
            this.ycc = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru emc(int i10) {
            this.uym = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru emc(yzg yzgVar) {
            this.gbl = yzgVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru emc(boolean z10) {
            this.sz = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public zz emc(vk vkVar, int i10) {
            this.ru = i10;
            return emc(vkVar);
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public zz emc(vk vkVar) {
            this.emc = vkVar;
            return new xq(this).rie();
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public zz emc(ImageView imageView) {
            this.ypw = imageView;
            return new xq(this).rie();
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru emc(msw mswVar) {
            this.f9237aa = mswVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zz rie() {
        try {
            if (this.rie == null) {
                vk vkVar = this.bw;
                if (vkVar != null) {
                    vkVar.emc(1005, "not init !", null);
                    return this;
                }
            } else {
                String strEmc = emc();
                if (TextUtils.isEmpty(strEmc)) {
                    vk vkVar2 = this.bw;
                    if (vkVar2 != null) {
                        vkVar2.emc(2000, "url is empty", null);
                        return this;
                    }
                } else {
                    ylm ylmVarBw = this.rie.bw();
                    if (!strEmc.startsWith("http://") && !strEmc.startsWith("https://") && ylmVarBw != null) {
                        ylmVarBw.emc(1006, "url is not validate ".concat(strEmc));
                    }
                    ExecutorService executorServiceUym = this.dr == null ? this.rie.uym() : null;
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.bw.xq.xq.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.bw.bw.zz zzVar;
                            while (!xq.this.sz && (zzVar = (com.bytedance.sdk.component.bw.bw.zz) xq.this.sba.poll()) != null) {
                                try {
                                    if (xq.this.vk != null) {
                                        xq.this.vk.emc(zzVar.emc(), xq.this);
                                    }
                                    zzVar.emc(xq.this);
                                    if (xq.this.vk != null) {
                                        xq.this.vk.ypw(zzVar.emc(), xq.this);
                                    }
                                } catch (Throwable th) {
                                    xq.this.emc(2000, th.getMessage(), th);
                                    if (xq.this.vk != null) {
                                        xq.this.vk.ypw("exception", xq.this);
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (xq.this.sz) {
                                xq.this.emc(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, "canceled", null);
                            }
                        }
                    };
                    if (this.xmt) {
                        runnable.run();
                        return this;
                    }
                    ExecutorService executorService = this.dr;
                    if (executorService != null) {
                        this.emc = executorService.submit(runnable);
                        return this;
                    }
                    if (executorServiceUym != null) {
                        this.emc = executorServiceUym.submit(runnable);
                    }
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public int aa() {
        return this.sra;
    }

    public boolean cf() {
        return this.ul;
    }

    public Bitmap.Config gbl() {
        return this.uym;
    }

    public boolean qh() {
        return this.cf;
    }

    public ycc sba() {
        return this.rie;
    }

    public String sra() {
        return ru() + sup();
    }

    public int sup() {
        return this.gbl;
    }

    public boolean sz() {
        return this.qh;
    }

    public boolean ul() {
        return this.sf;
    }

    public com.bytedance.sdk.component.bw.uym vk() {
        return this.ylm;
    }

    public qh ylm() {
        return this.lt;
    }

    public com.bytedance.sdk.component.bw.ypw yzg() {
        return this.ee;
    }

    private xq(ypw ypwVar) {
        this.sba = new LinkedBlockingQueue();
        this.yzg = new Handler(Looper.getMainLooper());
        this.ul = true;
        this.ypw = ypwVar.dg;
        this.bw = new emc(ypwVar.emc);
        this.sup = new WeakReference<>(ypwVar.ypw);
        this.ycc = ypwVar.bw;
        this.uym = ypwVar.ycc;
        this.msw = ypwVar.uym;
        this.zz = ypwVar.msw;
        this.gbl = ypwVar.zz;
        this.f9236aa = ypwVar.ru;
        this.vk = ypwVar.gbl;
        this.ee = emc(ypwVar);
        if (!TextUtils.isEmpty(ypwVar.xq)) {
            ypw(ypwVar.xq);
            emc(ypwVar.xq);
        }
        this.qh = ypwVar.sup;
        this.cf = ypwVar.sz;
        this.rie = ypwVar.vk;
        this.ru = ypwVar.f9237aa;
        this.sb = ypwVar.yzg;
        this.db = ypwVar.sba;
        this.dr = ypwVar.ylm;
        this.sf = ypwVar.ul;
        this.xmt = ypwVar.sra;
        this.lt = ypwVar.rie;
        this.sba.add(new com.bytedance.sdk.component.bw.bw.xq());
    }

    @Override // com.bytedance.sdk.component.bw.zz
    public Bitmap.Config bw() {
        return this.uym;
    }

    @Override // com.bytedance.sdk.component.bw.zz
    public ImageView.ScaleType dg() {
        return this.ycc;
    }

    public vk msw() {
        return this.bw;
    }

    public String ru() {
        return this.xq;
    }

    public int uym() {
        return this.sb;
    }

    @Override // com.bytedance.sdk.component.bw.zz
    public int xq() {
        return this.zz;
    }

    public int ycc() {
        return this.db;
    }

    public void ypw(String str) {
        WeakReference<ImageView> weakReference = this.sup;
        if (weakReference != null && weakReference.get() != null) {
            this.sup.get().setTag(1094453505, str);
        }
        this.xq = str;
    }

    public String zz() {
        return this.dg;
    }

    private com.bytedance.sdk.component.bw.ypw emc(ypw ypwVar) {
        if (ypwVar.cf != null) {
            return ypwVar.cf;
        }
        if (!TextUtils.isEmpty(ypwVar.qh)) {
            return com.bytedance.sdk.component.bw.xq.emc.emc.emc(new File(ypwVar.qh));
        }
        return com.bytedance.sdk.component.bw.xq.emc.emc.ru();
    }

    @Override // com.bytedance.sdk.component.bw.zz
    public int ypw() {
        return this.msw;
    }

    @Override // com.bytedance.sdk.component.bw.zz
    public String emc() {
        return this.ypw;
    }

    public void emc(String str) {
        this.dg = str;
    }

    public void emc(boolean z10) {
        this.ul = z10;
    }

    public void emc(com.bytedance.sdk.component.bw.uym uymVar) {
        this.ylm = uymVar;
    }

    public void emc(int i10) {
        this.sra = i10;
    }

    public void emc(com.bytedance.sdk.component.bw.xq.emc emcVar) {
        this.hxp = emcVar;
    }

    public boolean emc(com.bytedance.sdk.component.bw.bw.zz zzVar) {
        if (this.sz) {
            return false;
        }
        return this.sba.add(zzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i10, String str, Throwable th) {
        new com.bytedance.sdk.component.bw.bw.msw(i10, str, th).emc(this);
        this.sba.clear();
    }
}
