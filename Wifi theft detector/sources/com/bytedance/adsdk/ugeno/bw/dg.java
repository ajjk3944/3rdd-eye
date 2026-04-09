package com.bytedance.adsdk.ugeno.bw;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class dg {
    static final /* synthetic */ boolean xq = true;
    private boolean[] bw;
    private final com.bytedance.adsdk.ugeno.bw.emc dg;
    int[] emc;
    private long[] ycc;
    long[] ypw;

    public static class emc {
        List<xq> emc;
        int ypw;

        public void emc() {
            this.emc = null;
            this.ypw = 0;
        }
    }

    public static class ypw implements Comparable<ypw> {
        int emc;
        int ypw;

        private ypw() {
        }

        @Override // java.lang.Comparable
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public int compareTo(ypw ypwVar) {
            int i10 = this.ypw;
            int i11 = ypwVar.ypw;
            return i10 != i11 ? i10 - i11 : this.emc - ypwVar.emc;
        }

        public String toString() {
            return "Order{order=" + this.ypw + ", index=" + this.emc + '}';
        }
    }

    public dg(com.bytedance.adsdk.ugeno.bw.emc emcVar) {
        this.dg = emcVar;
    }

    private int bw(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z10) {
        return z10 ? ypwVar.qh() : ypwVar.sz();
    }

    private int dg(boolean z10) {
        return z10 ? this.dg.getPaddingBottom() : this.dg.getPaddingEnd();
    }

    private int xq(boolean z10) {
        return z10 ? this.dg.getPaddingTop() : this.dg.getPaddingStart();
    }

    private int ycc(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z10) {
        return z10 ? ypwVar.vk() : ypwVar.cf();
    }

    public int emc(long j10) {
        return (int) j10;
    }

    public int ypw(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] emc(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.dg.getFlexItemCount();
        List<ypw> listYpw = ypw(flexItemCount);
        ypw ypwVar = new ypw();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.bw.ypw)) {
            ypwVar.ypw = 1;
        } else {
            ypwVar.ypw = ((com.bytedance.adsdk.ugeno.bw.ypw) layoutParams).xq();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.dg.getFlexItemCount()) {
            ypwVar.emc = flexItemCount;
        } else {
            ypwVar.emc = i10;
            while (i10 < flexItemCount) {
                listYpw.get(i10).emc++;
                i10++;
            }
        }
        listYpw.add(ypwVar);
        return emc(flexItemCount + 1, listYpw, sparseIntArray);
    }

    public long ypw(int i10, int i11) {
        return (i10 & 4294967295L) | (i11 << 32);
    }

    private int dg(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z10) {
        if (z10) {
            return ypwVar.cf();
        }
        return ypwVar.vk();
    }

    private int xq(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z10) {
        if (z10) {
            return ypwVar.sz();
        }
        return ypwVar.qh();
    }

    private List<ypw> ypw(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) this.dg.emc(i11).getLayoutParams();
            ypw ypwVar2 = new ypw();
            ypwVar2.ypw = ypwVar.xq();
            ypwVar2.emc = i11;
            arrayList.add(ypwVar2);
        }
        return arrayList;
    }

    private void xq(int i10) {
        boolean[] zArr = this.bw;
        if (zArr == null) {
            this.bw = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.bw = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean ypw(SparseIntArray sparseIntArray) {
        int flexItemCount = this.dg.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewEmc = this.dg.emc(i10);
            if (viewEmc != null && ((com.bytedance.adsdk.ugeno.bw.ypw) viewEmc.getLayoutParams()).xq() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public void ypw(emc emcVar, int i10, int i11) {
        emc(emcVar, i11, i10, Integer.MAX_VALUE, 0, -1, (List<xq>) null);
    }

    private int ypw(boolean z10) {
        if (z10) {
            return this.dg.getPaddingEnd();
        }
        return this.dg.getPaddingBottom();
    }

    public int[] emc(SparseIntArray sparseIntArray) {
        int flexItemCount = this.dg.getFlexItemCount();
        return emc(flexItemCount, ypw(flexItemCount), sparseIntArray);
    }

    private int ypw(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] emc(int i10, List<ypw> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (ypw ypwVar : list) {
            int i12 = ypwVar.emc;
            iArr[i11] = i12;
            sparseIntArray.append(i12, ypwVar.ypw);
            i11++;
        }
        return iArr;
    }

    private int ypw(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z10) {
        if (z10) {
            return ypwVar.ypw();
        }
        return ypwVar.emc();
    }

    private void ypw(int i10, int i11, xq xqVar, int i12, int i13, boolean z10) {
        float f10;
        float f11;
        int iMax;
        int iUym;
        int i14 = xqVar.bw;
        float f12 = xqVar.gbl;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 > i14) {
            return;
        }
        float f14 = (i14 - i12) / f12;
        xqVar.bw = i13 + xqVar.ycc;
        if (!z10) {
            xqVar.uym = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < xqVar.msw) {
            int i17 = xqVar.cf + i15;
            View viewYpw = this.dg.ypw(i17);
            if (viewYpw == null || viewYpw.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) viewYpw.getLayoutParams();
                int flexDirection = this.dg.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewYpw.getMeasuredHeight();
                    long[] jArr = this.ycc;
                    if (jArr != null) {
                        measuredHeight = ypw(jArr[i17]);
                    }
                    int measuredWidth = viewYpw.getMeasuredWidth();
                    long[] jArr2 = this.ycc;
                    if (jArr2 != null) {
                        measuredWidth = emc(jArr2[i17]);
                    }
                    if (!this.bw[i17] && ypwVar.bw() > f10) {
                        float fBw = measuredHeight - (ypwVar.bw() * f14);
                        if (i15 == xqVar.msw - 1) {
                            fBw += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fBw);
                        if (iRound < ypwVar.msw()) {
                            iRound = ypwVar.msw();
                            this.bw[i17] = true;
                            xqVar.gbl -= ypwVar.bw();
                            z11 = true;
                        } else {
                            f15 += fBw - iRound;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                iRound++;
                                f15 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound--;
                                f15 += 1.0f;
                            }
                        }
                        int iEmc = emc(i10, ypwVar, xqVar.sz);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewYpw.measure(iEmc, iMakeMeasureSpec);
                        int measuredWidth2 = viewYpw.getMeasuredWidth();
                        int measuredHeight2 = viewYpw.getMeasuredHeight();
                        emc(i17, iEmc, iMakeMeasureSpec, viewYpw);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + ypwVar.sz() + ypwVar.cf() + this.dg.emc(viewYpw));
                    xqVar.bw += measuredHeight + ypwVar.qh() + ypwVar.vk();
                    f11 = f14;
                } else {
                    int measuredWidth3 = viewYpw.getMeasuredWidth();
                    long[] jArr3 = this.ycc;
                    if (jArr3 != null) {
                        measuredWidth3 = emc(jArr3[i17]);
                    }
                    int measuredHeight3 = viewYpw.getMeasuredHeight();
                    long[] jArr4 = this.ycc;
                    f11 = f14;
                    if (jArr4 != null) {
                        measuredHeight3 = ypw(jArr4[i17]);
                    }
                    if (!this.bw[i17] && ypwVar.bw() > f10) {
                        float fBw2 = measuredWidth3 - (f11 * ypwVar.bw());
                        if (i15 == xqVar.msw - 1) {
                            fBw2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fBw2);
                        if (iRound2 < ypwVar.uym()) {
                            iUym = ypwVar.uym();
                            this.bw[i17] = true;
                            xqVar.gbl -= ypwVar.bw();
                            z11 = true;
                        } else {
                            f15 += fBw2 - iRound2;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                iUym = iRound2 + 1;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iUym = iRound2 - 1;
                                f15 += 1.0f;
                            } else {
                                iUym = iRound2;
                            }
                        }
                        int iYpw = ypw(i11, ypwVar, xqVar.sz);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iUym, 1073741824);
                        viewYpw.measure(iMakeMeasureSpec2, iYpw);
                        int measuredWidth4 = viewYpw.getMeasuredWidth();
                        int measuredHeight4 = viewYpw.getMeasuredHeight();
                        emc(i17, iMakeMeasureSpec2, iYpw, viewYpw);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + ypwVar.qh() + ypwVar.vk() + this.dg.emc(viewYpw));
                    xqVar.bw += measuredWidth3 + ypwVar.sz() + ypwVar.cf();
                    iMax = iMax2;
                }
                xqVar.uym = Math.max(xqVar.uym, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == xqVar.bw) {
            return;
        }
        ypw(i10, i11, xqVar, i12, i13, true);
    }

    public void emc(emc emcVar, int i10, int i11) {
        emc(emcVar, i10, i11, Integer.MAX_VALUE, 0, -1, (List<xq>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void emc(emc emcVar, int i10, int i11, int i12, int i13, int i14, List<xq> list) {
        int i15;
        emc emcVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iEmc;
        int i21;
        int i22;
        int i23;
        xq xqVar;
        int i24;
        int i25;
        boolean z10;
        int i26;
        boolean z11;
        int i27;
        int i28 = i10;
        boolean zEmc = this.dg.emc();
        int mode = View.MeasureSpec.getMode(i28);
        int size = View.MeasureSpec.getSize(i28);
        List<xq> arrayList = list == null ? new ArrayList() : list;
        emcVar.emc = arrayList;
        boolean z12 = i14 == -1;
        int iEmc2 = emc(zEmc);
        int iYpw = ypw(zEmc);
        int iXq = xq(zEmc);
        int iDg = dg(zEmc);
        xq xqVar2 = new xq();
        int i29 = i13;
        xqVar2.cf = i29;
        int i30 = iEmc2 + iYpw;
        xqVar2.bw = i30;
        int flexItemCount = this.dg.getFlexItemCount();
        boolean z13 = z12;
        xq xqVar3 = xqVar2;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int iCombineMeasuredStates = 0;
        int i33 = 0;
        while (true) {
            if (i29 >= flexItemCount) {
                i15 = iCombineMeasuredStates;
                emcVar2 = emcVar;
                break;
            }
            View viewYpw = this.dg.ypw(i29);
            if (viewYpw == null) {
                if (emc(i29, flexItemCount, xqVar3)) {
                    emc(arrayList, xqVar3, i29, i32);
                }
                i16 = i30;
            } else {
                i16 = i30;
                if (viewYpw.getVisibility() == 8) {
                    xqVar3.zz++;
                    xqVar3.msw++;
                    if (emc(i29, flexItemCount, xqVar3)) {
                        emc(arrayList, xqVar3, i29, i32);
                    }
                } else {
                    if (viewYpw instanceof CompoundButton) {
                        emc((CompoundButton) viewYpw);
                    }
                    com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) viewYpw.getLayoutParams();
                    int i34 = flexItemCount;
                    if (ypwVar.ycc() == 4) {
                        xqVar3.qh.add(Integer.valueOf(i29));
                    }
                    int iEmc3 = emc(ypwVar, zEmc);
                    if (ypwVar.sup() != -1.0f && mode == 1073741824) {
                        iEmc3 = Math.round(size * ypwVar.sup());
                    }
                    if (zEmc) {
                        i18 = mode;
                        iEmc = this.dg.emc(i28, i16 + xq(ypwVar, true) + dg(ypwVar, true), iEmc3);
                        i17 = size;
                        i19 = i32;
                        int iYpw2 = this.dg.ypw(i11, iXq + iDg + bw(ypwVar, true) + ycc(ypwVar, true) + i32, ypw(ypwVar, true));
                        viewYpw.measure(iEmc, iYpw2);
                        emc(i29, iEmc, iYpw2, viewYpw);
                        i20 = 0;
                    } else {
                        i17 = size;
                        i18 = mode;
                        i19 = i32;
                        i20 = 0;
                        int iEmc4 = this.dg.emc(i11, iXq + iDg + bw(ypwVar, false) + ycc(ypwVar, false) + i19, ypw(ypwVar, false));
                        int iYpw3 = this.dg.ypw(i28, i16 + xq(ypwVar, false) + dg(ypwVar, false), iEmc3);
                        viewYpw.measure(iEmc4, iYpw3);
                        emc(i29, iEmc4, iYpw3, viewYpw);
                        iEmc = iYpw3;
                    }
                    emc(viewYpw, i29);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewYpw.getMeasuredState());
                    int i35 = i20;
                    i21 = i29;
                    int i36 = iEmc;
                    xq xqVar4 = xqVar3;
                    int i37 = i33;
                    i22 = i16;
                    i23 = i19;
                    boolean z14 = zEmc;
                    size = i17;
                    if (emc(viewYpw, i18, size, xqVar3.bw, emc(viewYpw, zEmc) + xq(ypwVar, zEmc) + dg(ypwVar, zEmc), ypwVar, i21, i37, arrayList.size())) {
                        if (xqVar4.ypw() > 0) {
                            emc(arrayList, xqVar4, i21 > 0 ? i21 - 1 : i35, i23);
                            i27 = i23 + xqVar4.uym;
                        } else {
                            i27 = i23;
                        }
                        if (z14) {
                            if (ypwVar.ypw() == -1) {
                                com.bytedance.adsdk.ugeno.bw.emc emcVar3 = this.dg;
                                viewYpw.measure(i36, emcVar3.ypw(i11, emcVar3.getPaddingTop() + this.dg.getPaddingBottom() + ypwVar.qh() + ypwVar.vk() + i27, ypwVar.ypw()));
                                emc(viewYpw, i21);
                            }
                        } else if (ypwVar.emc() == -1) {
                            com.bytedance.adsdk.ugeno.bw.emc emcVar4 = this.dg;
                            viewYpw.measure(emcVar4.emc(i11, emcVar4.getPaddingLeft() + this.dg.getPaddingRight() + ypwVar.sz() + ypwVar.cf() + i27, ypwVar.emc()), i36);
                            emc(viewYpw, i21);
                        }
                        xq xqVar5 = new xq();
                        xqVar5.msw = 1;
                        xqVar5.bw = i22;
                        xqVar5.cf = i21;
                        i23 = i27;
                        i24 = i35;
                        xqVar = xqVar5;
                        i25 = Integer.MIN_VALUE;
                    } else {
                        xqVar = xqVar4;
                        xqVar.msw++;
                        i24 = i37 + 1;
                        i25 = i31;
                    }
                    xqVar.f9206aa = (xqVar.f9206aa ? 1 : 0) | (ypwVar.dg() != 0.0f ? 1 : i35);
                    xqVar.sba = (xqVar.sba ? 1 : 0) | (ypwVar.bw() != 0.0f ? 1 : i35);
                    int[] iArr = this.emc;
                    if (iArr != null) {
                        iArr[i21] = arrayList.size();
                    }
                    z10 = z14;
                    xqVar.bw += emc(viewYpw, z10) + xq(ypwVar, z10) + dg(ypwVar, z10);
                    xqVar.ru += ypwVar.dg();
                    xqVar.gbl += ypwVar.bw();
                    this.dg.emc(viewYpw, i21, i24, xqVar);
                    int iMax = Math.max(i25, ypw(viewYpw, z10) + bw(ypwVar, z10) + ycc(ypwVar, z10) + this.dg.emc(viewYpw));
                    xqVar.uym = Math.max(xqVar.uym, iMax);
                    if (z10) {
                        if (this.dg.getFlexWrap() != 2) {
                            xqVar.sup = Math.max(xqVar.sup, viewYpw.getBaseline() + ypwVar.qh());
                        } else {
                            xqVar.sup = Math.max(xqVar.sup, (viewYpw.getMeasuredHeight() - viewYpw.getBaseline()) + ypwVar.vk());
                        }
                    }
                    i26 = i34;
                    if (emc(i21, i26, xqVar)) {
                        emc(arrayList, xqVar, i21, i23);
                        i23 += xqVar.uym;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).vk >= i14 && i21 >= i14 && !z13) {
                            i23 = -xqVar.emc();
                            z11 = true;
                        }
                        if (i23 <= i12 && z11) {
                            emcVar2 = emcVar;
                            i15 = iCombineMeasuredStates;
                            break;
                        }
                        i31 = iMax;
                        z13 = z11;
                        i33 = i24;
                        int i38 = i21 + 1;
                        zEmc = z10;
                        xqVar3 = xqVar;
                        i30 = i22;
                        i32 = i23;
                        i28 = i10;
                        flexItemCount = i26;
                        i29 = i38;
                        mode = i18;
                    }
                    z11 = z13;
                    if (i23 <= i12) {
                    }
                    i31 = iMax;
                    z13 = z11;
                    i33 = i24;
                    int i382 = i21 + 1;
                    zEmc = z10;
                    xqVar3 = xqVar;
                    i30 = i22;
                    i32 = i23;
                    i28 = i10;
                    flexItemCount = i26;
                    i29 = i382;
                    mode = i18;
                }
            }
            i21 = i29;
            i18 = mode;
            i26 = flexItemCount;
            i23 = i32;
            z10 = zEmc;
            i22 = i16;
            xqVar = xqVar3;
            int i3822 = i21 + 1;
            zEmc = z10;
            xqVar3 = xqVar;
            i30 = i22;
            i32 = i23;
            i28 = i10;
            flexItemCount = i26;
            i29 = i3822;
            mode = i18;
        }
        emcVar2.ypw = i15;
    }

    private int ypw(int i10, com.bytedance.adsdk.ugeno.bw.ypw ypwVar, int i11) {
        com.bytedance.adsdk.ugeno.bw.emc emcVar = this.dg;
        int iYpw = emcVar.ypw(i10, emcVar.getPaddingTop() + this.dg.getPaddingBottom() + ypwVar.qh() + ypwVar.vk() + i11, ypwVar.ypw());
        int size = View.MeasureSpec.getSize(iYpw);
        if (size > ypwVar.ru()) {
            return View.MeasureSpec.makeMeasureSpec(ypwVar.ru(), View.MeasureSpec.getMode(iYpw));
        }
        return size < ypwVar.msw() ? View.MeasureSpec.makeMeasureSpec(ypwVar.msw(), View.MeasureSpec.getMode(iYpw)) : iYpw;
    }

    public void ypw(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.dg.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        }
        List<xq> flexLinesInternal = this.dg.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.dg.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).uym = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.dg.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    xq xqVar = new xq();
                    xqVar.uym = i14;
                    flexLinesInternal.add(0, xqVar);
                    return;
                }
                if (alignContent == 2) {
                    this.dg.setFlexLines(emc(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                xq xqVar2 = new xq();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    xqVar2.uym = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    xqVar2.uym = Math.round(size3);
                                }
                                int i15 = xqVar2.uym;
                                f10 += size3 - i15;
                                if (f10 > 1.0f) {
                                    xqVar2.uym = i15 + 1;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    xqVar2.uym = i15 - 1;
                                    f10 += 1.0f;
                                }
                                arrayList.add(xqVar2);
                            }
                            i13++;
                        }
                        this.dg.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.dg.setFlexLines(emc(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    xq xqVar3 = new xq();
                    xqVar3.uym = size5;
                    for (xq xqVar4 : flexLinesInternal) {
                        arrayList2.add(xqVar3);
                        arrayList2.add(xqVar4);
                        arrayList2.add(xqVar3);
                    }
                    this.dg.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        xq xqVar5 = flexLinesInternal.get(i13);
                        float f12 = xqVar5.uym + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        xqVar5.uym = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    private void emc(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) compoundButton.getLayoutParams();
        int iUym = ypwVar.uym();
        int iMsw = ypwVar.msw();
        Drawable drawableEmc = com.bytedance.adsdk.ugeno.uym.bw.emc(compoundButton);
        int minimumWidth = drawableEmc == null ? 0 : drawableEmc.getMinimumWidth();
        int minimumHeight = drawableEmc != null ? drawableEmc.getMinimumHeight() : 0;
        if (iUym == -1) {
            iUym = minimumWidth;
        }
        ypwVar.emc(iUym);
        if (iMsw == -1) {
            iMsw = minimumHeight;
        }
        ypwVar.ypw(iMsw);
    }

    private int emc(boolean z10) {
        if (z10) {
            return this.dg.getPaddingStart();
        }
        return this.dg.getPaddingTop();
    }

    private int emc(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void ypw(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - ypwVar.sz()) - ypwVar.cf()) - this.dg.emc(view), ypwVar.uym()), ypwVar.zz());
        long[] jArr = this.ycc;
        if (jArr != null) {
            measuredHeight = ypw(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        emc(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int emc(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z10) {
        if (z10) {
            return ypwVar.emc();
        }
        return ypwVar.ypw();
    }

    private boolean emc(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.bw.ypw ypwVar, int i14, int i15, int i16) {
        if (this.dg.getFlexWrap() == 0) {
            return false;
        }
        if (ypwVar.gbl()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.dg.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iEmc = this.dg.emc(view, i14, i15);
        if (iEmc > 0) {
            i13 += iEmc;
        }
        return i11 < i12 + i13;
    }

    private boolean emc(int i10, int i11, xq xqVar) {
        return i10 == i11 - 1 && xqVar.ypw() != 0;
    }

    private void emc(List<xq> list, xq xqVar, int i10, int i11) {
        xqVar.sz = i11;
        this.dg.emc(xqVar);
        xqVar.vk = i10;
        list.add(xqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.bw.ypw r0 = (com.bytedance.adsdk.ugeno.bw.ypw) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.uym()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.uym()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.zz()
            if (r1 <= r3) goto L26
            int r1 = r0.zz()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.msw()
            if (r2 >= r5) goto L32
            int r2 = r0.msw()
            goto L3e
        L32:
            int r5 = r0.ru()
            if (r2 <= r5) goto L3d
            int r2 = r0.ru()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.emc(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bw.dg.emc(android.view.View, int):void");
    }

    public void emc(int i10, int i11) {
        emc(i10, i11, 0);
    }

    public void emc(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        xq(this.dg.getFlexItemCount());
        if (i12 >= this.dg.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.dg.getFlexDirection();
        int flexDirection2 = this.dg.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.dg.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.dg.getPaddingLeft();
            paddingRight = this.dg.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.dg.getLargestMainSize();
            }
            paddingLeft = this.dg.getPaddingTop();
            paddingRight = this.dg.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.emc;
        int i17 = iArr != null ? iArr[i12] : 0;
        List<xq> flexLinesInternal = this.dg.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            xq xqVar = flexLinesInternal.get(i17);
            int i18 = xqVar.bw;
            if (i18 < i16 && xqVar.f9206aa) {
                i13 = i10;
                i14 = i11;
                emc(i13, i14, xqVar, i16, i15, false);
            } else {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && xqVar.sba) {
                    ypw(i13, i14, xqVar, i16, i15, false);
                }
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    private void emc(int i10, int i11, xq xqVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d10;
        double d11;
        float f12 = xqVar.ru;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = xqVar.bw)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        xqVar.bw = i13 + xqVar.ycc;
        if (!z10) {
            xqVar.uym = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < xqVar.msw) {
            int i17 = xqVar.cf + i15;
            View viewYpw = this.dg.ypw(i17);
            if (viewYpw == null || viewYpw.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z11 = z11;
            } else {
                com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) viewYpw.getLayoutParams();
                int flexDirection = this.dg.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewYpw.getMeasuredHeight();
                    long[] jArr = this.ycc;
                    if (jArr != null) {
                        measuredHeight = ypw(jArr[i17]);
                    }
                    int measuredWidth = viewYpw.getMeasuredWidth();
                    long[] jArr2 = this.ycc;
                    f11 = f14;
                    boolean z12 = z11;
                    if (jArr2 != null) {
                        measuredWidth = emc(jArr2[i17]);
                    }
                    if (this.bw[i17] || ypwVar.dg() <= f10) {
                        z11 = z12;
                    } else {
                        float fDg = measuredHeight + (ypwVar.dg() * f11);
                        if (i15 == xqVar.msw - 1) {
                            fDg += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fDg);
                        if (iRound > ypwVar.ru()) {
                            iRound = ypwVar.ru();
                            this.bw[i17] = true;
                            xqVar.ru -= ypwVar.dg();
                            z11 = true;
                        } else {
                            f15 += fDg - iRound;
                            double d12 = f15;
                            if (d12 > 1.0d) {
                                iRound++;
                                d11 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                }
                                z11 = z12;
                            }
                            f15 = (float) d11;
                            z11 = z12;
                        }
                        int iEmc = emc(i10, ypwVar, xqVar.sz);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewYpw.measure(iEmc, iMakeMeasureSpec);
                        int measuredWidth2 = viewYpw.getMeasuredWidth();
                        int measuredHeight2 = viewYpw.getMeasuredHeight();
                        emc(i17, iEmc, iMakeMeasureSpec, viewYpw);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + ypwVar.sz() + ypwVar.cf() + this.dg.emc(viewYpw));
                    xqVar.bw += measuredHeight + ypwVar.qh() + ypwVar.vk();
                } else {
                    f11 = f14;
                    boolean z13 = z11;
                    int measuredWidth3 = viewYpw.getMeasuredWidth();
                    long[] jArr3 = this.ycc;
                    if (jArr3 != null) {
                        measuredWidth3 = emc(jArr3[i17]);
                    }
                    int measuredHeight3 = viewYpw.getMeasuredHeight();
                    long[] jArr4 = this.ycc;
                    if (jArr4 != null) {
                        measuredHeight3 = ypw(jArr4[i17]);
                    }
                    if (this.bw[i17] || ypwVar.dg() <= f10) {
                        z11 = z13;
                    } else {
                        float fDg2 = measuredWidth3 + (ypwVar.dg() * f11);
                        if (i15 == xqVar.msw - 1) {
                            fDg2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fDg2);
                        if (iRound2 > ypwVar.zz()) {
                            iRound2 = ypwVar.zz();
                            this.bw[i17] = true;
                            xqVar.ru -= ypwVar.dg();
                            z11 = true;
                        } else {
                            f15 += fDg2 - iRound2;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                }
                                z11 = z13;
                            }
                            f15 = (float) d10;
                            z11 = z13;
                        }
                        int iYpw = ypw(i11, ypwVar, xqVar.sz);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewYpw.measure(iMakeMeasureSpec2, iYpw);
                        int measuredWidth4 = viewYpw.getMeasuredWidth();
                        int measuredHeight4 = viewYpw.getMeasuredHeight();
                        emc(i17, iMakeMeasureSpec2, iYpw, viewYpw);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + ypwVar.qh() + ypwVar.vk() + this.dg.emc(viewYpw));
                    xqVar.bw += measuredWidth3 + ypwVar.sz() + ypwVar.cf();
                    iMax = iMax2;
                }
                xqVar.uym = Math.max(xqVar.uym, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == xqVar.bw) {
            return;
        }
        emc(i10, i11, xqVar, i12, i13, true);
    }

    private int emc(int i10, com.bytedance.adsdk.ugeno.bw.ypw ypwVar, int i11) {
        com.bytedance.adsdk.ugeno.bw.emc emcVar = this.dg;
        int iEmc = emcVar.emc(i10, emcVar.getPaddingLeft() + this.dg.getPaddingRight() + ypwVar.sz() + ypwVar.cf() + i11, ypwVar.emc());
        int size = View.MeasureSpec.getSize(iEmc);
        if (size > ypwVar.zz()) {
            return View.MeasureSpec.makeMeasureSpec(ypwVar.zz(), View.MeasureSpec.getMode(iEmc));
        }
        return size < ypwVar.uym() ? View.MeasureSpec.makeMeasureSpec(ypwVar.uym(), View.MeasureSpec.getMode(iEmc)) : iEmc;
    }

    private List<xq> emc(List<xq> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        xq xqVar = new xq();
        xqVar.uym = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(xqVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(xqVar);
            }
        }
        return arrayList;
    }

    public void emc() {
        emc(0);
    }

    public void emc(int i10) {
        View viewYpw;
        if (i10 >= this.dg.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.dg.getFlexDirection();
        if (this.dg.getAlignItems() == 4) {
            int[] iArr = this.emc;
            List<xq> flexLinesInternal = this.dg.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                xq xqVar = flexLinesInternal.get(i11);
                int i12 = xqVar.msw;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = xqVar.cf + i13;
                    if (i13 < this.dg.getFlexItemCount() && (viewYpw = this.dg.ypw(i14)) != null && viewYpw.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) viewYpw.getLayoutParams();
                        if (ypwVar.ycc() == -1 || ypwVar.ycc() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                ypw(viewYpw, xqVar.uym, i14);
                            } else {
                                emc(viewYpw, xqVar.uym, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (xq xqVar2 : this.dg.getFlexLinesInternal()) {
            for (Integer num : xqVar2.qh) {
                View viewYpw2 = this.dg.ypw(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    ypw(viewYpw2, xqVar2.uym, num.intValue());
                } else {
                    emc(viewYpw2, xqVar2.uym, num.intValue());
                }
            }
        }
    }

    private void emc(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - ypwVar.qh()) - ypwVar.vk()) - this.dg.emc(view), ypwVar.msw()), ypwVar.ru());
        long[] jArr = this.ycc;
        if (jArr != null) {
            measuredWidth = emc(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        emc(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void emc(View view, xq xqVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) view.getLayoutParams();
        int alignItems = this.dg.getAlignItems();
        if (ypwVar.ycc() != -1) {
            alignItems = ypwVar.ycc();
        }
        int i14 = xqVar.uym;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.dg.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - ypwVar.vk(), i12, i15 - ypwVar.vk());
                    return;
                } else {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + ypwVar.qh(), i12, (i13 - i14) + view.getMeasuredHeight() + ypwVar.qh());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + ypwVar.qh()) - ypwVar.vk()) / 2;
                if (this.dg.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.dg.getFlexWrap() != 2) {
                    int iMax = Math.max(xqVar.sup - view.getBaseline(), ypwVar.qh());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((xqVar.sup - view.getMeasuredHeight()) + view.getBaseline(), ypwVar.vk());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.dg.getFlexWrap() != 2) {
            view.layout(i10, i11 + ypwVar.qh(), i12, i13 + ypwVar.qh());
        } else {
            view.layout(i10, i11 - ypwVar.vk(), i12, i13 - ypwVar.vk());
        }
    }

    public void emc(View view, xq xqVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) view.getLayoutParams();
        int alignItems = this.dg.getAlignItems();
        if (ypwVar.ycc() != -1) {
            alignItems = ypwVar.ycc();
        }
        int i14 = xqVar.uym;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - ypwVar.cf(), i11, ((i12 + i14) - view.getMeasuredWidth()) - ypwVar.cf(), i13);
                    return;
                } else {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + ypwVar.sz(), i11, (i12 - i14) + view.getMeasuredWidth() + ypwVar.sz(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.uym.ycc.emc(marginLayoutParams)) - com.bytedance.adsdk.ugeno.uym.ycc.ypw(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + ypwVar.sz(), i11, i12 + ypwVar.sz(), i13);
        } else {
            view.layout(i10 - ypwVar.cf(), i11, i12 - ypwVar.cf(), i13);
        }
    }

    private void emc(int i10, int i11, int i12, View view) {
        long[] jArr = this.ypw;
        if (jArr != null) {
            jArr[i10] = ypw(i11, i12);
        }
        long[] jArr2 = this.ycc;
        if (jArr2 != null) {
            jArr2[i10] = ypw(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
