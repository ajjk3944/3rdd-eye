package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdTheme;

/* loaded from: classes3.dex */
public final class iq1 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28839a;

        static {
            int[] iArr = new int[AdTheme.values().length];
            try {
                iArr[AdTheme.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdTheme.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28839a = iArr;
        }
    }

    public static hq1 a(AdTheme adTheme) {
        kotlin.jvm.internal.l.f(adTheme, "adTheme");
        int i = a.f28839a[adTheme.ordinal()];
        if (i == 1) {
            return hq1.f28335d;
        }
        if (i == 2) {
            return hq1.f28334c;
        }
        throw new b9.j();
    }
}
