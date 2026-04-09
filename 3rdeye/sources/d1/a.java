package D1;

import D1.c;
import N7.C1154e9;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import androidx.work.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l;

/* compiled from: Recreator.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final e f1019b;

    /* compiled from: Recreator.kt */
    /* renamed from: D1.a$a, reason: collision with other inner class name */
    public static final class C0010a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f1020a;

        public C0010a(c registry) {
            l.f(registry, "registry");
            this.f1020a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // D1.c.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1020a));
            return bundle;
        }
    }

    public a(e eVar) {
        this.f1019b = eVar;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (aVar != AbstractC1781n.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1790x.getLifecycle().removeObserver(this);
        e eVar = this.f1019b;
        Bundle bundleA = eVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(c.a.class);
                l.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        l.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((c.a) objNewInstance).a(eVar);
                    } catch (Exception e4) {
                        throw new RuntimeException(s.d("Failed to instantiate ", str), e4);
                    }
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                }
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(C1154e9.i("Class ", str, " wasn't found"), e11);
            }
        }
    }
}
