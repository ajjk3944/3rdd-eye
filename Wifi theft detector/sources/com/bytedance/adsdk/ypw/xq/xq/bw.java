package com.bytedance.adsdk.ypw.xq.xq;

import com.bytedance.adsdk.ypw.xq.emc.gbl;
import com.bytedance.adsdk.ypw.xq.emc.sup;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class bw {

    /* renamed from: aa, reason: collision with root package name */
    private final com.bytedance.adsdk.ypw.xq.emc.ru f9222aa;
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

    public bw(List<com.bytedance.adsdk.ypw.xq.ypw.xq> list, com.bytedance.adsdk.ypw.uym uymVar, String str, long j10, emc emcVar, long j11, String str2, List<com.bytedance.adsdk.ypw.xq.ypw.msw> list2, sup supVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.ypw.xq.emc.ru ruVar, gbl gblVar, List<com.bytedance.adsdk.ypw.uym.emc<Float>> list3, ypw ypwVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2, boolean z10, com.bytedance.adsdk.ypw.xq.ypw.emc emcVar2, com.bytedance.adsdk.ypw.bw.ru ruVar2) {
        this.emc = list;
        this.ypw = uymVar;
        this.xq = str;
        this.dg = j10;
        this.bw = emcVar;
        this.ycc = j11;
        this.uym = str2;
        this.msw = list2;
        this.zz = supVar;
        this.ru = i10;
        this.gbl = i11;
        this.sup = i12;
        this.sz = f10;
        this.qh = f11;
        this.cf = f12;
        this.vk = f13;
        this.f9222aa = ruVar;
        this.sba = gblVar;
        this.ul = list3;
        this.ylm = ypwVar;
        this.yzg = ypwVar2;
        this.sra = z10;
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

    public com.bytedance.adsdk.ypw.uym emc() {
        return this.ypw;
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
        return this.f9222aa;
    }

    public float zz() {
        return this.vk;
    }

    public String emc(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ycc());
        sb.append("\n");
        bw bwVarEmc = this.ypw.emc(sz());
        if (bwVarEmc != null) {
            sb.append("\t\tParents: ");
            sb.append(bwVarEmc.ycc());
            bw bwVarEmc2 = this.ypw.emc(bwVarEmc.sz());
            while (bwVarEmc2 != null) {
                sb.append("->");
                sb.append(bwVarEmc2.ycc());
                bwVarEmc2 = this.ypw.emc(bwVarEmc2.sz());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!ru().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(ru().size());
            sb.append("\n");
        }
        if (sba() != 0 && aa() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(sba()), Integer.valueOf(aa()), Integer.valueOf(vk())));
        }
        if (!this.emc.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.bytedance.adsdk.ypw.xq.ypw.xq xqVar : this.emc) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(xqVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
