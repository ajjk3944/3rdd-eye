package f4;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f23628a;

    /* renamed from: b, reason: collision with root package name */
    public final f f23629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23630c;

    public a(int i4, f fVar, int i10) {
        this.f23628a = i4;
        this.f23629b = fVar;
        this.f23630c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f23628a);
        this.f23629b.f23651a.performAction(this.f23630c, bundle);
    }
}
