package Vc;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Map f23355a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23356b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23357c;

    public g(Map info, List services, List devices) {
        AbstractC6492s.i(info, "info");
        AbstractC6492s.i(services, "services");
        AbstractC6492s.i(devices, "devices");
        this.f23355a = info;
        this.f23356b = services;
        this.f23357c = devices;
    }

    public final List a() {
        return this.f23357c;
    }

    public Map b() {
        return this.f23355a;
    }

    public final List c() {
        return this.f23356b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC6492s.d(this.f23355a, gVar.f23355a) && AbstractC6492s.d(this.f23356b, gVar.f23356b) && AbstractC6492s.d(this.f23357c, gVar.f23357c);
    }

    public int hashCode() {
        return (((this.f23355a.hashCode() * 31) + this.f23356b.hashCode()) * 31) + this.f23357c.hashCode();
    }

    public String toString() {
        return "UpnpXmlDevice(info=" + this.f23355a + ", services=" + this.f23356b + ", devices=" + this.f23357c + ")";
    }
}
