package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.vc;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.mxo;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x2.a;

/* loaded from: classes.dex */
public final class rie {

    /* renamed from: aa, reason: collision with root package name */
    private boolean f9292aa;
    private JSONObject ak;
    private boolean al;
    private JSONObject av;
    private yzg blf;
    private int cn;
    private boolean cuf;
    private int cwv;
    private String dm;
    private Map<String, Object> dpk;
    private String dr;
    private String dsx;
    private hxp ee;
    private String efd;
    private int ej;
    private String ffd;
    private boolean fw;
    private int fxt;
    private dr gc;
    private String ge;
    private String gef;
    private xmt gf;
    private int gyw;
    private emc hh;
    private String hj;
    private boolean hoq;
    private String iat;
    private aa in;
    private cf ix;
    private cuf jl;
    private int jp;
    private long jxk;
    private String kda;
    private int kkn;
    private String knr;
    private AdSlot kv;
    private uym kx;
    private com.bytedance.sdk.openadsdk.core.gbl.msw.emc lce;
    private boolean lpq;
    private String lr;
    private int lt;
    private msw ltj;
    private String ltx;
    private com.bytedance.sdk.openadsdk.core.sup.emc mjd;
    private int mkp;
    protected int msw;
    private String ndl;
    private ycc nw;
    private JSONObject oa;
    private String ob;
    private String ono;
    private int orp;
    private JSONObject oz;
    private String pe;
    private boolean pia;
    private int pv;
    private sba pxa;
    private boolean pxj;
    private int pz;
    private boolean qam;
    private int qhy;
    private volatile boolean qlw;
    private sf qwr;
    private int ra;
    private PAGBannerSize rd;
    private long rie;
    private String rig;
    private ylm rlt;
    private String rqm;
    private int rtt;
    private String sb;
    private bw sba;
    private b se;
    private com.bytedance.sdk.openadsdk.core.model.emc sf;
    private long sra;
    public long sz;
    private qh tc;
    private db tf;
    private int tvh;
    private String uie;
    private int ul;
    private com.bytedance.sdk.openadsdk.core.gbl.msw.emc un;
    private boolean uw;
    private boolean vaf;
    private b vhn;
    private b vum;
    private String wa;
    private sz wbn;
    private String wcv;
    private String wd;
    private JSONObject wdp;
    private int wg;
    private int wo;
    private sba wpn;
    private int wq;
    private String wy;
    private String xhi;
    private String xmt;
    private int xou;
    private int xxg;
    private boolean xxs;
    private String ya;
    private int ye;
    private int yuz;
    private String yzg;
    private int zek;
    private int zxw;
    protected long zz;
    public static final String ypw = vc.a("_", new CharSequence[]{"is", tp.dr()});
    public static final String xq = vc.a("_", new CharSequence[]{"is", tp.dr(), "sample"});
    public static final String dg = vc.a("_", new CharSequence[]{tp.dr(), "strategy"});
    protected static int gbl = 330;
    private long vk = 0;
    protected boolean emc = false;
    protected boolean bw = com.bytedance.sdk.openadsdk.ee.emc.xq.emc;
    protected int ycc = com.bytedance.sdk.openadsdk.ee.emc.xq.ypw;
    protected String uym = com.bytedance.sdk.openadsdk.ee.emc.xq.xq;
    private int ylm = 0;
    private boolean hxp = false;
    private int db = -1;
    protected int ru = 0;
    private final List<sba> iyl = new ArrayList();
    private final List<String> mxo = new ArrayList();
    private final List<FilterWord> tp = new ArrayList();
    private final mxo vw = mxo.xq();
    public boolean sup = false;
    private int yz = 0;
    private List<String> wad = new ArrayList();
    private List<String> but = new ArrayList();
    private String fu = MBridgeConstans.ENDCARD_URL_TYPE_PL;
    private String yid = "";
    private int bv = 0;
    private int pm = 2;
    private int ipv = -1;
    private int rgy = 0;
    private int nx = 0;
    private int zhk = 1;
    private gbl dor = new gbl();
    private int sg = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int etw = 0;
    private int qp = 1;
    private int hs = 0;
    private int igv = 0;
    private int sx = 0;
    private int oug = 1;
    private int xst = 1;
    private float rr = 100.0f;
    private int ff = -1;
    private int vyk = 2;
    private int xxo = 1;
    private int ng = 0;
    private int az = -1;
    private long zrm = -1;
    private int xof = 0;
    private int nwn = Integer.MIN_VALUE;
    private boolean qio = false;
    private int yvi = 0;
    private int hm = -1;
    private long jnq = -1;
    private int dk = 50;
    private int alt = -1;
    private final ypw ldy = new ypw();
    private boolean mfx = false;
    private com.bytedance.sdk.openadsdk.ee.emc.ypw jn = null;
    protected int qh = -1;
    protected int cf = -1;
    private float zc = -1.0f;

    public static class emc {
        private String bw;
        private String dg;
        private String emc;
        private String gbl;
        private List<Integer> msw;
        private String qh;
        private String ru;
        private String sup;
        private String sz;
        private String uym;
        private String xq;
        private String ycc;
        private String ypw;
        private String zz;

        @NonNull
        public static com.bytedance.sdk.component.adexpress.emc.xq.dg emc(emc emcVar, String str) {
            return com.bytedance.sdk.component.adexpress.emc.xq.dg.emc().emc(emcVar.dg()).ypw(emcVar.bw()).xq(emcVar.ycc()).dg(emcVar.uym()).bw(emcVar.xq()).ycc(str);
        }

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.gbl.msw.emc ypw(emc emcVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.gbl.msw.emc().emc(emcVar.dg()).ypw(emcVar.qh()).xq(emcVar.sz()).dg(emcVar.cf()).bw(str);
        }

        public String bw() {
            return this.ypw;
        }

        public String cf() {
            return this.qh;
        }

        public String dg() {
            return this.emc;
        }

        public String gbl() {
            return this.ru;
        }

        public String msw() {
            return this.bw;
        }

        public String qh() {
            return this.sz;
        }

        public String ru() {
            return this.gbl;
        }

        public boolean sup() {
            return !TextUtils.isEmpty(this.ru) && this.ru.equals("v3");
        }

        public String sz() {
            return this.sup;
        }

        public String uym() {
            return this.dg;
        }

        public String xq() {
            return this.ycc;
        }

        public String ycc() {
            return this.xq;
        }

        public String zz() {
            return this.uym;
        }

        public void bw(String str) {
            this.xq = str;
        }

        public void dg(String str) {
            this.ypw = str;
        }

        public void gbl(String str) {
            this.sup = str;
        }

        public void msw(String str) {
            this.uym = str;
        }

        public void ru(String str) {
            this.ru = str;
        }

        public void sup(String str) {
            this.sz = str;
        }

        public void sz(String str) {
            this.qh = str;
        }

        public void uym(String str) {
            this.bw = str;
        }

        public void xq(String str) {
            this.emc = str;
        }

        public void ycc(String str) {
            this.dg = str;
        }

        public void zz(String str) {
            this.gbl = str;
        }

        public String ypw() {
            return this.zz;
        }

        public List<Integer> emc() {
            return this.msw;
        }

        public void ypw(String str) {
            this.ycc = str;
        }

        public void emc(List<Integer> list) {
            this.msw = list;
        }

        public void emc(String str) {
            this.zz = str;
        }
    }

    public rie() {
        com.bytedance.sdk.openadsdk.core.model.emc emcVar = new com.bytedance.sdk.openadsdk.core.model.emc();
        this.sf = emcVar;
        emcVar.emc(this);
    }

    private com.bytedance.sdk.openadsdk.core.gbl.msw.emc dsk() {
        emc emcVarZhk = zhk();
        if (emcVarZhk == null) {
            return null;
        }
        return emc.ypw(emcVarZhk, String.valueOf(tx()));
    }

    public static boolean fu(int i10) {
        return i10 == 44 || i10 == 43 || i10 == 30 || i10 == 40 || i10 == 41 || i10 == 39;
    }

    private com.bytedance.sdk.openadsdk.core.gbl.msw.emc zou() {
        cuf cufVarKv = kv();
        if (cufVarKv == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.gbl.msw.emc().emc(cufVarKv.emc()).ypw(cufVarKv.ypw()).xq(cufVarKv.xq()).dg(cufVarKv.dg()).bw(tx() + "_v3");
    }

    public long aa() {
        return this.jnq;
    }

    public boolean ak() {
        int i10 = this.xof;
        return (i10 == 1 || i10 == 3) && qio() != null;
    }

    public String al() {
        return this.kda;
    }

    public cf alt() {
        return this.ix;
    }

    public int aod() {
        return this.xof;
    }

    public long atj() {
        return this.sra;
    }

    public sf au() {
        return this.qwr;
    }

    public int av() {
        return this.wg;
    }

    public long az() {
        return this.jxk;
    }

    public float bb() {
        float f10 = this.zc;
        if (f10 > 0.0f) {
            return f10;
        }
        cuf cufVar = this.jl;
        if (cufVar != null) {
            String strDg = cufVar.dg();
            if (TextUtils.isEmpty(strDg)) {
                strDg = com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc("adv3", this.jl.emc(), this.jl.ypw());
            }
            if (strDg != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strDg).optJSONObject(TtmlNode.TAG_BODY);
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.zc = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.zc = 0.0f;
        return 0.0f;
    }

    public int bhr() {
        int i10 = this.qh;
        return i10 >= 0 ? i10 : com.bytedance.sdk.openadsdk.core.aa.dg().yzg(String.valueOf(tx()));
    }

    public boolean bkx() {
        int i10 = this.wo;
        return (i10 == 2 || i10 == 1) && 3 == this.ra;
    }

    public int blf() {
        return this.az;
    }

    public String bpi() {
        return this.uym;
    }

    public boolean but() {
        if (this.az <= 0) {
            this.az = mfx();
        }
        int i10 = this.az;
        return (i10 == 7 || i10 == 8) && !bw(this) && nw() != 21 && this.pv == 1;
    }

    public int bv() {
        return this.ipv;
    }

    public String bw() {
        int iBlf = blf();
        return iBlf != 1 ? iBlf != 3 ? iBlf != 5 ? iBlf != 7 ? iBlf != 8 ? "unknown" : "fullscreen_interstitial_ad" : "rewarded_video" : "embeded_ad" : "open_ad" : "banner_ad";
    }

    public boolean cf() {
        return this.cuf;
    }

    public boolean ckv() {
        yzg yzgVar;
        if (this.kv == null || (yzgVar = this.blf) == null) {
            return false;
        }
        return yzgVar.emc(!TextUtils.isEmpty(r0.getBidAdm()));
    }

    public dr cn() {
        return this.gc;
    }

    public boolean cuf() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectEtw = etw();
        if (jSONObjectEtw == null || (jSONArrayOptJSONArray = jSONObjectEtw.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (jSONArrayOptJSONArray.optInt(i10) == 186) {
                return true;
            }
        }
        return false;
    }

    public List<String> cwv() {
        return this.wad;
    }

    public yzg db() {
        return this.blf;
    }

    public com.bytedance.sdk.openadsdk.core.model.emc dg() {
        return this.sf;
    }

    public boolean dk() {
        return this.qlw;
    }

    public String dm() {
        return this.rqm;
    }

    public boolean dor() {
        emc emcVar = this.hh;
        if (emcVar != null) {
            return !TextUtils.isEmpty(emcVar.gbl());
        }
        int i10 = this.nx;
        return i10 == 9 || i10 == 10;
    }

    public int dpk() {
        return this.fxt;
    }

    public String dr() {
        return this.uie;
    }

    @Nullable
    public String drx() {
        ycc yccVarMjd = mjd();
        if (yccVarMjd == null || TextUtils.isEmpty(yccVarMjd.emc())) {
            return null;
        }
        return yccVarMjd.emc();
    }

    public boolean dsx() {
        return this.hoq;
    }

    public mxo du() {
        return this.vw;
    }

    public boolean ec() {
        return this.sup;
    }

    public msw ee() {
        return this.ltj;
    }

    public long efd() {
        if (this.zrm < 0) {
            JSONObject jSONObjectLdy = ldy();
            if (jSONObjectLdy != null) {
                this.zrm = jSONObjectLdy.optLong("ad_id", 0L);
            } else {
                this.zrm = 0L;
            }
        }
        return this.zrm;
    }

    public int eg() {
        return this.cf;
    }

    @Nullable
    public dg eh() {
        dg dgVarQh;
        bw bwVar = this.sba;
        if (bwVar != null) {
            dgVarQh = bwVar.xq();
        } else {
            com.bytedance.sdk.openadsdk.core.sup.emc emcVar = this.mjd;
            dgVarQh = emcVar != null ? emcVar.qh() : null;
        }
        if (dgVarQh != null) {
            dgVarQh.emc(this);
        }
        return dgVarQh;
    }

    public int ej() {
        return this.nx;
    }

    public hxp emc() {
        return this.ee;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rie.class == obj.getClass()) {
            rie rieVar = (rie) obj;
            if (this.fu.equals(rieVar.ye()) && this.pe.equals(rieVar.wdp())) {
                return true;
            }
        }
        return false;
    }

    public JSONObject etw() {
        return this.ak;
    }

    public PAGBannerSize fcw() {
        return this.rd;
    }

    public List<String> ff() {
        return this.but;
    }

    public uym ffd() {
        return this.kx;
    }

    public int fw() {
        return this.cwv;
    }

    public void fwh() {
        this.vw.bw();
        ycc(false);
    }

    public int fxt() {
        return this.zxw;
    }

    public String gbl() {
        return this.dr;
    }

    public String gc() {
        return this.yzg;
    }

    public String ge() {
        return this.ge;
    }

    public JSONObject gef() throws JSONException {
        JSONObject jSONObjectGbl = gbl(false);
        JSONObject jSONObjectSba = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().sba(String.valueOf(tx()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectGbl);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectSba);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("MaterialMeta", "toJsonObjPlus", e10.getMessage());
            return jSONObject;
        }
    }

    public boolean gf() {
        b bVar = this.vum;
        return bVar == null || bVar.L() != 1;
    }

    public boolean gn() {
        int i10 = this.xxg;
        return i10 == 44 || i10 == 43;
    }

    public int gy() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.emc emcVarDg = dg();
        if (emcVarDg != null && emcVarDg.sup() != null) {
            return emcVarDg.sup().zz();
        }
        if (vaf() != null) {
            strValueOf = vaf().getCodeId();
        } else {
            int iTx = tx();
            strValueOf = iTx != 0 ? String.valueOf(iTx) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.aa.dg().gbl(strValueOf);
        }
        return 30;
    }

    public com.bytedance.sdk.component.adexpress.emc.xq.dg gyw() {
        emc emcVarZhk = zhk();
        if (emcVarZhk == null) {
            return null;
        }
        return emc.emc(emcVarZhk, String.valueOf(tx()));
    }

    public boolean hgw() {
        return mfx() == 5;
    }

    public int hh() {
        return this.yuz;
    }

    public int hj() {
        if (xmt()) {
            return 5;
        }
        return yvi() ? 4 : 1;
    }

    public aa hm() {
        return this.in;
    }

    public int hoq() {
        return this.sg;
    }

    public String hs() {
        return this.ltx;
    }

    public ylm hxp() {
        return this.rlt;
    }

    public b iat() {
        return this.vum;
    }

    public String igv() {
        return this.xhi;
    }

    public int in() {
        return this.jp;
    }

    public String ipv() {
        return this.dm;
    }

    public double ipz() {
        return zz(ldy());
    }

    public db ivb() {
        return this.tf;
    }

    public int iw() {
        int i10 = this.cf;
        return i10 >= 0 ? i10 : com.bytedance.sdk.openadsdk.core.aa.dg().ru(String.valueOf(tx()));
    }

    public JSONObject ix() {
        return this.av;
    }

    public com.bytedance.sdk.openadsdk.core.gbl.msw.emc iyl() {
        return this.un;
    }

    @NonNull
    public List<rie> ji() {
        return this.sf.dg();
    }

    public int jl() {
        return this.xou;
    }

    public boolean jn() {
        return mfx() == 3 || mfx() == 4;
    }

    public boolean jnq() {
        return this.pz == 1;
    }

    public int jp() {
        return this.xxo;
    }

    public int jxk() {
        return this.sx;
    }

    public sz kda() {
        return this.wbn;
    }

    public int kkn() {
        return this.oug;
    }

    public int knr() {
        return this.tvh;
    }

    public void ksn() {
        if (!TextUtils.isEmpty(vum())) {
            qh(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        Map<String, Object> mapZek = zek();
        if (mapZek == null || !mapZek.containsKey("price")) {
            return;
        }
        mapZek.put("price", MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    public cuf kv() {
        return this.jl;
    }

    public float kx() {
        if (this.rr <= 0.0f) {
            this.rr = 100.0f;
        }
        return (this.rr * 1000.0f) / 1000.0f;
    }

    public int lad() {
        Map<String, Object> map = this.dpk;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int lce() {
        return this.wq;
    }

    public JSONObject ldy() {
        if (this.oa == null) {
            try {
                if (!TextUtils.isEmpty(this.pe)) {
                    this.oa = new JSONObject(this.pe);
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ul.xq("MaterialMeta", e10.getMessage());
            }
        }
        return this.oa;
    }

    public JSONObject lpq() {
        return this.wdp;
    }

    public boolean lr() {
        return !ak() && xof() == 1;
    }

    public boolean lt() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectEtw = etw();
        if (jSONObjectEtw != null && (jSONArrayOptJSONArray = jSONObjectEtw.optJSONArray("tag_ids")) != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                if (jSONArrayOptJSONArray.optInt(i10) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public int ltf() {
        return this.msw;
    }

    public b ltj() {
        return this.vhn;
    }

    public int ltx() {
        return this.vyk;
    }

    public String lvs() {
        JSONObject jSONObjectLdy;
        String strOptString = this.dsx;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectLdy = ldy()) != null) {
            strOptString = jSONObjectLdy.optString("req_id", "");
            cuf(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public int mfx() {
        if (this.az < 0) {
            JSONObject jSONObjectLdy = ldy();
            if (jSONObjectLdy != null) {
                this.az = jSONObjectLdy.optInt("ad_slot_type", 0);
            } else {
                this.az = 0;
            }
        }
        return this.az;
    }

    public ycc mjd() {
        return this.nw;
    }

    public boolean mkp() {
        return this.fw;
    }

    public String msw() {
        ee eeVarSup;
        com.bytedance.sdk.openadsdk.core.model.emc emcVarDg = dg();
        if (emcVarDg == null || (eeVarSup = emcVarDg.sup()) == null) {
            return null;
        }
        return eeVarSup.uym();
    }

    public com.bytedance.sdk.openadsdk.core.gbl.msw.emc mxo() {
        return this.lce;
    }

    public int nb() {
        return this.ycc;
    }

    public int ndl() {
        uym uymVar = this.kx;
        if (uymVar == null) {
            return 2;
        }
        return uymVar.ypw();
    }

    public String ng() {
        return this.ndl;
    }

    public int nw() {
        return this.xxg;
    }

    public boolean nwn() {
        return ak() || this.sba != null;
    }

    public int nx() {
        return this.kkn;
    }

    public boolean oa() {
        return hh() == 100 || this.wo == 20;
    }

    public int ob() {
        return this.orp;
    }

    public int ono() {
        if (this.xst != 2) {
            this.xst = 1;
        }
        return this.xst;
    }

    public long op() {
        Map<String, Object> mapZek = zek();
        if (mapZek == null) {
            return 0L;
        }
        try {
            Object obj = mapZek.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public JSONObject orp() {
        return this.oz;
    }

    public long ot() {
        return this.zz;
    }

    public boolean oug() {
        return this.zxw == 1;
    }

    public boolean oz() {
        return this.wg == 1;
    }

    public xmt pdk() {
        return this.gf;
    }

    public boolean pdv() {
        return this.vw.emc > 0;
    }

    public int pe() {
        return this.bv;
    }

    public long ph() {
        return this.sz;
    }

    public void pia() {
        this.qlw = true;
    }

    public int pm() {
        return this.hs;
    }

    public boolean pob() {
        return this.bw;
    }

    public com.bytedance.sdk.openadsdk.ee.emc.ypw ptf() {
        return this.jn;
    }

    public int pv() {
        return this.qhy;
    }

    public ypw pvi() {
        return this.ldy;
    }

    public int px() {
        int i10 = this.db;
        return i10 >= 0 ? i10 : zc() ? 30 : 5;
    }

    public int pxa() {
        return this.dk;
    }

    public int pxj() {
        if (ak()) {
            return 5;
        }
        if (kx() != 100.0f || yid() == 2) {
            return 0;
        }
        return this.etw;
    }

    public List<FilterWord> pz() {
        return this.tp;
    }

    public int qam() {
        JSONObject jSONObject = this.wdp;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public boolean qh() {
        return this.f9292aa;
    }

    public int qhy() {
        return this.gyw;
    }

    public com.bytedance.sdk.openadsdk.core.sup.emc qio() {
        return this.mjd;
    }

    public String qlw() {
        return this.ya;
    }

    public int qp() {
        qh qhVar = this.tc;
        if (qhVar == null) {
            return 0;
        }
        return qhVar.emc();
    }

    public int qve() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.emc emcVarDg = dg();
        if (emcVarDg != null && emcVarDg.sup() != null) {
            return emcVarDg.sup().zz();
        }
        if (vaf() != null) {
            strValueOf = vaf().getCodeId();
        } else {
            int iTx = tx();
            strValueOf = iTx != 0 ? String.valueOf(iTx) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.aa.dg().yzg(strValueOf);
        }
        return 5;
    }

    public String qwr() {
        return this.hj;
    }

    public boolean qxc() {
        return mfx() == 8;
    }

    public void ra() {
        this.qam = true;
    }

    public b rd() {
        return this.se;
    }

    public boolean rgy() {
        return this.hs == 1;
    }

    public boolean ri() {
        cf cfVar;
        return ak() && !pdv() && (cfVar = this.ix) != null && cfVar.emc() == 1;
    }

    public boolean rie() {
        return (TextUtils.isEmpty(ylm()) || TextUtils.isEmpty(sra())) ? false : true;
    }

    public String rig() {
        return this.yid;
    }

    public String rlt() {
        return this.rig;
    }

    public String rqm() {
        return this.ob;
    }

    public List<sba> rr() {
        return this.iyl;
    }

    public String rtt() {
        return this.gef;
    }

    public int ru() {
        return this.ul;
    }

    public boolean sb() {
        return this.uw;
    }

    public int sba() {
        return this.ru;
    }

    public int se() {
        return this.igv;
    }

    public String sf() {
        return this.lr;
    }

    public int sg() {
        JSONObject jSONObject;
        int i10 = this.nwn;
        return (Integer.MIN_VALUE != i10 || (jSONObject = this.ak) == null) ? i10 : jSONObject.optInt("click_trigger_type", 0);
    }

    @Nullable
    public bw sno() {
        return this.sba;
    }

    public String sra() {
        return this.ono;
    }

    public String sup() {
        return this.xmt;
    }

    public int sx() {
        return this.ra;
    }

    public int sz() {
        return this.lt;
    }

    public sba tc() {
        return this.pxa;
    }

    public int tf() {
        return this.cn;
    }

    public boolean tmx() {
        db dbVar = this.tf;
        if (dbVar == null || dbVar.ypw() != 1) {
            return false;
        }
        hxp hxpVar = this.ee;
        return hxpVar == null || hxpVar.emc() <= 0;
    }

    public int tp() {
        return this.yvi;
    }

    public int tvh() {
        return this.ye;
    }

    public int tx() {
        JSONObject jSONObjectLdy = ldy();
        if (jSONObjectLdy != null) {
            return jSONObjectLdy.optInt("rit", 0);
        }
        return 0;
    }

    public boolean tze() {
        return vaf() != null && vaf().getDurationSlotType() == 8 && yvi();
    }

    public boolean ud() {
        return this.hxp;
    }

    public boolean uh() {
        return mfx() == 1;
    }

    public JSONObject uie() {
        return gbl(true);
    }

    public boolean ul() {
        return this.xxs;
    }

    public int umn() {
        return this.ylm;
    }

    public int un() {
        int i10 = this.ff;
        if (i10 >= 0) {
            return i10;
        }
        return 30;
    }

    public boolean uw() {
        if (this.iyl.isEmpty()) {
            return false;
        }
        if (this.jp == 4 && this.iyl.size() < 3) {
            return false;
        }
        Iterator<sba> it = this.iyl.iterator();
        while (it.hasNext()) {
            if (!it.next().bw()) {
                return false;
            }
        }
        return true;
    }

    public int uym() {
        return this.mkp;
    }

    public String uz() {
        return this.efd;
    }

    public AdSlot vaf() {
        return this.kv;
    }

    public boolean vcl() {
        hxp hxpVar = this.ee;
        return hxpVar != null && hxpVar.emc() > 0;
    }

    public int vhn() {
        return this.qp;
    }

    public int vk() {
        return this.hm;
    }

    public String vum() {
        return this.knr;
    }

    public boolean vw() {
        return this.al;
    }

    public String vyk() {
        return this.ffd;
    }

    public String wa() {
        JSONObject jSONObjectLdy;
        if (this.wy == null && (jSONObjectLdy = ldy()) != null) {
            this.wy = jSONObjectLdy.optString(BidResponsedEx.KEY_CID, "");
        }
        return this.wy;
    }

    public int wad() {
        if (this.alt < 0) {
            try {
                JSONObject jSONObjectLdy = ldy();
                if (jSONObjectLdy != null) {
                    this.alt = jSONObjectLdy.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.alt = 0;
                }
            } catch (Throwable unused) {
                this.alt = 0;
            }
        }
        return this.alt;
    }

    public int wbn() {
        return this.yz;
    }

    public String wcv() {
        return this.iat;
    }

    public void wd() {
        b bVar = this.vum;
        if (bVar == null || TextUtils.isEmpty(bVar.v())) {
            return;
        }
        try {
            if (!this.vum.v().contains("style_id")) {
                this.fw = false;
            } else {
                this.fw = true;
                this.gef = Uri.parse(this.vum.v()).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq(th.getMessage(), new Object[0]);
        }
    }

    public boolean wdg() {
        return this.qio;
    }

    public String wdp() {
        return this.pe;
    }

    public boolean wf() {
        return this.emc;
    }

    public com.bytedance.sdk.component.zz.ypw.emc wg() {
        com.bytedance.sdk.component.zz.ypw.emc emcVar = new com.bytedance.sdk.component.zz.ypw.emc();
        emcVar.emc(this.kkn);
        emcVar.ypw(this.fu);
        emcVar.xq(this.rig);
        emcVar.emc(wdp());
        return emcVar;
    }

    public boolean wh() {
        return this.mfx;
    }

    public boolean wo() {
        return this.qam;
    }

    public boolean wpn() {
        return this.pia;
    }

    public List<String> wq() {
        return this.mxo;
    }

    public int wy() {
        return this.zek;
    }

    public long xhi() {
        uym uymVar = this.kx;
        if (uymVar == null) {
            return 0L;
        }
        return uymVar.xq();
    }

    public long xiq() {
        return this.rie;
    }

    public String xit() {
        return this.sb;
    }

    public boolean xmt() {
        List<Integer> listEmc;
        return (zhk() == null || (listEmc = zhk().emc()) == null || !listEmc.contains(57)) ? false : true;
    }

    public int xof() {
        return this.rgy;
    }

    public String xou() {
        return this.wd;
    }

    public int xq() {
        return this.rtt;
    }

    public String xst() {
        return this.wa;
    }

    public int xxg() {
        try {
            JSONObject jSONObjectLdy = ldy();
            if (jSONObjectLdy != null) {
                return jSONObjectLdy.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public String xxo() {
        if (!TextUtils.isEmpty(this.ndl)) {
            return this.ndl;
        }
        Context contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
        int iSx = sx();
        if (iSx != 2 && iSx != 3) {
            if (iSx == 4) {
                return contextEmc != null ? com.bytedance.sdk.component.utils.rie.emc(contextEmc, "tt_video_download_apk") : this.ndl;
            }
            if (iSx != 8) {
                return this.ndl;
            }
        }
        return contextEmc != null ? com.bytedance.sdk.component.utils.rie.emc(contextEmc, "tt_video_mobile_go_detail") : this.ndl;
    }

    public gbl xxs() {
        return this.dor;
    }

    public sba ya() {
        return this.wpn;
    }

    public boolean ycc() {
        db dbVar;
        int iFu = fu();
        if (wpn() && dr.xq(this) && iFu != 43 && iFu != 44) {
            return false;
        }
        if (!wpn() && fu(iFu) && (dbVar = this.tf) != null && dbVar.emc() == 1) {
            return false;
        }
        boolean z10 = (iFu == 33 || iFu == 5 || iFu == 6 || iFu == 19 || iFu == 12) ? false : true;
        if (ak() || yid() == 2 || !z10 || !com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg.emc(tp.xq(this.az))) {
            return yid() == 2 && z10;
        }
        return true;
    }

    public String ye() {
        return this.fu;
    }

    public int yid() {
        int i10 = this.wo;
        if (i10 == 5 || i10 == 6 || i10 == 33) {
            return 1;
        }
        if (tze()) {
            return 2;
        }
        return this.pm;
    }

    public String ylm() {
        return this.wcv;
    }

    public boolean yo() {
        return true;
    }

    public int ypw() {
        uym uymVarFfd = ffd();
        if (uymVarFfd != null) {
            return uymVarFfd.emc();
        }
        return -1;
    }

    public int yuz() {
        return this.zhk;
    }

    public boolean yvi() {
        return this.xof == 2;
    }

    public boolean yz() {
        return this.lpq;
    }

    public boolean yzg() {
        return this.pxj;
    }

    public boolean zc() {
        return mfx() == 7;
    }

    public Map<String, Object> zek() {
        return this.dpk;
    }

    public emc zhk() {
        return this.hh;
    }

    public int zrm() {
        return this.ej;
    }

    public int zxw() {
        return this.ng;
    }

    public long zz() {
        return this.vk;
    }

    public static boolean dg(rie rieVar) {
        return (rieVar == null || rieVar.iat() == null || rieVar.iat().i() != 1) ? false : true;
    }

    private String mxo(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.vk.emc(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    public static boolean uym(rie rieVar) {
        Object obj;
        if (rieVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapZek = rieVar.zek();
            if (mapZek == null || (obj = mapZek.get(TTAdConstant.SDK_BIDDING_TYPE)) == null) {
                return false;
            }
            return 2 == Integer.parseInt(obj.toString());
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private static double zz(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public void aa(int i10) {
        this.sx = i10;
    }

    public void cf(int i10) {
        this.pm = i10;
    }

    public void cn(int i10) {
        this.ylm = i10;
    }

    public void db(int i10) {
        this.fxt = i10;
    }

    public void dr(int i10) {
        this.wg = i10;
    }

    public void ee(int i10) {
        this.oug = i10;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        if (emcVar != null) {
            this.sf = emcVar;
        }
    }

    public void ffd(int i10) {
        this.msw = i10;
    }

    public int fu() {
        return this.wo;
    }

    public void gbl(String str) {
        this.ob = str;
    }

    public void hxp(int i10) {
        this.sg = i10;
    }

    public void iyl(int i10) {
        this.xst = i10;
    }

    public void mkp(int i10) {
        this.ej = i10;
    }

    public void ndl(int i10) {
        if (i10 < 0 || i10 > 30) {
            i10 = 6;
        }
        this.ycc = i10;
    }

    public void pxa(int i10) {
        this.orp = i10;
    }

    public void qh(int i10) {
        this.ipv = i10;
    }

    public void ra(int i10) {
        this.db = i10;
    }

    public void rie(int i10) {
        this.gyw = i10;
    }

    public void rqm(int i10) {
        this.ng = i10;
    }

    public void rtt(int i10) {
        this.jp = i10;
    }

    public void ru(String str) {
        this.uie = str;
    }

    public void sb(int i10) {
        this.yuz = i10;
    }

    public void sba(int i10) {
        this.nx = i10;
    }

    public void sf(int i10) {
        this.kkn = i10;
    }

    public void sra(int i10) {
        this.etw = i10;
    }

    public void sup(int i10) {
        this.wo = i10;
    }

    public void sz(int i10) {
        this.bv = i10;
    }

    public void tp(int i10) {
        this.cwv = i10;
    }

    public void ul(int i10) {
        this.igv = i10;
    }

    public void vk(int i10) {
        this.hs = i10;
    }

    public void vw(int i10) {
        this.ff = i10;
    }

    public void wo(int i10) {
        this.wq = i10;
    }

    public void wpn(int i10) {
        this.zek = Math.max(0, i10);
    }

    public void xhi(int i10) {
        this.cf = i10;
    }

    public void xq(int i10) {
        this.ul = i10;
    }

    public void ylm(int i10) {
        this.qp = i10;
    }

    public void yz(int i10) {
        this.pz = i10;
    }

    public void yzg(int i10) {
        this.zhk = i10;
    }

    public static boolean xq(rie rieVar) {
        return (rieVar == null || rieVar.iat() == null || rieVar.iat().f() != 7 || dr.ypw(rieVar)) ? false : true;
    }

    public void aa(String str) {
        this.xhi = str;
    }

    public void cf(String str) {
        this.ge = str;
    }

    public void db(String str) {
        this.pe = str;
    }

    public void dr(String str) {
        this.kda = str;
    }

    public void ee(String str) {
        this.yzg = str;
    }

    public void emc(int i10) {
        this.rtt = i10;
    }

    public void gbl(int i10) {
        this.yz = i10;
    }

    public void hj(int i10) {
        this.qh = i10;
    }

    public void hxp(String str) {
        this.rig = str;
    }

    public void iyl(String str) {
        this.sb = str;
    }

    public void mkp(String str) {
        if (TextUtils.isEmpty(str)) {
            this.uym = com.bytedance.sdk.openadsdk.ee.emc.xq.xq;
        } else {
            this.uym = str;
        }
    }

    public void qh(String str) {
        this.knr = str;
    }

    public void rie(String str) {
        this.fu = str;
    }

    public void rtt(String str) {
        this.efd = str;
    }

    public void ru(int i10) {
        emc(i10, -1);
    }

    public void sb(String str) {
        this.ya = str;
    }

    public void sba(String str) {
        this.wa = str;
    }

    public void sf(String str) {
        this.iat = str;
    }

    public void sra(String str) {
        this.ndl = str;
    }

    public void sup(String str) {
        this.yid = str;
    }

    public void sz(String str) {
        this.dm = str;
    }

    public void ul(String str) {
        this.wd = str;
    }

    public void vk(String str) {
        this.ltx = str;
    }

    public void xxg(int i10) {
        this.xou = i10;
    }

    public void ylm(String str) {
        this.ffd = str;
    }

    public void ypw(int i10) {
        this.mkp = i10;
    }

    public void yzg(String str) {
        this.rqm = str;
    }

    public void zz(String str) {
        this.lr = str;
    }

    public static int dg(String str) {
        return emc(xq(str));
    }

    private static long msw(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static JSONObject xq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("MaterialMeta", e10.getMessage());
            return null;
        }
    }

    public static boolean ypw(rie rieVar) {
        return (emc(rieVar) || xq(rieVar)) ? false : true;
    }

    public void aa(boolean z10) {
        this.hxp = z10;
    }

    public void cf(boolean z10) {
        this.mfx = z10;
    }

    public void emc(long j10) {
        this.vk = j10;
    }

    public JSONObject gbl(boolean z10) throws JSONException {
        JSONObject jSONObjectBw;
        JSONObject jSONObjectGbl;
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put("raw_response_info", uz());
            } catch (Exception unused) {
            }
        }
        jSONObject.put("interaction_type", sx());
        jSONObject.put("iv_skip_time", this.qh);
        jSONObject.put("rv_skip_time", this.cf);
        jSONObject.put(xq, av());
        jSONObject.put("interaction_method", nw());
        jSONObject.put("top_area_leave_blank", wbn());
        jSONObject.put("lp_click_type", ltf());
        jSONObject.put("lp_click_interval", ot());
        jSONObject.put("proportion_watching", bv());
        jSONObject.put(ypw, fxt());
        jSONObject.put(dg, knr());
        jSONObject.put("target_url", xst());
        jSONObject.put("app_log_url", rlt());
        jSONObject.put("settings_url", this.yzg);
        jSONObject.put("gecko_id", qlw());
        jSONObject.put("extension", lpq());
        jSONObject.put("ad_id", ye());
        jSONObject.put("source", hs());
        jSONObject.put("app_name", igv());
        jSONObject.put("screenshot", dsx());
        jSONObject.put("dislike_control", xof());
        jSONObject.put("play_bar_show_time", hoq());
        jSONObject.put("play_bar_style", pxj());
        jSONObject.put("if_block_lp", pm());
        jSONObject.put("cache_sort", kkn());
        jSONObject.put("if_sp_cache", dpk());
        jSONObject.put("render_control", yid());
        jSONObject.put("mrc_report", this.pz);
        jSONObject.put("isMrcReportFinish", this.qlw);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cta", ltx());
        jSONObject2.put("other", jp());
        jSONObject.put("set_click_type", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(CampaignEx.JSON_KEY_REWARD_NAME, rig());
        jSONObject3.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, pe());
        jSONObject.put("reward_data", jSONObject3);
        if (!TextUtils.isEmpty(ylm()) && !TextUtils.isEmpty(sra())) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("adchoices_icon", ylm());
            jSONObject4.put("adchoices_url", sra());
            jSONObject.put("dsp_adchoices", jSONObject4);
        }
        sba sbaVarYa = ya();
        if (sbaVarYa != null && !TextUtils.isEmpty(sbaVarYa.emc())) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("url", sbaVarYa.emc());
            jSONObject5.put("height", sbaVarYa.xq());
            jSONObject5.put("width", sbaVarYa.ypw());
            jSONObject.put(RewardPlus.ICON, jSONObject5);
        }
        sba sbaVarTc = tc();
        if (sbaVarTc != null && !TextUtils.isEmpty(sbaVarTc.emc())) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("url", sbaVarTc.emc());
            jSONObject6.put("height", sbaVarTc.xq());
            jSONObject6.put("width", sbaVarTc.ypw());
            jSONObject.put("cover_image", jSONObject6);
        }
        JSONObject jSONObjectOrp = orp();
        if (jSONObjectOrp != null) {
            jSONObject.put("session_params", jSONObjectOrp);
        }
        JSONObject jSONObjectIx = ix();
        if (jSONObjectIx != null) {
            jSONObject.put("dynamic_configs", jSONObjectIx);
        }
        gbl gblVarXxs = xxs();
        if (gblVarXxs != null) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("click_upper_content_area", gblVarXxs.emc);
            jSONObject7.put("click_upper_non_content_area", gblVarXxs.ypw);
            jSONObject7.put("click_lower_content_area", gblVarXxs.xq);
            jSONObject7.put("click_lower_non_content_area", gblVarXxs.dg);
            jSONObject7.put("click_button_area", gblVarXxs.bw);
            jSONObject7.put("click_video_area", gblVarXxs.ycc);
            jSONObject.put("click_area", jSONObject7);
        }
        msw mswVarEe = ee();
        if (mswVarEe != null) {
            jSONObject.put("arbitrage_interceptor_params", mswVarEe.msw());
        }
        AdSlot adSlotVaf = vaf();
        if (adSlotVaf != null) {
            jSONObject.put("adslot", adSlotVaf.toJsonObj());
        }
        emc(this, jSONObject);
        List<String> listCwv = cwv();
        if (listCwv != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = listCwv.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("show_url", jSONArray);
        }
        List<String> listFf = ff();
        if (listFf != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it2 = listFf.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, jSONArray2);
        }
        List<String> listWq = wq();
        if (listWq != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator<String> it3 = listWq.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(it3.next());
            }
            jSONObject.put("play_start", jSONArray3);
        }
        jSONObject.put("phone_num", dm());
        jSONObject.put(CampaignEx.JSON_KEY_TITLE, xou());
        jSONObject.put("description", vyk());
        jSONObject.put("ext", wdp());
        jSONObject.put("image_mode", in());
        jSONObject.put("cover_click_area", hh());
        jSONObject.put("intercept_flag", qhy());
        jSONObject.put("button_text", xxo());
        jSONObject.put("ad_logo", vhn());
        jSONObject.put("video_adaptation", se());
        jSONObject.put("feed_video_opentype", jxk());
        jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, ono());
        jSONObject.put("aspect_ratio", kx());
        ypw(this, jSONObject);
        sz szVarKda = kda();
        if (szVarKda != null) {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("deeplink_url", szVarKda.emc());
            jSONObject8.put("fallback_url", szVarKda.ypw());
            jSONObject8.put("fallback_type", szVarKda.xq());
            jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject8);
        }
        jSONObject.put("is_web_jump_ip", this.ru);
        sf sfVarAu = au();
        if (sfVarAu != null && (jSONObjectGbl = sfVarAu.gbl()) != null) {
            jSONObject.put("oem", jSONObjectGbl);
        }
        db dbVarIvb = ivb();
        if (dbVarIvb != null && (jSONObjectBw = dbVarIvb.bw()) != null) {
            jSONObject.put("multi_ad_scene", jSONObjectBw);
        }
        List<FilterWord> listPz = pz();
        if (listPz != null) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator<FilterWord> it4 = listPz.iterator();
            while (it4.hasNext()) {
                JSONObject jSONObjectYpw = ypw(it4.next());
                if (jSONObjectYpw != null) {
                    jSONArray4.put(jSONObjectYpw);
                }
            }
            jSONObject.put("filter_words", jSONArray4);
        }
        cn().emc(jSONObject);
        jSONObject.put("count_down", zrm());
        jSONObject.put("expiration_time", az());
        b bVarLtj = ltj();
        if (bVarLtj != null) {
            jSONObject.put("video", bVarLtj.t());
        }
        b bVarRd = rd();
        if (bVarRd != null) {
            jSONObject.put("h265_video", bVarRd.t());
        }
        jSONObject.put("video_encode_type", tvh());
        JSONObject jSONObject9 = new JSONObject();
        jSONObject9.put("if_send_click", qp());
        jSONObject.put("download_conf", jSONObject9);
        if (zek() != null) {
            JSONObject jSONObject10 = new JSONObject();
            Set<Map.Entry<String, Object>> setEntrySet = zek().entrySet();
            if (!setEntrySet.isEmpty()) {
                for (Map.Entry<String, Object> entry : setEntrySet) {
                    jSONObject10.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("media_ext", jSONObject10);
        }
        jSONObject.put("lp_cache_count", uym());
        emc emcVarZhk = zhk();
        if (emcVarZhk != null) {
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("id", emcVarZhk.dg());
            jSONObject11.put("md5", emcVarZhk.bw());
            jSONObject11.put("url", emcVarZhk.ycc());
            jSONObject11.put("data", emcVarZhk.uym());
            jSONObject11.put("diff_data", emcVarZhk.msw());
            jSONObject11.put("version", emcVarZhk.xq());
            jSONObject11.put("dynamic_creative", emcVarZhk.zz());
            jSONObject11.put("engine_version", emcVarZhk.gbl());
            jSONObject11.put("ugen_data", emcVarZhk.cf());
            jSONObject11.put("ugen_md5", emcVarZhk.qh());
            jSONObject11.put("ugen_url", emcVarZhk.sz());
            jSONObject.put("tpl_info", jSONObject11);
        }
        cuf cufVar = this.jl;
        if (cufVar != null) {
            jSONObject.put("tpl_info_v3", cufVar.uym());
        }
        jSONObject.put("dynamic_creative", etw());
        jSONObject.put("creative_extra", ge());
        jSONObject.put("market_url", wcv());
        jSONObject.put("auction_price", vum());
        jSONObject.put("ad_info", ipv());
        jSONObject.put("is_package_open", fw());
        jSONObject.put("playable_duration_time", un());
        jSONObject.put("playable_endcard_close_time", lce());
        jSONObject.put("endcard_close_time", jl());
        JSONObject jSONObject12 = new JSONObject();
        jSONObject12.put("render_sequence", ej());
        jSONObject12.put("backup_render_control", yuz());
        jSONObject12.put("reserve_time", wy());
        jSONObject12.put("render_thread", ob());
        jSONObject.put("render", jSONObject12);
        if (this.rlt == null) {
            ylm ylmVar = new ylm();
            this.rlt = ylmVar;
            ylmVar.emc("");
            this.rlt.emc(10L);
            this.rlt.ypw(20L);
            this.rlt.xq(10L);
            this.rlt.dg(20L);
        }
        JSONObject jSONObject13 = new JSONObject();
        jSONObject13.put("onlylp_loading_maxtime", this.rlt.emc());
        jSONObject13.put("straight_lp_showtime", this.rlt.ypw());
        jSONObject13.put("onlyagg_loading_maxtime", this.rlt.xq());
        jSONObject13.put("straight_agg_showtime", this.rlt.dg());
        jSONObject13.put("loading_text", this.rlt.bw());
        yzg yzgVar = this.blf;
        if (yzgVar != null) {
            jSONObject13 = yzgVar.emc(jSONObject13);
        }
        jSONObject.put("interaction_method_params", jSONObject13);
        JSONObject jSONObject14 = new JSONObject();
        jSONObject14.put("splash_clickarea", ndl());
        jSONObject14.put("splash_layout_id", hj());
        jSONObject14.put("load_wait_time", xhi());
        uym uymVar = this.kx;
        jSONObject14.put("skip_time", uymVar != null ? uymVar.emc() : 0);
        jSONObject.put("splash_control", jSONObject14);
        if (yvi()) {
            jSONObject.put("dsp_html", this.kda);
        }
        if (ak()) {
            jSONObject.put("vast_json", this.mjd.ru());
        }
        jSONObject.put("dsp_material_type", aod());
        jSONObject.put("deep_link_appname", this.hj);
        jSONObject.put("landing_page_download_clicktype", this.cn);
        cf cfVar = this.ix;
        if (cfVar != null) {
            jSONObject.put("dsp_style", cfVar.xq());
        }
        jSONObject.put("identificationOverlayContent", this.uie);
        if (this.un != null) {
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.un.emc(this.lce));
            jSONObject.put("ugen", jSONObject15);
        }
        jSONObject.put("preload_h5_type", tp());
        jSONObject.put("hasReportShow", this.lpq);
        jSONObject.put("endcard_creative", this.ob);
        jSONObject.put("image_stay", this.pv);
        jSONObject.put("ad_label", this.ldy.ycc());
        JSONObject jSONObject16 = new JSONObject();
        jSONObject16.put("enable", this.bw);
        jSONObject16.put("wait_time", this.ycc);
        jSONObject16.put("label", this.uym);
        jSONObject.put("ev", jSONObject16);
        jSONObject.put("ad_label", this.ldy.ycc());
        if (this.rd != null) {
            JSONObject jSONObject17 = new JSONObject();
            jSONObject17.put("width", this.rd.getWidth());
            jSONObject17.put("height", this.rd.getHeight());
            jSONObject.put("banner", jSONObject17);
        }
        if (!TextUtils.isEmpty(this.lr)) {
            jSONObject.put("gdid_encrypted", this.lr);
        }
        bw bwVar = this.sba;
        if (bwVar != null) {
            jSONObject.put("ad_tracks", bwVar.ypw());
        }
        hxp hxpVar = this.ee;
        if (hxpVar != null) {
            jSONObject.put("popup", hxpVar.dg());
        }
        jSONObject.put("playable_close_time", this.db);
        return jSONObject;
    }

    public void qh(boolean z10) {
        this.emc = z10;
    }

    public void ru(boolean z10) {
        this.hoq = z10;
    }

    public void sup(boolean z10) {
        this.sup = z10;
    }

    public void sz(boolean z10) {
        this.qio = z10;
    }

    public void vk(boolean z10) {
        this.bw = z10;
    }

    public void xmt(int i10) {
        this.ra = i10;
    }

    public void zz(boolean z10) {
        this.pia = z10;
    }

    public static boolean emc(rie rieVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (emc(rieVar) || z13 || rieVar == null || rieVar.iat() == null || TextUtils.isEmpty(rieVar.iat().v())) {
            return false;
        }
        return xq(rieVar) ? z12 : (rieVar.iat() == null || rieVar.iat().i() != 1) ? z10 : z11;
    }

    public static double ypw(String str) {
        return zz(xq(str));
    }

    public void cuf(int i10) {
        this.tvh = i10;
    }

    public void dg(int i10) {
        this.lt = i10;
    }

    public void lt(int i10) {
        this.zxw = i10;
    }

    public void msw(String str) {
        this.ono = str;
    }

    public void mxo(int i10) {
        this.rgy = i10;
    }

    public void wa(int i10) {
        this.qhy = i10;
    }

    public void xmt(String str) {
        this.hj = str;
    }

    public void zz(int i10) {
        this.pv = i10;
    }

    public void but(int i10) {
        this.cn = i10;
    }

    public void cuf(String str) {
        this.dsx = str;
    }

    public void dg(boolean z10) {
        this.xxs = z10;
    }

    public String lt(String str) {
        JSONObject jSONObjectLdy = ldy();
        return jSONObjectLdy != null ? jSONObjectLdy.optString("rit", str) : str;
    }

    public void msw(boolean z10) {
        this.lpq = z10;
    }

    public void uym(String str) {
        this.wcv = str;
    }

    public static boolean ycc(rie rieVar) {
        if (rieVar == null) {
            return false;
        }
        int iIn = rieVar.in();
        return iIn == 5 || iIn == 15 || iIn == 50;
    }

    public static String ypw(Context context, rie rieVar) {
        if (context != null && rieVar != null) {
            try {
                if (rieVar.sx() != 8) {
                    if (rieVar.ee().emc()) {
                    }
                }
                String strEmc = com.bytedance.sdk.openadsdk.core.emc.emc.emc(context);
                if (TextUtils.isEmpty(strEmc)) {
                    return null;
                }
                return strEmc;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public void dg(JSONObject jSONObject) {
        this.av = jSONObject;
    }

    public void msw(int i10) {
        this.dk = i10;
    }

    public void uym(int i10) {
        this.yvi = i10;
    }

    public void wad(int i10) {
        this.ye = i10;
    }

    public void xq(boolean z10) {
        this.pxj = z10;
    }

    public static boolean bw(rie rieVar) {
        if (rieVar == null) {
            return false;
        }
        int iIn = rieVar.in();
        return rieVar.ak() || iIn == 5 || iIn == 15 || iIn == 50;
    }

    public void dg(long j10) {
        this.sz = j10;
    }

    public void uym(boolean z10) {
        this.al = z10;
    }

    public void wd(int i10) {
        this.xof = i10;
    }

    public void xq(sba sbaVar) {
        this.iyl.add(sbaVar);
    }

    public void ycc(String str) {
        this.xmt = str;
    }

    public static boolean emc(rie rieVar) {
        return (rieVar == null || rieVar.iat() == null || rieVar.iat().f() != 1) ? false : true;
    }

    public void uym(JSONObject jSONObject) {
        this.ldy.emc(jSONObject);
    }

    public void xq(long j10) {
        this.jxk = j10;
    }

    public void ycc(int i10) {
        this.ru = i10;
    }

    public static com.bytedance.sdk.openadsdk.core.sz.emc.ypw emc(String str, rie rieVar) {
        rieVar.rqm(0);
        int iMfx = rieVar.mfx();
        int i10 = 3;
        if (iMfx == 3) {
            i10 = 4;
        } else if (iMfx == 7) {
            i10 = 1;
        } else if (iMfx == 8) {
            i10 = 2;
        }
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.sz.emc.ypw(str, rieVar.ltj(), rieVar.rd(), rieVar.zxw(), rieVar.tvh(), i10);
        ypwVar.emc(com.bytedance.sdk.openadsdk.sra.emc.emc("video_error_conf", 0));
        ypwVar.xq(a.k(ypwVar.vk()));
        return ypwVar;
    }

    public void bw(String str) {
        this.dr = str;
    }

    public void uym(long j10) {
        this.rie = j10;
    }

    public void xq(JSONObject jSONObject) {
        this.oz = jSONObject;
    }

    public void ycc(boolean z10) {
        this.uw = z10;
    }

    public void bw(int i10) {
        this.hm = i10;
    }

    public void xq(b bVar) {
        this.se = bVar;
    }

    public void ycc(JSONObject jSONObject) {
        this.wdp = jSONObject;
    }

    public void ypw(boolean z10) {
        this.cuf = z10;
    }

    public void bw(boolean z10) {
        this.vaf = z10;
    }

    public void ycc(long j10) {
        this.sra = j10;
    }

    public void ypw(long j10) {
        this.jnq = j10;
    }

    public void bw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.ra = 4;
        this.fu = jSONObject.optString("id");
        this.ltx = jSONObject.optString("source");
        ycc yccVar = new ycc();
        this.nw = yccVar;
        yccVar.xq(jSONObject.optString("pkg_name"));
        this.nw.ypw(jSONObject.optString("name"));
        this.nw.emc(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    public void ypw(com.bytedance.sdk.openadsdk.core.gbl.msw.emc emcVar) {
        this.lce = emcVar;
        com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc(emcVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public static long emc(String str) {
        return msw(xq(str));
    }

    public void ypw(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.vyk = 2;
        } else {
            this.vyk = (int) d10;
        }
    }

    public static int emc(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public void ypw(JSONObject jSONObject) {
        this.ak = jSONObject;
    }

    public static String emc(Context context, rie rieVar) {
        if (context == null || rieVar == null || !((rieVar.mfx() == 8 || rieVar.mfx() == 7) && rieVar.oa())) {
            return null;
        }
        String strYpw = ypw(context, rieVar);
        if (TextUtils.isEmpty(strYpw) || com.bytedance.sdk.openadsdk.core.emc.emc.emc() != 1) {
            return null;
        }
        return strYpw;
    }

    public void ypw(sba sbaVar) {
        this.pxa = sbaVar;
    }

    private JSONObject ypw(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(ypw(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public void bw(long j10) {
        this.zz = j10;
    }

    public void emc(boolean z10) {
        this.f9292aa = z10;
    }

    public void emc(msw mswVar) {
        this.ltj = mswVar;
    }

    public void emc(ylm ylmVar) {
        this.rlt = ylmVar;
    }

    public void emc(yzg yzgVar) {
        this.blf = yzgVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.gbl.msw.emc emcVar) {
        this.un = emcVar;
        com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc(emcVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void emc(uym uymVar) {
        this.kx = uymVar;
    }

    public void emc(dr drVar) {
        this.gc = drVar;
    }

    public void emc(int i10, int i11) {
        this.xxg = i10;
        this.wo = i10;
        if (this.kv == null) {
            this.wo = 0;
            return;
        }
        if (i11 <= 0) {
            i11 = mfx();
        }
        if (this.kv.getDurationSlotType() != 3 && i11 != 3) {
            if (this.kv.getDurationSlotType() != 7 && this.kv.getDurationSlotType() != 8 && i11 != 7 && i11 != 8) {
                if (!this.pia && dr.ypw(this)) {
                    this.wo = 4;
                    return;
                }
                if (this.xxg == 4 && !dr.ypw(this)) {
                    this.wo = 0;
                }
                int i12 = this.xxg;
                if (i12 == 41) {
                    this.wo = 41;
                    return;
                }
                if (i10 >= 5) {
                    this.wo = 0;
                    return;
                }
                if (i12 == 2 && sx() != 3) {
                    this.wo = 0;
                    return;
                } else {
                    if (i10 == 0 || (i10 == 1 && sx() != 3)) {
                        this.wo = 0;
                        return;
                    }
                    return;
                }
            }
            if (!this.pia) {
                if (dr.xq(this)) {
                    this.wo = 12;
                    return;
                } else if (dr.ypw(this)) {
                    this.wo = 9;
                    return;
                }
            }
            if (this.xxg == 5 && !ul.dg(this)) {
                this.wo = 7;
            }
            if (this.xxg == 6 && !ul.ypw(this)) {
                this.wo = 7;
            }
            if (this.xxg == 8 && hh() != 100) {
                this.wo = 7;
            }
            if (this.xxg == 19 && TextUtils.isEmpty(this.wa)) {
                this.wo = 7;
            }
            if (this.xxg == 20 && TextUtils.isEmpty(this.wa)) {
                this.wo = 7;
            }
            if (this.xxg == 38 && !ul.xq(this)) {
                this.wo = 7;
            }
            if (i10 < 5) {
                this.wo = 7;
                return;
            }
            return;
        }
        this.wo = 14;
    }

    public void ypw(b bVar) {
        this.vhn = bVar;
    }

    public static void ypw(rie rieVar, JSONObject jSONObject) throws JSONException {
        ycc yccVarMjd = rieVar.mjd();
        if (yccVarMjd != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", yccVarMjd.ypw());
            jSONObject2.put(CampaignEx.JSON_KEY_PACKAGE_NAME, yccVarMjd.xq());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, yccVarMjd.emc());
            jSONObject2.put("score", yccVarMjd.dg());
            jSONObject2.put("comment_num", yccVarMjd.bw());
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, yccVarMjd.ycc());
            jSONObject2.put("app_category", yccVarMjd.uym());
            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        }
    }

    public void emc(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.xxo = 1;
        } else {
            this.xxo = (int) d10;
        }
    }

    public void emc(gbl gblVar) {
        this.dor = gblVar;
    }

    public void emc(AdSlot adSlot) {
        this.kv = adSlot;
    }

    public void emc(emc emcVar) {
        this.hh = emcVar;
        com.bytedance.sdk.component.adexpress.emc.xq.dg dgVarGyw = gyw();
        if (dgVarGyw != null && !dor()) {
            com.bytedance.sdk.component.adexpress.emc.ypw.ypw.emc(dgVarGyw);
        }
        if (emcVar == null || TextUtils.isEmpty(emcVar.sz())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc(dsk(), "ad");
    }

    public void emc(cuf cufVar) {
        this.jl = cufVar;
        if (cufVar == null || TextUtils.isEmpty(cufVar.xq())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc(zou(), "adv3");
    }

    public void emc(b bVar) {
        this.vum = bVar;
    }

    public void emc(qh qhVar) {
        this.tc = qhVar;
    }

    public void emc(sba sbaVar) {
        emc(sbaVar, gbl);
        String strMxo = mxo(sbaVar.emc());
        if (!TextUtils.isEmpty(strMxo)) {
            sbaVar.ypw(strMxo);
        }
        this.wpn = sbaVar;
    }

    private void emc(sba sbaVar, int i10) {
        if (sbaVar != null) {
            try {
                if (TextUtils.isEmpty(sbaVar.emc())) {
                    return;
                }
                if (sbaVar.ypw() == 0 && sbaVar.xq() == 0) {
                    sbaVar.emc(i10);
                    sbaVar.ypw(i10);
                    return;
                }
                if (sbaVar.ypw() == 0) {
                    if (sbaVar.xq() > i10) {
                        sbaVar.ypw(i10);
                        sbaVar.emc(i10);
                        return;
                    } else {
                        sbaVar.emc(sbaVar.xq());
                        return;
                    }
                }
                if (sbaVar.xq() == 0) {
                    if (sbaVar.ypw() > i10) {
                        sbaVar.ypw(i10);
                        sbaVar.emc(i10);
                        return;
                    } else {
                        sbaVar.ypw(sbaVar.ypw());
                        return;
                    }
                }
                if (sbaVar.ypw() > sbaVar.xq()) {
                    if (sbaVar.ypw() > i10) {
                        sbaVar.ypw((int) (i10 / (sbaVar.ypw() / sbaVar.xq())));
                        sbaVar.emc(i10);
                        return;
                    }
                    return;
                }
                if (sbaVar.xq() > i10) {
                    sbaVar.emc((int) (i10 * (sbaVar.ypw() / sbaVar.xq())));
                    sbaVar.ypw(i10);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void emc(ycc yccVar) {
        this.nw = yccVar;
    }

    public void emc(sz szVar) {
        this.wbn = szVar;
    }

    public void emc(FilterWord filterWord) {
        this.tp.add(filterWord);
    }

    public void emc(Map<String, Object> map) {
        this.dpk = map;
    }

    public void emc(float f10) {
        this.rr = f10;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sup.emc emcVar) {
        this.mjd = emcVar;
    }

    public void emc(aa aaVar) {
        this.in = aaVar;
    }

    public void emc(cf cfVar) {
        this.ix = cfVar;
    }

    public void emc(sf sfVar) {
        this.qwr = sfVar;
    }

    public void emc(PAGBannerSize pAGBannerSize) {
        this.rd = pAGBannerSize;
    }

    public void emc(db dbVar) {
        this.tf = dbVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.ee.emc.ypw ypwVar) {
        this.jn = ypwVar;
    }

    public void emc(xmt xmtVar) {
        this.gf = xmtVar;
    }

    public void emc(bw bwVar) {
        this.sba = bwVar;
    }

    public void emc(hxp hxpVar) {
        this.ee = hxpVar;
    }

    public static void emc(rie rieVar, JSONObject jSONObject) throws JSONException {
        List<sba> listRr = rieVar.rr();
        if (listRr != null) {
            JSONArray jSONArray = new JSONArray();
            for (sba sbaVar : listRr) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", sbaVar.emc());
                jSONObject2.put("height", sbaVar.xq());
                jSONObject2.put("width", sbaVar.ypw());
                jSONObject2.put("image_preview", sbaVar.ycc());
                jSONObject2.put("image_key", sbaVar.uym());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }
}
