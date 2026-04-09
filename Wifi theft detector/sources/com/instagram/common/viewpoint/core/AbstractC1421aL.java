package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1421aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1425aP A00(AbstractC1979jd abstractC1979jd) {
        if (abstractC1979jd.A2U()) {
            EnumC1425aP enumC1425aP = EnumC1425aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1425aP;
        }
        return EnumC1425aP.A03;
    }

    public static void A01(C1814gi c1814gi, EnumC1422aM enumC1422aM) {
        c1814gi.A0F().AAz(enumC1422aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C1814gi c1814gi, EnumC1422aM enumC1422aM) {
        c1814gi.A0F().AB9(enumC1422aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C1814gi c1814gi, EnumC1422aM enumC1422aM) {
        c1814gi.A0F().AC7(enumC1422aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C1814gi c1814gi, EnumC1422aM enumC1422aM) {
        A01(c1814gi, enumC1422aM);
    }

    public static void A05(C1814gi c1814gi, EnumC1422aM enumC1422aM) {
        A02(c1814gi, enumC1422aM);
    }

    public static void A06(C1814gi c1814gi, EnumC1422aM enumC1422aM) {
        A03(c1814gi, enumC1422aM);
    }

    public static void A07(VI vi, C1814gi c1814gi, InterfaceC1355Yh interfaceC1355Yh, AbstractC1979jd abstractC1979jd, EnumC1422aM enumC1422aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC1979jd.A2Q()) {
            c1814gi.A0F().AB8(enumC1422aM.name().toLowerCase(Locale.US));
        }
        if (abstractC1979jd.A2U()) {
            c1814gi.A0F().AAy(enumC1422aM.name().toLowerCase(Locale.US));
        }
        C1104Og c1104OgA00 = AbstractC1105Oh.A00(c1814gi.A02());
        C1810ge c1810geA02 = c1814gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (c1104OgA00.A0O(c1810geA02, true)) {
            if (interfaceC1355Yh != null) {
                interfaceC1355Yh.AAo(abstractC1979jd.A2E(), abstractC1979jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC1979jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c1814gi, XB.A00(abstractC1979jd.A2C().A00()), abstractC1979jd.A2E());
        }
    }
}
