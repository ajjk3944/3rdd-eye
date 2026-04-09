package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

@com.bytedance.adsdk.ugeno.yoga.emc.emc
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends ru implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.emc.emc
    private float[] arr;
    private ypw bw;
    private uym dg;
    protected long emc;

    @com.bytedance.adsdk.ugeno.yoga.emc.emc
    private int mLayoutDirection;
    private boolean uym;
    private List<YogaNodeJNIBase> xq;
    private Object ycc;
    private YogaNodeJNIBase ypw;

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.uym = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.emc = j10;
    }

    @com.bytedance.adsdk.ugeno.yoga.emc.emc
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.xq;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.xq.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.ypw = this;
        return yogaNodeJNIBase.emc;
    }

    @com.bytedance.adsdk.ugeno.yoga.emc.emc
    public final float baseline(float f10, float f11) {
        return this.bw.emc(this, f10, f11);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void bw(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase ypw(int i10) {
        List<YogaNodeJNIBase> list = this.xq;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i10);
        yogaNodeJNIBaseRemove.ypw = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.emc, yogaNodeJNIBaseRemove.emc);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    /* renamed from: gbl, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase ypw() {
        return this.ypw;
    }

    @com.bytedance.adsdk.ugeno.yoga.emc.emc
    public final long measure(float f10, int i10, float f11, int i11) {
        if (sup()) {
            return this.dg.emc(this, f10, msw.emc(i10), f11, msw.emc(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void msw(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void ru(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void sup(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void uym(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase emc(int i10) {
        List<YogaNodeJNIBase> list = this.xq;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void ycc(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void zz(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void bw() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.emc);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public int emc() {
        List<YogaNodeJNIBase> list = this.xq;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void gbl(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public float msw() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public Object ru() {
        return this.ycc;
    }

    public boolean sup() {
        return this.dg != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public float uym() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public float ycc() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public float zz() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    private void ypw(ru ruVar) {
        ru();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(ru ruVar, int i10) {
        if (ruVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ruVar;
            if (yogaNodeJNIBase.ypw == null) {
                if (this.xq == null) {
                    this.xq = new ArrayList(4);
                }
                this.xq.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.ypw = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.emc, yogaNodeJNIBase.emc, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void xq(emc emcVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.emc, emcVar.emc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void ypw(emc emcVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.emc, emcVar.emc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void xq(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void ypw(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void dg(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void xq() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.emc);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void ypw(dg dgVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.emc, dgVar.emc(), f10);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void dg() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.emc);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void xq(dg dgVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.emc, dgVar.emc(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public int emc(ru ruVar) {
        List<YogaNodeJNIBase> list = this.xq;
        if (list == null) {
            return -1;
        }
        return list.indexOf(ruVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(float f10, float f11) {
        ypw((ru) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.xq;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.ypw(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].emc;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.emc, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(xq xqVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.emc, xqVar.emc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(bw bwVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.emc, bwVar.emc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(ycc yccVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.emc, yccVar.emc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(emc emcVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.emc, emcVar.emc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(sz szVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.emc, szVar.emc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(qh qhVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.emc, qhVar.emc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.emc, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(dg dgVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.emc, dgVar.emc(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(uym uymVar) {
        this.dg = uymVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.emc, uymVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(boolean z10) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.emc, z10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ru
    public void emc(Object obj) {
        this.ycc = obj;
    }
}
