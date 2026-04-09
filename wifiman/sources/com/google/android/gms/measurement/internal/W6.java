package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class W6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36257a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f36258b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4954s5 f36259c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.B2 f36260d;

    W6(String str, EnumC4954s5 enumC4954s5) {
        this(str, Collections.emptyMap(), enumC4954s5, null);
    }

    public final EnumC4954s5 a() {
        return this.f36259c;
    }

    public final com.google.android.gms.internal.measurement.B2 b() {
        return this.f36260d;
    }

    public final String c() {
        return this.f36257a;
    }

    public final Map d() {
        Map map = this.f36258b;
        return map == null ? Collections.emptyMap() : map;
    }

    W6(String str, Map map, EnumC4954s5 enumC4954s5) {
        this(str, map, enumC4954s5, null);
    }

    W6(String str, Map map, EnumC4954s5 enumC4954s5, com.google.android.gms.internal.measurement.B2 b22) {
        this.f36257a = str;
        this.f36258b = map;
        this.f36259c = enumC4954s5;
        this.f36260d = b22;
    }
}
