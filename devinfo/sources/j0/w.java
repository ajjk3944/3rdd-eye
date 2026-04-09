package j0;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public d3.a f26994b;

    /* renamed from: c, reason: collision with root package name */
    public int f26995c;

    /* renamed from: d, reason: collision with root package name */
    public int f26996d;

    /* renamed from: f, reason: collision with root package name */
    public int f26998f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f26999h;

    /* renamed from: a, reason: collision with root package name */
    public s[] f26993a = m.f26925a;

    /* renamed from: e, reason: collision with root package name */
    public int f26997e = 1;

    public w(y yVar) {
        this.f26999h = yVar;
    }

    public static void b(w wVar, i0.q qVar, xk.v vVar, p1.x xVar, int i4, int i10) {
        wVar.f26999h.getClass();
        wVar.a(qVar, vVar, xVar, i4, i10, (int) (qVar.a(0) >> 32));
    }

    public final void a(i0.q qVar, xk.v vVar, p1.x xVar, int i4, int i10, int i11) {
        s[] sVarArr = this.f26993a;
        int length = sVarArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                this.f26998f = i4;
                this.g = i10;
                break;
            } else {
                s sVar = sVarArr[i12];
                if (sVar != null && sVar.g) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        List list = qVar.f25480b;
        int length2 = this.f26993a.length;
        for (int size = list.size(); size < length2; size++) {
            s sVar2 = this.f26993a[size];
            if (sVar2 != null) {
                sVar2.c();
            }
        }
        if (this.f26993a.length != list.size()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f26993a, list.size());
            nk.k.d(objArrCopyOf, "copyOf(...)");
            this.f26993a = (s[]) objArrCopyOf;
        }
        this.f26994b = new d3.a(qVar.f25488l);
        this.f26995c = i11;
        this.f26996d = 0;
        this.f26997e = 1;
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object objW = ((g2.s0) list.get(i13)).w();
            j jVar = objW instanceof j ? (j) objW : null;
            if (jVar == null) {
                s sVar3 = this.f26993a[i13];
                if (sVar3 != null) {
                    sVar3.c();
                }
                this.f26993a[i13] = null;
            } else {
                s sVar4 = this.f26993a[i13];
                if (sVar4 == null) {
                    sVar4 = new s(vVar, xVar, new a6.e(14, this.f26999h));
                    this.f26993a[i13] = sVar4;
                }
                sVar4.f26961d = jVar.f26916o;
                sVar4.f26962e = jVar.f26917p;
                sVar4.f26963f = jVar.f26918q;
            }
        }
    }
}
