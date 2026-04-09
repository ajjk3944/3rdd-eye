package com.bytedance.adsdk.ypw.xq.xq;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.ypw.emc.ypw.cf;
import com.bytedance.adsdk.ypw.xq.emc.gbl;
import com.bytedance.adsdk.ypw.xq.ypw;
import com.bytedance.adsdk.ypw.xq.ypw.vk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class zz extends com.bytedance.adsdk.ypw.xq.xq.emc {

    /* renamed from: aa, reason: collision with root package name */
    private final com.bytedance.adsdk.ypw.uym f9224aa;
    private final cf cf;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> db;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> ee;
    private final Paint gbl;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> hxp;
    private final RectF msw;
    private final List<emc> qh;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> rie;
    private final Paint ru;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Typeface, Typeface> sb;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> sba;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> sra;
    private final Map<com.bytedance.adsdk.ypw.xq.dg, List<com.bytedance.adsdk.ypw.emc.emc.dg>> sup;
    private final LongSparseArray<String> sz;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> ul;
    private final StringBuilder uym;
    private final com.bytedance.adsdk.ypw.zz vk;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> ylm;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> yzg;
    private final Matrix zz;

    /* renamed from: com.bytedance.adsdk.ypw.xq.xq.zz$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[ypw.emc.values().length];
            emc = iArr;
            try {
                iArr[ypw.emc.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[ypw.emc.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[ypw.emc.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class emc {
        private String emc;
        private float ypw;

        private emc() {
            this.emc = "";
            this.ypw = 0.0f;
        }

        public void emc(String str, float f10) {
            this.emc = str;
            this.ypw = f10;
        }
    }

    public zz(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar) {
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2;
        com.bytedance.adsdk.ypw.xq.emc.emc emcVar;
        com.bytedance.adsdk.ypw.xq.emc.emc emcVar2;
        super(zzVar, bwVar);
        this.uym = new StringBuilder(2);
        this.msw = new RectF();
        this.zz = new Matrix();
        int i10 = 1;
        this.ru = new Paint(i10) { // from class: com.bytedance.adsdk.ypw.xq.xq.zz.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.gbl = new Paint(i10) { // from class: com.bytedance.adsdk.ypw.xq.xq.zz.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.sup = new HashMap();
        this.sz = new LongSparseArray<>();
        this.qh = new ArrayList();
        this.vk = zzVar;
        this.f9224aa = bwVar.emc();
        cf cfVarEmc = bwVar.yzg().emc();
        this.cf = cfVarEmc;
        cfVarEmc.emc(this);
        emc(cfVarEmc);
        gbl gblVarUl = bwVar.ul();
        if (gblVarUl != null && (emcVar2 = gblVarUl.emc) != null) {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVarEmc = emcVar2.emc();
            this.sba = emcVarEmc;
            emcVarEmc.emc(this);
            emc(this.sba);
        }
        if (gblVarUl != null && (emcVar = gblVarUl.ypw) != null) {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVarEmc2 = emcVar.emc();
            this.ul = emcVarEmc2;
            emcVarEmc2.emc(this);
            emc(this.ul);
        }
        if (gblVarUl != null && (ypwVar2 = gblVarUl.xq) != null) {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc3 = ypwVar2.emc();
            this.sra = emcVarEmc3;
            emcVarEmc3.emc(this);
            emc(this.sra);
        }
        if (gblVarUl == null || (ypwVar = gblVarUl.dg) == null) {
            return;
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc4 = ypwVar.emc();
        this.hxp = emcVarEmc4;
        emcVarEmc4.emc(this);
        emc(this.hxp);
    }

    private boolean xq(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc, com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        super.emc(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.f9224aa.dg().width(), this.f9224aa.dg().height());
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public void ypw(Canvas canvas, Matrix matrix, int i10) {
        super.ypw(canvas, matrix, i10);
        com.bytedance.adsdk.ypw.xq.ypw ypwVarUym = this.cf.uym();
        com.bytedance.adsdk.ypw.xq.xq xqVar = this.f9224aa.cf().get(ypwVarUym.ypw);
        if (xqVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        emc(ypwVarUym, matrix);
        if (this.vk.ee()) {
            emc(ypwVarUym, matrix, xqVar, canvas);
        } else {
            emc(ypwVarUym, xqVar, canvas);
        }
        canvas.restore();
    }

    private void emc(com.bytedance.adsdk.ypw.xq.ypw ypwVar, Matrix matrix) {
        com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar = this.yzg;
        if (emcVar != null) {
            this.ru.setColor(emcVar.uym().intValue());
        } else {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar2 = this.sba;
            if (emcVar2 != null) {
                this.ru.setColor(emcVar2.uym().intValue());
            } else {
                this.ru.setColor(ypwVar.msw);
            }
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar3 = this.ylm;
        if (emcVar3 != null) {
            this.gbl.setColor(emcVar3.uym().intValue());
        } else {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar4 = this.ul;
            if (emcVar4 != null) {
                this.gbl.setColor(emcVar4.uym().intValue());
            } else {
                this.gbl.setColor(ypwVar.zz);
            }
        }
        int iIntValue = ((this.dg.emc() == null ? 100 : this.dg.emc().uym().intValue()) * 255) / 100;
        this.ru.setAlpha(iIntValue);
        this.gbl.setAlpha(iIntValue);
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVar5 = this.rie;
        if (emcVar5 != null) {
            this.gbl.setStrokeWidth(emcVar5.uym().floatValue());
            return;
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVar6 = this.sra;
        if (emcVar6 != null) {
            this.gbl.setStrokeWidth(emcVar6.uym().floatValue());
        } else {
            this.gbl.setStrokeWidth(ypwVar.ru * com.bytedance.adsdk.ypw.ycc.ycc.emc());
        }
    }

    private emc ypw(int i10) {
        for (int size = this.qh.size(); size < i10; size++) {
            this.qh.add(new emc());
        }
        return this.qh.get(i10 - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(com.bytedance.adsdk.ypw.xq.ypw r17, android.graphics.Matrix r18, com.bytedance.adsdk.ypw.xq.xq r19, android.graphics.Canvas r20) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            com.bytedance.adsdk.ypw.emc.ypw.emc<java.lang.Float, java.lang.Float> r1 = r0.db
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.uym()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L15
        L13:
            float r1 = r7.xq
        L15:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = r1 / r2
            float r8 = com.bytedance.adsdk.ypw.ycc.ycc.emc(r18)
            java.lang.String r1 = r7.emc
            java.util.List r9 = r0.emc(r1)
            int r10 = r9.size()
            int r1 = r7.bw
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            com.bytedance.adsdk.ypw.emc.ypw.emc<java.lang.Float, java.lang.Float> r2 = r0.ee
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.uym()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L3b:
            float r1 = r1 + r2
        L3c:
            r5 = r1
            goto L4d
        L3e:
            com.bytedance.adsdk.ypw.emc.ypw.emc<java.lang.Float, java.lang.Float> r2 = r0.hxp
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.uym()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L3b
        L4d:
            r11 = 0
            r1 = -1
            r12 = r1
            r13 = r11
        L51:
            if (r13 >= r10) goto La7
            java.lang.Object r1 = r9.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r7.sz
            if (r2 != 0) goto L5f
            r2 = 0
            goto L61
        L5f:
            float r2 = r2.x
        L61:
            r6 = 1
            r3 = r19
            java.util.List r14 = r0.emc(r1, r2, r3, r4, r5, r6)
            r15 = r11
        L69:
            int r1 = r14.size()
            if (r15 >= r1) goto L9d
            java.lang.Object r1 = r14.get(r15)
            com.bytedance.adsdk.ypw.xq.xq.zz$emc r1 = (com.bytedance.adsdk.ypw.xq.xq.zz.emc) r1
            int r12 = r12 + 1
            r20.save()
            float r2 = com.bytedance.adsdk.ypw.xq.xq.zz.emc.emc(r1)
            r3 = r20
            r0.emc(r3, r7, r12, r2)
            java.lang.String r1 = com.bytedance.adsdk.ypw.xq.xq.zz.emc.ypw(r1)
            r6 = r4
            r2 = r7
            r4 = r3
            r7 = r5
            r5 = r8
            r3 = r19
            r0.emc(r1, r2, r3, r4, r5, r6, r7)
            r4 = r6
            r20.restore()
            int r15 = r15 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L69
        L9d:
            r7 = r5
            r5 = r8
            int r13 = r13 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L51
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.xq.xq.zz.emc(com.bytedance.adsdk.ypw.xq.ypw, android.graphics.Matrix, com.bytedance.adsdk.ypw.xq.xq, android.graphics.Canvas):void");
    }

    private void emc(String str, com.bytedance.adsdk.ypw.xq.ypw ypwVar, com.bytedance.adsdk.ypw.xq.xq xqVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.bytedance.adsdk.ypw.xq.dg dgVar = this.f9224aa.qh().get(com.bytedance.adsdk.ypw.xq.dg.emc(str.charAt(i10), xqVar.emc(), xqVar.xq()));
            if (dgVar != null) {
                emc(dgVar, f11, ypwVar, canvas);
                canvas.translate((((float) dgVar.ypw()) * f11 * com.bytedance.adsdk.ypw.ycc.ycc.emc()) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(com.bytedance.adsdk.ypw.xq.ypw r13, com.bytedance.adsdk.ypw.xq.xq r14, android.graphics.Canvas r15) {
        /*
            r12 = this;
            android.graphics.Typeface r0 = r12.emc(r14)
            if (r0 != 0) goto L9
        L6:
            r3 = r12
            goto Ld1
        L9:
            java.lang.String r1 = r13.emc
            com.bytedance.adsdk.ypw.zz r2 = r12.vk
            com.bytedance.adsdk.ypw.ul r2 = r2.hxp()
            if (r2 == 0) goto L1b
            java.lang.String r3 = r12.zz()
            java.lang.String r1 = r2.ypw(r3, r1)
        L1b:
            android.graphics.Paint r2 = r12.ru
            r2.setTypeface(r0)
            com.bytedance.adsdk.ypw.emc.ypw.emc<java.lang.Float, java.lang.Float> r0 = r12.db
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r0.uym()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L31
        L2f:
            float r0 = r13.xq
        L31:
            android.graphics.Paint r2 = r12.ru
            float r3 = com.bytedance.adsdk.ypw.ycc.ycc.emc()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r12.gbl
            android.graphics.Paint r3 = r12.ru
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r12.gbl
            android.graphics.Paint r3 = r12.ru
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r13.bw
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.bytedance.adsdk.ypw.emc.ypw.emc<java.lang.Float, java.lang.Float> r3 = r12.ee
            if (r3 == 0) goto L67
            java.lang.Object r3 = r3.uym()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L65:
            float r2 = r2 + r3
            goto L76
        L67:
            com.bytedance.adsdk.ypw.emc.ypw.emc<java.lang.Float, java.lang.Float> r3 = r12.hxp
            if (r3 == 0) goto L76
            java.lang.Object r3 = r3.uym()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L65
        L76:
            float r3 = com.bytedance.adsdk.ypw.ycc.ycc.emc()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r8 = r2 / r0
            java.util.List r0 = r12.emc(r1)
            int r1 = r0.size()
            r2 = 0
            r3 = -1
            r11 = r2
            r10 = r3
        L8c:
            if (r11 >= r1) goto L6
            java.lang.Object r3 = r0.get(r11)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.PointF r3 = r13.sz
            if (r3 != 0) goto L9c
            r3 = 0
        L9a:
            r5 = r3
            goto L9f
        L9c:
            float r3 = r3.x
            goto L9a
        L9f:
            r7 = 0
            r9 = 0
            r3 = r12
            r6 = r14
            java.util.List r14 = r3.emc(r4, r5, r6, r7, r8, r9)
            r4 = r2
        La8:
            int r5 = r14.size()
            if (r4 >= r5) goto Lcd
            java.lang.Object r5 = r14.get(r4)
            com.bytedance.adsdk.ypw.xq.xq.zz$emc r5 = (com.bytedance.adsdk.ypw.xq.xq.zz.emc) r5
            int r10 = r10 + 1
            r15.save()
            float r7 = com.bytedance.adsdk.ypw.xq.xq.zz.emc.emc(r5)
            r12.emc(r15, r13, r10, r7)
            java.lang.String r5 = com.bytedance.adsdk.ypw.xq.xq.zz.emc.ypw(r5)
            r12.emc(r5, r13, r15, r8)
            r15.restore()
            int r4 = r4 + 1
            goto La8
        Lcd:
            int r11 = r11 + 1
            r14 = r6
            goto L8c
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.xq.xq.zz.emc(com.bytedance.adsdk.ypw.xq.ypw, com.bytedance.adsdk.ypw.xq.xq, android.graphics.Canvas):void");
    }

    private void emc(Canvas canvas, com.bytedance.adsdk.ypw.xq.ypw ypwVar, int i10, float f10) {
        PointF pointF = ypwVar.sup;
        PointF pointF2 = ypwVar.sz;
        float fEmc = com.bytedance.adsdk.ypw.ycc.ycc.emc();
        float f11 = (i10 * ypwVar.ycc * fEmc) + (pointF == null ? 0.0f : (ypwVar.ycc * 0.6f * fEmc) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = AnonymousClass3.emc[ypwVar.dg.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (i11 != 3) {
                return;
            }
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
    }

    private Typeface emc(com.bytedance.adsdk.ypw.xq.xq xqVar) {
        Typeface typefaceUym;
        com.bytedance.adsdk.ypw.emc.ypw.emc<Typeface, Typeface> emcVar = this.sb;
        if (emcVar != null && (typefaceUym = emcVar.uym()) != null) {
            return typefaceUym;
        }
        Typeface typefaceEmc = this.vk.emc(xqVar);
        return typefaceEmc != null ? typefaceEmc : xqVar.dg();
    }

    private List<String> emc(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void emc(String str, com.bytedance.adsdk.ypw.xq.ypw ypwVar, Canvas canvas, float f10) {
        int length = 0;
        while (length < str.length()) {
            String strEmc = emc(str, length);
            length += strEmc.length();
            emc(strEmc, ypwVar, canvas);
            canvas.translate(this.ru.measureText(strEmc) + f10, 0.0f);
        }
    }

    private List<emc> emc(String str, float f10, com.bytedance.adsdk.ypw.xq.xq xqVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                com.bytedance.adsdk.ypw.xq.dg dgVar = this.f9224aa.qh().get(com.bytedance.adsdk.ypw.xq.dg.emc(cCharAt, xqVar.emc(), xqVar.xq()));
                if (dgVar != null) {
                    fMeasureText = ((float) dgVar.ypw()) * f11 * com.bytedance.adsdk.ypw.ycc.ycc.emc();
                }
            } else {
                fMeasureText = this.ru.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                emc emcVarYpw = ypw(i10);
                if (i12 == i11) {
                    emcVarYpw.emc(str.substring(i11, i13).trim(), (f13 - f16) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    emcVarYpw.emc(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            ypw(i10).emc(str.substring(i11), f13);
        }
        return this.qh.subList(0, i10);
    }

    private void emc(com.bytedance.adsdk.ypw.xq.dg dgVar, float f10, com.bytedance.adsdk.ypw.xq.ypw ypwVar, Canvas canvas) {
        List<com.bytedance.adsdk.ypw.emc.emc.dg> listEmc = emc(dgVar);
        for (int i10 = 0; i10 < listEmc.size(); i10++) {
            Path pathDg = listEmc.get(i10).dg();
            pathDg.computeBounds(this.msw, false);
            this.zz.reset();
            this.zz.preTranslate(0.0f, (-ypwVar.uym) * com.bytedance.adsdk.ypw.ycc.ycc.emc());
            this.zz.preScale(f10, f10);
            pathDg.transform(this.zz);
            if (ypwVar.gbl) {
                emc(pathDg, this.ru, canvas);
                emc(pathDg, this.gbl, canvas);
            } else {
                emc(pathDg, this.gbl, canvas);
                emc(pathDg, this.ru, canvas);
            }
        }
    }

    private void emc(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void emc(String str, com.bytedance.adsdk.ypw.xq.ypw ypwVar, Canvas canvas) {
        if (ypwVar.gbl) {
            emc(str, this.ru, canvas);
            emc(str, this.gbl, canvas);
        } else {
            emc(str, this.gbl, canvas);
            emc(str, this.ru, canvas);
        }
    }

    private void emc(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.ypw.emc.emc.dg> emc(com.bytedance.adsdk.ypw.xq.dg dgVar) {
        if (this.sup.containsKey(dgVar)) {
            return this.sup.get(dgVar);
        }
        List<vk> listEmc = dgVar.emc();
        int size = listEmc.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.bytedance.adsdk.ypw.emc.emc.dg(this.vk, this, listEmc.get(i10), this.f9224aa));
        }
        this.sup.put(dgVar, arrayList);
        return arrayList;
    }

    private String emc(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!xq(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.sz.indexOfKey(j10) >= 0) {
            return this.sz.get(j10);
        }
        this.uym.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.uym.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.uym.toString();
        this.sz.put(j10, string);
        return string;
    }
}
