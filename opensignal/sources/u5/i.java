package u5;

import java.util.ArrayList;
import oe.f0;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f23291b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final q3.a f23292c = new q3.a(new p5.b(20));

    /* renamed from: d, reason: collision with root package name */
    public static final q3.a f23293d = new q3.a(new p5.b(21));

    /* renamed from: a, reason: collision with root package name */
    public final u0 f23294a;

    public i() {
        f0 f0Var = h0.f19336d;
        this.f23294a = u0.f19383x;
    }

    public final void a(int i10, ArrayList arrayList) {
        int i11 = 0;
        switch (i10) {
            case 0:
                arrayList.add(new w6.a());
                break;
            case 1:
                arrayList.add(new w6.c());
                break;
            case 2:
                arrayList.add(new w6.d(0));
                break;
            case 3:
                arrayList.add(new v5.a());
                break;
            case 4:
                k kVarB0 = f23292c.B0(0);
                if (kVarB0 == null) {
                    arrayList.add(new x5.b());
                    break;
                } else {
                    arrayList.add(kVarB0);
                    break;
                }
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                arrayList.add(new y5.b());
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                arrayList.add(new j6.c(0));
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                arrayList.add(new k6.d(0));
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                arrayList.add(new l6.h(0));
                arrayList.add(new l6.k(0));
                break;
            case 9:
                arrayList.add(new m6.c());
                break;
            case 10:
                arrayList.add(new w6.p());
                break;
            case 11:
                arrayList.add(new w6.u(1, new a5.b0(0L), new ma.f(i11, 2, this.f23294a)));
                break;
            case 12:
                x6.c cVar = new x6.c();
                cVar.f25048c = 0;
                cVar.f25049d = -1L;
                cVar.f25051f = -1;
                cVar.f25052g = -1L;
                arrayList.add(cVar);
                break;
            case 14:
                arrayList.add(new z5.a());
                break;
            case 15:
                k kVarB02 = f23293d.B0(new Object[0]);
                if (kVarB02 != null) {
                    arrayList.add(kVarB02);
                    break;
                }
                break;
            case 16:
                arrayList.add(new w5.b());
                break;
        }
    }
}
