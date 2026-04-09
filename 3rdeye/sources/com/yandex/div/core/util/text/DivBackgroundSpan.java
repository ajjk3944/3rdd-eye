package com.yandex.div.core.util.text;

import N7.C1126cb;
import N7.Xa;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.jvm.internal.l;

/* compiled from: DivBackgroundSpan.kt */
/* loaded from: classes.dex */
public final class DivBackgroundSpan extends UnderlineSpan {

    /* renamed from: b, reason: collision with root package name */
    public final C1126cb f23936b;

    /* renamed from: c, reason: collision with root package name */
    public final Xa f23937c;

    public DivBackgroundSpan(C1126cb c1126cb, Xa xa) {
        this.f23936b = c1126cb;
        this.f23937c = xa;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        l.f(ds, "ds");
        ds.setUnderlineText(false);
    }
}
