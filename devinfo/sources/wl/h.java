package wl;

import b5.i0;
import java.util.ArrayList;
import nk.k;
import rl.n;
import rl.z;
import va.o;
import vl.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final m f36830a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f36831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36832c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f36833d;

    /* renamed from: e, reason: collision with root package name */
    public final o f36834e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36835f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f36836h;

    /* renamed from: i, reason: collision with root package name */
    public int f36837i;

    public h(m mVar, ArrayList arrayList, int i4, i0 i0Var, o oVar, int i10, int i11, int i12) {
        this.f36830a = mVar;
        this.f36831b = arrayList;
        this.f36832c = i4;
        this.f36833d = i0Var;
        this.f36834e = oVar;
        this.f36835f = i10;
        this.g = i11;
        this.f36836h = i12;
    }

    public static h a(h hVar, int i4, i0 i0Var, o oVar, int i10) {
        if ((i10 & 1) != 0) {
            i4 = hVar.f36832c;
        }
        int i11 = i4;
        if ((i10 & 2) != 0) {
            i0Var = hVar.f36833d;
        }
        i0 i0Var2 = i0Var;
        if ((i10 & 4) != 0) {
            oVar = hVar.f36834e;
        }
        o oVar2 = oVar;
        int i12 = hVar.f36835f;
        int i13 = hVar.g;
        int i14 = hVar.f36836h;
        k.e(oVar2, "request");
        return new h(hVar.f36830a, hVar.f36831b, i11, i0Var2, oVar2, i12, i13, i14);
    }

    public final z b(o oVar) {
        k.e(oVar, "request");
        ArrayList arrayList = this.f36831b;
        int size = arrayList.size();
        int i4 = this.f36832c;
        if (i4 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f36837i++;
        i0 i0Var = this.f36833d;
        if (i0Var != null) {
            if (!((vl.g) i0Var.f1822c).g().f((n) oVar.f36146b)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i4 - 1) + " must retain the same host and port").toString());
            }
            if (this.f36837i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i4 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i4 + 1;
        h hVarA = a(this, i10, null, oVar, 58);
        rl.o oVar2 = (rl.o) arrayList.get(i4);
        z zVarA = oVar2.a(hVarA);
        if (zVarA == null) {
            throw new NullPointerException("interceptor " + oVar2 + " returned null");
        }
        if (i0Var == null || i10 >= arrayList.size() || hVarA.f36837i == 1) {
            return zVarA;
        }
        throw new IllegalStateException(("network interceptor " + oVar2 + " must call proceed() exactly once").toString());
    }
}
