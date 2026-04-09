package w5;

import N7.B8;

/* compiled from: SessionDatastore.kt */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f47429a;

    public m(String str) {
        this.f47429a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && kotlin.jvm.internal.l.b(this.f47429a, ((m) obj).f47429a);
    }

    public final int hashCode() {
        String str = this.f47429a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return B8.j(new StringBuilder("FirebaseSessionsData(sessionId="), this.f47429a, ')');
    }
}
