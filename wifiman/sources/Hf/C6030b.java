package hf;

import ff.EnumC5820a;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: hf.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6030b {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5820a f48646a;

    /* renamed from: b, reason: collision with root package name */
    private final W7.a f48647b;

    /* renamed from: c, reason: collision with root package name */
    private final W7.a f48648c;

    public C6030b(EnumC5820a direction, W7.a speed, W7.a speedBarMax) {
        AbstractC6492s.i(direction, "direction");
        AbstractC6492s.i(speed, "speed");
        AbstractC6492s.i(speedBarMax, "speedBarMax");
        this.f48646a = direction;
        this.f48647b = speed;
        this.f48648c = speedBarMax;
    }

    public final EnumC5820a a() {
        return this.f48646a;
    }

    public final W7.a b() {
        return this.f48647b;
    }

    public final W7.a c() {
        return this.f48648c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6030b)) {
            return false;
        }
        C6030b c6030b = (C6030b) obj;
        return this.f48646a == c6030b.f48646a && AbstractC6492s.d(this.f48647b, c6030b.f48647b) && AbstractC6492s.d(this.f48648c, c6030b.f48648c);
    }

    public int hashCode() {
        return (((this.f48646a.hashCode() * 31) + this.f48647b.hashCode()) * 31) + this.f48648c.hashCode();
    }

    public String toString() {
        return "MeasurementDirectionRow(direction=" + this.f48646a + ", speed=" + this.f48647b + ", speedBarMax=" + this.f48648c + ")";
    }
}
