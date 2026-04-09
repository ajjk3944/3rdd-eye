package androidx.lifecycle;

import Li.AbstractC3222i;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import f.AbstractC5487d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C7416d;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: f, reason: collision with root package name */
    public static final a f31594f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class[] f31595g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    private final Map f31596a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f31597b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f31598c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f31599d;

    /* renamed from: e, reason: collision with root package name */
    private final C7416d.c f31600e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new E();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    AbstractC6492s.h(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new E(map);
            }
            ClassLoader classLoader = E.class.getClassLoader();
            AbstractC6492s.f(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new E(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : E.f31595g) {
                AbstractC6492s.f(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public E(Map initialState) {
        AbstractC6492s.i(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f31596a = linkedHashMap;
        this.f31597b = new LinkedHashMap();
        this.f31598c = new LinkedHashMap();
        this.f31599d = new LinkedHashMap();
        this.f31600e = new C7416d.c() { // from class: androidx.lifecycle.D
            @Override // q2.C7416d.c
            public final Bundle a() {
                return E.h(this.f31593a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle h(E this$0) {
        AbstractC6492s.i(this$0, "this$0");
        for (Map.Entry entry : Zg.U.t(this$0.f31597b).entrySet()) {
            this$0.i((String) entry.getKey(), ((C7416d.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.f31596a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f31596a.get(str));
        }
        return A1.d.b(Yg.z.a("keys", arrayList), Yg.z.a("values", arrayList2));
    }

    public final boolean c(String key) {
        AbstractC6492s.i(key, "key");
        return this.f31596a.containsKey(key);
    }

    public final Object d(String key) {
        AbstractC6492s.i(key, "key");
        try {
            return this.f31596a.get(key);
        } catch (ClassCastException unused) {
            f(key);
            return null;
        }
    }

    public final Li.N e(String key, Object obj) {
        AbstractC6492s.i(key, "key");
        Map map = this.f31599d;
        Object objA = map.get(key);
        if (objA == null) {
            if (!this.f31596a.containsKey(key)) {
                this.f31596a.put(key, obj);
            }
            objA = Li.P.a(this.f31596a.get(key));
            this.f31599d.put(key, objA);
            map.put(key, objA);
        }
        Li.N nB = AbstractC3222i.b((Li.z) objA);
        AbstractC6492s.g(nB, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return nB;
    }

    public final Object f(String key) {
        AbstractC6492s.i(key, "key");
        Object objRemove = this.f31596a.remove(key);
        AbstractC5487d.a(this.f31598c.remove(key));
        this.f31599d.remove(key);
        return objRemove;
    }

    public final C7416d.c g() {
        return this.f31600e;
    }

    public final void i(String key, Object obj) {
        AbstractC6492s.i(key, "key");
        if (!f31594f.b(obj)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            AbstractC6492s.f(obj);
            sb2.append(obj.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj2 = this.f31598c.get(key);
        C4022u c4022u = obj2 instanceof C4022u ? (C4022u) obj2 : null;
        if (c4022u != null) {
            c4022u.n(obj);
        } else {
            this.f31596a.put(key, obj);
        }
        Li.z zVar = (Li.z) this.f31599d.get(key);
        if (zVar == null) {
            return;
        }
        zVar.setValue(obj);
    }

    public E() {
        this.f31596a = new LinkedHashMap();
        this.f31597b = new LinkedHashMap();
        this.f31598c = new LinkedHashMap();
        this.f31599d = new LinkedHashMap();
        this.f31600e = new C7416d.c() { // from class: androidx.lifecycle.D
            @Override // q2.C7416d.c
            public final Bundle a() {
                return E.h(this.f31593a);
            }
        };
    }
}
