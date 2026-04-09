package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f21130c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f21131d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f21132e;

    public a(b.InterfaceC0133b interfaceC0133b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0133b);
        this.f21130c = new HashSet<>(hashSet);
        this.f21131d = jSONObject;
        this.f21132e = j;
    }
}
