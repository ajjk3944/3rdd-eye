package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class t0 extends y0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f26758s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f26759t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(a aVar, int i4, Object obj, int i10) {
        super(aVar, i4);
        this.f26758s = i10;
        this.f26759t = obj;
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        switch (this.f26758s) {
            case 0:
                return new s0(this, m5Var, 1);
            case 1:
                return new v0(this, m5Var);
            case 2:
                return new l(this, m5Var, 4);
            default:
                return new a5(this, m5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0 z0Var, IntConsumer intConsumer) {
        super(z0Var, 0);
        this.f26758s = 0;
        this.f26759t = intConsumer;
    }
}
