package com.bytedance.sdk.component.adexpress.dynamic.dg;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {

    /* renamed from: aa, reason: collision with root package name */
    private String f9228aa;
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
        yccVar.vk(jSONObject.optString("clickTigger", CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        yccVar.xq(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        yccVar.dg(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        yccVar.bw(jSONObject.optString(TtmlNode.ATTR_TTS_COLOR, "#999999"));
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
        yccVar.zz((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        yccVar.bw((float) jSONObject.optDouble("paddingBottom", 0.0d));
        yccVar.ycc((float) jSONObject.optDouble("paddingLeft", 0.0d));
        yccVar.uym((float) jSONObject.optDouble("paddingRight", 0.0d));
        yccVar.msw((float) jSONObject.optDouble("paddingTop", 0.0d));
        yccVar.dg(jSONObject.optBoolean("lineFeed", false));
        yccVar.zz(jSONObject.optInt("lineCount", 0));
        yccVar.ycc(jSONObject.optDouble("lineHeight", 1.2d));
        yccVar.qh(jSONObject.optInt("letterSpacing", 0));
        yccVar.bw(jSONObject.optBoolean("isDataFixed", false));
        yccVar.cf(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
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
        yccVar.ul(jSONObject.optInt(TtmlNode.LEFT));
        yccVar.ylm(jSONObject.optInt(TtmlNode.RIGHT));
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
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
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
                yccVar.db(jSONObject.optString("triggerSlideDirection", MBridgeConstans.ENDCARD_URL_TYPE_PL));
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
        return this.f9228aa;
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

    public void bw(int i10) {
        this.ge = i10;
    }

    public void cf(String str) {
        this.lt = str;
    }

    public void cuf(int i10) {
        this.vum = i10;
    }

    public void db(int i10) {
        this.oz = i10;
    }

    public void dg(int i10) {
        this.gyw = i10;
    }

    public void dr(int i10) {
        this.jxk = i10;
    }

    public void ee(int i10) {
        this.rgy = i10;
    }

    public void gbl(String str) {
        this.sra = str;
    }

    public void hxp(int i10) {
        this.ipv = i10;
    }

    public void iyl(int i10) {
        this.qhy = i10;
    }

    public void lt(int i10) {
        this.yuz = i10;
    }

    public void mkp(int i10) {
        this.vhn = i10;
    }

    public void msw(float f10) {
        this.zz = f10;
    }

    public void qh(String str) {
        this.xmt = str;
    }

    public void rie(int i10) {
        this.pe = i10;
    }

    public void rtt(int i10) {
        this.se = i10;
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

    public void sf(int i10) {
        this.oug = i10;
    }

    public void sra(int i10) {
        this.rig = i10;
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

    public void uym(float f10) {
        this.msw = f10;
    }

    public void vk(String str) {
        this.cuf = str;
    }

    public void xmt(int i10) {
        this.iat = i10;
    }

    public void xq(int i10) {
        this.kv = i10;
    }

    public void ycc(int i10) {
        this.dor = i10;
    }

    public void ylm(int i10) {
        this.ltx = i10;
    }

    public void ypw(int i10) {
        this.etw = i10;
    }

    public void yzg(String str) {
        this.wad = str;
    }

    public void zz(float f10) {
        this.ru = f10;
    }

    public void aa(int i10) {
        this.cn = i10;
    }

    public void bw(float f10) {
        this.ycc = f10;
    }

    public void cf(int i10) {
        this.pxa = i10;
    }

    public void db(String str) {
        this.knr = str;
    }

    public void dg(float f10) {
        this.dg = f10;
    }

    public void ee(String str) {
        this.fxt = str;
    }

    public void gbl(int i10) {
        this.vw = i10;
    }

    public void hxp(String str) {
        this.qp = str;
    }

    public void msw(String str) {
        this.yzg = str;
    }

    public void qh(int i10) {
        this.yz = i10;
    }

    public void rie(String str) {
        this.igv = str;
    }

    public void ru(int i10) {
        this.tp = i10;
    }

    public void sb(int i10) {
        this.av = i10;
    }

    public void sba(int i10) {
        this.nw = i10;
    }

    public void sra(String str) {
        this.bv = str;
    }

    public void sup(int i10) {
        this.ra = i10;
    }

    public void sz(int i10) {
        this.wo = i10;
    }

    public void ul(int i10) {
        this.jp = i10;
    }

    public void uym(String str) {
        this.sba = str;
    }

    public void vk(int i10) {
        this.rqm = i10;
    }

    public void xq(float f10) {
        this.xq = f10;
    }

    public void ycc(float f10) {
        this.uym = f10;
    }

    public void ylm(String str) {
        this.yid = str;
    }

    public void ypw(float f10) {
        this.ypw = f10;
    }

    public void yzg(int i10) {
        this.wbn = i10;
    }

    public void zz(String str) {
        this.ul = str;
    }

    public void aa(boolean z10) {
        this.vaf = z10;
    }

    public void bw(String str) {
        this.vk = str;
    }

    public void cf(boolean z10) {
        this.pxj = z10;
    }

    public void dg(String str) {
        this.cf = str;
    }

    public void gbl(boolean z10) {
        this.fu = z10;
    }

    public void msw(int i10) {
        this.sb = i10;
    }

    public void qh(boolean z10) {
        this.nx = z10;
    }

    public void ru(boolean z10) {
        this.ndl = z10;
    }

    public void sba(boolean z10) {
        this.hoq = z10;
    }

    public void sup(boolean z10) {
        this.sx = z10;
    }

    public void sz(boolean z10) {
        this.hs = z10;
    }

    public void uym(int i10) {
        this.db = i10;
    }

    public void vk(boolean z10) {
        this.xxs = z10;
    }

    public void xq(double d10) {
        this.sup = d10;
    }

    public void ycc(String str) {
        this.f9228aa = str;
    }

    public void ypw(boolean z10) {
        this.bw = z10;
    }

    public void zz(int i10) {
        this.mxo = i10;
    }

    public void bw(double d10) {
        this.dr = d10;
    }

    public void dg(double d10) {
        this.sf = d10;
    }

    public void msw(boolean z10) {
        this.wd = z10;
    }

    public void uym(boolean z10) {
        this.but = z10;
    }

    public void xq(String str) {
        this.qh = str;
    }

    public void ycc(double d10) {
        this.xxg = d10;
    }

    public void ypw(double d10) {
        this.gbl = d10;
    }

    public void zz(boolean z10) {
        this.ffd = z10;
    }

    public void bw(boolean z10) {
        this.wpn = z10;
    }

    public void dg(boolean z10) {
        this.iyl = z10;
    }

    public void xq(boolean z10) {
        this.ee = z10;
    }

    public void ycc(boolean z10) {
        this.wa = z10;
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

    public void emc(boolean z10) {
        this.pm = z10;
    }

    public void emc(int i10) {
        this.sg = i10;
    }

    public void emc(double d10) {
        this.kkn = d10;
    }

    public void emc(String str) {
        this.xst = str;
    }

    public void emc(float f10) {
        this.emc = f10;
    }

    public void emc(List<emc> list) {
        this.ej = list;
    }

    public void emc(long j10) {
        this.ya = j10;
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
