package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* renamed from: com.yandex.mobile.ads.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4085c2 {
    public static EnumC4127i2 a(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -318297696) {
                if (iHashCode != 757909789) {
                    if (iHashCode == 1055572677 && str.equals(InstreamAdBreakType.MIDROLL)) {
                        return EnumC4127i2.f28440c;
                    }
                } else if (str.equals(InstreamAdBreakType.POSTROLL)) {
                    return EnumC4127i2.f28441d;
                }
            } else if (str.equals(InstreamAdBreakType.PREROLL)) {
                return EnumC4127i2.f28439b;
            }
        }
        return EnumC4127i2.f28442e;
    }
}
