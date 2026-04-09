package d3;

import android.content.Context;
import m3.InterfaceC6756a;

/* renamed from: d3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5289c extends AbstractC5294h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f45735a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6756a f45736b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6756a f45737c;

    /* renamed from: d, reason: collision with root package name */
    private final String f45738d;

    C5289c(Context context, InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f45735a = context;
        if (interfaceC6756a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f45736b = interfaceC6756a;
        if (interfaceC6756a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f45737c = interfaceC6756a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f45738d = str;
    }

    @Override // d3.AbstractC5294h
    public Context b() {
        return this.f45735a;
    }

    @Override // d3.AbstractC5294h
    public String c() {
        return this.f45738d;
    }

    @Override // d3.AbstractC5294h
    public InterfaceC6756a d() {
        return this.f45737c;
    }

    @Override // d3.AbstractC5294h
    public InterfaceC6756a e() {
        return this.f45736b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5294h)) {
            return false;
        }
        AbstractC5294h abstractC5294h = (AbstractC5294h) obj;
        return this.f45735a.equals(abstractC5294h.b()) && this.f45736b.equals(abstractC5294h.e()) && this.f45737c.equals(abstractC5294h.d()) && this.f45738d.equals(abstractC5294h.c());
    }

    public int hashCode() {
        return ((((((this.f45735a.hashCode() ^ 1000003) * 1000003) ^ this.f45736b.hashCode()) * 1000003) ^ this.f45737c.hashCode()) * 1000003) ^ this.f45738d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f45735a + ", wallClock=" + this.f45736b + ", monotonicClock=" + this.f45737c + ", backendName=" + this.f45738d + "}";
    }
}
