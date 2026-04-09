package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f21063a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21064b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21065c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21066d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21063a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f21064b = view.getClass().getCanonicalName();
        this.f21065c = friendlyObstructionPurpose;
        this.f21066d = str;
    }

    public String a() {
        return this.f21066d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21065c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f21063a;
    }

    public String d() {
        return this.f21064b;
    }
}
