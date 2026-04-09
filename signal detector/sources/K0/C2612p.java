package k0;

import android.os.Bundle;

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2612p extends AbstractC2615t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC2617v f21662a;

    public C2612p(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        this.f21662a = abstractComponentCallbacksC2617v;
    }

    @Override // k0.AbstractC2615t
    public final void a() {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21662a;
        abstractComponentCallbacksC2617v.f21713f0.c();
        androidx.lifecycle.Q.e(abstractComponentCallbacksC2617v);
        Bundle bundle = abstractComponentCallbacksC2617v.f21705b;
        abstractComponentCallbacksC2617v.f21713f0.e(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
