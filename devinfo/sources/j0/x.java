package j0;

import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.a0 f27007b;

    public /* synthetic */ x(com.google.android.gms.common.api.internal.a0 a0Var, int i4) {
        this.f27006a = i4;
        this.f27007b = a0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f27006a) {
            case 0:
                Object obj3 = ((i0.q) obj).f25486i;
                com.google.android.gms.common.api.internal.a0 a0Var = this.f27007b;
                return pk.a.f(Integer.valueOf(a0Var.e(obj3)), Integer.valueOf(a0Var.e(((i0.q) obj2).f25486i)));
            case 1:
                Object obj4 = ((i0.q) obj).f25486i;
                com.google.android.gms.common.api.internal.a0 a0Var2 = this.f27007b;
                return pk.a.f(Integer.valueOf(a0Var2.e(obj4)), Integer.valueOf(a0Var2.e(((i0.q) obj2).f25486i)));
            case 2:
                Object obj5 = ((i0.q) obj2).f25486i;
                com.google.android.gms.common.api.internal.a0 a0Var3 = this.f27007b;
                return pk.a.f(Integer.valueOf(a0Var3.e(obj5)), Integer.valueOf(a0Var3.e(((i0.q) obj).f25486i)));
            default:
                Object obj6 = ((i0.q) obj2).f25486i;
                com.google.android.gms.common.api.internal.a0 a0Var4 = this.f27007b;
                return pk.a.f(Integer.valueOf(a0Var4.e(obj6)), Integer.valueOf(a0Var4.e(((i0.q) obj).f25486i)));
        }
    }
}
