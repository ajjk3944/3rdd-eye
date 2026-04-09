package Q4;

import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes2.dex */
public final class a0 extends f0.e.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f11151a;

    public a0(String str) {
        this.f11151a = str;
    }

    @Override // Q4.f0.e.f
    public final String a() {
        return this.f11151a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.f) {
            return this.f11151a.equals(((f0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f11151a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return B4.f.c(new StringBuilder("User{identifier="), this.f11151a, "}");
    }
}
