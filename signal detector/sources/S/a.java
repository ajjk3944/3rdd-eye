package S;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f3428a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3430c;

    public a(int i, d dVar, int i3) {
        this.f3428a = i;
        this.f3429b = dVar;
        this.f3430c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3428a);
        this.f3429b.f3446a.performAction(this.f3430c, bundle);
    }
}
