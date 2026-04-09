package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f23557a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23558b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f23559c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23560d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23557a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f23558b = view.getClass().getCanonicalName();
        this.f23559c = friendlyObstructionPurpose;
        this.f23560d = str;
    }

    public String a() {
        return this.f23560d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f23559c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f23557a;
    }

    public String d() {
        return this.f23558b;
    }
}
