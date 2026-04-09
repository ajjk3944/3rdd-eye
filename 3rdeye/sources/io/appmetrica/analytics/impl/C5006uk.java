package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5006uk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f41785a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f41786b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f41787c;

    public C5006uk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f41785a = sdkIdentifiers;
        this.f41786b = remoteConfigMetaInfo;
        this.f41787c = obj;
    }

    public final C5006uk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C5006uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.f41786b;
    }

    public final Object c() {
        return this.f41787c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5006uk)) {
            return false;
        }
        C5006uk c5006uk = (C5006uk) obj;
        return kotlin.jvm.internal.l.b(this.f41785a, c5006uk.f41785a) && kotlin.jvm.internal.l.b(this.f41786b, c5006uk.f41786b) && kotlin.jvm.internal.l.b(this.f41787c, c5006uk.f41787c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f41787c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f41785a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f41786b;
    }

    public final int hashCode() {
        int iHashCode = (this.f41786b.hashCode() + (this.f41785a.hashCode() * 31)) * 31;
        Object obj = this.f41787c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f41785a + ", remoteConfigMetaInfo=" + this.f41786b + ", featuresConfig=" + this.f41787c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f41785a;
    }

    public static C5006uk a(C5006uk c5006uk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = c5006uk.f41785a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = c5006uk.f41786b;
        }
        if ((i & 4) != 0) {
            obj = c5006uk.f41787c;
        }
        c5006uk.getClass();
        return new C5006uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
