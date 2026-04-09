package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    private final String f38872a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdScope f38873b;

    public AppSetId(String str, AppSetIdScope appSetIdScope) {
        this.f38872a = str;
        this.f38873b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appSetId.f38872a;
        }
        if ((i & 2) != 0) {
            appSetIdScope = appSetId.f38873b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    public final String component1() {
        return this.f38872a;
    }

    public final AppSetIdScope component2() {
        return this.f38873b;
    }

    public final AppSetId copy(String str, AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return l.b(this.f38872a, appSetId.f38872a) && this.f38873b == appSetId.f38873b;
    }

    public final String getId() {
        return this.f38872a;
    }

    public final AppSetIdScope getScope() {
        return this.f38873b;
    }

    public int hashCode() {
        String str = this.f38872a;
        return this.f38873b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "AppSetId(id=" + this.f38872a + ", scope=" + this.f38873b + ')';
    }
}
