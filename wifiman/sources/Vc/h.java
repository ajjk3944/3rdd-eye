package Vc;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Map f23358a;

    public h(Map info) {
        AbstractC6492s.i(info, "info");
        this.f23358a = info;
    }

    public Map a() {
        return this.f23358a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && AbstractC6492s.d(this.f23358a, ((h) obj).f23358a);
    }

    public int hashCode() {
        return this.f23358a.hashCode();
    }

    public String toString() {
        return "UpnpXmlService(info=" + this.f23358a + ")";
    }
}
