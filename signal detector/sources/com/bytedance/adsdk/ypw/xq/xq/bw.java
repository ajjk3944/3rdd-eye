package com.bytedance.adsdk.ypw.xq.xq;

import com.bytedance.adsdk.ypw.xq.emc.gbl;
import com.bytedance.adsdk.ypw.xq.emc.sup;
import java.util.List;
import java.util.Locale;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public class bw {
    private final com.bytedance.adsdk.ypw.xq.emc.ru aa;
    private final emc bw;
    private final float cf;
    private final long dg;
    private final List<com.bytedance.adsdk.ypw.xq.ypw.xq> emc;
    private final int gbl;
    private final com.bytedance.adsdk.ypw.bw.ru hxp;
    private final List<com.bytedance.adsdk.ypw.xq.ypw.msw> msw;
    private final float qh;
    private final com.bytedance.adsdk.ypw.xq.ypw.emc rie;
    private final int ru;
    private final gbl sba;
    private final boolean sra;
    private final int sup;
    private final float sz;
    private final List<com.bytedance.adsdk.ypw.uym.emc<Float>> ul;
    private final String uym;
    private final float vk;
    private final String xq;
    private final long ycc;
    private final ypw ylm;
    private final com.bytedance.adsdk.ypw.uym ypw;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw yzg;
    private final sup zz;

    public enum emc {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum ypw {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public bw(List<com.bytedance.adsdk.ypw.xq.ypw.xq> list, com.bytedance.adsdk.ypw.uym uymVar, String str, long j6, emc emcVar, long j7, String str2, List<com.bytedance.adsdk.ypw.xq.ypw.msw> list2, sup supVar, int i, int i3, int i6, float f2, float f5, float f6, float f7, com.bytedance.adsdk.ypw.xq.emc.ru ruVar, gbl gblVar, List<com.bytedance.adsdk.ypw.uym.emc<Float>> list3, ypw ypwVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2, boolean z6, com.bytedance.adsdk.ypw.xq.ypw.emc emcVar2, com.bytedance.adsdk.ypw.bw.ru ruVar2) {
        this.emc = list;
        this.ypw = uymVar;
        this.xq = str;
        this.dg = j6;
        this.bw = emcVar;
        this.ycc = j7;
        this.uym = str2;
        this.msw = list2;
        this.zz = supVar;
        this.ru = i;
        this.gbl = i3;
        this.sup = i6;
        this.sz = f2;
        this.qh = f5;
        this.cf = f6;
        this.vk = f7;
        this.aa = ruVar;
        this.sba = gblVar;
        this.ul = list3;
        this.ylm = ypwVar;
        this.yzg = ypwVar2;
        this.sra = z6;
        this.rie = emcVar2;
        this.hxp = ruVar2;
    }

    public int aa() {
        return this.gbl;
    }

    public long bw() {
        return this.dg;
    }

    public sup cf() {
        return this.zz;
    }

    public List<com.bytedance.adsdk.ypw.uym.emc<Float>> dg() {
        return this.ul;
    }

    public String emc(String str) {
        StringBuilder sbA = AbstractC2984e.a(str);
        sbA.append(ycc());
        sbA.append("\n");
        bw bwVarEmc = this.ypw.emc(sz());
        if (bwVarEmc != null) {
            sbA.append("\t\tParents: ");
            sbA.append(bwVarEmc.ycc());
            bw bwVarEmc2 = this.ypw.emc(bwVarEmc.sz());
            while (bwVarEmc2 != null) {
                sbA.append("->");
                sbA.append(bwVarEmc2.ycc());
                bwVarEmc2 = this.ypw.emc(bwVarEmc2.sz());
            }
            sbA.append(str);
            sbA.append("\n");
        }
        if (!ru().isEmpty()) {
            sbA.append(str);
            sbA.append("\tMasks: ");
            sbA.append(ru().size());
            sbA.append("\n");
        }
        if (sba() != 0 && aa() != 0) {
            sbA.append(str);
            sbA.append("\tBackground: ");
            sbA.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(sba()), Integer.valueOf(aa()), Integer.valueOf(vk())));
        }
        if (!this.emc.isEmpty()) {
            sbA.append(str);
            sbA.append("\tShapes:\n");
            for (com.bytedance.adsdk.ypw.xq.ypw.xq xqVar : this.emc) {
                sbA.append(str);
                sbA.append("\t\t");
                sbA.append(xqVar);
                sbA.append("\n");
            }
        }
        return sbA.toString();
    }

    public emc gbl() {
        return this.bw;
    }

    public com.bytedance.adsdk.ypw.bw.ru hxp() {
        return this.hxp;
    }

    public float msw() {
        return this.cf;
    }

    public List<com.bytedance.adsdk.ypw.xq.ypw.xq> qh() {
        return this.emc;
    }

    public com.bytedance.adsdk.ypw.xq.ypw.emc rie() {
        return this.rie;
    }

    public List<com.bytedance.adsdk.ypw.xq.ypw.msw> ru() {
        return this.msw;
    }

    public int sba() {
        return this.ru;
    }

    public boolean sra() {
        return this.sra;
    }

    public ypw sup() {
        return this.ylm;
    }

    public long sz() {
        return this.ycc;
    }

    public String toString() {
        return emc("");
    }

    public gbl ul() {
        return this.sba;
    }

    public String uym() {
        return this.uym;
    }

    public int vk() {
        return this.sup;
    }

    public float xq() {
        return this.qh / this.ypw.aa();
    }

    public String ycc() {
        return this.xq;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw ylm() {
        return this.yzg;
    }

    public float ypw() {
        return this.sz;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ru yzg() {
        return this.aa;
    }

    public float zz() {
        return this.vk;
    }

    public com.bytedance.adsdk.ypw.uym emc() {
        return this.ypw;
    }
}
