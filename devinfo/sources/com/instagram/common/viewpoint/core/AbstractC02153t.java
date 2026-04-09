package com.instagram.common.viewpoint.core;

import android.text.Spannable;

/* renamed from: com.facebook.ads.redexgen.X.3t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC02153t {
    public static void A00(Spannable spannable, Object obj, int i4, int i10, int i11) {
        for (Object obj2 : spannable.getSpans(i4, i10, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i4 && spannable.getSpanEnd(obj2) == i10 && spannable.getSpanFlags(obj2) == i11) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i4, i10, i11);
    }
}
