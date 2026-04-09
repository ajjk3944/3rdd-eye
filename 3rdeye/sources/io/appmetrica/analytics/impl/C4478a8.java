package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.a8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4478a8 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f40509a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40510b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40511c;

    public C4478a8(String str, HashMap map, String str2) {
        this.f40510b = str;
        this.f40509a = map;
        this.f40511c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f40509a);
        sb.append(", mDeeplink='");
        sb.append(this.f40510b);
        sb.append("', mUnparsedReferrer='");
        return B4.f.c(sb, this.f40511c, "'}");
    }
}
