package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import c5.C0407d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f5198f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5199a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5200b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5201c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5202d;

    /* renamed from: e, reason: collision with root package name */
    public final F0.e f5203e;

    public N(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5199a = linkedHashMap;
        this.f5200b = new LinkedHashMap();
        this.f5201c = new LinkedHashMap();
        this.f5202d = new LinkedHashMap();
        this.f5203e = new M(0, this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(N n6) {
        LinkedHashMap linkedHashMap = n6.f5199a;
        Iterator it = d5.v.L(n6.f5200b).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return I5.b.c(new C0407d("keys", arrayList), new C0407d("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle bundleA = ((F0.e) entry.getValue()).a();
            q5.i.e(str2, "key");
            if (bundleA != null) {
                for (int i = 0; i < 29; i++) {
                    Class cls = f5198f[i];
                    q5.i.b(cls);
                    if (!cls.isInstance(bundleA)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Object obj = n6.f5201c.get(str2);
            D d6 = obj instanceof D ? (D) obj : null;
            if (d6 != null) {
                d6.j(bundleA);
            } else {
                linkedHashMap.put(str2, bundleA);
            }
            C5.h hVar = (C5.h) n6.f5202d.get(str2);
            if (hVar != null) {
                ((C5.o) hVar).J(bundleA);
            }
        }
    }

    public N() {
        this.f5199a = new LinkedHashMap();
        this.f5200b = new LinkedHashMap();
        this.f5201c = new LinkedHashMap();
        this.f5202d = new LinkedHashMap();
        this.f5203e = new M(0, this);
    }
}
