package ns;

import androidx.datastore.preferences.protobuf.l;
import br.x;
import n0.v1;
import o0.g0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18526b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18527c;

    public /* synthetic */ d(int i10, int i11, int i12, byte b2) {
        this.f18525a = i12;
        this.f18526b = i10;
        this.f18527c = i11;
    }

    public static b a(d dVar) {
        return new b(dVar.f18526b + dVar.f18527c, 1, 0, (byte) 0);
    }

    public static b b() {
        return new b(0, 1, 0, (byte) 0);
    }

    public abstract void c(l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var);

    public n0.a d(l lVar) {
        return null;
    }

    public String toString() {
        switch (this.f18525a) {
            case 1:
                String strP = x.f2918a.b(getClass()).p();
                return strP == null ? "" : strP;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, 1, (byte) 0);
        this.f18525a = 1;
    }
}
