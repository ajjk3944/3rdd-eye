package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import kotlin.jvm.internal.l;

/* compiled from: NoStrikethroughSpan.kt */
/* loaded from: classes.dex */
public final class NoStrikethroughSpan extends StrikethroughSpan {
    @Override // android.text.style.StrikethroughSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        l.f(ds, "ds");
        ds.setStrikeThruText(false);
    }
}
