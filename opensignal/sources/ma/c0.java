package ma;

import com.google.android.exoplayer2.Format;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16398a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16399b;

    /* renamed from: c, reason: collision with root package name */
    public final ca.x[] f16400c;

    public c0(int i10, List list) {
        this.f16398a = i10;
        switch (i10) {
            case 1:
                this.f16399b = list;
                this.f16400c = new ca.x[list.size()];
                break;
            default:
                this.f16399b = list;
                this.f16400c = new ca.x[list.size()];
                break;
        }
    }

    public void a(long j, fb.f fVar) {
        if (fVar.a() < 9) {
            return;
        }
        int iD = fVar.d();
        int iD2 = fVar.d();
        int iO = fVar.o();
        if (iD == 434 && iD2 == 1195456820 && iO == 3) {
            e5.p(j, fVar, this.f16400c);
        }
    }

    public final void b(ca.m mVar, g0 g0Var) {
        switch (this.f16398a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ca.x[] xVarArr = this.f16400c;
                    if (i10 >= xVarArr.length) {
                        break;
                    } else {
                        g0Var.a();
                        g0Var.b();
                        ca.x xVarN = mVar.n(g0Var.f16468e, 3);
                        Format format = (Format) this.f16399b.get(i10);
                        String str = format.H;
                        boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
                        String strValueOf = String.valueOf(str);
                        qb.b.f(strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "), z10);
                        String str2 = format.f4020a;
                        if (str2 == null) {
                            g0Var.b();
                            str2 = g0Var.f16469f;
                        }
                        com.google.android.exoplayer2.g0 g0Var2 = new com.google.android.exoplayer2.g0();
                        g0Var2.f4142a = str2;
                        g0Var2.k = str;
                        g0Var2.f4145d = format.f4025r;
                        g0Var2.f4144c = format.f4024g;
                        g0Var2.C = format.Z;
                        g0Var2.f4152m = format.J;
                        xVarN.e(new Format(g0Var2));
                        xVarArr[i10] = xVarN;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ca.x[] xVarArr2 = this.f16400c;
                    if (i11 >= xVarArr2.length) {
                        break;
                    } else {
                        g0Var.a();
                        g0Var.b();
                        ca.x xVarN2 = mVar.n(g0Var.f16468e, 3);
                        Format format2 = (Format) this.f16399b.get(i11);
                        String str3 = format2.H;
                        boolean z11 = "application/cea-608".equals(str3) || "application/cea-708".equals(str3);
                        String strValueOf2 = String.valueOf(str3);
                        qb.b.f(strValueOf2.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf2) : new String("Invalid closed caption mime type provided: "), z11);
                        com.google.android.exoplayer2.g0 g0Var3 = new com.google.android.exoplayer2.g0();
                        g0Var.b();
                        g0Var3.f4142a = g0Var.f16469f;
                        g0Var3.k = str3;
                        g0Var3.f4145d = format2.f4025r;
                        g0Var3.f4144c = format2.f4024g;
                        g0Var3.C = format2.Z;
                        g0Var3.f4152m = format2.J;
                        xVarN2.e(new Format(g0Var3));
                        xVarArr2[i11] = xVarN2;
                        i11++;
                    }
                }
                break;
        }
    }
}
