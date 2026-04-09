package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements b.InterfaceC0361b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f23641a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f23642b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f23642b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0361b
    public JSONObject a() {
        return this.f23641a;
    }

    public void b() {
        this.f23642b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0361b
    public void a(JSONObject jSONObject) {
        this.f23641a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j4) {
        this.f23642b.b(new f(this, hashSet, jSONObject, j4));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j4) {
        this.f23642b.b(new e(this, hashSet, jSONObject, j4));
    }
}
