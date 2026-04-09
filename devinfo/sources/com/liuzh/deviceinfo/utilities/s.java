package com.liuzh.deviceinfo.utilities;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class s extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f21302a = 500;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        nk.k.e(textPaint, "ds");
        if (!wi.h.f36759d) {
            textPaint.setUnderlineText(true);
        } else {
            textPaint.setUnderlineText(false);
            textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), this.f21302a, false));
        }
    }
}
