package Xb;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final b f24269a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24270b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24271c;

    public d(b id2, a environment, List measurements) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(environment, "environment");
        AbstractC6492s.i(measurements, "measurements");
        this.f24269a = id2;
        this.f24270b = environment;
        this.f24271c = measurements;
    }

    public final a a() {
        return this.f24270b;
    }

    public final b b() {
        return this.f24269a;
    }

    public final List c() {
        return this.f24271c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC6492s.d(this.f24269a, dVar.f24269a) && AbstractC6492s.d(this.f24270b, dVar.f24270b) && AbstractC6492s.d(this.f24271c, dVar.f24271c);
    }

    public int hashCode() {
        return (((this.f24269a.hashCode() * 31) + this.f24270b.hashCode()) * 31) + this.f24271c.hashCode();
    }

    public String toString() {
        return "RoomSpeedtestResult(id=" + this.f24269a + ", environment=" + this.f24270b + ", measurements=" + this.f24271c + ")";
    }
}
