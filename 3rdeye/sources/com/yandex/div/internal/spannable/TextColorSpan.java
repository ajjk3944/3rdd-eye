package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.l;

/* compiled from: TextColorSpan.kt */
/* loaded from: classes.dex */
public final class TextColorSpan extends ForegroundColorSpan {
    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        l.f(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setShader(null);
    }
}
