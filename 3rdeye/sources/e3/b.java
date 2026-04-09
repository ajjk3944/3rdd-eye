package E3;

import E3.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final H3.a f1375a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1376b;

    public b(H3.a aVar, HashMap map) {
        this.f1375a = aVar;
        this.f1376b = map;
    }

    @Override // E3.e
    public final H3.a a() {
        return this.f1375a;
    }

    @Override // E3.e
    public final Map<v3.e, e.a> c() {
        return this.f1376b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1375a.equals(eVar.a()) && this.f1376b.equals(eVar.c());
    }

    public final int hashCode() {
        return ((this.f1375a.hashCode() ^ 1000003) * 1000003) ^ this.f1376b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f1375a + ", values=" + this.f1376b + "}";
    }
}
