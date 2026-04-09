package com.bytedance.sdk.component.bw.dg.xq;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zz.dg.a;
import com.bytedance.adsdk.ugeno.zz.dg.b;
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
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class xq implements zz {

    /* renamed from: aa, reason: collision with root package name */
    private int f9233aa;
    private vk bw;
    private boolean cf;
    private ExecutorService db;
    private String dg;
    private byte[] dr;
    private int ee;
    Future<?> emc;
    private int gbl;
    private int hxp;
    private int msw;
    private boolean qh;
    private com.bytedance.sdk.component.bw.ypw rie;
    private msw ru;
    private boolean sb;
    private final Handler sba;
    private qh sf;
    private ycc sra;
    private WeakReference<ImageView> sup;
    private volatile boolean sz;
    private com.bytedance.sdk.component.bw.uym ul;
    private Bitmap.Config uym;
    private yzg vk;
    private String xq;
    private ImageView.ScaleType ycc;
    private int ylm;
    private String ypw;
    private boolean yzg;
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
            if (imageView != null && xq.this.gbl != 3 && emc(imageView)) {
                Object objYpw = gblVar.ypw();
                if (objYpw instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) gblVar.ypw();
                    xq.this.sba.post(new Runnable() { // from class: com.bytedance.sdk.component.bw.dg.xq.xq.emc.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objYpw instanceof Drawable) {
                    final Drawable drawable = (Drawable) gblVar.ypw();
                    xq.this.sba.post(new Runnable() { // from class: com.bytedance.sdk.component.bw.dg.xq.xq.emc.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                                b.a(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (xq.this.ru != null && (gblVar.ypw() instanceof Bitmap) && (bitmapEmc = xq.this.ru.emc((Bitmap) gblVar.ypw())) != null) {
                    gblVar.emc(bitmapEmc);
                }
            } catch (Throwable unused) {
            }
            if (xq.this.f9233aa == 5) {
                xq.this.sba.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.bw.dg.xq.xq.emc.3
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
            if (xq.this.f9233aa == 5) {
                xq.this.sba.post(new Runnable() { // from class: com.bytedance.sdk.component.bw.dg.xq.xq.emc.4
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
        private msw f9234aa;
        private ImageView.ScaleType bw;
        private com.bytedance.sdk.component.bw.ypw cf;
        private String dg;
        private vk emc;
        private yzg gbl;
        private int msw;
        private String qh;
        private int sba;
        private qh sra;
        private boolean sup;
        private boolean sz;
        private ExecutorService ul;
        private int uym;
        private ycc vk;
        private String xq;
        private Bitmap.Config ycc;
        private boolean ylm;
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
            return new xq(this).ylm();
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public zz emc(ImageView imageView) {
            this.ypw = imageView;
            return new xq(this).ylm();
        }

        @Override // com.bytedance.sdk.component.bw.ru
        public ru emc(msw mswVar) {
            this.f9234aa = mswVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zz ylm() {
        try {
            if (this.sra == null) {
                vk vkVar = this.bw;
                if (vkVar != null) {
                    vkVar.emc(1005, "not init !", null);
                    return this;
                }
            } else {
                String strEmc = emc();
                if (TextUtils.isEmpty(strEmc)) {
                    this.bw.emc(2000, "url is empty", null);
                    return this;
                }
                ylm ylmVarYcc = this.sra.ycc();
                if (!strEmc.startsWith("http://") && !strEmc.startsWith("https://") && ylmVarYcc != null) {
                    ylmVarYcc.emc(1006, "url is not validate ".concat(strEmc));
                }
                ExecutorService executorServiceBw = this.db == null ? this.sra.bw() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.bw.dg.xq.xq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xq xqVar = xq.this;
                        com.bytedance.sdk.component.bw.dg.xq.emc emcVar = new com.bytedance.sdk.component.bw.dg.xq.emc(xqVar, xqVar.vk);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.bw.dg.ypw.ypw());
                            arrayList.add(new com.bytedance.sdk.component.bw.dg.ypw.bw());
                            arrayList.add(new com.bytedance.sdk.component.bw.dg.ypw.emc());
                            arrayList.add(new com.bytedance.sdk.component.bw.dg.ypw.xq());
                            arrayList.add(new com.bytedance.sdk.component.bw.dg.ypw.dg());
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (xq.this.sz) {
                                    emcVar.emc(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.bw.dg.ypw.ycc yccVar = (com.bytedance.sdk.component.bw.dg.ypw.ycc) arrayList.get(i10);
                                if (xq.this.vk != null && yccVar != null && !"data_intercept".equals(yccVar.emc())) {
                                    xq.this.vk.emc(yccVar.emc(), xq.this);
                                }
                                xq xqVar2 = xq.this;
                                boolean zEmc = yccVar.emc(xqVar2, xqVar2.vk, emcVar);
                                if (xq.this.vk != null && !"data_intercept".equals(yccVar.emc())) {
                                    xq.this.vk.ypw(yccVar.emc(), xq.this);
                                }
                                if (!zEmc) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            emcVar.emc(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.sb) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.db;
                if (executorService != null) {
                    this.emc = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceBw != null) {
                    this.emc = executorServiceBw.submit(runnable);
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public ycc aa() {
        return this.sra;
    }

    public com.bytedance.sdk.component.bw.uym cf() {
        return this.ul;
    }

    public Bitmap.Config gbl() {
        return this.uym;
    }

    public byte[] qh() {
        return this.dr;
    }

    public String ru() {
        return this.xq;
    }

    public com.bytedance.sdk.component.bw.ypw sba() {
        return this.rie;
    }

    public int sup() {
        return this.gbl;
    }

    public boolean sz() {
        return this.yzg;
    }

    public String ul() {
        return ru() + sup();
    }

    public int vk() {
        return this.ylm;
    }

    public qh yzg() {
        return this.sf;
    }

    private xq(ypw ypwVar) {
        this.sba = new Handler(Looper.getMainLooper());
        this.yzg = true;
        this.dr = null;
        this.ypw = ypwVar.dg;
        this.bw = new emc(ypwVar.emc);
        this.sup = new WeakReference<>(ypwVar.ypw);
        this.ycc = ypwVar.bw;
        this.uym = ypwVar.ycc;
        this.msw = ypwVar.uym;
        this.zz = ypwVar.msw;
        this.gbl = ypwVar.zz;
        this.f9233aa = ypwVar.ru;
        this.vk = ypwVar.gbl;
        this.rie = emc(ypwVar);
        if (!TextUtils.isEmpty(ypwVar.xq)) {
            ypw(ypwVar.xq);
            emc(ypwVar.xq);
        }
        this.qh = ypwVar.sup;
        this.cf = ypwVar.sz;
        this.sra = ypwVar.vk;
        this.ru = ypwVar.f9234aa;
        this.ee = ypwVar.yzg;
        this.hxp = ypwVar.sba;
        this.db = ypwVar.ul;
        this.sb = ypwVar.ylm;
        this.sf = ypwVar.sra;
    }

    private com.bytedance.sdk.component.bw.ypw emc(ypw ypwVar) {
        return ypwVar.cf != null ? ypwVar.cf : !TextUtils.isEmpty(ypwVar.qh) ? com.bytedance.sdk.component.bw.dg.xq.emc.ypw.emc(new File(ypwVar.qh)) : com.bytedance.sdk.component.bw.dg.xq.emc.ypw.ru();
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

    public int uym() {
        return this.ee;
    }

    @Override // com.bytedance.sdk.component.bw.zz
    public int xq() {
        return this.zz;
    }

    public int ycc() {
        return this.hxp;
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
        this.yzg = z10;
    }

    public void emc(byte[] bArr) {
        this.dr = bArr;
    }

    public void emc(int i10) {
        this.ylm = i10;
    }
}
