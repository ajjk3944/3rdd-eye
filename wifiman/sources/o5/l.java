package o5;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f55429a;

    public l(String str) {
        this.f55429a = str;
    }

    public final String a() {
        return this.f55429a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && AbstractC6492s.d(this.f55429a, ((l) obj).f55429a);
    }

    public int hashCode() {
        String str = this.f55429a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f55429a + ')';
    }
}
