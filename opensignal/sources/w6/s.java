package w6;

import java.util.List;
import ma.g0;
import u5.a0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24357a;

    /* renamed from: b, reason: collision with root package name */
    public final List f24358b;

    /* renamed from: c, reason: collision with root package name */
    public final a0[] f24359c;

    public s(int i10, List list) {
        this.f24357a = i10;
        switch (i10) {
            case 1:
                this.f24358b = list;
                this.f24359c = new a0[list.size()];
                break;
            default:
                this.f24358b = list;
                this.f24359c = new a0[list.size()];
                break;
        }
    }

    public void a(long j, a5.v vVar) {
        if (vVar.a() < 9) {
            return;
        }
        int iG = vVar.g();
        int iG2 = vVar.g();
        int iT = vVar.t();
        if (iG == 434 && iG2 == 1195456820 && iT == 3) {
            u5.b.f(j, vVar, this.f24359c);
        }
    }

    public final void b(u5.m mVar, g0 g0Var) {
        switch (this.f24357a) {
            case 0:
                int i10 = 0;
                while (true) {
                    a0[] a0VarArr = this.f24359c;
                    if (i10 >= a0VarArr.length) {
                        break;
                    } else {
                        g0Var.a();
                        g0Var.b();
                        a0 a0VarMo36n = mVar.mo36n(g0Var.f16468e, 3);
                        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f24358b.get(i10);
                        String str = rVar.H;
                        a5.a.d("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = rVar.f1780a;
                        if (str2 == null) {
                            g0Var.b();
                            str2 = g0Var.f16469f;
                        }
                        androidx.media3.common.q qVar = new androidx.media3.common.q();
                        qVar.f1734a = str2;
                        qVar.k = str;
                        qVar.f1737d = rVar.f1787r;
                        qVar.f1736c = rVar.f1786g;
                        qVar.C = rVar.Z;
                        qVar.f1744m = rVar.J;
                        a0VarMo36n.c(new androidx.media3.common.r(qVar));
                        a0VarArr[i10] = a0VarMo36n;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    a0[] a0VarArr2 = this.f24359c;
                    if (i11 >= a0VarArr2.length) {
                        break;
                    } else {
                        g0Var.a();
                        g0Var.b();
                        a0 a0VarMo36n2 = mVar.mo36n(g0Var.f16468e, 3);
                        androidx.media3.common.r rVar2 = (androidx.media3.common.r) this.f24358b.get(i11);
                        String str3 = rVar2.H;
                        a5.a.d("Invalid closed caption mime type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                        g0Var.b();
                        qVar2.f1734a = g0Var.f16469f;
                        qVar2.k = str3;
                        qVar2.f1737d = rVar2.f1787r;
                        qVar2.f1736c = rVar2.f1786g;
                        qVar2.C = rVar2.Z;
                        qVar2.f1744m = rVar2.J;
                        a0VarMo36n2.c(new androidx.media3.common.r(qVar2));
                        a0VarArr2[i11] = a0VarMo36n2;
                        i11++;
                    }
                }
                break;
        }
    }
}
