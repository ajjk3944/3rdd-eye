package com.bytedance.adsdk.vt.lh.lh;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.vt.lh.lh.fkw;
import com.bytedance.adsdk.vt.lh.vt.jg;
import com.bytedance.adsdk.vt.lh.vt.pno;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import com.bytedance.adsdk.vt.ouw.vt.rn;
import d.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw implements com.bytedance.adsdk.vt.ouw.ouw.fkw, ouw.InterfaceC0040ouw {
    public final Matrix bly;

    /* renamed from: cd, reason: collision with root package name */
    private final List<com.bytedance.adsdk.vt.ouw.vt.ouw<?, ?>> f7081cd;
    private final String ex;
    final rn fkw;
    private ouw jae;
    private final RectF jqy;
    private final Paint ko;
    private ouw ksc;

    /* renamed from: le, reason: collision with root package name */
    public boolean f7084le;

    /* renamed from: lh, reason: collision with root package name */
    public final fkw f7085lh;

    /* renamed from: od, reason: collision with root package name */
    private List<ouw> f7086od;
    final Matrix ouw;

    /* renamed from: pd, reason: collision with root package name */
    private Paint f7087pd;
    BlurMaskFilter pno;
    private final RectF qbp;
    float ra;
    private final Paint rn;
    private com.bytedance.adsdk.vt.ouw.vt.pno tc;

    /* renamed from: th, reason: collision with root package name */
    private final RectF f7088th;
    public float tlj;
    private boolean uq;
    private final Paint vm;
    private final RectF vpp;
    final com.bytedance.adsdk.vt.bly vt;
    com.bytedance.adsdk.vt.ouw.vt.yu yu;
    private final Paint zih;
    private final RectF zin;

    /* renamed from: cf, reason: collision with root package name */
    private final Path f7082cf = new Path();
    private final Matrix ryl = new Matrix();
    private final Matrix mwh = new Matrix();

    /* renamed from: jg, reason: collision with root package name */
    private final Paint f7083jg = new com.bytedance.adsdk.vt.ouw.ouw(1);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.lh.lh.ouw$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] ouw;
        static final /* synthetic */ int[] vt;

        static {
            int[] iArr = new int[pno.ouw.values().length];
            vt = iArr;
            try {
                iArr[pno.ouw.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                vt[pno.ouw.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                vt[pno.ouw.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                vt[pno.ouw.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[fkw.ouw.values().length];
            ouw = iArr2;
            try {
                iArr2[fkw.ouw.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[fkw.ouw.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[fkw.ouw.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ouw[fkw.ouw.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ouw[fkw.ouw.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ouw[fkw.ouw.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ouw[fkw.ouw.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public ouw(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.ko = new com.bytedance.adsdk.vt.ouw.ouw(mode, (byte) 0);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.rn = new com.bytedance.adsdk.vt.ouw.ouw(mode2, (byte) 0);
        com.bytedance.adsdk.vt.ouw.ouw ouwVar = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.zih = ouwVar;
        this.vm = new com.bytedance.adsdk.vt.ouw.ouw(PorterDuff.Mode.CLEAR);
        this.f7088th = new RectF();
        this.qbp = new RectF();
        this.zin = new RectF();
        this.vpp = new RectF();
        this.jqy = new RectF();
        this.ouw = new Matrix();
        this.f7081cd = new ArrayList();
        this.f7084le = true;
        this.ra = 0.0f;
        this.bly = new Matrix();
        this.tlj = 1.0f;
        this.vt = blyVar;
        this.f7085lh = fkwVar;
        this.ex = h.w(new StringBuilder(), fkwVar.f7073lh, "#draw");
        if (fkwVar.zin == fkw.vt.INVERT) {
            ouwVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            ouwVar.setXfermode(new PorterDuffXfermode(mode));
        }
        rn rnVarOuw = fkwVar.bly.ouw();
        this.fkw = rnVarOuw;
        rnVarOuw.ouw((ouw.InterfaceC0040ouw) this);
        List<com.bytedance.adsdk.vt.lh.vt.pno> list = fkwVar.pno;
        if (list != null && !list.isEmpty()) {
            com.bytedance.adsdk.vt.ouw.vt.pno pnoVar = new com.bytedance.adsdk.vt.ouw.vt.pno(fkwVar.pno);
            this.tc = pnoVar;
            Iterator<com.bytedance.adsdk.vt.ouw.vt.ouw<jg, Path>> it = pnoVar.ouw.iterator();
            while (it.hasNext()) {
                it.next().ouw(this);
            }
            for (com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar2 : this.tc.vt) {
                ouw(ouwVar2);
                ouwVar2.ouw(this);
            }
        }
        if (this.f7085lh.qbp.isEmpty()) {
            vt(true);
            return;
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar = new com.bytedance.adsdk.vt.ouw.vt.yu(this.f7085lh.qbp);
        this.yu = yuVar;
        yuVar.vt = true;
        yuVar.ouw(new ouw.InterfaceC0040ouw() { // from class: com.bytedance.adsdk.vt.lh.lh.ouw.1
            @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
            public final void ouw() {
                ouw ouwVar3 = ouw.this;
                ouwVar3.vt(ouwVar3.yu.pno() == 1.0f);
            }
        });
        vt(this.yu.le().floatValue() == 1.0f);
        ouw(this.yu);
    }

    private boolean fkw() {
        com.bytedance.adsdk.vt.ouw.vt.pno pnoVar = this.tc;
        return (pnoVar == null || pnoVar.ouw.isEmpty()) ? false : true;
    }

    private void le() {
        if (this.f7086od != null) {
            return;
        }
        if (this.jae == null) {
            this.f7086od = Collections.EMPTY_LIST;
            return;
        }
        this.f7086od = new ArrayList();
        for (ouw ouwVar = this.jae; ouwVar != null; ouwVar = ouwVar.jae) {
            this.f7086od.add(ouwVar);
        }
    }

    private void lh(float f10) {
        this.vt.ouw.ouw.ouw(this.f7085lh.f7073lh, f10);
    }

    private boolean yu() {
        return this.ksc != null;
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<com.bytedance.adsdk.vt.ouw.ouw.lh> list, List<com.bytedance.adsdk.vt.ouw.ouw.lh> list2) {
    }

    public final void vt(ouw ouwVar) {
        this.jae = ouwVar;
    }

    public static ouw ouw(vt vtVar, fkw fkwVar, com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, Context context) {
        switch (AnonymousClass2.ouw[fkwVar.fkw.ordinal()]) {
            case 1:
                return new ra(blyVar, fkwVar, vtVar, raVar);
            case 2:
                return new vt(blyVar, fkwVar, raVar.vt.get(fkwVar.ra), raVar, context);
            case 3:
                return new pno(blyVar, fkwVar);
            case 4:
                return ouw(blyVar, fkwVar, "text:") ? new lh(blyVar, fkwVar, context) : ouw(blyVar, fkwVar, "videoview:") ? new tlj(blyVar, fkwVar) : new yu(blyVar, fkwVar);
            case 5:
                return new le(blyVar, fkwVar);
            case 6:
                return new bly(blyVar, fkwVar);
            default:
                com.bytedance.adsdk.vt.le.yu.vt("Unknown layer type " + fkwVar.fkw);
                return null;
        }
    }

    public void vt(Canvas canvas, Matrix matrix, int i4) {
        ouw(i4);
    }

    public final void vt(boolean z3) {
        if (z3 != this.f7084le) {
            this.f7084le = z3;
            this.vt.invalidateSelf();
        }
    }

    public com.bytedance.adsdk.vt.lh.vt.ouw vt() {
        return this.f7085lh.jqy;
    }

    public com.bytedance.adsdk.vt.fkw.tlj lh() {
        return this.f7085lh.ex;
    }

    public final BlurMaskFilter vt(float f10) {
        if (this.ra == f10) {
            return this.pno;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.pno = blurMaskFilter;
        this.ra = f10;
        return blurMaskFilter;
    }

    public void ouw(boolean z3) {
        if (z3 && this.f7087pd == null) {
            this.f7087pd = new com.bytedance.adsdk.vt.ouw.ouw();
        }
        this.uq = z3;
    }

    public final void ouw(ouw ouwVar) {
        this.ksc = ouwVar;
    }

    public final void ouw(com.bytedance.adsdk.vt.ouw.vt.ouw<?, ?> ouwVar) {
        if (ouwVar == null) {
            return;
        }
        this.f7081cd.add(ouwVar);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public void ouw(RectF rectF, Matrix matrix, boolean z3) {
        this.f7088th.set(0.0f, 0.0f, 0.0f, 0.0f);
        le();
        this.ouw.set(matrix);
        if (z3) {
            List<ouw> list = this.f7086od;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.ouw.preConcat(this.f7086od.get(size).fkw.ouw());
                }
            } else {
                ouw ouwVar = this.jae;
                if (ouwVar != null) {
                    this.ouw.preConcat(ouwVar.fkw.ouw());
                }
            }
        }
        this.ouw.preConcat(this.fkw.ouw());
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i4) {
        float f10;
        Paint paint;
        Integer numLe;
        com.bytedance.adsdk.vt.fkw.ouw(this.ex);
        if (this.f7084le && !this.f7085lh.vpp) {
            le();
            com.bytedance.adsdk.vt.fkw.ouw("Layer#parentMatrix");
            this.bly.set(matrix);
            this.ryl.reset();
            this.ryl.set(matrix);
            int i10 = 1;
            for (int size = this.f7086od.size() - 1; size >= 0; size--) {
                this.ryl.preConcat(this.f7086od.get(size).fkw.ouw());
            }
            com.bytedance.adsdk.vt.fkw.vt("Layer#parentMatrix");
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar = this.fkw.fkw;
            int iIntValue = (int) ((((i4 / 255.0f) * ((ouwVar == null || (numLe = ouwVar.le()) == null) ? 100 : numLe.intValue())) / 100.0f) * 255.0f);
            if (!yu() && !fkw()) {
                this.ryl.preConcat(this.fkw.ouw());
                com.bytedance.adsdk.vt.fkw.ouw("Layer#drawLayer");
                vt(canvas, this.ryl, iIntValue);
                com.bytedance.adsdk.vt.fkw.vt("Layer#drawLayer");
                lh(com.bytedance.adsdk.vt.fkw.vt(this.ex));
                return;
            }
            com.bytedance.adsdk.vt.fkw.ouw("Layer#computeBounds");
            ouw(this.f7088th, this.ryl, false);
            RectF rectF = this.f7088th;
            if (yu() && this.f7085lh.zin != fkw.vt.INVERT) {
                this.vpp.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.ksc.ouw(this.vpp, matrix, true);
                if (!rectF.intersect(this.vpp)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.ryl.preConcat(this.fkw.ouw());
            RectF rectF2 = this.f7088th;
            Matrix matrix2 = this.ryl;
            this.zin.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i11 = 3;
            int i12 = 2;
            if (fkw()) {
                int size2 = this.tc.f7184lh.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size2) {
                        com.bytedance.adsdk.vt.lh.vt.pno pnoVar = this.tc.f7184lh.get(i13);
                        Path pathLe = this.tc.ouw.get(i13).le();
                        if (pathLe != null) {
                            this.f7082cf.set(pathLe);
                            this.f7082cf.transform(matrix2);
                            int i14 = AnonymousClass2.vt[pnoVar.ouw.ordinal()];
                            if (i14 == i10 || i14 == i12 || ((i14 == i11 || i14 == 4) && pnoVar.yu)) {
                                break;
                            }
                            this.f7082cf.computeBounds(this.jqy, false);
                            if (i13 == 0) {
                                this.zin.set(this.jqy);
                            } else {
                                RectF rectF3 = this.zin;
                                rectF3.set(Math.min(rectF3.left, this.jqy.left), Math.min(this.zin.top, this.jqy.top), Math.max(this.zin.right, this.jqy.right), Math.max(this.zin.bottom, this.jqy.bottom));
                            }
                        }
                        i13++;
                        i10 = 1;
                        i11 = 3;
                        i12 = 2;
                    } else if (!rectF2.intersect(this.zin)) {
                        f10 = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                f10 = 0.0f;
            } else {
                f10 = 0.0f;
            }
            this.qbp.set(f10, f10, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.mwh);
            if (!this.mwh.isIdentity()) {
                Matrix matrix3 = this.mwh;
                matrix3.invert(matrix3);
                this.mwh.mapRect(this.qbp);
            }
            if (!this.f7088th.intersect(this.qbp)) {
                this.f7088th.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.vt.fkw.vt("Layer#computeBounds");
            if (this.f7088th.width() >= 1.0f && this.f7088th.height() >= 1.0f) {
                com.bytedance.adsdk.vt.fkw.ouw("Layer#saveLayer");
                this.f7083jg.setAlpha(255);
                com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f7088th, this.f7083jg);
                com.bytedance.adsdk.vt.fkw.vt("Layer#saveLayer");
                ouw(canvas);
                com.bytedance.adsdk.vt.fkw.ouw("Layer#drawLayer");
                vt(canvas, this.ryl, iIntValue);
                com.bytedance.adsdk.vt.fkw.vt("Layer#drawLayer");
                if (fkw()) {
                    Matrix matrix4 = this.ryl;
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#saveLayer");
                    com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f7088th, this.ko, 19);
                    if (Build.VERSION.SDK_INT < 28) {
                        ouw(canvas);
                    }
                    com.bytedance.adsdk.vt.fkw.vt("Layer#saveLayer");
                    for (int i15 = 0; i15 < this.tc.f7184lh.size(); i15++) {
                        com.bytedance.adsdk.vt.lh.vt.pno pnoVar2 = this.tc.f7184lh.get(i15);
                        com.bytedance.adsdk.vt.ouw.vt.ouw<jg, Path> ouwVar2 = this.tc.ouw.get(i15);
                        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar3 = this.tc.vt.get(i15);
                        int i16 = AnonymousClass2.vt[pnoVar2.ouw.ordinal()];
                        if (i16 == 1) {
                            if (!this.tc.ouw.isEmpty()) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 < this.tc.f7184lh.size()) {
                                        if (this.tc.f7184lh.get(i17).ouw != pno.ouw.MASK_MODE_NONE) {
                                            break;
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        this.f7083jg.setAlpha(255);
                                        canvas.drawRect(this.f7088th, this.f7083jg);
                                        break;
                                    }
                                }
                            }
                        } else if (i16 == 2) {
                            if (i15 == 0) {
                                this.f7083jg.setColor(-16777216);
                                this.f7083jg.setAlpha(255);
                                canvas.drawRect(this.f7088th, this.f7083jg);
                            }
                            if (pnoVar2.yu) {
                                com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f7088th, this.rn);
                                canvas.drawRect(this.f7088th, this.f7083jg);
                                this.rn.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                                this.f7082cf.set(ouwVar2.le());
                                this.f7082cf.transform(matrix4);
                                canvas.drawPath(this.f7082cf, this.rn);
                                canvas.restore();
                            } else {
                                this.f7082cf.set(ouwVar2.le());
                                this.f7082cf.transform(matrix4);
                                canvas.drawPath(this.f7082cf, this.rn);
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (pnoVar2.yu) {
                                    com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f7088th, this.f7083jg);
                                    canvas.drawRect(this.f7088th, this.f7083jg);
                                    this.f7082cf.set(ouwVar2.le());
                                    this.f7082cf.transform(matrix4);
                                    this.f7083jg.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                                    canvas.drawPath(this.f7082cf, this.rn);
                                    canvas.restore();
                                } else {
                                    this.f7082cf.set(ouwVar2.le());
                                    this.f7082cf.transform(matrix4);
                                    this.f7083jg.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                                    canvas.drawPath(this.f7082cf, this.f7083jg);
                                }
                            }
                        } else if (pnoVar2.yu) {
                            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f7088th, this.ko);
                            canvas.drawRect(this.f7088th, this.f7083jg);
                            this.rn.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                            this.f7082cf.set(ouwVar2.le());
                            this.f7082cf.transform(matrix4);
                            canvas.drawPath(this.f7082cf, this.rn);
                            canvas.restore();
                        } else {
                            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f7088th, this.ko);
                            this.f7082cf.set(ouwVar2.le());
                            this.f7082cf.transform(matrix4);
                            this.f7083jg.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                            canvas.drawPath(this.f7082cf, this.f7083jg);
                            canvas.restore();
                        }
                    }
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.vt.fkw.vt("Layer#restoreLayer");
                }
                if (yu()) {
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#drawMatte");
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#saveLayer");
                    com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f7088th, this.zih, 19);
                    com.bytedance.adsdk.vt.fkw.vt("Layer#saveLayer");
                    ouw(canvas);
                    this.ksc.ouw(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.vt.fkw.vt("Layer#restoreLayer");
                    com.bytedance.adsdk.vt.fkw.vt("Layer#drawMatte");
                }
                com.bytedance.adsdk.vt.fkw.ouw("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.vt.fkw.vt("Layer#restoreLayer");
            }
            if (this.uq && (paint = this.f7087pd) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f7087pd.setColor(-251901);
                this.f7087pd.setStrokeWidth(4.0f);
                canvas.drawRect(this.f7088th, this.f7087pd);
                this.f7087pd.setStyle(Paint.Style.FILL);
                this.f7087pd.setColor(1357638635);
                canvas.drawRect(this.f7088th, this.f7087pd);
            }
            lh(com.bytedance.adsdk.vt.fkw.vt(this.ex));
            return;
        }
        com.bytedance.adsdk.vt.fkw.vt(this.ex);
    }

    private void ouw(Canvas canvas) {
        com.bytedance.adsdk.vt.fkw.ouw("Layer#clearLayer");
        RectF rectF = this.f7088th;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.vm);
        com.bytedance.adsdk.vt.fkw.vt("Layer#clearLayer");
    }

    public final void ouw(int i4) {
        this.tlj = (i4 / 255.0f) * ((this.fkw.fkw != null ? r0.le().intValue() : 100) / 100.0f);
    }

    public void ouw(float f10) {
        rn rnVar = this.fkw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar = rnVar.fkw;
        if (ouwVar != null) {
            ouwVar.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar2 = rnVar.pno;
        if (ouwVar2 != null) {
            ouwVar2.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar3 = rnVar.bly;
        if (ouwVar3 != null) {
            ouwVar3.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVar4 = rnVar.ouw;
        if (ouwVar4 != null) {
            ouwVar4.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> ouwVar5 = rnVar.vt;
        if (ouwVar5 != null) {
            ouwVar5.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar6 = rnVar.f7188lh;
        if (ouwVar6 != null) {
            ouwVar6.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar7 = rnVar.yu;
        if (ouwVar7 != null) {
            ouwVar7.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar = rnVar.f7187le;
        if (yuVar != null) {
            yuVar.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar2 = rnVar.ra;
        if (yuVar2 != null) {
            yuVar2.ouw(f10);
        }
        if (this.tc != null) {
            for (int i4 = 0; i4 < this.tc.ouw.size(); i4++) {
                this.tc.ouw.get(i4).ouw(f10);
            }
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar3 = this.yu;
        if (yuVar3 != null) {
            yuVar3.ouw(f10);
        }
        ouw ouwVar8 = this.ksc;
        if (ouwVar8 != null) {
            ouwVar8.ouw(f10);
        }
        for (int i10 = 0; i10 < this.f7081cd.size(); i10++) {
            this.f7081cd.get(i10).ouw(f10);
        }
    }

    private static boolean ouw(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, String str) {
        com.bytedance.adsdk.vt.tlj tljVarYu;
        if (blyVar == null || fkwVar == null || (tljVarYu = blyVar.yu(fkwVar.ra)) == null) {
            return false;
        }
        return str.equals(tljVarYu.fkw);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.vt.invalidateSelf();
    }
}
