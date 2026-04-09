package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f18734c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f18735d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f18736e;

    public a(b.InterfaceC0110b interfaceC0110b, HashSet<String> hashSet, JSONObject jSONObject, long j6) {
        super(interfaceC0110b);
        this.f18734c = new HashSet<>(hashSet);
        this.f18735d = jSONObject;
        this.f18736e = j6;
    }
}
