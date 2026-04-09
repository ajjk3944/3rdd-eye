package x9;

import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f25192a;

    /* renamed from: b, reason: collision with root package name */
    public int f25193b;

    /* renamed from: c, reason: collision with root package name */
    public long f25194c;

    /* renamed from: d, reason: collision with root package name */
    public final ya.v f25195d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25196e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25197f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f25198g;

    public s(t tVar, String str, int i10, ya.v vVar) {
        this.f25198g = tVar;
        this.f25192a = str;
        this.f25193b = i10;
        this.f25194c = vVar == null ? -1L : vVar.f26180d;
        if (vVar == null || !vVar.a()) {
            return;
        }
        this.f25195d = vVar;
    }

    public final boolean a(int i10, ya.v vVar) {
        if (vVar == null) {
            return i10 == this.f25193b;
        }
        long j = vVar.f26180d;
        ya.v vVar2 = this.f25195d;
        return vVar2 == null ? !vVar.a() && j == this.f25194c : j == vVar2.f26180d && vVar.f26178b == vVar2.f26178b && vVar.f26179c == vVar2.f26179c;
    }

    public final boolean b(q qVar) {
        long j = this.f25194c;
        if (j == -1) {
            return false;
        }
        ya.v vVar = qVar.f25184d;
        w1 w1Var = qVar.f25182b;
        if (vVar == null) {
            return this.f25193b != qVar.f25183c;
        }
        if (vVar.f26180d > j) {
            return true;
        }
        ya.v vVar2 = this.f25195d;
        if (vVar2 == null) {
            return false;
        }
        int i10 = vVar2.f26178b;
        int iB = w1Var.b(vVar.f26177a);
        int iB2 = w1Var.b(vVar2.f26177a);
        if (vVar.f26180d < vVar2.f26180d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!vVar.a()) {
            int i11 = vVar.f26181e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = vVar.f26178b;
        int i13 = vVar.f26179c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > vVar2.f26179c;
        }
        return true;
    }

    public final boolean c(w1 w1Var, w1 w1Var2) {
        ya.v vVar;
        int i10 = this.f25193b;
        if (i10 < w1Var.o()) {
            t tVar = this.f25198g;
            v1 v1Var = tVar.f25201a;
            w1Var.n(i10, v1Var);
            for (int i11 = v1Var.f4752o; i11 <= v1Var.f4753p; i11++) {
                int iB = w1Var2.b(w1Var.l(i11));
                if (iB != -1) {
                    i10 = w1Var2.f(iB, tVar.f25202b, false).f4596c;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= w1Var2.o()) {
            i10 = -1;
        }
        this.f25193b = i10;
        return i10 != -1 && ((vVar = this.f25195d) == null || w1Var2.b(vVar.f26177a) != -1);
    }
}
