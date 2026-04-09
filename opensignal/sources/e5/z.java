package e5;

import androidx.media3.common.a1;
import androidx.media3.common.z0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f7953a;

    /* renamed from: b, reason: collision with root package name */
    public int f7954b;

    /* renamed from: c, reason: collision with root package name */
    public long f7955c;

    /* renamed from: d, reason: collision with root package name */
    public final o5.z f7956d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7957e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f7959g;

    public z(a0 a0Var, String str, int i10, o5.z zVar) {
        this.f7959g = a0Var;
        this.f7953a = str;
        this.f7954b = i10;
        this.f7955c = zVar == null ? -1L : zVar.f1692d;
        if (zVar == null || !zVar.a()) {
            return;
        }
        this.f7956d = zVar;
    }

    public final boolean a(int i10, o5.z zVar) {
        if (zVar == null) {
            return i10 == this.f7954b;
        }
        long j = zVar.f1692d;
        o5.z zVar2 = this.f7956d;
        return zVar2 == null ? !zVar.a() && j == this.f7955c : j == zVar2.f1692d && zVar.f1690b == zVar2.f1690b && zVar.f1691c == zVar2.f1691c;
    }

    public final boolean b(a aVar) {
        o5.z zVar = aVar.f7791d;
        a1 a1Var = aVar.f7789b;
        if (zVar == null) {
            return this.f7954b != aVar.f7790c;
        }
        long j = this.f7955c;
        if (j == -1) {
            return false;
        }
        if (zVar.f1692d > j) {
            return true;
        }
        o5.z zVar2 = this.f7956d;
        if (zVar2 == null) {
            return false;
        }
        int i10 = zVar2.f1690b;
        int iB = a1Var.b(zVar.f1689a);
        int iB2 = a1Var.b(zVar2.f1689a);
        if (zVar.f1692d < zVar2.f1692d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!zVar.a()) {
            int i11 = zVar.f1693e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = zVar.f1690b;
        int i13 = zVar.f1691c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > zVar2.f1691c;
        }
        return true;
    }

    public final boolean c(a1 a1Var, a1 a1Var2) {
        o5.z zVar;
        int i10 = this.f7954b;
        if (i10 < a1Var.o()) {
            a0 a0Var = this.f7959g;
            z0 z0Var = a0Var.f7799a;
            a1Var.n(i10, z0Var);
            for (int i11 = z0Var.K; i11 <= z0Var.L; i11++) {
                int iB = a1Var2.b(a1Var.l(i11));
                if (iB != -1) {
                    i10 = a1Var2.f(iB, a0Var.f7800b, false).f1829g;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= a1Var2.o()) {
            i10 = -1;
        }
        this.f7954b = i10;
        return i10 != -1 && ((zVar = this.f7956d) == null || a1Var2.b(zVar.f1689a) != -1);
    }
}
