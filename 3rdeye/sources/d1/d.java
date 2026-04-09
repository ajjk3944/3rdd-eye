package D1;

import D1.c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import java.util.Map;
import kotlin.jvm.internal.l;
import q.C5486b;

/* compiled from: SavedStateRegistryController.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f1028a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1029b = new c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1030c;

    public d(e eVar) {
        this.f1028a = eVar;
    }

    public final void a() {
        e eVar = this.f1028a;
        AbstractC1781n lifecycle = eVar.getLifecycle();
        if (lifecycle.getCurrentState() != AbstractC1781n.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.addObserver(new a(eVar));
        final c cVar = this.f1029b;
        cVar.getClass();
        if (cVar.f1023b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.addObserver(new InterfaceC1788v() { // from class: D1.b
            @Override // androidx.lifecycle.InterfaceC1788v
            public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
                c this$0 = cVar;
                l.f(this$0, "this$0");
                if (aVar == AbstractC1781n.a.ON_START) {
                    this$0.f1027f = true;
                } else if (aVar == AbstractC1781n.a.ON_STOP) {
                    this$0.f1027f = false;
                }
            }
        });
        cVar.f1023b = true;
        this.f1030c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f1030c) {
            a();
        }
        AbstractC1781n lifecycle = this.f1028a.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(AbstractC1781n.b.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getCurrentState()).toString());
        }
        c cVar = this.f1029b;
        if (!cVar.f1023b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (cVar.f1025d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        cVar.f1024c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        cVar.f1025d = true;
    }

    public final void c(Bundle bundle) {
        c cVar = this.f1029b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = cVar.f1024c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C5486b<String, c.b> c5486b = cVar.f1022a;
        c5486b.getClass();
        C5486b.d dVar = new C5486b.d();
        c5486b.f45305d.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((c.b) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
