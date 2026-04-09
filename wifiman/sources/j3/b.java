package j3;

import java.util.Map;
import m3.InterfaceC6756a;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6756a f50048a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f50049b;

    b(InterfaceC6756a interfaceC6756a, Map map) {
        if (interfaceC6756a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f50048a = interfaceC6756a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f50049b = map;
    }

    @Override // j3.f
    InterfaceC6756a e() {
        return this.f50048a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f50048a.equals(fVar.e()) && this.f50049b.equals(fVar.h());
    }

    @Override // j3.f
    Map h() {
        return this.f50049b;
    }

    public int hashCode() {
        return ((this.f50048a.hashCode() ^ 1000003) * 1000003) ^ this.f50049b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f50048a + ", values=" + this.f50049b + "}";
    }
}
