package k0;

import e.AbstractC2286c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2611o extends AbstractC2286c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f21661a;

    public C2611o(AtomicReference atomicReference) {
        this.f21661a = atomicReference;
    }

    @Override // e.AbstractC2286c
    public final void a(Object obj) {
        AbstractC2286c abstractC2286c = (AbstractC2286c) this.f21661a.get();
        if (abstractC2286c == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC2286c.a(obj);
    }
}
