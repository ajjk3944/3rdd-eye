package Q4;

import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes2.dex */
public final class V extends f0.e.d.AbstractC0144d {

    /* renamed from: a, reason: collision with root package name */
    public final String f11125a;

    public V(String str) {
        this.f11125a = str;
    }

    @Override // Q4.f0.e.d.AbstractC0144d
    public final String a() {
        return this.f11125a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.AbstractC0144d) {
            return this.f11125a.equals(((f0.e.d.AbstractC0144d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f11125a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return B4.f.c(new StringBuilder("Log{content="), this.f11125a, "}");
    }
}
