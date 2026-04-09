package androidx.lifecycle;

import androidx.lifecycle.AbstractC4013k;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class F implements InterfaceC4015m {

    /* renamed from: a, reason: collision with root package name */
    private final I f31601a;

    public F(I provider) {
        AbstractC6492s.i(provider, "provider");
        this.f31601a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC4015m
    public void j(InterfaceC4017o source, AbstractC4013k.a event) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(event, "event");
        if (event == AbstractC4013k.a.ON_CREATE) {
            source.O().c(this);
            this.f31601a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
