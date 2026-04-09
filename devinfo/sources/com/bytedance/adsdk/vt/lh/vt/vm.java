package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.Paint;
import com.bytedance.adsdk.vt.ouw.ouw.qbp;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm implements lh {
    public final float bly;
    public final com.bytedance.adsdk.vt.lh.ouw.yu fkw;

    /* renamed from: le, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f7130le;

    /* renamed from: lh, reason: collision with root package name */
    public final List<com.bytedance.adsdk.vt.lh.ouw.vt> f7131lh;
    public final String ouw;
    public final vt pno;
    public final ouw ra;
    public final boolean tlj;
    public final com.bytedance.adsdk.vt.lh.ouw.vt vt;
    public final com.bytedance.adsdk.vt.lh.ouw.ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.lh.vt.vm$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;
        static final /* synthetic */ int[] vt;

        static {
            int[] iArr = new int[vt.values().length];
            vt = iArr;
            try {
                iArr[vt.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                vt[vt.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                vt[vt.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ouw.values().length];
            ouw = iArr2;
            try {
                iArr2[ouw.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[ouw.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[ouw.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        BUTT,
        ROUND,
        UNKNOWN;

        public final Paint.Cap ouw() {
            int i4 = AnonymousClass1.ouw[ordinal()];
            return i4 != 1 ? i4 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum vt {
        MITER,
        ROUND,
        BEVEL;

        public final Paint.Join ouw() {
            int i4 = AnonymousClass1.vt[ordinal()];
            if (i4 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i4 == 2) {
                return Paint.Join.MITER;
            }
            if (i4 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public vm(String str, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, List<com.bytedance.adsdk.vt.lh.ouw.vt> list, com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, ouw ouwVar2, vt vtVar3, float f10, boolean z3) {
        this.ouw = str;
        this.vt = vtVar;
        this.f7131lh = list;
        this.yu = ouwVar;
        this.fkw = yuVar;
        this.f7130le = vtVar2;
        this.ra = ouwVar2;
        this.pno = vtVar3;
        this.bly = f10;
        this.tlj = z3;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new qbp(blyVar, ouwVar, this);
    }
}
