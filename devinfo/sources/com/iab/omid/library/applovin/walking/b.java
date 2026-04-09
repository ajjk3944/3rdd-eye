package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements b.InterfaceC0129b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f21018a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f21019b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f21019b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0129b
    public JSONObject a() {
        return this.f21018a;
    }

    public void b() {
        this.f21019b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0129b
    public void a(JSONObject jSONObject) {
        this.f21018a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21019b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21019b.b(new e(this, hashSet, jSONObject, j));
    }
}
