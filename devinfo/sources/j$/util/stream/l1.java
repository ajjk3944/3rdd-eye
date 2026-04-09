package j$.util.stream;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class l1 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f26658b;

    public /* synthetic */ l1(r1 r1Var, int i4) {
        this.f26657a = i4;
        this.f26658b = r1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f26657a) {
            case 0:
                return new o1(this.f26658b);
            case 1:
                return new n1(this.f26658b);
            default:
                return new p1(this.f26658b);
        }
    }
}
