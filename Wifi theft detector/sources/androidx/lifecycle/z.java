package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.t0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3553f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Class[] f3554g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final Map f3555a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3556b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3557c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f3558d;

    /* renamed from: e, reason: collision with root package name */
    public final a.c f3559e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final z a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new z();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.p.d(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new z(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new z(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : z.f3554g) {
                kotlin.jvm.internal.p.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public z(Map initialState) {
        kotlin.jvm.internal.p.e(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3555a = linkedHashMap;
        this.f3556b = new LinkedHashMap();
        this.f3557c = new LinkedHashMap();
        this.f3558d = new LinkedHashMap();
        this.f3559e = new a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return z.d(this.f3552a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public static final Bundle d(z this$0) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        for (Map.Entry entry : kotlin.collections.a.u(this$0.f3556b).entrySet()) {
            this$0.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.f3555a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f3555a.get(str));
        }
        return n0.b.a(y8.i.a("keys", arrayList), y8.i.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f3559e;
    }

    public final void e(String key, Object obj) {
        kotlin.jvm.internal.p.e(key, "key");
        if (!f3553f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            kotlin.jvm.internal.p.b(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f3557c.get(key);
        t tVar = obj2 instanceof t ? (t) obj2 : null;
        if (tVar != null) {
            tVar.k(obj);
        } else {
            this.f3555a.put(key, obj);
        }
        t0 t0Var = (t0) this.f3558d.get(key);
        if (t0Var == null) {
            return;
        }
        t0Var.setValue(obj);
    }

    public z() {
        this.f3555a = new LinkedHashMap();
        this.f3556b = new LinkedHashMap();
        this.f3557c = new LinkedHashMap();
        this.f3558d = new LinkedHashMap();
        this.f3559e = new a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return z.d(this.f3552a);
            }
        };
    }
}
