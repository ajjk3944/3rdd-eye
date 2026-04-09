package Be;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1361a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f1362b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f1363c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1364d;

    /* renamed from: e, reason: collision with root package name */
    private final List f1365e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1366f;

    /* renamed from: g, reason: collision with root package name */
    private final s9.d f1367g;

    /* renamed from: h, reason: collision with root package name */
    private final s9.d f1368h;

    /* renamed from: i, reason: collision with root package name */
    private final s9.d f1369i;

    /* renamed from: j, reason: collision with root package name */
    private final W7.f f1370j;

    /* renamed from: k, reason: collision with root package name */
    private final W7.f f1371k;

    public A0(String id2, InterfaceC7929a interfaceC7929a, s9.d name, boolean z10, List labels, boolean z11, s9.d dVar, s9.d dVar2, s9.d signalText, W7.f fVar, W7.f fVar2) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(labels, "labels");
        AbstractC6492s.i(signalText, "signalText");
        this.f1361a = id2;
        this.f1362b = interfaceC7929a;
        this.f1363c = name;
        this.f1364d = z10;
        this.f1365e = labels;
        this.f1366f = z11;
        this.f1367g = dVar;
        this.f1368h = dVar2;
        this.f1369i = signalText;
        this.f1370j = fVar;
        this.f1371k = fVar2;
    }

    public final s9.d a() {
        return this.f1367g;
    }

    public final boolean b() {
        return this.f1366f;
    }

    public final String c() {
        return this.f1361a;
    }

    public final boolean d() {
        return this.f1364d;
    }

    public final InterfaceC7929a e() {
        return this.f1362b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return AbstractC6492s.d(this.f1361a, a02.f1361a) && AbstractC6492s.d(this.f1362b, a02.f1362b) && AbstractC6492s.d(this.f1363c, a02.f1363c) && this.f1364d == a02.f1364d && AbstractC6492s.d(this.f1365e, a02.f1365e) && this.f1366f == a02.f1366f && AbstractC6492s.d(this.f1367g, a02.f1367g) && AbstractC6492s.d(this.f1368h, a02.f1368h) && AbstractC6492s.d(this.f1369i, a02.f1369i) && AbstractC6492s.d(this.f1370j, a02.f1370j) && AbstractC6492s.d(this.f1371k, a02.f1371k);
    }

    public final s9.d f() {
        return this.f1368h;
    }

    public final List g() {
        return this.f1365e;
    }

    public final s9.d h() {
        return this.f1363c;
    }

    public int hashCode() {
        int iHashCode = this.f1361a.hashCode() * 31;
        InterfaceC7929a interfaceC7929a = this.f1362b;
        int iHashCode2 = (((((((((iHashCode + (interfaceC7929a == null ? 0 : interfaceC7929a.hashCode())) * 31) + this.f1363c.hashCode()) * 31) + Boolean.hashCode(this.f1364d)) * 31) + this.f1365e.hashCode()) * 31) + Boolean.hashCode(this.f1366f)) * 31;
        s9.d dVar = this.f1367g;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        s9.d dVar2 = this.f1368h;
        int iHashCode4 = (((iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31) + this.f1369i.hashCode()) * 31;
        W7.f fVar = this.f1370j;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        W7.f fVar2 = this.f1371k;
        return iHashCode5 + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final W7.f i() {
        return this.f1370j;
    }

    public final W7.f j() {
        return this.f1371k;
    }

    public final s9.d k() {
        return this.f1369i;
    }

    public String toString() {
        return "WirelessSignal(id=" + this.f1361a + ", image=" + this.f1362b + ", name=" + this.f1363c + ", identified=" + this.f1364d + ", labels=" + this.f1365e + ", connected=" + this.f1366f + ", bssid=" + this.f1367g + ", info=" + this.f1368h + ", signalText=" + this.f1369i + ", signal=" + this.f1370j + ", signalMax=" + this.f1371k + ")";
    }
}
