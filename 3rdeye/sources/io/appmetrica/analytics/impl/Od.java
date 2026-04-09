package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* loaded from: classes3.dex */
public final class Od {

    /* renamed from: a, reason: collision with root package name */
    public final Nf f39935a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f39936b;

    /* renamed from: c, reason: collision with root package name */
    public final D0 f39937c;

    /* renamed from: d, reason: collision with root package name */
    public C0 f39938d;

    public Od(Nf nf) {
        this.f39935a = nf;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f39936b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f39937c = new D0();
    }
}
