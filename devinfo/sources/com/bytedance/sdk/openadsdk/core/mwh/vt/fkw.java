package com.bytedance.sdk.openadsdk.core.mwh.vt;

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
import b9.e;
import b9.g;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.lh.ouw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.core.widget.qbp;
import com.bytedance.sdk.openadsdk.core.widget.th;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import pk.a;
import x8.b;
import x8.d;
import x8.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class fkw implements d, g, jae.ouw, ouw.InterfaceC0087ouw, qbp.vt, th.ouw {
    View bly;
    e bs;

    /* renamed from: cd, reason: collision with root package name */
    qbp f8341cd;

    /* renamed from: cf, reason: collision with root package name */
    View f8342cf;
    public boolean ex;
    le.ouw ey;
    com.bytedance.sdk.openadsdk.core.lh.ouw fak;
    ViewGroup fkw;
    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh fvf;
    vpp jae;

    /* renamed from: jg, reason: collision with root package name */
    View f8343jg;
    boolean jqy;
    com.bytedance.sdk.openadsdk.core.widget.ouw ko;
    int ksc;

    /* renamed from: le, reason: collision with root package name */
    public f f8344le;

    /* renamed from: lh, reason: collision with root package name */
    protected final int f8345lh;
    ImageView mwh;

    /* renamed from: od, reason: collision with root package name */
    Context f8346od;
    boolean osn;
    private long ouw;

    /* renamed from: pd, reason: collision with root package name */
    boolean f8347pd;
    View pno;
    int qbp;
    ImageView ra;
    TextView rn;
    View ryl;
    int tc;

    /* renamed from: th, reason: collision with root package name */
    int f8348th;
    ImageView tlj;
    com.bytedance.sdk.openadsdk.core.lh.ouw uoy;
    ouw uq;
    TextView vm;
    int vpp;
    private final String vt;
    protected final int yu;
    TextView zih;
    int zin;

    public fkw(Context context, ViewGroup viewGroup, vpp vppVar, e eVar, boolean z3) {
        this.f8345lh = 228;
        this.yu = 160;
        this.jqy = true;
        this.f8347pd = true;
        this.osn = true;
        this.vt = Build.MODEL;
        if (this instanceof yu) {
            return;
        }
        this.f8346od = zih.ouw().getApplicationContext();
        fkw(z3);
        this.fkw = viewGroup;
        this.jqy = true;
        this.ksc = 17;
        this.bs = eVar;
        this.jae = vppVar;
        yu(8);
        ouw(context, this.fkw);
        le();
        ko();
    }

    private boolean ex() {
        return vpp.fkw(this.jae) && (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.jae.kfa) ? this.jae.xn == null : this.jae.lht == null) && this.jae.ln == 1;
    }

    private void tc() {
        if (this.uq == null || this.f8341cd != null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        qbp qbpVar = new qbp();
        this.f8341cd = qbpVar;
        Context context = this.f8346od;
        ViewGroup viewGroup = this.fkw;
        if (context != null && viewGroup != null) {
            qbpVar.pno = viewGroup;
            qbpVar.f8503lh = zih.ouw().getApplicationContext();
        }
        qbp qbpVar2 = this.f8341cd;
        ouw ouwVar = this.uq;
        qbpVar2.fkw = this;
        qbpVar2.yu = ouwVar;
        ko.vt("useTime", "mVideoTrafficTipLayout use time :" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public void cf() {
        yu(8);
        if (jqy()) {
            this.f8344le.setVisibility(8);
        }
        ImageView imageView = this.tlj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        yu(8);
        osn.ouw(this.ryl, 8);
        osn.ouw((View) this.mwh, 8);
        osn.ouw(this.f8343jg, 8);
        osn.ouw((View) this.ko, 8);
        osn.ouw((View) this.rn, 8);
        osn.ouw((View) this.zih, 8);
        qbp qbpVar = this.f8341cd;
        if (qbpVar != null) {
            qbpVar.ouw(true);
        }
    }

    public final void fkw(boolean z3) {
        this.f8347pd = z3;
        if (z3) {
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.fak;
            if (ouwVar != null) {
                ouwVar.yu = true;
            }
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = this.uoy;
            if (ouwVar2 != null) {
                ouwVar2.yu = true;
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar3 = this.fak;
        if (ouwVar3 != null) {
            ouwVar3.yu = false;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar4 = this.uoy;
        if (ouwVar4 != null) {
            ouwVar4.yu = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0087ouw
    public long getVideoProgress() {
        c cVar;
        if (this.ouw <= 0) {
            vpp vppVar = this.jae;
            if (vppVar != null && (cVar = vppVar.f8309sd) != null) {
                this.ouw = (long) (cVar.f6576d * 1000.0d);
            }
            e eVar = this.bs;
            if (eVar != null) {
                this.ouw = eVar.th();
            }
        }
        return this.ouw;
    }

    public final boolean jqy() {
        return (this.ksc & 4) != 4 || this.jqy;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ko() {
        /*
            r9 = this;
            boolean r0 = r9.f8347pd
            if (r0 == 0) goto L7
            java.lang.String r0 = "embeded_ad"
            goto L9
        L7:
            java.lang.String r0 = "embeded_ad_landingpage"
        L9:
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r9.jae
            boolean r1 = r1.ey()
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.String r0 = "rewarded_video"
            r1 = 7
        L15:
            r7 = r0
            r8 = r1
            goto L32
        L18:
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r9.jae
            boolean r1 = r1.rrs()
            if (r1 == 0) goto L24
            java.lang.String r0 = "fullscreen_interstitial_ad"
            r1 = 5
            goto L15
        L24:
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r9.jae
            boolean r1 = r1.jvy()
            if (r1 == 0) goto L30
            java.lang.String r0 = "banner_ad"
            r1 = 2
            goto L15
        L30:
            r7 = r0
            r8 = r2
        L32:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r9.jae
            int r0 = r0.f8305pd
            r1 = 4
            if (r0 != r1) goto L41
            android.content.Context r0 = r9.f8346od
            com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh r0 = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(r0, r7)
            r9.fvf = r0
        L41:
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = new com.bytedance.sdk.openadsdk.core.lh.ouw
            android.content.Context r1 = r9.f8346od
            com.bytedance.sdk.openadsdk.core.model.vpp r3 = r9.jae
            r0.<init>(r1, r3, r7, r8)
            r9.fak = r0
            r0.ouw(r9)
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.fak
            r0.fkw = r2
            boolean r1 = r9.f8347pd
            if (r1 == 0) goto L5a
            r0.yu = r2
            goto L5f
        L5a:
            r1 = 0
            r0.yu = r1
            r0.f8205le = r2
        L5f:
            b9.e r1 = r9.bs
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.fak
            r0.lh()
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r9.fak
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$1 r1 = new com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$1
            r1.<init>()
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh r0 = r9.fvf
            if (r0 == 0) goto L7e
            com.bytedance.sdk.openadsdk.core.lh.ouw r1 = r9.fak
            if (r1 == 0) goto L7e
            r1.ouw(r0)
        L7e:
            boolean r0 = r9.ex()
            if (r0 == 0) goto Lb9
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$2 r3 = new com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$2
            android.content.Context r5 = r9.f8346od
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r9.jae
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r4.uoy = r3
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$3 r0 = new com.bytedance.sdk.openadsdk.core.mwh.vt.fkw$3
            r0.<init>()
            r3.ouw(r0)
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r4.uoy
            r0.fkw = r2
            boolean r1 = r4.f8347pd
            r0.yu = r1
            b9.e r1 = r4.bs
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r4.uoy
            r0.lh()
            com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh r0 = r4.fvf
            if (r0 == 0) goto Lb3
            com.bytedance.sdk.openadsdk.core.lh.ouw r1 = r4.uoy
            r1.ouw(r0)
        Lb3:
            com.bytedance.sdk.openadsdk.core.lh.ouw r0 = r4.uoy
            r0.ouw(r9)
            return
        Lb9:
            r4 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.ko():void");
    }

    public void le() {
        this.f8344le.a(this);
        this.ra.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (fkw.this.zih()) {
                    TextView textView = fkw.this.vm;
                    if (textView == null || textView.getVisibility() != 0) {
                        fkw.this.uq.ouw();
                    }
                }
            }
        });
    }

    public final void lh(int i4) {
        osn.ouw((View) this.fkw, 0);
        f fVar = this.f8344le;
        if (fVar != null) {
            fVar.setVisibility(i4);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public void mwh() {
        lh(false);
    }

    public void ouw(long j) {
    }

    public final void qbp() {
        try {
            osn.ouw(this.ryl, 8);
            osn.ouw((View) this.mwh, 8);
            osn.ouw(this.f8343jg, 8);
            osn.ouw((View) this.ko, 8);
            osn.ouw((View) this.rn, 8);
            osn.ouw((View) this.zih, 8);
            osn.ouw((View) this.vm, 8);
        } catch (Exception unused) {
        }
    }

    public final void rn() {
        qbp qbpVar = this.f8341cd;
        if (qbpVar != null) {
            qbpVar.ouw(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public boolean ryl() {
        return false;
    }

    @TargetApi(14)
    public final void th() {
        osn.ouw((View) this.fkw, 0);
        f fVar = this.f8344le;
        if (fVar != null) {
            osn.ouw(fVar.getView(), 0);
        }
    }

    public void tlj() {
        vpp vppVar;
        c cVar;
        osn.le(this.pno);
        osn.le(this.bly);
        ImageView imageView = this.tlj;
        if (imageView != null && (vppVar = this.jae) != null && (cVar = vppVar.f8309sd) != null && cVar.f6578f != null) {
            osn.le(imageView);
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar2 = this.jae;
            c cVar2 = vppVar2.f8309sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(cVar2.f6578f, cVar2.f6574b, cVar2.f6573a, this.tlj, vppVar2);
        }
        if (this.ra.getVisibility() == 0) {
            osn.ouw((View) this.ra, 8);
        }
    }

    public final void vm() {
        osn.le(this.pno);
        osn.le(this.bly);
        if (this.ra.getVisibility() == 0) {
            osn.ouw((View) this.ra, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.th.ouw
    public final boolean vpp() {
        qbp qbpVar = this.f8341cd;
        return qbpVar != null && qbpVar.ouw();
    }

    public void vt(ViewGroup viewGroup) {
    }

    public void yu(boolean z3) {
    }

    public final boolean zih() {
        if (this.uq != null) {
            return true;
        }
        ko.fkw("NewLiveViewLayout", "callback is null");
        return false;
    }

    public final void zin() {
        ImageView imageView = this.mwh;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar = this.ko;
        if (ouwVar != null) {
            ouwVar.setImageBitmap(null);
        }
    }

    public void ouw(long j, long j8) {
    }

    public boolean vt(int i4) {
        return false;
    }

    @Override // x8.d
    public final boolean yu() {
        this.ex = false;
        if (!zih()) {
            return true;
        }
        this.uq.pno();
        return true;
    }

    public final void le(boolean z3) {
        ImageView imageView = this.ra;
        if (imageView != null) {
            if (z3) {
                imageView.setImageDrawable(cf.ouw(this.f8346od, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(cf.ouw(this.f8346od, "tt_stop_movebar_textpage"));
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public void ouw(Message message) {
    }

    public final void vt(int i4, int i10) {
        this.zin = i4;
        this.vpp = i10;
    }

    private void lh(int i4, int i10) {
        ViewGroup.LayoutParams layoutParams = this.fkw.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i4 == -1 || i4 == -2 || i4 > 0) {
            layoutParams.width = i4;
        }
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.height = i10;
        }
        this.fkw.setLayoutParams(layoutParams);
    }

    public void ouw(ViewGroup viewGroup) {
    }

    public void ouw(String str) {
    }

    @Override // b9.g
    public final void vt() {
        osn.fkw(this.pno);
        osn.fkw(this.bly);
        ImageView imageView = this.tlj;
        if (imageView != null) {
            osn.fkw(imageView);
        }
    }

    public final void yu(int i4) {
        this.tc = i4;
        osn.ouw((View) this.fkw, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20, types: [android.view.TextureView] */
    public void ouw(Context context, View view) {
        x8.c cVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        vpp vppVar = this.jae;
        if ((vppVar == null || ((vppVar.uoy() != 5 && !this.jae.jvy()) || com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw("bus_con_video_keep_screen_on", 1) == 1)) && view != null) {
            view.setKeepScreenOn(true);
        }
        e eVar = this.bs;
        if (eVar != null && eVar.tc()) {
            ?? gVar = new x8.g(this.f8346od, null);
            ko.vt("NewLiveViewLayout", "use TextureView......");
            cVar = gVar;
        } else {
            x8.c cVar2 = new x8.c(this.f8346od);
            a.x("CSJ_VIDEO_SurfaceView", "SSRenderSurfaceView: ");
            b bVar = new b(cVar2);
            cVar2.f37010b = bVar;
            x8.c.f37008c.add(bVar);
            ko.vt("NewLiveViewLayout", "use SurfaceView......");
            cVar = cVar2;
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(cVar, 0, layoutParams);
        }
        osn.ouw((View) cVar, 8);
        this.f8344le = cVar;
        this.ra = (ImageView) view.findViewById(rn.f8719ki);
        this.pno = view.findViewById(rn.fn);
        this.bly = view.findViewById(rn.ehk);
        this.tlj = (ImageView) view.findViewById(rn.byv);
        this.f8342cf = view.findViewById(rn.ln);
        ko.vt("useTime", "NativeVideoLayout**findViews use time :" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void lh(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.fkw.getParent() == null) {
            viewGroup.addView(this.fkw);
        }
        yu(0);
    }

    @Override // x8.d
    public final void vt(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f8344le.getHolder()) {
            return;
        }
        zih();
    }

    private int fkw(int i4) {
        if (this.zin <= 0 || this.vpp <= 0) {
            return 0;
        }
        int iOuw = osn.ouw(this.f8346od, 228.0f);
        int iOuw2 = osn.ouw(this.f8346od, 160.0f);
        int i10 = (int) (this.vpp * ((i4 * 1.0f) / this.zin));
        return i10 > iOuw ? iOuw : i10 < iOuw2 ? iOuw2 : i10;
    }

    @Override // b9.g
    public final View lh() {
        return this.fkw;
    }

    public void vt(boolean z3) {
        osn.ouw((View) this.ra, (!z3 || this.pno.getVisibility() == 0) ? 8 : 0);
    }

    @Override // x8.d
    public final void lh(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f8344le.getHolder()) {
            return;
        }
        this.ex = false;
        if (zih()) {
            this.uq.ra();
        }
    }

    @Override // x8.d
    public final void fkw() {
        e eVar = this.bs;
        if (eVar != null) {
            eVar.tlj();
        }
    }

    public void lh(boolean z3) {
        osn.ouw((View) this.ra, 8);
    }

    public fkw(Context context, ViewGroup viewGroup, vpp vppVar, e eVar) {
        this(context, viewGroup, vppVar, eVar, true);
    }

    public void bly() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.th.ouw
    public void jg() {
    }

    public void pno() {
    }

    public void ra() {
    }

    public final void ouw(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.f8342cf) == null || view2.getParent() == null || this.ryl != null) {
            return;
        }
        this.ryl = this.f8342cf;
        this.mwh = (ImageView) view.findViewById(rn.smu);
        this.f8343jg = view.findViewById(rn.qni);
        this.ko = (com.bytedance.sdk.openadsdk.core.widget.ouw) view.findViewById(rn.rrs);
        this.rn = (TextView) view.findViewById(rn.jvy);
        this.zih = (TextView) view.findViewById(rn.fqk);
        this.vm = (TextView) view.findViewById(rn.hun);
    }

    public final void ouw(b9.f fVar) {
        this.uq = (ouw) fVar;
        tc();
    }

    public final void ouw(int i4, int i10) {
        if (i4 == -1) {
            i4 = osn.yu(this.f8346od);
        }
        if (i4 <= 0) {
            return;
        }
        this.f8348th = i4;
        if (!this.jqy && !ryl() && (this.ksc & 8) != 8) {
            this.qbp = fkw(i4);
        } else {
            this.qbp = i10;
        }
        lh(this.f8348th, this.qbp);
    }

    public void ouw(int i4) {
        ko.lh("Progress", "setSeekProgress-percent=".concat(String.valueOf(i4)));
    }

    @Override // b9.g
    public void ouw() {
        lh(this.jqy);
        qbp();
    }

    @Override // b9.g
    public final void ouw(boolean z3) {
        this.osn = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    @Override // b9.g
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp r9) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.ouw(com.bytedance.sdk.openadsdk.core.model.vpp):void");
    }

    @Override // x8.d
    public final void ouw(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f8344le.getHolder()) {
            return;
        }
        this.ex = true;
        if (zih()) {
            this.uq.ouw(surfaceHolder);
        }
    }

    @Override // x8.d
    public final void ouw(SurfaceTexture surfaceTexture) {
        this.ex = true;
        if (zih()) {
            this.uq.ouw(surfaceTexture);
        }
    }

    @Override // b9.g
    public final void ouw(Drawable drawable) {
        ViewGroup viewGroup = this.fkw;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
