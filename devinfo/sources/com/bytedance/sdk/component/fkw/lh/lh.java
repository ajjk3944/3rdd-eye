package com.bytedance.sdk.component.fkw.lh;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.component.fkw.bly;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.jg;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.pno;
import com.bytedance.sdk.component.fkw.ra;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.fkw.zin;
import com.facebook.ads.AdError;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements bly {
    pno bly;

    /* renamed from: cd, reason: collision with root package name */
    public jg f7452cd;

    /* renamed from: cf, reason: collision with root package name */
    WeakReference<ImageView> f7453cf;
    public com.bytedance.sdk.component.fkw.lh.ouw ex;
    public ImageView.ScaleType fkw;
    public int jae;

    /* renamed from: jg, reason: collision with root package name */
    public boolean f7454jg;
    public le jqy;
    Future<?> ko;
    public int ksc;

    /* renamed from: le, reason: collision with root package name */
    public Bitmap.Config f7455le;

    /* renamed from: lh, reason: collision with root package name */
    public String f7456lh;
    public boolean mwh;

    /* renamed from: od, reason: collision with root package name */
    public boolean f7457od;
    public String ouw;

    /* renamed from: pd, reason: collision with root package name */
    private boolean f7458pd;
    public int pno;
    public boolean qbp;
    public int ra;
    th rn;
    volatile boolean ryl;
    public com.bytedance.sdk.component.fkw.vt tc;

    /* renamed from: th, reason: collision with root package name */
    final Handler f7459th;
    public int tlj;
    private ExecutorService uq;
    Queue<com.bytedance.sdk.component.fkw.fkw.bly> vm;
    public int vpp;
    public String vt;
    public rn yu;
    int zih;
    public ra zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements tlj {

        /* renamed from: cf, reason: collision with root package name */
        th f7462cf;
        ImageView.ScaleType fkw;

        /* renamed from: jg, reason: collision with root package name */
        String f7463jg;
        jg jqy;
        com.bytedance.sdk.component.fkw.vt ko;

        /* renamed from: le, reason: collision with root package name */
        Bitmap.Config f7464le;

        /* renamed from: lh, reason: collision with root package name */
        String f7465lh;
        boolean mwh;
        rn ouw;
        int pno;
        boolean qbp;
        int ra;
        le rn;
        boolean ryl;

        /* renamed from: th, reason: collision with root package name */
        int f7466th;
        int vm;
        boolean vpp;
        ImageView vt;
        String yu;
        pno zih;
        ExecutorService zin;
        int bly = 1;
        int tlj = 5;

        public vt(le leVar) {
            this.rn = leVar;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj fkw(int i4) {
            this.f7466th = i4;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj lh(int i4) {
            this.bly = i4;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(String str) {
            this.f7465lh = str;
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
            this.f7463jg = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(Bitmap.Config config) {
            this.f7464le = config;
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
            this.f7462cf = thVar;
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
        return this.f7455le;
    }

    public final bly le() {
        try {
            if (this.jqy == null) {
                rn rnVar = this.yu;
                if (rnVar != null) {
                    rnVar.ouw(WebSocketProtocol.CLOSE_NO_STATUS_CODE, "not init !", null);
                    return this;
                }
            } else {
                String str = this.ouw;
                if (TextUtils.isEmpty(str)) {
                    rn rnVar2 = this.yu;
                    if (rnVar2 != null) {
                        rnVar2.ouw(AdError.SERVER_ERROR_CODE, "url is empty", null);
                        return this;
                    }
                } else {
                    mwh mwhVar = this.jqy.vt;
                    zin zinVarBly = mwhVar != null ? mwhVar.bly() : null;
                    if (!str.startsWith("http://") && !str.startsWith("https://") && zinVarBly != null) {
                        zinVarBly.ouw("url is not validate ".concat(str));
                    }
                    ExecutorService executorServiceVt = this.uq == null ? this.jqy.vt() : null;
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fkw.lh.lh.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bytedance.sdk.component.fkw.fkw.bly blyVarPoll;
                            while (!lh.this.ryl && (blyVarPoll = lh.this.vm.poll()) != null) {
                                try {
                                    th thVar = lh.this.rn;
                                    if (thVar != null) {
                                        thVar.ouw(blyVarPoll.ouw(), lh.this);
                                    }
                                    blyVarPoll.ouw(lh.this);
                                    th thVar2 = lh.this.rn;
                                    if (thVar2 != null) {
                                        thVar2.ouw(blyVarPoll.ouw());
                                    }
                                } catch (Throwable th2) {
                                    lh.ouw(lh.this, AdError.SERVER_ERROR_CODE, th2.getMessage(), th2);
                                    th thVar3 = lh.this.rn;
                                    if (thVar3 != null) {
                                        thVar3.ouw("exception");
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (lh.this.ryl) {
                                lh.ouw(lh.this, 1003, "canceled", null);
                            }
                        }
                    };
                    if (this.f7458pd) {
                        runnable.run();
                        return this;
                    }
                    ExecutorService executorService = this.uq;
                    if (executorService != null) {
                        this.ko = executorService.submit(runnable);
                        return this;
                    }
                    if (executorServiceVt != null) {
                        this.ko = executorServiceVt.submit(runnable);
                    }
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
        this.vm = new LinkedBlockingQueue();
        this.f7459th = new Handler(Looper.getMainLooper());
        this.qbp = true;
        this.ouw = vtVar.yu;
        this.yu = new ouw(vtVar.ouw);
        this.f7453cf = new WeakReference<>(vtVar.vt);
        this.fkw = vtVar.fkw;
        this.f7455le = vtVar.f7464le;
        this.ra = vtVar.ra;
        this.pno = vtVar.pno;
        this.tlj = vtVar.bly;
        this.zih = vtVar.tlj;
        this.rn = vtVar.f7462cf;
        com.bytedance.sdk.component.fkw.vt vtVar2 = vtVar.ko;
        this.tc = vtVar2 == null ? !TextUtils.isEmpty(vtVar.f7463jg) ? com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw(new File(vtVar.f7463jg)) : com.bytedance.sdk.component.fkw.lh.ouw.ouw.bly() : vtVar2;
        if (!TextUtils.isEmpty(vtVar.f7465lh)) {
            ouw(vtVar.f7465lh);
            this.f7456lh = vtVar.f7465lh;
        }
        this.mwh = vtVar.ryl;
        this.f7454jg = vtVar.mwh;
        this.jqy = vtVar.rn;
        this.bly = vtVar.zih;
        this.jae = vtVar.f7466th;
        this.ksc = vtVar.vm;
        this.uq = vtVar.zin;
        this.f7457od = vtVar.qbp;
        this.f7458pd = vtVar.vpp;
        this.f7452cd = vtVar.jqy;
        this.vm.add(new com.bytedance.sdk.component.fkw.fkw.lh());
    }

    public final void ouw(String str) {
        WeakReference<ImageView> weakReference = this.f7453cf;
        if (weakReference != null && weakReference.get() != null) {
            this.f7453cf.get().setTag(1094453505, str);
        }
        this.vt = str;
    }

    public final boolean ouw(com.bytedance.sdk.component.fkw.fkw.bly blyVar) {
        if (this.ryl) {
            return false;
        }
        return this.vm.add(blyVar);
    }

    public static /* synthetic */ void ouw(lh lhVar, int i4, String str, Throwable th2) {
        new com.bytedance.sdk.component.fkw.fkw.pno(i4, str, th2).ouw(lhVar);
        lhVar.vm.clear();
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
            final ImageView imageView = lh.this.f7453cf.get();
            if (imageView != null && lh.this.tlj != 3 && (tag = imageView.getTag(1094453505)) != null && tag.equals(lh.this.vt) && (cfVar.vt() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) cfVar.vt();
                lh.this.f7459th.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.lh.lh.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (lh.this.bly != null && (cfVar.vt() instanceof Bitmap) && (bitmapOuw = lh.this.bly.ouw((Bitmap) cfVar.vt())) != null) {
                    cfVar.ouw(bitmapOuw);
                }
            } catch (Throwable unused) {
            }
            lh lhVar = lh.this;
            if (lhVar.zih == 5) {
                lhVar.f7459th.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.fkw.lh.lh.ouw.2
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
            if (lhVar.zih == 5) {
                lhVar.f7459th.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.lh.lh.ouw.3
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
