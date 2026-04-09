package c2;

import com.google.android.gms.internal.measurement.i4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final w0.e f2620a = new w0.e(new h[16]);

    /* renamed from: b, reason: collision with root package name */
    public final x.a0 f2621b = new x.a0(10);

    public boolean a(x.o oVar, g2.v vVar, i4 i4Var, boolean z3) {
        w0.e eVar = this.f2620a;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        boolean z10 = false;
        for (int i10 = 0; i10 < i4; i10++) {
            z10 = ((h) objArr[i10]).a(oVar, vVar, i4Var, z3) || z10;
        }
        return z10;
    }

    public void b(i4 i4Var) {
        w0.e eVar = this.f2620a;
        int i4 = eVar.f36399c;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return;
            }
            if (((h) eVar.f36397a[i4]).f2614d.f13487a == 0) {
                eVar.l(i4);
            }
        }
    }
}
