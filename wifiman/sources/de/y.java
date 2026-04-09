package de;

import gc.EnumC5894a;
import gc.EnumC5895b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5894a f46059a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC5895b f46060b;

    /* renamed from: c, reason: collision with root package name */
    private final gc.c f46061c;

    public y(EnumC5894a section, EnumC5895b measurementType, gc.c signalType) {
        AbstractC6492s.i(section, "section");
        AbstractC6492s.i(measurementType, "measurementType");
        AbstractC6492s.i(signalType, "signalType");
        this.f46059a = section;
        this.f46060b = measurementType;
        this.f46061c = signalType;
    }

    public static /* synthetic */ y b(y yVar, EnumC5894a enumC5894a, EnumC5895b enumC5895b, gc.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC5894a = yVar.f46059a;
        }
        if ((i10 & 2) != 0) {
            enumC5895b = yVar.f46060b;
        }
        if ((i10 & 4) != 0) {
            cVar = yVar.f46061c;
        }
        return yVar.a(enumC5894a, enumC5895b, cVar);
    }

    public final y a(EnumC5894a section, EnumC5895b measurementType, gc.c signalType) {
        AbstractC6492s.i(section, "section");
        AbstractC6492s.i(measurementType, "measurementType");
        AbstractC6492s.i(signalType, "signalType");
        return new y(section, measurementType, signalType);
    }

    public final EnumC5895b c() {
        return this.f46060b;
    }

    public final EnumC5894a d() {
        return this.f46059a;
    }

    public final gc.c e() {
        return this.f46061c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f46059a == yVar.f46059a && this.f46060b == yVar.f46060b && this.f46061c == yVar.f46061c;
    }

    public int hashCode() {
        return (((this.f46059a.hashCode() * 31) + this.f46060b.hashCode()) * 31) + this.f46061c.hashCode();
    }

    public String toString() {
        return "SignalTabConfig(section=" + this.f46059a + ", measurementType=" + this.f46060b + ", signalType=" + this.f46061c + ")";
    }

    public /* synthetic */ y(EnumC5894a enumC5894a, EnumC5895b enumC5895b, gc.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC5894a.SIGNAL : enumC5894a, (i10 & 2) != 0 ? EnumC5895b.SIGNAL : enumC5895b, (i10 & 4) != 0 ? gc.c.WIFI : cVar);
    }
}
