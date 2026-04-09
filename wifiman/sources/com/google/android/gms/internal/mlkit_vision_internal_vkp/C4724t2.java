package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4724t2 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final C4724t2 f35728b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f35729a;

    static {
        C4724t2 c4724t2 = new C4724t2();
        f35728b = c4724t2;
        c4724t2.f35729a = false;
    }

    private C4724t2() {
        this.f35729a = true;
    }

    public static C4724t2 d() {
        return f35728b;
    }

    private static int r(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC4593h2.f35692b;
        int length = bArr.length;
        int iB = AbstractC4593h2.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void t() {
        if (!this.f35729a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        t();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final C4724t2 h() {
        return isEmpty() ? new C4724t2() : new C4724t2(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iR = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iR += r(entry.getValue()) ^ r(entry.getKey());
        }
        return iR;
    }

    public final void l() {
        this.f35729a = false;
    }

    public final void n(C4724t2 c4724t2) {
        t();
        if (c4724t2.isEmpty()) {
            return;
        }
        putAll(c4724t2);
    }

    public final boolean p() {
        return this.f35729a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        t();
        byte[] bArr = AbstractC4593h2.f35692b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        t();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC4593h2.f35692b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        t();
        return super.remove(obj);
    }

    private C4724t2(Map map) {
        super(map);
        this.f35729a = true;
    }
}
