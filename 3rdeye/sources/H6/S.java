package H6;

import android.view.View;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import c9.C2089j;
import h7.C4422c;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class S implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0675l f2105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0675l f2106c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f2107d;

    public S(C0675l c0675l, C0675l c0675l2, Q q10) {
        this.f2105b = c0675l;
        this.f2106c = c0675l2;
        this.f2107d = q10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2105b.removeOnAttachStateChangeListener(this);
        C0675l c0675l = this.f2106c;
        kotlin.jvm.internal.l.f(c0675l, "<this>");
        k0 nextFunction = k0.f16161g;
        kotlin.jvm.internal.l.f(nextFunction, "nextFunction");
        InterfaceC1790x interfaceC1790x = (InterfaceC1790x) x9.l.G(x9.l.K(new x9.f(new C2089j(c0675l, 5), nextFunction), l0.f16164g));
        if (interfaceC1790x != null) {
            this.f2107d.a(interfaceC1790x, c0675l);
        } else {
            int i = C4422c.f38270a;
            C7.a aVar = C7.a.ERROR;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
