package com.vungle.ads.internal.util;

import java.util.HashSet;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final e INSTANCE = new e();

    private e() {
    }

    @JvmStatic
    public static final synchronized void addToSet(@NotNull HashSet<String> hashset, @NotNull String set) {
        kotlin.jvm.internal.p.e(hashset, "hashset");
        kotlin.jvm.internal.p.e(set, "set");
        hashset.add(set);
    }

    @JvmStatic
    @NotNull
    public static final synchronized HashSet<String> getNewHashSet(@Nullable HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }
}
