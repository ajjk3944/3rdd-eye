package m0;

import d3.l;
import nk.k;
import p1.e0;
import p1.f0;
import p1.j0;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f28851a;

    /* renamed from: b, reason: collision with root package name */
    public final a f28852b;

    /* renamed from: c, reason: collision with root package name */
    public final a f28853c;

    /* renamed from: d, reason: collision with root package name */
    public final a f28854d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f28851a = aVar;
        this.f28852b = aVar2;
        this.f28853c = aVar3;
        this.f28854d = aVar4;
    }

    public static d b(d dVar, a aVar, a aVar2, a aVar3, a aVar4, int i4) {
        if ((i4 & 1) != 0) {
            aVar = dVar.f28851a;
        }
        if ((i4 & 2) != 0) {
            aVar2 = dVar.f28852b;
        }
        if ((i4 & 4) != 0) {
            aVar3 = dVar.f28853c;
        }
        if ((i4 & 8) != 0) {
            aVar4 = dVar.f28854d;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    @Override // p1.j0
    public final z a(long j, l lVar, d3.c cVar) {
        float fA = this.f28851a.a(j, cVar);
        float fA2 = this.f28852b.a(j, cVar);
        float fA3 = this.f28853c.a(j, cVar);
        float fA4 = this.f28854d.a(j, cVar);
        float fB = o1.e.b(j);
        float f10 = fA + fA4;
        if (f10 > fB) {
            float f11 = fB / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fB) {
            float f13 = fB / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            f0.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new e0(com.bumptech.glide.e.i(0L, j));
        }
        o1.c cVarI = com.bumptech.glide.e.i(0L, j);
        l lVar2 = l.f21966a;
        float f14 = lVar == lVar2 ? fA : fA2;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        if (lVar == lVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
        float f15 = lVar == lVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
        if (lVar != lVar2) {
            fA4 = fA3;
        }
        return new f0(new o1.d(cVarI.f30366a, cVarI.f30367b, cVarI.f30368c, cVarI.f30369d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(fA4) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.f28851a, dVar.f28851a) && k.a(this.f28852b, dVar.f28852b) && k.a(this.f28853c, dVar.f28853c) && k.a(this.f28854d, dVar.f28854d);
    }

    public final int hashCode() {
        return this.f28854d.hashCode() + ((this.f28853c.hashCode() + ((this.f28852b.hashCode() + (this.f28851a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f28851a + ", topEnd = " + this.f28852b + ", bottomEnd = " + this.f28853c + ", bottomStart = " + this.f28854d + ')';
    }
}
