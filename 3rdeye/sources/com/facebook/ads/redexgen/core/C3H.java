package com.facebook.ads.redexgen.core;

import android.text.Spannable;

/* renamed from: com.facebook.ads.redexgen.X.3H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3H {
    public static void A00(Spannable spannable, Object obj, int i, int i10, int i11) {
        for (Object obj2 : spannable.getSpans(i, i10, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i10 && spannable.getSpanFlags(obj2) == i11) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i10, i11);
    }
}
