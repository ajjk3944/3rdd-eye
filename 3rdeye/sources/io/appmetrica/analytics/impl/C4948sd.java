package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4948sd implements ModuleSelfReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Zj f41641a = AbstractC4962t1.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f41642b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th) {
        Zj zj = this.f41641a;
        zj.getClass();
        zj.a(new C5130zj(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        Zj zj = this.f41641a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f41642b).withName(str).build();
        zj.getClass();
        zj.a(new Oj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f41641a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        Zj zj = this.f41641a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f41642b).withName(str).withAttributes(map).build();
        zj.getClass();
        zj.a(new Oj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        Zj zj = this.f41641a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f41642b).withName(str).withValue(str2).build();
        zj.getClass();
        zj.a(new Oj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i, String str, String str2) {
        Zj zj = this.f41641a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i).withName(str).withValue(str2).build();
        zj.getClass();
        zj.a(new Oj(moduleEventBuild));
    }
}
