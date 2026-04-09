package Cf;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2713b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f2714a;

    public c(String ssid) {
        AbstractC6492s.i(ssid, "ssid");
        this.f2714a = ssid;
    }

    public final String a() {
        return this.f2714a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && AbstractC6492s.d(this.f2714a, ((c) obj).f2714a);
    }

    public int hashCode() {
        return this.f2714a.hashCode();
    }

    public String toString() {
        return "Params(ssid=" + this.f2714a + ")";
    }
}
