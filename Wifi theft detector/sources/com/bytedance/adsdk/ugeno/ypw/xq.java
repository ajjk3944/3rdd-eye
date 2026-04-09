package com.bytedance.adsdk.ugeno.ypw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.activity.o;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.gbl;
import com.bytedance.adsdk.ugeno.core.msw;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.adsdk.ugeno.core.ru;
import com.bytedance.adsdk.ugeno.core.sba;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.adsdk.ugeno.core.uym;
import com.bytedance.adsdk.ugeno.core.vk;
import com.bytedance.adsdk.ugeno.core.ypw.bw;
import com.bytedance.adsdk.ugeno.core.ypw.dg;
import com.bytedance.adsdk.ugeno.core.ypw.ycc;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ugeno.dg.zz;
import com.bytedance.adsdk.ugeno.emc;
import com.bytedance.adsdk.ugeno.uym.emc;
import com.bytedance.adsdk.ugeno.ypw.emc;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class xq<T extends View> implements View.OnTouchListener, cf.emc, cf.ypw, dg {

    /* renamed from: aa, reason: collision with root package name */
    protected float f9216aa;
    private ru av;
    protected boolean but;
    protected float bv;
    protected T bw;
    protected float cf;
    protected int cn;
    protected boolean cuf;
    private boolean cwv;
    protected float db;
    protected JSONObject dg;
    private boolean dm;
    private boolean dor;
    private boolean dpk;
    protected float dr;
    protected boolean ee;
    protected float ej;
    private boolean emc;
    private boolean etw;
    private JSONObject ff;
    protected boolean ffd;
    protected float fu;
    private boolean fxt;
    protected String gbl;
    private boolean ge;
    private String gyw;
    private boolean hh;
    protected int hj;
    protected emc.C0097emc hoq;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ypw.ypw hs;
    protected boolean hxp;

    @Deprecated
    private ycc iat;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ypw.xq igv;
    protected float ipv;
    protected boolean iyl;
    protected com.bytedance.adsdk.ugeno.emc.emc jp;
    protected float jxk;
    protected zz kkn;
    private boolean knr;
    private GradientDrawable kv;
    protected boolean lt;
    protected com.bytedance.adsdk.ugeno.emc.ycc ltx;
    protected boolean mkp;
    protected uym.emc msw;
    protected int mxo;
    protected float ndl;
    private long ng;
    protected boolean nw;
    private boolean nx;
    private boolean oa;
    private String oug;

    @Deprecated
    private dg.emc oz;
    protected float pe;
    protected float pm;
    protected float pxa;
    protected vk pxj;
    protected float qh;
    protected boolean qhy;
    private com.bytedance.adsdk.ugeno.core.emc qp;
    protected float ra;
    protected float rgy;
    protected boolean rie;
    protected float rig;
    protected float rqm;
    private boolean rr;
    protected boolean rtt;
    protected boolean ru;
    protected float sb;
    protected float sba;
    protected msw se;
    protected float sf;
    private boolean sg;
    protected boolean sra;
    protected String sup;

    @Deprecated
    private bw sx;
    protected float sz;
    private boolean tc;
    protected String tp;
    protected float ul;
    protected emc<ViewGroup> uym;
    protected Map<Integer, sz> vaf;
    protected cf vhn;
    protected float vk;
    protected float vum;
    protected ImageView.ScaleType vw;
    private com.bytedance.adsdk.ugeno.dg.emc.emc vyk;
    protected float wa;
    protected boolean wad;
    protected ViewGroup.LayoutParams wbn;
    protected boolean wd;
    protected boolean wo;
    protected float wpn;
    private boolean wq;
    protected String xhi;
    protected float xmt;
    private boolean xou;
    protected JSONObject xq;
    private boolean xst;
    protected boolean xxg;
    private boolean xxo;
    protected com.bytedance.adsdk.ugeno.core.ycc xxs;
    private sba ya;
    protected emc<ViewGroup> ycc;
    private float ye;
    protected float yid;
    protected float ylm;
    protected Context ypw;
    protected float yuz;
    protected float yz;
    protected float yzg;
    private boolean zhk;
    protected gbl zz;

    public xq(Context context) {
        this(context, null);
    }

    @Deprecated
    private void dg() throws JSONException {
        com.bytedance.adsdk.ugeno.core.ypw.dg dgVarDg;
        this.bw.setVisibility(this.cn);
        float f10 = this.yuz;
        if (f10 != 0.0f) {
            this.bw.setRotation(f10);
        }
        uym.emc emcVar = this.msw;
        if (emcVar != null && TextUtils.isEmpty(emcVar.ypw())) {
            this.bw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.ypw.xq.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    xq xqVar = xq.this;
                    if (xqVar.se != null) {
                        boolean unused = xqVar.cwv;
                    }
                }
            });
        } else if (ypw(1) && !this.fxt) {
            this.bw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.ypw.xq.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    xq xqVar = xq.this;
                    if (xqVar.vhn == null || !xqVar.cwv) {
                        return;
                    }
                    xq xqVar2 = xq.this;
                    cf cfVar = xqVar2.vhn;
                    sz szVar = xqVar2.vaf.get(1);
                    xq xqVar3 = xq.this;
                    cfVar.emc(szVar, xqVar3, xqVar3);
                }
            });
        }
        if (this.vhn != null && ypw(4)) {
            if (ypw(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + rtt());
                this.knr = true;
                this.sx = new bw(this.ypw, this.vaf.get(4), this.vaf.get(1), this.knr, but());
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + rtt());
                this.sx = new bw(this.ypw, this.vaf.get(4), this.knr, but());
            }
        }
        if (this.vhn != null && ypw(1) && this.fxt) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.fxt + ", view.id: " + rtt());
            this.igv = new com.bytedance.adsdk.ugeno.core.ypw.xq(this.ypw, this.vaf.get(1));
        }
        zz();
        if (this.vhn != null && ypw(3) && (dgVarDg = com.bytedance.adsdk.ugeno.bw.emc().dg()) != null) {
            this.oz = dgVarDg.emc(this.ypw, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.ypw.xq.3
            };
        }
        if (this.vhn != null && ypw(9)) {
            ycc yccVar = new ycc(this.ypw, this.vaf.get(9), this);
            this.iat = yccVar;
            yccVar.emc(this.vhn);
        }
        if (ypw(10)) {
            com.bytedance.adsdk.ugeno.core.ypw.ypw ypwVar = new com.bytedance.adsdk.ugeno.core.ypw.ypw(this.ypw, this.vaf.get(10), this);
            this.hs = ypwVar;
            ypwVar.emc(this.vhn);
        }
    }

    private void ffd() {
        float f10 = this.wad ? this.wpn : this.yz;
        float f11 = this.but ? this.wa : this.yz;
        float f12 = this.wd ? this.pxa : this.yz;
        float f13 = this.ffd ? this.rqm : this.yz;
        this.kv.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    private void ru() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.gbl);
        this.bw.setContentDescription(sb);
    }

    private void wd() {
        if (TextUtils.equals("dashed", this.xhi)) {
            GradientDrawable gradientDrawable = this.kv;
            float f10 = this.ndl;
            gradientDrawable.setStroke((int) f10, this.hj, 3.0f * f10, f10);
        } else {
            if (!TextUtils.equals("dotted", this.xhi)) {
                this.kv.setStroke((int) this.ndl, this.hj);
                return;
            }
            GradientDrawable gradientDrawable2 = this.kv;
            float f11 = this.ndl;
            gradientDrawable2.setStroke((int) f11, this.hj, f11 / 2.0f, f11);
        }
    }

    private void zz() throws JSONException {
        sz szVar;
        if (this.vhn == null || !ypw(18) || (szVar = this.vaf.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectXq = szVar.xq();
        if (jSONObjectXq != null) {
            try {
                jSONObjectXq.put("rotateZ", com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectXq.optString("rotateZ"), this.dg));
            } catch (JSONException unused) {
            }
        }
        this.vhn.emc(szVar, this, this);
    }

    public float aa() {
        return this.pm;
    }

    public boolean but() {
        return this.xxo;
    }

    public xq<T> bw(String str) {
        return emc(str);
    }

    public float cf() {
        return this.pe;
    }

    public emc cuf() {
        return this.ycc;
    }

    public JSONObject db() {
        return this.xq;
    }

    public ViewGroup.LayoutParams dr() {
        return this.wbn;
    }

    public long ee() {
        return this.ng;
    }

    public T emc() {
        return null;
    }

    public T gbl() {
        return this.bw;
    }

    public cf hxp() {
        return this.vhn;
    }

    public int iyl() {
        return (int) this.sz;
    }

    public boolean lt() {
        return this.ru;
    }

    public String mkp() {
        return this.sup;
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void msw() {
        ru ruVar = this.av;
        if (ruVar != null) {
            ruVar.ypw();
        }
        com.bytedance.adsdk.ugeno.emc.emc emcVar = this.jp;
        if (emcVar != null) {
            emcVar.xq();
        }
        com.bytedance.adsdk.ugeno.emc.ycc yccVar = this.ltx;
        if (yccVar != null) {
            yccVar.xq();
        }
    }

    public int mxo() {
        return (int) this.qh;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        bw bwVar;
        cf cfVar;
        com.bytedance.adsdk.ugeno.core.ypw.xq xqVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            wo();
        } else if (action == 1 || action == 3) {
            xxg();
        }
        vk vkVar = this.pxj;
        if (vkVar != null) {
            vkVar.emc(this, motionEvent);
        }
        if (ypw(17) && motionEvent.getAction() == 0) {
            this.vhn.emc(this.vaf.get(17), this, this);
        }
        if (ypw(1) && this.fxt && (cfVar = this.vhn) != null && (xqVar = this.igv) != null) {
            return xqVar.emc(cfVar, this, motionEvent);
        }
        cf cfVar2 = this.vhn;
        if (cfVar2 != null && (bwVar = this.sx) != null) {
            return bwVar.emc(cfVar2, this, motionEvent, but());
        }
        zz zzVar = this.kkn;
        if (zzVar != null) {
            return zzVar.emc(motionEvent);
        }
        return false;
    }

    public float pxa() {
        T t10 = this.bw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.emc.uym) {
            return ((com.bytedance.adsdk.ugeno.emc.uym) t10).getShine();
        }
        return 0.0f;
    }

    public void qh() {
        this.bw.setPadding((int) (this.cuf ? this.sb : this.db), (int) (this.mkp ? this.dr : this.db), (int) (this.rtt ? this.sf : this.db), (int) (this.iyl ? this.xmt : this.db));
    }

    public com.bytedance.adsdk.ugeno.dg.emc.emc ra() {
        return this.vyk;
    }

    public float rie() {
        return this.yz;
    }

    public float rqm() {
        T t10 = this.bw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.emc.uym) {
            return ((com.bytedance.adsdk.ugeno.emc.uym) t10).getRubIn();
        }
        return 0.0f;
    }

    public String rtt() {
        return this.gbl;
    }

    public void sb() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapEmc;
        if (TextUtils.isEmpty(this.tp)) {
            if (this.qhy) {
                emc(this.hoq);
                return;
            } else {
                this.kv.setColor(this.mxo);
                dg(this.mxo);
                return;
            }
        }
        if (!this.tp.startsWith("local://")) {
            sf();
            return;
        }
        String strReplace = this.tp.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.wo ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.ypw.getResources().openRawResource(com.bytedance.adsdk.ugeno.uym.dg.ypw(this.ypw, strReplace)), null, options);
            if (this.wo && (bitmapEmc = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, bitmapDecodeStream, (int) this.ra)) != null) {
                bitmapDrawable = new BitmapDrawable(this.ypw.getResources(), bitmapEmc);
                emc(bitmapDrawable);
            } else {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.ypw.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
                emc(bitmapDrawable);
            }
        } catch (Throwable unused) {
        }
    }

    public float sba() {
        return this.ipv;
    }

    public void sf() {
        com.bytedance.adsdk.ugeno.bw.emc().ypw().emc(this.zz, this.tp, new emc.InterfaceC0094emc() { // from class: com.bytedance.adsdk.ugeno.ypw.xq.4
            @Override // com.bytedance.adsdk.ugeno.emc.InterfaceC0094emc
            public void emc(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                xq xqVar = xq.this;
                if (!xqVar.wo) {
                    com.bytedance.adsdk.ugeno.uym.msw.emc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ypw.xq.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            xq.this.emc(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapEmc = com.bytedance.adsdk.ugeno.uym.msw.emc(xqVar.ypw, bitmap, (int) xqVar.ra);
                if (bitmapEmc != null) {
                    com.bytedance.adsdk.ugeno.uym.msw.emc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ypw.xq.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            xq.this.emc(new BitmapDrawable(bitmapEmc));
                        }
                    });
                }
            }
        });
    }

    public float sra() {
        return this.vum;
    }

    public JSONObject sup() {
        return this.dg;
    }

    public void sz() {
        this.xxo = this.dg.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.xxo);
    }

    public boolean tp() {
        return this.nw;
    }

    public float ul() {
        return this.ej;
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void uym() {
        com.bytedance.adsdk.ugeno.core.emc emcVar = this.qp;
        if (emcVar != null) {
            ru ruVar = new ru(this.bw, emcVar);
            this.av = ruVar;
            ruVar.emc();
        }
        com.bytedance.adsdk.ugeno.emc.emc emcVar2 = this.jp;
        if (emcVar2 != null) {
            emcVar2.emc();
        }
        com.bytedance.adsdk.ugeno.emc.ycc yccVar = this.ltx;
        if (yccVar != null) {
            yccVar.ypw();
        }
        zz zzVar = this.kkn;
        if (zzVar != null) {
            zzVar.bw();
        }
        if (this.hs != null && ypw(10)) {
            this.hs.emc();
        }
        if (this.iat != null && ypw(9)) {
            this.iat.emc();
        }
        bw bwVar = this.sx;
        if (bwVar != null) {
            bwVar.emc();
        }
        this.ng = System.currentTimeMillis();
    }

    public float vk() {
        return this.yid;
    }

    public int vw() {
        return this.mxo;
    }

    public float wa() {
        T t10 = this.bw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.emc.uym) {
            return ((com.bytedance.adsdk.ugeno.emc.uym) t10).getStretch();
        }
        return 0.0f;
    }

    public boolean wad() {
        return this.etw;
    }

    public void wo() {
    }

    public float wpn() {
        T t10 = this.bw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.emc.uym) {
            return ((com.bytedance.adsdk.ugeno.emc.uym) t10).getRipple();
        }
        return 0.0f;
    }

    public uym.emc xmt() {
        return this.msw;
    }

    public void xxg() {
    }

    public xq<T> ycc(String str) {
        return ypw(str);
    }

    public float ylm() {
        return this.yuz;
    }

    public void ypw(JSONObject jSONObject) {
        this.dg = jSONObject;
        sz();
    }

    public boolean yz() {
        return this.fu > 0.0f;
    }

    public float yzg() {
        return this.jxk;
    }

    public xq(Context context, emc<ViewGroup> emcVar) {
        this.sz = -2.0f;
        this.qh = -2.0f;
        this.xhi = "solid";
        this.cn = 0;
        this.nw = true;
        this.rig = 0.0f;
        this.pe = 0.0f;
        this.yid = 0.0f;
        this.bv = 1.0f;
        this.pm = 1.0f;
        this.ipv = 1.0f;
        this.rgy = 0.0f;
        this.jxk = 0.0f;
        this.ej = 0.0f;
        this.yuz = 0.0f;
        this.vum = 1.0f;
        this.sg = true;
        this.cwv = true;
        this.wq = false;
        this.xou = false;
        this.xxo = false;
        this.ye = 12.0f;
        this.ypw = context;
        this.ycc = emcVar;
        this.vaf = new HashMap();
        this.kv = new GradientDrawable();
        this.bw = (T) emc();
    }

    private boolean cf(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    private void xq() {
        if (this.emc) {
            this.bw.setTranslationX(this.pe);
        }
        if (this.dpk) {
            this.bw.setTranslationY(this.yid);
        }
        if (this.hh) {
            this.bw.setScaleX(this.pm);
        }
        if (this.ge) {
            this.bw.setScaleY(this.ipv);
        }
        if (this.oa) {
            this.bw.setRotation(this.rgy);
        }
        if (this.nx) {
            this.bw.setRotationX(this.jxk);
        }
        if (this.zhk) {
            this.bw.setRotationY(-this.ej);
        }
        if (this.dor) {
            this.bw.setAlpha(this.vum);
        }
        float f10 = this.yuz;
        if (f10 != 0.0f) {
            this.bw.setRotation(f10);
        }
        if (this.oa || this.nx || this.zhk) {
            this.bw.setCameraDistance(10000.0f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void bw() {
        if (this.ya == null || this.tc) {
            return;
        }
        this.tc = true;
    }

    public void emc(JSONObject jSONObject) throws JSONException {
        this.dg = jSONObject;
        sz();
        JSONObject jSONObject2 = this.xq;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        emc.C0102emc c0102emcRu = o.a(this.ycc) ? this.ycc.ru() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(this.xq.optString(next), jSONObject);
            emc(next, strEmc);
            if (c0102emcRu != null) {
                c0102emcRu.emc(this.ypw, next, strEmc);
            }
        }
        if (c0102emcRu != null) {
            emc(c0102emcRu.emc());
        }
        if (this.ff == null || this.dg == null) {
            return;
        }
        try {
            if (!lt()) {
                this.dg.put("i18n", this.ff);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.ff);
            this.dg.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    public List<com.bytedance.adsdk.ugeno.dg.dg.xq> gbl(String str) {
        zz zzVar;
        if (TextUtils.isEmpty(str) || (zzVar = this.kkn) == null) {
            return null;
        }
        return zzVar.emc(str);
    }

    public com.bytedance.adsdk.ugeno.dg.dg.xq sup(String str) {
        zz zzVar;
        if (TextUtils.isEmpty(str) || (zzVar = this.kkn) == null) {
            return null;
        }
        return zzVar.ypw(str);
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void ycc() {
        if (this.ya == null || this.rr) {
            return;
        }
        this.rr = true;
    }

    public com.bytedance.adsdk.ugeno.emc.emc sz(String str) {
        com.bytedance.adsdk.ugeno.emc.emc emcVar = this.jp;
        if (emcVar != null && TextUtils.equals(str, emcVar.bw())) {
            return this.jp;
        }
        com.bytedance.adsdk.ugeno.emc.ycc yccVar = this.ltx;
        if (yccVar != null) {
            return yccVar.emc(str);
        }
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void ypw() throws JSONException {
        sb();
        qh();
        xq(this.cn);
        xq();
        dg();
        zz zzVar = this.kkn;
        if (zzVar != null) {
            zzVar.emc();
            this.kkn.ypw();
            this.kkn.xq();
        }
        this.bw.setOnTouchListener(this);
        ru();
        ViewGroup viewGroup = (ViewGroup) this.bw.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.sg);
        }
        com.bytedance.adsdk.ugeno.emc.emc emcVar = this.jp;
        if (emcVar != null) {
            emcVar.dg();
        }
        com.bytedance.adsdk.ugeno.emc.ycc yccVar = this.ltx;
        if (yccVar != null) {
            yccVar.emc();
        }
        zz zzVar2 = this.kkn;
        if (zzVar2 != null) {
            zzVar2.dg();
        }
        if (this.vhn == null || !ypw(22)) {
            return;
        }
        this.vhn.emc(this.vaf.get(22), this, this);
    }

    public void ru(String str) {
        this.sup = str;
    }

    public void bw(int i10) {
        if (lt()) {
            T t10 = this.bw;
            if (t10 instanceof ypw) {
                ((ypw) t10).emc(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof ypw) {
                ((ypw) viewParent).emc(this.bw, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.bw.getLayoutParams();
        layoutParams.width = i10;
        this.bw.setLayoutParams(layoutParams);
    }

    public void ycc(int i10) {
        if (lt()) {
            T t10 = this.bw;
            if (t10 instanceof ypw) {
                ((ypw) t10).ypw(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof ypw) {
                ((ypw) viewParent).ypw(this.bw, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.bw.getLayoutParams();
        layoutParams.height = i10;
        this.bw.setLayoutParams(layoutParams);
    }

    private ImageView.ScaleType qh(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.vw = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.vw = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.vw = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.vw = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.vw;
    }

    public xq<T> msw(String str) {
        return dg(str);
    }

    public void zz(String str) {
        this.gbl = str;
    }

    public xq<T> uym(String str) {
        return xq(str);
    }

    public void emc(sba sbaVar) {
        this.ya = sbaVar;
    }

    public void emc(vk vkVar) {
        this.pxj = vkVar;
    }

    public void emc(cf cfVar) {
        this.vhn = cfVar;
    }

    public void xq(int i10) {
        ViewParent viewParent = (ViewGroup) this.bw.getParent();
        if (viewParent instanceof ypw) {
            ((ypw) viewParent).xq(this.bw, i10);
        } else {
            this.bw.setVisibility(i10);
        }
    }

    public void emc(emc.C0097emc c0097emc) {
        if (c0097emc == null) {
            return;
        }
        this.kv.setShape(0);
        this.kv.setOrientation(c0097emc.emc);
        if (Build.VERSION.SDK_INT >= 29) {
            this.kv.setColors(c0097emc.ypw, c0097emc.xq);
        } else {
            this.kv.setColors(c0097emc.ypw);
        }
        ffd();
        wd();
        this.bw.setBackground(this.kv);
    }

    public boolean ypw(int i10) {
        Map<Integer, sz> map = this.vaf;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    public void xq(JSONObject jSONObject) {
        this.xq = jSONObject;
    }

    public xq<T> ypw(String str) {
        if (TextUtils.isEmpty(this.sup) || !TextUtils.equals(this.sup, str)) {
            return null;
        }
        return this;
    }

    public xq<T> xq(String str) {
        if (!TextUtils.isEmpty(this.sup) && TextUtils.equals(this.sup, str) && this.cn == 0) {
            return this;
        }
        return null;
    }

    public void ypw(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.vaf == null) {
            return;
        }
        try {
            int iEmc = qh.emc(str).emc();
            sz szVar = new sz();
            szVar.emc(iEmc);
            szVar.emc(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iEmc == 3) {
                try {
                    this.ye = Float.parseFloat(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("shakeAmplitude"), this.dg));
                } catch (NumberFormatException unused) {
                    this.ye = 12.0f;
                }
            }
            if (!(this.vhn instanceof com.bytedance.adsdk.ugeno.core.emc.ypw)) {
                emc(iEmc, jSONObject, szVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    public void emc(Drawable drawable) {
        this.bw.setBackground(drawable);
    }

    public void dg(int i10) {
        this.kv.setShape(0);
        this.kv.setColor(i10);
        ffd();
        wd();
        this.bw.setBackground(this.kv);
    }

    public void emc(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.bw;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.wbn = layoutParams;
    }

    public void emc(boolean z10, boolean z11) {
        if (this.bw != null) {
            emc(this.wbn);
            if (z10) {
                bw((int) this.sz);
            }
            if (z11) {
                ycc((int) this.qh);
            }
        }
    }

    public xq<T> dg(String str) {
        if (sz(str) != null) {
            return this;
        }
        return null;
    }

    public void emc(uym.emc emcVar) {
        this.msw = emcVar;
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void ypw(Canvas canvas) {
        if (this instanceof emc) {
            com.bytedance.adsdk.ugeno.emc.emc emcVar = this.jp;
            if (emcVar != null) {
                emcVar.ypw(canvas);
            }
            com.bytedance.adsdk.ugeno.emc.ycc yccVar = this.ltx;
            if (yccVar != null) {
                yccVar.ypw(canvas);
            }
        }
    }

    public xq<T> emc(String str) {
        if (TextUtils.isEmpty(this.gbl) || !TextUtils.equals(this.gbl, str)) {
            return null;
        }
        return this;
    }

    public void emc(boolean z10) {
        this.ru = z10;
    }

    public void emc(emc emcVar) {
        this.ycc = emcVar;
    }

    public void emc(gbl gblVar) {
        this.zz = gblVar;
    }

    public void emc(msw mswVar) {
        this.se = mswVar;
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void ypw(int i10, int i11, int i12, int i13) {
        ru ruVar = this.av;
        if (ruVar != null) {
            ruVar.emc(i10, i11);
        }
        com.bytedance.adsdk.ugeno.emc.emc emcVar = this.jp;
        if (emcVar != null) {
            emcVar.emc(i10, i11);
        }
        com.bytedance.adsdk.ugeno.emc.ycc yccVar = this.ltx;
        if (yccVar != null) {
            yccVar.emc(i10, i11);
        }
    }

    public void emc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "clickable":
                this.cwv = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, true);
                break;
            case "onRenderSuccess":
            case "onDelay":
            case "onShake":
            case "onSlide":
            case "onTimer":
            case "onTwist":
            case "onDown":
            case "onTap":
            case "onLoadMore":
            case "onExposure":
            case "onAnimation":
            case "onPullToRefresh":
            case "onScroll":
            case "onLongTap":
                ypw(str, str2);
                break;
            case "translateX":
                this.emc = true;
                this.pe = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "translateY":
                this.dpk = true;
                this.yid = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "paddingLeft":
                this.sb = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.cuf = true;
                break;
            case "minWidth":
                this.ul = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "background":
            case "backgroundColor":
                if (com.bytedance.adsdk.ugeno.uym.emc.xq(str2)) {
                    this.qhy = true;
                    this.hoq = com.bytedance.adsdk.ugeno.uym.emc.ypw(str2);
                    break;
                } else {
                    this.mxo = com.bytedance.adsdk.ugeno.uym.emc.emc(str2, 0);
                    this.qhy = false;
                    break;
                }
            case "events":
                this.kkn = zz.emc(this, str2);
                break;
            case "opacity":
                this.dor = true;
                this.vum = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1.0f);
                break;
            case "borderTopLeftRadius":
                this.wpn = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.wad = true;
                break;
            case "height":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.qh = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.qh = -2.0f;
                } else {
                    this.qh = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                }
                this.xou = true;
                break;
            case "margin":
                this.cf = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                break;
            case "marginTop":
                this.sba = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.hxp = true;
                break;
            case "backgroundDrawable":
            case "backgroundImage":
                this.tp = str2;
                break;
            case "rotate":
                this.oa = true;
                this.rgy = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "scaleX":
                this.hh = true;
                this.pm = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "scaleY":
                this.ge = true;
                this.ipv = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "padding":
                this.db = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.lt = true;
                break;
            case "triggerFunc":
                this.oug = str2;
                break;
            case "marginBottom":
                this.yzg = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.ee = true;
                break;
            case "minHeight":
                this.ylm = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "id":
                this.gbl = str2;
                break;
            case "i18n":
                this.ff = com.bytedance.adsdk.ugeno.uym.ypw.emc(str2, (JSONObject) null);
                break;
            case "name":
                this.sup = str2;
                break;
            case "backgroundImageBlur":
                float fEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                this.ra = fEmc;
                if (fEmc > 0.0f) {
                    this.wo = true;
                    break;
                }
                break;
            case "paddingTop":
                this.dr = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.mkp = true;
                break;
            case "click":
                this.gyw = str2;
                break;
            case "ratio":
                this.fu = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "scale":
                this.hh = true;
                this.ge = true;
                float[] fArrXq = com.bytedance.adsdk.ugeno.emc.dg.xq(str2);
                this.pm = fArrXq[0];
                this.ipv = fArrXq[1];
                break;
            case "width":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.sz = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.sz = -2.0f;
                } else {
                    this.sz = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                }
                this.wq = true;
                break;
            case "paddingBottom":
                this.xmt = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.iyl = true;
                break;
            case "animations":
                List<com.bytedance.adsdk.ugeno.emc.xq> listEmc = com.bytedance.adsdk.ugeno.emc.dg.emc(str2, this.dg);
                if (listEmc != null && !listEmc.isEmpty()) {
                    this.ltx = new com.bytedance.adsdk.ugeno.emc.ycc(this.ypw, this, listEmc);
                    break;
                }
                break;
            case "borderTopRightRadius":
                this.wa = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.but = true;
                break;
            case "overflow":
                this.sg = cf(str2);
                break;
            case "borderBottomLeftRadius":
                this.pxa = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.wd = true;
                break;
            case "borderBottomRightRadius":
                this.rqm = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.ffd = true;
                break;
            case "paddingRight":
                this.sf = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.rtt = true;
                break;
            case "borderColor":
                this.hj = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "borderStyle":
                this.xhi = str2;
                break;
            case "borderWidth":
                this.ndl = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                break;
            case "marginRight":
                this.f9216aa = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.rie = true;
                break;
            case "translate":
                this.emc = true;
                this.dpk = true;
                float[] fArrXq2 = com.bytedance.adsdk.ugeno.emc.dg.xq(str2);
                this.pe = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, fArrXq2[0]);
                this.yid = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, fArrXq2[1]);
                break;
            case "animation":
                try {
                    this.jp = new com.bytedance.adsdk.ugeno.emc.emc(this.ypw, this, com.bytedance.adsdk.ugeno.emc.dg.emc(new JSONObject(str2), this.dg));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            case "animatorSet":
                this.qp = com.bytedance.adsdk.ugeno.core.emc.emc(str2, this);
                break;
            case "backgroundScale":
                this.xxg = true;
                this.vw = qh(str2);
                break;
            case "borderRadius":
                this.yz = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                break;
            case "rotateX":
                this.nx = true;
                this.jxk = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "rotateY":
                this.zhk = true;
                this.ej = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "rotateZ":
                this.yuz = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "disable":
                this.etw = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, false);
                break;
            case "visibility":
                if (TextUtils.equals("visible", str2)) {
                    this.cn = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.cn = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.cn = 8;
                }
                this.bw.setVisibility(this.cn);
                break;
            case "marginLeft":
                this.vk = com.bytedance.adsdk.ugeno.uym.msw.emc(this.ypw, str2);
                this.sra = true;
                break;
            case "availability":
                this.nw = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public xq ypw(xq xqVar) {
        return (xqVar.cuf() == null && (xqVar instanceof emc)) ? xqVar : ypw(xqVar.cuf());
    }

    public void ypw(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.dg.dg.xq xqVarSup = sup(str);
        if (xqVarSup == null) {
            return;
        }
        xqVarSup.emc(this.kkn);
        xqVarSup.emc(objArr);
    }

    @Deprecated
    public void emc(int i10, JSONObject jSONObject, sz szVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            sz szVar2 = new sz();
            szVar2.emc(jSONObjectOptJSONObject);
            szVar2.emc(this);
            szVar.emc(szVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("fail");
        if (jSONObjectOptJSONObject2 != null) {
            sz szVar3 = new sz();
            szVar3.emc(jSONObjectOptJSONObject2);
            szVar3.emc(this);
            szVar.ypw(szVar3);
        }
        szVar.emc(jSONObject);
        this.vaf.put(Integer.valueOf(i10), szVar);
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public int[] emc(int i10, int i11) {
        if (this.fu > 0.0f) {
            if (this.wq) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.fu;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.xou) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.fu;
                if (f11 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.ya != null && !this.xst) {
            this.xst = true;
        }
        return new int[]{i10, i11};
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void emc(int i10, int i11, int i12, int i13) {
        if (this.ya == null || this.dm) {
            return;
        }
        this.dm = true;
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void emc(Canvas canvas, IAnimation iAnimation) {
        ru ruVar = this.av;
        if (ruVar != null) {
            ruVar.emc(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dg
    public void emc(Canvas canvas) {
        if (this instanceof emc) {
            return;
        }
        com.bytedance.adsdk.ugeno.emc.emc emcVar = this.jp;
        if (emcVar != null) {
            emcVar.emc(canvas);
        }
        com.bytedance.adsdk.ugeno.emc.ycc yccVar = this.ltx;
        if (yccVar != null) {
            yccVar.emc(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.cf.ypw
    public void emc(sz szVar) {
        emc<ViewGroup> emcVar;
        xq<T> xqVarBw;
        if (szVar == null || szVar.xq() == null || !TextUtils.equals(szVar.xq().optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "onDismiss")) {
            return;
        }
        String strOptString = szVar.xq().optString("nodeId");
        xq(8);
        this.uym = (emc) ypw(this);
        if (TextUtils.isEmpty(strOptString) || (emcVar = this.uym) == null || (xqVarBw = emcVar.bw(strOptString)) == null) {
            return;
        }
        xqVarBw.xq(8);
    }

    public void emc(com.bytedance.adsdk.ugeno.dg.emc.emc emcVar) {
        this.vyk = emcVar;
    }

    public void emc(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listGbl = gbl(str);
        if (listGbl == null || listGbl.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar : listGbl) {
            xqVar.emc(this.kkn);
            xqVar.emc(objArr);
        }
    }

    public void emc(com.bytedance.adsdk.ugeno.core.bw bwVar) {
        zz zzVar = this.kkn;
        if (zzVar != null) {
            zzVar.emc(bwVar);
        }
    }

    public void emc(com.bytedance.adsdk.ugeno.core.ycc yccVar) {
        this.xxs = yccVar;
    }

    public void emc(com.bytedance.adsdk.ugeno.dg.sz szVar) {
        zz zzVar = this.kkn;
        if (zzVar != null) {
            zzVar.emc(szVar);
        }
    }
}
