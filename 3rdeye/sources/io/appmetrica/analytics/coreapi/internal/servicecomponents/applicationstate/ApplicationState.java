package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import io.appmetrica.analytics.impl.L2;

/* loaded from: classes3.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(L2.f39740g),
    VISIBLE("visible");


    /* renamed from: a, reason: collision with root package name */
    private final String f38900a;

    ApplicationState(String str) {
        this.f38900a = str;
    }

    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f38900a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    public String getStringValue() {
        return this.f38900a;
    }
}
