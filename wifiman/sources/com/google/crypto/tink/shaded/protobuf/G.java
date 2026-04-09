package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class G extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final G f38442b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f38443a;

    static {
        G g10 = new G();
        f38442b = g10;
        g10.E();
    }

    private G() {
        this.f38443a = true;
    }

    static int d(Map map) {
        int iH = 0;
        for (Map.Entry entry : map.entrySet()) {
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    private static int h(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC5097y.d((byte[]) obj);
        }
        if (obj instanceof AbstractC5097y.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void l(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC5097y.a(obj);
            AbstractC5097y.a(map.get(obj));
        }
    }

    public static G n() {
        return f38442b;
    }

    private void p() {
        if (!B()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean r(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean t(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !r(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public boolean B() {
        return this.f38443a;
    }

    public void E() {
        this.f38443a = false;
    }

    public void K(G g10) {
        p();
        if (g10.isEmpty()) {
            return;
        }
        putAll(g10);
    }

    public G P() {
        return isEmpty() ? new G() : new G(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        p();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && t(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return d(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        p();
        AbstractC5097y.a(obj);
        AbstractC5097y.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        p();
        l(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        p();
        return super.remove(obj);
    }

    private G(Map map) {
        super(map);
        this.f38443a = true;
    }
}
