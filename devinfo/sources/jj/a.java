package jj;

import java.util.ArrayList;
import u0.h1;
import u0.o0;
import u0.p0;
import x.a0;
import x.e0;
import x.j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27684b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f27683a = i4;
        this.f27684b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mk.a
    public final Object invoke() {
        int i4 = this.f27683a;
        Object obj = this.f27684b;
        switch (i4) {
            case 0:
                return Boolean.valueOf(!((xk.h) obj).w());
            case 1:
                ArrayList arrayList = ((h1) obj).f34822a;
                e0 e0Var = new e0(arrayList.size());
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p0 p0Var = (p0) arrayList.get(i10);
                    Object obj2 = p0Var.f34923b;
                    int i11 = p0Var.f34922a;
                    Object o0Var = obj2 != null ? new o0(Integer.valueOf(i11), p0Var.f34923b) : Integer.valueOf(i11);
                    int iF = e0Var.f(o0Var);
                    boolean z3 = iF < 0;
                    Object obj3 = z3 ? null : e0Var.f36875c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof a0) {
                            a0 a0Var = (a0) obj3;
                            a0Var.a(p0Var);
                            p0Var = a0Var;
                        } else {
                            Object[] objArr = j0.f36909a;
                            a0 a0Var2 = new a0(2);
                            a0Var2.a(obj3);
                            a0Var2.a(p0Var);
                            p0Var = a0Var2;
                        }
                    }
                    if (z3) {
                        int i12 = ~iF;
                        e0Var.f36874b[i12] = o0Var;
                        e0Var.f36875c[i12] = p0Var;
                    } else {
                        e0Var.f36875c[iF] = p0Var;
                    }
                }
                return new w0.a(e0Var);
            default:
                return new x6.c[((al.h[]) obj).length];
        }
    }
}
