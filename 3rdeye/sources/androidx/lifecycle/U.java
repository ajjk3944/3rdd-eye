package androidx.lifecycle;

import D1.c;
import N7.G8;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.Q;
import j1.AbstractC5165a;
import j1.C5166b;
import java.util.LinkedHashMap;
import k1.C5209c;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16101a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final c f16102b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a f16103c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class b {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class c {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class d implements f0 {
        @Override // androidx.lifecycle.f0
        public final b0 a(Class cls) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        @Override // androidx.lifecycle.f0
        public final /* synthetic */ b0 b(kotlin.jvm.internal.e eVar, C5166b c5166b) {
            return G8.c(this, eVar, c5166b);
        }

        @Override // androidx.lifecycle.f0
        public final b0 c(Class cls, C5166b c5166b) {
            return new W();
        }
    }

    public static final Q a(C5166b c5166b) {
        b bVar = f16101a;
        LinkedHashMap linkedHashMap = c5166b.f42676a;
        D1.e eVar = (D1.e) linkedHashMap.get(bVar);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        j0 j0Var = (j0) linkedHashMap.get(f16102b);
        if (j0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f16103c);
        String str = (String) linkedHashMap.get(C5209c.f43154a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        c.b bVarB = eVar.getSavedStateRegistry().b();
        V v10 = bVarB instanceof V ? (V) bVarB : null;
        if (v10 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = c(j0Var).f16109b;
        Q q10 = (Q) linkedHashMap2.get(str);
        if (q10 != null) {
            return q10;
        }
        Class<? extends Object>[] clsArr = Q.f16091f;
        v10.b();
        Bundle bundle2 = v10.f16106c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = v10.f16106c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = v10.f16106c;
        if (bundle5 != null && bundle5.isEmpty()) {
            v10.f16106c = null;
        }
        Q qA = Q.a.a(bundle3, bundle);
        linkedHashMap2.put(str, qA);
        return qA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends D1.e & j0> void b(T t10) {
        AbstractC1781n.b currentState = t10.getLifecycle().getCurrentState();
        if (currentState != AbstractC1781n.b.INITIALIZED && currentState != AbstractC1781n.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t10.getSavedStateRegistry().b() == null) {
            V v10 = new V(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", v10);
            t10.getLifecycle().addObserver(new S(v10));
        }
    }

    public static final W c(j0 j0Var) {
        d dVar = new d();
        i0 store = j0Var.getViewModelStore();
        AbstractC5165a defaultCreationExtras = j0Var instanceof InterfaceC1777j ? ((InterfaceC1777j) j0Var).getDefaultViewModelCreationExtras() : AbstractC5165a.C0471a.f42677b;
        kotlin.jvm.internal.l.f(store, "store");
        kotlin.jvm.internal.l.f(defaultCreationExtras, "defaultCreationExtras");
        return (W) new N5.c(store, dVar, defaultCreationExtras).f(kotlin.jvm.internal.x.a(W.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
