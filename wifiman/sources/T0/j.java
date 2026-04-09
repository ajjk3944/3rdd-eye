package T0;

import L0.AbstractC3179i;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
final class j extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3179i f21324a;

    public j(AbstractC3179i abstractC3179i) {
        this.f21324a = abstractC3179i;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f21324a.a();
    }
}
