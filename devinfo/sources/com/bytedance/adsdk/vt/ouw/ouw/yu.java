package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu implements fkw, mwh, ouw.InterfaceC0040ouw {
    private final com.bytedance.adsdk.vt.bly bly;

    /* renamed from: cf, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.rn f7171cf;
    private final RectF fkw;

    /* renamed from: le, reason: collision with root package name */
    private final String f7172le;

    /* renamed from: lh, reason: collision with root package name */
    private final Matrix f7173lh;
    private final Paint ouw;
    private final List<lh> pno;
    private final boolean ra;
    private List<mwh> tlj;
    private final RectF vt;
    private final Path yu;

    public yu(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, String str, boolean z3, List<lh> list, com.bytedance.adsdk.vt.lh.ouw.ryl rylVar) {
        this.ouw = new com.bytedance.adsdk.vt.ouw.ouw();
        this.vt = new RectF();
        this.f7173lh = new Matrix();
        this.yu = new Path();
        this.fkw = new RectF();
        this.f7172le = str;
        this.bly = blyVar;
        this.ra = z3;
        this.pno = list;
        if (rylVar != null) {
            com.bytedance.adsdk.vt.ouw.vt.rn rnVarOuw = rylVar.ouw();
            this.f7171cf = rnVarOuw;
            rnVarOuw.ouw(ouwVar);
            this.f7171cf.ouw(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            lh lhVar = list.get(size);
            if (lhVar instanceof tlj) {
                arrayList.add((tlj) lhVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((tlj) arrayList.get(size2)).ouw(list.listIterator(list.size()));
        }
    }

    private static List<lh> ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, List<com.bytedance.adsdk.vt.lh.vt.lh> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            lh lhVarOuw = list.get(i4).ouw(blyVar, raVar, ouwVar);
            if (lhVarOuw != null) {
                arrayList.add(lhVarOuw);
            }
        }
        return arrayList;
    }

    public final Matrix lh() {
        com.bytedance.adsdk.vt.ouw.vt.rn rnVar = this.f7171cf;
        if (rnVar != null) {
            return rnVar.ouw();
        }
        this.f7173lh.reset();
        return this.f7173lh;
    }

    public final List<mwh> vt() {
        if (this.tlj == null) {
            this.tlj = new ArrayList();
            for (int i4 = 0; i4 < this.pno.size(); i4++) {
                lh lhVar = this.pno.get(i4);
                if (lhVar instanceof mwh) {
                    this.tlj.add((mwh) lhVar);
                }
            }
        }
        return this.tlj;
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        this.f7173lh.reset();
        com.bytedance.adsdk.vt.ouw.vt.rn rnVar = this.f7171cf;
        if (rnVar != null) {
            this.f7173lh.set(rnVar.ouw());
        }
        this.yu.reset();
        if (this.ra) {
            return this.yu;
        }
        for (int size = this.pno.size() - 1; size >= 0; size--) {
            lh lhVar = this.pno.get(size);
            if (lhVar instanceof mwh) {
                this.yu.addPath(((mwh) lhVar).yu(), this.f7173lh);
            }
        }
        return this.yu;
    }

    private static com.bytedance.adsdk.vt.lh.ouw.ryl ouw(List<com.bytedance.adsdk.vt.lh.vt.lh> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            com.bytedance.adsdk.vt.lh.vt.lh lhVar = list.get(i4);
            if (lhVar instanceof com.bytedance.adsdk.vt.lh.ouw.ryl) {
                return (com.bytedance.adsdk.vt.lh.ouw.ryl) lhVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.bly.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        ArrayList arrayList = new ArrayList(this.pno.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.pno.size() - 1; size >= 0; size--) {
            lh lhVar = this.pno.get(size);
            lhVar.ouw(arrayList, this.pno.subList(0, size));
            arrayList.add(lhVar);
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i4) {
        if (this.ra) {
            return;
        }
        this.f7173lh.set(matrix);
        com.bytedance.adsdk.vt.ouw.vt.rn rnVar = this.f7171cf;
        if (rnVar != null) {
            this.f7173lh.preConcat(rnVar.ouw());
            i4 = (int) (((((this.f7171cf.fkw == null ? 100 : r7.le().intValue()) / 100.0f) * i4) / 255.0f) * 255.0f);
        }
        boolean z3 = false;
        if (this.bly.jqy) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= this.pno.size()) {
                    break;
                }
                if (!(this.pno.get(i10) instanceof fkw) || (i11 = i11 + 1) < 2) {
                    i10++;
                } else if (i4 != 255) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            this.vt.set(0.0f, 0.0f, 0.0f, 0.0f);
            ouw(this.vt, this.f7173lh, true);
            this.ouw.setAlpha(i4);
            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.vt, this.ouw);
        }
        if (z3) {
            i4 = 255;
        }
        for (int size = this.pno.size() - 1; size >= 0; size--) {
            lh lhVar = this.pno.get(size);
            if (lhVar instanceof fkw) {
                ((fkw) lhVar).ouw(canvas, this.f7173lh, i4);
            }
        }
        if (z3) {
            canvas.restore();
        }
    }

    public yu(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.rn rnVar, com.bytedance.adsdk.vt.ra raVar) {
        this(blyVar, ouwVar, rnVar.ouw, rnVar.f7121lh, ouw(blyVar, raVar, ouwVar, rnVar.vt), ouw(rnVar.vt));
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        this.f7173lh.set(matrix);
        com.bytedance.adsdk.vt.ouw.vt.rn rnVar = this.f7171cf;
        if (rnVar != null) {
            this.f7173lh.preConcat(rnVar.ouw());
        }
        this.fkw.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.pno.size() - 1; size >= 0; size--) {
            lh lhVar = this.pno.get(size);
            if (lhVar instanceof fkw) {
                ((fkw) lhVar).ouw(this.fkw, this.f7173lh, z3);
                rectF.union(this.fkw);
            }
        }
    }
}
