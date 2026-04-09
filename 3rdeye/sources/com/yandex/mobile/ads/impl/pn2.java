package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yn2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class pn2 extends yn2 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f31850c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f31851d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f31852e;

    public pn2(yn2.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j4) {
        super(bVar);
        this.f31850c = new HashSet<>(hashSet);
        this.f31851d = jSONObject;
        this.f31852e = j4;
    }
}
