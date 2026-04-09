package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Am {

    /* renamed from: a, reason: collision with root package name */
    public final int f39125a;

    public Am(int i) {
        this.f39125a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Am) && this.f39125a == ((Am) obj).f39125a;
    }

    public final int hashCode() {
        return this.f39125a;
    }

    public final String toString() {
        return N7.H7.p(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.f39125a, ')');
    }
}
