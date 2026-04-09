package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import k.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final b f4129g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f4131b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f4132c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4133d;

    /* renamed from: e, reason: collision with root package name */
    public Recreator.b f4134e;

    /* renamed from: a, reason: collision with root package name */
    public final k.b f4130a = new k.b();

    /* renamed from: f, reason: collision with root package name */
    public boolean f4135f = true;

    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0046a {
        void a(d dVar);
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public b() {
        }
    }

    public interface c {
        Bundle a();
    }

    public static final void d(a this$0, n nVar, Lifecycle.Event event) {
        p.e(this$0, "this$0");
        p.e(nVar, "<anonymous parameter 0>");
        p.e(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this$0.f4135f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this$0.f4135f = false;
        }
    }

    public final Bundle b(String key) {
        p.e(key, "key");
        if (!this.f4133d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f4132c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f4132c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f4132c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f4132c = null;
        return bundle2;
    }

    public final c c(String key) {
        p.e(key, "key");
        Iterator it = this.f4130a.iterator();
        while (it.hasNext()) {
            Map.Entry components = (Map.Entry) it.next();
            p.d(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (p.a(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(Lifecycle lifecycle) {
        p.e(lifecycle, "lifecycle");
        if (this.f4131b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new j() { // from class: t1.b
            @Override // androidx.lifecycle.j
            public final void onStateChanged(n nVar, Lifecycle.Event event) {
                androidx.savedstate.a.d(this.f24377a, nVar, event);
            }
        });
        this.f4131b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f4131b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f4133d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f4132c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f4133d = true;
    }

    public final void g(Bundle outBundle) {
        p.e(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4132c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        b.d dVarD = this.f4130a.d();
        p.d(dVarD, "this.components.iteratorWithAdditions()");
        while (dVarD.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        p.e(key, "key");
        p.e(provider, "provider");
        if (((c) this.f4130a.g(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class clazz) throws NoSuchMethodException, SecurityException {
        p.e(clazz, "clazz");
        if (!this.f4135f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.f4134e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f4134e = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.f4134e;
            if (bVar2 != null) {
                String name = clazz.getName();
                p.d(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
