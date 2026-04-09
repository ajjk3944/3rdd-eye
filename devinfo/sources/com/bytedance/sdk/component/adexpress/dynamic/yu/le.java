package com.bytedance.sdk.component.adexpress.dynamic.yu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class le {
    private String ajl;
    public int an;
    public String baa;
    public double bly;
    public int bs;
    public boolean byv;

    /* renamed from: cd, reason: collision with root package name */
    public String f7281cd;

    /* renamed from: cf, reason: collision with root package name */
    String f7282cf;

    /* renamed from: cj, reason: collision with root package name */
    public boolean f7283cj;
    public boolean coz;
    public int eay;
    public int ehk;
    public String eot;
    public int euf;
    public double ex;
    public int ey;
    public int fak;
    public String fg;
    public float fkw;
    public String fn;
    public boolean fqk;
    public int fvf;
    public String fwd;

    /* renamed from: gh, reason: collision with root package name */
    public int f7284gh;
    public int hun;
    public int ixm;
    public String jae;

    /* renamed from: jg, reason: collision with root package name */
    public String f7285jg;
    public double jqy;
    public int jvy;
    public double kfa;

    /* renamed from: ki, reason: collision with root package name */
    public int f7286ki;
    public JSONObject kn;
    String ko;
    public String ksc;
    private String lai;

    /* renamed from: le, reason: collision with root package name */
    public float f7287le;
    public int lgp;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f7288lh;
    public String ln;
    public boolean lso;
    public int lvd;
    public int mq;
    public int ms;
    public int mt;
    private float mu;
    public String mwe;
    public String mwh;
    public int myk;

    /* renamed from: ng, reason: collision with root package name */
    public String f7289ng;
    public List<ouw> njr;
    public long nn = -1;
    boolean npr;

    /* renamed from: od, reason: collision with root package name */
    public String f7290od;
    public boolean odc;
    public double osn;
    public float ouw;

    /* renamed from: pd, reason: collision with root package name */
    public int f7291pd;
    public float pno;
    public boolean pv;
    public boolean qbp;
    public boolean qld;
    public int qni;
    public float ra;
    public String rn;
    public boolean rrs;
    String ryl;

    /* renamed from: sd, reason: collision with root package name */
    public int f7292sd;
    private String sm;
    public boolean smu;
    public String tc;

    /* renamed from: th, reason: collision with root package name */
    public String f7293th;
    public double tlj;

    /* renamed from: ub, reason: collision with root package name */
    public boolean f7294ub;
    public int ucs;
    public int uoy;
    public boolean uq;
    public String ux;

    /* renamed from: vf, reason: collision with root package name */
    private JSONObject f7295vf;

    /* renamed from: vh, reason: collision with root package name */
    public boolean f7296vh;

    /* renamed from: vi, reason: collision with root package name */
    public boolean f7297vi;
    public String vm;
    public int vpp;
    public float vt;
    public int wbf;
    public String wp;
    public int xdk;
    public int xn;
    private float xne;
    public int xwt;
    public int ycd;
    public int yhj;
    public int yib;
    public JSONObject yiz;
    public float yu;
    public JSONObject yw;
    public String zih;
    public int zin;
    public boolean zjp;
    public String zjq;
    public int zrz;
    public int zvq;

    public static le ouw(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        le leVar = new le();
        leVar.lai = jSONObject.optString("adType", "embeded");
        leVar.ksc = jSONObject.optString("clickArea", "creative");
        leVar.jae = jSONObject.optString("clickTigger", "click");
        leVar.ajl = jSONObject.optString("fontFamily", "PingFangSC");
        leVar.f7282cf = jSONObject.optString("textAlign", "left");
        leVar.ryl = jSONObject.optString("color", "#999999");
        leVar.mwh = jSONObject.optString("bgColor", "transparent");
        leVar.f7285jg = jSONObject.optString("bgImgUrl", "");
        leVar.zjq = jSONObject.optString("bgImgData", "");
        leVar.ko = jSONObject.optString("borderColor", "#000000");
        leVar.sm = jSONObject.optString("borderStyle", "solid");
        leVar.rn = jSONObject.optString("heightMode", "auto");
        leVar.zih = jSONObject.optString("widthMode", "fixed");
        leVar.vm = jSONObject.optString("interactText", "");
        leVar.qbp = jSONObject.optBoolean("isShowBgControl", false);
        leVar.f7293th = jSONObject.optString("interactBgColor", "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            leVar.zin = jSONObjectOptJSONObject.optInt("translateY", 0);
            leVar.vpp = jSONObjectOptJSONObject.optInt("translateX", 0);
            leVar.jqy = jSONObjectOptJSONObject.optDouble("scaleX", 0.0d);
            leVar.ex = jSONObjectOptJSONObject.optDouble("scaleY", 0.0d);
        }
        leVar.tc = jSONObject.optString("interactType", "");
        leVar.ms = jSONObject.optInt("interactSlideDirection", -1);
        leVar.f7290od = jSONObject.optString("justifyHorizontal", "space-around");
        leVar.f7281cd = jSONObject.optString("justifyVertical", "flex-start");
        leVar.bly = jSONObject.optDouble("timingStart");
        leVar.tlj = jSONObject.optDouble("timingEnd");
        leVar.xne = (float) jSONObject.optDouble("width", 0.0d);
        leVar.mu = (float) jSONObject.optDouble("height", 0.0d);
        leVar.ouw = (float) jSONObject.optDouble("borderRadius", 0.0d);
        leVar.vt = (float) jSONObject.optDouble("borderSize", 0.0d);
        leVar.f7288lh = jSONObject.optBoolean("interactValidate", false);
        leVar.pno = (float) jSONObject.optDouble("fontSize", 0.0d);
        leVar.yu = (float) jSONObject.optDouble("paddingBottom", 0.0d);
        leVar.fkw = (float) jSONObject.optDouble("paddingLeft", 0.0d);
        leVar.f7287le = (float) jSONObject.optDouble("paddingRight", 0.0d);
        leVar.ra = (float) jSONObject.optDouble("paddingTop", 0.0d);
        leVar.uq = jSONObject.optBoolean("lineFeed", false);
        leVar.f7291pd = jSONObject.optInt("lineCount", 0);
        leVar.osn = jSONObject.optDouble("lineHeight", 1.2d);
        leVar.ey = jSONObject.optInt("letterSpacing", 0);
        leVar.rrs = jSONObject.optBoolean("isDataFixed", false);
        leVar.jvy = jSONObject.optInt("fontWeight");
        leVar.fqk = jSONObject.optBoolean("lineLimit");
        leVar.hun = jSONObject.optInt("position");
        leVar.ux = jSONObject.optString("align");
        leVar.lso = jSONObject.optBoolean("useLeft");
        leVar.f7294ub = jSONObject.optBoolean("useRight");
        leVar.f7283cj = jSONObject.optBoolean("useTop");
        leVar.pv = jSONObject.optBoolean("useBottom");
        leVar.wp = jSONObject.optString("data");
        leVar.kn = jSONObject.optJSONObject("i18n");
        leVar.fak = jSONObject.optInt("marginLeft");
        leVar.uoy = jSONObject.optInt("marginRight");
        leVar.fvf = jSONObject.optInt("marginTop");
        leVar.bs = jSONObject.optInt("marginBottom");
        leVar.ucs = jSONObject.optInt("tagMaxCount");
        leVar.f7296vh = jSONObject.optBoolean("allowTextFlow");
        leVar.yib = jSONObject.optInt("textFlowType");
        leVar.yhj = jSONObject.optInt("textFlowDuration");
        leVar.mt = jSONObject.optInt("left");
        leVar.xdk = jSONObject.optInt("right");
        leVar.zvq = jSONObject.optInt("top");
        leVar.myk = jSONObject.optInt("bottom");
        leVar.f7289ng = jSONObject.optString("alignItems", "flex-start");
        leVar.fwd = jSONObject.optString("direction", "");
        leVar.coz = jSONObject.optBoolean("loop", false);
        leVar.lvd = jSONObject.optInt("zIndex");
        leVar.euf = jSONObject.optInt("interactVisibleTime");
        leVar.f7292sd = jSONObject.optInt("interactHiddenTime");
        leVar.smu = jSONObject.optBoolean("interactEnableMask");
        leVar.qld = jSONObject.optBoolean("interactWontHide");
        leVar.eot = jSONObject.optString("bgGradient");
        leVar.mq = jSONObject.optInt("areaType");
        leVar.an = jSONObject.optInt("interactSlideThreshold", 0);
        leVar.xn = jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.yu.vt() ? 0 : 120);
        leVar.zjp = jSONObject.optBoolean("openPlayableLandingPage", false);
        leVar.f7295vf = jSONObject.optJSONObject("video");
        leVar.yw = jSONObject.optJSONObject("image");
        leVar.f7284gh = jSONObject.optInt("borderShadowExtent");
        leVar.odc = jSONObject.optBoolean("bgGauseBlur");
        leVar.ycd = jSONObject.optInt("bgGauseBlurRadius");
        leVar.f7297vi = jSONObject.optBoolean("showTimeProgress", false);
        leVar.npr = jSONObject.optBoolean("showPlayButton", false);
        leVar.kfa = jSONObject.optDouble("bgColorCg", 0.0d);
        leVar.ixm = jSONObject.optInt("bgMaterialCenterCalcColor", 0);
        leVar.lgp = jSONObject.optInt("borderTopLeftRadius", 0);
        leVar.zrz = jSONObject.optInt("borderTopRightRadius", 0);
        leVar.wbf = jSONObject.optInt("borderBottomLeftRadius", 0);
        leVar.eay = jSONObject.optInt("borderBottomRightRadius", 0);
        leVar.yiz = jSONObject.optJSONObject("interactI18n");
        leVar.ln = jSONObject.optString("imageObjectFit");
        leVar.fg = jSONObject.optString("interactTitle");
        leVar.qni = jSONObject.optInt("interactTextPositionTop");
        leVar.fn = jSONObject.optString("imageLottieTosPath");
        leVar.byv = jSONObject.optBoolean("animationsLoop");
        leVar.ehk = jSONObject.optInt("lottieAppNameMaxLength");
        leVar.xwt = jSONObject.optInt("lottieAdDescMaxLength");
        leVar.f7286ki = jSONObject.optInt("lottieAdTitleMaxLength");
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i4);
                    ouw ouwVar = new ouw();
                    ouwVar.ouw = jSONObject2.optString("animationType");
                    ouwVar.vt = jSONObject2.optDouble("animationDuration");
                    ouwVar.f7301lh = jSONObject2.optDouble("animationScaleX");
                    ouwVar.yu = jSONObject2.optDouble("animationScaleY");
                    ouwVar.fkw = jSONObject2.optString("animationTimeFunction");
                    ouwVar.f7300le = jSONObject2.optDouble("animationDelay");
                    ouwVar.ra = jSONObject2.optInt("animationIterationCount");
                    ouwVar.pno = jSONObject2.optString("animationDirection");
                    ouwVar.bly = jSONObject2.optDouble("animationInterval");
                    ouwVar.tlj = jSONObject2.optInt("animationBorderWidth");
                    ouwVar.f7302th = jSONObject2.optLong("key");
                    ouwVar.f7298cf = jSONObject2.optInt("animationEffectWidth");
                    ouwVar.ryl = jSONObject2.optInt("animationSwing", 1);
                    ouwVar.mwh = jSONObject2.optInt("animationTranslateX");
                    ouwVar.f7299jg = jSONObject2.optInt("animationTranslateY");
                    ouwVar.ko = jSONObject2.optString("animationRippleBackgroundColor");
                    ouwVar.rn = jSONObject2.optString("animationScaleDirection");
                    ouwVar.zih = jSONObject2.optInt("animationFadeStart");
                    ouwVar.vm = jSONObject2.optInt("animationFadeEnd");
                    ouwVar.vpp = jSONObject2.optString("animationFillMode");
                    ouwVar.zin = jSONObject2.optInt("animationBounceHeight");
                    double d10 = leVar.bly;
                    if (d10 > 0.0d) {
                        ouwVar.f7300le += d10;
                    }
                    arrayList.add(ouwVar);
                }
                leVar.njr = arrayList;
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                leVar.baa = jSONObject.optString("triggerSlideDirection", "0");
                leVar.nn = jSONObject.optLong("triggerSlideMinDistance", 0L);
            }
            return leVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return leVar;
        }
    }

    public final void vt() {
        ouw(this, this.yw);
    }

    public final void ouw() {
        ouw(this, this.f7295vf);
    }

    private static void ouw(le leVar, JSONObject jSONObject) {
        String next;
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            next = itKeys.next();
            next.getClass();
            switch (next) {
                case "isShowBgControl":
                    leVar.qbp = jSONObject.optBoolean(next, false);
                    break;
                case "clickArea":
                    leVar.ksc = jSONObject.optString(next);
                    break;
                case "triggerSlideDirection":
                    leVar.baa = jSONObject.optString(next);
                    break;
                case "bgImgUrl":
                    leVar.f7285jg = jSONObject.optString(next);
                    break;
                case "lineCount":
                    leVar.f7291pd = jSONObject.optInt(next);
                    break;
                case "openPlayableLandingPage":
                    leVar.zjp = jSONObject.optBoolean(next);
                    break;
                case "lineLimit":
                    leVar.fqk = jSONObject.optBoolean(next);
                    break;
                case "interactBgColor":
                    leVar.f7293th = jSONObject.optString(next);
                    break;
                case "paddingLeft":
                    leVar.fkw = (float) jSONObject.optDouble(next);
                    break;
                case "adType":
                    leVar.lai = jSONObject.optString(next);
                    break;
                case "bottom":
                    leVar.myk = jSONObject.optInt(next);
                    break;
                case "fontFamily":
                    leVar.ajl = jSONObject.optString(next);
                    break;
                case "height":
                    leVar.mu = (float) jSONObject.optDouble(next);
                    break;
                case "textAlign":
                    leVar.f7282cf = jSONObject.optString(next);
                    break;
                case "alignItems":
                    leVar.f7289ng = jSONObject.optString(next);
                    break;
                case "interactValidate":
                    leVar.f7288lh = jSONObject.optBoolean(next);
                    break;
                case "marginTop":
                    leVar.fvf = jSONObject.optInt(next);
                    break;
                case "useBottom":
                    leVar.pv = jSONObject.optBoolean(next);
                    break;
                case "triggerSlideMinDistance":
                    leVar.nn = jSONObject.optLong(next);
                    break;
                case "direction":
                    leVar.fwd = jSONObject.optString(next);
                    break;
                case "tagMaxCount":
                    leVar.ucs = jSONObject.optInt(next);
                    break;
                case "interactHiddenTime":
                    leVar.f7292sd = jSONObject.optInt(next);
                    break;
                case "useTop":
                    leVar.f7283cj = jSONObject.optBoolean(next);
                    break;
                case "fontWeight":
                    leVar.jvy = jSONObject.optInt(next);
                    break;
                case "zIndex":
                    leVar.lvd = jSONObject.optInt(next);
                    break;
                case "timingStart":
                    leVar.bly = jSONObject.optDouble(next);
                    break;
                case "lineHeight":
                    leVar.osn = jSONObject.optDouble(next);
                    break;
                case "textFlowDuration":
                    leVar.yhj = jSONObject.optInt(next);
                    break;
                case "useRight":
                    leVar.f7294ub = jSONObject.optBoolean(next);
                    break;
                case "marginBottom":
                    leVar.bs = jSONObject.optInt(next);
                    break;
                case "bgColor":
                    leVar.mwh = jSONObject.optString(next);
                    break;
                case "useLeft":
                    leVar.lso = jSONObject.optBoolean(next);
                    break;
                case "widthMode":
                    leVar.zih = jSONObject.optString(next);
                    break;
                case "top":
                    leVar.zvq = jSONObject.optInt(next);
                    break;
                case "data":
                    leVar.wp = jSONObject.optString(next);
                    break;
                case "left":
                    leVar.mt = jSONObject.optInt(next);
                    break;
                case "loop":
                    leVar.coz = jSONObject.optBoolean(next);
                    break;
                case "paddingTop":
                    leVar.ra = (float) jSONObject.optDouble(next);
                    break;
                case "align":
                    leVar.ux = jSONObject.optString(next);
                    break;
                case "color":
                    leVar.ryl = jSONObject.optString(next);
                    break;
                case "right":
                    leVar.xdk = jSONObject.optInt(next);
                    break;
                case "width":
                    leVar.xne = (float) jSONObject.optDouble(next);
                    break;
                case "timingEnd":
                    leVar.tlj = jSONObject.optDouble(next);
                    break;
                case "paddingBottom":
                    leVar.yu = (float) jSONObject.optDouble(next);
                    break;
                case "allowTextFlow":
                    leVar.f7296vh = jSONObject.optBoolean(next);
                    break;
                case "interactWontHide":
                    leVar.qld = jSONObject.optBoolean(next);
                    break;
                case "fontSize":
                    leVar.pno = (float) jSONObject.optDouble(next);
                    break;
                case "justifyVertical":
                    leVar.f7281cd = jSONObject.optString(next);
                    break;
                case "interactVisibleTime":
                    leVar.euf = jSONObject.optInt(next);
                    break;
                case "paddingRight":
                    leVar.f7287le = (float) jSONObject.optDouble(next);
                    break;
                case "borderColor":
                    leVar.ko = jSONObject.optString(next);
                    break;
                case "borderStyle":
                    leVar.sm = jSONObject.optString(next);
                    break;
                case "position":
                    leVar.hun = jSONObject.optInt(next);
                    break;
                case "isDataFixed":
                    leVar.rrs = jSONObject.optBoolean(next);
                    break;
                case "marginRight":
                    leVar.uoy = jSONObject.optInt(next);
                    break;
                case "justifyHorizontal":
                    leVar.f7290od = jSONObject.optString(next);
                    break;
                case "interactPosition":
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        leVar.zin = jSONObjectOptJSONObject.optInt("translateY", 0);
                        leVar.vpp = jSONObjectOptJSONObject.optInt("translateX", 0);
                        leVar.jqy = jSONObjectOptJSONObject.optDouble("scaleX", 0.0d);
                        leVar.ex = jSONObjectOptJSONObject.optDouble("scaleY", 0.0d);
                        break;
                    }
                case "lineFeed":
                    leVar.uq = jSONObject.optBoolean(next);
                    break;
                case "interactText":
                    leVar.vm = jSONObject.optString(next);
                    break;
                case "interactType":
                    leVar.tc = jSONObject.optString(next);
                    break;
                case "borderRadius":
                    leVar.ouw = (float) jSONObject.optDouble(next);
                    break;
                case "clickTigger":
                    leVar.jae = jSONObject.optString(next);
                    break;
                case "heightMode":
                    leVar.rn = jSONObject.optString(next);
                    break;
                case "textFlowType":
                    leVar.yib = jSONObject.optInt(next);
                    break;
                case "borderSize":
                    leVar.vt = (float) jSONObject.optDouble(next);
                    break;
                case "marginLeft":
                    leVar.fak = jSONObject.optInt(next);
                    break;
                case "letterSpacing":
                    leVar.ey = jSONObject.optInt(next);
                    break;
            }
        }
    }
}
