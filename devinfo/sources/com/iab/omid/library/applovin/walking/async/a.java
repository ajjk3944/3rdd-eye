package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f21009c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f21010d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f21011e;

    public a(b.InterfaceC0129b interfaceC0129b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0129b);
        this.f21009c = new HashSet<>(hashSet);
        this.f21010d = jSONObject;
        this.f21011e = j;
    }
}
