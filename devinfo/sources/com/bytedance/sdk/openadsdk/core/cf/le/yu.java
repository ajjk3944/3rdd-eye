package com.bytedance.sdk.openadsdk.core.cf.le;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.yu.le;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class yu implements ko, rn, com.bytedance.sdk.component.adexpress.dynamic.yu, com.bytedance.sdk.component.adexpress.vt.yu<View> {

    /* renamed from: cd, reason: collision with root package name */
    private static float f8133cd = 0.0f;
    private static long jae = 0;

    /* renamed from: od, reason: collision with root package name */
    private static float f8134od = 0.0f;

    /* renamed from: pd, reason: collision with root package name */
    private static float f8135pd = 0.0f;
    private static float uq = 0.0f;
    protected static int zin = 24;
    protected com.bytedance.sdk.openadsdk.core.bly.ko bly;
    private qbp bs;
    protected JSONObject ex;
    protected vpp fkw;
    private fkw fvf;

    /* renamed from: jg, reason: collision with root package name */
    protected float f8137jg;
    protected float ko;
    private boolean ksc;

    /* renamed from: le, reason: collision with root package name */
    protected ouw f8138le;

    /* renamed from: lh, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.vt.lh<View> f8139lh;
    protected com.bytedance.adsdk.ugeno.vt.lh mwh;
    protected ryl ouw;
    protected com.bytedance.sdk.component.adexpress.vt.pno pno;
    protected FrameLayout ra;
    protected float rn;
    protected com.bytedance.adsdk.ugeno.vt.lh ryl;
    private com.bytedance.sdk.component.adexpress.vt.ra tc;

    /* renamed from: th, reason: collision with root package name */
    protected long f8140th;
    protected jg tlj;
    protected long vm;
    protected String vpp;
    protected Context vt;
    protected JSONObject yu;
    protected float zih;
    protected boolean qbp = true;
    public SparseArray<lh.ouw> jqy = new SparseArray<>();
    private String fak = "";
    private final com.bytedance.sdk.component.pno.pno uoy = new com.bytedance.sdk.component.pno.pno("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.cf.le.yu.1
        @Override // java.lang.Runnable
        public final void run() {
            yu yuVar = yu.this;
            yuVar.yu = yuVar.ouw();
            if (yu.this.bs != null) {
                yu yuVar2 = yu.this;
                yuVar2.fak = yuVar2.bs.getUgenTemplateErrorReason();
            } else {
                yu.this.fak = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.jg.lh().post(yu.this.osn);
        }
    };
    private final Runnable osn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.le.yu.2
        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            if (yu.this.tc != null) {
                yu yuVar = yu.this;
                yu.ouw(yuVar, yuVar.tc);
            }
        }
    };
    private boolean ey = false;

    /* renamed from: cf, reason: collision with root package name */
    protected AtomicBoolean f8136cf = new AtomicBoolean(false);

    static {
        if (zih.ouw() != null) {
            zin = zih.vt();
        }
    }

    public yu(Context context, vpp vppVar, boolean z3, ouw ouwVar, ViewGroup viewGroup) {
        this.vt = context;
        this.ksc = z3;
        this.ouw = new ryl(context);
        this.fkw = vppVar;
        this.f8138le = ouwVar;
        this.ra = new FrameLayout(context);
        if (viewGroup instanceof qbp) {
            this.bs = (qbp) viewGroup;
        }
        this.vpp = ouwVar.ouw;
        JSONObject jSONObjectYu = yu();
        this.ex = jSONObjectYu;
        this.fvf = new fkw(this.vt, this.fkw, this.vpp, jSONObjectYu);
    }

    public com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f8139lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.fkw("video");
    }

    public int fkw() throws JSONException {
        this.ouw.ouw(this);
        ryl rylVar = this.ouw;
        rylVar.ouw = this;
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw = rylVar.ouw(this.yu);
        this.f8139lh = lhVarOuw;
        final fkw fkwVar = this.fvf;
        if (fkwVar != null && lhVarOuw != null) {
            com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw = lhVarOuw.fkw("swiperLayout");
            fkwVar.fkw = lhVarFkw;
            if (lhVarFkw instanceof com.bytedance.adsdk.ugeno.lh) {
                fkwVar.f8121jg = fkwVar.tlj.optJSONArray("dpa_data");
                fkwVar.f8123lh = lhVarOuw.fkw("swiperLeftArrow");
                fkwVar.yu = lhVarOuw.fkw("swiperRightArrow");
                com.bytedance.adsdk.ugeno.lh lhVar = (com.bytedance.adsdk.ugeno.lh) fkwVar.fkw;
                com.bytedance.adsdk.ugeno.le.lh lhVar2 = new com.bytedance.adsdk.ugeno.le.lh() { // from class: com.bytedance.sdk.openadsdk.core.cf.le.fkw.1
                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z3, int i4) {
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z3, int i4, float f10, int i10) {
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z3, int i4, int i10, boolean z10, boolean z11) {
                        fkw fkwVar2 = fkw.this;
                        fkwVar2.vt = i4;
                        fkwVar2.ouw = i10;
                        fkwVar2.f8120cf = z3;
                        fkwVar2.ryl = z10;
                        fkwVar2.mwh = z11;
                        fkwVar2.ouw(z3, z10, z11);
                        fkw fkwVar3 = fkw.this;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("index", i4);
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.vt(fkwVar3.f8122le, fkwVar3.ra, "carousel_show", jSONObject);
                    }
                };
                T t10 = lhVar.fkw;
                if (t10 != 0) {
                    ((com.bytedance.adsdk.ugeno.le.vt) t10).setOnPageChangeListener(lhVar2);
                }
            }
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu)) {
            this.f8138le.f8125cd.vt();
            this.f8138le.f8125cd.lh();
        }
        this.ouw.vt(this.ex);
        return 0;
    }

    public final void le() {
        this.f8136cf.set(true);
    }

    public void ouw(long j, long j8) {
    }

    public com.bytedance.adsdk.ugeno.vt.lh pno() {
        return null;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh ra() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f8139lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("PlayableComponent");
    }

    public void setSoundMute(boolean z3) {
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f8139lh;
        if (lhVar == null || (lhVarFkw = lhVar.fkw("mute")) == 0) {
            return;
        }
        if (z3) {
            ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw).mwh("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw).mwh("local://tt_reward_full_unmute");
        }
        lhVarFkw.vt();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTime(java.lang.CharSequence r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r6.f8139lh
            if (r0 != 0) goto L6
            goto Lba
        L6:
            r1 = 1
            r2 = 0
            if (r8 != r1) goto Lc
            r8 = r1
            goto Ld
        Lc:
            r8 = r2
        Ld:
            r3 = 8
            if (r0 == 0) goto La0
            java.lang.String r4 = "countdown"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.fkw(r4)
            if (r0 == 0) goto La0
            T extends android.view.View r0 = r0.fkw
            boolean r4 = r0 instanceof android.widget.TextView
            if (r4 == 0) goto La0
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L27
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L27
            goto L36
        L27:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "parse duration exception"
            r4[r2] = r5
            r4[r1] = r7
            java.lang.String r5 = "UGenRender"
            com.bytedance.sdk.component.utils.qbp.yu(r5, r4)
            r4 = r2
        L36:
            if (r10 != 0) goto L9d
            if (r4 <= 0) goto L9d
            boolean r4 = r6.ey
            if (r4 == 0) goto L3f
            goto L9d
        L3f:
            r0.setVisibility(r2)
            if (r8 != 0) goto L6e
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r4 = r6.f8138le
            boolean r5 = r4.vm
            if (r5 == 0) goto L6e
            java.lang.String r4 = r4.ouw
            boolean r4 = com.bytedance.sdk.component.adexpress.yu.le.ouw(r4)
            if (r4 == 0) goto L6e
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r7 = com.bytedance.sdk.component.adexpress.yu.ouw()
            java.lang.String r4 = "tt_reward_full_skip"
            java.lang.String r7 = com.bytedance.sdk.component.utils.vpp.ouw(r7, r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r0.setText(r7)
            goto La0
        L6e:
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r9 = r6.f8138le
            java.lang.String r9 = r9.ouw
            java.lang.String r4 = "open_ad"
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L86
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r9 = r6.f8138le
            boolean r9 = r9.vm
            if (r9 == 0) goto L86
            r6.ey = r1
            r0.setVisibility(r3)
            goto La0
        L86:
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = "s"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r0.setText(r7)
            goto La0
        L9d:
            r0.setVisibility(r3)
        La0:
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r7 = r6.f8139lh
            if (r7 == 0) goto Lba
            java.lang.String r9 = "skip"
            com.bytedance.adsdk.ugeno.vt.lh r7 = r7.fkw(r9)
            if (r7 == 0) goto Lba
            T extends android.view.View r7 = r7.fkw
            if (r7 == 0) goto Lba
            if (r8 == 0) goto Lb3
            goto Lb7
        Lb3:
            if (r10 == 0) goto Lb6
            goto Lb7
        Lb6:
            r2 = r3
        Lb7:
            r7.setVisibility(r2)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.yu.setTime(java.lang.CharSequence, int, int, boolean):void");
    }

    public JSONObject yu() {
        return this.f8138le.f8126od;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final View lh() {
        return this.ra;
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, le.ouw ouwVar) {
    }

    public int vt() {
        return this.fkw.kfa;
    }

    public final void ouw(vpp vppVar, boolean z3, ouw ouwVar, ViewGroup viewGroup) {
        this.fkw = vppVar;
        this.f8138le = ouwVar;
        this.vpp = ouwVar.ouw;
        this.ex = yu();
        this.bs = (qbp) viewGroup;
        this.ksc = z3;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.tc = raVar;
        bs.vt(this.uoy);
    }

    public JSONObject ouw() {
        return this.f8138le.ouw();
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.vt.pno pnoVar) {
        this.pno = pnoVar;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.ko koVar) {
        this.bly = koVar;
    }

    public void ouw(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        fkw fkwVar2 = this.fvf;
        if (fkwVar2 != null) {
            fkwVar2.pno = fkwVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.rn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.yu.ouw(com.bytedance.adsdk.ugeno.vt.lh, android.view.MotionEvent):void");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTimeUpdate(int i4) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(mwh mwhVar, ko.ouw ouwVar) {
        JSONObject jSONObject;
        boolean zOuw;
        int i4;
        String str;
        fkw fkwVar;
        fkw fkwVar2;
        int i10;
        fkw fkwVar3;
        int i11;
        mwh mwhVar2;
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        if (mwhVar == null) {
            return;
        }
        int i12 = mwhVar.vt;
        int i13 = 4;
        boolean z3 = true;
        if ((i12 == 1 || i12 == 4) && this.pno != null) {
            String strOptString = mwhVar.f6850lh.optString("type");
            if ("swiperLeft".equals(strOptString) && (fkwVar3 = this.fvf) != null) {
                com.bytedance.adsdk.ugeno.vt.lh lhVar = fkwVar3.fkw;
                if ((lhVar instanceof com.bytedance.adsdk.ugeno.lh) && (i11 = fkwVar3.ouw) != -1) {
                    ((com.bytedance.adsdk.ugeno.lh) lhVar).ouw(i11 - 1);
                }
            } else if ("swiperRight".equals(strOptString) && (fkwVar2 = this.fvf) != null) {
                com.bytedance.adsdk.ugeno.vt.lh lhVar2 = fkwVar2.fkw;
                if ((lhVar2 instanceof com.bytedance.adsdk.ugeno.lh) && (i10 = fkwVar2.ouw) != -1) {
                    ((com.bytedance.adsdk.ugeno.lh) lhVar2).ouw(i10 + 1);
                }
            } else {
                if (!"swiperClick".equals(strOptString) || (fkwVar = this.fvf) == null) {
                    jSONObject = null;
                    zOuw = false;
                    i4 = 0;
                } else {
                    zOuw = fkwVar.ouw(mwhVar);
                    jSONObject = this.fvf.bly;
                    i4 = 2;
                }
                strOptString.getClass();
                switch (strOptString) {
                    case "privacy":
                        i13 = 7;
                        break;
                    case "feedback":
                        i13 = 3;
                        break;
                    case "mute":
                        i13 = 5;
                        break;
                    case "skip":
                        i13 = 6;
                        break;
                    case "video":
                        break;
                    case "creative":
                        i13 = 2;
                        break;
                    default:
                        i13 = i4;
                        break;
                }
                com.bytedance.adsdk.ugeno.vt.lh lhVar3 = mwhVar.ouw;
                ko.ouw ouwVar2 = new ko.ouw();
                ouwVar2.f8238le = this.f8137jg;
                ouwVar2.fkw = this.ko;
                ouwVar2.yu = this.rn;
                ouwVar2.f8239lh = this.zih;
                ouwVar2.vt = this.vm;
                ouwVar2.ouw = this.f8140th;
                ko.ouw ouwVarOuw = ouwVar2.ouw(this.jqy);
                if (mwhVar.vt == 1 && !this.qbp) {
                    z3 = false;
                }
                ouwVarOuw.ko = z3;
                if (lhVar3 == null) {
                    str = "";
                } else {
                    str = lhVar3.jae() + "_" + lhVar3.ksc();
                }
                ouwVarOuw.pno = str;
                ouwVarOuw.mwh = zOuw;
                ouwVarOuw.ryl = jSONObject;
                this.pno.ouw(mwhVar.ouw.fkw, i13, ouwVarOuw.ouw());
            }
        }
        if (mwhVar.vt == 10) {
            JSONObject jSONObject2 = mwhVar.f6850lh;
            if (this.f8139lh != null && jSONObject2 != null) {
                String strOptString2 = jSONObject2.optString("type");
                String strOptString3 = jSONObject2.optString("nodeId");
                if (!TextUtils.isEmpty(strOptString3) && (lhVarFkw = this.f8139lh.fkw(strOptString3)) != 0) {
                    if (TextUtils.equals(strOptString2, "onShow")) {
                        lhVarFkw.vt(0);
                    } else if (TextUtils.equals(strOptString2, "onDismiss")) {
                        lhVarFkw.vt(8);
                    }
                }
            }
        }
        if (ouwVar == null || (mwhVar2 = mwhVar.yu) == null) {
            return;
        }
        ouwVar.ouw(mwhVar2);
    }

    public static /* synthetic */ void ouw(yu yuVar, com.bytedance.sdk.component.adexpress.vt.ra raVar) throws JSONException {
        vpp vppVar;
        int i4;
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
            yuVar.f8138le.vt.ra();
        } else {
            yuVar.f8138le.f8125cd.ouw();
        }
        if (yuVar.yu == null) {
            raVar.ouw(133, "ugen template is null real reason is " + yuVar.fak);
            return;
        }
        if (yuVar.ex == null) {
            raVar.ouw(133, "ugen data is null");
            return;
        }
        int iFkw = yuVar.fkw();
        ryl rylVar = yuVar.ouw;
        if (rylVar.f6862lh) {
            List<String> list = rylVar.yu;
            if (list == null) {
                raVar.ouw(138, "unknow widget");
                return;
            }
            raVar.ouw(138, "unknow widget;" + list.toString());
            return;
        }
        if (iFkw != 0) {
            raVar.ouw(iFkw, "ugen render fail");
            return;
        }
        if (yuVar.f8139lh != null) {
            vt vtVar = new vt();
            yuVar.tlj = vtVar;
            vtVar.vt = true;
            vtVar.ouw = yuVar.vt();
            yuVar.setSoundMute(yuVar.ksc);
            if (yuVar.f8139lh != null) {
                if (yuVar.fkw.osn() && (lhVarFkw = yuVar.f8139lh.fkw("tvskip")) != 0) {
                    lhVarFkw.vt(8);
                }
                com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw2 = yuVar.f8139lh.fkw("skip");
                if (lhVarFkw2 != 0 && (lhVarFkw2 instanceof com.bytedance.adsdk.ugeno.bly.yu.lh)) {
                    cf.vt();
                    if (!cf.tlj(String.valueOf(yuVar.fkw.fqk())) || (i4 = (vppVar = yuVar.fkw).fvf) == 5 || i4 == 6 || vppVar.lna == 3) {
                        ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw2).mwh("local://tt_close_btn");
                        lhVarFkw2.vt();
                    }
                }
            }
            com.bytedance.adsdk.ugeno.vt.lh lhVarBly = yuVar.bly();
            yuVar.ryl = lhVarBly;
            if (lhVarBly != null && (lhVarBly instanceof com.bytedance.sdk.openadsdk.core.cf.vt.fkw.vt)) {
                ((vt) yuVar.tlj).zih = ((com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw) ((com.bytedance.sdk.openadsdk.core.cf.vt.fkw.vt) lhVarBly).fkw).getVideoView();
            }
            fkw fkwVar = yuVar.fvf;
            if (fkwVar != null) {
                fkwVar.ouw(fkwVar.f8120cf, fkwVar.ryl, fkwVar.mwh);
            }
            com.bytedance.adsdk.ugeno.vt.lh lhVarRa = yuVar.ra();
            yuVar.mwh = lhVarRa;
            if (lhVarRa != null && (lhVarRa instanceof com.bytedance.adsdk.ugeno.bly.vt.vt)) {
                ((vt) yuVar.tlj).vm = (FrameLayout) lhVarRa.fkw;
            }
            if (od.lh(yuVar.fkw)) {
                com.bytedance.adsdk.ugeno.vt.lh lhVarPno = yuVar.pno();
                if (lhVarPno instanceof com.bytedance.sdk.openadsdk.core.cf.vt.vt.vt) {
                    ((vt) yuVar.tlj).f8132th = ((com.bytedance.sdk.openadsdk.core.cf.vt.vt.ouw) ((com.bytedance.sdk.openadsdk.core.cf.vt.vt.vt) lhVarPno).fkw).getPlayableView();
                }
            }
            int iOd = yuVar.f8139lh.od();
            int iCd = yuVar.f8139lh.cd();
            com.bytedance.sdk.component.utils.ko.vt("UGenRender", "render: width=" + iOd + "; height=" + iCd);
            yuVar.ra.removeAllViews();
            yuVar.ra.addView(yuVar.f8139lh.fkw, new FrameLayout.LayoutParams(iOd, iCd));
            ouw ouwVar = yuVar.f8138le;
            float f10 = ouwVar.uq;
            float f11 = ouwVar.f8127pd;
            com.bytedance.sdk.component.utils.ko.vt("UGenRender", "render: adWidth = " + f10 + "; adHeight = " + f11);
            float fOuw = (float) osn.ouw(yuVar.vt, f10);
            float fOuw2 = (float) osn.ouw(yuVar.vt, f11);
            if (yuVar.vt() != 7) {
                yuVar.ra.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            } else if (f11 <= 0.0f) {
                yuVar.ra.setLayoutParams(new FrameLayout.LayoutParams((int) fOuw, -2));
            } else {
                yuVar.ra.setLayoutParams(new FrameLayout.LayoutParams((int) fOuw, (int) fOuw2));
            }
            if (f11 > 0.0f && f10 > 0.0f) {
                jg jgVar = yuVar.tlj;
                jgVar.f7393lh = f10;
                jgVar.yu = f11;
            } else {
                yuVar.ra.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int iVt = osn.vt(yuVar.vt, yuVar.ra.getMeasuredWidth());
                int iVt2 = osn.vt(yuVar.vt, yuVar.ra.getMeasuredHeight());
                jg jgVar2 = yuVar.tlj;
                jgVar2.f7393lh = iVt;
                jgVar2.yu = iVt2;
            }
            if (yuVar.f8136cf.get()) {
                raVar.ouw(137, "ugen render timeout");
                return;
            } else {
                yuVar.ouw.ouw(yuVar.f8139lh, "renderDidFinish", new Object[0]);
                raVar.ouw(yuVar.ra, yuVar.tlj);
                return;
            }
        }
        raVar.ouw(138, "ugen render error");
    }
}
