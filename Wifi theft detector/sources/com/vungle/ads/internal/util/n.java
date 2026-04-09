package com.vungle.ads.internal.util;

import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n {

    @NotNull
    public static final n INSTANCE = new n();

    private n() {
    }

    @Nullable
    public final String getContentStringValue(@NotNull JsonObject json, @NotNull String key) {
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(key, "key");
        try {
            return z9.g.l((kotlinx.serialization.json.b) kotlin.collections.a.i(json, key)).c();
        } catch (Exception unused) {
            return null;
        }
    }
}
