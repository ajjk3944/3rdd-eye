package com.bytedance.adsdk.ugeno.fkw;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import d.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
class yu {

    /* renamed from: lh, reason: collision with root package name */
    static final /* synthetic */ boolean f6892lh = true;
    private boolean[] fkw;

    /* renamed from: le, reason: collision with root package name */
    private long[] f6893le;
    int[] ouw;
    long[] vt;
    private final com.bytedance.adsdk.ugeno.fkw.ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        List<lh> ouw;
        int vt;

        public final void ouw() {
            this.ouw = null;
            this.vt = 0;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements Comparable<vt> {
        int ouw;
        int vt;

        private vt() {
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(vt vtVar) {
            vt vtVar2 = vtVar;
            int i4 = this.vt;
            int i10 = vtVar2.vt;
            return i4 != i10 ? i4 - i10 : this.ouw - vtVar2.ouw;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.vt);
            sb2.append(", index=");
            return h.u(sb2, this.ouw, '}');
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    public yu(com.bytedance.adsdk.ugeno.fkw.ouw ouwVar) {
        this.yu = ouwVar;
    }

    private static int fkw(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z3) {
        return z3 ? vtVar.jg() : vtVar.mwh();
    }

    private static int le(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z3) {
        return z3 ? vtVar.rn() : vtVar.ko();
    }

    private int lh(boolean z3) {
        return z3 ? this.yu.getPaddingTop() : this.yu.getPaddingStart();
    }

    private static long vt(int i4, int i10) {
        return (i4 & 4294967295L) | (i10 << 32);
    }

    private int yu(boolean z3) {
        return z3 ? this.yu.getPaddingBottom() : this.yu.getPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] ouw(View view, int i4, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        List<vt> listOuw = ouw(flexItemCount);
        vt vtVar = new vt((byte) 0);
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.fkw.vt)) {
            vtVar.vt = 1;
        } else {
            vtVar.vt = ((com.bytedance.adsdk.ugeno.fkw.vt) layoutParams).lh();
        }
        if (i4 == -1 || i4 == flexItemCount || i4 >= this.yu.getFlexItemCount()) {
            vtVar.ouw = flexItemCount;
        } else {
            vtVar.ouw = i4;
            while (i4 < flexItemCount) {
                listOuw.get(i4).ouw++;
                i4++;
            }
        }
        listOuw.add(vtVar);
        return ouw(flexItemCount + 1, listOuw, sparseIntArray);
    }

    public final boolean vt(SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return f6892lh;
        }
        for (int i4 = 0; i4 < flexItemCount; i4++) {
            View viewOuw = this.yu.ouw(i4);
            if (viewOuw != null && ((com.bytedance.adsdk.ugeno.fkw.vt) viewOuw.getLayoutParams()).lh() != sparseIntArray.get(i4)) {
                return f6892lh;
            }
        }
        return false;
    }

    private static int lh(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z3) {
        if (z3) {
            return vtVar.mwh();
        }
        return vtVar.jg();
    }

    private static int yu(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z3) {
        if (z3) {
            return vtVar.ko();
        }
        return vtVar.rn();
    }

    private int vt(boolean z3) {
        if (z3) {
            return this.yu.getPaddingEnd();
        }
        return this.yu.getPaddingBottom();
    }

    private static int vt(View view, boolean z3) {
        if (z3) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private static int vt(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z3) {
        if (z3) {
            return vtVar.vt();
        }
        return vtVar.ouw();
    }

    private void vt(int i4, int i10, lh lhVar, int i11, int i12, boolean z3) {
        float f10;
        float f11;
        int i13;
        boolean z10;
        boolean z11;
        int iMax;
        boolean z12;
        boolean z13;
        View view;
        boolean z14;
        boolean z15;
        boolean z16 = z3;
        while (true) {
            int i14 = lhVar.fkw;
            float f12 = lhVar.f6888cf;
            float f13 = 0.0f;
            if (f12 <= 0.0f || i11 > i14) {
                return;
            }
            float f14 = (i14 - i11) / f12;
            lhVar.fkw = i12 + lhVar.f6890le;
            if (!z16) {
                lhVar.ra = LinearLayoutManager.INVALID_OFFSET;
            }
            int i15 = 0;
            boolean z17 = false;
            int i16 = 0;
            float f15 = 0.0f;
            while (i15 < lhVar.pno) {
                int i17 = lhVar.ko + i15;
                View viewVt = this.yu.vt(i17);
                if (viewVt == null || viewVt.getVisibility() == 8) {
                    f10 = f13;
                    f11 = f14;
                    i13 = i15;
                    z10 = z17;
                } else {
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    int flexDirection = this.yu.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = viewVt.getMeasuredHeight();
                        f10 = f13;
                        long[] jArr = this.f6893le;
                        if (jArr != null) {
                            long j = jArr[i17];
                            z13 = true;
                            view = viewVt;
                            measuredHeight = (int) (j >> 32);
                        } else {
                            z13 = true;
                            view = viewVt;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        long[] jArr2 = this.f6893le;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i17];
                        }
                        if (this.fkw[i17] || vtVar.fkw() <= f10) {
                            z14 = z17;
                        } else {
                            float fFkw = measuredHeight - (vtVar.fkw() * f14);
                            if (i15 == lhVar.pno - (z13 ? 1 : 0)) {
                                fFkw += f15;
                                f15 = f10;
                            }
                            int iRound = Math.round(fFkw);
                            if (iRound < vtVar.pno()) {
                                iRound = vtVar.pno();
                                this.fkw[i17] = z13;
                                lhVar.f6888cf -= vtVar.fkw();
                                z15 = z13 ? 1 : 0;
                            } else {
                                float f16 = (fFkw - iRound) + f15;
                                boolean z18 = z17;
                                double d10 = f16;
                                if (d10 > 1.0d) {
                                    iRound++;
                                    f16 -= 1.0f;
                                } else if (d10 < -1.0d) {
                                    iRound--;
                                    f16 += 1.0f;
                                }
                                f15 = f16;
                                z15 = z18;
                            }
                            int iOuw = ouw(i4, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            View view2 = view;
                            view2.measure(iOuw, iMakeMeasureSpec);
                            int measuredWidth2 = view2.getMeasuredWidth();
                            int measuredHeight2 = view2.getMeasuredHeight();
                            ouw(i17, iOuw, iMakeMeasureSpec, view2);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                            z14 = z15;
                        }
                        iMax = Math.max(i16, vtVar.ko() + vtVar.mwh() + measuredWidth);
                        lhVar.fkw = vtVar.rn() + vtVar.jg() + measuredHeight + lhVar.fkw;
                        f11 = f14;
                        i13 = i15;
                        z10 = z14;
                    } else {
                        boolean z19 = z17;
                        f10 = f13;
                        int measuredWidth3 = viewVt.getMeasuredWidth();
                        long[] jArr3 = this.f6893le;
                        f11 = f14;
                        if (jArr3 != null) {
                            measuredWidth3 = (int) jArr3[i17];
                        }
                        int measuredHeight3 = viewVt.getMeasuredHeight();
                        long[] jArr4 = this.f6893le;
                        if (jArr4 != null) {
                            measuredHeight3 = (int) (jArr4[i17] >> 32);
                        }
                        if (this.fkw[i17] || vtVar.fkw() <= f10) {
                            i13 = i15;
                            z11 = z19;
                        } else {
                            float fFkw2 = measuredWidth3 - (vtVar.fkw() * f11);
                            if (i15 == lhVar.pno - 1) {
                                fFkw2 += f15;
                                f15 = f10;
                            }
                            int iRound2 = Math.round(fFkw2);
                            if (iRound2 < vtVar.ra()) {
                                iRound2 = vtVar.ra();
                                this.fkw[i17] = f6892lh;
                                lhVar.f6888cf -= vtVar.fkw();
                                i13 = i15;
                                z12 = true;
                            } else {
                                float f17 = (fFkw2 - iRound2) + f15;
                                i13 = i15;
                                double d11 = f17;
                                if (d11 > 1.0d) {
                                    iRound2++;
                                    f17 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    iRound2--;
                                    f17 += 1.0f;
                                }
                                f15 = f17;
                                z12 = z19;
                            }
                            int iVt = vt(i10, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewVt.measure(iMakeMeasureSpec2, iVt);
                            int measuredWidth4 = viewVt.getMeasuredWidth();
                            int measuredHeight4 = viewVt.getMeasuredHeight();
                            ouw(i17, iMakeMeasureSpec2, iVt, viewVt);
                            z11 = z12;
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        }
                        iMax = Math.max(i16, vtVar.rn() + vtVar.jg() + measuredHeight3);
                        lhVar.fkw = vtVar.ko() + vtVar.mwh() + measuredWidth3 + lhVar.fkw;
                        z10 = z11;
                    }
                    lhVar.ra = Math.max(lhVar.ra, iMax);
                    i16 = iMax;
                }
                f13 = f10;
                i15 = i13 + 1;
                f14 = f11;
                z17 = z10;
            }
            if (!z17 || i14 == lhVar.fkw) {
                return;
            } else {
                z16 = true;
            }
        }
    }

    public final int[] ouw(SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        return ouw(flexItemCount, ouw(flexItemCount), sparseIntArray);
    }

    private List<vt> ouw(int i4) {
        ArrayList arrayList = new ArrayList(i4);
        byte b10 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) this.yu.ouw(i10).getLayoutParams();
            vt vtVar2 = new vt(b10);
            vtVar2.vt = vtVar.lh();
            vtVar2.ouw = i10;
            arrayList.add(vtVar2);
        }
        return arrayList;
    }

    private static int[] ouw(int i4, List<vt> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i4];
        int i10 = 0;
        for (vt vtVar : list) {
            int i11 = vtVar.ouw;
            iArr[i10] = i11;
            sparseIntArray.append(i11, vtVar.vt);
            i10++;
        }
        return iArr;
    }

    public final void ouw(ouw ouwVar, int i4, int i10) {
        ouw(ouwVar, i10, i4, (List<lh>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ouw(ouw ouwVar, int i4, int i10, List<lh> list) {
        int i11;
        ouw ouwVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        lh lhVar;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z3;
        int i26;
        int i27 = i4;
        boolean zOuw = this.yu.ouw();
        int mode = View.MeasureSpec.getMode(i27);
        int size = View.MeasureSpec.getSize(i27);
        List<lh> arrayList = list == null ? new ArrayList() : list;
        ouwVar.ouw = arrayList;
        int iOuw = ouw(zOuw);
        int iVt = vt(zOuw);
        int iLh = lh(zOuw);
        int iYu = yu(zOuw);
        lh lhVar2 = new lh();
        lhVar2.ko = 0;
        int i28 = iOuw + iVt;
        lhVar2.fkw = i28;
        int flexItemCount = this.yu.getFlexItemCount();
        int i29 = 0;
        int i30 = 0;
        int iCombineMeasuredStates = 0;
        int i31 = 0;
        int i32 = Integer.MIN_VALUE;
        while (true) {
            if (i29 >= flexItemCount) {
                i11 = iCombineMeasuredStates;
                ouwVar2 = ouwVar;
                break;
            }
            View viewVt = this.yu.vt(i29);
            if (viewVt == null) {
                if (ouw(i29, flexItemCount, lhVar2)) {
                    ouw(arrayList, lhVar2, i29, i30);
                }
                i12 = i28;
                i13 = iLh;
                i14 = iYu;
            } else {
                i12 = i28;
                i13 = iLh;
                i14 = iYu;
                if (viewVt.getVisibility() == 8) {
                    lhVar2.bly++;
                    lhVar2.pno++;
                    if (ouw(i29, flexItemCount, lhVar2)) {
                        ouw(arrayList, lhVar2, i29, i30);
                    }
                } else {
                    if (viewVt instanceof CompoundButton) {
                        ouw((CompoundButton) viewVt);
                    }
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    if (vtVar.le() == 4) {
                        lhVar2.f6889jg.add(Integer.valueOf(i29));
                    }
                    int iOuw2 = ouw(vtVar, zOuw);
                    if (vtVar.ryl() != -1.0f && mode == 1073741824) {
                        iOuw2 = Math.round(vtVar.ryl() * size);
                    }
                    if (zOuw) {
                        i15 = mode;
                        int iOuw3 = this.yu.ouw(i27, i12 + lh(vtVar, f6892lh) + yu(vtVar, f6892lh), iOuw2);
                        i16 = size;
                        i17 = flexItemCount;
                        int iVt2 = this.yu.vt(i10, i13 + i14 + fkw(vtVar, f6892lh) + le(vtVar, f6892lh) + i30, vt(vtVar, f6892lh));
                        viewVt.measure(iOuw3, iVt2);
                        ouw(i29, iOuw3, iVt2, viewVt);
                        i19 = iOuw3;
                        i18 = 0;
                    } else {
                        i15 = mode;
                        i16 = size;
                        i17 = flexItemCount;
                        i18 = 0;
                        int iOuw4 = this.yu.ouw(i10, i13 + i14 + fkw(vtVar, false) + le(vtVar, false) + i30, vt(vtVar, false));
                        int iVt3 = this.yu.vt(i27, i12 + lh(vtVar, false) + yu(vtVar, false), iOuw2);
                        viewVt.measure(iOuw4, iVt3);
                        ouw(i29, iOuw4, iVt3, viewVt);
                        i19 = iVt3;
                    }
                    ouw(viewVt, i29);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewVt.getMeasuredState());
                    int i33 = lhVar2.fkw;
                    int iOuw5 = ouw(viewVt, zOuw) + lh(vtVar, zOuw) + yu(vtVar, zOuw);
                    int i34 = i30;
                    i20 = i12;
                    int i35 = i17;
                    lhVar = lhVar2;
                    boolean z10 = zOuw;
                    i21 = i29;
                    int i36 = i31;
                    i22 = i18;
                    mode = i15;
                    size = i16;
                    if (ouw(mode, size, i33, iOuw5, vtVar, i21, i36, arrayList.size())) {
                        if (lhVar.ouw() > 0) {
                            ouw(arrayList, lhVar, i21 > 0 ? i21 - 1 : i22, i34);
                            i30 = i34 + lhVar.ra;
                        } else {
                            i30 = i34;
                        }
                        if (z10) {
                            if (vtVar.vt() == -1) {
                                com.bytedance.adsdk.ugeno.fkw.ouw ouwVar3 = this.yu;
                                viewVt.measure(i19, ouwVar3.vt(i10, vtVar.rn() + vtVar.jg() + ouwVar3.getPaddingTop() + this.yu.getPaddingBottom() + i30, vtVar.vt()));
                                ouw(viewVt, i21);
                            }
                        } else if (vtVar.ouw() == -1) {
                            com.bytedance.adsdk.ugeno.fkw.ouw ouwVar4 = this.yu;
                            viewVt.measure(ouwVar4.ouw(i10, vtVar.ko() + vtVar.mwh() + ouwVar4.getPaddingLeft() + this.yu.getPaddingRight() + i30, vtVar.ouw()), i19);
                            ouw(viewVt, i21);
                        }
                        lh lhVar3 = new lh();
                        i23 = 1;
                        lhVar3.pno = 1;
                        lhVar3.fkw = i20;
                        lhVar3.ko = i21;
                        lhVar = lhVar3;
                        i25 = Integer.MIN_VALUE;
                        i24 = i22;
                    } else {
                        i23 = 1;
                        lhVar.pno++;
                        i24 = i36 + 1;
                        i30 = i34;
                        i25 = i32;
                    }
                    lhVar.zih = (lhVar.zih ? 1 : 0) | (vtVar.yu() != 0.0f ? i23 : i22);
                    boolean z11 = lhVar.vm;
                    if (vtVar.fkw() == 0.0f) {
                        i23 = i22;
                    }
                    lhVar.vm = i23 | (z11 ? 1 : 0);
                    int[] iArr = this.ouw;
                    if (iArr != null) {
                        iArr[i21] = arrayList.size();
                    }
                    z3 = z10;
                    lhVar.fkw = ouw(viewVt, z3) + lh(vtVar, z3) + yu(vtVar, z3) + lhVar.fkw;
                    lhVar.tlj = vtVar.yu() + lhVar.tlj;
                    lhVar.f6888cf = vtVar.fkw() + lhVar.f6888cf;
                    this.yu.ouw(i21, i24, lhVar);
                    int iMax = Math.max(i25, vt(viewVt, z3) + fkw(vtVar, z3) + le(vtVar, z3));
                    lhVar.ra = Math.max(lhVar.ra, iMax);
                    if (z3) {
                        if (this.yu.getFlexWrap() != 2) {
                            lhVar.ryl = Math.max(lhVar.ryl, vtVar.jg() + viewVt.getBaseline());
                        } else {
                            lhVar.ryl = Math.max(lhVar.ryl, vtVar.rn() + (viewVt.getMeasuredHeight() - viewVt.getBaseline()));
                        }
                    }
                    i26 = i35;
                    if (ouw(i21, i26, lhVar)) {
                        ouw(arrayList, lhVar, i21, i30);
                        i30 += lhVar.ra;
                    }
                    if (i30 > Integer.MAX_VALUE) {
                        ouwVar2 = ouwVar;
                        i11 = iCombineMeasuredStates;
                        break;
                    }
                    i32 = iMax;
                    i29 = i21 + 1;
                    flexItemCount = i26;
                    zOuw = z3;
                    lhVar2 = lhVar;
                    iLh = i13;
                    iYu = i14;
                    i27 = i4;
                    i31 = i24;
                    i28 = i20;
                }
            }
            lhVar = lhVar2;
            i21 = i29;
            z3 = zOuw;
            i24 = i31;
            i20 = i12;
            i22 = 0;
            i26 = flexItemCount;
            i29 = i21 + 1;
            flexItemCount = i26;
            zOuw = z3;
            lhVar2 = lhVar;
            iLh = i13;
            iYu = i14;
            i27 = i4;
            i31 = i24;
            i28 = i20;
        }
        ouwVar2.vt = i11;
    }

    private int vt(int i4, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i10) {
        com.bytedance.adsdk.ugeno.fkw.ouw ouwVar = this.yu;
        int iVt = ouwVar.vt(i4, vtVar.rn() + vtVar.jg() + ouwVar.getPaddingTop() + this.yu.getPaddingBottom() + i10, vtVar.vt());
        int size = View.MeasureSpec.getSize(iVt);
        if (size > vtVar.tlj()) {
            return View.MeasureSpec.makeMeasureSpec(vtVar.tlj(), View.MeasureSpec.getMode(iVt));
        }
        return size < vtVar.pno() ? View.MeasureSpec.makeMeasureSpec(vtVar.pno(), View.MeasureSpec.getMode(iVt)) : iVt;
    }

    private void vt(View view, int i4, int i10) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int iMin = Math.min(Math.max((i4 - vtVar.mwh()) - vtVar.ko(), vtVar.ra()), vtVar.bly());
        long[] jArr = this.f6893le;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i10] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        ouw(i10, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private static void ouw(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) compoundButton.getLayoutParams();
        int iRa = vtVar.ra();
        int iPno = vtVar.pno();
        Drawable drawableOuw = com.bytedance.adsdk.ugeno.ra.fkw.ouw(compoundButton);
        int minimumWidth = drawableOuw == null ? 0 : drawableOuw.getMinimumWidth();
        int minimumHeight = drawableOuw != null ? drawableOuw.getMinimumHeight() : 0;
        if (iRa == -1) {
            iRa = minimumWidth;
        }
        vtVar.ouw(iRa);
        if (iPno == -1) {
            iPno = minimumHeight;
        }
        vtVar.vt(iPno);
    }

    private int ouw(boolean z3) {
        if (z3) {
            return this.yu.getPaddingStart();
        }
        return this.yu.getPaddingTop();
    }

    private static int ouw(View view, boolean z3) {
        if (z3) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static int ouw(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z3) {
        if (z3) {
            return vtVar.ouw();
        }
        return vtVar.vt();
    }

    private boolean ouw(int i4, int i10, int i11, int i12, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i13, int i14, int i15) {
        if (this.yu.getFlexWrap() == 0) {
            return false;
        }
        if (vtVar.cf()) {
            return f6892lh;
        }
        if (i4 == 0) {
            return false;
        }
        int maxLine = this.yu.getMaxLine();
        if (maxLine != -1 && maxLine <= i15 + 1) {
            return false;
        }
        int iOuw = this.yu.ouw(i13, i14);
        if (iOuw > 0) {
            i12 += iOuw;
        }
        if (i10 < i11 + i12) {
            return f6892lh;
        }
        return false;
    }

    private static boolean ouw(int i4, int i10, lh lhVar) {
        if (i4 != i10 - 1 || lhVar.ouw() == 0) {
            return false;
        }
        return f6892lh;
    }

    private void ouw(List<lh> list, lh lhVar, int i4, int i10) {
        lhVar.mwh = i10;
        this.yu.ouw(lhVar);
        lhVar.rn = i4;
        list.add(lhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.fkw.vt r0 = (com.bytedance.adsdk.ugeno.fkw.vt) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.ra()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.ra()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.bly()
            if (r1 <= r3) goto L26
            int r1 = r0.bly()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.pno()
            if (r2 >= r5) goto L32
            int r2 = r0.pno()
            goto L3e
        L32:
            int r5 = r0.tlj()
            if (r2 <= r5) goto L3d
            int r2 = r0.tlj()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.ouw(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.fkw.yu.ouw(android.view.View, int):void");
    }

    private void ouw(int i4, int i10, lh lhVar, int i11, int i12, boolean z3) {
        int i13;
        float f10;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        int iMax;
        double d10;
        boolean z12;
        boolean z13;
        View view;
        boolean z14;
        double d11;
        boolean z15;
        boolean z16 = z3;
        while (true) {
            float f11 = lhVar.tlj;
            float f12 = 0.0f;
            if (f11 <= 0.0f || i11 < (i13 = lhVar.fkw)) {
                return;
            }
            float f13 = (i11 - i13) / f11;
            lhVar.fkw = i12 + lhVar.f6890le;
            if (!z16) {
                lhVar.ra = LinearLayoutManager.INVALID_OFFSET;
            }
            int i16 = 0;
            boolean z17 = false;
            int i17 = 0;
            float f14 = 0.0f;
            while (i16 < lhVar.pno) {
                int i18 = lhVar.ko + i16;
                View viewVt = this.yu.vt(i18);
                if (viewVt == null || viewVt.getVisibility() == 8) {
                    f10 = f12;
                    i14 = i13;
                    i15 = i16;
                    z10 = z17;
                } else {
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    int flexDirection = this.yu.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = viewVt.getMeasuredHeight();
                        f10 = f12;
                        long[] jArr = this.f6893le;
                        if (jArr != null) {
                            long j = jArr[i18];
                            z13 = true;
                            view = viewVt;
                            measuredHeight = (int) (j >> 32);
                        } else {
                            z13 = true;
                            view = viewVt;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        long[] jArr2 = this.f6893le;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i18];
                        }
                        if (this.fkw[i18] || vtVar.yu() <= f10) {
                            z14 = z17;
                        } else {
                            float fYu = (vtVar.yu() * f13) + measuredHeight;
                            if (i16 == lhVar.pno - (z13 ? 1 : 0)) {
                                fYu += f14;
                                f14 = f10;
                            }
                            int iRound = Math.round(fYu);
                            if (iRound > vtVar.tlj()) {
                                iRound = vtVar.tlj();
                                this.fkw[i18] = z13;
                                lhVar.tlj -= vtVar.yu();
                                z15 = z13 ? 1 : 0;
                            } else {
                                float f15 = (fYu - iRound) + f14;
                                boolean z18 = z17;
                                double d12 = f15;
                                if (d12 > 1.0d) {
                                    iRound++;
                                    d11 = d12 - 1.0d;
                                } else if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                } else {
                                    f14 = f15;
                                    z15 = z18;
                                }
                                f14 = (float) d11;
                                z15 = z18;
                            }
                            int iOuw = ouw(i4, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            View view2 = view;
                            view2.measure(iOuw, iMakeMeasureSpec);
                            int measuredWidth2 = view2.getMeasuredWidth();
                            int measuredHeight2 = view2.getMeasuredHeight();
                            ouw(i18, iOuw, iMakeMeasureSpec, view2);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                            z14 = z15;
                        }
                        iMax = Math.max(i17, vtVar.ko() + vtVar.mwh() + measuredWidth);
                        lhVar.fkw = vtVar.rn() + vtVar.jg() + measuredHeight + lhVar.fkw;
                        i14 = i13;
                        i15 = i16;
                        z10 = z14;
                    } else {
                        boolean z19 = z17;
                        f10 = f12;
                        int measuredWidth3 = viewVt.getMeasuredWidth();
                        long[] jArr3 = this.f6893le;
                        i14 = i13;
                        if (jArr3 != null) {
                            measuredWidth3 = (int) jArr3[i18];
                        }
                        int measuredHeight3 = viewVt.getMeasuredHeight();
                        long[] jArr4 = this.f6893le;
                        if (jArr4 != null) {
                            measuredHeight3 = (int) (jArr4[i18] >> 32);
                        }
                        if (this.fkw[i18] || vtVar.yu() <= f10) {
                            i15 = i16;
                            z11 = z19;
                        } else {
                            float fYu2 = (vtVar.yu() * f13) + measuredWidth3;
                            if (i16 == lhVar.pno - 1) {
                                fYu2 += f14;
                                f14 = f10;
                            }
                            int iRound2 = Math.round(fYu2);
                            if (iRound2 > vtVar.bly()) {
                                iRound2 = vtVar.bly();
                                this.fkw[i18] = f6892lh;
                                lhVar.tlj -= vtVar.yu();
                                i15 = i16;
                                z12 = true;
                            } else {
                                float f16 = (fYu2 - iRound2) + f14;
                                i15 = i16;
                                double d13 = f16;
                                if (d13 > 1.0d) {
                                    iRound2++;
                                    d10 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                } else {
                                    f14 = f16;
                                    z12 = z19;
                                }
                                f14 = (float) d10;
                                z12 = z19;
                            }
                            int iVt = vt(i10, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewVt.measure(iMakeMeasureSpec2, iVt);
                            int measuredWidth4 = viewVt.getMeasuredWidth();
                            int measuredHeight4 = viewVt.getMeasuredHeight();
                            ouw(i18, iMakeMeasureSpec2, iVt, viewVt);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                            z11 = z12;
                        }
                        iMax = Math.max(i17, vtVar.rn() + vtVar.jg() + measuredHeight3);
                        lhVar.fkw = vtVar.ko() + vtVar.mwh() + measuredWidth3 + lhVar.fkw;
                        z10 = z11;
                    }
                    lhVar.ra = Math.max(lhVar.ra, iMax);
                    i17 = iMax;
                }
                f12 = f10;
                i16 = i15 + 1;
                i13 = i14;
                z17 = z10;
            }
            int i19 = i13;
            if (!z17 || i19 == lhVar.fkw) {
                return;
            } else {
                z16 = true;
            }
        }
    }

    private int ouw(int i4, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i10) {
        com.bytedance.adsdk.ugeno.fkw.ouw ouwVar = this.yu;
        int iOuw = ouwVar.ouw(i4, vtVar.ko() + vtVar.mwh() + ouwVar.getPaddingLeft() + this.yu.getPaddingRight() + i10, vtVar.ouw());
        int size = View.MeasureSpec.getSize(iOuw);
        if (size > vtVar.bly()) {
            return View.MeasureSpec.makeMeasureSpec(vtVar.bly(), View.MeasureSpec.getMode(iOuw));
        }
        return size < vtVar.ra() ? View.MeasureSpec.makeMeasureSpec(vtVar.ra(), View.MeasureSpec.getMode(iOuw)) : iOuw;
    }

    public final void ouw(int i4, int i10, int i11) {
        int mode;
        int size;
        int flexDirection = this.yu.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i4);
            size = View.MeasureSpec.getSize(i4);
        } else {
            int mode2 = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i10);
            mode = mode2;
            size = size2;
        }
        List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.yu.getSumOfCrossSize() + i11;
            int i12 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).ra = size - i11;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.yu.getAlignContent();
                if (alignContent == 1) {
                    int i13 = size - sumOfCrossSize;
                    lh lhVar = new lh();
                    lhVar.ra = i13;
                    flexLinesInternal.add(0, lhVar);
                    return;
                }
                if (alignContent == 2) {
                    this.yu.setFlexLines(ouw(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i12 < size4) {
                            arrayList.add(flexLinesInternal.get(i12));
                            if (i12 != flexLinesInternal.size() - 1) {
                                lh lhVar2 = new lh();
                                if (i12 == flexLinesInternal.size() - 2) {
                                    lhVar2.ra = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    lhVar2.ra = Math.round(size3);
                                }
                                int i14 = lhVar2.ra;
                                float f11 = (size3 - i14) + f10;
                                if (f11 > 1.0f) {
                                    lhVar2.ra = i14 + 1;
                                    f11 -= 1.0f;
                                } else if (f11 < -1.0f) {
                                    lhVar2.ra = i14 - 1;
                                    f11 += 1.0f;
                                }
                                f10 = f11;
                                arrayList.add(lhVar2);
                            }
                            i12++;
                        }
                        this.yu.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.yu.setFlexLines(ouw(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    lh lhVar3 = new lh();
                    lhVar3.ra = size5;
                    for (lh lhVar4 : flexLinesInternal) {
                        arrayList2.add(lhVar3);
                        arrayList2.add(lhVar4);
                        arrayList2.add(lhVar3);
                    }
                    this.yu.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i12 < size7) {
                        lh lhVar5 = flexLinesInternal.get(i12);
                        float f13 = lhVar5.ra + size6;
                        if (i12 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(f13);
                        float f14 = (f13 - iRound) + f12;
                        if (f14 > 1.0f) {
                            iRound++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            iRound--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        lhVar5.ra = iRound;
                        i12++;
                    }
                }
            }
        }
    }

    private static List<lh> ouw(List<lh> list, int i4, int i10) {
        int i11 = (i4 - i10) / 2;
        ArrayList arrayList = new ArrayList();
        lh lhVar = new lh();
        lhVar.ra = i11;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(lhVar);
            }
            arrayList.add(list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(lhVar);
            }
        }
        return arrayList;
    }

    private void ouw(View view, int i4, int i10) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int iMin = Math.min(Math.max((i4 - vtVar.jg()) - vtVar.rn(), vtVar.pno()), vtVar.tlj());
        long[] jArr = this.f6893le;
        if (jArr != null) {
            measuredWidth = (int) jArr[i10];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ouw(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public final void ouw(View view, lh lhVar, int i4, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int alignItems = this.yu.getAlignItems();
        if (vtVar.le() != -1) {
            alignItems = vtVar.le();
        }
        int i13 = lhVar.ra;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.yu.getFlexWrap() != 2) {
                    int i14 = i10 + i13;
                    view.layout(i4, (i14 - view.getMeasuredHeight()) - vtVar.rn(), i11, i14 - vtVar.rn());
                    return;
                }
                view.layout(i4, vtVar.jg() + view.getMeasuredHeight() + (i10 - i13), i11, vtVar.jg() + view.getMeasuredHeight() + (i12 - i13));
                return;
            }
            if (alignItems == 2) {
                int iJg = ((vtVar.jg() + (i13 - view.getMeasuredHeight())) - vtVar.rn()) / 2;
                if (this.yu.getFlexWrap() != 2) {
                    int i15 = i10 + iJg;
                    view.layout(i4, i15, i11, view.getMeasuredHeight() + i15);
                    return;
                } else {
                    int i16 = i10 - iJg;
                    view.layout(i4, i16, i11, view.getMeasuredHeight() + i16);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.yu.getFlexWrap() != 2) {
                    int iMax = Math.max(lhVar.ryl - view.getBaseline(), vtVar.jg());
                    view.layout(i4, i10 + iMax, i11, i12 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (lhVar.ryl - view.getMeasuredHeight()), vtVar.rn());
                    view.layout(i4, i10 - iMax2, i11, i12 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.yu.getFlexWrap() != 2) {
            view.layout(i4, vtVar.jg() + i10, i11, vtVar.jg() + i12);
        } else {
            view.layout(i4, i10 - vtVar.rn(), i11, i12 - vtVar.rn());
        }
    }

    public final void ouw(View view, lh lhVar, boolean z3, int i4, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int alignItems = this.yu.getAlignItems();
        if (vtVar.le() != -1) {
            alignItems = vtVar.le();
        }
        int i13 = lhVar.ra;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z3) {
                    view.layout(((i4 + i13) - view.getMeasuredWidth()) - vtVar.ko(), i10, ((i11 + i13) - view.getMeasuredWidth()) - vtVar.ko(), i12);
                    return;
                }
                view.layout(vtVar.mwh() + view.getMeasuredWidth() + (i4 - i13), i10, vtVar.mwh() + view.getMeasuredWidth() + (i11 - i13), i12);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i13 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (!z3) {
                    view.layout(i4 + marginStart, i10, i11 + marginStart, i12);
                    return;
                } else {
                    view.layout(i4 - marginStart, i10, i11 - marginStart, i12);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z3) {
            view.layout(vtVar.mwh() + i4, i10, vtVar.mwh() + i11, i12);
        } else {
            view.layout(i4 - vtVar.ko(), i10, i11 - vtVar.ko(), i12);
        }
    }

    private void ouw(int i4, int i10, int i11, View view) {
        long[] jArr = this.vt;
        if (jArr != null) {
            jArr[i4] = vt(i10, i11);
        }
        long[] jArr2 = this.f6893le;
        if (jArr2 != null) {
            jArr2[i4] = vt(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void ouw(int i4, int i10) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i11;
        int i12;
        int flexItemCount = this.yu.getFlexItemCount();
        boolean[] zArr = this.fkw;
        if (zArr == null) {
            this.fkw = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.fkw = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (this.yu.getFlexItemCount() > 0) {
            int flexDirection = this.yu.getFlexDirection();
            int flexDirection2 = this.yu.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i4);
                size = View.MeasureSpec.getSize(i4);
                int largestMainSize = this.yu.getLargestMainSize();
                if (mode != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                paddingLeft = this.yu.getPaddingLeft();
                paddingRight = this.yu.getPaddingRight();
            } else {
                if (flexDirection2 != 2 && flexDirection2 != 3) {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
                int mode2 = View.MeasureSpec.getMode(i10);
                size = View.MeasureSpec.getSize(i10);
                if (mode2 != 1073741824) {
                    size = this.yu.getLargestMainSize();
                }
                paddingLeft = this.yu.getPaddingTop();
                paddingRight = this.yu.getPaddingBottom();
            }
            int i13 = paddingLeft + paddingRight;
            int i14 = size;
            int[] iArr = this.ouw;
            int i15 = iArr != null ? iArr[0] : 0;
            List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i15 < size2) {
                lh lhVar = flexLinesInternal.get(i15);
                int i16 = lhVar.fkw;
                if (i16 < i14 && lhVar.zih) {
                    i11 = i4;
                    i12 = i10;
                    ouw(i11, i12, lhVar, i14, i13, false);
                } else {
                    i11 = i4;
                    i12 = i10;
                    if (i16 > i14 && lhVar.vm) {
                        vt(i11, i12, lhVar, i14, i13, false);
                    }
                }
                i15++;
                i4 = i11;
                i10 = i12;
            }
        }
    }

    public final void ouw() {
        View viewVt;
        if (this.yu.getFlexItemCount() > 0) {
            int flexDirection = this.yu.getFlexDirection();
            if (this.yu.getAlignItems() == 4) {
                int[] iArr = this.ouw;
                int i4 = 0;
                int i10 = iArr != null ? iArr[0] : 0;
                List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i10 < size) {
                    lh lhVar = flexLinesInternal.get(i10);
                    int i11 = lhVar.pno;
                    for (int i12 = i4; i12 < i11; i12++) {
                        int i13 = lhVar.ko + i12;
                        if (i12 < this.yu.getFlexItemCount() && (viewVt = this.yu.vt(i13)) != null && viewVt.getVisibility() != 8) {
                            com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                            if (vtVar.le() == -1 || vtVar.le() == 4) {
                                if (flexDirection != 0 && flexDirection != 1) {
                                    if (flexDirection != 2 && flexDirection != 3) {
                                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                    }
                                    vt(viewVt, lhVar.ra, i13);
                                } else {
                                    ouw(viewVt, lhVar.ra, i13);
                                }
                            }
                        }
                    }
                    i10++;
                    i4 = 0;
                }
                return;
            }
            for (lh lhVar2 : this.yu.getFlexLinesInternal()) {
                for (Integer num : lhVar2.f6889jg) {
                    View viewVt2 = this.yu.vt(num.intValue());
                    if (flexDirection != 0 && flexDirection != 1) {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                        }
                        vt(viewVt2, lhVar2.ra, num.intValue());
                    } else {
                        ouw(viewVt2, lhVar2.ra, num.intValue());
                    }
                }
            }
        }
    }
}
