package com.google.ar.core;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class E extends LinkedHashMap {
    E() {
        super(1, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
