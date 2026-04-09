package com.vungle.ads.internal.util;

import java.util.HashSet;

/* compiled from: CollectionsConcurrencyUtil.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public static final synchronized void addToSet(HashSet<String> hashset, String set) {
        kotlin.jvm.internal.l.f(hashset, "hashset");
        kotlin.jvm.internal.l.f(set, "set");
        hashset.add(set);
    }

    public static final synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }
}
