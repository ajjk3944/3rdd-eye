package com.iab.omid.library.applovin.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements b.InterfaceC0226b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f12318a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f12319b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f12319b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0226b
    @VisibleForTesting
    public JSONObject a() {
        return this.f12318a;
    }

    public void b() {
        this.f12319b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0226b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f12318a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f12319b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f12319b.b(new e(this, hashSet, jSONObject, j10));
    }
}
