package com.bytedance.adsdk.ugeno.bw;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
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
            int i = this.ypw;
            int i3 = ypwVar.ypw;
            return i != i3 ? i - i3 : this.emc - ypwVar.emc;
        }

        public String toString() {
            return "Order{order=" + this.ypw + ", index=" + this.emc + '}';
        }
    }

    public dg(com.bytedance.adsdk.ugeno.bw.emc emcVar) {
        this.dg = emcVar;
    }

    private int bw(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z6) {
        return z6 ? ypwVar.qh() : ypwVar.sz();
    }

    private int dg(boolean z6) {
        return z6 ? this.dg.getPaddingBottom() : this.dg.getPaddingEnd();
    }

    private int xq(boolean z6) {
        return z6 ? this.dg.getPaddingTop() : this.dg.getPaddingStart();
    }

    private int ycc(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z6) {
        return z6 ? ypwVar.vk() : ypwVar.cf();
    }

    public int emc(long j6) {
        return (int) j6;
    }

    public int ypw(long j6) {
        return (int) (j6 >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] emc(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.dg.getFlexItemCount();
        List<ypw> listYpw = ypw(flexItemCount);
        ypw ypwVar = new ypw();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.bw.ypw)) {
            ypwVar.ypw = 1;
        } else {
            ypwVar.ypw = ((com.bytedance.adsdk.ugeno.bw.ypw) layoutParams).xq();
        }
        if (i == -1 || i == flexItemCount || i >= this.dg.getFlexItemCount()) {
            ypwVar.emc = flexItemCount;
        } else {
            ypwVar.emc = i;
            while (i < flexItemCount) {
                listYpw.get(i).emc++;
                i++;
            }
        }
        listYpw.add(ypwVar);
        return emc(flexItemCount + 1, listYpw, sparseIntArray);
    }

    public long ypw(int i, int i3) {
        return (i & 4294967295L) | (i3 << 32);
    }

    private int dg(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z6) {
        if (z6) {
            return ypwVar.cf();
        }
        return ypwVar.vk();
    }

    private int xq(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z6) {
        if (z6) {
            return ypwVar.sz();
        }
        return ypwVar.qh();
    }

    private List<ypw> ypw(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) this.dg.emc(i3).getLayoutParams();
            ypw ypwVar2 = new ypw();
            ypwVar2.ypw = ypwVar.xq();
            ypwVar2.emc = i3;
            arrayList.add(ypwVar2);
        }
        return arrayList;
    }

    private void xq(int i) {
        boolean[] zArr = this.bw;
        if (zArr == null) {
            this.bw = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.bw = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean ypw(SparseIntArray sparseIntArray) {
        int flexItemCount = this.dg.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return xq;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewEmc = this.dg.emc(i);
            if (viewEmc != null && ((com.bytedance.adsdk.ugeno.bw.ypw) viewEmc.getLayoutParams()).xq() != sparseIntArray.get(i)) {
                return xq;
            }
        }
        return false;
    }

    public void ypw(emc emcVar, int i, int i3) {
        emc(emcVar, i3, i, Integer.MAX_VALUE, 0, -1, (List<xq>) null);
    }

    private int ypw(boolean z6) {
        if (z6) {
            return this.dg.getPaddingEnd();
        }
        return this.dg.getPaddingBottom();
    }

    public int[] emc(SparseIntArray sparseIntArray) {
        int flexItemCount = this.dg.getFlexItemCount();
        return emc(flexItemCount, ypw(flexItemCount), sparseIntArray);
    }

    private int ypw(View view, boolean z6) {
        if (z6) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] emc(int i, List<ypw> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i3 = 0;
        for (ypw ypwVar : list) {
            int i6 = ypwVar.emc;
            iArr[i3] = i6;
            sparseIntArray.append(i6, ypwVar.ypw);
            i3++;
        }
        return iArr;
    }

    private int ypw(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z6) {
        if (z6) {
            return ypwVar.ypw();
        }
        return ypwVar.emc();
    }

    private void ypw(int i, int i3, xq xqVar, int i6, int i7, boolean z6) {
        float f2;
        float f5;
        int iMax;
        int iUym;
        int i8 = xqVar.bw;
        float f6 = xqVar.gbl;
        float f7 = 0.0f;
        if (f6 <= 0.0f || i6 > i8) {
            return;
        }
        float f8 = (i8 - i6) / f6;
        xqVar.bw = i7 + xqVar.ycc;
        if (!z6) {
            xqVar.uym = LinearLayoutManager.INVALID_OFFSET;
        }
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        float f9 = 0.0f;
        while (i9 < xqVar.msw) {
            int i11 = xqVar.cf + i9;
            View viewYpw = this.dg.ypw(i11);
            if (viewYpw == null || viewYpw.getVisibility() == 8) {
                f2 = f7;
                f5 = f8;
            } else {
                com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) viewYpw.getLayoutParams();
                int flexDirection = this.dg.getFlexDirection();
                f2 = f7;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewYpw.getMeasuredHeight();
                    long[] jArr = this.ycc;
                    if (jArr != null) {
                        measuredHeight = ypw(jArr[i11]);
                    }
                    int measuredWidth = viewYpw.getMeasuredWidth();
                    long[] jArr2 = this.ycc;
                    if (jArr2 != null) {
                        measuredWidth = emc(jArr2[i11]);
                    }
                    if (!this.bw[i11] && ypwVar.bw() > f2) {
                        float fBw = measuredHeight - (ypwVar.bw() * f8);
                        if (i9 == xqVar.msw - 1) {
                            fBw += f9;
                            f9 = f2;
                        }
                        int iRound = Math.round(fBw);
                        if (iRound < ypwVar.msw()) {
                            iRound = ypwVar.msw();
                            this.bw[i11] = xq;
                            xqVar.gbl -= ypwVar.bw();
                            z7 = true;
                        } else {
                            float f10 = (fBw - iRound) + f9;
                            double d6 = f10;
                            if (d6 > 1.0d) {
                                iRound++;
                                f10 -= 1.0f;
                            } else if (d6 < -1.0d) {
                                iRound--;
                                f10 += 1.0f;
                            }
                            f9 = f10;
                        }
                        int iEmc = emc(i, ypwVar, xqVar.sz);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewYpw.measure(iEmc, iMakeMeasureSpec);
                        int measuredWidth2 = viewYpw.getMeasuredWidth();
                        int measuredHeight2 = viewYpw.getMeasuredHeight();
                        emc(i11, iEmc, iMakeMeasureSpec, viewYpw);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i10, ypwVar.cf() + ypwVar.sz() + measuredWidth + this.dg.emc(viewYpw));
                    xqVar.bw = ypwVar.vk() + ypwVar.qh() + measuredHeight + xqVar.bw;
                    f5 = f8;
                } else {
                    int measuredWidth3 = viewYpw.getMeasuredWidth();
                    long[] jArr3 = this.ycc;
                    if (jArr3 != null) {
                        measuredWidth3 = emc(jArr3[i11]);
                    }
                    int measuredHeight3 = viewYpw.getMeasuredHeight();
                    long[] jArr4 = this.ycc;
                    f5 = f8;
                    if (jArr4 != null) {
                        measuredHeight3 = ypw(jArr4[i11]);
                    }
                    if (!this.bw[i11] && ypwVar.bw() > f2) {
                        float fBw2 = measuredWidth3 - (ypwVar.bw() * f5);
                        if (i9 == xqVar.msw - 1) {
                            fBw2 += f9;
                            f9 = f2;
                        }
                        int iRound2 = Math.round(fBw2);
                        if (iRound2 < ypwVar.uym()) {
                            iUym = ypwVar.uym();
                            this.bw[i11] = xq;
                            xqVar.gbl -= ypwVar.bw();
                            z7 = true;
                        } else {
                            float f11 = (fBw2 - iRound2) + f9;
                            double d7 = f11;
                            if (d7 > 1.0d) {
                                iUym = iRound2 + 1;
                                f11 -= 1.0f;
                            } else if (d7 < -1.0d) {
                                iUym = iRound2 - 1;
                                f11 += 1.0f;
                            } else {
                                iUym = iRound2;
                            }
                            f9 = f11;
                        }
                        int iYpw = ypw(i3, ypwVar, xqVar.sz);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iUym, 1073741824);
                        viewYpw.measure(iMakeMeasureSpec2, iYpw);
                        int measuredWidth4 = viewYpw.getMeasuredWidth();
                        int measuredHeight4 = viewYpw.getMeasuredHeight();
                        emc(i11, iMakeMeasureSpec2, iYpw, viewYpw);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i10, ypwVar.vk() + ypwVar.qh() + measuredHeight3 + this.dg.emc(viewYpw));
                    xqVar.bw = ypwVar.cf() + ypwVar.sz() + measuredWidth3 + xqVar.bw;
                    iMax = iMax2;
                }
                xqVar.uym = Math.max(xqVar.uym, iMax);
                i10 = iMax;
            }
            i9++;
            f8 = f5;
            f7 = f2;
        }
        if (!z7 || i8 == xqVar.bw) {
            return;
        }
        ypw(i, i3, xqVar, i6, i7, xq);
    }

    public void emc(emc emcVar, int i, int i3) {
        emc(emcVar, i, i3, Integer.MAX_VALUE, 0, -1, (List<xq>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void emc(emc emcVar, int i, int i3, int i6, int i7, int i8, List<xq> list) {
        int i9;
        emc emcVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iEmc;
        int i15;
        int i16;
        int i17;
        xq xqVar;
        int i18;
        int i19;
        boolean z6;
        int i20;
        boolean z7;
        int i21;
        int i22 = i;
        boolean zEmc = this.dg.emc();
        int mode = View.MeasureSpec.getMode(i22);
        int size = View.MeasureSpec.getSize(i22);
        List<xq> arrayList = list == null ? new ArrayList() : list;
        emcVar.emc = arrayList;
        boolean z8 = i8 == -1 ? xq : false;
        int iEmc2 = emc(zEmc);
        int iYpw = ypw(zEmc);
        int iXq = xq(zEmc);
        int iDg = dg(zEmc);
        xq xqVar2 = new xq();
        int i23 = i7;
        xqVar2.cf = i23;
        int i24 = iEmc2 + iYpw;
        xqVar2.bw = i24;
        int flexItemCount = this.dg.getFlexItemCount();
        boolean z9 = z8;
        xq xqVar3 = xqVar2;
        int i25 = Integer.MIN_VALUE;
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        int i27 = 0;
        while (true) {
            if (i23 >= flexItemCount) {
                i9 = iCombineMeasuredStates;
                emcVar2 = emcVar;
                break;
            }
            View viewYpw = this.dg.ypw(i23);
            if (viewYpw == null) {
                if (emc(i23, flexItemCount, xqVar3)) {
                    emc(arrayList, xqVar3, i23, i26);
                }
                i10 = i24;
            } else {
                i10 = i24;
                if (viewYpw.getVisibility() == 8) {
                    xqVar3.zz++;
                    xqVar3.msw++;
                    if (emc(i23, flexItemCount, xqVar3)) {
                        emc(arrayList, xqVar3, i23, i26);
                    }
                } else {
                    if (viewYpw instanceof CompoundButton) {
                        emc((CompoundButton) viewYpw);
                    }
                    com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) viewYpw.getLayoutParams();
                    int i28 = flexItemCount;
                    if (ypwVar.ycc() == 4) {
                        xqVar3.qh.add(Integer.valueOf(i23));
                    }
                    int iEmc3 = emc(ypwVar, zEmc);
                    if (ypwVar.sup() != -1.0f && mode == 1073741824) {
                        iEmc3 = Math.round(ypwVar.sup() * size);
                    }
                    if (zEmc) {
                        i12 = mode;
                        iEmc = this.dg.emc(i22, i10 + xq(ypwVar, xq) + dg(ypwVar, xq), iEmc3);
                        i11 = size;
                        i13 = i26;
                        int iYpw2 = this.dg.ypw(i3, iXq + iDg + bw(ypwVar, xq) + ycc(ypwVar, xq) + i26, ypw(ypwVar, xq));
                        viewYpw.measure(iEmc, iYpw2);
                        emc(i23, iEmc, iYpw2, viewYpw);
                        i14 = 0;
                    } else {
                        i11 = size;
                        i12 = mode;
                        i13 = i26;
                        i14 = 0;
                        int iEmc4 = this.dg.emc(i3, iXq + iDg + bw(ypwVar, false) + ycc(ypwVar, false) + i13, ypw(ypwVar, false));
                        int iYpw3 = this.dg.ypw(i22, i10 + xq(ypwVar, false) + dg(ypwVar, false), iEmc3);
                        viewYpw.measure(iEmc4, iYpw3);
                        emc(i23, iEmc4, iYpw3, viewYpw);
                        iEmc = iYpw3;
                    }
                    emc(viewYpw, i23);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewYpw.getMeasuredState());
                    int i29 = i14;
                    i15 = i23;
                    int i30 = iEmc;
                    xq xqVar4 = xqVar3;
                    int i31 = i27;
                    i16 = i10;
                    i17 = i13;
                    boolean z10 = zEmc;
                    size = i11;
                    if (emc(viewYpw, i12, size, xqVar3.bw, emc(viewYpw, zEmc) + xq(ypwVar, zEmc) + dg(ypwVar, zEmc), ypwVar, i15, i31, arrayList.size())) {
                        if (xqVar4.ypw() > 0) {
                            emc(arrayList, xqVar4, i15 > 0 ? i15 - 1 : i29, i17);
                            i21 = i17 + xqVar4.uym;
                        } else {
                            i21 = i17;
                        }
                        if (z10) {
                            if (ypwVar.ypw() == -1) {
                                com.bytedance.adsdk.ugeno.bw.emc emcVar3 = this.dg;
                                viewYpw.measure(i30, emcVar3.ypw(i3, ypwVar.vk() + ypwVar.qh() + emcVar3.getPaddingTop() + this.dg.getPaddingBottom() + i21, ypwVar.ypw()));
                                emc(viewYpw, i15);
                            }
                        } else if (ypwVar.emc() == -1) {
                            com.bytedance.adsdk.ugeno.bw.emc emcVar4 = this.dg;
                            viewYpw.measure(emcVar4.emc(i3, ypwVar.cf() + ypwVar.sz() + emcVar4.getPaddingLeft() + this.dg.getPaddingRight() + i21, ypwVar.emc()), i30);
                            emc(viewYpw, i15);
                        }
                        xq xqVar5 = new xq();
                        xqVar5.msw = 1;
                        xqVar5.bw = i16;
                        xqVar5.cf = i15;
                        i17 = i21;
                        i18 = i29;
                        xqVar = xqVar5;
                        i19 = Integer.MIN_VALUE;
                    } else {
                        xqVar = xqVar4;
                        xqVar.msw++;
                        i18 = i31 + 1;
                        i19 = i25;
                    }
                    xqVar.aa = (xqVar.aa ? 1 : 0) | (ypwVar.dg() != 0.0f ? 1 : i29);
                    xqVar.sba = (xqVar.sba ? 1 : 0) | (ypwVar.bw() != 0.0f ? 1 : i29);
                    int[] iArr = this.emc;
                    if (iArr != null) {
                        iArr[i15] = arrayList.size();
                    }
                    z6 = z10;
                    xqVar.bw = emc(viewYpw, z6) + xq(ypwVar, z6) + dg(ypwVar, z6) + xqVar.bw;
                    xqVar.ru = ypwVar.dg() + xqVar.ru;
                    xqVar.gbl = ypwVar.bw() + xqVar.gbl;
                    this.dg.emc(viewYpw, i15, i18, xqVar);
                    int iMax = Math.max(i19, ypw(viewYpw, z6) + bw(ypwVar, z6) + ycc(ypwVar, z6) + this.dg.emc(viewYpw));
                    xqVar.uym = Math.max(xqVar.uym, iMax);
                    if (z6) {
                        if (this.dg.getFlexWrap() != 2) {
                            xqVar.sup = Math.max(xqVar.sup, ypwVar.qh() + viewYpw.getBaseline());
                        } else {
                            xqVar.sup = Math.max(xqVar.sup, ypwVar.vk() + (viewYpw.getMeasuredHeight() - viewYpw.getBaseline()));
                        }
                    }
                    i20 = i28;
                    if (emc(i15, i20, xqVar)) {
                        emc(arrayList, xqVar, i15, i17);
                        i17 += xqVar.uym;
                    }
                    if (i8 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).vk >= i8 && i15 >= i8 && !z9) {
                            i17 = -xqVar.emc();
                            z7 = true;
                        }
                        if (i17 <= i6 && z7) {
                            emcVar2 = emcVar;
                            i9 = iCombineMeasuredStates;
                            break;
                        }
                        i25 = iMax;
                        z9 = z7;
                        i27 = i18;
                        int i32 = i15 + 1;
                        zEmc = z6;
                        xqVar3 = xqVar;
                        i24 = i16;
                        i26 = i17;
                        i22 = i;
                        flexItemCount = i20;
                        i23 = i32;
                        mode = i12;
                    }
                    z7 = z9;
                    if (i17 <= i6) {
                    }
                    i25 = iMax;
                    z9 = z7;
                    i27 = i18;
                    int i322 = i15 + 1;
                    zEmc = z6;
                    xqVar3 = xqVar;
                    i24 = i16;
                    i26 = i17;
                    i22 = i;
                    flexItemCount = i20;
                    i23 = i322;
                    mode = i12;
                }
            }
            i15 = i23;
            i12 = mode;
            i20 = flexItemCount;
            i17 = i26;
            z6 = zEmc;
            i16 = i10;
            xqVar = xqVar3;
            int i3222 = i15 + 1;
            zEmc = z6;
            xqVar3 = xqVar;
            i24 = i16;
            i26 = i17;
            i22 = i;
            flexItemCount = i20;
            i23 = i3222;
            mode = i12;
        }
        emcVar2.ypw = i9;
    }

    private int ypw(int i, com.bytedance.adsdk.ugeno.bw.ypw ypwVar, int i3) {
        com.bytedance.adsdk.ugeno.bw.emc emcVar = this.dg;
        int iYpw = emcVar.ypw(i, ypwVar.vk() + ypwVar.qh() + emcVar.getPaddingTop() + this.dg.getPaddingBottom() + i3, ypwVar.ypw());
        int size = View.MeasureSpec.getSize(iYpw);
        if (size > ypwVar.ru()) {
            return View.MeasureSpec.makeMeasureSpec(ypwVar.ru(), View.MeasureSpec.getMode(iYpw));
        }
        return size < ypwVar.msw() ? View.MeasureSpec.makeMeasureSpec(ypwVar.msw(), View.MeasureSpec.getMode(iYpw)) : iYpw;
    }

    public void ypw(int i, int i3, int i6) {
        int mode;
        int size;
        int flexDirection = this.dg.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        } else {
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            mode = mode2;
            size = size2;
        }
        List<xq> flexLinesInternal = this.dg.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.dg.getSumOfCrossSize() + i6;
            int i7 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).uym = size - i6;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.dg.getAlignContent();
                if (alignContent == 1) {
                    int i8 = size - sumOfCrossSize;
                    xq xqVar = new xq();
                    xqVar.uym = i8;
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
                        float f2 = 0.0f;
                        while (i7 < size4) {
                            arrayList.add(flexLinesInternal.get(i7));
                            if (i7 != flexLinesInternal.size() - 1) {
                                xq xqVar2 = new xq();
                                if (i7 == flexLinesInternal.size() - 2) {
                                    xqVar2.uym = Math.round(f2 + size3);
                                    f2 = 0.0f;
                                } else {
                                    xqVar2.uym = Math.round(size3);
                                }
                                int i9 = xqVar2.uym;
                                float f5 = (size3 - i9) + f2;
                                if (f5 > 1.0f) {
                                    xqVar2.uym = i9 + 1;
                                    f5 -= 1.0f;
                                } else if (f5 < -1.0f) {
                                    xqVar2.uym = i9 - 1;
                                    f5 += 1.0f;
                                }
                                f2 = f5;
                                arrayList.add(xqVar2);
                            }
                            i7++;
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
                    float f6 = 0.0f;
                    while (i7 < size7) {
                        xq xqVar5 = flexLinesInternal.get(i7);
                        float f7 = xqVar5.uym + size6;
                        if (i7 == flexLinesInternal.size() - 1) {
                            f7 += f6;
                            f6 = 0.0f;
                        }
                        int iRound = Math.round(f7);
                        float f8 = (f7 - iRound) + f6;
                        if (f8 > 1.0f) {
                            iRound++;
                            f8 -= 1.0f;
                        } else if (f8 < -1.0f) {
                            iRound--;
                            f8 += 1.0f;
                        }
                        f6 = f8;
                        xqVar5.uym = iRound;
                        i7++;
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

    private int emc(boolean z6) {
        if (z6) {
            return this.dg.getPaddingStart();
        }
        return this.dg.getPaddingTop();
    }

    private int emc(View view, boolean z6) {
        if (z6) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void ypw(View view, int i, int i3) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - ypwVar.sz()) - ypwVar.cf()) - this.dg.emc(view), ypwVar.uym()), ypwVar.zz());
        long[] jArr = this.ycc;
        if (jArr != null) {
            measuredHeight = ypw(jArr[i3]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        emc(i3, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int emc(com.bytedance.adsdk.ugeno.bw.ypw ypwVar, boolean z6) {
        if (z6) {
            return ypwVar.emc();
        }
        return ypwVar.ypw();
    }

    private boolean emc(View view, int i, int i3, int i6, int i7, com.bytedance.adsdk.ugeno.bw.ypw ypwVar, int i8, int i9, int i10) {
        if (this.dg.getFlexWrap() == 0) {
            return false;
        }
        if (ypwVar.gbl()) {
            return xq;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.dg.getMaxLine();
        if (maxLine != -1 && maxLine <= i10 + 1) {
            return false;
        }
        int iEmc = this.dg.emc(view, i8, i9);
        if (iEmc > 0) {
            i7 += iEmc;
        }
        if (i3 < i6 + i7) {
            return xq;
        }
        return false;
    }

    private boolean emc(int i, int i3, xq xqVar) {
        if (i != i3 - 1 || xqVar.ypw() == 0) {
            return false;
        }
        return xq;
    }

    private void emc(List<xq> list, xq xqVar, int i, int i3) {
        xqVar.sz = i3;
        this.dg.emc(xqVar);
        xqVar.vk = i;
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

    public void emc(int i, int i3) {
        emc(i, i3, 0);
    }

    public void emc(int i, int i3, int i6) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i7;
        int i8;
        xq(this.dg.getFlexItemCount());
        if (i6 >= this.dg.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.dg.getFlexDirection();
        int flexDirection2 = this.dg.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
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
            int mode2 = View.MeasureSpec.getMode(i3);
            size = View.MeasureSpec.getSize(i3);
            if (mode2 != 1073741824) {
                size = this.dg.getLargestMainSize();
            }
            paddingLeft = this.dg.getPaddingTop();
            paddingRight = this.dg.getPaddingBottom();
        }
        int i9 = paddingLeft + paddingRight;
        int i10 = size;
        int[] iArr = this.emc;
        int i11 = iArr != null ? iArr[i6] : 0;
        List<xq> flexLinesInternal = this.dg.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i11 < size2) {
            xq xqVar = flexLinesInternal.get(i11);
            int i12 = xqVar.bw;
            if (i12 < i10 && xqVar.aa) {
                i7 = i;
                i8 = i3;
                emc(i7, i8, xqVar, i10, i9, false);
            } else {
                i7 = i;
                i8 = i3;
                if (i12 > i10 && xqVar.sba) {
                    ypw(i7, i8, xqVar, i10, i9, false);
                }
            }
            i11++;
            i = i7;
            i3 = i8;
        }
    }

    private void emc(int i, int i3, xq xqVar, int i6, int i7, boolean z6) {
        int i8;
        float f2;
        float f5;
        int iMax;
        double d6;
        double d7;
        float f6 = xqVar.ru;
        float f7 = 0.0f;
        if (f6 <= 0.0f || i6 < (i8 = xqVar.bw)) {
            return;
        }
        float f8 = (i6 - i8) / f6;
        xqVar.bw = i7 + xqVar.ycc;
        if (!z6) {
            xqVar.uym = LinearLayoutManager.INVALID_OFFSET;
        }
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        float f9 = 0.0f;
        while (i9 < xqVar.msw) {
            int i11 = xqVar.cf + i9;
            View viewYpw = this.dg.ypw(i11);
            if (viewYpw == null || viewYpw.getVisibility() == 8) {
                f2 = f7;
                f5 = f8;
                z7 = z7;
            } else {
                com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) viewYpw.getLayoutParams();
                int flexDirection = this.dg.getFlexDirection();
                f2 = f7;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewYpw.getMeasuredHeight();
                    long[] jArr = this.ycc;
                    if (jArr != null) {
                        measuredHeight = ypw(jArr[i11]);
                    }
                    int measuredWidth = viewYpw.getMeasuredWidth();
                    long[] jArr2 = this.ycc;
                    f5 = f8;
                    boolean z8 = z7;
                    if (jArr2 != null) {
                        measuredWidth = emc(jArr2[i11]);
                    }
                    if (this.bw[i11] || ypwVar.dg() <= f2) {
                        z7 = z8;
                    } else {
                        float fDg = (ypwVar.dg() * f5) + measuredHeight;
                        if (i9 == xqVar.msw - 1) {
                            fDg += f9;
                            f9 = f2;
                        }
                        int iRound = Math.round(fDg);
                        if (iRound > ypwVar.ru()) {
                            iRound = ypwVar.ru();
                            this.bw[i11] = xq;
                            xqVar.ru -= ypwVar.dg();
                            z7 = true;
                        } else {
                            float f10 = (fDg - iRound) + f9;
                            double d8 = f10;
                            if (d8 > 1.0d) {
                                iRound++;
                                d7 = d8 - 1.0d;
                            } else {
                                if (d8 < -1.0d) {
                                    iRound--;
                                    d7 = d8 + 1.0d;
                                }
                                f9 = f10;
                                z7 = z8;
                            }
                            f10 = (float) d7;
                            f9 = f10;
                            z7 = z8;
                        }
                        int iEmc = emc(i, ypwVar, xqVar.sz);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewYpw.measure(iEmc, iMakeMeasureSpec);
                        int measuredWidth2 = viewYpw.getMeasuredWidth();
                        int measuredHeight2 = viewYpw.getMeasuredHeight();
                        emc(i11, iEmc, iMakeMeasureSpec, viewYpw);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i10, ypwVar.cf() + ypwVar.sz() + measuredWidth + this.dg.emc(viewYpw));
                    xqVar.bw = ypwVar.vk() + ypwVar.qh() + measuredHeight + xqVar.bw;
                } else {
                    f5 = f8;
                    boolean z9 = z7;
                    int measuredWidth3 = viewYpw.getMeasuredWidth();
                    long[] jArr3 = this.ycc;
                    if (jArr3 != null) {
                        measuredWidth3 = emc(jArr3[i11]);
                    }
                    int measuredHeight3 = viewYpw.getMeasuredHeight();
                    long[] jArr4 = this.ycc;
                    if (jArr4 != null) {
                        measuredHeight3 = ypw(jArr4[i11]);
                    }
                    if (this.bw[i11] || ypwVar.dg() <= f2) {
                        z7 = z9;
                    } else {
                        float fDg2 = (ypwVar.dg() * f5) + measuredWidth3;
                        if (i9 == xqVar.msw - 1) {
                            fDg2 += f9;
                            f9 = f2;
                        }
                        int iRound2 = Math.round(fDg2);
                        if (iRound2 > ypwVar.zz()) {
                            iRound2 = ypwVar.zz();
                            this.bw[i11] = xq;
                            xqVar.ru -= ypwVar.dg();
                            z7 = true;
                        } else {
                            float f11 = (fDg2 - iRound2) + f9;
                            double d9 = f11;
                            if (d9 > 1.0d) {
                                iRound2++;
                                d6 = d9 - 1.0d;
                            } else {
                                if (d9 < -1.0d) {
                                    iRound2--;
                                    d6 = d9 + 1.0d;
                                }
                                f9 = f11;
                                z7 = z9;
                            }
                            f11 = (float) d6;
                            f9 = f11;
                            z7 = z9;
                        }
                        int iYpw = ypw(i3, ypwVar, xqVar.sz);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewYpw.measure(iMakeMeasureSpec2, iYpw);
                        int measuredWidth4 = viewYpw.getMeasuredWidth();
                        int measuredHeight4 = viewYpw.getMeasuredHeight();
                        emc(i11, iMakeMeasureSpec2, iYpw, viewYpw);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i10, ypwVar.vk() + ypwVar.qh() + measuredHeight3 + this.dg.emc(viewYpw));
                    xqVar.bw = ypwVar.cf() + ypwVar.sz() + measuredWidth3 + xqVar.bw;
                    iMax = iMax2;
                }
                xqVar.uym = Math.max(xqVar.uym, iMax);
                i10 = iMax;
            }
            i9++;
            f8 = f5;
            f7 = f2;
        }
        if (!z7 || i8 == xqVar.bw) {
            return;
        }
        emc(i, i3, xqVar, i6, i7, xq);
    }

    private int emc(int i, com.bytedance.adsdk.ugeno.bw.ypw ypwVar, int i3) {
        com.bytedance.adsdk.ugeno.bw.emc emcVar = this.dg;
        int iEmc = emcVar.emc(i, ypwVar.cf() + ypwVar.sz() + emcVar.getPaddingLeft() + this.dg.getPaddingRight() + i3, ypwVar.emc());
        int size = View.MeasureSpec.getSize(iEmc);
        if (size > ypwVar.zz()) {
            return View.MeasureSpec.makeMeasureSpec(ypwVar.zz(), View.MeasureSpec.getMode(iEmc));
        }
        return size < ypwVar.uym() ? View.MeasureSpec.makeMeasureSpec(ypwVar.uym(), View.MeasureSpec.getMode(iEmc)) : iEmc;
    }

    private List<xq> emc(List<xq> list, int i, int i3) {
        int i6 = (i - i3) / 2;
        ArrayList arrayList = new ArrayList();
        xq xqVar = new xq();
        xqVar.uym = i6;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 == 0) {
                arrayList.add(xqVar);
            }
            arrayList.add(list.get(i7));
            if (i7 == list.size() - 1) {
                arrayList.add(xqVar);
            }
        }
        return arrayList;
    }

    public void emc() {
        emc(0);
    }

    public void emc(int i) {
        View viewYpw;
        if (i >= this.dg.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.dg.getFlexDirection();
        if (this.dg.getAlignItems() == 4) {
            int[] iArr = this.emc;
            List<xq> flexLinesInternal = this.dg.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i3 = iArr != null ? iArr[i] : 0; i3 < size; i3++) {
                xq xqVar = flexLinesInternal.get(i3);
                int i6 = xqVar.msw;
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = xqVar.cf + i7;
                    if (i7 < this.dg.getFlexItemCount() && (viewYpw = this.dg.ypw(i8)) != null && viewYpw.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) viewYpw.getLayoutParams();
                        if (ypwVar.ycc() == -1 || ypwVar.ycc() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                ypw(viewYpw, xqVar.uym, i8);
                            } else {
                                emc(viewYpw, xqVar.uym, i8);
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

    private void emc(View view, int i, int i3) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - ypwVar.qh()) - ypwVar.vk()) - this.dg.emc(view), ypwVar.msw()), ypwVar.ru());
        long[] jArr = this.ycc;
        if (jArr != null) {
            measuredWidth = emc(jArr[i3]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        emc(i3, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void emc(View view, xq xqVar, int i, int i3, int i6, int i7) {
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) view.getLayoutParams();
        int alignItems = this.dg.getAlignItems();
        if (ypwVar.ycc() != -1) {
            alignItems = ypwVar.ycc();
        }
        int i8 = xqVar.uym;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.dg.getFlexWrap() != 2) {
                    int i9 = i3 + i8;
                    view.layout(i, (i9 - view.getMeasuredHeight()) - ypwVar.vk(), i6, i9 - ypwVar.vk());
                    return;
                }
                view.layout(i, ypwVar.qh() + view.getMeasuredHeight() + (i3 - i8), i6, ypwVar.qh() + view.getMeasuredHeight() + (i7 - i8));
                return;
            }
            if (alignItems == 2) {
                int iQh = ((ypwVar.qh() + (i8 - view.getMeasuredHeight())) - ypwVar.vk()) / 2;
                if (this.dg.getFlexWrap() != 2) {
                    int i10 = i3 + iQh;
                    view.layout(i, i10, i6, view.getMeasuredHeight() + i10);
                    return;
                } else {
                    int i11 = i3 - iQh;
                    view.layout(i, i11, i6, view.getMeasuredHeight() + i11);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.dg.getFlexWrap() != 2) {
                    int iMax = Math.max(xqVar.sup - view.getBaseline(), ypwVar.qh());
                    view.layout(i, i3 + iMax, i6, i7 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (xqVar.sup - view.getMeasuredHeight()), ypwVar.vk());
                    view.layout(i, i3 - iMax2, i6, i7 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.dg.getFlexWrap() != 2) {
            view.layout(i, ypwVar.qh() + i3, i6, ypwVar.qh() + i7);
        } else {
            view.layout(i, i3 - ypwVar.vk(), i6, i7 - ypwVar.vk());
        }
    }

    public void emc(View view, xq xqVar, boolean z6, int i, int i3, int i6, int i7) {
        com.bytedance.adsdk.ugeno.bw.ypw ypwVar = (com.bytedance.adsdk.ugeno.bw.ypw) view.getLayoutParams();
        int alignItems = this.dg.getAlignItems();
        if (ypwVar.ycc() != -1) {
            alignItems = ypwVar.ycc();
        }
        int i8 = xqVar.uym;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z6) {
                    view.layout(((i + i8) - view.getMeasuredWidth()) - ypwVar.cf(), i3, ((i6 + i8) - view.getMeasuredWidth()) - ypwVar.cf(), i7);
                    return;
                }
                view.layout(ypwVar.sz() + view.getMeasuredWidth() + (i - i8), i3, ypwVar.sz() + view.getMeasuredWidth() + (i6 - i8), i7);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iEmc = ((com.bytedance.adsdk.ugeno.uym.ycc.emc(marginLayoutParams) + (i8 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.uym.ycc.ypw(marginLayoutParams)) / 2;
                if (!z6) {
                    view.layout(i + iEmc, i3, i6 + iEmc, i7);
                    return;
                } else {
                    view.layout(i - iEmc, i3, i6 - iEmc, i7);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z6) {
            view.layout(ypwVar.sz() + i, i3, ypwVar.sz() + i6, i7);
        } else {
            view.layout(i - ypwVar.cf(), i3, i6 - ypwVar.cf(), i7);
        }
    }

    private void emc(int i, int i3, int i6, View view) {
        long[] jArr = this.ypw;
        if (jArr != null) {
            jArr[i] = ypw(i3, i6);
        }
        long[] jArr2 = this.ycc;
        if (jArr2 != null) {
            jArr2[i] = ypw(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
