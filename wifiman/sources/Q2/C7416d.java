package q2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.C6854b;
import q2.C7414b;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7416d {

    /* renamed from: g, reason: collision with root package name */
    private static final b f58353g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private boolean f58355b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f58356c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f58357d;

    /* renamed from: e, reason: collision with root package name */
    private C7414b.C2052b f58358e;

    /* renamed from: a, reason: collision with root package name */
    private final C6854b f58354a = new C6854b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f58359f = true;

    /* renamed from: q2.d$a */
    public interface a {
        void a(InterfaceC7418f interfaceC7418f);
    }

    /* renamed from: q2.d$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: q2.d$c */
    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7416d this$0, InterfaceC4017o interfaceC4017o, AbstractC4013k.a event) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(interfaceC4017o, "<anonymous parameter 0>");
        AbstractC6492s.i(event, "event");
        if (event == AbstractC4013k.a.ON_START) {
            this$0.f58359f = true;
        } else if (event == AbstractC4013k.a.ON_STOP) {
            this$0.f58359f = false;
        }
    }

    public final Bundle b(String key) {
        AbstractC6492s.i(key, "key");
        if (!this.f58357d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f58356c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f58356c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f58356c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f58356c = null;
        }
        return bundle2;
    }

    public final c c(String key) {
        AbstractC6492s.i(key, "key");
        Iterator it = this.f58354a.iterator();
        while (it.hasNext()) {
            Map.Entry components = (Map.Entry) it.next();
            AbstractC6492s.h(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (AbstractC6492s.d(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC4013k lifecycle) {
        AbstractC6492s.i(lifecycle, "lifecycle");
        if (this.f58355b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC4015m() { // from class: q2.c
            @Override // androidx.lifecycle.InterfaceC4015m
            public final void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
                C7416d.d(this.f58352a, interfaceC4017o, aVar);
            }
        });
        this.f58355b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f58355b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f58357d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f58356c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f58357d = true;
    }

    public final void g(Bundle outBundle) {
        AbstractC6492s.i(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f58356c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C6854b.d dVarF = this.f58354a.f();
        AbstractC6492s.h(dVarF, "this.components.iteratorWithAdditions()");
        while (dVarF.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarF.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(provider, "provider");
        if (((c) this.f58354a.j(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class clazz) throws NoSuchMethodException, SecurityException {
        AbstractC6492s.i(clazz, "clazz");
        if (!this.f58359f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C7414b.C2052b c2052b = this.f58358e;
        if (c2052b == null) {
            c2052b = new C7414b.C2052b(this);
        }
        this.f58358e = c2052b;
        try {
            clazz.getDeclaredConstructor(null);
            C7414b.C2052b c2052b2 = this.f58358e;
            if (c2052b2 != null) {
                String name = clazz.getName();
                AbstractC6492s.h(name, "clazz.name");
                c2052b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void j(String key) {
        AbstractC6492s.i(key, "key");
        this.f58354a.k(key);
    }
}
