package l7;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14893a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14894d;

    public /* synthetic */ b(int i10, Object obj) {
        this.f14893a = i10;
        this.f14894d = obj;
    }

    @Override // androidx.lifecycle.t
    public final void b(v vVar, m mVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        switch (this.f14893a) {
            case 0:
                e eVar = (e) this.f14894d;
                if (mVar != m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                vVar.h().m1(this);
                Bundle bundleK = eVar.f().k("androidx.savedstate.Restarter");
                if (bundleK == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleK.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        l.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                l.b(objNewInstance);
                                if (!(eVar instanceof w0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
                                }
                                v0 v0VarD = ((w0) eVar).d();
                                io.sentry.t tVarF = eVar.f();
                                v0VarD.getClass();
                                LinkedHashMap linkedHashMap = v0VarD.f1523a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    l.e(str2, "key");
                                    s0 s0Var = (s0) linkedHashMap.get(str2);
                                    if (s0Var != null) {
                                        o0.a(s0Var, tVarF, eVar.h());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    tVarF.I();
                                }
                            } catch (Exception e4) {
                                throw new RuntimeException(c7.a.p("Failed to instantiate ", str), e4);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(h0.b.o("Class ", str, " wasn't found"), e11);
                    }
                }
                return;
            case 1:
                new HashMap();
                g[] gVarArr = (g[]) this.f14894d;
                if (gVarArr.length > 0) {
                    g gVar = gVarArr[0];
                    throw null;
                }
                if (gVarArr.length <= 0) {
                    return;
                }
                g gVar2 = gVarArr[0];
                throw null;
            case 2:
                if (mVar != m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + mVar).toString());
                }
                vVar.h().m1(this);
                q0 q0Var = (q0) this.f14894d;
                if (q0Var.f1517b) {
                    return;
                }
                Bundle bundleK2 = q0Var.f1516a.k("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundleM = e5.m((lq.l[]) Arrays.copyOf(new lq.l[0], 0));
                Bundle bundle = q0Var.f1518c;
                if (bundle != null) {
                    bundleM.putAll(bundle);
                }
                if (bundleK2 != null) {
                    bundleM.putAll(bundleK2);
                }
                q0Var.f1518c = bundleM;
                q0Var.f1517b = true;
                return;
            default:
                if (mVar != m.ON_STOP || (view = ((androidx.fragment.app.b) this.f14894d).f1413e0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
        }
    }
}
