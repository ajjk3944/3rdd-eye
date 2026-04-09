package com.bytedance.adsdk.ypw.xq.ypw;

import android.graphics.Paint;
import com.bytedance.adsdk.ypw.emc.emc.ul;
import java.util.List;

/* loaded from: classes.dex */
public class sba implements xq {
    private final com.bytedance.adsdk.ypw.xq.emc.dg bw;
    private final com.bytedance.adsdk.ypw.xq.emc.emc dg;
    private final String emc;
    private final ypw msw;
    private final boolean ru;
    private final emc uym;
    private final List<com.bytedance.adsdk.ypw.xq.emc.ypw> xq;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw ycc;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw ypw;
    private final float zz;

    /* renamed from: com.bytedance.adsdk.ypw.xq.ypw.sba$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;
        static final /* synthetic */ int[] ypw;

        static {
            int[] iArr = new int[ypw.values().length];
            ypw = iArr;
            try {
                iArr[ypw.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ypw[ypw.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ypw[ypw.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[emc.values().length];
            emc = iArr2;
            try {
                iArr2[emc.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                emc[emc.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                emc[emc.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum emc {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap emc() {
            int i = AnonymousClass1.emc[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum ypw {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join emc() {
            int i = AnonymousClass1.ypw[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public sba(String str, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar, List<com.bytedance.adsdk.ypw.xq.emc.ypw> list, com.bytedance.adsdk.ypw.xq.emc.emc emcVar, com.bytedance.adsdk.ypw.xq.emc.dg dgVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2, emc emcVar2, ypw ypwVar3, float f2, boolean z6) {
        this.emc = str;
        this.ypw = ypwVar;
        this.xq = list;
        this.dg = emcVar;
        this.bw = dgVar;
        this.ycc = ypwVar2;
        this.uym = emcVar2;
        this.msw = ypwVar3;
        this.zz = f2;
        this.ru = z6;
    }

    public List<com.bytedance.adsdk.ypw.xq.emc.ypw> bw() {
        return this.xq;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw dg() {
        return this.ycc;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new ul(zzVar, emcVar, this);
    }

    public ypw msw() {
        return this.msw;
    }

    public boolean ru() {
        return this.ru;
    }

    public emc uym() {
        return this.uym;
    }

    public com.bytedance.adsdk.ypw.xq.emc.dg xq() {
        return this.bw;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw ycc() {
        return this.ypw;
    }

    public com.bytedance.adsdk.ypw.xq.emc.emc ypw() {
        return this.dg;
    }

    public float zz() {
        return this.zz;
    }

    public String emc() {
        return this.emc;
    }
}
