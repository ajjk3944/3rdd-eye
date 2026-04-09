package s7;

import kotlin.jvm.internal.l;

/* compiled from: IndicatorParams.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC5582a f46135a;

    /* renamed from: b, reason: collision with root package name */
    public final d f46136b;

    /* renamed from: c, reason: collision with root package name */
    public final d f46137c;

    /* renamed from: d, reason: collision with root package name */
    public final d f46138d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC5583b f46139e;

    public e(EnumC5582a animation, d dVar, d dVar2, d dVar3, InterfaceC5583b interfaceC5583b) {
        l.f(animation, "animation");
        this.f46135a = animation;
        this.f46136b = dVar;
        this.f46137c = dVar2;
        this.f46138d = dVar3;
        this.f46139e = interfaceC5583b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f46135a == eVar.f46135a && l.b(this.f46136b, eVar.f46136b) && l.b(this.f46137c, eVar.f46137c) && l.b(this.f46138d, eVar.f46138d) && l.b(this.f46139e, eVar.f46139e);
    }

    public final int hashCode() {
        return this.f46139e.hashCode() + ((this.f46138d.hashCode() + ((this.f46137c.hashCode() + ((this.f46136b.hashCode() + (this.f46135a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Style(animation=" + this.f46135a + ", activeShape=" + this.f46136b + ", inactiveShape=" + this.f46137c + ", minimumShape=" + this.f46138d + ", itemsPlacement=" + this.f46139e + ')';
    }
}
