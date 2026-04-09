package com.bytedance.adsdk.vt.lh.lh;

import com.bytedance.adsdk.vt.lh.ouw.cf;
import com.bytedance.adsdk.vt.lh.ouw.ryl;
import d.h;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    final ryl bly;

    /* renamed from: cf, reason: collision with root package name */
    final int f7070cf;
    final com.bytedance.adsdk.vt.fkw.tlj ex;
    public final ouw fkw;

    /* renamed from: jg, reason: collision with root package name */
    final float f7071jg;
    final com.bytedance.adsdk.vt.lh.vt.ouw jqy;
    final float ko;

    /* renamed from: le, reason: collision with root package name */
    final long f7072le;

    /* renamed from: lh, reason: collision with root package name */
    public final String f7073lh;
    final float mwh;
    final List<com.bytedance.adsdk.vt.lh.vt.lh> ouw;
    final List<com.bytedance.adsdk.vt.lh.vt.pno> pno;
    final List<com.bytedance.adsdk.vt.ra.ouw<Float>> qbp;
    public final String ra;
    final float rn;
    final int ryl;

    /* renamed from: th, reason: collision with root package name */
    final com.bytedance.adsdk.vt.lh.ouw.vt f7074th;
    final int tlj;
    final cf vm;
    final boolean vpp;
    final com.bytedance.adsdk.vt.ra vt;
    public final long yu;
    final com.bytedance.adsdk.vt.lh.ouw.tlj zih;
    final vt zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum vt {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public fkw(List<com.bytedance.adsdk.vt.lh.vt.lh> list, com.bytedance.adsdk.vt.ra raVar, String str, long j, ouw ouwVar, long j8, String str2, List<com.bytedance.adsdk.vt.lh.vt.pno> list2, ryl rylVar, int i4, int i10, int i11, float f10, float f11, float f12, float f13, com.bytedance.adsdk.vt.lh.ouw.tlj tljVar, cf cfVar, List<com.bytedance.adsdk.vt.ra.ouw<Float>> list3, vt vtVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, boolean z3, com.bytedance.adsdk.vt.lh.vt.ouw ouwVar2, com.bytedance.adsdk.vt.fkw.tlj tljVar2) {
        this.ouw = list;
        this.vt = raVar;
        this.f7073lh = str;
        this.yu = j;
        this.fkw = ouwVar;
        this.f7072le = j8;
        this.ra = str2;
        this.pno = list2;
        this.bly = rylVar;
        this.tlj = i4;
        this.f7070cf = i10;
        this.ryl = i11;
        this.mwh = f10;
        this.f7071jg = f11;
        this.ko = f12;
        this.rn = f13;
        this.zih = tljVar;
        this.vm = cfVar;
        this.qbp = list3;
        this.zin = vtVar;
        this.f7074th = vtVar2;
        this.vpp = z3;
        this.jqy = ouwVar2;
        this.ex = tljVar2;
    }

    public final String ouw(String str) {
        StringBuilder sbZ = h.z(str);
        sbZ.append(this.f7073lh);
        sbZ.append("\n");
        fkw fkwVarOuw = this.vt.ouw(this.f7072le);
        if (fkwVarOuw != null) {
            sbZ.append("\t\tParents: ");
            sbZ.append(fkwVarOuw.f7073lh);
            fkw fkwVarOuw2 = this.vt.ouw(fkwVarOuw.f7072le);
            while (fkwVarOuw2 != null) {
                sbZ.append("->");
                sbZ.append(fkwVarOuw2.f7073lh);
                fkwVarOuw2 = this.vt.ouw(fkwVarOuw2.f7072le);
            }
            sbZ.append(str);
            sbZ.append("\n");
        }
        if (!this.pno.isEmpty()) {
            sbZ.append(str);
            sbZ.append("\tMasks: ");
            sbZ.append(this.pno.size());
            sbZ.append("\n");
        }
        if (this.tlj != 0 && this.f7070cf != 0) {
            sbZ.append(str);
            sbZ.append("\tBackground: ");
            sbZ.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.tlj), Integer.valueOf(this.f7070cf), Integer.valueOf(this.ryl)));
        }
        if (!this.ouw.isEmpty()) {
            sbZ.append(str);
            sbZ.append("\tShapes:\n");
            for (com.bytedance.adsdk.vt.lh.vt.lh lhVar : this.ouw) {
                sbZ.append(str);
                sbZ.append("\t\t");
                sbZ.append(lhVar);
                sbZ.append("\n");
            }
        }
        return sbZ.toString();
    }

    public final String toString() {
        return ouw("");
    }
}
