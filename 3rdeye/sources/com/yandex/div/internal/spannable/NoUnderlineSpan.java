package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.jvm.internal.l;

/* compiled from: NoUnderlineSpan.kt */
/* loaded from: classes.dex */
public final class NoUnderlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        l.f(ds, "ds");
        ds.setUnderlineText(false);
    }
}
