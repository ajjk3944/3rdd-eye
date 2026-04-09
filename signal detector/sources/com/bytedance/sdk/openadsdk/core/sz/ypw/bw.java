package com.bytedance.sdk.openadsdk.core.sz.ypw;

import L1.a;
import L1.f;
import L1.g;
import O1.b;
import O1.c;
import O1.d;
import O1.e;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.ypw.ycc;
import com.bytedance.sdk.openadsdk.core.widget.ul;
import com.bytedance.sdk.openadsdk.core.widget.yzg;
import com.bytedance.sdk.openadsdk.core.xq.emc;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw implements g, c, sf.emc, ul.ypw, yzg.emc, emc.InterfaceC0081emc {
    int aa;
    ImageView bw;
    TextView cf;
    com.bytedance.sdk.openadsdk.core.xq.emc cuf;
    Context db;
    O1.g dg;
    boolean dr;
    rie ee;
    protected final int emc;
    ImageView gbl;
    int hxp;
    private ycc.emc iyl;
    f lt;
    boolean mkp;
    ImageView msw;
    private long mxo;
    TextView qh;
    int rie;
    com.bytedance.sdk.openadsdk.core.xq.emc rtt;
    View ru;
    ul sb;
    int sba;
    emc sf;
    boolean sra;
    View sup;
    com.bytedance.sdk.openadsdk.core.widget.emc sz;
    private final String tp;
    int ul;
    View uym;
    TextView vk;
    com.bytedance.sdk.openadsdk.ul.emc.emc.xq xmt;
    ViewGroup xq;
    View ycc;
    boolean ylm;
    protected final int ypw;
    int yzg;
    View zz;

    public bw(Context context, ViewGroup viewGroup, boolean z6, int i, rie rieVar, f fVar, boolean z7) {
        this.emc = 228;
        this.ypw = 160;
        this.ylm = true;
        this.dr = true;
        this.mkp = true;
        this.tp = Build.MODEL;
        if (this instanceof dg) {
            return;
        }
        this.db = aa.emc().getApplicationContext();
        dg(z7);
        this.xq = viewGroup;
        this.ylm = z6;
        this.hxp = i;
        this.lt = fVar;
        this.ee = rieVar;
        dg(8);
        emc(context, this.xq);
        dg();
        sup();
    }

    private boolean ee() {
        return rie.bw(this.ee) && (!com.bytedance.sdk.openadsdk.core.gbl.bw.emc(this.ee.ej()) ? this.ee.zhk() == null : this.ee.kv() == null) && this.ee.jxk() == 1;
    }

    public void aa() {
        vw.ycc(this.ycc);
        vw.ycc(this.uym);
        if (this.bw.getVisibility() == 0) {
            vw.emc((View) this.bw, 8);
        }
    }

    public void bw() {
    }

    public void cf() {
        ul ulVar = this.sb;
        if (ulVar != null) {
            ulVar.emc(false);
        }
    }

    public void dg() {
        this.dg.a(this);
        this.bw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.bw.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (bw.this.vk()) {
                    TextView textView = bw.this.vk;
                    if (textView == null || textView.getVisibility() != 0) {
                        bw bwVar = bw.this;
                        bwVar.sf.emc(bwVar, view);
                    }
                }
            }
        });
    }

    public void emc(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ul.ypw
    public void gbl() {
        emc(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.emc.InterfaceC0081emc
    public long getVideoProgress() {
        if (this.mxo <= 0) {
            rie rieVar = this.ee;
            if (rieVar != null && rieVar.iat() != null) {
                this.mxo = (long) (this.ee.iat().f6583d * 1000.0d);
            }
            f fVar = this.lt;
            if (fVar != null) {
                this.mxo = fVar.zz();
            }
        }
        return this.mxo;
    }

    public boolean hxp() {
        return (this.hxp & 4) != 4 || this.ylm;
    }

    public void msw() {
        vw.bw(this.ycc);
    }

    public void qh() {
        if (this.sf == null || this.sb != null) {
            return;
        }
        System.currentTimeMillis();
        ul ulVar = new ul();
        this.sb = ulVar;
        ulVar.emc(this.db, this.xq);
        this.sb.emc(this.sf, this);
        System.currentTimeMillis();
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.yzg.emc
    public boolean rie() {
        ul ulVar = this.sb;
        return ulVar != null && ulVar.emc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ul.ypw
    public boolean ru() {
        return false;
    }

    @TargetApi(14)
    public void sba() {
        vw.emc((View) this.xq, 0);
        O1.g gVar = this.dg;
        if (gVar != null) {
            vw.emc(gVar.getView(), 0);
        }
    }

    public boolean sra() {
        return this.sra;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sup() {
        /*
            r9 = this;
            boolean r0 = r9.dr
            if (r0 == 0) goto L7
            java.lang.String r0 = "embeded_ad"
            goto L9
        L7:
            java.lang.String r0 = "embeded_ad_landingpage"
        L9:
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r9.ee
            boolean r1 = r1.zc()
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.String r0 = "rewarded_video"
            r1 = 7
        L15:
            r7 = r0
            r8 = r1
            goto L32
        L18:
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r9.ee
            boolean r1 = r1.qxc()
            if (r1 == 0) goto L24
            java.lang.String r0 = "fullscreen_interstitial_ad"
            r1 = 5
            goto L15
        L24:
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r9.ee
            boolean r1 = r1.uh()
            if (r1 == 0) goto L30
            java.lang.String r0 = "banner_ad"
            r1 = 2
            goto L15
        L30:
            r7 = r0
            r8 = r2
        L32:
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r9.ee
            int r0 = r0.sx()
            r1 = 4
            if (r0 != r1) goto L43
            android.content.Context r0 = r9.db
            com.bytedance.sdk.openadsdk.ul.emc.emc.xq r0 = com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(r0, r7)
            r9.xmt = r0
        L43:
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = new com.bytedance.sdk.openadsdk.core.xq.emc
            android.content.Context r1 = r9.db
            com.bytedance.sdk.openadsdk.core.model.rie r3 = r9.ee
            r0.<init>(r1, r3, r7, r8)
            r9.cuf = r0
            r0.emc(r9)
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r9.cuf
            r0.ypw(r2)
            boolean r0 = r9.dr
            if (r0 == 0) goto L60
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r9.cuf
            r0.emc(r2)
            goto L6b
        L60:
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r9.cuf
            r1 = 0
            r0.emc(r1)
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r9.cuf
            r0.xq(r2)
        L6b:
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r9.cuf
            L1.f r1 = r9.lt
            r0.emc(r1)
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r9.cuf
            r0.bw(r2)
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r9.cuf
            com.bytedance.sdk.openadsdk.core.sz.ypw.bw$1 r1 = new com.bytedance.sdk.openadsdk.core.sz.ypw.bw$1
            r1.<init>()
            r0.emc(r1)
            com.bytedance.sdk.openadsdk.ul.emc.emc.xq r0 = r9.xmt
            if (r0 == 0) goto L8c
            com.bytedance.sdk.openadsdk.core.xq.emc r1 = r9.cuf
            if (r1 == 0) goto L8c
            r1.emc(r0)
        L8c:
            boolean r0 = r9.ee()
            if (r0 == 0) goto Lcd
            com.bytedance.sdk.openadsdk.core.sz.ypw.bw$2 r3 = new com.bytedance.sdk.openadsdk.core.sz.ypw.bw$2
            android.content.Context r5 = r9.db
            com.bytedance.sdk.openadsdk.core.model.rie r6 = r9.ee
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r4.rtt = r3
            com.bytedance.sdk.openadsdk.core.sz.ypw.bw$3 r0 = new com.bytedance.sdk.openadsdk.core.sz.ypw.bw$3
            r0.<init>()
            r3.emc(r0)
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r4.rtt
            r0.ypw(r2)
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r4.rtt
            boolean r1 = r4.dr
            r0.emc(r1)
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r4.rtt
            L1.f r1 = r4.lt
            r0.emc(r1)
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r4.rtt
            r0.bw(r2)
            com.bytedance.sdk.openadsdk.ul.emc.emc.xq r0 = r4.xmt
            if (r0 == 0) goto Lc7
            com.bytedance.sdk.openadsdk.core.xq.emc r1 = r4.rtt
            r1.emc(r0)
        Lc7:
            com.bytedance.sdk.openadsdk.core.xq.emc r0 = r4.rtt
            r0.emc(r9)
            return
        Lcd:
            r4 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.sz.ypw.bw.sup():void");
    }

    public O1.g sz() {
        return this.dg;
    }

    public void ul() {
        ImageView imageView = this.gbl;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.emc emcVar = this.sz;
        if (emcVar != null) {
            emcVar.setImageBitmap(null);
        }
    }

    public void uym() {
        rie rieVar;
        vw.ycc(this.ycc);
        vw.ycc(this.uym);
        if (this.msw != null && (rieVar = this.ee) != null && rieVar.iat() != null && this.ee.iat().f6585f != null) {
            vw.ycc(this.msw);
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.ee.iat().f6585f, this.ee.iat().f6581b, this.ee.iat().f6580a, this.msw, this.ee);
        }
        if (this.bw.getVisibility() == 0) {
            vw.emc((View) this.bw, 8);
        }
    }

    public boolean vk() {
        return this.sf != null;
    }

    public void xq(boolean z6) {
    }

    public void ycc() {
    }

    public boolean ylm() {
        return this.ylm;
    }

    public void ypw(ViewGroup viewGroup) {
    }

    public void yzg() {
        try {
            vw.emc(this.ru, 8);
            vw.emc((View) this.gbl, 8);
            vw.emc(this.sup, 8);
            vw.emc((View) this.sz, 8);
            vw.emc((View) this.qh, 8);
            vw.emc((View) this.cf, 8);
            vw.emc((View) this.vk, 8);
        } catch (Exception unused) {
        }
    }

    public void zz() {
        dg(8);
        if (hxp()) {
            this.dg.setVisibility(8);
        }
        ImageView imageView = this.msw;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        dg(8);
        vw.emc(this.ru, 8);
        vw.emc((View) this.gbl, 8);
        vw.emc(this.sup, 8);
        vw.emc((View) this.sz, 8);
        vw.emc((View) this.qh, 8);
        vw.emc((View) this.cf, 8);
        ul ulVar = this.sb;
        if (ulVar != null) {
            ulVar.emc(true);
        }
    }

    private int bw(int i) {
        if (this.yzg <= 0 || this.ul <= 0) {
            return 0;
        }
        int iYpw = vw.ypw(this.db, 228.0f);
        int iYpw2 = vw.ypw(this.db, 160.0f);
        int i3 = (int) (this.ul * ((i * 1.0f) / this.yzg));
        return i3 > iYpw ? iYpw : i3 < iYpw2 ? iYpw2 : i3;
    }

    private void ycc(int i) {
        vw.emc(this.sup, i);
    }

    public void emc(long j6) {
    }

    public void xq(int i) {
        vw.emc((View) this.xq, 0);
        O1.g gVar = this.dg;
        if (gVar != null) {
            gVar.setVisibility(i);
        }
    }

    public void ypw(boolean z6) {
    }

    public void dg(boolean z6) {
        this.dr = z6;
        if (z6) {
            com.bytedance.sdk.openadsdk.core.xq.emc emcVar = this.cuf;
            if (emcVar != null) {
                emcVar.emc(true);
            }
            com.bytedance.sdk.openadsdk.core.xq.emc emcVar2 = this.rtt;
            if (emcVar2 != null) {
                emcVar2.emc(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar3 = this.cuf;
        if (emcVar3 != null) {
            emcVar3.emc(false);
        }
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar4 = this.rtt;
        if (emcVar4 != null) {
            emcVar4.emc(false);
        }
    }

    public void emc(long j6, long j7) {
    }

    public boolean ypw(int i) {
        return false;
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
    }

    public void ypw(boolean z6, boolean z7) {
        ImageView imageView = this.bw;
        if (imageView != null) {
            if (z6) {
                imageView.setImageDrawable(gbl.emc(this.db, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(gbl.emc(this.db, "tt_stop_movebar_textpage"));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.yzg.emc
    public void emc(View view, boolean z6) {
    }

    public void xq(int i, int i3) {
        this.yzg = i;
        this.ul = i3;
    }

    public void emc(ViewGroup viewGroup) {
    }

    public void emc(String str) {
    }

    public void xq(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.xq.getParent() == null) {
            viewGroup.addView(this.xq);
        }
        dg(0);
    }

    public void ypw(int i, int i3) {
        ViewGroup.LayoutParams layoutParams = this.xq.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i3 == -1 || i3 == -2 || i3 > 0) {
            layoutParams.height = i3;
        }
        this.xq.setLayoutParams(layoutParams);
    }

    @Override // L1.g
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void emc(Object obj, WeakReference weakReference, boolean z6) {
        emc((rie) obj, (WeakReference<Context>) weakReference, z6);
    }

    @Override // L1.g
    public View xq() {
        return this.xq;
    }

    public void emc(ycc.emc emcVar) {
        this.iyl = emcVar;
    }

    @Override // L1.g
    public void ypw() {
        vw.bw(this.ycc);
        vw.bw(this.uym);
        ImageView imageView = this.msw;
        if (imageView != null) {
            vw.bw(imageView);
        }
    }

    public void dg(int i) {
        this.rie = i;
        vw.emc((View) this.xq, i);
    }

    public void emc(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar = this.cuf;
        if (emcVar != null) {
            emcVar.emc(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar2 = this.rtt;
        if (emcVar2 != null) {
            emcVar2.emc(pAGNativeAd);
        }
    }

    @Override // O1.c
    public void ypw(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.dg.getHolder()) {
            return;
        }
        this.sra = false;
        if (vk()) {
            this.sf.ypw(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [android.view.TextureView] */
    public void emc(Context context, View view) {
        d bVar;
        System.currentTimeMillis();
        rie rieVar = this.ee;
        if ((rieVar == null || ((!rieVar.hgw() && !this.ee.uh()) || com.bytedance.sdk.openadsdk.core.settings.gbl.xq().dpk())) && view != null) {
            view.setKeepScreenOn(true);
        }
        f fVar = this.lt;
        if (fVar != null && fVar.cf()) {
            bVar = new b(this.db, null);
        } else {
            d dVar = new d(this.db);
            e eVar = new e(dVar);
            dVar.f3062b = eVar;
            d.f3060c.add(eVar);
            bVar = dVar;
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(bVar, 0, layoutParams);
        }
        vw.emc((View) bVar, 8);
        this.dg = bVar;
        this.bw = (ImageView) view.findViewById(vk.hs);
        this.ycc = view.findViewById(vk.gyw);
        this.uym = view.findViewById(vk.iat);
        this.msw = (ImageView) view.findViewById(vk.qp);
        this.zz = view.findViewById(vk.sg);
        System.currentTimeMillis();
    }

    @Override // O1.c
    public void ypw(SurfaceTexture surfaceTexture) {
        f fVar = this.lt;
        if (fVar != null) {
            fVar.emc(surfaceTexture);
        }
    }

    public bw(Context context, ViewGroup viewGroup, boolean z6, int i, rie rieVar, f fVar) {
        this(context, viewGroup, z6, i, rieVar, fVar, true);
    }

    public void emc(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.zz) == null || view2.getParent() == null || this.ru != null) {
            return;
        }
        this.ru = this.zz;
        this.gbl = (ImageView) view.findViewById(vk.kv);
        this.sup = view.findViewById(vk.etw);
        this.sz = (com.bytedance.sdk.openadsdk.core.widget.emc) view.findViewById(vk.wo);
        this.qh = (TextView) view.findViewById(vk.xxg);
        this.cf = (TextView) view.findViewById(vk.yz);
        this.vk = (TextView) view.findViewById(vk.wpn);
    }

    public boolean emc(int i, com.bykv.vk.openvk.emc.emc.emc.xq.c cVar, boolean z6) {
        ul ulVar = this.sb;
        return ulVar == null || ulVar.emc(i, cVar, z6);
    }

    public void emc(a aVar) {
        if (aVar instanceof emc) {
            this.sf = (emc) aVar;
            qh();
        }
    }

    public void emc(int i, int i3) {
        if (i == -1) {
            i = vw.xq(this.db);
        }
        if (i <= 0) {
            return;
        }
        this.aa = i;
        if (!ylm() && !ru() && (this.hxp & 8) != 8) {
            this.sba = bw(i);
        } else {
            this.sba = i3;
        }
        ypw(this.aa, this.sba);
    }

    @Override // L1.g
    public void emc() {
        emc(false, this.ylm);
        yzg();
    }

    @Override // L1.g
    public void emc(boolean z6) {
        this.mkp = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0213  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(com.bytedance.sdk.openadsdk.core.model.rie r7, java.lang.ref.WeakReference<android.content.Context> r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.sz.ypw.bw.emc(com.bytedance.sdk.openadsdk.core.model.rie, java.lang.ref.WeakReference, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final int i, final String str, final rie rieVar) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(new msw("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.bw.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("description", i + ":" + str);
                    jSONObject.put("url", bw.this.ee.ya().emc());
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.dg.xq.ypw(bw.this.ee, bw.this.ee != null ? tp.xq(rieVar.mfx()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // O1.c
    public void emc(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.dg.getHolder()) {
            return;
        }
        this.sra = true;
        if (vk()) {
            this.sf.emc(this, surfaceHolder);
        }
    }

    @Override // O1.c
    public void emc(SurfaceHolder surfaceHolder, int i, int i3, int i6) {
        if (surfaceHolder != this.dg.getHolder()) {
            return;
        }
        vk();
    }

    @Override // O1.c
    public void emc(SurfaceTexture surfaceTexture, int i, int i3) {
        this.sra = true;
        if (vk()) {
            this.sf.emc(this, surfaceTexture);
        }
    }

    @Override // O1.c
    public boolean emc(SurfaceTexture surfaceTexture) {
        this.sra = false;
        if (!vk()) {
            return true;
        }
        this.sf.ypw(this, surfaceTexture);
        return true;
    }

    public void emc(boolean z6, boolean z7, boolean z8) {
        vw.emc((View) this.bw, (!z6 || this.ycc.getVisibility() == 0) ? 8 : 0);
    }

    public void emc(boolean z6, boolean z7) {
        vw.emc((View) this.bw, 8);
    }

    @Override // L1.g
    public void emc(Drawable drawable) {
        ViewGroup viewGroup = this.xq;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
