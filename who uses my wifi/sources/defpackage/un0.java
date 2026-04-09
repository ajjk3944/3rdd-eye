package defpackage;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class un0 implements y50 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ un0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.y50
    public final void a(b60 b60Var, t50 t50Var) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        switch (this.f) {
            case 0:
                at0 at0Var = (at0) this.g;
                if (t50Var != t50.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                b60Var.e().f(this);
                Bundle bundleE = at0Var.a().e("androidx.savedstate.Restarter");
                if (bundleE == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleE.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, un0.class.getClassLoader()).asSubclass(xs0.class);
                        i30.j(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                i30.j(objNewInstance);
                                if (!(at0Var instanceof r61)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + at0Var).toString());
                                }
                                q61 q61VarD = ((r61) at0Var).d();
                                vq2 vq2VarA = at0Var.a();
                                q61VarD.getClass();
                                LinkedHashMap linkedHashMap = q61VarD.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    i30.m(str3, "key");
                                    m61 m61Var = (m61) linkedHashMap.get(str3);
                                    if (m61Var != null) {
                                        i30.f(m61Var, vq2VarA, at0Var.e());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    vq2VarA.r();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException("Failed to instantiate " + str2, e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(ex0.h("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                i5 i5Var = (i5) this.g;
                if (i5Var.j == null) {
                    zg zgVar = (zg) i5Var.getLastNonConfigurationInstance();
                    if (zgVar != null) {
                        i5Var.j = zgVar.a;
                    }
                    if (i5Var.j == null) {
                        i5Var.j = new q61();
                    }
                }
                i5Var.f.f(this);
                return;
            case 2:
                new HashMap();
                vy[] vyVarArr = (vy[]) this.g;
                if (vyVarArr.length > 0) {
                    vy vyVar = vyVarArr[0];
                    throw null;
                }
                if (vyVarArr.length <= 0) {
                    return;
                }
                vy vyVar2 = vyVarArr[0];
                throw null;
            case 3:
                if (t50Var != t50.ON_STOP || (view = ((iw) this.g).J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (t50Var == t50.ON_CREATE) {
                    b60Var.e().f(this);
                    ((vs0) this.g).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + t50Var).toString());
                }
        }
    }
}
