package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.vt.lh.ouw.cf;
import com.bytedance.adsdk.vt.lh.vt;
import com.bytedance.adsdk.vt.ouw.vt.ko;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends com.bytedance.adsdk.vt.lh.lh.ouw {

    /* renamed from: cd, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f7064cd;

    /* renamed from: cf, reason: collision with root package name */
    private final StringBuilder f7065cf;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ex;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> jae;

    /* renamed from: jg, reason: collision with root package name */
    private final Paint f7066jg;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> jqy;
    private final Paint ko;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ksc;
    private final Matrix mwh;

    /* renamed from: od, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f7067od;

    /* renamed from: pd, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Typeface, Typeface> f7068pd;
    private final com.bytedance.adsdk.vt.bly qbp;
    private final Map<com.bytedance.adsdk.vt.lh.yu, List<com.bytedance.adsdk.vt.ouw.ouw.yu>> rn;
    private final RectF ryl;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> tc;

    /* renamed from: th, reason: collision with root package name */
    private final ko f7069th;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> uq;
    private final List<ouw> vm;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> vpp;
    private final LongSparseArray<String> zih;
    private final com.bytedance.adsdk.vt.ra zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.lh.lh.bly$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[vt.ouw.values().length];
            ouw = iArr;
            try {
                iArr[vt.ouw.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[vt.ouw.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[vt.ouw.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bly(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar2;
        super(blyVar, fkwVar);
        this.f7065cf = new StringBuilder(2);
        this.ryl = new RectF();
        this.mwh = new Matrix();
        this.f7066jg = new Paint() { // from class: com.bytedance.adsdk.vt.lh.lh.bly.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.ko = new Paint() { // from class: com.bytedance.adsdk.vt.lh.lh.bly.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.rn = new HashMap();
        this.zih = new LongSparseArray<>();
        this.vm = new ArrayList();
        this.qbp = blyVar;
        this.zin = fkwVar.vt;
        ko koVarOuw = fkwVar.zih.ouw();
        this.f7069th = koVarOuw;
        koVarOuw.ouw(this);
        ouw(koVarOuw);
        cf cfVar = fkwVar.vm;
        if (cfVar != null && (ouwVar2 = cfVar.ouw) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw = ouwVar2.ouw();
            this.vpp = ouwVarOuw;
            ouwVarOuw.ouw(this);
            ouw(this.vpp);
        }
        if (cfVar != null && (ouwVar = cfVar.vt) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw2 = ouwVar.ouw();
            this.ex = ouwVarOuw2;
            ouwVarOuw2.ouw(this);
            ouw(this.ex);
        }
        if (cfVar != null && (vtVar2 = cfVar.f7099lh) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = vtVar2.ouw();
            this.ksc = ouwVarOuw3;
            ouwVarOuw3.ouw(this);
            ouw(this.ksc);
        }
        if (cfVar == null || (vtVar = cfVar.yu) == null) {
            return;
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw4 = vtVar.ouw();
        this.f7067od = ouwVarOuw4;
        ouwVarOuw4.ouw(this);
        ouw(this.f7067od);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        super.ouw(rectF, matrix, z3);
        rectF.set(0.0f, 0.0f, this.zin.bly.width(), this.zin.bly.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void vt(android.graphics.Canvas r24, android.graphics.Matrix r25, int r26) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.lh.lh.bly.vt(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        String ouw;
        float vt;

        private ouw() {
            this.ouw = "";
            this.vt = 0.0f;
        }

        public final void ouw(String str, float f10) {
            this.ouw = str;
            this.vt = f10;
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    private static void ouw(Canvas canvas, com.bytedance.adsdk.vt.lh.vt vtVar, int i4, float f10) {
        PointF pointF = vtVar.ryl;
        PointF pointF2 = vtVar.mwh;
        float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
        float f11 = (i4 * vtVar.f7103le * fOuw) + (pointF == null ? 0.0f : (vtVar.f7103le * 0.6f * fOuw) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i10 = AnonymousClass3.ouw[vtVar.yu.ordinal()];
        if (i10 == 1) {
            canvas.translate(f12, f11);
        } else if (i10 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (i10 != 3) {
                return;
            }
            canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        }
    }

    private static List<String> ouw(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private List<ouw> ouw(String str, float f10, com.bytedance.adsdk.vt.lh.lh lhVar, float f11, float f12, boolean z3) {
        float fMeasureText;
        int i4 = 0;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (z3) {
                com.bytedance.adsdk.vt.lh.yu yuVar = this.zin.f7197le.get(com.bytedance.adsdk.vt.lh.yu.ouw(cCharAt, lhVar.ouw, lhVar.f7063lh));
                if (yuVar != null) {
                    fMeasureText = (com.bytedance.adsdk.vt.le.pno.ouw() * ((float) yuVar.vt) * f11) + f12;
                }
            } else {
                fMeasureText = this.f7066jg.measureText(str.substring(i12, i12 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z10 = true;
                f15 = fMeasureText;
            } else if (z10) {
                z10 = false;
                i11 = i12;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i4++;
                ouw ouwVarVt = vt(i4);
                if (i11 == i10) {
                    ouwVarVt.ouw(str.substring(i10, i12).trim(), (f13 - fMeasureText) - ((r10.length() - r8.length()) * f15));
                    i10 = i12;
                    i11 = i10;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    ouwVarVt.ouw(str.substring(i10, i11 - 1).trim(), ((f13 - f14) - ((r8.length() - r14.length()) * f15)) - f15);
                    f13 = f14;
                    i10 = i11;
                }
            }
        }
        if (f13 > 0.0f) {
            i4++;
            vt(i4).ouw(str.substring(i10), f13);
        }
        return this.vm.subList(0, i4);
    }

    private static void ouw(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static void ouw(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(com.bytedance.adsdk.vt.lh.vt r19, com.bytedance.adsdk.vt.lh.lh r20, android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.lh.lh.bly.ouw(com.bytedance.adsdk.vt.lh.vt, com.bytedance.adsdk.vt.lh.lh, android.graphics.Canvas):void");
    }

    private ouw vt(int i4) {
        for (int size = this.vm.size(); size < i4; size++) {
            this.vm.add(new ouw((byte) 0));
        }
        return this.vm.get(i4 - 1);
    }
}
