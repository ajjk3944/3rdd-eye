package G1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f6763a;

    /* renamed from: b, reason: collision with root package name */
    private final t f6764b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6765c;

    public a(int i10, t tVar, int i11) {
        this.f6763a = i10;
        this.f6764b = tVar;
        this.f6765c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f6763a);
        this.f6764b.X(this.f6765c, bundle);
    }
}
