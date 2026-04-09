package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f18665a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18666b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f18667c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18668d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f18665a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f18666b = view.getClass().getCanonicalName();
        this.f18667c = friendlyObstructionPurpose;
        this.f18668d = str;
    }

    public String a() {
        return this.f18668d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f18667c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f18665a;
    }

    public String d() {
        return this.f18666b;
    }
}
