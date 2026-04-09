package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.gn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1441gn extends AbstractRunnableC0923Wc {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC0834Sp A00;
    public final /* synthetic */ C0835Sq A01;
    public final /* synthetic */ C0842Sx A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1441gn(C0842Sx c0842Sx, ArrayList arrayList, C0835Sq c0835Sq, InterfaceC0834Sp interfaceC0834Sp, ArrayList arrayList2) {
        this.A02 = c0842Sx;
        this.A03 = arrayList;
        this.A01 = c0835Sq;
        this.A00 = interfaceC0834Sp;
        this.A04 = arrayList2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        AtomicBoolean atomicBooleanA0D = C0842Sx.A0D(this.A03);
        if (this.A02.A04 instanceof C1436gi) {
            C1436gi c1436gi = (C1436gi) this.A02.A04;
            if (this.A01.A00 == -1) {
                boolean z3 = atomicBooleanA0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z3) {
                        c1436gi.A0F().A4p(Y1.A01(this.A02.A00));
                    } else {
                        c1436gi.A0F().A4n(Y1.A01(this.A02.A00));
                    }
                }
                throw new RuntimeException();
            }
            if (atomicBooleanA0D.get()) {
                InterfaceC0662Lt interfaceC0662LtA0F = c1436gi.A0F();
                long jA01 = Y1.A01(this.A02.A00);
                C0835Sq c0835Sq = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    interfaceC0662LtA0F.A4q(jA01, c0835Sq.A00);
                }
                throw new RuntimeException();
            }
            c1436gi.A0F().A4o(Y1.A01(this.A02.A00), this.A01.A00);
        }
        this.A02.A02.post(new C1442go(this, atomicBooleanA0D));
        C0842Sx.A0D(this.A04);
    }
}
