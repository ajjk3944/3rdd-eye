package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements b.InterfaceC0110b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f18743a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f18744b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f18744b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0110b
    public JSONObject a() {
        return this.f18743a;
    }

    public void b() {
        this.f18744b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0110b
    public void a(JSONObject jSONObject) {
        this.f18743a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j6) {
        this.f18744b.b(new f(this, hashSet, jSONObject, j6));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j6) {
        this.f18744b.b(new e(this, hashSet, jSONObject, j6));
    }
}
