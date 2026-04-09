package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f12438c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f12439d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f12440e;

    public a(b.InterfaceC0230b interfaceC0230b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0230b);
        this.f12438c = new HashSet<>(hashSet);
        this.f12439d = jSONObject;
        this.f12440e = j10;
    }
}
