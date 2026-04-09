package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.fb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3410fb implements S7 {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C3568iN> A00;
    public final /* synthetic */ C3409fa A01;

    public C3410fb(C3409fa c3409fa, List<C3568iN> list) {
        this.A01 = c3409fa;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        Iterator<C3568iN> it = this.A00.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (zHasNext) {
                C2815Qc c2815Qc = new C2815Qc(this.A01.A01, it.next(), null, C2815Qc.A0K(), this.A01.A00.A01());
                if (c2815Qc.A0z() != null && c2815Qc.A0z().A0F() != null) {
                    ((AbstractC3513hL) c2815Qc.A0z().A0F()).A00(c2815Qc);
                }
                this.A01.A00.A04(new NativeAd(this.A01.A01, c2815Qc));
            } else {
                AbstractC2950Vk.A00(new C3411fc(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00();
    }
}
