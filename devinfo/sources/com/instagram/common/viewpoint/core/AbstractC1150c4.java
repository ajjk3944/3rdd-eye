package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.c4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1150c4 {
    public static String[] A00 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static AbstractC1149c3 A00(C1153c7 c1153c7, Bundle bundle, boolean z3) {
        AbstractC1149c3 ku;
        c1153c7.A06().A0H().A00(false);
        NR nrA29 = c1153c7.A05().A29();
        double dA00 = AbstractC1140bu.A00(nrA29);
        boolean isWatchAndBrowse = c1153c7.A05().A29().A0T();
        boolean zA06 = AbstractC1140bu.A06(c1153c7.A00(), c1153c7.A01(), dA00);
        AbstractC0688Mt abstractC0688MtA00 = C0689Mu.A00(c1153c7.A06(), c1153c7.A07(), "", XB.A00(c1153c7.A05().A29().A0J().A05()), new HashMap(), c1153c7.A05().A2A());
        boolean z10 = !TextUtils.isEmpty(nrA29.A0H().A09());
        if (C0886Up.A1z(c1153c7.A06())) {
            C1436gi c1436giA06 = c1153c7.A06();
            String[] strArr = A00;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            c1436giA06.A0B().AKn(c1153c7.A02(), c1153c7.A05().A2E(), z10);
        }
        if (isWatchAndBrowse && (abstractC0688MtA00 instanceof AnonymousClass84)) {
            ku = A01(c1153c7) ? new C0599Ji(c1153c7) : new KE(c1153c7);
        } else if (z10) {
            ku = new C6H(c1153c7);
        } else {
            if (c1153c7.A05().A1c()) {
                return new C0619Kc(c1153c7);
            }
            if (c1153c7.A05().A1j()) {
                ku = new C6K(c1153c7);
            } else if (C0886Up.A2i(c1153c7.A06())) {
                ku = new C6J(c1153c7, zA06);
            } else if (zA06) {
                ku = new KZ(c1153c7, c1153c7.A00() == 2);
            } else {
                ku = new KU(c1153c7, AbstractC1140bu.A04(dA00));
            }
        }
        if (z3) {
            ku.A1H(nrA29, c1153c7.A05().A2E(), dA00, bundle);
        }
        return ku;
    }

    public static boolean A01(C1153c7 c1153c7) {
        if (!c1153c7.A05().A1y()) {
            boolean zA1c = c1153c7.A05().A1c();
            String[] strArr = A00;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[5] = "BfXu055milBajq8QiXDIPY7ZZDWb7rZy";
            strArr2[7] = "zfsTxDhfKJjHYbZVz1DIv6IoDbSXcVhK";
            if (!zA1c) {
                return false;
            }
        }
        return true;
    }
}
