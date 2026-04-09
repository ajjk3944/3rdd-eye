package com.facebook.ads.redexgen.core;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.6j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C23226j extends AbstractC3435g0 {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"5", "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public ArrayList<AbstractC2819Qg> A0A = new ArrayList<>();
    public ArrayList<AbstractC2819Qg> A07 = new ArrayList<>();
    public ArrayList<C2809Pw> A09 = new ArrayList<>();
    public ArrayList<C2808Pv> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC2819Qg>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C2809Pw>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C2808Pv>> A03 = new ArrayList<>();
    public ArrayList<AbstractC2819Qg> A00 = new ArrayList<>();
    public ArrayList<AbstractC2819Qg> A04 = new ArrayList<>();
    public ArrayList<AbstractC2819Qg> A06 = new ArrayList<>();
    public ArrayList<AbstractC2819Qg> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0H() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            C2809Pw c2809Pw = this.A09.get(size2);
            View view = c2809Pw.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0U(c2809Pw.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0V(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            AbstractC2819Qg abstractC2819Qg = this.A07.get(size4);
            abstractC2819Qg.A0H.setAlpha(1.0f);
            A0T(abstractC2819Qg);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            ArrayList<C2808Pv> arrayList = this.A08;
            String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A00(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0M()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                ArrayList<C2809Pw> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    C2809Pw c2809Pw2 = arrayList2.get(size7);
                    View view2 = c2809Pw2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0U(c2809Pw2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                ArrayList<AbstractC2819Qg> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    AbstractC2819Qg abstractC2819Qg2 = arrayList3.get(size9);
                    abstractC2819Qg2.A0H.setAlpha(1.0f);
                    A0T(abstractC2819Qg2);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        ArrayList<ArrayList<AbstractC2819Qg>> arrayList4 = this.A01;
                        String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            ArrayList<ArrayList<C2808Pv>> arrayList5 = this.A03;
            String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                ArrayList<C2808Pv> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A00(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A03(this.A06);
            A03(this.A04);
            A03(this.A00);
            A03(this.A02);
            A0G();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC3435g0
    public final boolean A0Z(AbstractC2819Qg abstractC2819Qg, int i, int i10, int i11, int i12) {
        View view = abstractC2819Qg.A0H;
        int translationX = i + ((int) abstractC2819Qg.A0H.getTranslationX());
        int translationY = i10 + ((int) abstractC2819Qg.A0H.getTranslationY());
        A02(abstractC2819Qg);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            A0U(abstractC2819Qg);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.A09.add(new C2809Pw(abstractC2819Qg, translationX, translationY, i11, i12));
        return true;
    }

    private void A00(C2808Pv c2808Pv) {
        if (c2808Pv.A05 != null) {
            A05(c2808Pv, c2808Pv.A05);
        }
        if (c2808Pv.A04 != null) {
            A05(c2808Pv, c2808Pv.A04);
        }
    }

    private void A01(AbstractC2819Qg abstractC2819Qg) {
        View view = abstractC2819Qg.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(abstractC2819Qg);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A0D());
        animation.alpha(0.0f).setListener(new C2803Pq(this, abstractC2819Qg, viewPropertyAnimatorAnimate, view)).start();
    }

    private void A02(AbstractC2819Qg abstractC2819Qg) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC2819Qg.A0H.animate().setInterpolator(A0B);
        A0L(abstractC2819Qg);
    }

    private final void A03(List<AbstractC2819Qg> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A04(List<C2808Pv> list, AbstractC2819Qg abstractC2819Qg) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C2808Pv changeInfo = list.get(size);
            if (A05(changeInfo, abstractC2819Qg) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A05(C2808Pv c2808Pv, AbstractC2819Qg abstractC2819Qg) {
        boolean z10 = false;
        if (c2808Pv.A04 == abstractC2819Qg) {
            c2808Pv.A04 = null;
        } else {
            AbstractC2819Qg abstractC2819Qg2 = c2808Pv.A05;
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "F";
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (abstractC2819Qg2 == abstractC2819Qg) {
                c2808Pv.A05 = null;
                z10 = true;
            } else {
                return false;
            }
        }
        abstractC2819Qg.A0H.setAlpha(1.0f);
        abstractC2819Qg.A0H.setTranslationX(0.0f);
        abstractC2819Qg.A0H.setTranslationY(0.0f);
        A0W(abstractC2819Qg, z10);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.core.QK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0I() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C23226j.A0I():void");
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0L(AbstractC2819Qg abstractC2819Qg) {
        View view = abstractC2819Qg.A0H;
        view.animate().cancel();
        for (int i = this.A09.size() - 1; i >= 0; i--) {
            if (this.A09.get(i).A04 == abstractC2819Qg) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0U(abstractC2819Qg);
                this.A09.remove(i);
            }
        }
        A04(this.A08, abstractC2819Qg);
        if (this.A0A.remove(abstractC2819Qg)) {
            view.setAlpha(1.0f);
            A0V(abstractC2819Qg);
        }
        if (this.A07.remove(abstractC2819Qg)) {
            view.setAlpha(1.0f);
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0T(abstractC2819Qg);
        }
        for (int i10 = this.A03.size() - 1; i10 >= 0; i10--) {
            ArrayList<C2808Pv> arrayList = this.A03.get(i10);
            A04(arrayList, abstractC2819Qg);
            if (arrayList.isEmpty()) {
                this.A03.remove(i10);
            }
        }
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            ArrayList<C2809Pw> arrayList2 = this.A05.get(size);
            int i11 = arrayList2.size() - 1;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                if (arrayList2.get(i11).A04 == abstractC2819Qg) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0U(abstractC2819Qg);
                    arrayList2.remove(i11);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size);
                    }
                } else {
                    i11--;
                }
            }
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            ArrayList<AbstractC2819Qg> arrayList3 = this.A01.get(size2);
            if (arrayList3.remove(abstractC2819Qg)) {
                view.setAlpha(1.0f);
                A0T(abstractC2819Qg);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size2);
                }
            }
        }
        this.A06.remove(abstractC2819Qg);
        this.A00.remove(abstractC2819Qg);
        this.A02.remove(abstractC2819Qg);
        this.A04.remove(abstractC2819Qg);
        A0b();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0M() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0S(AbstractC2819Qg abstractC2819Qg, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0S(abstractC2819Qg, payloads);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3435g0
    public final boolean A0X(AbstractC2819Qg abstractC2819Qg) {
        A02(abstractC2819Qg);
        abstractC2819Qg.A0H.setAlpha(0.0f);
        this.A07.add(abstractC2819Qg);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3435g0
    public final boolean A0Y(AbstractC2819Qg abstractC2819Qg) {
        A02(abstractC2819Qg);
        this.A0A.add(abstractC2819Qg);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3435g0
    public final boolean A0a(AbstractC2819Qg abstractC2819Qg, AbstractC2819Qg abstractC2819Qg2, int i, int i10, int i11, int i12) {
        if (abstractC2819Qg == abstractC2819Qg2) {
            return A0Z(abstractC2819Qg, i, i10, i11, i12);
        }
        float translationX = abstractC2819Qg.A0H.getTranslationX();
        float translationY = abstractC2819Qg.A0H.getTranslationY();
        float prevTranslationY = abstractC2819Qg.A0H.getAlpha();
        A02(abstractC2819Qg);
        float prevTranslationX = i11 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i12 - i10;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC2819Qg.A0H.setTranslationX(translationX);
        abstractC2819Qg.A0H.setTranslationY(translationY);
        abstractC2819Qg.A0H.setAlpha(prevTranslationY);
        if (abstractC2819Qg2 != null) {
            A02(abstractC2819Qg2);
            float prevTranslationX3 = -deltaY;
            abstractC2819Qg2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC2819Qg2.A0H.setTranslationY(prevTranslationX4);
            abstractC2819Qg2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C2808Pv(abstractC2819Qg, abstractC2819Qg2, i, i10, i11, i12));
        return true;
    }

    public final void A0b() {
        if (!A0M()) {
            A0G();
        }
    }

    public final void A0c(C2808Pv c2808Pv) {
        View view;
        AbstractC2819Qg holder = c2808Pv.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC2819Qg holder2 = c2808Pv.A04;
        View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A0B());
            this.A02.add(c2808Pv.A05);
            oldViewAnim.translationX(c2808Pv.A02 - c2808Pv.A00);
            oldViewAnim.translationY(c2808Pv.A03 - c2808Pv.A01);
            oldViewAnim.alpha(0.0f).setListener(new C2806Pt(this, c2808Pv, oldViewAnim, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(c2808Pv.A04);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(A0B()).alpha(1.0f).setListener(new C2807Pu(this, c2808Pv, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public final void A0d(AbstractC2819Qg abstractC2819Qg) {
        View view = abstractC2819Qg.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(abstractC2819Qg);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A0A());
        animation.setListener(new C2804Pr(this, abstractC2819Qg, view, viewPropertyAnimatorAnimate)).start();
    }

    public final void A0e(AbstractC2819Qg abstractC2819Qg, int i, int i10, int i11, int i12) {
        View view = abstractC2819Qg.A0H;
        int i13 = i11 - i;
        int i14 = i12 - i10;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i14 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(abstractC2819Qg);
        viewPropertyAnimatorAnimate.setDuration(A0C()).setListener(new C2805Ps(this, abstractC2819Qg, i13, view, i14, viewPropertyAnimatorAnimate)).start();
    }
}
