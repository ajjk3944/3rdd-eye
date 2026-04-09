package wc;

import ge.InterfaceC5899b;
import h9.C5969a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: wc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8322b {

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f64818a;

    /* renamed from: b, reason: collision with root package name */
    private final U7.a f64819b;

    /* renamed from: c, reason: collision with root package name */
    private final List f64820c;

    /* renamed from: wc.b$a */
    public interface a extends InterfaceC5899b {
    }

    public C8322b(C5969a id2, U7.a aVar, List history) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(history, "history");
        this.f64818a = id2;
        this.f64819b = aVar;
        this.f64820c = history;
    }

    public final U7.a a() {
        return this.f64819b;
    }

    public final List b() {
        return this.f64820c;
    }

    public final C5969a c() {
        return this.f64818a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8322b)) {
            return false;
        }
        C8322b c8322b = (C8322b) obj;
        return AbstractC6492s.d(this.f64818a, c8322b.f64818a) && AbstractC6492s.d(this.f64819b, c8322b.f64819b) && AbstractC6492s.d(this.f64820c, c8322b.f64820c);
    }

    public int hashCode() {
        int iHashCode = this.f64818a.hashCode() * 31;
        U7.a aVar = this.f64819b;
        return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f64820c.hashCode();
    }

    public String toString() {
        return "BluetoothDeviceSignalStatistics(id=" + this.f64818a + ", best=" + this.f64819b + ", history=" + this.f64820c + ")";
    }
}
