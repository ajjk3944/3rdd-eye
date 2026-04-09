package zj;

import java.util.Arrays;
import org.snmp4j.asn1.BER;
import yj.n;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class h extends b implements yj.i {

    /* renamed from: a, reason: collision with root package name */
    private final byte f67404a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f67405b;

    public h(byte b10, byte[] bArr) {
        this.f67404a = b10;
        this.f67405b = bArr;
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean C() {
        return super.C();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean G() {
        return super.G();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    @Override // zj.b
    /* renamed from: O */
    public /* bridge */ /* synthetic */ yj.f i() {
        return super.i();
    }

    @Override // zj.b
    /* renamed from: Q */
    public /* bridge */ /* synthetic */ yj.g F() {
        return super.F();
    }

    @Override // zj.b
    /* renamed from: R */
    public /* bridge */ /* synthetic */ yj.h M() {
        return super.M();
    }

    @Override // zj.b, yj.u
    /* renamed from: S */
    public yj.i D() {
        return this;
    }

    @Override // zj.b
    /* renamed from: T */
    public /* bridge */ /* synthetic */ yj.j A() {
        return super.A();
    }

    @Override // zj.b
    /* renamed from: U */
    public /* bridge */ /* synthetic */ yj.k x() {
        return super.x();
    }

    @Override // zj.b
    /* renamed from: V */
    public /* bridge */ /* synthetic */ yj.l o() {
        return super.o();
    }

    @Override // zj.b
    /* renamed from: W */
    public /* bridge */ /* synthetic */ n L() {
        return super.L();
    }

    @Override // yj.d
    public byte[] b() {
        return this.f67405b;
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // yj.u
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!uVar.v()) {
            return false;
        }
        yj.d dVarD = uVar.D();
        return this.f67404a == dVarD.getType() && Arrays.equals(this.f67405b, dVarD.b());
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.y(this.f67404a, this.f67405b.length);
        eVar.o0(this.f67405b);
    }

    @Override // yj.u
    public String g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(Byte.toString(this.f67404a));
        sb2.append(",\"");
        for (byte b10 : this.f67405b) {
            sb2.append(Integer.toString(b10, 16));
        }
        sb2.append("\"]");
        return sb2.toString();
    }

    @Override // yj.d
    public byte getType() {
        return this.f67404a;
    }

    public int hashCode() {
        int i10 = this.f67404a + BER.ASN_EXTENSION_ID;
        for (byte b10 : this.f67405b) {
            i10 = (i10 * 31) + b10;
        }
        return i10;
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // yj.u
    public w k() {
        return w.EXTENSION;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(Byte.toString(this.f67404a));
        sb2.append(",0x");
        for (byte b10 : this.f67405b) {
            sb2.append(Integer.toString(b10, 16));
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean v() {
        return super.v();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean y() {
        return super.y();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean z() {
        return super.z();
    }
}
