package com.ui.sso.auth;

import com.ui.sso.auth.a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    private final String f42188a;

    /* renamed from: b, reason: collision with root package name */
    private final a.EnumC1372a f42189b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String password) {
        super(null);
        AbstractC6492s.i(password, "password");
        this.f42188a = password;
        this.f42189b = a.EnumC1372a.SSO_PASSWORD;
        this.f42190c = password;
    }

    @Override // com.ui.sso.auth.a
    public String a() {
        return this.f42190c;
    }

    @Override // com.ui.sso.auth.a
    public a.EnumC1372a b() {
        return this.f42189b;
    }
}
