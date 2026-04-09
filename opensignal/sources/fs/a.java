package fs;

import br.l;
import ht.b0;
import ht.y0;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f9051a;

    /* renamed from: b, reason: collision with root package name */
    public final b f9052b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9053c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9054d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f9055e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f9056f;

    public a(y0 y0Var, b bVar, boolean z10, boolean z11, Set set, b0 b0Var) {
        l.e(y0Var, "howThisTypeIsUsed");
        l.e(bVar, "flexibility");
        this.f9051a = y0Var;
        this.f9052b = bVar;
        this.f9053c = z10;
        this.f9054d = z11;
        this.f9055e = set;
        this.f9056f = b0Var;
    }

    public static a a(a aVar, b bVar, boolean z10, Set set, b0 b0Var, int i10) {
        y0 y0Var = aVar.f9051a;
        if ((i10 & 2) != 0) {
            bVar = aVar.f9052b;
        }
        b bVar2 = bVar;
        if ((i10 & 4) != 0) {
            z10 = aVar.f9053c;
        }
        boolean z11 = z10;
        boolean z12 = aVar.f9054d;
        if ((i10 & 16) != 0) {
            set = aVar.f9055e;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            b0Var = aVar.f9056f;
        }
        aVar.getClass();
        l.e(y0Var, "howThisTypeIsUsed");
        l.e(bVar2, "flexibility");
        return new a(y0Var, bVar2, z11, z12, set2, b0Var);
    }

    public final a b(b bVar) {
        l.e(bVar, "flexibility");
        return a(this, bVar, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(aVar.f9056f, this.f9056f) && aVar.f9051a == this.f9051a && aVar.f9052b == this.f9052b && aVar.f9053c == this.f9053c && aVar.f9054d == this.f9054d;
    }

    public final int hashCode() {
        b0 b0Var = this.f9056f;
        int iHashCode = b0Var != null ? b0Var.hashCode() : 0;
        int iHashCode2 = this.f9051a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f9052b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i10 = (iHashCode3 * 31) + (this.f9053c ? 1 : 0) + iHashCode3;
        return (i10 * 31) + (this.f9054d ? 1 : 0) + i10;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f9051a + ", flexibility=" + this.f9052b + ", isRaw=" + this.f9053c + ", isForAnnotationParameter=" + this.f9054d + ", visitedTypeParameters=" + this.f9055e + ", defaultType=" + this.f9056f + ')';
    }

    public /* synthetic */ a(y0 y0Var, boolean z10, boolean z11, Set set, int i10) {
        this(y0Var, b.INFLEXIBLE, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, null);
    }
}
