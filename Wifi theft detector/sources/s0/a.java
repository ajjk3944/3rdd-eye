package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f24189a;

    /* renamed from: b, reason: collision with root package name */
    public final x f24190b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24191c;

    public a(int i10, x xVar, int i11) {
        this.f24189a = i10;
        this.f24190b = xVar;
        this.f24191c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f24189a);
        this.f24190b.c0(this.f24191c, bundle);
    }
}
