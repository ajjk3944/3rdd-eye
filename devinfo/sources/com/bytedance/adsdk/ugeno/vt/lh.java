package com.bytedance.adsdk.ugeno.vt;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.jg;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.pno;
import com.bytedance.adsdk.ugeno.core.ra;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.core.tlj;
import com.bytedance.adsdk.ugeno.core.vm;
import com.bytedance.adsdk.ugeno.core.vt.fkw;
import com.bytedance.adsdk.ugeno.core.vt.yu;
import com.bytedance.adsdk.ugeno.ouw;
import com.bytedance.adsdk.ugeno.ouw.le;
import com.bytedance.adsdk.ugeno.ra.ouw;
import com.bytedance.adsdk.ugeno.vt.ouw;
import com.bytedance.adsdk.ugeno.yu;
import com.bytedance.adsdk.ugeno.yu.bly;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class lh<T extends View> implements View.OnTouchListener, ko.ouw, yu {
    private tlj ajl;

    /* renamed from: ak, reason: collision with root package name */
    private boolean f6956ak;
    protected float an;
    private String baa;
    public cf bly;
    protected boolean bs;
    private boolean byv;

    /* renamed from: cd, reason: collision with root package name */
    protected float f6957cd;

    /* renamed from: cf, reason: collision with root package name */
    protected String f6958cf;

    /* renamed from: cj, reason: collision with root package name */
    protected float f6959cj;
    protected le coz;
    private boolean cu;
    public boolean eay;
    private boolean ehk;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.vt.vt eot;
    protected float euf;
    protected boolean ex;
    public String ey;
    protected boolean fak;
    private GradientDrawable fg;
    public T fkw;
    private boolean fn;
    protected boolean fqk;
    protected boolean fvf;
    protected com.bytedance.adsdk.ugeno.ouw.ouw fwd;

    /* renamed from: gh, reason: collision with root package name */
    protected float f6960gh;
    private boolean hsa;
    protected boolean hun;
    public vm ixm;
    protected float jae;

    /* renamed from: jg, reason: collision with root package name */
    protected float f6961jg;
    protected boolean jqy;
    public float jvy;
    protected ko kfa;

    /* renamed from: ki, reason: collision with root package name */
    private boolean f6962ki;
    protected boolean kn;
    protected float ko;
    private boolean kq;
    protected float ksc;

    @Deprecated
    private yu.ouw lai;

    /* renamed from: le, reason: collision with root package name */
    protected ouw<ViewGroup> f6963le;
    public com.bytedance.adsdk.ugeno.yu.ouw.ouw lgp;

    /* renamed from: lh, reason: collision with root package name */
    protected JSONObject f6964lh;
    private boolean ln;
    private boolean lna;
    protected float lso;
    protected float lvd;
    protected float mq;
    public com.bytedance.adsdk.ugeno.core.le ms;
    protected String mt;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.vt.lh mu;
    protected Map<Integer, mwh> mwe;
    protected float mwh;
    protected boolean myk;
    private boolean nbp;

    /* renamed from: ng, reason: collision with root package name */
    protected ViewGroup.LayoutParams f6965ng;
    protected float njr;
    private com.bytedance.adsdk.ugeno.core.ouw nn;
    protected float npr;

    /* renamed from: od, reason: collision with root package name */
    protected float f6966od;
    protected float odc;
    protected int osn;
    private boolean ouw;

    /* renamed from: pd, reason: collision with root package name */
    protected boolean f6967pd;
    protected ra.ouw pno;
    protected float pv;
    protected float qbp;
    protected boolean qld;
    private boolean qni;
    protected ouw<ViewGroup> ra;

    /* renamed from: rh, reason: collision with root package name */
    private JSONObject f6968rh;
    protected float rn;
    protected ImageView.ScaleType rrs;
    protected String ryl;

    /* renamed from: sd, reason: collision with root package name */
    protected float f6969sd;
    private String sm;
    private boolean smu;
    private boolean swm;
    protected boolean tc;

    /* renamed from: th, reason: collision with root package name */
    protected float f6970th;
    protected boolean tlj;

    /* renamed from: ub, reason: collision with root package name */
    protected float f6971ub;
    protected boolean ucs;
    protected boolean uoy;
    protected float uq;
    public float ux;

    /* renamed from: vf, reason: collision with root package name */
    private boolean f6972vf;

    /* renamed from: vh, reason: collision with root package name */
    protected boolean f6973vh;

    /* renamed from: vi, reason: collision with root package name */
    protected float f6974vi;
    protected float vm;
    protected boolean vpp;
    private boolean vrp;
    public Context vt;
    public long wbf;
    protected boolean wp;
    protected int xdk;
    public boolean xn;

    @Deprecated
    private fkw xne;
    private boolean xwt;
    protected float ycd;
    protected int yhj;
    protected float yib;
    protected ouw.C0035ouw yiz;
    public JSONObject yu;
    protected rn yw;
    protected float zih;
    protected float zin;
    protected pno zjp;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.vt.le zjq;
    protected bly zrz;
    private float zu;
    protected float zvq;

    public lh(Context context) {
        this(context, null);
    }

    private void bly() {
        if (TextUtils.equals("dashed", this.mt)) {
            GradientDrawable gradientDrawable = this.fg;
            float f10 = this.yib;
            gradientDrawable.setStroke((int) f10, this.yhj, 3.0f * f10, f10);
        } else {
            if (!TextUtils.equals("dotted", this.mt)) {
                this.fg.setStroke((int) this.yib, this.yhj);
                return;
            }
            GradientDrawable gradientDrawable2 = this.fg;
            float f11 = this.yib;
            gradientDrawable2.setStroke((int) f11, this.yhj, f11 / 2.0f, f11);
        }
    }

    private void jvy() {
        float f10 = this.wp ? this.lso : this.ux;
        float f11 = this.kn ? this.f6959cj : this.ux;
        float f12 = this.ucs ? this.f6971ub : this.ux;
        float f13 = this.f6973vh ? this.pv : this.ux;
        this.fg.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    private void pno() {
        this.eay = this.yu.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.eay);
    }

    public final int cd() {
        return (int) this.f6961jg;
    }

    public final float cf() {
        return this.f6969sd;
    }

    public final boolean ex() {
        return this.tlj;
    }

    public final float ey() {
        T t10 = this.fkw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ouw.ra) {
            return ((com.bytedance.adsdk.ugeno.ouw.ra) t10).getStretch();
        }
        return 0.0f;
    }

    public final boolean fak() {
        return this.zvq > 0.0f;
    }

    public final lh<T> fkw(String str) {
        return ouw(str);
    }

    public final String jae() {
        return this.ryl;
    }

    public final float jg() {
        return this.an;
    }

    public final ra.ouw jqy() {
        return this.pno;
    }

    public final float ko() {
        return this.ycd;
    }

    public final String ksc() {
        return this.f6958cf;
    }

    public void le() throws NumberFormatException {
        com.bytedance.adsdk.ugeno.core.vt.le leVar;
        mwh mwhVar;
        com.bytedance.adsdk.ugeno.core.vt.vt vtVar;
        mwh mwhVar2;
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw;
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        com.bytedance.adsdk.ugeno.core.ouw ouwVar = this.nn;
        if (ouwVar != null) {
            tlj tljVar = new tlj(this.fkw, ouwVar);
            this.ajl = tljVar;
            tljVar.ouw();
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 = this.fwd;
        if (ouwVar2 != null) {
            ouwVar2.ouw();
        }
        le leVar2 = this.coz;
        if (leVar2 != null && (list = leVar2.ouw) != null && !list.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar3 : leVar2.ouw) {
                if (ouwVar3 != null) {
                    ouwVar3.ouw();
                }
            }
        }
        bly blyVar = this.zrz;
        if (blyVar != null && (listOuw = blyVar.ouw("timer")) != null && !listOuw.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
                if (lhVar != null) {
                    lhVar.ouw = blyVar;
                    lhVar.ouw(new Object[0]);
                }
            }
        }
        if (this.eot != null && ouw(10) && (mwhVar2 = (vtVar = this.eot).f6875lh) != null) {
            try {
                int i4 = Integer.parseInt(com.bytedance.adsdk.ugeno.lh.vt.ouw(mwhVar2.f6850lh.optString("delay"), vtVar.yu.yu));
                vtVar.ouw = i4;
                vtVar.fkw.sendEmptyMessageDelayed(1001, i4);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        if (this.zjq != null && ouw(9) && (mwhVar = (leVar = this.zjq).yu) != null) {
            JSONObject jSONObject = mwhVar.f6850lh;
            try {
                leVar.vt = Integer.parseInt(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("interval", "8000"), leVar.fkw.yu));
                leVar.ouw = jSONObject.optBoolean("repeat");
                leVar.f6869le.sendEmptyMessageDelayed(1001, leVar.vt);
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
            }
        }
        final fkw fkwVar = this.xne;
        if (fkwVar != null && fkwVar.yu != Integer.MAX_VALUE) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.vt.fkw.1
                @Override // java.lang.Runnable
                public final void run() {
                    fkw.this.fkw.set(false);
                    Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
                }
            }, fkwVar.yu);
        }
        this.wbf = System.currentTimeMillis();
    }

    public final float mwh() {
        return this.mq;
    }

    public final int od() {
        return (int) this.mwh;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.vt.lh.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final float osn() {
        T t10 = this.fkw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ouw.ra) {
            return ((com.bytedance.adsdk.ugeno.ouw.ra) t10).getShine();
        }
        return 0.0f;
    }

    public T ouw() {
        return null;
    }

    public final int pd() {
        return this.osn;
    }

    public final JSONObject qbp() {
        return this.f6964lh;
    }

    public void ra() {
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        AnimatorSet animatorSet;
        tlj tljVar = this.ajl;
        if (tljVar != null && (animatorSet = tljVar.ouw) != null) {
            animatorSet.cancel();
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
        if (ouwVar != null) {
            ouwVar.vt();
        }
        le leVar = this.coz;
        if (leVar == null || (list = leVar.ouw) == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 : leVar.ouw) {
            if (ouwVar2 != null) {
                ouwVar2.vt();
            }
        }
    }

    public final float rn() {
        return this.odc;
    }

    public final float rrs() {
        T t10 = this.fkw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ouw.ra) {
            return ((com.bytedance.adsdk.ugeno.ouw.ra) t10).getRubIn();
        }
        return 0.0f;
    }

    public final float ryl() {
        return this.euf;
    }

    public final ouw tc() {
        return this.f6963le;
    }

    public final ko th() {
        return this.kfa;
    }

    public void tlj() {
        this.fkw.setPadding((int) (this.fvf ? this.jae : this.ksc), (int) (this.fak ? this.f6957cd : this.ksc), (int) (this.bs ? this.f6966od : this.ksc), (int) (this.uoy ? this.uq : this.ksc));
    }

    public final float uoy() {
        T t10 = this.fkw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ouw.ra) {
            return ((com.bytedance.adsdk.ugeno.ouw.ra) t10).getRipple();
        }
        return 0.0f;
    }

    public final boolean uq() {
        return this.myk;
    }

    public final float vm() {
        return this.npr;
    }

    public final ViewGroup.LayoutParams vpp() {
        return this.f6965ng;
    }

    public final void vt(JSONObject jSONObject) {
        this.yu = jSONObject;
        pno();
    }

    public lh<T> yu(String str) {
        if (cf(str) != null) {
            return this;
        }
        return null;
    }

    public final float zih() {
        return this.f6974vi;
    }

    public void zin() {
        com.bytedance.adsdk.ugeno.fkw.ouw().f6878lh.ouw(this.bly, this.ey, new ouw.InterfaceC0033ouw() { // from class: com.bytedance.adsdk.ugeno.vt.lh.4
            @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0033ouw
            public final void ouw(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                lh lhVar = lh.this;
                if (!lhVar.fqk) {
                    com.bytedance.adsdk.ugeno.ra.ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vt.lh.4.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            lh.this.ouw(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapOuw = com.bytedance.adsdk.ugeno.ra.ra.ouw(lhVar.vt, bitmap, (int) lhVar.jvy);
                if (bitmapOuw != null) {
                    com.bytedance.adsdk.ugeno.ra.ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vt.lh.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            lh.this.ouw(new BitmapDrawable(bitmapOuw));
                        }
                    });
                }
            }
        });
    }

    public lh(Context context, ouw<ViewGroup> ouwVar) {
        this.mwh = -2.0f;
        this.f6961jg = -2.0f;
        this.mt = "solid";
        this.xdk = 0;
        this.myk = true;
        this.lvd = 0.0f;
        this.f6969sd = 0.0f;
        this.euf = 0.0f;
        this.njr = 1.0f;
        this.mq = 1.0f;
        this.an = 1.0f;
        this.f6960gh = 0.0f;
        this.ycd = 0.0f;
        this.odc = 0.0f;
        this.f6974vi = 0.0f;
        this.npr = 1.0f;
        this.xwt = true;
        this.f6956ak = true;
        this.vrp = false;
        this.lna = false;
        this.eay = false;
        this.zu = 12.0f;
        this.vt = context;
        this.f6963le = ouwVar;
        this.mwe = new HashMap();
        this.fg = new GradientDrawable();
        this.fkw = (T) ouw();
    }

    public final com.bytedance.adsdk.ugeno.ouw.ouw cf(String str) {
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
        if (ouwVar != null && TextUtils.equals(str, ouwVar.vt)) {
            return this.fwd;
        }
        le leVar = this.coz;
        if (leVar != null) {
            return leVar.ouw(str);
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void fkw() {
        if (this.ixm == null || this.hsa) {
            return;
        }
        this.hsa = true;
    }

    public final void lh(JSONObject jSONObject) {
        this.f6964lh = jSONObject;
    }

    public void ouw(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        this.yu = jSONObject;
        pno();
        JSONObject jSONObject3 = this.f6964lh;
        if (jSONObject3 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject3.keys();
        ouw<ViewGroup> ouwVar = this.f6963le;
        ouw.C0036ouw c0036ouwBly = ouwVar != null ? ouwVar.bly() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(this.f6964lh.optString(next), jSONObject);
            ouw(next, strOuw);
            if (c0036ouwBly != null) {
                c0036ouwBly.ouw(this.vt, next, strOuw);
            }
        }
        if (c0036ouwBly != null) {
            ouw(c0036ouwBly.ouw());
        }
        JSONObject jSONObject4 = this.f6968rh;
        if (jSONObject4 == null || (jSONObject2 = this.yu) == null) {
            return;
        }
        try {
            if (!this.tlj) {
                jSONObject2.put("i18n", jSONObject4);
                return;
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("i18n", this.f6968rh);
            this.yu.put("xNode", jSONObject5);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void yu() {
        if (this.ixm == null || this.swm) {
            return;
        }
        this.swm = true;
    }

    public final void lh(int i4) {
        this.fg.setShape(0);
        this.fg.setColor(i4);
        jvy();
        bly();
        this.fkw.setBackground(this.fg);
    }

    public final lh<T> pno(String str) {
        return yu(str);
    }

    public final void vt(int i4) {
        ViewParent viewParent = (ViewGroup) this.fkw.getParent();
        if (viewParent instanceof vt) {
            ((vt) viewParent).lh(this.fkw, i4);
        } else {
            this.fkw.setVisibility(i4);
        }
    }

    public final void yu(int i4) {
        if (this.tlj) {
            T t10 = this.fkw;
            if (t10 instanceof vt) {
                ((vt) t10).ouw(i4);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof vt) {
                ((vt) viewParent).ouw(this.fkw, i4);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.fkw.getLayoutParams();
        layoutParams.width = i4;
        this.fkw.setLayoutParams(layoutParams);
    }

    public final void bly(String str) {
        this.f6958cf = str;
    }

    public final void tlj(String str) {
        this.ryl = str;
    }

    public lh<T> vt(String str) {
        if (TextUtils.isEmpty(this.ryl) || !TextUtils.equals(this.ryl, str)) {
            return null;
        }
        return this;
    }

    public lh<T> lh(String str) {
        if (!TextUtils.isEmpty(this.ryl) && TextUtils.equals(this.ryl, str) && this.xdk == 0) {
            return this;
        }
        return null;
    }

    public final void vt(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.mwe == null) {
            return;
        }
        try {
            int i4 = jg.ouw(str).zin;
            mwh mwhVar = new mwh();
            mwhVar.vt = i4;
            mwhVar.ouw = this;
            JSONObject jSONObject = new JSONObject(str2);
            if (i4 == 3) {
                try {
                    this.zu = Float.parseFloat(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("shakeAmplitude"), this.yu));
                } catch (NumberFormatException unused) {
                    this.zu = 12.0f;
                }
            }
            if (!(this.kfa instanceof com.bytedance.adsdk.ugeno.core.ouw.vt)) {
                ouw(i4, jSONObject, mwhVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void lh() {
        if (this.ixm == null || this.nbp) {
            return;
        }
        this.nbp = true;
    }

    public final lh<T> ra(String str) {
        return lh(str);
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void vt(Canvas canvas) {
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        if (this instanceof ouw) {
            com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
            if (ouwVar != null) {
                ouwVar.vt(canvas);
            }
            le leVar = this.coz;
            if (leVar == null || (list = leVar.ouw) == null || list.isEmpty()) {
                return;
            }
            for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 : leVar.ouw) {
                if (ouwVar2 != null) {
                    ouwVar2.vt(canvas);
                }
            }
        }
    }

    private boolean ouw(int i4) {
        Map<Integer, mwh> map = this.mwe;
        return map != null && map.containsKey(Integer.valueOf(i4));
    }

    public void bs() {
    }

    public void fvf() {
    }

    public final void ouw(rn rnVar) {
        this.yw = rnVar;
    }

    public final void ouw(ko koVar) {
        this.kfa = koVar;
    }

    public final void ouw(ouw.C0035ouw c0035ouw) {
        if (c0035ouw == null) {
            return;
        }
        this.fg.setShape(0);
        this.fg.setOrientation(c0035ouw.ouw);
        if (Build.VERSION.SDK_INT >= 29) {
            this.fg.setColors(c0035ouw.vt, c0035ouw.f6949lh);
        } else {
            this.fg.setColors(c0035ouw.vt);
        }
        jvy();
        bly();
        this.fkw.setBackground(this.fg);
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void vt(int i4, int i10) {
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        tlj tljVar = this.ajl;
        if (tljVar != null) {
            tljVar.f6865lh = i4 / 2;
            tljVar.yu = i10 / 2;
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
        if (ouwVar != null) {
            ouwVar.ouw(i4, i10);
        }
        le leVar = this.coz;
        if (leVar == null || (list = leVar.ouw) == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 : leVar.ouw) {
            if (ouwVar2 != null) {
                ouwVar2.ouw(i4, i10);
            }
        }
    }

    public void ouw(Drawable drawable) {
        this.fkw.setBackground(drawable);
    }

    public final void ouw(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.fkw;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.f6965ng = layoutParams;
    }

    public final void ouw(boolean z3, boolean z10) {
        if (this.fkw != null) {
            ouw(this.f6965ng);
            if (z3) {
                yu((int) this.mwh);
            }
            if (z10) {
                int i4 = (int) this.f6961jg;
                if (this.tlj) {
                    T t10 = this.fkw;
                    if (t10 instanceof vt) {
                        ((vt) t10).vt(i4);
                        return;
                    }
                    ViewParent viewParent = (ViewGroup) t10.getParent();
                    if (viewParent instanceof vt) {
                        ((vt) viewParent).vt(this.fkw, i4);
                        return;
                    }
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.fkw.getLayoutParams();
                layoutParams.height = i4;
                this.fkw.setLayoutParams(layoutParams);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void vt() throws JSONException {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapOuw;
        com.bytedance.adsdk.ugeno.core.vt.yu yuVar;
        mwh mwhVar;
        if (TextUtils.isEmpty(this.ey)) {
            if (this.qld) {
                ouw(this.yiz);
            } else {
                this.fg.setColor(this.osn);
                lh(this.osn);
            }
        } else if (this.ey.startsWith("local://")) {
            String strReplace = this.ey.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = this.fqk ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.vt.getResources().openRawResource(com.bytedance.adsdk.ugeno.ra.yu.vt(this.vt, strReplace)), null, options);
                if (this.fqk && (bitmapOuw = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, bitmapDecodeStream, (int) this.jvy)) != null) {
                    bitmapDrawable = new BitmapDrawable(this.vt.getResources(), bitmapOuw);
                    ouw(bitmapDrawable);
                } else {
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.vt.getResources(), bitmapDecodeStream);
                    bitmapDrawable = bitmapDrawable2;
                    ouw(bitmapDrawable);
                }
            } catch (Throwable unused) {
            }
        } else {
            zin();
        }
        tlj();
        vt(this.xdk);
        if (this.ouw) {
            this.fkw.setTranslationX(this.f6969sd);
        }
        if (this.ln) {
            this.fkw.setTranslationY(this.euf);
        }
        if (this.qni) {
            this.fkw.setScaleX(this.mq);
        }
        if (this.smu) {
            this.fkw.setScaleY(this.an);
        }
        if (this.fn) {
            this.fkw.setRotation(this.f6960gh);
        }
        if (this.byv) {
            this.fkw.setRotationX(this.ycd);
        }
        if (this.ehk) {
            this.fkw.setRotationY(-this.odc);
        }
        if (this.f6962ki) {
            this.fkw.setAlpha(this.npr);
        }
        float f10 = this.f6974vi;
        if (f10 != 0.0f) {
            this.fkw.setRotation(f10);
        }
        if (this.fn || this.byv || this.ehk) {
            this.fkw.setCameraDistance(10000.0f);
        }
        this.fkw.setVisibility(this.xdk);
        float f11 = this.f6974vi;
        if (f11 != 0.0f) {
            this.fkw.setRotation(f11);
        }
        ra.ouw ouwVar = this.pno;
        if (ouwVar != null && TextUtils.isEmpty(ouwVar.ra)) {
            this.fkw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.vt.lh.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lh lhVar = lh.this;
                    if (lhVar.zjp != null) {
                        boolean unused2 = lhVar.f6956ak;
                    }
                }
            });
        } else if (ouw(1) && !this.f6972vf) {
            this.fkw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.vt.lh.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    lh lhVar = lh.this;
                    if (lhVar.kfa == null || !lhVar.f6956ak) {
                        return;
                    }
                    lh lhVar2 = lh.this;
                    lhVar2.kfa.ouw(lhVar2.mwe.get(1), lh.this);
                }
            });
        }
        if (this.kfa != null && ouw(4)) {
            if (ouw(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + this.f6958cf);
                this.kq = true;
                this.xne = new fkw(this.vt, this.mwe.get(4), this.mwe.get(1), this.kq, this.eay);
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + this.f6958cf);
                this.xne = new fkw(this.vt, this.mwe.get(4), this.kq, this.eay);
            }
        }
        if (this.kfa != null && ouw(1) && this.f6972vf) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.f6972vf + ", view.id: " + this.f6958cf);
            this.mu = new com.bytedance.adsdk.ugeno.core.vt.lh(this.vt, this.mwe.get(1));
        }
        if (this.kfa != null && ouw(18) && (mwhVar = this.mwe.get(18)) != null) {
            JSONObject jSONObject = mwhVar.f6850lh;
            if (jSONObject != null) {
                try {
                    jSONObject.put("rotateZ", com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("rotateZ"), this.yu));
                } catch (JSONException unused2) {
                }
            }
            this.kfa.ouw(mwhVar, this);
        }
        if (this.kfa != null && ouw(3) && (yuVar = com.bytedance.adsdk.ugeno.fkw.ouw().fkw) != null) {
            this.lai = yuVar.ouw();
            new Object() { // from class: com.bytedance.adsdk.ugeno.vt.lh.3
            };
        }
        if (this.kfa != null && ouw(9)) {
            com.bytedance.adsdk.ugeno.core.vt.le leVar = new com.bytedance.adsdk.ugeno.core.vt.le(this.vt, this.mwe.get(9), this);
            this.zjq = leVar;
            leVar.f6870lh = this.kfa;
        }
        if (ouw(10)) {
            com.bytedance.adsdk.ugeno.core.vt.vt vtVar = new com.bytedance.adsdk.ugeno.core.vt.vt(this.vt, this.mwe.get(10), this);
            this.eot = vtVar;
            vtVar.vt = this.kfa;
        }
        bly blyVar = this.zrz;
        if (blyVar != null) {
            blyVar.ouw();
            this.zrz.vt();
            this.zrz.lh();
        }
        this.fkw.setOnTouchListener(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6958cf);
        this.fkw.setContentDescription(sb2);
        ViewGroup viewGroup = (ViewGroup) this.fkw.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.xwt);
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 = this.fwd;
        if (ouwVar2 != null) {
            ouwVar2.lh();
        }
        le leVar2 = this.coz;
        if (leVar2 != null) {
            leVar2.ouw();
        }
        bly blyVar2 = this.zrz;
        if (blyVar2 != null) {
            blyVar2.yu();
        }
        if (this.kfa == null || !ouw(22)) {
            return;
        }
        this.kfa.ouw(this.mwe.get(22), this);
    }

    public final lh<T> le(String str) {
        return vt(str);
    }

    public final void ouw(ra.ouw ouwVar) {
        this.pno = ouwVar;
    }

    public lh<T> ouw(String str) {
        if (TextUtils.isEmpty(this.f6958cf) || !TextUtils.equals(this.f6958cf, str)) {
            return null;
        }
        return this;
    }

    public final void ouw(boolean z3) {
        this.tlj = z3;
    }

    public final void ouw(ouw ouwVar) {
        this.f6963le = ouwVar;
    }

    public final void ouw(pno pnoVar) {
        this.zjp = pnoVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ouw(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 2094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.vt.lh.ouw(java.lang.String, java.lang.String):void");
    }

    public static lh vt(lh lhVar) {
        while (true) {
            ouw<ViewGroup> ouwVar = lhVar.f6963le;
            if (ouwVar == null && (lhVar instanceof ouw)) {
                return lhVar;
            }
            lhVar = ouwVar;
        }
    }

    public final void vt(String str, Object... objArr) {
        bly blyVar;
        com.bytedance.adsdk.ugeno.yu.yu.lh lhVarVt = (TextUtils.isEmpty(str) || (blyVar = this.zrz) == null) ? null : blyVar.vt(str);
        if (lhVarVt == null) {
            return;
        }
        lhVarVt.ouw = this.zrz;
        lhVarVt.ouw(objArr);
    }

    @Deprecated
    private void ouw(int i4, JSONObject jSONObject, mwh mwhVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            mwh mwhVar2 = new mwh();
            mwhVar2.f6850lh = jSONObjectOptJSONObject;
            mwhVar2.ouw = this;
            mwhVar.yu = mwhVar2;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("fail");
        if (jSONObjectOptJSONObject2 != null) {
            mwh mwhVar3 = new mwh();
            mwhVar3.f6850lh = jSONObjectOptJSONObject2;
            mwhVar3.ouw = this;
            mwhVar.fkw = mwhVar3;
        }
        mwhVar.f6850lh = jSONObject;
        this.mwe.put(Integer.valueOf(i4), mwhVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final int[] ouw(int i4, int i10) {
        if (this.zvq > 0.0f) {
            if (this.vrp) {
                int size = View.MeasureSpec.getSize(i4);
                float f10 = this.zvq;
                if (f10 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.lna) {
                int size2 = View.MeasureSpec.getSize(i10);
                float f11 = this.zvq;
                if (f11 != 0.0f) {
                    i4 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.ixm != null && !this.cu) {
            this.cu = true;
        }
        return new int[]{i4, i10};
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void ouw(Canvas canvas, IAnimation iAnimation) {
        tlj tljVar = this.ajl;
        if (tljVar != null) {
            try {
                if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(tljVar.f6864le)) {
                    return;
                }
                tljVar.fkw.setColor(com.bytedance.adsdk.ugeno.ra.ouw.ouw(tljVar.f6864le, -16777216));
                tljVar.fkw.setAlpha(90);
                ((ViewGroup) tljVar.vt.getParent()).setClipChildren(true);
                canvas.drawCircle(tljVar.f6865lh, tljVar.yu, Math.min(r1, r3) * 2 * iAnimation.getRipple(), tljVar.fkw);
            } catch (Throwable th2) {
                Log.d("UGenAnimation", "ripple animation error " + th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void ouw(Canvas canvas) {
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        if (this instanceof ouw) {
            return;
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
        if (ouwVar != null) {
            ouwVar.ouw(canvas);
        }
        le leVar = this.coz;
        if (leVar == null || (list = leVar.ouw) == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 : leVar.ouw) {
            if (ouwVar2 != null) {
                ouwVar2.ouw(canvas);
            }
        }
    }

    public final void ouw(com.bytedance.adsdk.ugeno.core.fkw fkwVar) {
        bly blyVar = this.zrz;
        if (blyVar != null) {
            blyVar.ouw = fkwVar;
        }
    }

    public final void ouw(com.bytedance.adsdk.ugeno.yu.mwh mwhVar) {
        bly blyVar = this.zrz;
        if (blyVar != null) {
            blyVar.vt = mwhVar;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko.ouw
    public final void ouw(mwh mwhVar) {
        JSONObject jSONObject;
        ouw<ViewGroup> ouwVar;
        lh lhVarOuw;
        if (mwhVar == null || (jSONObject = mwhVar.f6850lh) == null || !TextUtils.equals(jSONObject.optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = mwhVar.f6850lh.optString("nodeId");
        vt(8);
        this.ra = (ouw) vt(this);
        if (TextUtils.isEmpty(strOptString) || (ouwVar = this.ra) == null || (lhVarOuw = ouwVar.ouw(strOptString)) == null) {
            return;
        }
        lhVarOuw.vt(8);
    }

    public final void ouw(String str, Object... objArr) {
        bly blyVar;
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = (TextUtils.isEmpty(str) || (blyVar = this.zrz) == null) ? null : blyVar.ouw(str);
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            lhVar.ouw = this.zrz;
            lhVar.ouw(objArr);
        }
    }
}
