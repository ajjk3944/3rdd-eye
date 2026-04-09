package com.unity3d.ads.core.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import t9.b;
import t9.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt9/i;", "", "elapsedMillis", "(Lt9/i;)D", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeExtensionsKt {
    public static final double elapsedMillis(@NotNull i iVar) {
        p.e(iVar, "<this>");
        return b.G(iVar.a(), DurationUnit.f22190c);
    }
}
