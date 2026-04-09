package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class PlatformIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleAdvertisingIdGetter f38878a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdProvider f38879b;

    public PlatformIdentifiers(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        this.f38878a = simpleAdvertisingIdGetter;
        this.f38879b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f38878a;
        }
        if ((i & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f38879b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public final SimpleAdvertisingIdGetter component1() {
        return this.f38878a;
    }

    public final AppSetIdProvider component2() {
        return this.f38879b;
    }

    public final PlatformIdentifiers copy(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return l.b(this.f38878a, platformIdentifiers.f38878a) && l.b(this.f38879b, platformIdentifiers.f38879b);
    }

    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f38878a;
    }

    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f38879b;
    }

    public int hashCode() {
        return this.f38879b.hashCode() + (this.f38878a.hashCode() * 31);
    }

    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f38878a + ", appSetIdProvider=" + this.f38879b + ')';
    }
}
