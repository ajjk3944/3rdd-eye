package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@com.bytedance.adsdk.ugeno.yoga.ouw.ouw
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends tlj implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    private float[] arr;
    private vt fkw;

    /* renamed from: le, reason: collision with root package name */
    private Object f6982le;

    /* renamed from: lh, reason: collision with root package name */
    private List<YogaNodeJNIBase> f6983lh;

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    private int mLayoutDirection;
    protected long ouw;
    private boolean ra;
    private YogaNodeJNIBase vt;
    private ra yu;

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.ra = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.ouw = j;
    }

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i4) {
        List<YogaNodeJNIBase> list = this.f6983lh;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i4);
        this.f6983lh.add(i4, yogaNodeJNIBase);
        yogaNodeJNIBase.vt = this;
        return yogaNodeJNIBase.ouw;
    }

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    public final float baseline(float f10, float f11) {
        return this.fkw.ouw();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void bly(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final float cf() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void fkw() {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.ouw, 100.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void jg() {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.ouw, true);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void le() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.ouw);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void lh() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i4)).f6983lh;
            if (list != null) {
                Iterator<YogaNodeJNIBase> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i10 = 0; i10 < yogaNodeJNIBaseArr.length; i10++) {
            jArr[i10] = yogaNodeJNIBaseArr[i10].ouw;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.ouw, Float.NaN, Float.NaN, jArr, yogaNodeJNIBaseArr);
    }

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    public final long measure(float f10, int i4, float f11, int i10) {
        ra raVar = this.yu;
        if (raVar != null) {
            return raVar.ouw(this, f10, pno.ouw(i4), f11, pno.ouw(i10));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final Object mwh() {
        return this.f6982le;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final int ouw() {
        List<YogaNodeJNIBase> list = this.f6983lh;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void pno() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.ouw);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ra() {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.ouw, 100.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final float ryl() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void tlj(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void vt(ouw ouwVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.ouw, ouwVar.tlj);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void yu() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.ouw);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final float bly() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void fkw(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void le(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(tlj tljVar, int i4) {
        if (tljVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) tljVar;
            if (yogaNodeJNIBase.vt != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f6983lh == null) {
                this.f6983lh = new ArrayList(4);
            }
            this.f6983lh.add(i4, yogaNodeJNIBase);
            yogaNodeJNIBase.vt = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.ouw, yogaNodeJNIBase.ouw, i4);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void pno(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ra(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final float tlj() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void yu(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void vt(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void vt(yu yuVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.ouw, yuVar.tlj, f10);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final /* bridge */ /* synthetic */ tlj vt() {
        return this.vt;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final /* synthetic */ tlj vt(int i4) {
        List<YogaNodeJNIBase> list = this.f6983lh;
        if (list != null) {
            YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i4);
            yogaNodeJNIBaseRemove.vt = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.ouw, yogaNodeJNIBaseRemove.ouw);
            return yogaNodeJNIBaseRemove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final int ouw(tlj tljVar) {
        List<YogaNodeJNIBase> list = this.f6983lh;
        if (list == null) {
            return -1;
        }
        return list.indexOf(tljVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(lh lhVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.ouw, lhVar.yu);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void lh(ouw ouwVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.ouw, ouwVar.tlj);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(fkw fkwVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.ouw, fkwVar.fkw);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void lh(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void lh(yu yuVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.ouw, yuVar.tlj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(le leVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.ouw, leVar.ra);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(ouw ouwVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.ouw, ouwVar.tlj);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(ryl rylVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.ouw, rylVar.yu);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(mwh mwhVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.ouw, mwhVar.yu);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(yu yuVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.ouw, yuVar.tlj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(ra raVar) {
        this.yu = raVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.ouw, raVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(Object obj) {
        this.f6982le = obj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final /* synthetic */ tlj ouw(int i4) {
        List<YogaNodeJNIBase> list = this.f6983lh;
        if (list != null) {
            return list.get(i4);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }
}
