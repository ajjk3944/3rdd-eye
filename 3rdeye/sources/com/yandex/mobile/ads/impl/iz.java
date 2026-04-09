package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class iz {

    /* renamed from: c, reason: collision with root package name */
    public static final iz f28900c = new iz(Collections.EMPTY_MAP);

    /* renamed from: a, reason: collision with root package name */
    private int f28901a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f28902b;

    public iz() {
        this(Collections.EMPTY_MAP);
    }

    public final iz a(yr yrVar) {
        byte[] bytes;
        HashMap map = new HashMap(this.f28902b);
        List<String> listB = yrVar.b();
        for (int i = 0; i < listB.size(); i++) {
            map.remove(listB.get(i));
        }
        for (Map.Entry<String, Object> entry : yrVar.a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bytes = ((String) value).getBytes(fo.f27410c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value;
            }
            map.put(key, bytes);
        }
        Map<String, byte[]> map2 = this.f28902b;
        if (map2.size() == map.size()) {
            for (Map.Entry<String, byte[]> entry2 : map2.entrySet()) {
                if (!Arrays.equals(entry2.getValue(), (byte[]) map.get(entry2.getKey()))) {
                }
            }
            return this;
        }
        return new iz(map);
    }

    public final long b() {
        byte[] bArr = this.f28902b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public final String c() {
        byte[] bArr = this.f28902b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, fo.f27410c);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = this.f28902b;
        Map<String, byte[]> map2 = ((iz) obj).f28902b;
        if (map.size() == map2.size()) {
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f28901a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f28902b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f28901a = iHashCode;
        }
        return this.f28901a;
    }

    public iz(Map<String, byte[]> map) {
        this.f28902b = Collections.unmodifiableMap(map);
    }

    public final Set<Map.Entry<String, byte[]>> a() {
        return this.f28902b.entrySet();
    }
}
