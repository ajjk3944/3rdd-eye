package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f12231a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12232b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f12233c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12234d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f12231a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f12232b = view.getClass().getCanonicalName();
        this.f12233c = friendlyObstructionPurpose;
        this.f12234d = str;
    }

    public String a() {
        return this.f12234d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f12233c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f12231a;
    }

    public String d() {
        return this.f12232b;
    }
}
