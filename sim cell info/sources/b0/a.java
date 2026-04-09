package b0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    private final int f2407b;

    /* renamed from: c, reason: collision with root package name */
    private final c f2408c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2409d;

    public a(int i2, c cVar, int i3) {
        this.f2407b = i2;
        this.f2408c = cVar;
        this.f2409d = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2407b);
        this.f2408c.G(this.f2409d, bundle);
    }
}
