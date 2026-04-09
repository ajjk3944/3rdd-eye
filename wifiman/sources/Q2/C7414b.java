package q2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C7416d;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7414b implements InterfaceC4015m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f58349b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7418f f58350a;

    /* renamed from: q2.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: q2.b$b, reason: collision with other inner class name */
    public static final class C2052b implements C7416d.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f58351a;

        public C2052b(C7416d registry) {
            AbstractC6492s.i(registry, "registry");
            this.f58351a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // q2.C7416d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f58351a));
            return bundle;
        }

        public final void b(String className) {
            AbstractC6492s.i(className, "className");
            this.f58351a.add(className);
        }
    }

    public C7414b(InterfaceC7418f owner) {
        AbstractC6492s.i(owner, "owner");
        this.f58350a = owner;
    }

    private final void a(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, C7414b.class.getClassLoader()).asSubclass(C7416d.a.class);
            AbstractC6492s.h(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    AbstractC6492s.h(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((C7416d.a) objNewInstance).a(this.f58350a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC4015m
    public void j(InterfaceC4017o source, AbstractC4013k.a event) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(event, "event");
        if (event != AbstractC4013k.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.O().c(this);
        Bundle bundleB = this.f58350a.t().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
