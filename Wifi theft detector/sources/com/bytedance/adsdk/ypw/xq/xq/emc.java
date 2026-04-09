package com.bytedance.adsdk.ypw.xq.xq;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import com.bytedance.adsdk.ypw.emc.ypw.vk;
import com.bytedance.adsdk.ypw.xq.xq.bw;
import com.bytedance.adsdk.ypw.xq.ypw.msw;
import com.bytedance.adsdk.ypw.xq.ypw.qh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class emc implements com.bytedance.adsdk.ypw.emc.emc.bw, emc.InterfaceC0106emc {

    /* renamed from: aa, reason: collision with root package name */
    private final RectF f9223aa;
    float bw;
    private final RectF cf;
    private final List<com.bytedance.adsdk.ypw.emc.ypw.emc<?, ?>> db;
    final vk dg;
    private Paint dr;
    private List<emc> ee;
    final Matrix emc;
    private final Paint gbl;
    private emc hxp;
    private float lt;
    private final Paint qh;
    private emc rie;
    private boolean sb;
    private final RectF sba;
    private boolean sf;
    private com.bytedance.adsdk.ypw.emc.ypw.dg sra;
    private final Paint sup;
    private final Paint sz;
    private final String ul;
    private final RectF vk;
    private final Matrix xmt;
    final bw xq;
    BlurMaskFilter ycc;
    private com.bytedance.adsdk.ypw.emc.ypw.msw ylm;
    final com.bytedance.adsdk.ypw.zz ypw;
    private final RectF yzg;
    private final Path uym = new Path();
    private final Matrix msw = new Matrix();
    private final Matrix zz = new Matrix();
    private final Paint ru = new com.bytedance.adsdk.ypw.emc.emc(1);

    /* renamed from: com.bytedance.adsdk.ypw.xq.xq.emc$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] emc;
        static final /* synthetic */ int[] ypw;

        static {
            int[] iArr = new int[msw.emc.values().length];
            ypw = iArr;
            try {
                iArr[msw.emc.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ypw[msw.emc.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ypw[msw.emc.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ypw[msw.emc.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[bw.emc.values().length];
            emc = iArr2;
            try {
                iArr2[bw.emc.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                emc[bw.emc.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                emc[bw.emc.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                emc[bw.emc.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                emc[bw.emc.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                emc[bw.emc.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                emc[bw.emc.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public emc(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.gbl = new com.bytedance.adsdk.ypw.emc.emc(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.sup = new com.bytedance.adsdk.ypw.emc.emc(1, mode2);
        com.bytedance.adsdk.ypw.emc.emc emcVar = new com.bytedance.adsdk.ypw.emc.emc(1);
        this.sz = emcVar;
        this.qh = new com.bytedance.adsdk.ypw.emc.emc(PorterDuff.Mode.CLEAR);
        this.cf = new RectF();
        this.vk = new RectF();
        this.f9223aa = new RectF();
        this.sba = new RectF();
        this.yzg = new RectF();
        this.emc = new Matrix();
        this.db = new ArrayList();
        this.sb = true;
        this.bw = 0.0f;
        this.xmt = new Matrix();
        this.lt = 1.0f;
        this.ypw = zzVar;
        this.xq = bwVar;
        this.ul = bwVar.ycc() + "#draw";
        if (bwVar.sup() == bw.ypw.INVERT) {
            emcVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            emcVar.setXfermode(new PorterDuffXfermode(mode));
        }
        vk vkVarRu = bwVar.cf().ru();
        this.dg = vkVarRu;
        vkVarRu.emc((emc.InterfaceC0106emc) this);
        if (bwVar.ru() != null && !bwVar.ru().isEmpty()) {
            com.bytedance.adsdk.ypw.emc.ypw.msw mswVar = new com.bytedance.adsdk.ypw.emc.ypw.msw(bwVar.ru());
            this.ylm = mswVar;
            Iterator<com.bytedance.adsdk.ypw.emc.ypw.emc<qh, Path>> it = mswVar.ypw().iterator();
            while (it.hasNext()) {
                it.next().emc(this);
            }
            for (com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar2 : this.ylm.xq()) {
                emc(emcVar2);
                emcVar2.emc(this);
            }
        }
        sup();
    }

    private void cf() {
        if (this.ee != null) {
            return;
        }
        if (this.hxp == null) {
            this.ee = Collections.EMPTY_LIST;
            return;
        }
        this.ee = new ArrayList();
        for (emc emcVar = this.hxp; emcVar != null; emcVar = emcVar.hxp) {
            this.ee.add(emcVar);
        }
    }

    private boolean qh() {
        if (this.ylm.ypw().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.ylm.emc().size(); i10++) {
            if (this.ylm.emc().get(i10).emc() != msw.emc.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void sup() {
        if (this.xq.dg().isEmpty()) {
            ypw(true);
            return;
        }
        com.bytedance.adsdk.ypw.emc.ypw.dg dgVar = new com.bytedance.adsdk.ypw.emc.ypw.dg(this.xq.dg());
        this.sra = dgVar;
        dgVar.emc();
        this.sra.emc(new emc.InterfaceC0106emc() { // from class: com.bytedance.adsdk.ypw.xq.xq.emc.1
            @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
            public void emc() {
                emc emcVar = emc.this;
                emcVar.ypw(emcVar.sra.zz() == 1.0f);
            }
        });
        ypw(this.sra.uym().floatValue() == 1.0f);
        emc(this.sra);
    }

    private void sz() {
        this.ypw.invalidateSelf();
    }

    public String bw() {
        bw bwVar = this.xq;
        if (bwVar != null) {
            return bwVar.uym();
        }
        return null;
    }

    public Matrix dg() {
        return this.xmt;
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<com.bytedance.adsdk.ypw.emc.emc.xq> list, List<com.bytedance.adsdk.ypw.emc.emc.xq> list2) {
    }

    public com.bytedance.adsdk.ypw.bw.ru gbl() {
        return this.xq.hxp();
    }

    public boolean msw() {
        return this.sb;
    }

    public com.bytedance.adsdk.ypw.xq.ypw.emc ru() {
        return this.xq.rie();
    }

    public boolean uym() {
        com.bytedance.adsdk.ypw.emc.ypw.msw mswVar = this.ylm;
        return (mswVar == null || mswVar.ypw().isEmpty()) ? false : true;
    }

    public float ycc() {
        return this.lt;
    }

    public bw ypw() {
        return this.xq;
    }

    public String zz() {
        return this.xq.ycc();
    }

    private void dg(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ypw.emc.ypw.emc<qh, Path> emcVar, com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar2) {
        com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.cf, this.gbl);
        this.uym.set(emcVar.uym());
        this.uym.transform(matrix);
        this.ru.setAlpha((int) (emcVar2.uym().intValue() * 2.55f));
        canvas.drawPath(this.uym, this.ru);
        canvas.restore();
    }

    public boolean xq() {
        return this.rie != null;
    }

    public void ypw(emc emcVar) {
        this.hxp = emcVar;
    }

    private void bw(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ypw.emc.ypw.emc<qh, Path> emcVar, com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar2) {
        com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.cf, this.gbl);
        canvas.drawRect(this.cf, this.ru);
        this.sup.setAlpha((int) (emcVar2.uym().intValue() * 2.55f));
        this.uym.set(emcVar.uym());
        this.uym.transform(matrix);
        canvas.drawPath(this.uym, this.sup);
        canvas.restore();
    }

    public static emc emc(ypw ypwVar, bw bwVar, com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, Context context) {
        switch (AnonymousClass2.emc[bwVar.gbl().ordinal()]) {
            case 1:
                return new uym(zzVar, bwVar, ypwVar, uymVar);
            case 2:
                return new ypw(zzVar, bwVar, uymVar.ypw(bwVar.uym()), uymVar, context);
            case 3:
                return new msw(zzVar, bwVar);
            case 4:
                if (emc(zzVar, bwVar, "text:")) {
                    return new xq(zzVar, bwVar, context);
                }
                if (emc(zzVar, bwVar, "videoview:")) {
                    return new ru(zzVar, bwVar, context);
                }
                return new dg(zzVar, bwVar);
            case 5:
                return new ycc(zzVar, bwVar);
            case 6:
                return new zz(zzVar, bwVar);
            default:
                Objects.toString(bwVar.gbl());
                return null;
        }
    }

    private void xq(float f10) {
        this.ypw.db().xq().emc(this.xq.ycc(), f10);
    }

    private void ypw(RectF rectF, Matrix matrix) {
        if (xq() && this.xq.sup() != bw.ypw.INVERT) {
            this.sba.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.rie.emc(this.sba, matrix, true);
            if (rectF.intersect(this.sba)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void xq(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ypw.emc.ypw.emc<qh, Path> emcVar, com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar2) {
        com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.cf, this.sup);
        canvas.drawRect(this.cf, this.ru);
        this.sup.setAlpha((int) (emcVar2.uym().intValue() * 2.55f));
        this.uym.set(emcVar.uym());
        this.uym.transform(matrix);
        canvas.drawPath(this.uym, this.sup);
        canvas.restore();
    }

    public void ypw(Canvas canvas, Matrix matrix, int i10) {
        emc(i10);
    }

    private void ypw(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ypw.emc.ypw.emc<qh, Path> emcVar, com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar2) {
        com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.cf, this.ru);
        canvas.drawRect(this.cf, this.ru);
        this.uym.set(emcVar.uym());
        this.uym.transform(matrix);
        this.ru.setAlpha((int) (emcVar2.uym().intValue() * 2.55f));
        canvas.drawPath(this.uym, this.sup);
        canvas.restore();
    }

    private static boolean emc(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar, String str) {
        com.bytedance.adsdk.ypw.ru ruVarYcc;
        if (zzVar == null || bwVar == null || str == null || (ruVarYcc = zzVar.ycc(bwVar.uym())) == null) {
            return false;
        }
        return str.equals(ruVarYcc.ru());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(boolean z10) {
        if (z10 != this.sb) {
            this.sb = z10;
            sz();
        }
    }

    public void emc(boolean z10) {
        if (z10 && this.dr == null) {
            this.dr = new com.bytedance.adsdk.ypw.emc.emc();
        }
        this.sf = z10;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
    public void emc() {
        sz();
    }

    public BlurMaskFilter ypw(float f10) {
        if (this.bw == f10) {
            return this.ycc;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.ycc = blurMaskFilter;
        this.bw = f10;
        return blurMaskFilter;
    }

    public void emc(emc emcVar) {
        this.rie = emcVar;
    }

    public void emc(com.bytedance.adsdk.ypw.emc.ypw.emc<?, ?> emcVar) {
        if (emcVar == null) {
            return;
        }
        this.db.add(emcVar);
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        this.cf.set(0.0f, 0.0f, 0.0f, 0.0f);
        cf();
        this.emc.set(matrix);
        if (z10) {
            List<emc> list = this.ee;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.emc.preConcat(this.ee.get(size).dg.dg());
                }
            } else {
                emc emcVar = this.hxp;
                if (emcVar != null) {
                    this.emc.preConcat(emcVar.dg.dg());
                }
            }
        }
        this.emc.preConcat(this.dg.dg());
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer numUym;
        com.bytedance.adsdk.ypw.bw.emc(this.ul);
        if (this.sb && !this.xq.sra()) {
            cf();
            com.bytedance.adsdk.ypw.bw.emc("Layer#parentMatrix");
            this.xmt.set(matrix);
            this.msw.reset();
            this.msw.set(matrix);
            for (int size = this.ee.size() - 1; size >= 0; size--) {
                this.msw.preConcat(this.ee.get(size).dg.dg());
            }
            com.bytedance.adsdk.ypw.bw.ypw("Layer#parentMatrix");
            com.bytedance.adsdk.ypw.emc.ypw.emc<?, Integer> emcVarEmc = this.dg.emc();
            int iIntValue = (int) ((((i10 / 255.0f) * ((emcVarEmc == null || (numUym = emcVarEmc.uym()) == null) ? 100 : numUym.intValue())) / 100.0f) * 255.0f);
            if (!xq() && !uym()) {
                this.msw.preConcat(this.dg.dg());
                com.bytedance.adsdk.ypw.bw.emc("Layer#drawLayer");
                ypw(canvas, this.msw, iIntValue);
                com.bytedance.adsdk.ypw.bw.ypw("Layer#drawLayer");
                xq(com.bytedance.adsdk.ypw.bw.ypw(this.ul));
                return;
            }
            com.bytedance.adsdk.ypw.bw.emc("Layer#computeBounds");
            emc(this.cf, this.msw, false);
            ypw(this.cf, matrix);
            this.msw.preConcat(this.dg.dg());
            emc(this.cf, this.msw);
            this.vk.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.zz);
            if (!this.zz.isIdentity()) {
                Matrix matrix2 = this.zz;
                matrix2.invert(matrix2);
                this.zz.mapRect(this.vk);
            }
            if (!this.cf.intersect(this.vk)) {
                this.cf.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.ypw.bw.ypw("Layer#computeBounds");
            if (this.cf.width() >= 1.0f && this.cf.height() >= 1.0f) {
                com.bytedance.adsdk.ypw.bw.emc("Layer#saveLayer");
                this.ru.setAlpha(255);
                com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.cf, this.ru);
                com.bytedance.adsdk.ypw.bw.ypw("Layer#saveLayer");
                emc(canvas);
                com.bytedance.adsdk.ypw.bw.emc("Layer#drawLayer");
                ypw(canvas, this.msw, iIntValue);
                com.bytedance.adsdk.ypw.bw.ypw("Layer#drawLayer");
                if (uym()) {
                    emc(canvas, this.msw);
                }
                if (xq()) {
                    com.bytedance.adsdk.ypw.bw.emc("Layer#drawMatte");
                    com.bytedance.adsdk.ypw.bw.emc("Layer#saveLayer");
                    com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.cf, this.sz, 19);
                    com.bytedance.adsdk.ypw.bw.ypw("Layer#saveLayer");
                    emc(canvas);
                    this.rie.emc(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.ypw.bw.emc("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.ypw.bw.ypw("Layer#restoreLayer");
                    com.bytedance.adsdk.ypw.bw.ypw("Layer#drawMatte");
                }
                com.bytedance.adsdk.ypw.bw.emc("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.ypw.bw.ypw("Layer#restoreLayer");
            }
            if (this.sf && (paint = this.dr) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.dr.setColor(-251901);
                this.dr.setStrokeWidth(4.0f);
                canvas.drawRect(this.cf, this.dr);
                this.dr.setStyle(Paint.Style.FILL);
                this.dr.setColor(1357638635);
                canvas.drawRect(this.cf, this.dr);
            }
            xq(com.bytedance.adsdk.ypw.bw.ypw(this.ul));
            return;
        }
        com.bytedance.adsdk.ypw.bw.ypw(this.ul);
    }

    private void emc(Canvas canvas) {
        com.bytedance.adsdk.ypw.bw.emc("Layer#clearLayer");
        RectF rectF = this.cf;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.qh);
        com.bytedance.adsdk.ypw.bw.ypw("Layer#clearLayer");
    }

    private void emc(RectF rectF, Matrix matrix) {
        this.f9223aa.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (uym()) {
            int size = this.ylm.emc().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bytedance.adsdk.ypw.xq.ypw.msw mswVar = this.ylm.emc().get(i10);
                Path pathUym = this.ylm.ypw().get(i10).uym();
                if (pathUym != null) {
                    this.uym.set(pathUym);
                    this.uym.transform(matrix);
                    int i11 = AnonymousClass2.ypw[mswVar.emc().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && mswVar.dg()) {
                        return;
                    }
                    this.uym.computeBounds(this.yzg, false);
                    if (i10 == 0) {
                        this.f9223aa.set(this.yzg);
                    } else {
                        RectF rectF2 = this.f9223aa;
                        rectF2.set(Math.min(rectF2.left, this.yzg.left), Math.min(this.f9223aa.top, this.yzg.top), Math.max(this.f9223aa.right, this.yzg.right), Math.max(this.f9223aa.bottom, this.yzg.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f9223aa)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public void emc(int i10) {
        this.lt = ((this.dg.emc() != null ? this.dg.emc().uym().intValue() : 100) / 100.0f) * (i10 / 255.0f);
    }

    private void emc(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.ypw.bw.emc("Layer#saveLayer");
        com.bytedance.adsdk.ypw.ycc.ycc.emc(canvas, this.cf, this.gbl, 19);
        if (Build.VERSION.SDK_INT < 28) {
            emc(canvas);
        }
        com.bytedance.adsdk.ypw.bw.ypw("Layer#saveLayer");
        for (int i10 = 0; i10 < this.ylm.emc().size(); i10++) {
            com.bytedance.adsdk.ypw.xq.ypw.msw mswVar = this.ylm.emc().get(i10);
            com.bytedance.adsdk.ypw.emc.ypw.emc<qh, Path> emcVar = this.ylm.ypw().get(i10);
            com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar2 = this.ylm.xq().get(i10);
            int i11 = AnonymousClass2.ypw[mswVar.emc().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.ru.setColor(-16777216);
                        this.ru.setAlpha(255);
                        canvas.drawRect(this.cf, this.ru);
                    }
                    if (mswVar.dg()) {
                        xq(canvas, matrix, emcVar, emcVar2);
                    } else {
                        emc(canvas, matrix, emcVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (mswVar.dg()) {
                            ypw(canvas, matrix, emcVar, emcVar2);
                        } else {
                            emc(canvas, matrix, emcVar, emcVar2);
                        }
                    }
                } else if (mswVar.dg()) {
                    bw(canvas, matrix, emcVar, emcVar2);
                } else {
                    dg(canvas, matrix, emcVar, emcVar2);
                }
            } else if (qh()) {
                this.ru.setAlpha(255);
                canvas.drawRect(this.cf, this.ru);
            }
        }
        com.bytedance.adsdk.ypw.bw.emc("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.ypw.bw.ypw("Layer#restoreLayer");
    }

    private void emc(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ypw.emc.ypw.emc<qh, Path> emcVar, com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVar2) {
        this.uym.set(emcVar.uym());
        this.uym.transform(matrix);
        this.ru.setAlpha((int) (emcVar2.uym().intValue() * 2.55f));
        canvas.drawPath(this.uym, this.ru);
    }

    private void emc(Canvas canvas, Matrix matrix, com.bytedance.adsdk.ypw.emc.ypw.emc<qh, Path> emcVar) {
        this.uym.set(emcVar.uym());
        this.uym.transform(matrix);
        canvas.drawPath(this.uym, this.sup);
    }

    public void emc(float f10) {
        this.dg.emc(f10);
        if (this.ylm != null) {
            for (int i10 = 0; i10 < this.ylm.ypw().size(); i10++) {
                this.ylm.ypw().get(i10).emc(f10);
            }
        }
        com.bytedance.adsdk.ypw.emc.ypw.dg dgVar = this.sra;
        if (dgVar != null) {
            dgVar.emc(f10);
        }
        emc emcVar = this.rie;
        if (emcVar != null) {
            emcVar.emc(f10);
        }
        for (int i11 = 0; i11 < this.db.size(); i11++) {
            this.db.get(i11).emc(f10);
        }
    }
}
