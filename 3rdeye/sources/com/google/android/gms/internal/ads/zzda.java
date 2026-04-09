package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzda {
    public static void zza(Spannable spannable, float f10, int i, int i10, int i11) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i10, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i10) {
                f10 = relativeSizeSpan.getSizeChange() * f10;
            }
            zzc(spannable, relativeSizeSpan, i, i10, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f10), i, i10, 33);
    }

    public static void zzb(Spannable spannable, Object obj, int i, int i10, int i11) {
        for (Object obj2 : spannable.getSpans(i, i10, obj.getClass())) {
            zzc(spannable, obj2, i, i10, 33);
        }
        spannable.setSpan(obj, i, i10, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int i, int i10, int i11) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i10 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
