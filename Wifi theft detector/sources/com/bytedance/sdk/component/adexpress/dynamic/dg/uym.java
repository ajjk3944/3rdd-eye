package com.bytedance.sdk.component.adexpress.dynamic.dg;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.bw.gbl;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym {
    private bw bw;
    private ycc dg;
    public int emc;
    public JSONObject xq;
    private String ycc;
    public String ypw;

    public uym(bw bwVar) {
        this.bw = bwVar;
        this.emc = bwVar.emc();
        this.ypw = bwVar.xq();
        this.xq = bwVar.bw().ltx();
        this.ycc = bwVar.dg();
        if (com.bytedance.sdk.component.adexpress.dg.xq() == 1) {
            this.dg = bwVar.uym();
        } else {
            this.dg = bwVar.bw();
        }
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            this.dg = bwVar.bw();
        }
    }

    private boolean ej() {
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.ypw) && this.ypw.contains("adx:")) || gbl.ypw();
    }

    private boolean jxk() {
        return (com.bytedance.sdk.component.adexpress.dg.ypw() && (this.bw.ypw().contains("logo-union") || this.bw.ypw().contains("logounion") || this.bw.ypw().contains("logoad"))) || "logo-union".equals(this.bw.ypw()) || "logounion".equals(this.bw.ypw()) || "logoad".equals(this.bw.ypw());
    }

    public float aa() {
        return this.dg.sup();
    }

    public String but() {
        return this.dg.dr();
    }

    public int bv() {
        return this.dg.vaf();
    }

    public float bw() {
        return this.dg.sba();
    }

    public float cf() {
        return this.dg.gbl();
    }

    public int cn() {
        return this.dg.cuf();
    }

    public int cuf() {
        return this.dg.bw();
    }

    public long db() {
        return this.dg.knr();
    }

    public int dg() {
        return (int) this.dg.vk();
    }

    public double dr() {
        return this.dg.msw();
    }

    public String ee() {
        return this.dg.fxt();
    }

    public int emc() {
        return (int) this.dg.qh();
    }

    public String ffd() {
        return this.dg.hs();
    }

    public int fu() {
        return this.dg.rtt();
    }

    public String gbl() {
        return this.emc == 1 ? this.ypw : "";
    }

    public boolean hj() {
        return this.dg.lt();
    }

    public String hxp() {
        return this.dg.tp();
    }

    public boolean ipv() {
        return this.dg.dpk();
    }

    public String iyl() {
        return this.dg.ru();
    }

    public int jp() {
        return this.dg.ge();
    }

    public int lt() {
        return this.dg.ypw();
    }

    public String ltx() {
        return this.dg.oz();
    }

    public int mkp() {
        return this.dg.zz();
    }

    public int msw() {
        String strYlm = this.dg.ylm();
        if (TtmlNode.LEFT.equals(strYlm)) {
            return 17;
        }
        if (TtmlNode.CENTER.equals(strYlm)) {
            return 4;
        }
        return TtmlNode.RIGHT.equals(strYlm) ? 3 : 2;
    }

    public String mxo() {
        return this.dg.vw();
    }

    public boolean ndl() {
        return this.dg.sz();
    }

    public double nw() {
        return this.dg.mkp();
    }

    public boolean pe() {
        return this.dg.pxj();
    }

    public int pm() {
        return this.dg.xxs();
    }

    public int pxa() {
        return this.dg.iat();
    }

    public double qh() {
        return this.dg.yzg();
    }

    public int ra() {
        return this.dg.yid();
    }

    public String rgy() {
        return this.dg.ee();
    }

    public int rie() {
        return this.dg.yz();
    }

    public String rig() {
        return this.dg.vhn();
    }

    public int rqm() {
        return this.dg.se();
    }

    public int rtt() {
        return this.dg.dg();
    }

    public String ru() {
        int i10 = this.emc;
        return (i10 == 2 || i10 == 13) ? this.ypw : "";
    }

    public int sb() {
        String strTp = this.dg.tp();
        if ("skip-with-time-skip-btn".equals(this.bw.ypw()) || "skip".equals(this.bw.ypw()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.bw.ypw())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.bw.ypw()) && !"skip-with-time".equals(this.bw.ypw())) {
            if (this.emc == 10 && TextUtils.equals(this.dg.vw(), CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                return 5;
            }
            if (jxk() && ej()) {
                return 0;
            }
            if (jxk()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.bw.ypw())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strTp) && !strTp.equals("none")) {
                if (strTp.equals("video") || (this.bw.emc() == 7 && TextUtils.equals(strTp, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.dg.ypw() && this.bw.bw() != null && this.bw.bw().qp()) ? 11 : 4;
                }
                if (strTp.equals("normal")) {
                    return 1;
                }
                return (strTp.equals("creative") || "slide".equals(this.dg.vw())) ? 2 : 0;
            }
        }
        return 0;
    }

    public int sba() {
        return this.dg.sg();
    }

    public int sf() {
        return emc(this.dg.rie());
    }

    public boolean sra() {
        return this.dg.xxg();
    }

    public String sup() {
        return this.ycc;
    }

    public double sz() throws NumberFormatException {
        if (this.emc == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.dg.ypw() ? (int) r0 : Double.parseDouble(this.ypw);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public boolean tp() {
        return this.dg.pe();
    }

    public boolean ul() {
        return this.dg.etw();
    }

    public int uym() {
        return emc(this.dg.sra());
    }

    public int vk() {
        return emc(this.dg.db());
    }

    public int vw() {
        return this.dg.bv();
    }

    public int wa() {
        return this.dg.kkn();
    }

    public boolean wad() {
        return this.dg.dpk();
    }

    public double wbn() {
        return this.dg.iyl();
    }

    public String wd() {
        return this.dg.hh();
    }

    public String wo() {
        return this.dg.mxo();
    }

    public int wpn() {
        return this.dg.dor();
    }

    public String xhi() {
        return this.dg.xmt();
    }

    public int xmt() {
        return this.dg.xq();
    }

    public int xq() {
        return (int) this.dg.cf();
    }

    public boolean xxg() {
        return this.dg.hoq();
    }

    public String ycc() {
        return this.emc == 0 ? !TextUtils.isEmpty(this.ypw) ? this.ypw : this.xq.optString(com.bytedance.sdk.component.adexpress.dg.uym.xq(com.bytedance.sdk.component.adexpress.dg.emc())) : "";
    }

    public int yid() {
        return this.dg.qhy();
    }

    public String ylm() {
        return this.dg.hxp();
    }

    public int ypw() {
        return (int) this.dg.aa();
    }

    public int yz() {
        return this.dg.uym();
    }

    public int yzg() {
        return this.dg.kv();
    }

    public int zz() {
        int iMsw = msw();
        if (iMsw == 4) {
            return 17;
        }
        return iMsw == 3 ? 8388613 : 8388611;
    }

    public static float[] ypw(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void emc(float f10) {
        this.dg.emc(f10);
    }

    public static int emc(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public boolean emc(int i10) {
        bw bwVar = this.bw;
        if (bwVar == null) {
            return false;
        }
        if (i10 == 1) {
            this.dg = bwVar.uym();
        } else {
            this.dg = bwVar.bw();
        }
        return this.dg != null;
    }
}
