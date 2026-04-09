package Zi;

import Xi.m;
import Xi.n;
import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class G extends H0 {

    /* renamed from: m, reason: collision with root package name */
    private final Xi.m f25549m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f25550n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(final String name, final int i10) {
        super(name, null, i10, 2, null);
        AbstractC6492s.i(name, "name");
        this.f25549m = m.b.f24469a;
        this.f25550n = Yg.n.b(new InterfaceC6824a() { // from class: Zi.F
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return G.z(i10, name, this);
            }
        });
    }

    private final Xi.f[] A() {
        return (Xi.f[]) this.f25550n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f[] z(int i10, String str, G g10) {
        Xi.f[] fVarArr = new Xi.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fVarArr[i11] = Xi.l.e(str + '.' + g10.f(i11), n.d.f24473a, new Xi.f[0], null, 8, null);
        }
        return fVarArr;
    }

    @Override // Zi.H0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Xi.f)) {
            return false;
        }
        Xi.f fVar = (Xi.f) obj;
        return fVar.h() == m.b.f24469a && AbstractC6492s.d(a(), fVar.a()) && AbstractC6492s.d(B0.a(this), B0.a(fVar));
    }

    @Override // Zi.H0, Xi.f
    public Xi.m h() {
        return this.f25549m;
    }

    @Override // Zi.H0
    public int hashCode() {
        int iHashCode = a().hashCode();
        int iHashCode2 = 1;
        for (String str : Xi.j.b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // Zi.H0, Xi.f
    public Xi.f i(int i10) {
        return A()[i10];
    }

    @Override // Zi.H0
    public String toString() {
        return AbstractC3689v.z0(Xi.j.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
