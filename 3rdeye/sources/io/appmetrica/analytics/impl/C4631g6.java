package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4631g6 extends BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f40928a;

    /* renamed from: b, reason: collision with root package name */
    public String f40929b;

    /* renamed from: c, reason: collision with root package name */
    public C4544cm f40930c;

    public final String b() {
        return this.f40929b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f40928a + "', mAppSystem='" + this.f40929b + "', startupState=" + this.f40930c + '}';
    }

    public final String a() {
        return this.f40928a;
    }
}
