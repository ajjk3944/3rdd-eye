package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class q extends x {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f26717s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f26718t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i4, Object obj, int i10) {
        super(aVar, i4);
        this.f26717s = i10;
        this.f26718t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, DoubleConsumer doubleConsumer) {
        super(yVar, 0);
        this.f26717s = 2;
        this.f26718t = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        switch (this.f26717s) {
            case 0:
                return new o(this, m5Var, 1);
            case 1:
                return new t(this, m5Var);
            case 2:
                return new o(this, m5Var, 5);
            case 3:
                return new l(this, m5Var, 6);
            default:
                return new y4(this, m5Var);
        }
    }
}
