package V6;

import H6.C0672i;
import N7.C1175g0;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.List;

/* compiled from: PerformActionSpan.kt */
/* loaded from: classes.dex */
public final class f extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final C0672i f12973b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C1175g0> f12974c;

    public f(C0672i c0672i, List<C1175g0> actions) {
        kotlin.jvm.internal.l.f(actions, "actions");
        this.f12973b = c0672i;
        this.f12974c = actions;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        C0672i c0672i = this.f12973b;
        c0672i.f2146a.getDiv2Component$div_release().k().f(c0672i, view, this.f12974c);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        kotlin.jvm.internal.l.f(paint, "paint");
    }
}
