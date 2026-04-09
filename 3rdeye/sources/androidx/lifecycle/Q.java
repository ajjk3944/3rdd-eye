package androidx.lifecycle;

import D1.c;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import c9.C2078B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: SavedStateHandle.kt */
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: f, reason: collision with root package name */
    public static final Class<? extends Object>[] f16091f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16092a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16093b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f16094c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f16095d;

    /* renamed from: e, reason: collision with root package name */
    public final c.b f16096e;

    /* compiled from: SavedStateHandle.kt */
    public static final class a {
        public static Q a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new Q();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.l.e(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new Q(map);
            }
            ClassLoader classLoader = Q.class.getClassLoader();
            kotlin.jvm.internal.l.c(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new Q(linkedHashMap);
        }
    }

    /* compiled from: SavedStateHandle.kt */
    public static final class b<T> extends E<T> {
    }

    public Q(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f16092a = linkedHashMap;
        this.f16093b = new LinkedHashMap();
        this.f16094c = new LinkedHashMap();
        this.f16095d = new LinkedHashMap();
        this.f16096e = new c.b() { // from class: androidx.lifecycle.P
            @Override // D1.c.b
            public final Bundle a() {
                return Q.a(this.f16090a);
            }
        };
        linkedHashMap.putAll(map);
    }

    public static Bundle a(Q this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Iterator it = C2078B.t(this$0.f16093b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f16092a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return G0.d.a(new b9.l("keys", arrayList), new b9.l("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle bundleA = ((c.b) entry.getValue()).a();
            kotlin.jvm.internal.l.f(key, "key");
            if (bundleA != null) {
                Class<? extends Object>[] clsArr = f16091f;
                for (int i = 0; i < 29; i++) {
                    Class<? extends Object> cls = clsArr[i];
                    kotlin.jvm.internal.l.c(cls);
                    if (!cls.isInstance(bundleA)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Object obj = this$0.f16094c.get(key);
            E e4 = obj instanceof E ? (E) obj : null;
            if (e4 != null) {
                e4.j(bundleA);
            } else {
                linkedHashMap.put(key, bundleA);
            }
            D9.y yVar = (D9.y) this$0.f16095d.get(key);
            if (yVar != null) {
                yVar.setValue(bundleA);
            }
        }
    }

    public Q() {
        this.f16092a = new LinkedHashMap();
        this.f16093b = new LinkedHashMap();
        this.f16094c = new LinkedHashMap();
        this.f16095d = new LinkedHashMap();
        this.f16096e = new c.b() { // from class: androidx.lifecycle.P
            @Override // D1.c.b
            public final Bundle a() {
                return Q.a(this.f16090a);
            }
        };
    }
}
