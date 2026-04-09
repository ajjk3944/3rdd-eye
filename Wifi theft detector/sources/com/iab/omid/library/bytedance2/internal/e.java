package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f12366a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12367b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f12368c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12369d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f12366a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f12367b = view.getClass().getCanonicalName();
        this.f12368c = friendlyObstructionPurpose;
        this.f12369d = str;
    }

    public String a() {
        return this.f12369d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f12368c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f12366a;
    }

    public String d() {
        return this.f12367b;
    }
}
