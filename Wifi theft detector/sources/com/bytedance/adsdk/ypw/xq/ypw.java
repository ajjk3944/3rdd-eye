package com.bytedance.adsdk.ypw.xq;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class ypw {
    public int bw;
    public emc dg;
    public String emc;
    public boolean gbl;
    public int msw;
    public float ru;
    public PointF sup;
    public PointF sz;
    public float uym;
    public float xq;
    public float ycc;
    public String ypw;
    public int zz;

    public enum emc {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public ypw(String str, String str2, float f10, emc emcVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        emc(str, str2, f10, emcVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void emc(String str, String str2, float f10, emc emcVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.emc = str;
        this.ypw = str2;
        this.xq = f10;
        this.dg = emcVar;
        this.bw = i10;
        this.ycc = f11;
        this.uym = f12;
        this.msw = i11;
        this.zz = i12;
        this.ru = f13;
        this.gbl = z10;
        this.sup = pointF;
        this.sz = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.emc.hashCode() * 31) + this.ypw.hashCode()) * 31) + this.xq)) * 31) + this.dg.ordinal()) * 31) + this.bw;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.ycc);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.msw;
    }

    public ypw() {
    }
}
