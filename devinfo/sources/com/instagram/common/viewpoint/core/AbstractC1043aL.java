package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1043aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1047aP A00(AbstractC1601jd abstractC1601jd) {
        if (abstractC1601jd.A2U()) {
            EnumC1047aP enumC1047aP = EnumC1047aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1047aP;
        }
        return EnumC1047aP.A03;
    }

    public static void A01(C1436gi c1436gi, EnumC1044aM enumC1044aM) {
        c1436gi.A0F().AAz(enumC1044aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C1436gi c1436gi, EnumC1044aM enumC1044aM) {
        c1436gi.A0F().AB9(enumC1044aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C1436gi c1436gi, EnumC1044aM enumC1044aM) {
        c1436gi.A0F().AC7(enumC1044aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C1436gi c1436gi, EnumC1044aM enumC1044aM) {
        A01(c1436gi, enumC1044aM);
    }

    public static void A05(C1436gi c1436gi, EnumC1044aM enumC1044aM) {
        A02(c1436gi, enumC1044aM);
    }

    public static void A06(C1436gi c1436gi, EnumC1044aM enumC1044aM) {
        A03(c1436gi, enumC1044aM);
    }

    public static void A07(VI vi2, C1436gi c1436gi, InterfaceC0977Yh interfaceC0977Yh, AbstractC1601jd abstractC1601jd, EnumC1044aM enumC1044aM) {
        if (vi2 != null) {
            vi2.A04(VH.A0A, null);
        }
        if (abstractC1601jd.A2Q()) {
            c1436gi.A0F().AB8(enumC1044aM.name().toLowerCase(Locale.US));
        }
        if (abstractC1601jd.A2U()) {
            c1436gi.A0F().AAy(enumC1044aM.name().toLowerCase(Locale.US));
        }
        C0726Og c0726OgA00 = AbstractC0727Oh.A00(c1436gi.A02());
        C1432ge c1432geA02 = c1436gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (c0726OgA00.A0O(c1432geA02, true)) {
            if (interfaceC0977Yh != null) {
                interfaceC0977Yh.AAo(abstractC1601jd.A2E(), abstractC1601jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC1601jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c1436gi, XB.A00(abstractC1601jd.A2C().A00()), abstractC1601jd.A2E());
        }
    }
}
