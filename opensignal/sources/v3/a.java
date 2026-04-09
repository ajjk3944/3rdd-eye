package v3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f23822a;

    /* renamed from: d, reason: collision with root package name */
    public final c f23823d;

    /* renamed from: g, reason: collision with root package name */
    public final int f23824g;

    public a(int i10, c cVar, int i11) {
        this.f23822a = i10;
        this.f23823d = cVar;
        this.f23824g = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f23822a);
        this.f23823d.f23838a.performAction(this.f23824g, bundle);
    }
}
