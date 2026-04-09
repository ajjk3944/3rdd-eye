package j0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z implements u0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27034b;

    public /* synthetic */ z(int i4, Object obj) {
        this.f27033a = i4;
        this.f27034b = obj;
    }

    @Override // u0.f0
    public final void a() {
        int i4 = this.f27033a;
        Object obj = this.f27034b;
        switch (i4) {
            case 0:
                ((a0) obj).f26859d = null;
                break;
            case 1:
                m0 m0Var = (m0) obj;
                b5.i0 i0Var = m0Var.f26929c;
                if (i0Var != null) {
                    i0Var.f1820a = false;
                }
                m0Var.f26929c = null;
                break;
            case 2:
                ((h0) obj).f26907f = true;
                break;
            case 3:
                ((j2.d1) obj).f27109b.invoke();
                break;
            default:
                ArrayList arrayList = zh.i.f38298a;
                zh.i.f38298a.remove((pg.g) obj);
                break;
        }
    }
}
