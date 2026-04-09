package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f20937a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20938b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f20939c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20940d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f20937a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f20938b = view.getClass().getCanonicalName();
        this.f20939c = friendlyObstructionPurpose;
        this.f20940d = str;
    }

    public String a() {
        return this.f20940d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f20939c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f20937a;
    }

    public String d() {
        return this.f20938b;
    }
}
