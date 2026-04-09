package a6;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.a0;
import androidx.lifecycle.e1;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import b5.z;
import d.h;
import d.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import je.u;
import nk.k;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;

    /* renamed from: b, reason: collision with root package name */
    public final f f205b;

    public /* synthetic */ b(f fVar, int i4) {
        this.f204a = i4;
        this.f205b = fVar;
    }

    @Override // androidx.lifecycle.y
    public final void g(a0 a0Var, r rVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        switch (this.f204a) {
            case 0:
                if (rVar != r.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                a0Var.j().b(this);
                f fVar = this.f205b;
                Bundle bundleL = fVar.g().l("androidx.savedstate.Restarter");
                if (bundleL == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleL.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    String str = stringArrayList.get(i4);
                    i4++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        k.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                k.b(objNewInstance);
                                if (!(fVar instanceof k1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + fVar).toString());
                                }
                                j1 j1VarE = ((k1) fVar).e();
                                i iVarG = fVar.g();
                                j1VarE.getClass();
                                LinkedHashMap linkedHashMap = j1VarE.f1157a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    k.e(str3, "key");
                                    e1 e1Var = (e1) linkedHashMap.get(str3);
                                    if (e1Var != null) {
                                        y0.a(e1Var, iVarG, fVar.j());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    iVarG.R();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException(u.t("Failed to instantiate ", str2), e2);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(h.t("Class ", str2, " wasn't found"), e11);
                    }
                }
                return;
            case 1:
                if (rVar != r.ON_STOP || (view = ((z) this.f205b).H) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                j jVar = (j) this.f205b;
                if (jVar.f21607e == null) {
                    d.f fVar2 = (d.f) jVar.getLastNonConfigurationInstance();
                    if (fVar2 != null) {
                        jVar.f21607e = fVar2.f21592a;
                    }
                    if (jVar.f21607e == null) {
                        jVar.f21607e = new j1();
                    }
                }
                jVar.f32744a.b(this);
                return;
        }
    }
}
