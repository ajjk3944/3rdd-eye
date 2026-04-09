package com.bytedance.sdk.component.fkw.yu.lh;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.a;
import com.bytedance.sdk.component.fkw.bly;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.jg;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.pno;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.ra;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.fkw.zin;
import com.facebook.ads.AdError;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements bly {
    pno bly;

    /* renamed from: cd, reason: collision with root package name */
    private boolean f7497cd;

    /* renamed from: cf, reason: collision with root package name */
    WeakReference<ImageView> f7498cf;
    public jg ex;
    ImageView.ScaleType fkw;
    private boolean jae;

    /* renamed from: jg, reason: collision with root package name */
    th f7499jg;
    int jqy;
    int ko;
    private boolean ksc;

    /* renamed from: le, reason: collision with root package name */
    Bitmap.Config f7500le;

    /* renamed from: lh, reason: collision with root package name */
    public String f7501lh;
    Future<?> mwh;

    /* renamed from: od, reason: collision with root package name */
    private ExecutorService f7502od;
    public String ouw;
    int pno;
    public le qbp;
    int ra;
    final Handler rn;
    volatile boolean ryl;
    public byte[] tc;

    /* renamed from: th, reason: collision with root package name */
    public int f7503th;
    public int tlj;
    ra vm;
    int vpp;
    public String vt;
    rn yu;
    public boolean zih;
    public com.bytedance.sdk.component.fkw.vt zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements tlj {

        /* renamed from: cf, reason: collision with root package name */
        th f7507cf;
        ImageView.ScaleType fkw;

        /* renamed from: jg, reason: collision with root package name */
        String f7508jg;
        com.bytedance.sdk.component.fkw.vt ko;

        /* renamed from: le, reason: collision with root package name */
        Bitmap.Config f7509le;

        /* renamed from: lh, reason: collision with root package name */
        String f7510lh;
        boolean mwh;
        rn ouw;
        int pno;
        ExecutorService qbp;
        int ra;
        le rn;
        boolean ryl;

        /* renamed from: th, reason: collision with root package name */
        int f7511th;
        int vm;
        jg vpp;
        ImageView vt;
        String yu;
        pno zih;
        boolean zin;
        int bly = 1;
        int tlj = 5;

        public vt(le leVar) {
            this.rn = leVar;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj fkw(int i4) {
            this.f7511th = i4;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj lh(int i4) {
            this.bly = i4;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(String str) {
            this.f7510lh = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj vt(int i4) {
            this.pno = i4;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj yu(int i4) {
            this.vm = i4;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(ImageView.ScaleType scaleType) {
            this.fkw = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj vt(String str) {
            this.f7508jg = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(Bitmap.Config config) {
            this.f7509le = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly vt(rn rnVar) {
            this.ouw = rnVar;
            return new lh(this, (byte) 0).le();
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(int i4) {
            this.ra = i4;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(th thVar) {
            this.f7507cf = thVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(boolean z3) {
            this.mwh = z3;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly ouw(rn rnVar) {
            this.tlj = 4;
            return vt(rnVar);
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly ouw(ImageView imageView) {
            this.vt = imageView;
            return new lh(this, (byte) 0).le();
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(pno pnoVar) {
            this.zih = pnoVar;
            return this;
        }
    }

    public /* synthetic */ lh(vt vtVar, byte b10) {
        this(vtVar);
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final Bitmap.Config fkw() {
        return this.f7500le;
    }

    public final bly le() {
        try {
            ExecutorService executorServiceOuw = null;
            if (this.qbp == null) {
                rn rnVar = this.yu;
                if (rnVar != null) {
                    rnVar.ouw(WebSocketProtocol.CLOSE_NO_STATUS_CODE, "not init !", null);
                    return this;
                }
            } else {
                String str = this.ouw;
                if (TextUtils.isEmpty(str)) {
                    this.yu.ouw(AdError.SERVER_ERROR_CODE, "url is empty", null);
                    return this;
                }
                mwh mwhVar = this.qbp.vt;
                zin zinVarBly = mwhVar != null ? mwhVar.bly() : null;
                if (!str.startsWith("http://") && !str.startsWith("https://") && zinVarBly != null) {
                    zinVarBly.ouw("url is not validate ".concat(str));
                }
                if (this.f7502od == null) {
                    le leVar = this.qbp;
                    qbp qbpVarLh = leVar.vt.lh();
                    if (qbpVarLh == null || (executorServiceOuw = qbpVarLh.ouw()) == null) {
                        if (leVar.fkw == null) {
                            ExecutorService executorServiceVt = leVar.vt.vt();
                            if (executorServiceVt == null) {
                                executorServiceVt = com.bytedance.sdk.component.fkw.yu.ouw.vt.ouw();
                            }
                            leVar.fkw = executorServiceVt;
                        }
                        executorServiceOuw = leVar.fkw;
                    }
                }
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh lhVar = lh.this;
                        com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar = new com.bytedance.sdk.component.fkw.yu.lh.ouw(lhVar, lhVar.f7499jg);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.vt());
                            arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.fkw());
                            arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.ouw());
                            arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.lh());
                            arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.yu());
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                if (lh.this.ryl) {
                                    ouwVar.ouw(1003, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.fkw.yu.vt.le leVar2 = (com.bytedance.sdk.component.fkw.yu.vt.le) arrayList.get(i4);
                                if (lh.this.f7499jg != null && leVar2 != null && !"data_intercept".equals(leVar2.ouw())) {
                                    lh.this.f7499jg.ouw(leVar2.ouw(), lh.this);
                                }
                                lh lhVar2 = lh.this;
                                boolean zOuw = leVar2.ouw(lhVar2, lhVar2.f7499jg, ouwVar);
                                if (lh.this.f7499jg != null && !"data_intercept".equals(leVar2.ouw())) {
                                    lh.this.f7499jg.ouw(leVar2.ouw());
                                }
                                if (!zOuw) {
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            ouwVar.ouw(AdError.SERVER_ERROR_CODE, th2.getMessage(), th2);
                        }
                    }
                };
                if (this.f7497cd) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.f7502od;
                if (executorService != null) {
                    this.mwh = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceOuw != null) {
                    this.mwh = executorServiceOuw.submit(runnable);
                }
            }
            return this;
        } catch (Exception e2) {
            Log.e("ImageRequest", e2.getMessage());
            return this;
        }
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final int lh() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final String ouw() {
        return this.ouw;
    }

    public final String ra() {
        return this.vt + this.tlj;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final int vt() {
        return this.ra;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final ImageView.ScaleType yu() {
        return this.fkw;
    }

    private lh(vt vtVar) {
        this.rn = new Handler(Looper.getMainLooper());
        this.zih = true;
        this.tc = null;
        this.ouw = vtVar.yu;
        this.yu = new ouw(vtVar.ouw);
        this.f7498cf = new WeakReference<>(vtVar.vt);
        this.fkw = vtVar.fkw;
        this.f7500le = vtVar.f7509le;
        this.ra = vtVar.ra;
        this.pno = vtVar.pno;
        this.tlj = vtVar.bly;
        this.ko = vtVar.tlj;
        this.f7499jg = vtVar.f7507cf;
        com.bytedance.sdk.component.fkw.vt vtVar2 = vtVar.ko;
        this.zin = vtVar2 == null ? !TextUtils.isEmpty(vtVar.f7508jg) ? com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.ouw(new File(vtVar.f7508jg)) : com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly() : vtVar2;
        if (!TextUtils.isEmpty(vtVar.f7510lh)) {
            ouw(vtVar.f7510lh);
            this.f7501lh = vtVar.f7510lh;
        }
        this.ksc = vtVar.ryl;
        this.jae = vtVar.mwh;
        this.qbp = vtVar.rn;
        this.bly = vtVar.zih;
        this.jqy = vtVar.f7511th;
        this.vpp = vtVar.vm;
        this.f7502od = vtVar.qbp;
        this.f7497cd = vtVar.zin;
        this.ex = vtVar.vpp;
    }

    public final void ouw(String str) {
        WeakReference<ImageView> weakReference = this.f7498cf;
        if (weakReference != null && weakReference.get() != null) {
            this.f7498cf.get().setTag(1094453505, str);
        }
        this.vt = str;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ouw implements rn {
        rn ouw;

        public ouw(rn rnVar) {
            this.ouw = rnVar;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(final cf cfVar) {
            Bitmap bitmapOuw;
            Object tag;
            final ImageView imageView = lh.this.f7498cf.get();
            if (imageView != null && lh.this.tlj != 3 && (tag = imageView.getTag(1094453505)) != null && tag.equals(lh.this.vt)) {
                Object objVt = cfVar.vt();
                if (objVt instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) cfVar.vt();
                    lh.this.rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objVt instanceof Drawable) {
                    final Drawable drawable = (Drawable) cfVar.vt();
                    lh.this.rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (a.i(drawable2)) {
                                    a.c(drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (lh.this.bly != null && (cfVar.vt() instanceof Bitmap) && (bitmapOuw = lh.this.bly.ouw((Bitmap) cfVar.vt())) != null) {
                    cfVar.ouw(bitmapOuw);
                }
            } catch (Throwable unused) {
            }
            lh lhVar = lh.this;
            if (lhVar.ko == 5) {
                lhVar.rn.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        rn rnVar = ouw.this.ouw;
                        if (rnVar != null) {
                            rnVar.ouw(cfVar);
                        }
                    }
                });
                return;
            }
            rn rnVar = this.ouw;
            if (rnVar != null) {
                rnVar.ouw(cfVar);
            }
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(final int i4, final String str, final Throwable th2) {
            lh lhVar = lh.this;
            if (lhVar.ko == 5) {
                lhVar.rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        rn rnVar = ouw.this.ouw;
                        if (rnVar != null) {
                            rnVar.ouw(i4, str, th2);
                        }
                    }
                });
                return;
            }
            rn rnVar = this.ouw;
            if (rnVar != null) {
                rnVar.ouw(i4, str, th2);
            }
        }
    }
}
