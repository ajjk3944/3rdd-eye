package Z9;

import U9.E;
import U9.u;
import U9.z;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* compiled from: RealInterceptorChain.kt */
/* loaded from: classes3.dex */
public final class f implements u.a {

    /* renamed from: a, reason: collision with root package name */
    public final Y9.e f14068a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14070c;

    /* renamed from: d, reason: collision with root package name */
    public final Y9.c f14071d;

    /* renamed from: e, reason: collision with root package name */
    public final z f14072e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14073f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14074g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14075h;
    public int i;

    public f(Y9.e call, ArrayList arrayList, int i, Y9.c cVar, z zVar, int i10, int i11, int i12) {
        l.f(call, "call");
        this.f14068a = call;
        this.f14069b = arrayList;
        this.f14070c = i;
        this.f14071d = cVar;
        this.f14072e = zVar;
        this.f14073f = i10;
        this.f14074g = i11;
        this.f14075h = i12;
    }

    public static f b(f fVar, int i, Y9.c cVar, z zVar, int i10) {
        if ((i10 & 1) != 0) {
            i = fVar.f14070c;
        }
        int i11 = i;
        if ((i10 & 2) != 0) {
            cVar = fVar.f14071d;
        }
        Y9.c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            zVar = fVar.f14072e;
        }
        ArrayList arrayList = fVar.f14069b;
        return new f(fVar.f14068a, arrayList, i11, cVar2, zVar, fVar.f14073f, fVar.f14074g, fVar.f14075h);
    }

    @Override // U9.u.a
    public final z A() {
        return this.f14072e;
    }

    @Override // U9.u.a
    public final E a(z request) throws IOException {
        l.f(request, "request");
        ArrayList arrayList = this.f14069b;
        int size = arrayList.size();
        int i = this.f14070c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        Y9.c cVar = this.f14071d;
        if (cVar != null) {
            if (!cVar.f13813c.b(request.f12795a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i + 1;
        f fVarB = b(this, i10, null, request, 58);
        u uVar = (u) arrayList.get(i);
        E eIntercept = uVar.intercept(fVarB);
        if (eIntercept == null) {
            throw new NullPointerException("interceptor " + uVar + " returned null");
        }
        if (cVar != null && i10 < arrayList.size() && fVarB.i != 1) {
            throw new IllegalStateException(("network interceptor " + uVar + " must call proceed() exactly once").toString());
        }
        if (eIntercept.f12568h != null) {
            return eIntercept;
        }
        throw new IllegalStateException(("interceptor " + uVar + " returned a response with no body").toString());
    }
}
