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

    public ypw(String str, String str2, float f2, emc emcVar, int i, float f5, float f6, int i3, int i6, float f7, boolean z6, PointF pointF, PointF pointF2) {
        emc(str, str2, f2, emcVar, i, f5, f6, i3, i6, f7, z6, pointF, pointF2);
    }

    public void emc(String str, String str2, float f2, emc emcVar, int i, float f5, float f6, int i3, int i6, float f7, boolean z6, PointF pointF, PointF pointF2) {
        this.emc = str;
        this.ypw = str2;
        this.xq = f2;
        this.dg = emcVar;
        this.bw = i;
        this.ycc = f5;
        this.uym = f6;
        this.msw = i3;
        this.zz = i6;
        this.ru = f7;
        this.gbl = z6;
        this.sup = pointF;
        this.sz = pointF2;
    }

    public int hashCode() {
        int iOrdinal = ((this.dg.ordinal() + (((int) (((this.ypw.hashCode() + (this.emc.hashCode() * 31)) * 31) + this.xq)) * 31)) * 31) + this.bw;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.ycc);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.msw;
    }

    public ypw() {
    }
}
