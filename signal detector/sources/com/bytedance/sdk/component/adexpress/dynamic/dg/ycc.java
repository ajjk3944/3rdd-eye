package com.bytedance.sdk.component.adexpress.dynamic.dg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {
    private String aa;
    private int av;
    private boolean but;
    private String bv;
    private boolean bw;
    private String cf;
    private int cn;
    private String cuf;
    private int db;
    private float dg;
    private int dor;
    private JSONObject dpk;
    private double dr;
    private boolean ee;
    private List<emc> ej;
    private float emc;
    private int etw;
    private boolean ffd;
    private boolean fu;
    private String fxt;
    private double gbl;
    private int ge;
    private int gyw;
    private JSONObject hh;
    private String hj;
    private boolean hoq;
    private boolean hs;
    private String hxp;
    private int iat;
    private String igv;
    private int ipv;
    private boolean iyl;
    private int jp;
    private int jxk;
    private double kkn;
    private String knr;
    private int kv;
    private String lt;
    private int ltx;
    private String mkp;
    private float msw;
    private int mxo;
    private boolean ndl;
    private int nw;
    private boolean nx;
    private String oa;
    private int oug;
    private int oz;
    private int pe;
    private boolean pm;
    private int pxa;
    private boolean pxj;
    private String qh;
    private int qhy;
    private String qp;
    private int ra;
    private int rgy;
    private String rie;
    private int rig;
    private int rqm;
    private String rtt;
    private float ru;
    private int sb;
    private String sba;
    private int se;
    private double sf;
    private int sg;
    private String sra;
    private double sup;
    private boolean sx;
    private String sz;
    private String tc;
    private int tp;
    private String ul;
    private float uym;
    private boolean vaf;
    private int vhn;
    private String vk;
    private int vum;
    private int vw;
    private boolean wa;
    private String wad;
    private int wbn;
    private boolean wd;
    private int wo;
    private boolean wpn;
    private JSONObject xhi;
    private String xmt;
    private float xq;
    private String xst;
    private double xxg;
    private boolean xxs;
    private long ya = -1;
    private float ycc;
    private String yid;
    private String ylm;
    private float ypw;
    private int yuz;
    private int yz;
    private String yzg;
    private JSONObject zhk;
    private float zz;

    public static ycc emc(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ycc yccVar = new ycc();
        yccVar.ypw(jSONObject.optString("adType", "embeded"));
        yccVar.cf(jSONObject.optString("clickArea", "creative"));
        yccVar.vk(jSONObject.optString("clickTigger", "click"));
        yccVar.xq(jSONObject.optString("fontFamily", "PingFangSC"));
        yccVar.dg(jSONObject.optString("textAlign", "left"));
        yccVar.bw(jSONObject.optString("color", "#999999"));
        yccVar.ycc(jSONObject.optString("bgColor", "transparent"));
        yccVar.uym(jSONObject.optString("bgImgUrl", ""));
        yccVar.sb(jSONObject.optString("bgImgData", ""));
        yccVar.msw(jSONObject.optString("borderColor", "#000000"));
        yccVar.zz(jSONObject.optString("borderStyle", "solid"));
        yccVar.ru(jSONObject.optString("heightMode", "auto"));
        yccVar.gbl(jSONObject.optString("widthMode", "fixed"));
        yccVar.sup(jSONObject.optString("interactText", ""));
        yccVar.xq(jSONObject.optBoolean("isShowBgControl", false));
        yccVar.sz(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            yccVar.uym(jSONObjectOptJSONObject.optInt("translateY", 0));
            yccVar.msw(jSONObjectOptJSONObject.optInt("translateX", 0));
            yccVar.dg(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            yccVar.bw(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        yccVar.qh(jSONObject.optString("interactType", ""));
        yccVar.bw(jSONObject.optInt("interactSlideDirection", -1));
        yccVar.aa(jSONObject.optString("justifyHorizontal", "space-around"));
        yccVar.sba(jSONObject.optString("justifyVertical", "flex-start"));
        yccVar.ypw(jSONObject.optDouble("timingStart"));
        yccVar.xq(jSONObject.optDouble("timingEnd"));
        yccVar.dg((float) jSONObject.optDouble("width", 0.0d));
        yccVar.xq((float) jSONObject.optDouble("height", 0.0d));
        yccVar.emc((float) jSONObject.optDouble("borderRadius", 0.0d));
        yccVar.ypw((float) jSONObject.optDouble("borderSize", 0.0d));
        yccVar.ypw(jSONObject.optBoolean("interactValidate", false));
        yccVar.zz((float) jSONObject.optDouble("fontSize", 0.0d));
        yccVar.bw((float) jSONObject.optDouble("paddingBottom", 0.0d));
        yccVar.ycc((float) jSONObject.optDouble("paddingLeft", 0.0d));
        yccVar.uym((float) jSONObject.optDouble("paddingRight", 0.0d));
        yccVar.msw((float) jSONObject.optDouble("paddingTop", 0.0d));
        yccVar.dg(jSONObject.optBoolean("lineFeed", false));
        yccVar.zz(jSONObject.optInt("lineCount", 0));
        yccVar.ycc(jSONObject.optDouble("lineHeight", 1.2d));
        yccVar.qh(jSONObject.optInt("letterSpacing", 0));
        yccVar.bw(jSONObject.optBoolean("isDataFixed", false));
        yccVar.cf(jSONObject.optInt("fontWeight"));
        yccVar.ycc(jSONObject.optBoolean("lineLimit"));
        yccVar.vk(jSONObject.optInt("position"));
        yccVar.yzg(jSONObject.optString("align"));
        yccVar.uym(jSONObject.optBoolean("useLeft"));
        yccVar.msw(jSONObject.optBoolean("useRight"));
        yccVar.zz(jSONObject.optBoolean("useTop"));
        yccVar.ru(jSONObject.optBoolean("useBottom"));
        yccVar.ul(jSONObject.optString("data"));
        yccVar.ypw(jSONObject.optJSONObject("i18n"));
        yccVar.sup(jSONObject.optInt("marginLeft"));
        yccVar.sz(jSONObject.optInt("marginRight"));
        yccVar.ru(jSONObject.optInt("marginTop"));
        yccVar.gbl(jSONObject.optInt("marginBottom"));
        yccVar.aa(jSONObject.optInt("tagMaxCount"));
        yccVar.gbl(jSONObject.optBoolean("allowTextFlow"));
        yccVar.sba(jSONObject.optInt("textFlowType"));
        yccVar.yzg(jSONObject.optInt("textFlowDuration"));
        yccVar.ul(jSONObject.optInt("left"));
        yccVar.ylm(jSONObject.optInt("right"));
        yccVar.sra(jSONObject.optInt("top"));
        yccVar.rie(jSONObject.optInt("bottom"));
        yccVar.ylm(jSONObject.optString("alignItems", "flex-start"));
        yccVar.sra(jSONObject.optString("direction", ""));
        yccVar.emc(jSONObject.optBoolean("loop", false));
        yccVar.hxp(jSONObject.optInt("zIndex"));
        yccVar.dr(jSONObject.optInt("interactVisibleTime"));
        yccVar.ee(jSONObject.optInt("interactHiddenTime"));
        yccVar.sz(jSONObject.optBoolean("interactEnableMask"));
        yccVar.qh(jSONObject.optBoolean("interactWontHide"));
        yccVar.emc(jSONObject.optString("bgGradient"));
        yccVar.lt(jSONObject.optInt("areaType"));
        yccVar.cuf(jSONObject.optInt("interactSlideThreshold", 0));
        yccVar.iyl(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.dg.ypw() ? 0 : 120));
        yccVar.sba(jSONObject.optBoolean("openPlayableLandingPage", false));
        yccVar.xq(jSONObject.optJSONObject("video"));
        yccVar.dg(jSONObject.optJSONObject("image"));
        yccVar.rtt(jSONObject.optInt("borderShadowExtent"));
        yccVar.cf(jSONObject.optBoolean("bgGauseBlur"));
        yccVar.mkp(jSONObject.optInt("bgGauseBlurRadius"));
        yccVar.vk(jSONObject.optBoolean("showTimeProgress", false));
        yccVar.aa(jSONObject.optBoolean("showPlayButton", false));
        yccVar.emc(jSONObject.optDouble("bgColorCg", 0.0d));
        yccVar.ycc(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        yccVar.ypw(jSONObject.optInt("borderTopLeftRadius", 0));
        yccVar.emc(jSONObject.optInt("borderTopRightRadius", 0));
        yccVar.dg(jSONObject.optInt("borderBottomLeftRadius", 0));
        yccVar.xq(jSONObject.optInt("borderBottomRightRadius", 0));
        yccVar.bw(jSONObject.optJSONObject("interactI18n"));
        yccVar.hxp(jSONObject.optString("imageObjectFit"));
        yccVar.ee(jSONObject.optString("interactTitle"));
        yccVar.xmt(jSONObject.optInt("interactTextPositionTop"));
        yccVar.rie(jSONObject.optString("imageLottieTosPath"));
        yccVar.sup(jSONObject.optBoolean("animationsLoop"));
        yccVar.db(jSONObject.optInt("lottieAppNameMaxLength"));
        yccVar.sf(jSONObject.optInt("lottieAdDescMaxLength"));
        yccVar.sb(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    emc emcVar = new emc();
                    emcVar.xq(jSONObject2.optString("animationType"));
                    emcVar.emc(jSONObject2.optDouble("animationDuration"));
                    emcVar.ypw(jSONObject2.optDouble("animationScaleX"));
                    emcVar.xq(jSONObject2.optDouble("animationScaleY"));
                    emcVar.dg(jSONObject2.optString("animationTimeFunction"));
                    emcVar.dg(jSONObject2.optDouble("animationDelay"));
                    emcVar.ycc(jSONObject2.optInt("animationIterationCount"));
                    emcVar.bw(jSONObject2.optString("animationDirection"));
                    emcVar.bw(jSONObject2.optDouble("animationInterval"));
                    emcVar.emc(jSONObject2.optInt("animationBorderWidth"));
                    emcVar.emc(jSONObject2.optLong("key"));
                    emcVar.ypw(jSONObject2.optInt("animationEffectWidth"));
                    emcVar.xq(jSONObject2.optInt("animationSwing", 1));
                    emcVar.dg(jSONObject2.optInt("animationTranslateX"));
                    emcVar.bw(jSONObject2.optInt("animationTranslateY"));
                    emcVar.ypw(jSONObject2.optString("animationRippleBackgroundColor"));
                    emcVar.emc(jSONObject2.optString("animationScaleDirection"));
                    emcVar.uym(jSONObject2.optInt("animationFadeStart"));
                    emcVar.msw(jSONObject2.optInt("animationFadeEnd"));
                    emcVar.ycc(jSONObject2.optString("animationFillMode"));
                    emcVar.zz(jSONObject2.optInt("animationBounceHeight"));
                    if (yccVar.yzg() > 0.0d) {
                        emcVar.dg(emcVar.qh() + yccVar.yzg());
                    }
                    arrayList.add(emcVar);
                }
                yccVar.emc(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                yccVar.db(jSONObject.optString("triggerSlideDirection", "0"));
                yccVar.emc(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return yccVar;
    }

    private void sb(String str) {
        this.tc = str;
    }

    public float aa() {
        return this.zz;
    }

    public void av() {
        emc(this, this.dpk);
    }

    public int but() {
        return this.yz;
    }

    public int bv() {
        return this.wbn;
    }

    public int bw() {
        return this.gyw;
    }

    public float cf() {
        return this.uym;
    }

    public boolean cn() {
        return this.but;
    }

    public int cuf() {
        return this.db;
    }

    public String db() {
        return this.yzg;
    }

    public int dg() {
        return this.kv;
    }

    public int dor() {
        return this.vum;
    }

    public boolean dpk() {
        return this.nx;
    }

    public String dr() {
        return this.rie;
    }

    public String ee() {
        return this.tc;
    }

    public String ej() {
        return this.yid;
    }

    public boolean etw() {
        return this.pxj;
    }

    public int ffd() {
        return this.pxa;
    }

    public boolean fu() {
        return this.wd;
    }

    public String fxt() {
        return this.knr;
    }

    public float gbl() {
        return this.emc;
    }

    public int ge() {
        return this.iat;
    }

    public boolean gyw() {
        return this.xxs;
    }

    public String hh() {
        return this.qp;
    }

    public int hj() {
        return this.rqm;
    }

    public boolean hoq() {
        return this.hs;
    }

    public String hs() {
        return this.oa;
    }

    public String hxp() {
        return this.sba;
    }

    public int iat() {
        return this.qhy;
    }

    public boolean igv() {
        return this.hoq;
    }

    public int ipv() {
        return this.ltx;
    }

    public double iyl() {
        return this.dr;
    }

    public String jp() {
        return this.hj;
    }

    public int jxk() {
        return this.pe;
    }

    public int kkn() {
        return this.jxk;
    }

    public long knr() {
        return this.ya;
    }

    public int kv() {
        return this.vhn;
    }

    public boolean lt() {
        return this.ee;
    }

    public JSONObject ltx() {
        return this.xhi;
    }

    public double mkp() {
        return this.sf;
    }

    public double msw() {
        return this.kkn;
    }

    public String mxo() {
        return this.xmt;
    }

    public boolean ndl() {
        return this.wa;
    }

    public boolean nw() {
        return this.ffd;
    }

    public int nx() {
        List<emc> list = this.ej;
        if (list == null) {
            return 0;
        }
        for (emc emcVar : list) {
            if ("translate".equals(emcVar.zz()) && emcVar.uym() < 0) {
                return -emcVar.uym();
            }
        }
        return 0;
    }

    public List<emc> oa() {
        return this.ej;
    }

    public void oug() {
        emc(this, this.hh);
    }

    public String oz() {
        return this.fxt;
    }

    public boolean pe() {
        return this.fu;
    }

    public int pm() {
        return this.jp;
    }

    public int pxa() {
        return this.vw;
    }

    public boolean pxj() {
        return this.sx;
    }

    public float qh() {
        return this.ycc;
    }

    public int qhy() {
        return this.oug;
    }

    public boolean qp() {
        return this.vaf;
    }

    public String ra() {
        return this.rtt;
    }

    public int rgy() {
        return this.rig;
    }

    public String rie() {
        return this.aa;
    }

    public int rig() {
        return this.cn;
    }

    public int rqm() {
        return this.wo;
    }

    public int rtt() {
        return this.sb;
    }

    public String ru() {
        return this.xst;
    }

    public float sba() {
        return this.ru;
    }

    public int se() {
        return this.rgy;
    }

    public String sf() {
        return this.sra;
    }

    public int sg() {
        return this.se;
    }

    public String sra() {
        return this.vk;
    }

    public float sup() {
        return this.ypw;
    }

    public JSONObject sx() {
        return this.hh;
    }

    public boolean sz() {
        return this.bw;
    }

    public String tp() {
        return this.lt;
    }

    public double ul() {
        return this.sup;
    }

    public int uym() {
        return this.ge;
    }

    public int vaf() {
        return this.av;
    }

    public String vhn() {
        return this.igv;
    }

    public float vk() {
        return this.msw;
    }

    public int vum() {
        return this.ipv;
    }

    public String vw() {
        return this.cuf;
    }

    public int wa() {
        return this.ra;
    }

    public double wad() {
        return this.xxg;
    }

    public boolean wbn() {
        return this.ndl;
    }

    public boolean wd() {
        return this.wpn;
    }

    public String wo() {
        return this.mkp;
    }

    public int wpn() {
        return this.tp;
    }

    public String xhi() {
        return this.wad;
    }

    public String xmt() {
        return this.hxp;
    }

    public int xq() {
        return this.etw;
    }

    public boolean xxg() {
        return this.iyl;
    }

    public int xxs() {
        return this.oz;
    }

    public JSONObject ycc() {
        return this.zhk;
    }

    public int yid() {
        return this.nw;
    }

    public String ylm() {
        return this.cf;
    }

    public int ypw() {
        return this.sg;
    }

    public String yuz() {
        return this.bv;
    }

    public int yz() {
        return this.mxo;
    }

    public double yzg() {
        return this.gbl;
    }

    public int zhk() {
        return this.yuz;
    }

    public int zz() {
        return this.dor;
    }

    public void aa(String str) {
        this.rtt = str;
    }

    public void bw(int i) {
        this.ge = i;
    }

    public void cf(String str) {
        this.lt = str;
    }

    public void cuf(int i) {
        this.vum = i;
    }

    public void db(int i) {
        this.oz = i;
    }

    public void dg(int i) {
        this.gyw = i;
    }

    public void dr(int i) {
        this.jxk = i;
    }

    public void ee(int i) {
        this.rgy = i;
    }

    public void gbl(String str) {
        this.sra = str;
    }

    public void hxp(int i) {
        this.ipv = i;
    }

    public void iyl(int i) {
        this.qhy = i;
    }

    public void lt(int i) {
        this.yuz = i;
    }

    public void mkp(int i) {
        this.vhn = i;
    }

    public void msw(float f2) {
        this.zz = f2;
    }

    public void qh(String str) {
        this.xmt = str;
    }

    public void rie(int i) {
        this.pe = i;
    }

    public void rtt(int i) {
        this.se = i;
    }

    public void ru(String str) {
        this.ylm = str;
    }

    public String sb() {
        return this.ylm;
    }

    public void sba(String str) {
        this.mkp = str;
    }

    public void sf(int i) {
        this.oug = i;
    }

    public void sra(int i) {
        this.rig = i;
    }

    public void sup(String str) {
        this.rie = str;
    }

    public void sz(String str) {
        this.hxp = str;
    }

    public void ul(String str) {
        this.hj = str;
    }

    public void uym(float f2) {
        this.msw = f2;
    }

    public void vk(String str) {
        this.cuf = str;
    }

    public void xmt(int i) {
        this.iat = i;
    }

    public void xq(int i) {
        this.kv = i;
    }

    public void ycc(int i) {
        this.dor = i;
    }

    public void ylm(int i) {
        this.ltx = i;
    }

    public void ypw(int i) {
        this.etw = i;
    }

    public void yzg(String str) {
        this.wad = str;
    }

    public void zz(float f2) {
        this.ru = f2;
    }

    public void aa(int i) {
        this.cn = i;
    }

    public void bw(float f2) {
        this.ycc = f2;
    }

    public void cf(int i) {
        this.pxa = i;
    }

    public void db(String str) {
        this.knr = str;
    }

    public void dg(float f2) {
        this.dg = f2;
    }

    public void ee(String str) {
        this.fxt = str;
    }

    public void gbl(int i) {
        this.vw = i;
    }

    public void hxp(String str) {
        this.qp = str;
    }

    public void msw(String str) {
        this.yzg = str;
    }

    public void qh(int i) {
        this.yz = i;
    }

    public void rie(String str) {
        this.igv = str;
    }

    public void ru(int i) {
        this.tp = i;
    }

    public void sb(int i) {
        this.av = i;
    }

    public void sba(int i) {
        this.nw = i;
    }

    public void sra(String str) {
        this.bv = str;
    }

    public void sup(int i) {
        this.ra = i;
    }

    public void sz(int i) {
        this.wo = i;
    }

    public void ul(int i) {
        this.jp = i;
    }

    public void uym(String str) {
        this.sba = str;
    }

    public void vk(int i) {
        this.rqm = i;
    }

    public void xq(float f2) {
        this.xq = f2;
    }

    public void ycc(float f2) {
        this.uym = f2;
    }

    public void ylm(String str) {
        this.yid = str;
    }

    public void ypw(float f2) {
        this.ypw = f2;
    }

    public void yzg(int i) {
        this.wbn = i;
    }

    public void zz(String str) {
        this.ul = str;
    }

    public void aa(boolean z6) {
        this.vaf = z6;
    }

    public void bw(String str) {
        this.vk = str;
    }

    public void cf(boolean z6) {
        this.pxj = z6;
    }

    public void dg(String str) {
        this.cf = str;
    }

    public void gbl(boolean z6) {
        this.fu = z6;
    }

    public void msw(int i) {
        this.sb = i;
    }

    public void qh(boolean z6) {
        this.nx = z6;
    }

    public void ru(boolean z6) {
        this.ndl = z6;
    }

    public void sba(boolean z6) {
        this.hoq = z6;
    }

    public void sup(boolean z6) {
        this.sx = z6;
    }

    public void sz(boolean z6) {
        this.hs = z6;
    }

    public void uym(int i) {
        this.db = i;
    }

    public void vk(boolean z6) {
        this.xxs = z6;
    }

    public void xq(double d6) {
        this.sup = d6;
    }

    public void ycc(String str) {
        this.aa = str;
    }

    public void ypw(boolean z6) {
        this.bw = z6;
    }

    public void zz(int i) {
        this.mxo = i;
    }

    public void bw(double d6) {
        this.dr = d6;
    }

    public void dg(double d6) {
        this.sf = d6;
    }

    public void msw(boolean z6) {
        this.wd = z6;
    }

    public void uym(boolean z6) {
        this.but = z6;
    }

    public void xq(String str) {
        this.qh = str;
    }

    public void ycc(double d6) {
        this.xxg = d6;
    }

    public void ypw(double d6) {
        this.gbl = d6;
    }

    public void zz(boolean z6) {
        this.ffd = z6;
    }

    public void bw(boolean z6) {
        this.wpn = z6;
    }

    public void dg(boolean z6) {
        this.iyl = z6;
    }

    public void xq(boolean z6) {
        this.ee = z6;
    }

    public void ycc(boolean z6) {
        this.wa = z6;
    }

    public void ypw(String str) {
        this.sz = str;
    }

    public void bw(JSONObject jSONObject) {
        this.zhk = jSONObject;
    }

    public void dg(JSONObject jSONObject) {
        this.hh = jSONObject;
    }

    public void xq(JSONObject jSONObject) {
        this.dpk = jSONObject;
    }

    public void ypw(JSONObject jSONObject) {
        this.xhi = jSONObject;
    }

    public boolean emc() {
        return this.pm;
    }

    public void emc(boolean z6) {
        this.pm = z6;
    }

    public void emc(int i) {
        this.sg = i;
    }

    public void emc(double d6) {
        this.kkn = d6;
    }

    public void emc(String str) {
        this.xst = str;
    }

    public void emc(float f2) {
        this.emc = f2;
    }

    public void emc(List<emc> list) {
        this.ej = list;
    }

    public void emc(long j6) {
        this.ya = j6;
    }

    private void emc(ycc yccVar, JSONObject jSONObject) {
        String next;
        if (yccVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            next = itKeys.next();
            next.getClass();
            switch (next) {
                case "isShowBgControl":
                    yccVar.xq(jSONObject.optBoolean(next, false));
                    break;
                case "clickArea":
                    yccVar.cf(jSONObject.optString(next));
                    break;
                case "triggerSlideDirection":
                    yccVar.db(jSONObject.optString(next));
                    break;
                case "bgImgUrl":
                    yccVar.uym(jSONObject.optString(next));
                    break;
                case "lineCount":
                    yccVar.zz(jSONObject.optInt(next));
                    break;
                case "openPlayableLandingPage":
                    yccVar.sba(jSONObject.optBoolean(next));
                    break;
                case "lineLimit":
                    yccVar.ycc(jSONObject.optBoolean(next));
                    break;
                case "interactBgColor":
                    yccVar.sz(jSONObject.optString(next));
                    break;
                case "paddingLeft":
                    yccVar.ycc((float) jSONObject.optDouble(next));
                    break;
                case "adType":
                    yccVar.ypw(jSONObject.optString(next));
                    break;
                case "bottom":
                    yccVar.rie(jSONObject.optInt(next));
                    break;
                case "fontFamily":
                    yccVar.xq(jSONObject.optString(next));
                    break;
                case "height":
                    yccVar.xq((float) jSONObject.optDouble(next));
                    break;
                case "textAlign":
                    yccVar.dg(jSONObject.optString(next));
                    break;
                case "alignItems":
                    yccVar.ylm(jSONObject.optString(next));
                    break;
                case "interactValidate":
                    yccVar.ypw(jSONObject.optBoolean(next));
                    break;
                case "marginTop":
                    yccVar.ru(jSONObject.optInt(next));
                    break;
                case "useBottom":
                    yccVar.ru(jSONObject.optBoolean(next));
                    break;
                case "triggerSlideMinDistance":
                    yccVar.emc(jSONObject.optLong(next));
                    break;
                case "direction":
                    yccVar.sra(jSONObject.optString(next));
                    break;
                case "tagMaxCount":
                    yccVar.aa(jSONObject.optInt(next));
                    break;
                case "interactHiddenTime":
                    yccVar.ee(jSONObject.optInt(next));
                    break;
                case "useTop":
                    yccVar.zz(jSONObject.optBoolean(next));
                    break;
                case "fontWeight":
                    yccVar.cf(jSONObject.optInt(next));
                    break;
                case "zIndex":
                    yccVar.hxp(jSONObject.optInt(next));
                    break;
                case "timingStart":
                    yccVar.ypw(jSONObject.optDouble(next));
                    break;
                case "lineHeight":
                    yccVar.ycc(jSONObject.optDouble(next));
                    break;
                case "textFlowDuration":
                    yccVar.yzg(jSONObject.optInt(next));
                    break;
                case "useRight":
                    yccVar.msw(jSONObject.optBoolean(next));
                    break;
                case "marginBottom":
                    yccVar.gbl(jSONObject.optInt(next));
                    break;
                case "bgColor":
                    yccVar.ycc(jSONObject.optString(next));
                    break;
                case "useLeft":
                    yccVar.uym(jSONObject.optBoolean(next));
                    break;
                case "widthMode":
                    yccVar.gbl(jSONObject.optString(next));
                    break;
                case "top":
                    yccVar.sra(jSONObject.optInt(next));
                    break;
                case "data":
                    yccVar.ul(jSONObject.optString(next));
                    break;
                case "left":
                    yccVar.ul(jSONObject.optInt(next));
                    break;
                case "loop":
                    yccVar.emc(jSONObject.optBoolean(next));
                    break;
                case "paddingTop":
                    yccVar.msw((float) jSONObject.optDouble(next));
                    break;
                case "align":
                    yccVar.yzg(jSONObject.optString(next));
                    break;
                case "color":
                    yccVar.bw(jSONObject.optString(next));
                    break;
                case "right":
                    yccVar.ylm(jSONObject.optInt(next));
                    break;
                case "width":
                    yccVar.dg((float) jSONObject.optDouble(next));
                    break;
                case "timingEnd":
                    yccVar.xq(jSONObject.optDouble(next));
                    break;
                case "paddingBottom":
                    yccVar.bw((float) jSONObject.optDouble(next));
                    break;
                case "allowTextFlow":
                    yccVar.gbl(jSONObject.optBoolean(next));
                    break;
                case "interactWontHide":
                    yccVar.qh(jSONObject.optBoolean(next));
                    break;
                case "fontSize":
                    yccVar.zz((float) jSONObject.optDouble(next));
                    break;
                case "justifyVertical":
                    yccVar.sba(jSONObject.optString(next));
                    break;
                case "interactVisibleTime":
                    yccVar.dr(jSONObject.optInt(next));
                    break;
                case "paddingRight":
                    yccVar.uym((float) jSONObject.optDouble(next));
                    break;
                case "borderColor":
                    yccVar.msw(jSONObject.optString(next));
                    break;
                case "borderStyle":
                    yccVar.zz(jSONObject.optString(next));
                    break;
                case "position":
                    yccVar.vk(jSONObject.optInt(next));
                    break;
                case "isDataFixed":
                    yccVar.bw(jSONObject.optBoolean(next));
                    break;
                case "marginRight":
                    yccVar.sz(jSONObject.optInt(next));
                    break;
                case "justifyHorizontal":
                    yccVar.aa(jSONObject.optString(next));
                    break;
                case "interactPosition":
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        yccVar.uym(jSONObjectOptJSONObject.optInt("translateY", 0));
                        yccVar.msw(jSONObjectOptJSONObject.optInt("translateX", 0));
                        yccVar.dg(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        yccVar.bw(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case "lineFeed":
                    yccVar.dg(jSONObject.optBoolean(next));
                    break;
                case "interactText":
                    yccVar.sup(jSONObject.optString(next));
                    break;
                case "interactType":
                    yccVar.qh(jSONObject.optString(next));
                    break;
                case "borderRadius":
                    yccVar.emc((float) jSONObject.optDouble(next));
                    break;
                case "clickTigger":
                    yccVar.vk(jSONObject.optString(next));
                    break;
                case "heightMode":
                    yccVar.ru(jSONObject.optString(next));
                    break;
                case "textFlowType":
                    yccVar.sba(jSONObject.optInt(next));
                    break;
                case "borderSize":
                    yccVar.ypw((float) jSONObject.optDouble(next));
                    break;
                case "marginLeft":
                    yccVar.sup(jSONObject.optInt(next));
                    break;
                case "letterSpacing":
                    yccVar.qh(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
