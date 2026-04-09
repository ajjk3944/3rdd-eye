package com.bytedance.adsdk.vt.lh;

import android.graphics.PointF;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public int bly;

    /* renamed from: cf, reason: collision with root package name */
    public boolean f7102cf;
    public int fkw;

    /* renamed from: le, reason: collision with root package name */
    public float f7103le;

    /* renamed from: lh, reason: collision with root package name */
    public float f7104lh;
    public PointF mwh;
    public String ouw;
    public int pno;
    public float ra;
    public PointF ryl;
    public float tlj;
    public String vt;
    public ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public vt(String str, String str2, float f10, ouw ouwVar, int i4, float f11, float f12, int i10, int i11, float f13, boolean z3, PointF pointF, PointF pointF2) {
        this.ouw = str;
        this.vt = str2;
        this.f7104lh = f10;
        this.yu = ouwVar;
        this.fkw = i4;
        this.f7103le = f11;
        this.ra = f12;
        this.pno = i10;
        this.bly = i11;
        this.tlj = f13;
        this.f7102cf = z3;
        this.ryl = pointF;
        this.mwh = pointF2;
    }

    public final int hashCode() {
        int iOrdinal = ((this.yu.ordinal() + (((int) (u.m(this.ouw.hashCode() * 31, 31, this.vt) + this.f7104lh)) * 31)) * 31) + this.fkw;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f7103le);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.pno;
    }

    public vt() {
    }
}
