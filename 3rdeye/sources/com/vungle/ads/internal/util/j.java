package com.vungle.ads.internal.util;

import Q9.M;
import R9.C;
import R9.z;
import c9.C2078B;

/* compiled from: JsonUtil.kt */
/* loaded from: classes2.dex */
public final class j {
    public static final j INSTANCE = new j();

    private j() {
    }

    public final String getContentStringValue(z json, String key) {
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(key, "key");
        try {
            R9.i iVar = (R9.i) C2078B.n(json, key);
            M m10 = R9.j.f11806a;
            kotlin.jvm.internal.l.f(iVar, "<this>");
            C c10 = iVar instanceof C ? (C) iVar : null;
            if (c10 != null) {
                return c10.c();
            }
            R9.j.c(iVar, "JsonPrimitive");
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }
}
