package F0;

import C5.o;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.InterfaceC0286h;
import androidx.lifecycle.InterfaceC0296s;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import c.C0385j;
import d5.AbstractC2282j;
import h.AbstractActivityC2349g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import k0.AbstractComponentCallbacksC2617v;
import k0.DialogInterfaceOnCancelListenerC2610n;
import q0.C2794g;
import q5.i;
import s0.AbstractC2882c;
import s0.C2883d;

/* loaded from: classes.dex */
public final class b implements InterfaceC0296s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1431a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1432b;

    public /* synthetic */ b(int i, Object obj) {
        this.f1431a = i;
        this.f1432b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        switch (this.f1431a) {
            case 0:
                g gVar = (g) this.f1432b;
                if (enumC0291m != EnumC0291m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0298u.j().f(this);
                Bundle bundleC = gVar.f().c("androidx.savedstate.Restarter");
                if (bundleC == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(d.class);
                        i.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                i.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(gVar instanceof b0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                a0 a0VarD = ((b0) gVar).d();
                                f fVarF = gVar.f();
                                a0VarD.getClass();
                                LinkedHashMap linkedHashMap = a0VarD.f5233a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    i.e(str3, "key");
                                    X x6 = (X) linkedHashMap.get(str3);
                                    i.b(x6);
                                    Q.a(x6, fVarF, gVar.j());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    fVarF.g();
                                }
                            } catch (Exception e6) {
                                throw new RuntimeException(A.f.l("Failed to instantiate ", str2), e6);
                            }
                        } catch (NoSuchMethodException e7) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                        }
                    } catch (ClassNotFoundException e8) {
                        throw new RuntimeException(A.f.m("Class ", str2, " wasn't found"), e8);
                    }
                }
                return;
            case 1:
                ((R0.d) this.f1432b).b(false);
                return;
            case 2:
                new HashMap();
                InterfaceC0286h[] interfaceC0286hArr = (InterfaceC0286h[]) this.f1432b;
                if (interfaceC0286hArr.length > 0) {
                    InterfaceC0286h interfaceC0286h = interfaceC0286hArr[0];
                    throw null;
                }
                if (interfaceC0286hArr.length <= 0) {
                    return;
                }
                InterfaceC0286h interfaceC0286h2 = interfaceC0286hArr[0];
                throw null;
            case 3:
                if (enumC0291m != EnumC0291m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0291m).toString());
                }
                interfaceC0298u.j().f(this);
                ((S) this.f1432b).b();
                return;
            case 4:
                AbstractActivityC2349g abstractActivityC2349g = (AbstractActivityC2349g) this.f1432b;
                if (abstractActivityC2349g.f5858e == null) {
                    C0385j c0385j = (C0385j) abstractActivityC2349g.getLastNonConfigurationInstance();
                    if (c0385j != null) {
                        abstractActivityC2349g.f5858e = c0385j.f5834a;
                    }
                    if (abstractActivityC2349g.f5858e == null) {
                        abstractActivityC2349g.f5858e = new a0();
                    }
                }
                abstractActivityC2349g.f1476a.f(this);
                return;
            case 5:
                if (enumC0291m != EnumC0291m.ON_STOP || (view = ((AbstractComponentCallbacksC2617v) this.f1432b).f21696T) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                C2883d c2883d = (C2883d) this.f1432b;
                int i3 = AbstractC2882c.f23403a[enumC0291m.ordinal()];
                if (i3 == 1) {
                    DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = (DialogInterfaceOnCancelListenerC2610n) interfaceC0298u;
                    Iterable iterable = (Iterable) ((o) c2883d.b().f22982e.f73b).I();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (i.a(((C2794g) it2.next()).f22969f, dialogInterfaceOnCancelListenerC2610n.M)) {
                                return;
                            }
                        }
                    }
                    dialogInterfaceOnCancelListenerC2610n.X();
                    return;
                }
                Object obj = null;
                if (i3 == 2) {
                    DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n2 = (DialogInterfaceOnCancelListenerC2610n) interfaceC0298u;
                    for (Object obj2 : (Iterable) ((o) c2883d.b().f22983f.f73b).I()) {
                        if (i.a(((C2794g) obj2).f22969f, dialogInterfaceOnCancelListenerC2610n2.M)) {
                            obj = obj2;
                        }
                    }
                    C2794g c2794g = (C2794g) obj;
                    if (c2794g != null) {
                        c2883d.b().b(c2794g);
                        return;
                    }
                    return;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        return;
                    }
                    DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n3 = (DialogInterfaceOnCancelListenerC2610n) interfaceC0298u;
                    for (Object obj3 : (Iterable) ((o) c2883d.b().f22983f.f73b).I()) {
                        if (i.a(((C2794g) obj3).f22969f, dialogInterfaceOnCancelListenerC2610n3.M)) {
                            obj = obj3;
                        }
                    }
                    C2794g c2794g2 = (C2794g) obj;
                    if (c2794g2 != null) {
                        c2883d.b().b(c2794g2);
                    }
                    dialogInterfaceOnCancelListenerC2610n3.b0.f(this);
                    return;
                }
                DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n4 = (DialogInterfaceOnCancelListenerC2610n) interfaceC0298u;
                if (dialogInterfaceOnCancelListenerC2610n4.c0().isShowing()) {
                    return;
                }
                List list = (List) ((o) c2883d.b().f22982e.f73b).I();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        if (i.a(((C2794g) objPrevious).f22969f, dialogInterfaceOnCancelListenerC2610n4.M)) {
                            obj = objPrevious;
                        }
                    }
                }
                C2794g c2794g3 = (C2794g) obj;
                if (!i.a(AbstractC2282j.Z(list), c2794g3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC2610n4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (c2794g3 != null) {
                    c2883d.b().f(c2794g3, false);
                    return;
                }
                return;
        }
    }
}
