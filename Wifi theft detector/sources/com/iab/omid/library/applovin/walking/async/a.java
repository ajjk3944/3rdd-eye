package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f12309c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f12310d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f12311e;

    public a(b.InterfaceC0226b interfaceC0226b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0226b);
        this.f12309c = new HashSet<>(hashSet);
        this.f12310d = jSONObject;
        this.f12311e = j10;
    }
}
