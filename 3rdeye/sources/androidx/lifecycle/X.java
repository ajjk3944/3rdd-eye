package androidx.lifecycle;

import N7.G8;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.Q;
import j1.C5166b;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import k1.C5209c;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class X extends h0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f16110a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f16111b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f16112c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1781n f16113d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.c f16114e;

    @SuppressLint({"LambdaLast"})
    public X(Application application, D1.e eVar, Bundle bundle) {
        e0 e0Var;
        this.f16114e = eVar.getSavedStateRegistry();
        this.f16113d = eVar.getLifecycle();
        this.f16112c = bundle;
        this.f16110a = application;
        if (application != null) {
            if (e0.f16143c == null) {
                e0.f16143c = new e0(application);
            }
            e0Var = e0.f16143c;
            kotlin.jvm.internal.l.c(e0Var);
        } else {
            e0Var = new e0(null);
        }
        this.f16111b = e0Var;
    }

    @Override // androidx.lifecycle.f0
    public final <T extends b0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.f0
    public final /* synthetic */ b0 b(kotlin.jvm.internal.e eVar, C5166b c5166b) {
        return G8.c(this, eVar, c5166b);
    }

    @Override // androidx.lifecycle.f0
    public final b0 c(Class cls, C5166b c5166b) {
        C5209c c5209c = C5209c.f43154a;
        LinkedHashMap linkedHashMap = c5166b.f42676a;
        String str = (String) linkedHashMap.get(c5209c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(U.f16101a) == null || linkedHashMap.get(U.f16102b) == null) {
            if (this.f16113d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(e0.f16144d);
        boolean zIsAssignableFrom = C1768a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? Y.a(cls, Y.f16116b) : Y.a(cls, Y.f16115a);
        return constructorA == null ? this.f16111b.c(cls, c5166b) : (!zIsAssignableFrom || application == null) ? Y.b(cls, constructorA, U.a(c5166b)) : Y.b(cls, constructorA, application, U.a(c5166b));
    }

    @Override // androidx.lifecycle.h0
    public final void d(b0 b0Var) {
        AbstractC1781n abstractC1781n = this.f16113d;
        if (abstractC1781n != null) {
            D1.c cVar = this.f16114e;
            kotlin.jvm.internal.l.c(cVar);
            C1778k.a(b0Var, cVar, abstractC1781n);
        }
    }

    public final b0 e(Class cls, String str) {
        AbstractC1781n abstractC1781n = this.f16113d;
        if (abstractC1781n == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C1768a.class.isAssignableFrom(cls);
        Application application = this.f16110a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? Y.a(cls, Y.f16116b) : Y.a(cls, Y.f16115a);
        if (constructorA == null) {
            if (application != null) {
                return this.f16111b.a(cls);
            }
            if (g0.f16150a == null) {
                g0.f16150a = new g0();
            }
            g0 g0Var = g0.f16150a;
            kotlin.jvm.internal.l.c(g0Var);
            return g0Var.a(cls);
        }
        D1.c cVar = this.f16114e;
        kotlin.jvm.internal.l.c(cVar);
        Bundle bundleA = cVar.a(str);
        Class<? extends Object>[] clsArr = Q.f16091f;
        Q qA = Q.a.a(bundleA, this.f16112c);
        T t10 = new T(str, qA);
        t10.a(cVar, abstractC1781n);
        AbstractC1781n.b currentState = abstractC1781n.getCurrentState();
        if (currentState == AbstractC1781n.b.INITIALIZED || currentState.isAtLeast(AbstractC1781n.b.STARTED)) {
            cVar.d();
        } else {
            abstractC1781n.addObserver(new C1779l(cVar, abstractC1781n));
        }
        b0 b0VarB = (!zIsAssignableFrom || application == null) ? Y.b(cls, constructorA, qA) : Y.b(cls, constructorA, application, qA);
        b0VarB.a("androidx.lifecycle.savedstate.vm.tag", t10);
        return b0VarB;
    }
}
