package D1;

import D1.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C1778k;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.l;
import q.C5486b;

/* compiled from: SavedStateRegistry.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1023b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1024c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1025d;

    /* renamed from: e, reason: collision with root package name */
    public a.C0010a f1026e;

    /* renamed from: a, reason: collision with root package name */
    public final C5486b<String, b> f1022a = new C5486b<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1027f = true;

    /* compiled from: SavedStateRegistry.kt */
    public interface a {
        void a(e eVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (!this.f1025d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f1024c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f1024c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f1024c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1024c = null;
        return bundle2;
    }

    public final b b() {
        String str;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f1022a.iterator();
        do {
            C5486b.e eVar = (C5486b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) eVar.next();
            l.e(components, "components");
            str = (String) components.getKey();
            bVar = (b) components.getValue();
        } while (!l.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b provider) {
        b bVar;
        l.f(provider, "provider");
        C5486b<String, b> c5486b = this.f1022a;
        C5486b.c<String, b> cVarB = c5486b.b(str);
        if (cVarB != null) {
            bVar = cVarB.f45308c;
        } else {
            C5486b.c<K, V> cVar = new C5486b.c<>(str, provider);
            c5486b.f45306e++;
            C5486b.c cVar2 = c5486b.f45304c;
            if (cVar2 == null) {
                c5486b.f45303b = cVar;
                c5486b.f45304c = cVar;
            } else {
                cVar2.f45309d = cVar;
                cVar.f45310e = cVar2;
                c5486b.f45304c = cVar;
            }
            bVar = null;
        }
        if (bVar != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f1027f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a.C0010a c0010a = this.f1026e;
        if (c0010a == null) {
            c0010a = new a.C0010a(this);
        }
        this.f1026e = c0010a;
        try {
            C1778k.a.class.getDeclaredConstructor(new Class[0]);
            a.C0010a c0010a2 = this.f1026e;
            if (c0010a2 != null) {
                c0010a2.f1020a.add(C1778k.a.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + C1778k.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
