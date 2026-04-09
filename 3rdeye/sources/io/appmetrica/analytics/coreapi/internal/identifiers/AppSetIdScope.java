package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes3.dex */
public enum AppSetIdScope {
    UNKNOWN(""),
    APP("app"),
    DEVELOPER("developer");


    /* renamed from: a, reason: collision with root package name */
    private final String f38875a;

    AppSetIdScope(String str) {
        this.f38875a = str;
    }

    public final String getValue() {
        return this.f38875a;
    }
}
