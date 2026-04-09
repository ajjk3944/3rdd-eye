package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public final class m extends j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d0 writer, boolean z10) {
        super(writer);
        kotlin.jvm.internal.p.e(writer, "writer");
        this.f23035c = z10;
    }

    @Override // kotlinx.serialization.json.internal.j
    public void d(byte b10) {
        boolean z10 = this.f23035c;
        String strF = y8.j.f(y8.j.b(b10));
        if (z10) {
            m(strF);
        } else {
            j(strF);
        }
    }

    @Override // kotlinx.serialization.json.internal.j
    public void h(int i10) {
        boolean z10 = this.f23035c;
        String string = Long.toString(y8.l.b(i10) & 4294967295L, 10);
        if (z10) {
            m(string);
        } else {
            j(string);
        }
    }

    @Override // kotlinx.serialization.json.internal.j
    public void i(long j10) {
        boolean z10 = this.f23035c;
        long jB = y8.n.b(j10);
        if (z10) {
            m(g.a(jB, 10));
        } else {
            j(g.a(jB, 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.j
    public void k(short s10) {
        boolean z10 = this.f23035c;
        String strF = y8.q.f(y8.q.b(s10));
        if (z10) {
            m(strF);
        } else {
            j(strF);
        }
    }
}
