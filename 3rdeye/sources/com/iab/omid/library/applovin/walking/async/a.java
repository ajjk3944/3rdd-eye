package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f23632c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f23633d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f23634e;

    public a(b.InterfaceC0361b interfaceC0361b, HashSet<String> hashSet, JSONObject jSONObject, long j4) {
        super(interfaceC0361b);
        this.f23632c = new HashSet<>(hashSet);
        this.f23633d = jSONObject;
        this.f23634e = j4;
    }
}
