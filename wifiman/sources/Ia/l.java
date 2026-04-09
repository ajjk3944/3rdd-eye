package Ia;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f9035a;

    public l(String str) {
        this.f9035a = str;
    }

    public final String a() {
        return this.f9035a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && AbstractC6492s.d(this.f9035a, ((l) obj).f9035a);
    }

    public int hashCode() {
        String str = this.f9035a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "Result(id=" + this.f9035a + ")";
    }
}
