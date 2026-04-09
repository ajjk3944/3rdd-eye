package We;

import Te.W;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Ue.g f23888a;

    /* renamed from: b, reason: collision with root package name */
    private final W f23889b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f23890c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f23891d;

    public b(Ue.g floorplanController, W scale, s9.d name, s9.d ssid) {
        AbstractC6492s.i(floorplanController, "floorplanController");
        AbstractC6492s.i(scale, "scale");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(ssid, "ssid");
        this.f23888a = floorplanController;
        this.f23889b = scale;
        this.f23890c = name;
        this.f23891d = ssid;
    }

    public final Ue.g a() {
        return this.f23888a;
    }

    public final s9.d b() {
        return this.f23890c;
    }

    public final W c() {
        return this.f23889b;
    }

    public final s9.d d() {
        return this.f23891d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f23888a, bVar.f23888a) && AbstractC6492s.d(this.f23889b, bVar.f23889b) && AbstractC6492s.d(this.f23890c, bVar.f23890c) && AbstractC6492s.d(this.f23891d, bVar.f23891d);
    }

    public int hashCode() {
        return (((((this.f23888a.hashCode() * 31) + this.f23889b.hashCode()) * 31) + this.f23890c.hashCode()) * 31) + this.f23891d.hashCode();
    }

    public String toString() {
        return "RecordData(floorplanController=" + this.f23888a + ", scale=" + this.f23889b + ", name=" + this.f23890c + ", ssid=" + this.f23891d + ")";
    }
}
