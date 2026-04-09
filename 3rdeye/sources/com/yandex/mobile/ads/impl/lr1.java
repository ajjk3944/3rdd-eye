package com.yandex.mobile.ads.impl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class lr1 {

    /* renamed from: a, reason: collision with root package name */
    private final DecimalFormat f30089a;

    public lr1() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f30089a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String value) throws k61 {
        kotlin.jvm.internal.l.f(value, "value");
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < value.length(); i++) {
                char cCharAt = value.charAt(i);
                if (!com.google.gson.internal.c.t(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            kotlin.jvm.internal.l.e(string, "toString(...)");
            String str = this.f30089a.format(Long.parseLong(string));
            kotlin.jvm.internal.l.e(str, "format(...)");
            return str;
        } catch (NumberFormatException unused) {
            String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{value}, 1));
            int i10 = fp0.f27419b;
            throw new k61("Native Ad json has not required attributes");
        }
    }
}
