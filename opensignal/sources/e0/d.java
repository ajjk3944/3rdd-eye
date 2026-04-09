package e0;

import br.l;
import g1.a0;
import g1.b0;
import g1.f0;
import g1.i0;
import t2.i;

/* loaded from: classes.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f7634a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7635b;

    /* renamed from: c, reason: collision with root package name */
    public final a f7636c;

    /* renamed from: d, reason: collision with root package name */
    public final a f7637d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f7634a = aVar;
        this.f7635b = aVar2;
        this.f7636c = aVar3;
        this.f7637d = aVar4;
    }

    @Override // g1.i0
    public final f0 a(long j, i iVar, t2.c cVar) {
        float fA = this.f7634a.a(j, cVar);
        float fA2 = this.f7635b.a(j, cVar);
        float fA3 = this.f7636c.a(j, cVar);
        float fA4 = this.f7637d.a(j, cVar);
        float fB = f1.e.b(j);
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
            b0.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new a0(ir.f0.a(0L, j));
        }
        f1.c cVarA = ir.f0.a(0L, j);
        i iVar2 = i.Ltr;
        float f14 = iVar == iVar2 ? fA : fA2;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        if (iVar == iVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
        float f15 = iVar == iVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
        if (iVar != iVar2) {
            fA4 = fA3;
        }
        return new b0(new f1.d(cVarA.f8404a, cVarA.f8405b, cVarA.f8406c, cVarA.f8407d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(fA4) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f7634a, dVar.f7634a) && l.a(this.f7635b, dVar.f7635b) && l.a(this.f7636c, dVar.f7636c) && l.a(this.f7637d, dVar.f7637d);
    }

    public final int hashCode() {
        return this.f7637d.hashCode() + ((this.f7636c.hashCode() + ((this.f7635b.hashCode() + (this.f7634a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f7634a + ", topEnd = " + this.f7635b + ", bottomEnd = " + this.f7636c + ", bottomStart = " + this.f7637d + ')';
    }
}
