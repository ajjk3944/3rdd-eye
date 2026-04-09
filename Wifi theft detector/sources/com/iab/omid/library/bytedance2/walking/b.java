package com.iab.omid.library.bytedance2.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements b.InterfaceC0230b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f12447a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f12448b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f12448b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0230b
    @VisibleForTesting
    public JSONObject a() {
        return this.f12447a;
    }

    public void b() {
        this.f12448b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0230b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f12447a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f12448b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f12448b.b(new e(this, hashSet, jSONObject, j10));
    }
}
