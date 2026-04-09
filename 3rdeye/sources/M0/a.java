package M0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f4117b;

    /* renamed from: c, reason: collision with root package name */
    public final g f4118c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4119d;

    public a(int i, g gVar, int i10) {
        this.f4117b = i;
        this.f4118c = gVar;
        this.f4119d = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4117b);
        this.f4118c.f4122a.performAction(this.f4119d, bundle);
    }
}
